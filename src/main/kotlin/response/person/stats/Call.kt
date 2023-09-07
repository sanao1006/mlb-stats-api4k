package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Call(
    @Json(name = "code")
    val code: String, // X
    @Json(name = "description")
    val description: String // In play, out(s)
)