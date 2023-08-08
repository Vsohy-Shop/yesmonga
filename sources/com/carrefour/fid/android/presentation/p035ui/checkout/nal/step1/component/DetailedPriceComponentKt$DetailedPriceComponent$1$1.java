package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.DetailedPriceComponentKt$DetailedPriceComponent$1$1 */
public final class DetailedPriceComponentKt$DetailedPriceComponent$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ BasketAmounts $basketAmount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetailedPriceComponentKt$DetailedPriceComponent$1$1(BasketAmounts basketAmounts) {
        super(2);
        this.$basketAmount = basketAmounts;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1007929005, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.DetailedPriceComponent.<anonymous>.<anonymous> (DetailedPriceComponent.kt:36)");
            }
            String d = C16018i.m71858d(R.string.checkout_basket_list_price_subamount, oVar2, 0);
            C7933t0 t0Var = C7933t0.f19075a;
            int i3 = C7933t0.f19076b;
            C16361p0 k = t0Var.mo11077c(oVar2, i3).mo11098k();
            C37475b bVar = C37475b.f94185a;
            C8592o oVar3 = oVar;
            TextKt.m14196c(d, (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, k, oVar3, 0, 0, 65530);
            TextKt.m14196c(C28782t.m119105b(Double.valueOf(this.$basketAmount.mo116892u())), (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar, i3).mo11098k(), oVar3, 0, 0, 65530);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
