import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.http4k.client.JavaHttpClient
import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request
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
     * Endpoint `/awards`
     */
    override fun getAwards(): List<Award> {
        return fetchDataFromApi<AwardsResponse>("awards").awards
    }

    /**
     * Endpoint `/conferences`
     */
    override fun getConferences(): List<Conference> {
        return fetchDataFromApi<ConferencesResponse>("conferences").conferences
    }

    /**
     * Endpoint `/divisions`
     */
    override fun getDivisions(): List<Division> {
        return fetchDataFromApi<DivisionsResponse>("divisions").divisions
    }

    /**
     * Endpoint `/sports`
     */
    override fun getSports(): List<Sports> {
        return fetchDataFromApi<SportsResponse>("sports").sports
    }

    /**
     * Endpoint `/teams`
     */
    override fun getTeams(): List<Team> {
        return fetchDataFromApi<TeamsResponse>("teams").teams
    }

    /**
     * Endpoint `/schedule/postseason/series`
     */
    override fun getSchedulePostseasonSeries(): SchedulePostseasonSeriesResponse {
        return fetchDataFromApi("schedule/postseason/series")
    }

    /**
     * Endpoint `/schedule/postseason`
     */
    override fun getSchedulePostseason(): SchedulePostseasonResponse {
        return fetchDataFromApi("schedule/postseason")
    }
}

class MlbStatsApiImpl(apiHost: String): BaseMlbStatsApi(apiHost)