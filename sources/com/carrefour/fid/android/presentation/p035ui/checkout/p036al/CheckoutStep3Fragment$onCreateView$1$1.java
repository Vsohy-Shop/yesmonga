package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen.CheckoutStep3ScreenKt;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.event.C26122a;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3Fragment$onCreateView$1$1 */
public final class CheckoutStep3Fragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CheckoutStep3Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3Fragment$onCreateView$1$1(CheckoutStep3Fragment checkoutStep3Fragment) {
        super(2);
        this.this$0 = checkoutStep3Fragment;
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
                ComposerKt.m29845w0(1484455275, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3Fragment.onCreateView.<anonymous>.<anonymous> (CheckoutStep3Fragment.kt:72)");
            }
            final CheckoutStep3Fragment checkoutStep3Fragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1515606344, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1515606344, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3Fragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CheckoutStep3Fragment.kt:73)");
                        }
                        CheckoutStep3ViewModel J0 = checkoutStep3Fragment.mo68248O0();
                        boolean k = checkoutStep3Fragment.mo68246M0().mo68496k();
                        final CheckoutStep3Fragment checkoutStep3Fragment = checkoutStep3Fragment;
                        C233071 r2 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                checkoutStep3Fragment.requireActivity().onBackPressed();
                            }
                        };
                        final CheckoutStep3Fragment checkoutStep3Fragment2 = checkoutStep3Fragment;
                        C233082 r3 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                                C19736g.m91827a(checkoutStep3Fragment2).mo58142g0(C23380r.f59190a.mo68536a(str, new OtpOrigination.CheckoutStep3(checkoutStep3Fragment2.mo68246M0().mo68497l())));
                            }
                        };
                        final CheckoutStep3Fragment checkoutStep3Fragment3 = checkoutStep3Fragment;
                        C233093 r4 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
                                C19736g.m91827a(checkoutStep3Fragment3).mo58142g0(C23380r.f59190a.mo68540g(str, new OtpOrigination.CheckoutStep3(checkoutStep3Fragment3.mo68246M0().mo68497l())));
                            }
                        };
                        final CheckoutStep3Fragment checkoutStep3Fragment4 = checkoutStep3Fragment;
                        C233104 r5 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(checkoutStep3Fragment4, C23380r.f59190a.mo68537b());
                            }
                        };
                        final CheckoutStep3Fragment checkoutStep3Fragment5 = checkoutStep3Fragment;
                        C233115 r6 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                FragmentKt.m118823k(checkoutStep3Fragment5, C23380r.f59190a.mo68539e(true));
                            }
                        };
                        final CheckoutStep3Fragment checkoutStep3Fragment6 = checkoutStep3Fragment;
                        CheckoutStep3ScreenKt.m104411c(J0, k, r2, r3, r4, r5, r6, new C11300l<C26122a.C26126d, C11079d2>() {
                            /* renamed from: a */
                            public final void mo68259a(@C12579k C26122a.C26126d dVar) {
                                Intrinsics.checkNotNullParameter(dVar, "<name for destructuring parameter 0>");
                                PaymentConfirmationModel a = dVar.mo75892a();
                                String b = dVar.mo75893b();
                                if (a instanceof PaymentConfirmationModel.FullFidPayment) {
                                    checkoutStep3Fragment6.mo68249P0(((PaymentConfirmationModel.FullFidPayment) a).mo121787d(), b);
                                } else if (a instanceof PaymentConfirmationModel.SdpPayment) {
                                    checkoutStep3Fragment6.mo68250Q0(((PaymentConfirmationModel.SdpPayment) a).mo121799d(), b);
                                }
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo68259a((C26122a.C26126d) obj);
                                return C11079d2.f28267a;
                            }
                        }, oVar, 8);
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
