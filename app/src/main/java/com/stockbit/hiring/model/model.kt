import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


data class ModelCoins (
    val message: String,
    val type: Long,
    val metaData: MetaData,
    val sponsoredData: List<SponsoredDatum>,
    val data: List<Datum>,
    val rateLimit: RateLimit,
    val hasWarning: Boolean
)

data class Datum (
    val coinInfo: CoinInfo,
    val raw: Raw? = null,
    val display: Display? = null
)

data class CoinInfo (
    val id: String,
    val name: String,
    val fullName: String,
    val internal: String,
    val imageURL: String,
    val url: String,
    val algorithm: String,
    val proofType: String,
    val rating: Rating,
    val netHashesPerSecond: Double,
    val blockNumber: Long,
    val blockTime: Double,
    val blockReward: Double,
    val assetLaunchDate: String,
    val maxSupply: Double,
    val type: Long,
    val documentType: DocumentType
)

enum class DocumentType {
    Webpagecoinp
}

data class Rating (
    val weiss: Weiss
)

data class Weiss (
    val rating: String,
    val technologyAdoptionRating: String,
    val marketPerformanceRating: String
)

data class Display (
    val idr: DisplayIdr
)

data class DisplayIdr (
    val fromsymbol: String,
    val tosymbol: String,
    val market: String,
    val price: String,
    val lastupdate: String,
    val lastvolume: String,
    val lastvolumeto: String,
    val lasttradeid: String,
    val volumeday: String,
    val volumedayto: String,
    val volume24Hour: String,
    val volume24Hourto: String,
    val openday: String,
    val highday: String,
    val lowday: String,
    val open24Hour: String,
    val high24Hour: String,
    val low24Hour: String,
    val lastmarket: String,
    val volumehour: String,
    val volumehourto: String,
    val openhour: String,
    val highhour: String,
    val lowhour: String,
    val toptiervolume24Hour: String,
    val toptiervolume24Hourto: String,
    val change24Hour: String,
    val changepct24Hour: String,
    val changeday: String,
    val changepctday: String,
    val changehour: String,
    val changepcthour: String,
    val conversiontype: String,
    val conversionsymbol: String,
    val supply: String,
    val mktcap: String,
    val mktcappenalty: String,
    val circulatingsupply: String,
    val circulatingsupplymktcap: String,
    val totalvolume24H: String,
    val totalvolume24Hto: String,
    val totaltoptiervolume24H: String,
    val totaltoptiervolume24Hto: String,
    val imageurl: String
)

data class Raw (
    val idr: RawIdr
)

data class RawIdr (
    val type: String,
    val market: String,
    val fromsymbol: String,
    val tosymbol: String,
    val flags: String,
    val price: Double,
    val lastupdate: Long,
    val median: Double,
    val lastvolume: Double,
    val lastvolumeto: Double,
    val lasttradeid: String,
    val volumeday: Double,
    val volumedayto: Double,
    val volume24Hour: Double,
    val volume24Hourto: Double,
    val openday: Double,
    val highday: Double,
    val lowday: Double,
    val open24Hour: Double,
    val high24Hour: Double,
    val low24Hour: Double,
    val lastmarket: String,
    val volumehour: Double,
    val volumehourto: Double,
    val openhour: Double,
    val highhour: Double,
    val lowhour: Double,
    val toptiervolume24Hour: Double,
    val toptiervolume24Hourto: Double,
    val change24Hour: Double,
    val changepct24Hour: Double,
    val changeday: Double,
    val changepctday: Double,
    val changehour: Double,
    val changepcthour: Double,
    val conversiontype: String,
    val conversionsymbol: String,
    val supply: Double,
    val mktcap: Double,
    val mktcappenalty: Long,
    val circulatingsupply: Double,
    val circulatingsupplymktcap: Double,
    val totalvolume24H: Double,
    val totalvolume24Hto: Double,
    val totaltoptiervolume24H: Double,
    val totaltoptiervolume24Hto: Double,
    val imageurl: String
)

data class MetaData (
    val count: Long
)

class RateLimit()

data class SponsoredDatum (
    val coinInfo: CoinInfo
)


