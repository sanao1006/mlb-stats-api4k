package params.divisions

data class DivisionsOptionalQueryParams(
    val ver: String? = "v1",
    val divisionId: String? = null,
    val leagueId: String? = null,
    val sportId: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "divisionId" to divisionId,
            "leagueId" to leagueId,
            "sportId" to sportId,
        )
    }
}
