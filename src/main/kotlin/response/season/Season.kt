package response.season


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Season(
    @Json(name = "allStarDate")
    val allStarDate: String,
    @Json(name = "firstDate2ndHalf")
    val firstDate2ndHalf: String,
    @Json(name = "gameLevelGamedayType")
    val gameLevelGamedayType: String,
    @Json(name = "hasWildcard")
    val hasWildcard: Boolean,
    @Json(name = "lastDate1stHalf")
    val lastDate1stHalf: String,
    @Json(name = "offSeasonEndDate")
    val offSeasonEndDate: String,
    @Json(name = "offseasonStartDate")
    val offseasonStartDate: String,
    @Json(name = "postSeasonEndDate")
    val postSeasonEndDate: String,
    @Json(name = "postSeasonStartDate")
    val postSeasonStartDate: String,
    @Json(name = "preSeasonEndDate")
    val preSeasonEndDate: String,
    @Json(name = "preSeasonStartDate")
    val preSeasonStartDate: String,
    @Json(name = "qualifierOutsPitched")
    val qualifierOutsPitched: Int,
    @Json(name = "qualifierPlateAppearances")
    val qualifierPlateAppearances: Double,
    @Json(name = "regularSeasonEndDate")
    val regularSeasonEndDate: String,
    @Json(name = "regularSeasonStartDate")
    val regularSeasonStartDate: String,
    @Json(name = "seasonEndDate")
    val seasonEndDate: String,
    @Json(name = "seasonId")
    val seasonId: String,
    @Json(name = "seasonLevelGamedayType")
    val seasonLevelGamedayType: String,
    @Json(name = "seasonStartDate")
    val seasonStartDate: String,
    @Json(name = "springEndDate")
    val springEndDate: String,
    @Json(name = "springStartDate")
    val springStartDate: String
)