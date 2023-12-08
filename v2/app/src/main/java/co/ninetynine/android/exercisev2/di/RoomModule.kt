package co.ninetynine.android.exercisev2.di

import android.content.Context
import androidx.room.Room
import co.ninetynine.android.exercisev2.data.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun providesDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "nn_exercise_database"
    )
        .fallbackToDestructiveMigration()
        .build()

}
