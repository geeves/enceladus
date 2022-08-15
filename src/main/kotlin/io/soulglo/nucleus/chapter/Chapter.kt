package io.soulglo.nucleus.chapter

import java.time.OffsetDateTime
import java.util.UUID

data class Chapter(
	val chapterId: Int? = null,
	val storyId: Int,
	val accountId: Int,
	val id: UUID? = null,

	val chapterNumber: Int? = null,
	val chapterStatusId: Int? = null,
	val wordCount: Int? = null,


	val title: String? = null,
	val content: String? = null,
	val summary: String? = null,
	val notes: String? = null,

	val dateCreated: OffsetDateTime? = null,
	val dateModified: OffsetDateTime? = null,
	val datePublished: OffsetDateTime? = null,
	val dateArchived: OffsetDateTime? = null,

)

object ChapterStatus {
	const val PUBLISHED: Int = 1
}
