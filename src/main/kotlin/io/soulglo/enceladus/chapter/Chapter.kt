package io.soulglo.enceladus.chapter

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

) {
	val titleSort: String? = updateTitle()

	private fun updateTitle(): String? {
		if (true == title?.startsWith("The ")) {
			return "${title.substring(4)}, The".trim()
		}
		return title;
	}

}

object ChapterStatus {
	const val PUBLISHED: Int = 1
	const val IN_REVISION: Int = 2
}
