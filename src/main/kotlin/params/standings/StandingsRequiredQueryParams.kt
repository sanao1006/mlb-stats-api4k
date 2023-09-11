package params.standings

data class StandingsRequiredQueryParams(val leagueId: String) {
    fun plus(standingsOptionalQueryParams: StandingsOptionalQueryParams): Map<String, String?> {
        return mapOf("leagueId" to leagueId).plus(standingsOptionalQueryParams.toMap())
    }
}
