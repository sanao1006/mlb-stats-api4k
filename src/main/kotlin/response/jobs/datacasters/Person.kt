package response.jobs.datacasters


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Person(
    @Json(name = "fullName")
    val fullName: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "link")
    val link: String
)