package com.carrefour.fid.android.shared.extension;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.C11760r;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class BottomSheetBehaviorKt$addBottomSheetEvents$1$callBack$1 extends AdaptedFunctionReference implements C11300l<C28769n, C11079d2> {
    public BottomSheetBehaviorKt$addBottomSheetEvents$1$callBack$1(Object obj) {
        super(1, obj, C11760r.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8);
    }

    /* renamed from: b */
    public final void mo83661b(@C12579k C28769n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "p0");
        ((C11760r) this.receiver).mo23751L(nVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo83661b((C28769n) obj);
        return C11079d2.f28267a;
    }
}
