package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.FidelityComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep3Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$loyaltySection$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,650:1\n154#2:651\n36#3:652\n1114#4,6:653\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$loyaltySection$1\n*L\n336#1:651\n341#1:652\n341#1:653,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$loyaltySection$1 */
public final class CheckoutStep3ScreenKt$loyaltySection$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ C26132a $loyaltyState;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onUseAllLoyaltyChanged;
    final /* synthetic */ C11300l<Double, C11079d2> $onValidateLoyaltyAmount;
    final /* synthetic */ PaymentType $paymentType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$loyaltySection$1(C26132a aVar, PaymentType paymentType, C11300l<? super Boolean, C11079d2> lVar, C11300l<? super Double, C11079d2> lVar2) {
        super(3);
        this.$loyaltyState = aVar;
        this.$paymentType = paymentType;
        this.$onUseAllLoyaltyChanged = lVar;
        this.$onValidateLoyaltyAmount = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "$this$item");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1892430047, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.loyaltySection.<anonymous> (CheckoutStep3Screen.kt:331)");
            }
            if (this.$loyaltyState.mo75919m() && this.$loyaltyState.mo75916j() > 0.0d && this.$paymentType == PaymentType.Online) {
                BlockDividerKt.m104587a(oVar, 0);
                C8767m k = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16));
                String k2 = this.$loyaltyState.mo75917k();
                String valueOf = String.valueOf(this.$loyaltyState.mo75916j());
                boolean n = this.$loyaltyState.mo75920n();
                double i2 = this.$loyaltyState.mo75915i();
                boolean l = this.$loyaltyState.mo75918l();
                C11300l<Boolean, C11079d2> lVar = this.$onUseAllLoyaltyChanged;
                C11300l<Double, C11079d2> lVar2 = this.$onValidateLoyaltyAmount;
                oVar.mo14918M(1157296644);
                boolean n0 = oVar.mo15006n0(lVar2);
                Object N = oVar.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new CheckoutStep3ScreenKt$loyaltySection$1$1$1(lVar2);
                    oVar.mo14893C(N);
                }
                oVar.mo15002m0();
                FidelityComponentKt.m104622b(k, k2, valueOf, n, l, i2, lVar, (C11300l) N, oVar, 6, 0);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
