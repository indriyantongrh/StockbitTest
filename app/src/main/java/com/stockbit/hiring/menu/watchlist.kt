package com.stockbit.hiring.menu

import ModelCoins
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stockbit.hiring.R
import com.stockbit.hiring.adapter.AdapterCoin
import com.stockbit.hiring.baseurl.NetworkConfig
import com.stockbit.hiring.baseurl.apiservice
import com.stockbit.hiring.model.Base
import com.stockbit.hiring.model.ResponseCoin
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class watchlist : Fragment() {

    private lateinit var rvData: RecyclerView
    private lateinit var name: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var listDataCoins: ArrayList<Base.Base>
    private lateinit var adapterCoin: AdapterCoin


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_watchlist, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        rvData = view.findViewById(R.id.rvData)
        rvData.setHasFixedSize(true)


        getDataFromApi()
    }

    private fun getData() {
        NetworkConfig().getCoinss.getDataCoins().enqueue(
            object : Callback<ModelCoins>{
                override fun onResponse(call: Call<ModelCoins>, response: Response<ModelCoins>) {

                    Log.d("jajal List", "Berhasil")
//                    if(response.isSuccessful){
//                        name.text = response.body()!!.message
//                    }else{
//                        name.text = response.body()!!.message
//
//                    }
//                      ModelCoins  if (response!!.body().message) {
//                            Log.d("Failure", "Fialed Connect" )
//                        } else {
////                            imageSearch.visibility = View.GONE
////                            imageNotFound.visibility = View.GONE
////                            progerssProgressDialog.dismiss()
                            ///listDataCoins = response!!.body()!!.message as ArrayList<ModelCoins>
                            Log.d("jajal List", "jajal" + response)
                          ///  rvData.adapter = AdapterCoin(listDataCoins)


                }

                override fun onFailure(call: Call<ModelCoins>, t: Throwable) {
                    Log.d("Failure", "Fialed Connect" + t.message)
                }
            }
        )
    }


    private fun getDataCoints() {
        NetworkConfig().getDataCoinss.getDataCoinss().enqueue(
            object : Callback<ResponseCoin>{
                override fun onResponse(call: Call<ResponseCoin>, response: Response<ResponseCoin>) {
                    Log.d("jajal 2", "Berhasil")
                    val respon = response.body()!!
                    val cek = respon.toString()
                    name.text = cek

                    Log.d("jajal 2", "jajal " + respon.toString())


                }

                override fun onFailure(call: Call<ResponseCoin>, t: Throwable) {
                    Log.d("Failure", "Fialed jajal: " + t.message)
                    name.text = t.message
                }
            }
        )
    }


    private fun getDataFromApi(){
        showLoading(true)
        apiservice.endpoint.data()
            .enqueue(object : Callback<Base.Base> {
                override fun onFailure(call: Call<Base.Base>, t: Throwable) {
                    Log.d("Failure", "Fialed jajal: " + t.message)
                }
                override fun onResponse(
                    call: Call<Base.Base>,
                    response: Response<Base.Base>
                ) {
                    ///showLoading(false)
                    if (response.isSuccessful) {
                        showLoading(false)
                        showResult(response.body()!!)
                    }
                }
            })
    }

    private fun showResult(results: Base.Base) {
        for (result in results.Data!!)
            Log.d("Data", "Ambil Data: " +result)
        rvData.adapter = AdapterCoin(results.Data!!)

    }

    private fun showLoading(loading: Boolean) {
        when(loading) {
            true -> progressBar.visibility = View.VISIBLE
            false -> progressBar.visibility = View.GONE
        }
    }

}