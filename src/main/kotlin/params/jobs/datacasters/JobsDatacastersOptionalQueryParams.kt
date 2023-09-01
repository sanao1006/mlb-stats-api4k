package params.jobs.datacasters

data class JobsDatacastersOptionalQueryParams(
    val ver: String? = null,
    val sportId: String? = null,
    val date: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "sportId" to sportId,
            "date" to date,
            "fields" to fields,
        )
    }
}
