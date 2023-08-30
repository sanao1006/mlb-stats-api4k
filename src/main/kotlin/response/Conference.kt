package response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Conference(
    @Json(name = "abbreviation")
    val abbreviation: String,
    @Json(name = "hasWildcard")
    val hasWildcard: Boolean,
    @Json(name = "id")
    val id: Int,
    @Json(name = "league")
    val league: League,
    @Json(name = "link")
    val link: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "nameShort")
    val nameShort: String,
    @Json(name = "sport")
    val sport: Sport
)