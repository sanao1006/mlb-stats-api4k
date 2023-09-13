package params.people.changes

data class PeopleChangesRequiredQueryParams(val updatedSince: String) {
    fun plus(peopleChangesOptionalQueryParams: PeopleChangesOptionalQueryParams): Map<String, String?> {
        return mapOf("updatedSince" to updatedSince).plus(peopleChangesOptionalQueryParams.toMap())
    }
}
