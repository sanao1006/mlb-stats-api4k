package params.venue

data class VenueRequiredQueryParams(val venueIds: String) {
    fun plus(venueOptionalQueryParams: VenueOptionalQueryParams): Map<String, String?> {
        return mapOf("venueIds" to venueIds).plus(venueOptionalQueryParams.toMap())
    }
}
