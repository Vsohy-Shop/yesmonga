package com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.hilt.navigation.compose.C19298a;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.compose.C19490c;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OrderOnlineFragment$onCreateView$view$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ OrderOnlineFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineFragment$onCreateView$view$1$1(OrderOnlineFragment orderOnlineFragment) {
        super(2);
        this.this$0 = orderOnlineFragment;
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
                ComposerKt.m29845w0(-422380795, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.OrderOnlineFragment.onCreateView.<anonymous>.<anonymous> (OrderOnlineFragment.kt:49)");
            }
            final OrderOnlineFragment orderOnlineFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 222469768, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(222469768, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.OrderOnlineFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (OrderOnlineFragment.kt:50)");
                        }
                        oVar.mo14918M(-550968255);
                        C19395b1 a = LocalViewModelStoreOwner.f49869a.mo57681a(oVar, 8);
                        if (a != null) {
                            C19502x0.C19506b a2 = C19298a.m90444a(a, oVar, 8);
                            oVar.mo14918M(564614654);
                            C19476v0 f = C19490c.m90838f(OrderOnlineViewModel.class, a, (String) null, a2, oVar, 4168, 0);
                            oVar.mo15002m0();
                            oVar.mo15002m0();
                            C27052b Y0 = orderOnlineFragment.mo78593Y0();
                            final OrderOnlineFragment orderOnlineFragment = orderOnlineFragment;
                            C270601 r2 = new C11305q<String, OrderType, Boolean, C11079d2>() {
                                /* renamed from: a */
                                public final void mo78609a(@C12579k String str, @C12579k OrderType orderType, boolean z) {
                                    Intrinsics.checkNotNullParameter(str, "orderId");
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    orderOnlineFragment.mo78598d1(str, orderType, z);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    mo78609a((String) obj, (OrderType) obj2, ((Boolean) obj3).booleanValue());
                                    return C11079d2.f28267a;
                                }
                            };
                            final OrderOnlineFragment orderOnlineFragment2 = orderOnlineFragment;
                            C270612 r3 = new C11300l<String, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((String) obj);
                                    return C11079d2.f28267a;
                                }

                                public final void invoke(@C12579k String str) {
                                    Intrinsics.checkNotNullParameter(str, "it");
                                    orderOnlineFragment2.mo78595a1(str);
                                }
                            };
                            final OrderOnlineFragment orderOnlineFragment3 = orderOnlineFragment;
                            C270623 r4 = new C11305q<String, OrderType, String, C11079d2>() {
                                /* renamed from: a */
                                public final void mo78611a(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
                                    Intrinsics.checkNotNullParameter(str, "orderId");
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    Intrinsics.checkNotNullParameter(str2, "facilityStoreId");
                                    orderOnlineFragment3.mo78599e1(str, orderType, str2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    mo78611a((String) obj, (OrderType) obj2, (String) obj3);
                                    return C11079d2.f28267a;
                                }
                            };
                            final OrderOnlineFragment orderOnlineFragment4 = orderOnlineFragment;
                            C270634 r5 = new C11300l<String, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((String) obj);
                                    return C11079d2.f28267a;
                                }

                                public final void invoke(@C12579k String str) {
                                    Intrinsics.checkNotNullParameter(str, "it");
                                    orderOnlineFragment4.mo78603h1(str);
                                }
                            };
                            final OrderOnlineFragment orderOnlineFragment5 = orderOnlineFragment;
                            C270645 r6 = new C11300l<String, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((String) obj);
                                    return C11079d2.f28267a;
                                }

                                public final void invoke(@C12579k String str) {
                                    Intrinsics.checkNotNullParameter(str, "it");
                                    orderOnlineFragment5.mo78596b1(str);
                                }
                            };
                            final OrderOnlineFragment orderOnlineFragment6 = orderOnlineFragment;
                            C270656 r7 = new C11300l<String, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((String) obj);
                                    return C11079d2.f28267a;
                                }

                                public final void invoke(@C12579k String str) {
                                    Intrinsics.checkNotNullParameter(str, "it");
                                    orderOnlineFragment6.mo78600f1(str);
                                }
                            };
                            final OrderOnlineFragment orderOnlineFragment7 = orderOnlineFragment;
                            C270667 r8 = new C11289a<C11079d2>() {
                                public final void invoke() {
                                    orderOnlineFragment7.mo78597c1();
                                }
                            };
                            final OrderOnlineFragment orderOnlineFragment8 = orderOnlineFragment;
                            OrderOnlineScreenKt.m114523l((OrderOnlineViewModel) f, Y0, r2, r3, r4, r5, r6, r7, r8, new C11289a<C11079d2>() {
                                public final void invoke() {
                                    orderOnlineFragment8.mo78601g1();
                                }
                            }, oVar, 8);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
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
