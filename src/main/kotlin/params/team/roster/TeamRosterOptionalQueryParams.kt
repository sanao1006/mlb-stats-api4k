package params.team.roster

data class TeamRosterOptionalQueryParams(
    val ver: String = "v1",
    val rosterType: String? = null,
    val season: String? = null,
    val date: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "rosterType" to rosterType,
            "season" to season,
            "date" to date,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
