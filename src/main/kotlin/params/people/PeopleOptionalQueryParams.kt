package params.people

data class PeopleOptionalQueryParams(
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
