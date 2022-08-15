package io.soulglo.nucleus.story

import java.time.OffsetDateTime
import java.util.UUID

data class Story(
	val storyId: Int? = null,
	val id: UUID? = null,
	val accountId: Int? = null,
	val storyStatusId: Int? = null,
	val wordCount: Int? = null,
	val dateCreated: OffsetDateTime? = null,
	val dateModified: OffsetDateTime? = null,
	val dateArchived: OffsetDateTime? = null,
	val title: String? = null,

	/**
	 * In English "The Last Jedi" becomes "Last Jedi, The"
	 */
	val titleSorted: String? = null,
	val summary: String? = null,
)

object StoryStatus {
	const val DRAFT = 0
	const val PUBLISHED = 1
	const val ARCHIVED = 2
	const val ABANDONED = 3
	const val HIDDEN = 4
}
