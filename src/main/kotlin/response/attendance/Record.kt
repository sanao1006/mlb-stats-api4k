package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Record(
    @Json(name = "attendanceAverageAway")
    val attendanceAverageAway: Int, // 3367
    @Json(name = "attendanceAverageHome")
    val attendanceAverageHome: Int, // 4826
    @Json(name = "attendanceAverageYtd")
    val attendanceAverageYtd: Int, // 4124
    @Json(name = "attendanceHigh")
    val attendanceHigh: Int, // 5038
    @Json(name = "attendanceHighDate")
    val attendanceHighDate: String, // 2012-07-26T00:00:00
    @Json(name = "attendanceHighGame")
    val attendanceHighGame: AttendanceHighGame,
    @Json(name = "attendanceLow")
    val attendanceLow: Int, // 1
    @Json(name = "attendanceLowDate")
    val attendanceLowDate: String, // 2012-05-03T00:00:00
    @Json(name = "attendanceLowGame")
    val attendanceLowGame: AttendanceLowGame,
    @Json(name = "attendanceOpeningAverage")
    val attendanceOpeningAverage: Int, // 4691
    @Json(name = "attendanceTotal")
    val attendanceTotal: Int, // 540265
    @Json(name = "attendanceTotalAway")
    val attendanceTotalAway: Int, // 212116
    @Json(name = "attendanceTotalHome")
    val attendanceTotalHome: Int, // 328149
    @Json(name = "gameType")
    val gameType: GameType,
    @Json(name = "gamesAwayTotal")
    val gamesAwayTotal: Int, // 75
    @Json(name = "gamesHomeTotal")
    val gamesHomeTotal: Int, // 74
    @Json(name = "gamesTotal")
    val gamesTotal: Int, // 149
    @Json(name = "openingsTotal")
    val openingsTotal: Int, // 131
    @Json(name = "openingsTotalAway")
    val openingsTotalAway: Int, // 63
    @Json(name = "openingsTotalHome")
    val openingsTotalHome: Int, // 68
    @Json(name = "openingsTotalLost")
    val openingsTotalLost: Int, // 2
    @Json(name = "team")
    val team: Team,
    @Json(name = "year")
    val year: String // 2012
)