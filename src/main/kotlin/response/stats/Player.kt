package response.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Player(
    @Json(name = "firstName")
    val firstName: String, // Blake
    @Json(name = "fullName")
    val fullName: String, // Blake Snell
    @Json(name = "id")
    val id: Int, // 605483
    @Json(name = "lastName")
    val lastName: String, // Snell
    @Json(name = "link")
    val link: String // /api/v1/people/605483
)