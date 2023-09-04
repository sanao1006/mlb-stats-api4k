package params.stats.leaders

data class StatsLeadersOptionalQueryParams(
    val ver: String = "v1",
    val playerPool: String? = null,
    val leaderGameTypes: String? = null,
    val statGroup: String? = null,
    val season: String? = null,
    val leagueId: String? = null,
    val sportId: String? = null,
    val hydrate: String? = null,
    val limit: String? = null,
    val fields: String? = null,
    val statType: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "playerPool" to playerPool,
            "leaderGameTypes" to leaderGameTypes,
            "statGroup" to statType,
            "season" to season,
            "leagueId" to leagueId,
            "sportId" to sportId,
            "hydrate" to hydrate,
            "limit" to limit,
            "fields" to fields,
            "statType" to statType,
        )
    }
}
