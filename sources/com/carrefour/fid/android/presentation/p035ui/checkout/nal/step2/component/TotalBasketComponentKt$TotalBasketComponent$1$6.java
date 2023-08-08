package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
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
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTotalBasketComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalBasketComponentKt$TotalBasketComponent$1$6\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,208:1\n76#2:209\n*S KotlinDebug\n*F\n+ 1 TotalBasketComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalBasketComponentKt$TotalBasketComponent$1$6\n*L\n132#1:209\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalBasketComponentKt$TotalBasketComponent$1$6 */
public final class TotalBasketComponentKt$TotalBasketComponent$1$6 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ BasketAmounts $basketAmount;
    final /* synthetic */ int $nbItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TotalBasketComponentKt$TotalBasketComponent$1$6(int i, BasketAmounts basketAmounts) {
        super(2);
        this.$nbItems = i;
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
                ComposerKt.m29845w0(1839058444, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalBasketComponent.<anonymous>.<anonymous> (TotalBasketComponent.kt:128)");
            }
            Resources resources = ((Context) oVar2.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getResources();
            int i3 = this.$nbItems;
            String quantityString = resources.getQuantityString(R.plurals.basket_total_articles, i3, new Object[]{Integer.valueOf(i3)});
            C7933t0 t0Var = C7933t0.f19075a;
            int i4 = C7933t0.f19076b;
            C16361p0 k = t0Var.mo11077c(oVar2, i4).mo11098k();
            C37475b bVar = C37475b.f94185a;
            long B = bVar.mo114205B();
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(\n     …nbItems\n                )");
            C8592o oVar3 = oVar;
            TextKt.m14196c(quantityString, (C8767m) null, B, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, k, oVar3, 0, 0, 65530);
            TextKt.m14196c(C28782t.m119105b(Double.valueOf(this.$basketAmount.mo116868D())), (C8767m) null, bVar.mo114205B(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar, i4).mo11098k(), oVar3, 0, 0, 65530);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
