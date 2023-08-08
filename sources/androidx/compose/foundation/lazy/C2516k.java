package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.k */
public final class C2516k implements LazyLayoutIntervalContent {
    @C12580l

    /* renamed from: a */
    public final C11300l<Integer, Object> f6678a;
    @C12579k

    /* renamed from: b */
    public final C11300l<Integer, Object> f6679b;
    @C12579k

    /* renamed from: c */
    public final C11306r<C2455e, Integer, C8592o, Integer, C11079d2> f6680c;

    public C2516k(@C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12579k C11306r<? super C2455e, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(lVar2, "type");
        Intrinsics.checkNotNullParameter(rVar, "item");
        this.f6678a = lVar;
        this.f6679b = lVar2;
        this.f6680c = rVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11306r<C2455e, Integer, C8592o, Integer, C11079d2> mo8649a() {
        return this.f6680c;
    }

    @C12580l
    public C11300l<Integer, Object> getKey() {
        return this.f6678a;
    }

    @C12579k
    public C11300l<Integer, Object> getType() {
        return this.f6679b;
    }
}
