package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Type(
    @Json(name = "displayName")
    val displayName: String // vsPlayer5Y
)