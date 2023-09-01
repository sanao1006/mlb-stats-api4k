package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Location(
    @Json(name = "address1")
    val address1: String, // 351 W. Cedar Street
    @Json(name = "city")
    val city: String, // Pensacola
    @Json(name = "country")
    val country: String, // USA
    @Json(name = "postalCode")
    val postalCode: String, // 32502
    @Json(name = "state")
    val state: String, // Florida
    @Json(name = "stateAbbrev")
    val stateAbbrev: String // FL
)