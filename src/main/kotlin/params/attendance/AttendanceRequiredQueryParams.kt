package params.attendance

data class AttendanceRequiredQueryParams(
    val teamId: String,
    val leagueId: String,
    val leagueListid: String,
) {
    fun plus(optionalParams: AttendanceOptionalQueryParams): Map<String, String?> {
        return mapOf(
            "teamId" to teamId,
            "leagueId" to leagueId,
            "leagueListid" to leagueListid
        ).plus(optionalParams.toMap())
    }
}

