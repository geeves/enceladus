package io.soulglo.enceladus.story

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class StoryController {

	companion object {
		const val CHAPTER_ONE = 1
	}

	@GetMapping("/story/{storyId: [0-9]+}/{chapterNumber: [0-9]+}")
	fun storyChapter(
		model: Model?,
		@PathVariable("storyId") storyId: Int,
		@PathVariable("chapterNumber") chapterNumber: Int
	): String {

		return "read"
	}

	@GetMapping("/story/{storyId: [0-9]+}")
	fun story(
		model: Model?,
		@PathVariable("storyId") storyId: Int
	): String {

		return "read"
	}

	@GetMapping("/story/{storyId: [0-9]+}/{chapterNumber: [0-9]+}/{chapterName}")
	fun storyChapterName(
		model: Model?,
		@PathVariable("storyId") storyId: Int,
		@PathVariable("chapterNumber") chapterNumber: Int,
		@PathVariable("chapterName") chapterName: String?
	): String {
		model?.addAttribute("storyId", storyId)
		model?.addAttribute("chapterNumber", chapterNumber)
		model?.addAttribute("chapterName", chapterName)
		return "read"
	}

}
