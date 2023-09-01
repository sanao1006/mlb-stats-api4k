package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Count(
    @Json(name = "balls")
    val balls: Int, // 2
    @Json(name = "outs")
    val outs: Int, // 1
    @Json(name = "strikes")
    val strikes: Int // 1
)