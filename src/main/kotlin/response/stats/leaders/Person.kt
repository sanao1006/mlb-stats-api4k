package response.stats.leaders


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Person(
    @Json(name = "firstName")
    val firstName: String, // Shohei
    @Json(name = "fullName")
    val fullName: String, // Shohei Ohtani
    @Json(name = "id")
    val id: Int, // 660271
    @Json(name = "lastName")
    val lastName: String, // Ohtani
    @Json(name = "link")
    val link: String // /api/v1/people/660271
)