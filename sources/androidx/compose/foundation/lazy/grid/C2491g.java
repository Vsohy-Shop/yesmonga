package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.grid.g */
public final class C2491g implements LazyLayoutIntervalContent {
    @C12580l

    /* renamed from: a */
    public final C11300l<Integer, Object> f6596a;
    @C12579k

    /* renamed from: b */
    public final C11304p<C2497l, Integer, C2488d> f6597b;
    @C12579k

    /* renamed from: c */
    public final C11300l<Integer, Object> f6598c;
    @C12579k

    /* renamed from: d */
    public final C11306r<C2496k, Integer, C8592o, Integer, C11079d2> f6599d;

    public C2491g(@C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11304p<? super C2497l, ? super Integer, C2488d> pVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12579k C11306r<? super C2496k, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(pVar, "span");
        Intrinsics.checkNotNullParameter(lVar2, "type");
        Intrinsics.checkNotNullParameter(rVar, "item");
        this.f6596a = lVar;
        this.f6597b = pVar;
        this.f6598c = lVar2;
        this.f6599d = rVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11306r<C2496k, Integer, C8592o, Integer, C11079d2> mo8577a() {
        return this.f6599d;
    }

    @C12579k
    /* renamed from: b */
    public final C11304p<C2497l, Integer, C2488d> mo8578b() {
        return this.f6597b;
    }

    @C12580l
    public C11300l<Integer, Object> getKey() {
        return this.f6596a;
    }

    @C12579k
    public C11300l<Integer, Object> getType() {
        return this.f6598c;
    }
}
