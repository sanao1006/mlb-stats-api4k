package response.schedule.tied


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Teams(
    @Json(name = "away")
    val away: Away,
    @Json(name = "home")
    val home: Home
)