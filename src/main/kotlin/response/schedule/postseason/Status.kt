package response.schedule.postseason


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Status(
    @Json(name = "abstractGameCode")
    val abstractGameCode: String,
    @Json(name = "abstractGameState")
    val abstractGameState: String,
    @Json(name = "codedGameState")
    val codedGameState: String,
    @Json(name = "detailedState")
    val detailedState: String,
    @Json(name = "startTimeTBD")
    val startTimeTBD: Boolean,
    @Json(name = "statusCode")
    val statusCode: String
)