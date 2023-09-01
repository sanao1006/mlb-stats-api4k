package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Call(
    @Json(name = "code")
    val code: String, // B
    @Json(name = "description")
    val description: String // Ball
)