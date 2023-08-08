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
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.label.LabelTextComponentKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.LoyaltyAmountComponentKt$LoyaltyAmountComponent$1 */
public final class LoyaltyAmountComponentKt$LoyaltyAmountComponent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ double $loyaltyAmount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyAmountComponentKt$LoyaltyAmountComponent$1(double d) {
        super(2);
        this.$loyaltyAmount = d;
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
                ComposerKt.m29845w0(344471255, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.component.LoyaltyAmountComponent.<anonymous> (LoyaltyAmountComponent.kt:23)");
            }
            String d = C16018i.m71858d(R.string.checkout_your_fid_on_card_text, oVar2, 0);
            C16361p0 b = C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b));
            long B = C37475b.f94185a.mo114205B();
            int f = C16432i.f40718b.mo47672f();
            TextKt.m14196c(d, (C8767m) null, B, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(f), 0, C16449r.f40760b.mo47728e(), false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, b, oVar, 0, 3120, 54778);
            C8592o oVar3 = oVar;
            LabelTextComponentKt.m151873b(C16018i.m71859e(R.string.checkout_your_fid_on_card_amount_text, new Object[]{C28782t.m119105b(Double.valueOf(this.$loyaltyAmount))}, oVar3, 64), (C8767m) null, oVar3, 0, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
