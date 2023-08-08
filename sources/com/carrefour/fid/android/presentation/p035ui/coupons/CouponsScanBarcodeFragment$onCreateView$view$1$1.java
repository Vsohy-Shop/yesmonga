package com.carrefour.fid.android.presentation.p035ui.coupons;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19499w;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.analytics.C38364e;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.ScanBarcodeStatefulKt;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.CouponsScanBarcodeFragment$onCreateView$view$1$1 */
public final class CouponsScanBarcodeFragment$onCreateView$view$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CouponsScanBarcodeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsScanBarcodeFragment$onCreateView$view$1$1(CouponsScanBarcodeFragment couponsScanBarcodeFragment) {
        super(2);
        this.this$0 = couponsScanBarcodeFragment;
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
                ComposerKt.m29845w0(1964306481, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.CouponsScanBarcodeFragment.onCreateView.<anonymous>.<anonymous> (CouponsScanBarcodeFragment.kt:29)");
            }
            final CouponsScanBarcodeFragment couponsScanBarcodeFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 666224308, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(666224308, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.CouponsScanBarcodeFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CouponsScanBarcodeFragment.kt:30)");
                        }
                        C38364e J0 = couponsScanBarcodeFragment.mo69664J0();
                        C19499w viewLifecycleOwner = couponsScanBarcodeFragment.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
                        final CouponsScanBarcodeFragment couponsScanBarcodeFragment = couponsScanBarcodeFragment;
                        C237831 r6 = new C11300l<Boolean, C11079d2>() {
                            /* renamed from: a */
                            public final void mo69669a(boolean z) {
                                C19736g.m91827a(couponsScanBarcodeFragment).mo58156s0();
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                mo69669a(((Boolean) obj).booleanValue());
                                return C11079d2.f28267a;
                            }
                        };
                        FragmentManager childFragmentManager = couponsScanBarcodeFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                        ScanBarcodeStatefulKt.m105873e((ScanBarcodeViewModel) null, J0, viewLifecycleOwner, r6, childFragmentManager, couponsScanBarcodeFragment.mo69665K0().mo69693e().mo121437y(), oVar, 295488, 1);
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
