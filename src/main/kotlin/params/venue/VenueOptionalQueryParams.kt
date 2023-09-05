package params.venue

data class VenueOptionalQueryParams(
    val ver: String = "v1",
    val season: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "season" to season,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
