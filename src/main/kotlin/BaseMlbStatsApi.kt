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
import params.sports.SportsOptionalQueryParams
import params.teams.TeamsOptionalQueryParams
import response.awards.AwardsResponse
import response.conferences.Conference
import response.conferences.ConferencesResponse
import response.Division
import response.DivisionsResponse
import response.Sports
import response.SportsResponse
import response.Team
import response.TeamsResponse
import response.attendance.AttendanceResponse
import response.game.GameResponse
import response.jobs.datacasters.JobsDatacastersResponse
import response.jobs.officialScorers.JobsOfficialScorersResponse
import response.jobs.umpires.JobsUmpiresResponse
import response.schedule.postseason.SchedulePostseasonResponse
import response.schedule.postseason.series.SchedulePostseasonSeriesResponse

open class BaseMlbStatsApi(private val apiHost: String) : MlbStatsApi {
    val client: HttpHandler = JavaHttpClient()
    private val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    private inline fun <reified T> fetchDataFromApi(endpoint: String): T {
        val responseBody = client(Request(Method.GET, "$apiHost/$endpoint")).body.toString()
        val adapter = moshi.adapter<T>(T::class.java)
        return adapter.fromJson(responseBody) ?: throw IllegalStateException("Failed to parse response")
    }

    /**
     * This is a function that creates a path after `api/` (`/v1/draft?year=2009`) for an endpoint such as "https://statsapi.mlb.com/api/v1/draft?year=2009" for example.
     * `v1/` is always at the beginning.
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
            "$finalEndpoint?$queryParamsStr"
        } else {
            finalEndpoint
        }
    }

    /**
     * Endpoint `/attendance`
     */
    override fun getAttendance(
        attendanceRequiredQueryParams: AttendanceRequiredQueryParams,
        attendanceOptionalQueryParams: AttendanceOptionalQueryParams
    ): AttendanceResponse {
        val endpoint = buildEndpointWithQueryParams("attendance", attendanceRequiredQueryParams.plus(attendanceOptionalQueryParams))
        return fetchDataFromApi(endpoint)
    }

    /**
     * Endpoint `/awards`
     */
    override fun getAwards(awardsOptionalQueryParams: AwardsOptionalQueryParams): AwardsResponse {
        val endpoint = buildEndpointWithQueryParams("awards", awardsOptionalQueryParams.toMap())
        return fetchDataFromApi<AwardsResponse>(endpoint)
    }

    /**
     * Endpoint `/conferences`
     */
    override fun getConferences(conferencesOptionalQueryParams: ConferencesOptionalQueryParams): ConferencesResponse {
        val endpoint = buildEndpointWithQueryParams("conferences", conferencesOptionalQueryParams.toMap())
        return fetchDataFromApi<ConferencesResponse>(endpoint)
    }

    /**
     * Endpoint `/divisions`
     */
    override fun getDivisions(divisionsOptionalQueryParams: DivisionsOptionalQueryParams): List<Division> {
        val endpoint = buildEndpointWithQueryParams("divisions", divisionsOptionalQueryParams.toMap())
        return fetchDataFromApi<DivisionsResponse>(endpoint).divisions
    }

    /**
     * Endpoint `game/{gamePk}/feed/live`
     */
    override fun getGameFeed(
        gameFeedRequiredQueryParams: GameFeedRequiredQueryParams,
        gameFeedOptionalQueryParams: GameFeedOptionalQueryParams
    ): GameResponse {
        val endpoint = buildEndpointWithQueryParams("game/${gameFeedRequiredQueryParams.gamePk}/feed/live", gameFeedOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Endpoint `/sports`
     */
    override fun getSports(sportsOptionalQueryParams: SportsOptionalQueryParams): List<Sports> {
        val endpoint = buildEndpointWithQueryParams("sports", sportsOptionalQueryParams.toMap())
        return fetchDataFromApi<SportsResponse>(endpoint).sports
    }

    /**
     * Endpoint `/teams`
     */
    override fun getTeams(teamsOptionalQueryParams: TeamsOptionalQueryParams): List<Team> {
        val endpoint = buildEndpointWithQueryParams("teams",teamsOptionalQueryParams.toMap())
        return fetchDataFromApi<TeamsResponse>(endpoint).teams
    }

    /**
     * Endpoint `/schedule/postseason/series`
     */
    override fun getSchedulePostseasonSeries(schedulePostseasonSeriesOptionalQueryParams: SchedulePostseasonSeriesOptionalQueryParams): SchedulePostseasonSeriesResponse {
        val endpoint = buildEndpointWithQueryParams("schedule/postseason/series",schedulePostseasonSeriesOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Endpoint `/schedule/postseason`
     */
    override fun getSchedulePostseason(schedulePostseasonOptionalQueryParams: SchedulePostseasonOptionalQueryParams): SchedulePostseasonResponse {
        val endpoint = buildEndpointWithQueryParams("schedule/postseason", schedulePostseasonOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Endpoint `/jobs/umpires`
     */
    override fun getJobsUmpires(jobsUmpiresOptionalQueryParams: JobsUmpiresOptionalQueryParams): JobsUmpiresResponse {
        val endpoint = buildEndpointWithQueryParams("jobs/umpires", jobsUmpiresOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Endpoint `/jobs/datacasters`
     */
    override fun getJobsDatacasters(jobsDatacastersOptionalQueryParams: JobsDatacastersOptionalQueryParams): JobsDatacastersResponse {
        val endpoint = buildEndpointWithQueryParams("jobs/datacasters", jobsDatacastersOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }

    /**
     * Endpoint `/jobs/officialScorers`
     */
    override fun getJobsOfficialScorers(jobsOfficialScorersOptionalQueryParams: JobsOfficialScorersOptionalQueryParams): JobsOfficialScorersResponse {
        val endpoint = buildEndpointWithQueryParams("jobs/officialScorers", jobsOfficialScorersOptionalQueryParams.toMap())
        return fetchDataFromApi(endpoint)
    }
}

class MlbStatsApiImpl(apiHost: String) : BaseMlbStatsApi(apiHost)
