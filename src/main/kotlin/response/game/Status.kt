package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Status(
    @Json(name = "abstractGameCode")
    val abstractGameCode: String?, // F
    @Json(name = "abstractGameState")
    val abstractGameState: String?, // Final
    @Json(name = "codedGameState")
    val codedGameState: String?, // F
    @Json(name = "detailedState")
    val detailedState: String?, // Final
    @Json(name = "startTimeTBD")
    val startTimeTBD: Boolean?, // false
    @Json(name = "statusCode")
    val statusCode: String?, // F
    @Json(name = "code")
    val code: String?, // A
    @Json(name = "description")
    val description: String? // Active
)