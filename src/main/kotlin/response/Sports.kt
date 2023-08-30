package response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Sports(
    @Json(name = "abbreviation")
    val abbreviation: String,
    @Json(name = "activeStatus")
    val activeStatus: Boolean,
    @Json(name = "code")
    val code: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "link")
    val link: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "sortOrder")
    val sortOrder: Int
)