package codetest.com.snoop.beerapp.di

import android.content.Context
import android.content.SharedPreferences
import codetest.com.snoop.beerapp.data.repositories.PunkRepositoryImpl
import codetest.com.snoop.beerapp.data.service.PunkService
import codetest.com.snoop.beerapp.domain.repositories.PunkRepository
import codetest.com.snoop.beerapp.domain.useCases.GetBeerList
import codetest.com.snoop.beerapp.domain.useCases.GetBeersById
import codetest.com.snoop.beerapp.ui.utils.SharedPreferencesConfig
import codetest.com.snoop.beerapp.ui.viewmodels.PunkViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoriesModule = module {
    single { PunkService() }
    single<PunkRepository> { PunkRepositoryImpl(get()) }
}


val viewModelModule = module {
    single { PunkViewModel(get(), get(), get()) }
}

val useCasesModule = module {
    single { GetBeersById(get()) }
    single { GetBeerList(get()) }

}

val sharedPreferences = module {

    single { SharedPreferencesConfig(androidContext())}
    single {
        getSharedPrefs(androidContext(), "codetest.com.snoop.beerapp.PREFERENCE_FILE")
    }
    single<SharedPreferences.Editor> {
        getSharedPrefs(androidContext(), "codetest.com.snoop.beerapp.PREFERENCE_FILE").edit()
    }
}

fun getSharedPrefs(context: Context, fileName: String): SharedPreferences {
    return context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
}