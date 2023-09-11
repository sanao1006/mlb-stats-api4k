package params.sports.players

data class SportsPlayersRequiredQueryParams(
    val sportId: String,
    val season: String,
) {
    fun plus(sportsPlayersOptionalQueryParams: SportsPlayersOptionalQueryParams): Map<String, String?> {
        return mapOf("season" to season).plus(sportsPlayersOptionalQueryParams.toMap())
    }
}
