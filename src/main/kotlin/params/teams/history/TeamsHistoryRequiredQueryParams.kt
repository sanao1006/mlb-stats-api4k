package params.teams.history

import params.teams.TeamsOptionalQueryParams

data class TeamsHistoryRequiredQueryParams(val teamIds: String) {
    fun plus(teamsOptionalQueryParams: TeamsOptionalQueryParams): Map<String, String?> {
        return mapOf("teamIds" to teamIds).plus(teamsOptionalQueryParams.toMap())
    }
}
