package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Note(
    @Json(name = "label")
    val label: String, // a
    @Json(name = "value")
    val value: String // Reached on a fielder's choice for Stinson in the 7th.
)