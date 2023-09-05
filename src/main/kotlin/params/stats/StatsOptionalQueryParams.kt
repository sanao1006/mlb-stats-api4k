package params.stats

data class StatsOptionalQueryParams(
    val ver: String = "v1",
    val playerPool: String? = null,
    val position: String? = null,
    val teamId: String? = null,
    val leagueId: String? = null,
    val limit: String? = null,
    val offset: String? = null,
    val gameType: String? = null,
    val season: String? = null,
    val sportIds: String? = null,
    val sortStat: String? = null,
    val order: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
    val personId: String? = null,
    val metrics: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "playerPool" to playerPool,
            "position" to position,
            "teamId" to teamId,
            "leagueId" to leagueId,
            "limit" to limit,
            "offset" to offset,
            "gameType" to gameType,
            "season" to season,
            "sportIds" to sportIds,
            "sortStat" to sortStat,
            "order" to order,
            "hydrate" to hydrate,
            "fields" to fields,
            "personId" to personId,
            "metrics" to metrics,
        )
    }
}
