package com.stockbit.hiring.model

/**
 *  Create by Indriyantongrh on 03/10/21
 */
class Base ( val result: ArrayList<Base>){
    data class Base(
        val Message: String?,
        val Type: Number?,
        val MetaData: MetaData?,
        val SponsoredData: List<SponsoredData439056353>?,
        val Data: List<Data1444312029>?,
        val HasWarning: Boolean?)

    data class CoinInfo(val Id: String?, val Name: String?, val FullName: String?, val Internal: String?, val ImageUrl: String?, val Url: String?, val Algorithm: String?, val ProofType: String?, val Rating: Rating?, val NetHashesPerSecond: Number?, val BlockNumber: Number?, val BlockTime: Number?, val BlockReward: Number?, val AssetLaunchDate: String?, val MaxSupply: Number?, val Type: Number?, val DocumentType: String?)

    data class DISPLAY(val IDR: IDR?)

    data class Data1444312029(val CoinInfo: CoinInfo?, val RAW: RAW?, val DISPLAY: DISPLAY?)

    data class IDR(val TYPE: String?, val MARKET: String?, val FROMSYMBOL: String?, val TOSYMBOL: String?, val FLAGS: String?, val PRICE: String?, val LASTUPDATE: Number?, val MEDIAN: Number?, val LASTVOLUME: Number?, val LASTVOLUMETO: Number?, val LASTTRADEID: String?, val VOLUMEDAY: Number?, val VOLUMEDAYTO: Number?, val VOLUME24HOUR: Number?, val VOLUME24HOURTO: Number?, val OPENDAY: Number?, val HIGHDAY: Number?, val LOWDAY: Number?, val OPEN24HOUR: Number?, val HIGH24HOUR: Number?, val LOW24HOUR: Number?, val LASTMARKET: String?, val VOLUMEHOUR: Number?, val VOLUMEHOURTO: Number?, val OPENHOUR: Number?, val HIGHHOUR: Number?, val LOWHOUR: Number?, val TOPTIERVOLUME24HOUR: Number?, val TOPTIERVOLUME24HOURTO: Number?, val CHANGE24HOUR: Number?, val CHANGEPCT24HOUR: Number?, val CHANGEDAY: Number?, val CHANGEPCTDAY: Number?, val CHANGEHOUR: Number?, val CHANGEPCTHOUR: Number?, val CONVERSIONTYPE: String?, val CONVERSIONSYMBOL: String?, val SUPPLY: Number?, val MKTCAP: Number?, val MKTCAPPENALTY: Number?, val CIRCULATINGSUPPLY: Number?, val CIRCULATINGSUPPLYMKTCAP: Number?, val TOTALVOLUME24H: Number?, val TOTALVOLUME24HTO: Number?, val TOTALTOPTIERVOLUME24H: Number?, val TOTALTOPTIERVOLUME24HTO: Number?, val IMAGEURL: String?)

    data class MetaData(val Count: Number?)

    data class RAW(val IDR: IDR?)

//    data class RateLimit()

    data class Rating(val Weiss: Weiss?)

    data class SponsoredData439056353(val CoinInfo: CoinInfo?)

    data class Weiss(val Rating: String?, val TechnologyAdoptionRating: String?, val MarketPerformanceRating: String?)
}