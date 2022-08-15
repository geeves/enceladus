package io.soulglo.enceladus.account

import java.time.OffsetDateTime
import java.util.UUID

data class Account(
	val accountId: Int? = null,
	val id: UUID? = null,
	val emailAddress: String,
	val username: String? = null,
	val userpass: String? = null,
	val accountStatus: Int,
	val dateCreated: OffsetDateTime? = null,
	val dateLastLogin: OffsetDateTime? = null,
	val dateTokenExpires: OffsetDateTime? = null,
	val dateLocked: OffsetDateTime? = null,
	val dateProbationExpires: OffsetDateTime? = null,
)

object AccountStatus {

	const val ACTIVE = 1;
	const val PROBATION = 2;
	const val BANNED = 3;
	const val LOCKED = 4;
	const val RESET = 5;
	const val PENDING = 6;
	const val INVITED = 7;

}
