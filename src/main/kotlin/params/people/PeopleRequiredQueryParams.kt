package params.people

data class PeopleRequiredQueryParams(val personIds: String) {
    fun plus(peopleOptionalQueryParams: PeopleOptionalQueryParams): Map<String, String?> {
        return mapOf("personIds" to personIds).plus(peopleOptionalQueryParams.toMap())
    }
}
