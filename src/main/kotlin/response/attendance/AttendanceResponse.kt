package response.attendance


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AttendanceResponse(
    @Json(name = "aggregateTotals")
    val aggregateTotals: AggregateTotals,
    @Json(name = "copyright")
    val copyright: String, // Copyright 2023 MLB Advanced Media, L.P.  Use of any content on this page acknowledges agreement to the terms posted here http://gdx.mlb.com/components/copyright.txt
    @Json(name = "records")
    val records: List<Record>
)