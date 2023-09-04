package response.team.roster


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Person(
    @Json(name = "fullName")
    val fullName: String, // Aaron Loup
    @Json(name = "id")
    val id: Int, // 571901
    @Json(name = "link")
    val link: String // /api/v1/people/571901
)