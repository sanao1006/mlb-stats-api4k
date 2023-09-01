package params.teams

data class TeamsOptionalQueryParams(
    val ver: String? = null,
    val season: String? = null,
    val activeStatus: String? = null,
    val leagueIds: String? = null,
    val sportId: String? = null,
    val sportIds: String? = null,
    val gameType: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "season" to season,
            "activeStatus" to activeStatus,
            "leagueIds" to leagueIds,
            "sportId" to sportId,
            "sportIds" to sportIds,
            "gameType" to gameType,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
