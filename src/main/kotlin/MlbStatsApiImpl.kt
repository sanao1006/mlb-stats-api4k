import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.http4k.client.JavaHttpClient
import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Request
import response.Award
import response.AwardsResponse
import response.Conference

class MlbStatsApiImpl(val apiHost: String) : MlbStatsApi {
    val client: HttpHandler = JavaHttpClient()
    private val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    /**
     * Endpoint `/awards`
     */
    override fun getAwards(): List<Award> {
        val request = client(Request(Method.GET, "$apiHost/awards")).body.toString()
        val awardsAdapter =  moshi.adapter<AwardsResponse>(AwardsResponse::class.java)
        return awardsAdapter.fromJson(request)!!.awards
    }

    /**
     * Endpoint `conferences`
     */
    override fun getConferences(): List<Conference> {
        TODO("Not yet implemented")
    }
}
