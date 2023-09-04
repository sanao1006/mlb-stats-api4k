import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.http4k.client.JavaHttpClient
import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request
import params.attendance.AttendanceOptionalQueryParams
import params.attendance.AttendanceRequiredQueryParams
import params.awards.AwardsOptionalQueryParams
import params.conferences.ConferencesOptionalQueryParams
import params.divisions.DivisionsOptionalQueryParams
import params.game.GameFeedOptionalQueryParams
import params.game.GameFeedRequiredQueryParams
import params.jobs.datacasters.JobsDatacastersOptionalQueryParams
import params.jobs.officialScorers.JobsOfficialScorersOptionalQueryParams
import params.jobs.umpires.JobsUmpiresOptionalQueryParams
import params.schedule.postseason.SchedulePostseasonOptionalQueryParams
import params.schedule.postseason.series.SchedulePostseasonSeriesOptionalQueryParams
import params.schedule.tied.ScheduleTiedOptionalQueryParams
import params.schedule.tied.ScheduleTiedRequiredQueryParams
import params.season.SeasonOptionalQueryParams
import params.season.SeasonRequiredQueryParams
import params.sports.SportsOptionalQueryParams
import params.team.TeamOptionalQueryParams
import params.team.TeamRequiredQueryParams
import params.team.alumni.TeamAlumniOptionalQueryParams
import params.team.alumni.TeamAlumniRequiredQueryParams
import params.team.coaches.TeamCoachesOptionalQueryParams
import params.team.coaches.TeamCoachesRequiredQueryParams
import params.teams.TeamsOptionalQueryParams
import params.teams.affiliates.TeamsAffiliatesOptionalQueryParams
import params.teams.affiliates.TeamsAffiliatesRequiredQueryParams
import params.teams.history.TeamsHistoryRequiredQueryParams
import response.awards.AwardsResponse
import response.conferences.ConferencesResponse
import response.divisions.DivisionsResponse
import response.sports.SportsResponse
import response.teams.TeamsResponse
import response.attendance.AttendanceResponse
import response.game.GameResponse
import response.jobs.datacasters.JobsDatacastersResponse
import response.jobs.officialScorers.JobsOfficialScorersResponse
import response.jobs.umpires.JobsUmpiresResponse
import response.schedule.postseason.SchedulePostseasonResponse
import response.schedule.postseason.series.SchedulePostseasonSeriesResponse
import response.schedule.tied.ScheduleTiedResponse
import response.season.SeasonResponse
import response.team.TeamResponse
import response.team.alumni.TeamAlumniResponse
import response.team.coaches.TeamCoachesResponse
import response.teams.affiliates.TeamsAffiliatesResponse
import response.teams.history.TeamsHistoryResponse

open class BaseMlbStatsApi(private val apiHost: String) : MlbStatsApi {
    val client: HttpHandler = JavaHttpClient()
    private val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    /**
     * Fetch and parse data from the API using a GET request.
     *
     * This function sends a GET request to the specified API endpoint and parses the response
     * into an object of the specified type using Moshi JSON parsing.
     *
     * @param T The type of data to parse the response into.
     * @param endpoint The API endpoint to fetch data from.
     * @return The parsed data of the specified type.
     * @throws IllegalStateException If parsing the response fails.
     */
    private inline fun <reified T> fetchDataFromApi(endpoint: String): T {
        val responseBody = client(Request(Method.GET, "$apiHost/$endpoint")).body.toString()
        val adapter = moshi.adapter<T>(T::class.java)
        return adapter.fromJson(responseBody) ?: throw IllegalStateException("Failed to parse response")
    }

    /**
     * Build an API endpoint URL with optional query parameters.
     *
     * This function constructs a URL endpoint with optional query parameters. It removes
     * the "ver" key from the query parameters and filters out null values before building the endpoint.
     *
     * @param endpoint The base endpoint URL.
     * @param queryParams A map of optional query parameters to include in the URL.
     * @return The complete API endpoint URL with query parameters.
     */
    private fun buildEndpointWithQueryParams(endpoint: String, queryParams: Map<String, String?>): String {
        val ver = queryParams["ver"]
        val queryParamsStr =
            queryParams.filterKeys { it != "ver" }.filterValues { it != null }.map { "${it.key}=${it.value}" }
                .joinToString("&")
        val finalEndpoint = "$ver/$endpoint"

        return if (queryParamsStr.isNotEmpty()) {
            if (finalEndpoint.contains("?")) {
                "$finalEndpoint&$queryParamsStr"
            } else {
                "$finalEndpoint?$queryParamsStr"
            }
        } else {
            finalEndpoint
        }
    }

    /**
     * Retrieve attendance data from the API using endpoint "attendance".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/attendance"
     * @param attendanceRequiredQueryParams Required query parameters for the request.
     * @param attendanceOptionalQueryParams Optional query parameters for the request.
     * @return Attendance response data.
     */
    override fun getAttendanceResponse(
        attendanceRequiredQueryParams: AttendanceRequiredQueryParams,
        attendanceOptionalQueryParams: AttendanceOptionalQueryParams
    ): AttendanceResponse {
        val endpoint = buildEndpointWithQueryParams(
            "attendance", attendanceRequiredQueryParams.plus(attendanceOptionalQueryParams)
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve attendance data from the API using endpoint "awards".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/awards{awardId}{recipients}"
     * @param awardsOptionalQueryParams Optional query parameters for the request.
     * @return Awards response data.
     */
    override fun getAwardsResponse(awardsOptionalQueryParams: AwardsOptionalQueryParams): AwardsResponse {
        val endpoint = buildEndpointWithQueryParams("awards", awardsOptionalQueryParams.toMap())
        return fetchDataFromApi<AwardsResponse>(endpoint)
    }

    /**
     * Retrieve attendance data from the API using endpoint "conferences".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/conferences"
     * @param conferencesOptionalQueryParams Optional query parameters for the request.
     * @return Conferences response data.
     */
    override fun getConferencesResponse(conferencesOptionalQueryParams: ConferencesOptionalQueryParams): ConferencesResponse {
        val endpoint = buildEndpointWithQueryParams("conferences", conferencesOptionalQueryParams.toMap())
        return fetchDataFromApi<ConferencesResponse>(endpoint)
    }

    /**
     * Retrieve divisions data from the API using endpoint "divisions"
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/divisions"
     * @param divisionsOptionalQueryParams Optional query parameters for the request.
     * @return Divisions response data.
     */
    override fun getDivisionsResponse(divisionsOptionalQueryParams: DivisionsOptionalQueryParams): DivisionsResponse {
        val endpoint = buildEndpointWithQueryParams("divisions", divisionsOptionalQueryParams.toMap())
        return fetchDataFromApi<DivisionsResponse>(endpoint)
    }

    /**
     * Retrieve live game feed data from the API for a specific game using endpoint "game"
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/game/{gamePk}/feed/live"
     * @param gameFeedRequiredQueryParams Required query parameters for the request.
     * @param gameFeedOptionalQueryParams Optional query parameters for the request.
     * @return Game feed response data.
     */
    override fun getGameFeedResponse(
        gameFeedRequiredQueryParams: GameFeedRequiredQueryParams,
        gameFeedOptionalQueryParams: GameFeedOptionalQueryParams
    ): GameResponse {
        val endpoint = buildEndpointWithQueryParams(
            "game/${gameFeedRequiredQueryParams.gamePk}/feed/live", gameFeedOptionalQueryParams.toMap()
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve umpires job data from the API using endpoint "jobs_umpires".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/jobs/umpires"
     * @param jobsUmpiresOptionalQueryParams Optional query parameters for the request.
     * @return Umpires job response data.
     */
    override fun getJobsUmpiresResponse(jobsUmpiresOptionalQueryParams: JobsUmpiresOptionalQueryParams): JobsUmpiresResponse {
        val endpoint = buildEndpointWithQueryParams("jobs/umpires", jobsUmpiresOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve datacasters job data from the API using endpoint "jobs_datacasters".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/jobs/datacasters"
     * @param jobsDatacastersOptionalQueryParams Optional query parameters for the request.
     * @return Datacasters job response data.
     */
    override fun getJobsDatacastersResponse(jobsDatacastersOptionalQueryParams: JobsDatacastersOptionalQueryParams): JobsDatacastersResponse {
        val endpoint = buildEndpointWithQueryParams("jobs/datacasters", jobsDatacastersOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve official scorers job data from the API using endpoint "jobs_officialScorers".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/jobs/officialScorers"
     * @param jobsOfficialScorersOptionalQueryParams Optional query parameters for the request.
     * @return Official scorers job response data.
     */
    override fun getJobsOfficialScorersResponse(jobsOfficialScorersOptionalQueryParams: JobsOfficialScorersOptionalQueryParams): JobsOfficialScorersResponse {
        val endpoint =
            buildEndpointWithQueryParams("jobs/officialScorers", jobsOfficialScorersOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve tied game schedule data from the API for a specific season using endpoint "schedule_tied".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/schedule/games/tied"
     * @param scheduleTiedRequiredQueryParams Required query parameters for the request.
     * @param scheduleTiedOptionalQueryParams Optional query parameters for the request.
     * @return Tied game schedule response data.
     */
    override fun getScheduleTiedResponse(
        scheduleTiedRequiredQueryParams: ScheduleTiedRequiredQueryParams,
        scheduleTiedOptionalQueryParams: ScheduleTiedOptionalQueryParams
    ): ScheduleTiedResponse {
        val endpoint = buildEndpointWithQueryParams(
            "schedule/games/tied", scheduleTiedRequiredQueryParams.plus(scheduleTiedOptionalQueryParams)
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve postseason schedule data from the API using endpoint "schedule_postseason".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/schedule/postseason"
     * @param schedulePostseasonOptionalQueryParams Optional query parameters for the request.
     * @return Schedule postseason response data.
     */
    override fun getSchedulePostseasonResponse(schedulePostseasonOptionalQueryParams: SchedulePostseasonOptionalQueryParams): SchedulePostseasonResponse {
        val endpoint =
            buildEndpointWithQueryParams("schedule/postseason", schedulePostseasonOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve postseason series schedule data from the API using endpoint "schedule_postseason_series".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/schedule/postseason/series"
     * @param schedulePostseasonSeriesOptionalQueryParams Optional query parameters for the request.
     * @return Schedule postseason series response data.
     */
    override fun getSchedulePostseasonSeriesResponse(schedulePostseasonSeriesOptionalQueryParams: SchedulePostseasonSeriesOptionalQueryParams): SchedulePostseasonSeriesResponse {
        val endpoint = buildEndpointWithQueryParams(
            "schedule/postseason/series", schedulePostseasonSeriesOptionalQueryParams.toMap()
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve season data from the API using endpoint "season".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/seasons/{seasonId}"
     * @param seasonRequiredQueryParams Required query parameters for the request.
     * @param seasonOptionalQueryParams Optional query parameters for the request.
     * @return Season data response.
     */
    override fun getSeasonResponse(
        seasonRequiredQueryParams: SeasonRequiredQueryParams,
        seasonOptionalQueryParams: SeasonOptionalQueryParams
    ): SeasonResponse {
        val endpoint =
            buildEndpointWithQueryParams("seasons", seasonRequiredQueryParams.plus(seasonOptionalQueryParams))
        println(endpoint)
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve sports data from the API using endpoint "sports"
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/sports"
     * @param sportsOptionalQueryParams Optional query parameters for the request.
     * @return Sports response data.
     */
    override fun getSportsResponse(sportsOptionalQueryParams: SportsOptionalQueryParams): SportsResponse {
        val endpoint = buildEndpointWithQueryParams("sports", sportsOptionalQueryParams.toMap())
        return fetchDataFromApi<SportsResponse>(endpoint)
    }

    /**
     * Retrieve teams data from the API using endpoint "teams".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/teams"
     * @param teamsOptionalQueryParams Optional query parameters for the request.
     * @return Teams response data.
     */
    override fun getTeamsResponse(teamsOptionalQueryParams: TeamsOptionalQueryParams): TeamsResponse {
        val endpoint = buildEndpointWithQueryParams("teams", teamsOptionalQueryParams.toMap())
        return fetchDataFromApi<TeamsResponse>(endpoint)
    }

    /**
     * Retrieve team history data from the API using endpoint "teams_history".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/teams/history"
     * @param teamsHistoryRequiredQueryParams Required query parameters for the request.
     * @param teamsOptionalQueryParams Optional query parameters for the request.
     * @return Team history data response.
     */
    override fun getTeamsHistoryResponse(
        teamsHistoryRequiredQueryParams: TeamsHistoryRequiredQueryParams,
        teamsOptionalQueryParams: TeamsOptionalQueryParams
    ): TeamsHistoryResponse {
        val endpoint = buildEndpointWithQueryParams(
            "teams/history", teamsHistoryRequiredQueryParams.plus(teamsOptionalQueryParams)
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve team affiliates data from the API using endpoint "teams_affiliates".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/teams/affiliates"
     * @param teamsAffiliatesRequiredQueryParams Required query parameters for the request.
     * @param teamsAffiliatesOptionalQueryParams Optional query parameters for the request.
     * @return Team affiliates data response.
     */
    override fun getTeamsAffiliatesResponse(
        teamsAffiliatesRequiredQueryParams: TeamsAffiliatesRequiredQueryParams,
        teamsAffiliatesOptionalQueryParams: TeamsAffiliatesOptionalQueryParams
    ): TeamsAffiliatesResponse {
        val endpoint = buildEndpointWithQueryParams(
            "teams/affiliates", teamsAffiliatesRequiredQueryParams.plus(teamsAffiliatesOptionalQueryParams)
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve team data from the API using endpoint "team".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/teams/{teamId}"
     * @param teamRequiredQueryParams Required query parameters for the request.
     * @param teamOptionalQueryParams Optional query parameters for the request.
     * @return Team data response.
     */
    override fun getTeamResponse(
        teamRequiredQueryParams: TeamRequiredQueryParams,
        teamOptionalQueryParams: TeamOptionalQueryParams
    ): TeamResponse {
        val endpoint =
            buildEndpointWithQueryParams("teams/${teamRequiredQueryParams.teamId}", teamOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve alumni data for a specific team from the MLB Stats API using endpoint "team_alumni".
     *
     * URL: "https://statsapi.mlb.com/api/{ver}/teams/{teamId}/alumni"
     * @param teamAlumniRequiredQueryParams Required query parameters for the request.
     * @param teamAlumniOptionalQueryParams Optional query parameters for the request.
     * @return Alumni data response for the specified team.
     */
    override fun getTeamAlumniResponse(
        teamAlumniRequiredQueryParams: TeamAlumniRequiredQueryParams,
        teamAlumniOptionalQueryParams: TeamAlumniOptionalQueryParams
    ): TeamAlumniResponse {
        val endpoint = buildEndpointWithQueryParams(
            "teams/${teamAlumniRequiredQueryParams.teamId}/alumni",
            teamAlumniRequiredQueryParams.plus(teamAlumniOptionalQueryParams)
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve coaching staff data for a specific team from the MLB Stats API using endpoint "team_coaches".
     *
     * @param teamCoachesRequiredQueryParams Required query parameters for the request.
     * @param teamCoachesOptionalQueryParams Optional query parameters for the request.
     * @return Coaching staff data response for the specified team.
     */
    override fun getTeamCoaches(
        teamCoachesRequiredQueryParams: TeamCoachesRequiredQueryParams,
        teamCoachesOptionalQueryParams: TeamCoachesOptionalQueryParams
    ): TeamCoachesResponse {
        val endpoint = buildEndpointWithQueryParams(
            "teams/${teamCoachesRequiredQueryParams.teamId}/coaches",
            teamCoachesOptionalQueryParams.toMap()
        )
        return fetchDataFromApi(endpoint)
    }
}

class MlbStatsApiImpl(apiHost: String) : BaseMlbStatsApi(apiHost)
