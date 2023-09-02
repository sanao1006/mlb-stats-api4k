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
import params.sports.SportsOptionalQueryParams
import params.teams.TeamsOptionalQueryParams
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
        val queryParamsStr = queryParams
            .filterKeys { it != "ver" }
            .filterValues { it != null }
            .map { "${it.key}=${it.value}" }
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
     * Retrieve attendance data from the API using endpoint "/attendance".
     * @param attendanceRequiredQueryParams Required query parameters for the request.
     * @param attendanceOptionalQueryParams Optional query parameters for the request.
     * @return Attendance response data.
     */
    override fun getAttendanceResponse(
        attendanceRequiredQueryParams: AttendanceRequiredQueryParams,
        attendanceOptionalQueryParams: AttendanceOptionalQueryParams
    ): AttendanceResponse {
        val endpoint = buildEndpointWithQueryParams(
            "attendance",
            attendanceRequiredQueryParams.plus(attendanceOptionalQueryParams)
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve attendance data from the API using endpoint "/awards".
     * @param awardsOptionalQueryParams Optional query parameters for the request.
     * @return Awards response data.
     */
    override fun getAwardsResponse(awardsOptionalQueryParams: AwardsOptionalQueryParams): AwardsResponse {
        val endpoint = buildEndpointWithQueryParams("awards", awardsOptionalQueryParams.toMap())
        return fetchDataFromApi<AwardsResponse>(endpoint)
    }

    /**
     * Retrieve attendance data from the API using endpoint "/conferences".
     * @param conferencesOptionalQueryParams Optional query parameters for the request.
     * @return Conferences response data.
     */
    override fun getConferencesResponse(conferencesOptionalQueryParams: ConferencesOptionalQueryParams): ConferencesResponse {
        val endpoint = buildEndpointWithQueryParams("conferences", conferencesOptionalQueryParams.toMap())
        return fetchDataFromApi<ConferencesResponse>(endpoint)
    }

    /**
     * Retrieve divisions data from the API using endpoint "/divisions"
     * @param divisionsOptionalQueryParams Optional query parameters for the request.
     * @return Divisions response data.
     */
    override fun getDivisionsResponse(divisionsOptionalQueryParams: DivisionsOptionalQueryParams): DivisionsResponse {
        val endpoint = buildEndpointWithQueryParams("divisions", divisionsOptionalQueryParams.toMap())
        return fetchDataFromApi<DivisionsResponse>(endpoint)
    }

    /**
     * Retrieve live game feed data from the API for a specific game using endpoint "game/{gamePk}/feed/live"
     * @param gameFeedRequiredQueryParams Required query parameters for the request.
     * @param gameFeedOptionalQueryParams Optional query parameters for the request.
     * @return Game feed response data.
     */
    override fun getGameFeedResponse(
        gameFeedRequiredQueryParams: GameFeedRequiredQueryParams,
        gameFeedOptionalQueryParams: GameFeedOptionalQueryParams
    ): GameResponse {
        val endpoint = buildEndpointWithQueryParams(
            "game/${gameFeedRequiredQueryParams.gamePk}/feed/live",
            gameFeedOptionalQueryParams.toMap()
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve sports data from the API using endpoint "/sports"
     * @param sportsOptionalQueryParams Optional query parameters for the request.
     * @return Sports response data.
     */
    override fun getSportsResponse(sportsOptionalQueryParams: SportsOptionalQueryParams): SportsResponse {
        val endpoint = buildEndpointWithQueryParams("sports", sportsOptionalQueryParams.toMap())
        return fetchDataFromApi<SportsResponse>(endpoint)
    }

    /**
     * Retrieve teams data from the API using endpoint "/teams".
     * @param teamsOptionalQueryParams Optional query parameters for the request.
     * @return Teams response data.
     */
    override fun getTeamsResponse(teamsOptionalQueryParams: TeamsOptionalQueryParams): TeamsResponse {
        val endpoint = buildEndpointWithQueryParams("teams", teamsOptionalQueryParams.toMap())
        return fetchDataFromApi<TeamsResponse>(endpoint)
    }

    /**
     * Retrieve tied game schedule data from the API for a specific season using endpoint "/schedule/games/tied".
     * @param scheduleTiedRequiredQueryParams Required query parameters for the request.
     * @param scheduleTiedOptionalQueryParams Optional query parameters for the request.
     * @return Tied game schedule response data.
     */
    override fun getScheduleTiedResponse(
        scheduleTiedRequiredQueryParams: ScheduleTiedRequiredQueryParams,
        scheduleTiedOptionalQueryParams: ScheduleTiedOptionalQueryParams
    ): ScheduleTiedResponse {
        val endpoint = buildEndpointWithQueryParams(
            "schedule/games/tied",
            scheduleTiedRequiredQueryParams.plus(scheduleTiedOptionalQueryParams)
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve postseason schedule data from the API using endpoint "/schedule/postseason".
     * @param schedulePostseasonOptionalQueryParams Optional query parameters for the request.
     * @return Schedule postseason response data.
     */
    override fun getSchedulePostseasonResponse(schedulePostseasonOptionalQueryParams: SchedulePostseasonOptionalQueryParams): SchedulePostseasonResponse {
        val endpoint =
            buildEndpointWithQueryParams("schedule/postseason", schedulePostseasonOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve postseason series schedule data from the API using endpoint "/schedule/postseason/series".
     * @param schedulePostseasonSeriesOptionalQueryParams Optional query parameters for the request.
     * @return Schedule postseason series response data.
     */
    override fun getSchedulePostseasonSeriesResponse(schedulePostseasonSeriesOptionalQueryParams: SchedulePostseasonSeriesOptionalQueryParams): SchedulePostseasonSeriesResponse {
        val endpoint = buildEndpointWithQueryParams(
            "schedule/postseason/series",
            schedulePostseasonSeriesOptionalQueryParams.toMap()
        )
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve umpires job data from the API using endpoint "/jobs/umpires".
     * @param jobsUmpiresOptionalQueryParams Optional query parameters for the request.
     * @return Umpires job response data.
     */
    override fun getJobsUmpiresResponse(jobsUmpiresOptionalQueryParams: JobsUmpiresOptionalQueryParams): JobsUmpiresResponse {
        val endpoint = buildEndpointWithQueryParams("jobs/umpires", jobsUmpiresOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve datacasters job data from the API using endpoint "/jobs/datacasters".
     * @param jobsDatacastersOptionalQueryParams Optional query parameters for the request.
     * @return Datacasters job response data.
     */
    override fun getJobsDatacastersResponse(jobsDatacastersOptionalQueryParams: JobsDatacastersOptionalQueryParams): JobsDatacastersResponse {
        val endpoint = buildEndpointWithQueryParams("jobs/datacasters", jobsDatacastersOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Retrieve official scorers job data from the API using endpoint "/jobs/officialScorers".
     * @param jobsOfficialScorersOptionalQueryParams Optional query parameters for the request.
     * @return Official scorers job response data.
     */
    override fun getJobsOfficialScorersResponse(jobsOfficialScorersOptionalQueryParams: JobsOfficialScorersOptionalQueryParams): JobsOfficialScorersResponse {
        val endpoint =
            buildEndpointWithQueryParams("jobs/officialScorers", jobsOfficialScorersOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }
}

class MlbStatsApiImpl(apiHost: String) : BaseMlbStatsApi(apiHost)
