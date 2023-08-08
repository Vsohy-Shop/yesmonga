package com.carrefour.fid.android.shared.util;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.channels.C11763t;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class DebounceKt {
    @C12579k
    /* renamed from: a */
    public static final <T> C11763t<T> m119481a(@C12579k C12074o0 o0Var, long j, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C11744g d = C11748i.m46625d(-1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new DebounceKt$debounce$1(C11909g.m47427a0(C11909g.m47490s1(d), j), lVar, (C11045c<? super DebounceKt$debounce$1>) null), 3, (Object) null);
        return d;
    }
}
