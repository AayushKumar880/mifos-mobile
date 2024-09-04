/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-mobile/blob/master/LICENSE.md
 */
package org.mifos.mobile.feature.transaction.utils

import org.mifos.mobile.core.model.entity.Transaction

internal sealed class RecentTransactionState {
    data object Loading : RecentTransactionState()
    data class Error(val message: String?) : RecentTransactionState()
    data class Success(
        val transactions: List<Transaction>,
        val canPaginate: Boolean,
    ) : RecentTransactionState()
}