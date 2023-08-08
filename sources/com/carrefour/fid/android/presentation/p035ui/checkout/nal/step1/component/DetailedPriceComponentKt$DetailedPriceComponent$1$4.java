package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component;

import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
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
import com.carrefour.fid.android.design.components.compose.label.LabelTextComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.DetailedPriceComponentKt$DetailedPriceComponent$1$4 */
public final class DetailedPriceComponentKt$DetailedPriceComponent$1$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ BasketPromotionCode $promoCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetailedPriceComponentKt$DetailedPriceComponent$1$4(BasketPromotionCode basketPromotionCode) {
        super(2);
        this.$promoCode = basketPromotionCode;
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
                ComposerKt.m29845w0(-1600607706, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.DetailedPriceComponent.<anonymous>.<anonymous> (DetailedPriceComponent.kt:83)");
            }
            TextKt.m14196c(C16018i.m71858d(R.string.checkout_summary_list_promo_code, oVar2, 0), (C8767m) null, C37475b.f94185a.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b)), oVar, 0, 0, 65530);
            String b = C28782t.m119105b(Double.valueOf(this.$promoCode.mo116937e()));
            LabelTextComponentKt.m151875d("- " + b, (C8767m) null, oVar, 0, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
