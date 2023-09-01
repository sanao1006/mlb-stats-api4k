package params.conferences

data class ConferencesOptionalQueryParams(
    val ver: String? = "v1",
    val conferenceId: String? = null,
    val season: String? = null,
    val fields: String? = null
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "conferenceId" to conferenceId,
            "season" to season,
            "fields" to fields
        )
    }
}
