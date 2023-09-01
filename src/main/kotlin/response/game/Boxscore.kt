package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Boxscore(
    @Json(name = "info")
    val info: List<Info>,
    @Json(name = "officials")
    val officials: List<Official>,
    @Json(name = "pitchingNotes")
    val pitchingNotes: List<Any>,
    @Json(name = "teams")
    val teams: Teams
)