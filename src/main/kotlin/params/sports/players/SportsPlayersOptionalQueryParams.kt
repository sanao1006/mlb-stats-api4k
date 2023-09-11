package params.sports.players

data class SportsPlayersOptionalQueryParams(
    val ver: String? = "v1",
    val gameType: String? = null,
    val fields: String? = null,
) {
    fun toMap(): Map<String, String?> {
        return mapOf(
            "ver" to ver,
            "gameType" to gameType,
            "fields" to fields,
        )
    }
}
