package response.team.coaches


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Person(
    @Json(name = "fullName")
    val fullName: String, // Phil Nevin
    @Json(name = "id")
    val id: Int, // 119732
    @Json(name = "link")
    val link: String // /api/v1/people/119732
)