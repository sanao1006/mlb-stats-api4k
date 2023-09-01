import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.http4k.client.JavaHttpClient
import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request
import params.awards.AwardsOptionalQueryParams
import params.conferences.ConferencesOptionalQueryParams
import params.divisions.DivisionsOptionalQueryParams
import params.jobs.umpires.JobsUmpiresOptionalQueryParams
import params.schedule.postseason.SchedulePostseasonOptionalQueryParams
import params.schedule.postseason.series.SchedulePostseasonSeriesOptionalQueryParams
import params.sports.SportsOptionalQueryParams
import params.teams.TeamsOptionalQueryParams
import response.Award
import response.AwardsResponse
import response.Conference
import response.ConferencesResponse
import response.Division
import response.DivisionsResponse
import response.Sports
import response.SportsResponse
import response.Team
import response.TeamsResponse
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

    private fun buildEndpointWithQueryParams(endpoint: String, queryParams: Map<String, String?>): String {
        val queryParamsStr = queryParams
            .filterValues { it != null }
            .map { "${it.key}=${it.value}" }
            .joinToString("&")

        return if (queryParamsStr.isNotEmpty()) {
            "$endpoint?$queryParamsStr"
        } else {
            endpoint
        }
    }

    /**
     * Endpoint `/awards`
     */
    override fun getAwards(awardsOptionalQueryParams: AwardsOptionalQueryParams): List<Award> {
        val endpoint = buildEndpointWithQueryParams("awards", awardsOptionalQueryParams.toMap())
        return fetchDataFromApi<AwardsResponse>(endpoint).awards
    }

    /**
     * Endpoint `/conferences`
     */
    override fun getConferences(conferencesOptionalQueryParams: ConferencesOptionalQueryParams): List<Conference> {
        val endpoint = buildEndpointWithQueryParams("conferences", conferencesOptionalQueryParams.toMap())
        return fetchDataFromApi<ConferencesResponse>(endpoint).conferences
    }

    /**
     * Endpoint `/divisions`
     */
    override fun getDivisions(divisionsOptionalQueryParams: DivisionsOptionalQueryParams): List<Division> {
        val endpoint = buildEndpointWithQueryParams("divisions", divisionsOptionalQueryParams.toMap())
        return fetchDataFromApi<DivisionsResponse>(endpoint).divisions
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
    override fun getJobsDatacasters(): JobsDatacastersResponse {
        return fetchDataFromApi("jobs/datacasters")
    }

    /**
     * Endpoint `/jobs/officialScorers`
     */
    override fun getJobsOfficialScorers(): JobsOfficialScorersResponse {
        return fetchDataFromApi("jobs/officialScorers")
    }
}

class MlbStatsApiImpl(apiHost: String) : BaseMlbStatsApi(apiHost)
