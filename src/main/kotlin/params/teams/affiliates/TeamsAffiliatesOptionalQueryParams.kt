package params.teams.affiliates

data class TeamsAffiliatesOptionalQueryParams(
    val ver: String = "v1",
    val sportId: String? = null,
    val season: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "sportId" to sportId,
            "season" to season,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
