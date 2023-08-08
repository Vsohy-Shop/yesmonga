package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1 */
public final class CouponsListFragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CouponsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListFragment$onCreateView$1$1(CouponsListFragment couponsListFragment) {
        super(2);
        this.this$0 = couponsListFragment;
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
                ComposerKt.m29845w0(-382203069, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment.onCreateView.<anonymous>.<anonymous> (CouponsListFragment.kt:75)");
            }
            final CouponsListFragment couponsListFragment = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 549424262, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
                    r1 = (r1 = r1.mo58069i()).mo57649i(com.carrefour.fid.android.presentation.p035ui.coupons.filter.C23812d.f59917a);
                 */
                @androidx.compose.runtime.C8540g
                @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23) {
                    /*
                        r21 = this;
                        r0 = r21
                        r1 = r23
                        r2 = r1 & 11
                        r3 = 2
                        if (r2 != r3) goto L_0x0015
                        boolean r2 = r22.mo15011p()
                        if (r2 != 0) goto L_0x0010
                        goto L_0x0015
                    L_0x0010:
                        r22.mo14958a0()
                        goto L_0x00d1
                    L_0x0015:
                        boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r2 == 0) goto L_0x0024
                        r2 = -1
                        java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (CouponsListFragment.kt:76)"
                        r4 = 549424262(0x20bf8c86, float:3.244965E-19)
                        androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
                    L_0x0024:
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        androidx.navigation.NavController r1 = androidx.navigation.fragment.C19736g.m91827a(r1)
                        androidx.navigation.NavBackStackEntry r1 = r1.mo58099G()
                        if (r1 == 0) goto L_0x0053
                        androidx.lifecycle.p0 r1 = r1.mo58069i()
                        if (r1 == 0) goto L_0x0053
                        java.lang.String r2 = "details"
                        androidx.lifecycle.g0 r1 = r1.mo57649i(r2)
                        if (r1 == 0) goto L_0x0053
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r2 = r0
                        androidx.lifecycle.w r2 = r2.getViewLifecycleOwner()
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$1 r3 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$1
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r4 = r0
                        r3.<init>(r4)
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$a r4 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$a
                        r4.<init>(r3)
                        r1.mo57491k(r2, r4)
                    L_0x0053:
                        r5 = 0
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        com.carrefour.fid.android.presentation.ui.coupons.analytics.a r6 = r1.mo69758O0()
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        com.carrefour.fid.android.performance.b r7 = r1.mo69759P0()
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        androidx.navigation.NavController r1 = androidx.navigation.fragment.C19736g.m91827a(r1)
                        androidx.navigation.NavBackStackEntry r1 = r1.mo58099G()
                        if (r1 == 0) goto L_0x0081
                        androidx.lifecycle.p0 r1 = r1.mo58069i()
                        if (r1 == 0) goto L_0x0081
                        java.lang.String r2 = "filters"
                        androidx.lifecycle.g0 r1 = r1.mo57649i(r2)
                        if (r1 == 0) goto L_0x0081
                        java.lang.Object r1 = r1.mo4610f()
                        com.carrefour.fid.android.presentation.models.FilterResult r1 = (com.carrefour.fid.android.presentation.models.FilterResult) r1
                        goto L_0x0082
                    L_0x0081:
                        r1 = 0
                    L_0x0082:
                        r8 = r1
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        androidx.lifecycle.g0 r9 = r1.f59949x
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$2 r10 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$2
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        r10.<init>(r1)
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$3 r11 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$3
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        r11.<init>(r1)
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$4 r12 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$4
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        r12.<init>(r1)
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$5 r13 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$5
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        r13.<init>(r1)
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$6 r14 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$6
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        r14.<init>(r1)
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$7 r15 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$7
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r1 = r0
                        r15.<init>(r1)
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$8 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$onCreateView$1$1$1$8
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment r2 = r0
                        r1.<init>(r2)
                        r18 = 37376(0x9200, float:5.2375E-41)
                        r19 = 0
                        r20 = 1
                        r16 = r1
                        r17 = r22
                        com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt.m105534a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                        boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r1 == 0) goto L_0x00d1
                        androidx.compose.runtime.ComposerKt.m29843v0()
                    L_0x00d1:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListFragment$onCreateView$1$1.C238201.invoke(androidx.compose.runtime.o, int):void");
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
