package response.team


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SpringLeague(
    @Json(name = "abbreviation")
    val abbreviation: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "link")
    val link: String,
    @Json(name = "name")
    val name: String
)