package com.wagnerrodrigues.fragmentshotel

interface HotelListView {
    fun showHotels(hotels: List<Hotel>)
    fun showHotelDetails(hotel: Hotel)
}