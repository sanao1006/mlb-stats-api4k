import response.Award

interface MlbStatsApi {
    fun getAwards(): List<Award>
}