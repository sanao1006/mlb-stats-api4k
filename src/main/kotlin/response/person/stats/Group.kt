package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Group(
    @Json(name = "displayName")
    val displayName: String // hitting
)