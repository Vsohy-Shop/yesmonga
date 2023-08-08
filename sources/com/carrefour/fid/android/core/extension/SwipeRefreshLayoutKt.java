package com.carrefour.fid.android.core.extension;

import androidx.annotation.C0349j;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class SwipeRefreshLayoutKt {
    @C0349j
    /* renamed from: c */
    public static final SwipeRefreshLayout.C20521j m148923c(C12074o0 o0Var, C11300l<? super C11079d2, C11079d2> lVar) {
        return new C36312j(o0Var, lVar);
    }

    /* renamed from: d */
    public static final void m148924d(C12074o0 o0Var, C11300l lVar) {
        Intrinsics.checkNotNullParameter(o0Var, "$scope");
        Intrinsics.checkNotNullParameter(lVar, "$emitter");
        if (C12079p0.m48270k(o0Var)) {
            lVar.invoke(C11079d2.f28267a);
        }
    }

    @C0349j
    @C12579k
    /* renamed from: e */
    public static final C11907e<C11079d2> m148925e(@C12579k SwipeRefreshLayout swipeRefreshLayout) {
        Intrinsics.checkNotNullParameter(swipeRefreshLayout, "<this>");
        return C11909g.m47500w(new SwipeRefreshLayoutKt$refreshes$1(swipeRefreshLayout, (C11045c<? super SwipeRefreshLayoutKt$refreshes$1>) null));
    }
}
