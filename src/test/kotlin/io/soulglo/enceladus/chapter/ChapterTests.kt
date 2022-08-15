package io.soulglo.enceladus.chapter

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class ChapterTests {

	@Test
	fun test_ChapterStatus() {
		assertEquals(1, ChapterStatus.PUBLISHED)
		assertEquals(2, ChapterStatus.IN_REVISION)
	}

	@Test
	fun test_titleSort() {
		val chapter: Chapter = Chapter(
			title="The Last Jedi",
			storyId=1,
			accountId=1
		)

		assertEquals("Last Jedi, The", chapter.titleSort)
		assertEquals(1, chapter.storyId)
		assertEquals(1, chapter.accountId)
	}

	@Test
	fun test_thenWorks() {
		val chapter: Chapter = Chapter(title="Then There Were Two", storyId=1, accountId=1)

		assertEquals("Then There Were Two", chapter.titleSort)
	}

	@Test
	fun test_noTitle() {
		val chapter: Chapter = Chapter(storyId=1, accountId=1)

		assertNull(chapter.titleSort)
		assertEquals(1, chapter.storyId)
		assertEquals(1, chapter.accountId)
	}

}
