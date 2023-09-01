package params.jobs.officialScorers

data class JobsOfficialScorersOptionalQueryParams(
    val ver: String? = "v1",
    val timecode: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "timecode" to timecode,
            "fields" to fields,
        )
    }
}
