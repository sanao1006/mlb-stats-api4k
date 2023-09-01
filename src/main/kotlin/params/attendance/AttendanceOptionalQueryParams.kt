package params.attendance

data class AttendanceOptionalQueryParams(
    val ver: String? = null,
    val teamId: String? = null,
    val leagueId: String? = null,
    val season: String? = null,
    val date: String? = null,
    val leagueListId: String? = null,
    val gameType: String? = null,
    val fields: String? = null,
)
