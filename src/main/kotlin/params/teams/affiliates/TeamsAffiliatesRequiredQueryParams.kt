package params.teams.affiliates

data class TeamsAffiliatesRequiredQueryParams(val teamIds: String) {
    fun plus(teamsAffiliatesOptionalQueryParams: TeamsAffiliatesOptionalQueryParams): Map<String, String?> {
        return mapOf("teamIds" to teamIds).plus(teamsAffiliatesOptionalQueryParams.toMap())
    }
}
