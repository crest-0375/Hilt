package com.app.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @SQLQualifier
    fun providesSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @Provides
    @FirebaseQualifier
    fun providesFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }
}