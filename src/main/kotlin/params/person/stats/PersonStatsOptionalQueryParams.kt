package params.person.stats

data class PersonStatsOptionalQueryParams(
    val ver: String = "v1",
    val personId: String? = null,
    val gamePk: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "fields" to fields,
        )
    }
}
