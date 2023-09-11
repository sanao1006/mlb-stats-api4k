package params.standings

data class StandingsOptionalQueryParams(
    val ver: String = "v1",
    val season: String? = null,
    val standingsTypes: String? = null,
    val date: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "season" to season,
            "standingsTypes" to standingsTypes,
            "date" to date,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
