package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Review(
    @Json(name = "away")
    val away: Away,
    @Json(name = "hasChallenges")
    val hasChallenges: Boolean, // true
    @Json(name = "home")
    val home: Home
)