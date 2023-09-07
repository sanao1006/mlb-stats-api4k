package params.person.stats

data class PersonStatsOptionalQueryParams(
    val ver: String = "v1",
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "fields" to fields,
        )
    }
}
