package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.CheckoutStep1FooterStatefulKt;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26916f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneBottomSheetFragment$onViewCreated$1 */
public final class CheckoutStepOneBottomSheetFragment$onViewCreated$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CheckoutStepOneBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepOneBottomSheetFragment$onViewCreated$1(CheckoutStepOneBottomSheetFragment checkoutStepOneBottomSheetFragment) {
        super(2);
        this.this$0 = checkoutStepOneBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-216484067, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneBottomSheetFragment.onViewCreated.<anonymous> (CheckoutStepOneBottomSheetFragment.kt:48)");
            }
            final CheckoutStepOneBottomSheetFragment checkoutStepOneBottomSheetFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -414620422, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-414620422, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneBottomSheetFragment.onViewCreated.<anonymous>.<anonymous> (CheckoutStepOneBottomSheetFragment.kt:49)");
                        }
                        CheckoutStepOneAdditionalOrderViewModel S0 = checkoutStepOneBottomSheetFragment.mo72909T0();
                        final CheckoutStepOneBottomSheetFragment checkoutStepOneBottomSheetFragment = checkoutStepOneBottomSheetFragment;
                        CheckoutStep1FooterStatefulKt.m103945a(S0, new C11289a<C11079d2>() {
                            public final void invoke() {
                                checkoutStepOneBottomSheetFragment.mo72909T0().sendIntent(C26916f.C26932c.C26943k.f65620a);
                            }
                        }, checkoutStepOneBottomSheetFragment.f61871g, oVar, 520, 0);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
