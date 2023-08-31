class MlbStatsApiFactory {
    companion object {
        private const val baseUrl = "https://statsapi.mlb.com/api/"
        private const val apiHost = baseUrl + "v1/"
        fun build(): MlbStatsApiImpl {
            return MlbStatsApiImpl(apiHost = apiHost)
        }
    }
}
