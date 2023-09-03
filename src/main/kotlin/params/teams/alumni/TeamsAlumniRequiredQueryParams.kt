package params.teams.alumni

data class TeamsAlumniRequiredQueryParams(
    val teamId: String,
    val season: String,
    val group: String,
) {
    fun plus(teamsAlumniOptionalQueryParams: TeamsAlumniOptionalQueryParams): Map<String, String?> {
        return mapOf(
            "season" to season,
            "group" to group,
        ).plus(teamsAlumniOptionalQueryParams.toMap())
    }
}
