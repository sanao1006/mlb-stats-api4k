package response.game


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PrimaryDatacaster(
    @Json(name = "fullName")
    val fullName: String, // Mike Hyder
    @Json(name = "id")
    val id: Int, // 618778
    @Json(name = "link")
    val link: String // /api/v1/people/618778
)