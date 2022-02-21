package codetest.com.snoop.beerapp.domain.useCases

import codetest.com.snoop.beerapp.domain.repositories.PunkRepository
import org.koin.core.KoinComponent

class GetBeerList(private val punkRepository: PunkRepository) : KoinComponent {
    operator fun invoke(page: Int, perPage: Int) = punkRepository.getBeersList(page, perPage)
}