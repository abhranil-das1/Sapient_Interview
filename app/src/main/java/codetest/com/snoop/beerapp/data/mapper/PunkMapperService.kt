package codetest.com.snoop.beerapp.data.mapper

import codetest.com.snoop.beerapp.data.service.response.PunkResponse
import codetest.com.snoop.beerapp.domain.entities.Beer

class PunkMapperService : BaseMapperRepository<PunkResponse, Beer> {
    override fun transform(type: PunkResponse): Beer =
        Beer(
            type.id,
            type.name,
            type.description,
            type.tagline,
            type.imageURL,
            type.abv,
            type.ibu
        )
    override fun transformToRepository(type: Beer): PunkResponse =
        PunkResponse(
            type.id,
            type.name,
            type.description,
            type.tagline,
            type.imageURL,
            type.abv,
            type.ibu
        )
}