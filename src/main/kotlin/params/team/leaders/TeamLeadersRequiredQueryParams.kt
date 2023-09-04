package params.team.leaders

data class TeamLeadersRequiredQueryParams(
    val teamId: String,
    val leaderCategories: String,
    val season: String,
) {
    fun plus(teamLeadersOptionalQueryParams: TeamLeadersOptionalQueryParams): Map<String, String?> {
        return mapOf(
            "leaderCategories" to leaderCategories,
            "season" to season
        ).plus(teamLeadersOptionalQueryParams.toMap())
    }
}
