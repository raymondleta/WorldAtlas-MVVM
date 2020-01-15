package com.tosh.worldatlas.di

import com.tosh.worldatlas.model.CountriesService
import com.tosh.worldatlas.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)
    fun inject(viewModel: ListViewModel)
}