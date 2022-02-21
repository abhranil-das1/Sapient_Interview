package codetest.com.snoop.beerapp.domain.repositories

import codetest.com.snoop.beerapp.domain.entities.Beer
import codetest.com.snoop.beerapp.domain.utils.Result

interface PunkRepository {

    fun getBeersList(page: Int, perPage: Int)
            : Result<List<Beer>>

    fun getBeersById(id: Int)
            : Result<List<Beer>>

}