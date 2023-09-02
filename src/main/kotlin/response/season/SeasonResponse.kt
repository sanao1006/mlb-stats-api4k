package response.season


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SeasonResponse(
    @Json(name = "copyright")
    val copyright: String,
    @Json(name = "seasons")
    val seasons: List<Season>
)