package params.team

data class TeamRequiredQueryParams(val teamId: String) {
    fun plus(teamOptionalQueryParams: TeamOptionalQueryParams): Map<String, String?> {
        return mapOf("teamId" to teamId).plus(teamOptionalQueryParams.toMap())
    }
}
