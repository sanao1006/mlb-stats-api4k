package params.season

data class SeasonRequiredQueryParams(
    val seasonId: String,
    val sportId: String,
) {
    fun plus(seasonOptionalQueryParams: SeasonOptionalQueryParams): Map<String, String?> {
        return mapOf(
            "seasonId" to seasonId,
            "sportId" to sportId
        ).plus(seasonOptionalQueryParams.toMap())
    }
}
