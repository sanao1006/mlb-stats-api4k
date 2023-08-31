package response.schedule.postseason.series


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Series(
    @Json(name = "gameType")
    val gameType: String, // F
    @Json(name = "id")
    val id: String, // F_1
    @Json(name = "isDefault")
    val isDefault: Boolean, // true
    @Json(name = "sortNumber")
    val sortNumber: Int // 1
)