package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.compose.C16591e;
import androidx.constraintlayout.compose.C16618o0;
import androidx.constraintlayout.compose.C16635z;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.Dimension;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTotalLoyaltyComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalLoyaltyComponentKt$TotalLoyaltyComponent$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,87:1\n154#2:88\n154#2:89\n154#2:90\n154#2:91\n*S KotlinDebug\n*F\n+ 1 TotalLoyaltyComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/TotalLoyaltyComponentKt$TotalLoyaltyComponent$1$1$1\n*L\n34#1:88\n35#1:89\n36#1:90\n37#1:91\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.TotalLoyaltyComponentKt$TotalLoyaltyComponent$1$1$1 */
public final class TotalLoyaltyComponentKt$TotalLoyaltyComponent$1$1$1 extends Lambda implements C11300l<ConstrainScope, C11079d2> {
    final /* synthetic */ C16591e $price;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TotalLoyaltyComponentKt$TotalLoyaltyComponent$1$1$1(C16591e eVar) {
        super(1);
        this.$price = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConstrainScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k ConstrainScope constrainScope) {
        Intrinsics.checkNotNullParameter(constrainScope, "$this$constrainAs");
        float f = (float) 16;
        C16635z.C16636a.m75678a(constrainScope.mo48169H(), constrainScope.mo48218x().mo48482n(), C16483g.m74435M(f), 0.0f, 4, (Object) null);
        C16635z.C16636a.m75678a(constrainScope.mo48213s(), constrainScope.mo48218x().mo48478g(), C16483g.m74435M(f), 0.0f, 4, (Object) null);
        C16618o0.C16619a.m75595a(constrainScope.mo48167F(), constrainScope.mo48218x().mo48481l(), C16483g.m74435M(f), 0.0f, 4, (Object) null);
        C16618o0.C16619a.m75595a(constrainScope.mo48214t(), this.$price.mo48481l(), C16483g.m74435M((float) 8), 0.0f, 4, (Object) null);
        constrainScope.mo48206l0(Dimension.f41160a.mo48363a());
    }
}
