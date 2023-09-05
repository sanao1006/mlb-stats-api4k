package response.stats


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stats(
    @Json(name = "exemptions")
    val exemptions: List<Any>,
    @Json(name = "group")
    val group: Group,
    @Json(name = "playerPool")
    val playerPool: String, // QUALIFIED
    @Json(name = "splits")
    val splits: List<Split>,
    @Json(name = "splitsTiedWithLimit")
    val splitsTiedWithLimit: List<Any>,
    @Json(name = "splitsTiedWithOffset")
    val splitsTiedWithOffset: List<Any>,
    @Json(name = "totalSplits")
    val totalSplits: Int, // 53
    @Json(name = "type")
    val type: Type
)