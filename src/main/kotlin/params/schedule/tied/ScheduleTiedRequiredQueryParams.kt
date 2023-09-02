package params.schedule.tied

data class ScheduleTiedRequiredQueryParams(val season: String) {
    fun plus(scheduleTiedOptionalQueryParams: ScheduleTiedOptionalQueryParams): Map<String, String?> {
        return mapOf("season" to season).plus(scheduleTiedOptionalQueryParams.toMap())
    }
}
