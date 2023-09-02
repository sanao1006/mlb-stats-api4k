package params.teams.history

data class TeamsHistoryOptionalQueryParams(
    val ver: String = "v1",
    val startSeason: String? = null,
    val endSeason: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "startSeason" to startSeason,
            "endSeason" to endSeason,
            "fields" to fields,
        )
    }
}
