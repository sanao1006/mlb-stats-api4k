package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Inning(
    @Json(name = "away")
    val away: Away,
    @Json(name = "home")
    val home: Home,
    @Json(name = "num")
    val num: Int, // 1
    @Json(name = "ordinalNum")
    val ordinalNum: String // 1st
)