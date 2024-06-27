package com.ca.groupd4testtask.data.repository

import com.ca.groupd4testtask.domain.repository.MoviesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindMovieRepository(repositoryImpl: MoviesRepositoryImpl): MoviesRepository
}