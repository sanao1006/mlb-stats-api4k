package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hits(
    @Json(name = "away")
    val away: List<Away>,
    @Json(name = "home")
    val home: List<Home>
)