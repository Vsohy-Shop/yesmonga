package com.carrefour.fid.android.shared.extension;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.channels.C11760r;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class RecyclerViewKt$snapOnScrollChanges$1$callback$1 extends AdaptedFunctionReference implements C11300l<Integer, C11079d2> {
    public RecyclerViewKt$snapOnScrollChanges$1$callback$1(Object obj) {
        super(1, obj, C11760r.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8);
    }

    /* renamed from: b */
    public final void mo83708b(int i) {
        ((C11760r) this.receiver).mo23751L(Integer.valueOf(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo83708b(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
