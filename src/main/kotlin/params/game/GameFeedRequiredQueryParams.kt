package params.game


data class GameFeedRequiredQueryParams(val gamePk: String){
    fun plus(gameFeedOptionalQueryParams: GameFeedOptionalQueryParams): Map<String, String?> {
        return mapOf("gamePk" to gamePk).plus(gameFeedOptionalQueryParams.toMap().filterValues { it -> it != null })
    }
}
