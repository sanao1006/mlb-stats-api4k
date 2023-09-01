package params.schedule.tied

data class ScheduleTiedOptionalQueryParams(
    val ver: String = "v1",
    val gameTypes: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "gameTypes" to gameTypes,
            "hydrate" to hydrate,
            "fields" to fields
        )
    }
}
