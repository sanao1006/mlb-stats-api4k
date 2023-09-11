package params.team.personnel

data class TeamPersonnelOptionalQueryParams(
    val ver: String = "v1",
    val date: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "date" to date,
            "fields" to fields,
        )
    }
}
