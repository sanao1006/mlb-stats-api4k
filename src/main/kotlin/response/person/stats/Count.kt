package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Count(
    @Json(name = "balls")
    val balls: Int, // 0
    @Json(name = "inning")
    val inning: Int, // 1
    @Json(name = "outs")
    val outs: Int, // 2
    @Json(name = "strikes")
    val strikes: Int // 2
)