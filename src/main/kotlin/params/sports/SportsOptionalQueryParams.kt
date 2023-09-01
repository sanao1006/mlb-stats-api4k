package params.sports

data class SportsOptionalQueryParams(
    val ver: String? = "v1",
    val sportId: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "sportId" to sportId,
            "fields" to fields,
        )
    }
}
