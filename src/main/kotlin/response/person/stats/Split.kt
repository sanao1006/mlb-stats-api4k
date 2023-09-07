package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Split(
    @Json(name = "group")
    val group: String?, // fielding
    @Json(name = "stat")
    val stat: Stats?,
    @Json(name = "type")
    val type: String? // gameLog
)