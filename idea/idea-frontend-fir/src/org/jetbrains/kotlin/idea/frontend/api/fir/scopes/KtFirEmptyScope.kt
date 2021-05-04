/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.fir.scopes

import org.jetbrains.kotlin.idea.frontend.api.scopes.KtScope
import org.jetbrains.kotlin.idea.frontend.api.scopes.KtScopeNameFilter
import org.jetbrains.kotlin.idea.frontend.api.symbols.KtCallableSymbol
import org.jetbrains.kotlin.idea.frontend.api.symbols.KtClassifierSymbol
import org.jetbrains.kotlin.idea.frontend.api.symbols.KtConstructorSymbol
import org.jetbrains.kotlin.idea.frontend.api.tokens.ValidityToken
import org.jetbrains.kotlin.name.Name

internal class KtFirEmptyScope(override val token: ValidityToken) : KtScope {
    override fun getCallableNames(): Set<Name> = emptySet()

    override fun getClassifierNames(): Set<Name> = emptySet()

    override fun getCallableSymbols(nameFilter: KtScopeNameFilter): Sequence<KtCallableSymbol> =
        emptySequence()

    override fun getClassifierSymbols(nameFilter: KtScopeNameFilter): Sequence<KtClassifierSymbol> =
        emptySequence()

    override fun getConstructors(): Sequence<KtConstructorSymbol> =
        emptySequence()
}