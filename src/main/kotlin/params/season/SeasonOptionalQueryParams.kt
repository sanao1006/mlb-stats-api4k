package params.season

data class SeasonOptionalQueryParams(
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
