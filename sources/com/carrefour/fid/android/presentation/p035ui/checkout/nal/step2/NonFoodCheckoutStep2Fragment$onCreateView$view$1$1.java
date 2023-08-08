package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.os.Bundle;
import androidx.autofill.C0861a;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment$onCreateView$view$1$1 */
public final class NonFoodCheckoutStep2Fragment$onCreateView$view$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ NonFoodCheckoutStep2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2Fragment$onCreateView$view$1$1(NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment) {
        super(2);
        this.this$0 = nonFoodCheckoutStep2Fragment;
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
                ComposerKt.m29845w0(848515063, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment.onCreateView.<anonymous>.<anonymous> (NonFoodCheckoutStep2Fragment.kt:51)");
            }
            final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1225802516, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1225802516, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (NonFoodCheckoutStep2Fragment.kt:52)");
                        }
                        NonFoodCheckoutStep2ViewModel Q0 = nonFoodCheckoutStep2Fragment.mo69073Q0();
                        C23614a N0 = nonFoodCheckoutStep2Fragment.mo69070N0();
                        C24603a P0 = nonFoodCheckoutStep2Fragment.mo69072P0();
                        C235771 r5 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment = nonFoodCheckoutStep2Fragment;
                        C235771 r1 = new C11304p<Bundle, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo69085a(@C12579k Bundle bundle, @C12579k String str) {
                                Intrinsics.checkNotNullParameter(bundle, "bundle");
                                Intrinsics.checkNotNullParameter(str, "subBasketId");
                                nonFoodCheckoutStep2Fragment.mo69076T0(bundle, str);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                mo69085a((Bundle) obj, (String) obj2);
                                return C11079d2.f28267a;
                            }
                        };
                        C235792 r6 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment2 = nonFoodCheckoutStep2Fragment;
                        C235792 r12 = new C11304p<Bundle, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo69087a(@C12579k Bundle bundle, @C12579k String str) {
                                Intrinsics.checkNotNullParameter(bundle, "bundle");
                                Intrinsics.checkNotNullParameter(str, "subBasketId");
                                nonFoodCheckoutStep2Fragment2.mo69075S0(bundle, str);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                mo69087a((Bundle) obj, (String) obj2);
                                return C11079d2.f28267a;
                            }
                        };
                        C235803 r7 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment3 = nonFoodCheckoutStep2Fragment;
                        C235803 r13 = new C11300l<Double, C11079d2>() {
                            /* renamed from: a */
                            public final void mo69088a(double d) {
                                nonFoodCheckoutStep2Fragment3.mo69077U0(d);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo69088a(((Number) obj).doubleValue());
                                return C11079d2.f28267a;
                            }
                        };
                        C235814 r8 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment4 = nonFoodCheckoutStep2Fragment;
                        C235814 r14 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                nonFoodCheckoutStep2Fragment4.mo69074R0();
                            }
                        };
                        C235825 r9 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment5 = nonFoodCheckoutStep2Fragment;
                        C235825 r15 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                nonFoodCheckoutStep2Fragment5.requireActivity().onBackPressed();
                            }
                        };
                        C235836 r10 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment6 = nonFoodCheckoutStep2Fragment;
                        C235836 r16 = new C11306r<Address, Address, AddressCategory, String, C11079d2>() {
                            /* renamed from: a */
                            public final void mo69089a(@C12579k Address address, @C12579k Address address2, @C12579k AddressCategory addressCategory, @C12579k String str) {
                                Intrinsics.checkNotNullParameter(address, "billingAddress");
                                Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
                                Intrinsics.checkNotNullParameter(addressCategory, "category");
                                Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
                                nonFoodCheckoutStep2Fragment6.mo69078V0(address, address2, addressCategory, str);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                mo69089a((Address) obj, (Address) obj2, (AddressCategory) obj3, (String) obj4);
                                return C11079d2.f28267a;
                            }
                        };
                        C235847 r11 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment7 = nonFoodCheckoutStep2Fragment;
                        C235847 r17 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                nonFoodCheckoutStep2Fragment7.getNavigator().mo83836l(C19736g.m91827a(nonFoodCheckoutStep2Fragment7));
                            }
                        };
                        C235858 r122 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment8 = nonFoodCheckoutStep2Fragment;
                        C235858 r18 = new C11289a<C11079d2>() {
                            public final void invoke() {
                                NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment = nonFoodCheckoutStep2Fragment8;
                                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                                String string = nonFoodCheckoutStep2Fragment.requireContext().getString(R.string.checkout_step2_promo_code_delete_error);
                                Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…_promo_code_delete_error)");
                                FragmentKt.m118811B(nonFoodCheckoutStep2Fragment, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                            }
                        };
                        C235869 r132 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment9 = nonFoodCheckoutStep2Fragment;
                        C235869 r19 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "loyaltyCard");
                                FragmentKt.m118823k(nonFoodCheckoutStep2Fragment9, C23660d.f59701a.mo69403b(str, new OtpOrigination.NonFoodCheckoutStep2(nonFoodCheckoutStep2Fragment9.mo69071O0().mo69213g())));
                            }
                        };
                        C2357810 r142 = r1;
                        final NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment10 = nonFoodCheckoutStep2Fragment;
                        C2357810 r110 = new C11300l<String, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((String) obj);
                                return C11079d2.f28267a;
                            }

                            public final void invoke(@C12579k String str) {
                                Intrinsics.checkNotNullParameter(str, "loyaltyCard");
                                FragmentKt.m118823k(nonFoodCheckoutStep2Fragment10, C23660d.f59701a.mo69402a(str, new OtpOrigination.NonFoodCheckoutStep2(nonFoodCheckoutStep2Fragment10.mo69071O0().mo69213g())));
                            }
                        };
                        NonFoodCheckoutStep2ScreenKt.m104881j(Q0, N0, P0, r5, r6, r7, r8, r9, r10, r11, r122, r132, r142, oVar, 8, 0, 0);
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
