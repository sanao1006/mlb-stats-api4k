package params.jobs.officialScorers

data class JobsOfficialScorersOptionalQueryParams(
    val ver: String? = null,
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
