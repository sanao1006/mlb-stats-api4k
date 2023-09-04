package params.stats.leaders

data class StatsLeadersRequiredQueryParams(val leaderCategories: String) {
    fun plus(statsLeadersOptionalQueryParams: StatsLeadersOptionalQueryParams): Map<String, String?> {
        return mapOf("leaderCategories" to leaderCategories).plus(statsLeadersOptionalQueryParams.toMap())
    }
}
