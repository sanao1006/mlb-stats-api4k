package response.team.personnel


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Person(
    @Json(name = "fullName")
    val fullName: String?, // Manny Del Campo
    @Json(name = "id")
    val id: Int?, // 472601
    @Json(name = "link")
    val link: String? // /api/v1/people/472601
)