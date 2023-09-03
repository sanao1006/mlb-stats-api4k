package params.team.alumni

data class TeamAlumniRequiredQueryParams(
    val teamId: String,
    val season: String,
    val group: String,
) {
    fun plus(teamsAlumniOptionalQueryParams: TeamAlumniOptionalQueryParams): Map<String, String?> {
        return mapOf(
            "season" to season,
            "group" to group,
        ).plus(teamsAlumniOptionalQueryParams.toMap())
    }
}
