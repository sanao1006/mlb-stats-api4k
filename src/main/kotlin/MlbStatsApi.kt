import response.*

interface MlbStatsApi {
    fun getAwards(): List<Award>
    fun getConferences(): List<Conference>
    fun getDivisions(): List<Division>
    fun getSports(): List<Sports>
    fun getTeams(): List<Team>
}
