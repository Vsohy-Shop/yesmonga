package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$1$3$1 */
public final class ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$1$3$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ float $dashWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemDeliveryFeePriceKt$ItemDeliveryFeePrice$1$3$1(float f) {
        super(1);
        this.$dashWidth = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$Canvas");
        long B = C37475b.f94185a.mo114205B();
        long a = C15096g.m64898a(0.0f, 0.0f);
        long a2 = C15096g.m64898a(C15104m.m65023t(eVar.mo42718b()), 0.0f);
        C15242j3.C15243a aVar = C15242j3.f37562a;
        float f = this.$dashWidth;
        C15187e.m65695K2(eVar2, B, a, a2, 0.0f, 0, aVar.mo42856c(new float[]{f, f / ((float) 2)}, 0.0f), 0.0f, (C15249k2) null, 0, 472, (Object) null);
    }
}
