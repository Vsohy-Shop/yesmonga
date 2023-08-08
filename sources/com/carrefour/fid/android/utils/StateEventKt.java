package com.carrefour.fid.android.utils;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11945o;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class StateEventKt {
    @C12579k
    /* renamed from: a */
    public static final <T> C11911i<C22719n<T>> m102780a(int i, int i2, @C12579k BufferOverflow bufferOverflow) {
        Intrinsics.checkNotNullParameter(bufferOverflow, "onBufferOverflow");
        return C11945o.m47609a(i, i2, bufferOverflow);
    }

    /* renamed from: b */
    public static /* synthetic */ C11911i m102781b(int i, int i2, BufferOverflow bufferOverflow, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return m102780a(i, i2, bufferOverflow);
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C11940j<C22719n<T>> m102782c(T t) {
        return C11953v.m47628a(new C22719n(t));
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C11944n<C22719n<T>> m102783d(@C12579k C11911i<C22719n<T>> iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return C11909g.m47467l(iVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11952u<C22719n<T>> m102784e(@C12579k C11940j<C22719n<T>> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return C11909g.m47470m(jVar);
    }

    @C12580l
    /* renamed from: f */
    public static final <T> Object m102785f(@C12579k C11907e<? extends C22719n<? extends T>> eVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = eVar.collect(new StateEventKt$collectEvent$2(pVar), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public static final <T> Object m102786g(@C12579k C11911i<C22719n<T>> iVar, T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object emit = iVar.emit(new C22719n(t), cVar);
        return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: h */
    public static final <T> Object m102787h(@C12579k C11940j<C22719n<T>> jVar, T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object emit = jVar.emit(new C22719n(t), cVar);
        return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
    }

    /* renamed from: i */
    public static final <T> boolean m102788i(@C12579k C11911i<C22719n<T>> iVar, T t) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.mo24198a(new C22719n(t));
    }

    /* renamed from: j */
    public static final <T> boolean m102789j(@C12579k C11940j<C22719n<T>> jVar, T t) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return jVar.mo24198a(new C22719n(t));
    }
}
