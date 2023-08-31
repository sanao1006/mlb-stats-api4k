package response.schedule.postseason


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Content(
    @Json(name = "link")
    val link: String
)