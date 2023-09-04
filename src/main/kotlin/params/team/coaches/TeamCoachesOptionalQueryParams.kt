package params.team.coaches

data class TeamCoachesOptionalQueryParams(
    val ver: String = "v1",
    val season: String? = null,
    val date: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "season" to season,
            "date" to date,
            "fields" to fields,
        )
    }
}
