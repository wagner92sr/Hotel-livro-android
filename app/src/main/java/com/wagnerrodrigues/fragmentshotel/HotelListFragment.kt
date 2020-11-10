package com.wagnerrodrigues.fragmentshotel

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

class HotelListFragment : ListFragment(), HotelListView{
    private val presenter = HotelListPresenter(this, MemoryRepository)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.searchHotels("")
    }

    override fun showHotels(hotels: List<Hotel>){
        val adapter = ArrayAdapter<Hotel>(requireContext(), R.layout.simple_expandable_list_item_1, hotels)
        listAdapter = adapter
    }

    override fun showHotelDetails(hotel: Hotel) {
        TODO("Not yet implemented")
    }
}