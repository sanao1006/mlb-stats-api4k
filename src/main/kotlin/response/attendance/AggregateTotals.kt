package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AggregateTotals(
    @Json(name = "attendanceAverageAway")
    val attendanceAverageAway: Int, // 3208
    @Json(name = "attendanceAverageHome")
    val attendanceAverageHome: Int, // 4397
    @Json(name = "attendanceAverageYtd")
    val attendanceAverageYtd: Int, // 3826
    @Json(name = "attendanceHigh")
    val attendanceHigh: Int, // 5039
    @Json(name = "attendanceHighDate")
    val attendanceHighDate: String, // 2019-08-03T00:00:00
    @Json(name = "attendanceTotal")
    val attendanceTotal: Int, // 5405456
    @Json(name = "attendanceTotalAway")
    val attendanceTotalAway: Int, // 2178423
    @Json(name = "attendanceTotalHome")
    val attendanceTotalHome: Int, // 3227033
    @Json(name = "openingsTotalAway")
    val openingsTotalAway: Int, // 679
    @Json(name = "openingsTotalHome")
    val openingsTotalHome: Int, // 734
    @Json(name = "openingsTotalLost")
    val openingsTotalLost: Int, // 16
    @Json(name = "openingsTotalYtd")
    val openingsTotalYtd: Int // 0
)