package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.d */
public final class C2595d implements LazyLayoutIntervalContent {
    @C12580l

    /* renamed from: a */
    public final C11300l<Integer, Object> f6861a;
    @C12579k

    /* renamed from: b */
    public final C11300l<Integer, Object> f6862b;
    @C12580l

    /* renamed from: c */
    public final C11300l<Integer, C2617v> f6863c;
    @C12579k

    /* renamed from: d */
    public final C11306r<C2598g, Integer, C8592o, Integer, C11079d2> f6864d;

    public C2595d(@C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12580l C11300l<? super Integer, C2617v> lVar3, @C12579k C11306r<? super C2598g, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(lVar2, "type");
        Intrinsics.checkNotNullParameter(rVar, "item");
        this.f6861a = lVar;
        this.f6862b = lVar2;
        this.f6863c = lVar3;
        this.f6864d = rVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11306r<C2598g, Integer, C8592o, Integer, C11079d2> mo8950a() {
        return this.f6864d;
    }

    @C12580l
    /* renamed from: b */
    public final C11300l<Integer, C2617v> mo8951b() {
        return this.f6863c;
    }

    @C12580l
    public C11300l<Integer, Object> getKey() {
        return this.f6861a;
    }

    @C12579k
    public C11300l<Integer, Object> getType() {
        return this.f6862b;
    }
}
