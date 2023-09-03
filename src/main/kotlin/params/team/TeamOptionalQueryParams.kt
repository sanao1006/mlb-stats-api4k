package params.team

data class TeamOptionalQueryParams(
    val ver: String = "v1",
    val season: String? = null,
    val sportId: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "season" to season,
            "sportId" to sportId,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
