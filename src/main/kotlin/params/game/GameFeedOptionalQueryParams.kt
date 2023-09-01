package params.game

data class GameFeedOptionalQueryParams(
    val ver: String? = "v1.1",
    val gamePk: String? = null,
    val timecode: String? = null,
    val hydrate: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "gamePk" to gamePk,
            "timecode" to timecode,
            "hydrate" to hydrate,
            "fields" to fields,
        )
    }
}
