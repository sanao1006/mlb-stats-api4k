package params.person

data class PersonOptionalQueryParams(
    val ver: String = "v1",
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
