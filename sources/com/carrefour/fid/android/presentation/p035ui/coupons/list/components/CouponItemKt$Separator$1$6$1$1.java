package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponItemKt$Separator$1$6$1$1 */
public final class CouponItemKt$Separator$1$6$1$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ long $borderColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponItemKt$Separator$1$6$1$1(long j) {
        super(1);
        this.$borderColor = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$Canvas");
        C15187e.m65724z2(eVar2, this.$borderColor, -90.0f, -180.0f, false, 0, 0, 0.0f, new C15198m(2.0f, 0.0f, 0, 0, (C15242j3) null, 30, (DefaultConstructorMarker) null), (C15249k2) null, 0, 880, (Object) null);
    }
}
