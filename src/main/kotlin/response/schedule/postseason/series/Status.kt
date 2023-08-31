package response.schedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Status(
    @Json(name = "abstractGameCode")
    val abstractGameCode: String, // P
    @Json(name = "abstractGameState")
    val abstractGameState: String, // Preview
    @Json(name = "codedGameState")
    val codedGameState: String, // S
    @Json(name = "detailedState")
    val detailedState: String, // Scheduled
    @Json(name = "startTimeTBD")
    val startTimeTBD: Boolean, // true
    @Json(name = "statusCode")
    val statusCode: String // S
)