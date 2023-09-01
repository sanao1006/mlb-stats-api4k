package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FieldInfo(
    @Json(name = "capacity")
    val capacity: Int, // 5038
    @Json(name = "center")
    val center: Int, // 400
    @Json(name = "leftLine")
    val leftLine: Int, // 325
    @Json(name = "rightLine")
    val rightLine: Int, // 335
    @Json(name = "roofType")
    val roofType: String, // Open
    @Json(name = "turfType")
    val turfType: String // Grass
)