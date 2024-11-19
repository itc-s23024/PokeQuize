package jp.ac.it_college.std.s23024.pokequiz.data

import androidx.room.Database
import androidx.room.RoomDatabase
import jp.ac.it_college.std.s23024.pokequiz.data.dao.GenerationDao
import jp.ac.it_college.std.s23024.pokequiz.data.entity.GenerationEntity

@Database(
    entities = [
        GenerationEntity::class
    ],
    version = 1,
)
abstract class PokeQuizDatabase : RoomDatabase(){
    abstract fun generationDao(): GenerationDao
}
