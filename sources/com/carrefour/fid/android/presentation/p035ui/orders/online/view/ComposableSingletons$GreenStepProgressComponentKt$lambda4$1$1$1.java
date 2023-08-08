package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.ComposableSingletons$GreenStepProgressComponentKt$lambda-4$1$1$1  reason: invalid class name */
public final class ComposableSingletons$GreenStepProgressComponentKt$lambda4$1$1$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ C8700z0<Integer> $targetStep$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$GreenStepProgressComponentKt$lambda4$1$1$1(C8700z0<Integer> z0Var) {
        super(1);
        this.$targetStep$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        C8700z0<Integer> z0Var = this.$targetStep$delegate;
        for (int i = 0; i < 15; i++) {
            LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(225243819, true, new C25244x88fcf97a(z0Var)), 3, (Object) null);
        }
    }
}
