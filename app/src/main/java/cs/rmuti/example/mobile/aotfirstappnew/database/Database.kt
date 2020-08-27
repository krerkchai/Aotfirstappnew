package cs.rmuti.example.mobile.aotfirstappnew.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import chimjan.xkalux.mobilehomework_firstapp.database.Contact


@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase(){
    abstract val databaseDao: DatabaseDAO

    companion object{
        @Volatile
        private var INSTANCE: cs.rmuti.example.mobile.aotfirstappnew.database.Database? = null
        fun getInstance(context: Context): cs.rmuti.example.mobile.aotfirstappnew.database.Database {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        cs.rmuti.example.mobile.aotfirstappnew.database.Database::class.java,
                        "database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}