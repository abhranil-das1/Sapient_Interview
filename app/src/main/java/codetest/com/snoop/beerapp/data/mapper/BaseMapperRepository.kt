package codetest.com.snoop.beerapp.data.mapper

interface BaseMapperRepository<E, D> {
    fun transform(type: E): D
    fun transformToRepository(type: D): E
}
