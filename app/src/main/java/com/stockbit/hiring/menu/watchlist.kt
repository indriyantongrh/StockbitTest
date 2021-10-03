package com.stockbit.hiring.menu

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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.stockbit.hiring.R
import com.stockbit.hiring.adapter.AdapterCoin
import com.stockbit.hiring.baseurl.apiservice
import com.stockbit.hiring.model.Base
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class watchlist : Fragment() {

    private var  rvData: RecyclerView? = null
    private lateinit var name: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var listDataCoins: ArrayList<Base.Base>
    private lateinit var adapterCoin: AdapterCoin


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater?.inflate(R.layout.fragment_watchlist, container, false)
        progressBar = view.findViewById(R.id.progressBar)
        rvData = view.findViewById(R.id.rvData)
        rvData?.layoutManager = LinearLayoutManager(context)
        rvData?.setHasFixedSize(true)


        getDataFromApi()
        return view
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
//        rvData = view.findViewById(R.id.rvData)
//        rvData.setHasFixedSize(true)
//
//
//        getDataFromApi()
//
//    }

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
                    showLoading(false)

                    if (response.isSuccessful) {
                        showResult(response.body()!!)
                    }
                }
            })
    }

    private fun showResult(results: Base.Base) {
        for (result in results.Data!!)
            Log.d("Data", "Ambil Data: " +result)
        rvData?.adapter = AdapterCoin(results.Data!!)

    }

    private fun showLoading(loading: Boolean) {
        when(loading) {
            true -> progressBar.visibility = View.VISIBLE
            false -> progressBar.visibility = View.GONE
        }
    }

}