package com.bunty.hilt_example_app

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {
    @Provides
    @Named("sql")
    fun providesSqlRepository(sqlRepository: SqlRepository): UserRepository {
        return sqlRepository
    }

    @Provides
    @FirebaseQualifiers
    fun providesFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }
}