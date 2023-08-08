package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.CheckoutStep2ScreenKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.CheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics.C26092a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep2Fragment$onCreateView$1$1 */
public final class CheckoutStep2Fragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CheckoutStep2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2Fragment$onCreateView$1$1(CheckoutStep2Fragment checkoutStep2Fragment) {
        super(2);
        this.this$0 = checkoutStep2Fragment;
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
                ComposerKt.m29845w0(554837003, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep2Fragment.onCreateView.<anonymous>.<anonymous> (CheckoutStep2Fragment.kt:34)");
            }
            final CheckoutStep2Fragment checkoutStep2Fragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 585988072, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(585988072, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep2Fragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CheckoutStep2Fragment.kt:35)");
                        }
                        CheckoutStep2ViewModel J0 = checkoutStep2Fragment.mo68217L0();
                        C26092a t0 = checkoutStep2Fragment.mo68217L0().mo75761t0();
                        final CheckoutStep2Fragment checkoutStep2Fragment = checkoutStep2Fragment;
                        C232891 r2 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                checkoutStep2Fragment.requireActivity().onBackPressed();
                            }
                        };
                        final CheckoutStep2Fragment checkoutStep2Fragment2 = checkoutStep2Fragment;
                        C232902 r3 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                checkoutStep2Fragment2.requireActivity().onBackPressed();
                            }
                        };
                        final CheckoutStep2Fragment checkoutStep2Fragment3 = checkoutStep2Fragment;
                        CheckoutStep2ScreenKt.m104365b(J0, t0, r2, r3, new C11300l<Boolean, C11079d2>() {
                            /* renamed from: a */
                            public final void mo68224a(boolean z) {
                                CheckoutStep2Fragment checkoutStep2Fragment = checkoutStep2Fragment3;
                                FragmentKt.m118823k(checkoutStep2Fragment, C23371l.f59175a.mo68483a(Intrinsics.areEqual((Object) checkoutStep2Fragment.mo68216K0().mo68463i(), (Object) BasketSlotBookedMessageType.NoneBecauseOfExpressPickup.f96700a), checkoutStep2Fragment3.mo68216K0().mo68464j(), z, checkoutStep2Fragment3.mo68216K0().mo68465k()));
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo68224a(((Boolean) obj).booleanValue());
                                return C11079d2.f28267a;
                            }
                        }, oVar, 72);
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
