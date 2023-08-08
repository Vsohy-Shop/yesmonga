package com.urbanairship.android.layout.environment;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.environment.j */
public final class C35602j {
    @C12579k

    /* renamed from: a */
    public final C11744g<LayoutEvent> f88012a;
    @C12579k

    /* renamed from: b */
    public final C11944n<LayoutEvent> f88013b;

    public C35602j(@C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        C11744g<LayoutEvent> d = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f88012a = d;
        this.f88013b = FlowKt__ShareKt.m47164h(C11909g.m47490s1(d), o0Var, C11948r.f29534a.mo24272c(), 0, 4, (Object) null);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo106656a(@C12579k LayoutEvent layoutEvent, @C12579k C11045c<? super C11079d2> cVar) {
        Object h0 = this.f88012a.mo23757h0(layoutEvent, cVar);
        return h0 == C11063b.m42612h() ? h0 : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: b */
    public final C11944n<LayoutEvent> mo106657b() {
        return this.f88013b;
    }
}
