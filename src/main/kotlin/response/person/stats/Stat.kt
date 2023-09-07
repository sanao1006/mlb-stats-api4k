package response.person.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stat(
    @Json(name = "exemptions")
    val exemptions: List<Any>,
    @Json(name = "group")
    val group: Group?,
    @Json(name = "splits")
    val splits: List<Split>,
    @Json(name = "totalSplits")
    val totalSplits: Int?, // 0
    @Json(name = "type")
    val type: Type?
)