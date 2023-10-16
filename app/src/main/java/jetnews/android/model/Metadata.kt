package jetnews.android.model

data class Metadata(
    val author: PostAuthor,
    val date: String,
    val readTimeMinutes: Int
)