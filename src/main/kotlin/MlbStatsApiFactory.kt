class MlbStatsApiFactory {
    companion object {
        private const val baseUrl = "https://statsapi.mlb.com/api/"
        fun build(): MlbStatsApiImpl {
            return MlbStatsApiImpl(apiHost = baseUrl)
        }
    }
}
