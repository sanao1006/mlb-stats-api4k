package response.teams.affiliates


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class League(
    @Json(name = "id")
    val id: Int?,
    @Json(name = "link")
    val link: String,
    @Json(name = "name")
    val name: String?
)