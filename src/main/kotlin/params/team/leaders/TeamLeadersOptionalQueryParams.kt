package params.team.leaders

data class TeamLeadersOptionalQueryParams(
    val ver: String = "v1",
    val leaderGameTypes: String? = null,
    val hydrate: String? = null,
    val limit: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "leaderGameTypes" to leaderGameTypes,
            "hydrate" to hydrate,
            "limit" to limit,
            "fields" to fields,
        )
    }
}
