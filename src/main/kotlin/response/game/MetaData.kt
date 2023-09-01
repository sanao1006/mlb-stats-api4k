package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MetaData(
    @Json(name = "gameEvents")
    val gameEvents: List<String>,
    @Json(name = "logicalEvents")
    val logicalEvents: List<String>,
    @Json(name = "timeStamp")
    val timeStamp: String, // 20120727_030209
    @Json(name = "wait")
    val wait: Int // 10
)