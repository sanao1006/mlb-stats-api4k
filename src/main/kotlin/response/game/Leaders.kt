package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Leaders(
    @Json(name = "hitDistance")
    val hitDistance: HitDistance,
    @Json(name = "hitSpeed")
    val hitSpeed: HitSpeed,
    @Json(name = "pitchSpeed")
    val pitchSpeed: PitchSpeed
)