package params.attendance

data class AttendanceOptionalQueryParams(
    val ver: String? = "v1",
    val teamId: String? = null,
    val leagueId: String? = null,
    val season: String? = null,
    val date: String? = null,
    val leagueListId: String? = null,
    val gameType: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "season" to season,
            "date" to date,
            "gameType" to gameType,
            "fields" to fields
        )
    }
}
