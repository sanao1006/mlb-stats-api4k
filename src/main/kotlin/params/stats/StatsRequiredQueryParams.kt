package params.stats

data class StatsRequiredQueryParams(
    val stats: String,
    val group: String,
) {
    fun plus(statsOptionalQueryParams: StatsOptionalQueryParams): Map<String, String?> {
        return mapOf(
            "stats" to stats,
            "group" to group,
        ).plus(statsOptionalQueryParams.toMap())
    }
}
