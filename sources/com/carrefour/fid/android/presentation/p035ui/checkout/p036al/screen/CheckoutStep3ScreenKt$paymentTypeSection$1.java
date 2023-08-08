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
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep3Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$paymentTypeSection$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,650:1\n154#2:651\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep3ScreenKt$paymentTypeSection$1\n*L\n316#1:651\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$paymentTypeSection$1 */
public final class CheckoutStep3ScreenKt$paymentTypeSection$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnline;
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnsite;
    final /* synthetic */ PaymentType $paymentType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$paymentTypeSection$1(PaymentType paymentType, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        super(3);
        this.$paymentType = paymentType;
        this.$onChoiceOnline = aVar;
        this.$onChoiceOnsite = aVar2;
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
                ComposerKt.m29845w0(919895845, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.paymentTypeSection.<anonymous> (CheckoutStep3Screen.kt:312)");
            }
            boolean z = false;
            BlockDividerKt.m104587a(oVar, 0);
            C8767m k = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16));
            if (this.$paymentType == PaymentType.Online) {
                z = true;
            }
            CheckoutStep3ScreenKt.m104428t(k, z, this.$onChoiceOnline, this.$onChoiceOnsite, oVar, 6, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
