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

class MlbStatsApiImpl(val apiHost: String) : MlbStatsApi {
    val client: HttpHandler = JavaHttpClient()
    private val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    /**
     * Endpoint `/awards`
     */
    override fun getAwards(): List<Award> {
        val responseBody = client(Request(Method.GET, "$apiHost/awards")).body.toString()
        val awardsAdapter =  moshi.adapter<AwardsResponse>(AwardsResponse::class.java)
        return awardsAdapter.fromJson(responseBody)?.awards.orEmpty()
    }

    /**
     * Endpoint `/conferences`
     */
    override fun getConferences(): List<Conference> {
        val responseBody = client(Request(Method.GET, "$apiHost/conferences")).body.toString()
        val conferencesAdapter = moshi.adapter<ConferencesResponse>(ConferencesResponse::class.java)
        return conferencesAdapter.fromJson(responseBody)?.conferences.orEmpty()
    }

    /**
     * Endpoint `/divisions`
     */
    override fun getDivisions(): List<Division> {
        val responseBody = client(Request(Method.GET, "$apiHost/divisions")).body.toString()
        val divisionsAdapter = moshi.adapter<DivisionsResponse>(DivisionsResponse::class.java)
        return divisionsAdapter.fromJson(responseBody)?.divisions.orEmpty()
    }

    /**
     * Endpoint `/sports`
     */
    override fun getSports(): List<Sports> {
        val responseBody = client(Request(Method.GET,"$apiHost/sports")).body.toString()
        val sportsAdapter = moshi.adapter<SportsResponse>(SportsResponse::class.java)
        return sportsAdapter.fromJson(responseBody)?.sports.orEmpty()
    }
}
