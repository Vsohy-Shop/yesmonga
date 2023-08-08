package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$CouponItem$1$2$1$1 */
public final class CouponItemKt$CouponItem$1$2$1$1 extends Lambda implements C11300l<C15588o, C11079d2> {
    final /* synthetic */ C8700z0<Float> $verticalSeparatorPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponItemKt$CouponItem$1$2$1$1(C8700z0<Float> z0Var) {
        super(1);
        this.$verticalSeparatorPosition = z0Var;
    }

    /* renamed from: a */
    public final void mo69882a(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "it");
        this.$verticalSeparatorPosition.setValue(Float.valueOf(C15094f.m64882r(C15591p.m69303e(oVar))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69882a((C15588o) obj);
        return C11079d2.f28267a;
    }
}
