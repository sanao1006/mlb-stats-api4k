package response.standings


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Records(
    @Json(name = "divisionRecords")
    val divisionRecords: List<DivisionRecord>?,
    @Json(name = "expectedRecords")
    val expectedRecords: List<ExpectedRecord>?,
    @Json(name = "leagueRecords")
    val leagueRecords: List<LeagueRecord>?,
    @Json(name = "overallRecords")
    val overallRecords: List<OverallRecord>?,
    @Json(name = "splitRecords")
    val splitRecords: List<SplitRecord>?
)