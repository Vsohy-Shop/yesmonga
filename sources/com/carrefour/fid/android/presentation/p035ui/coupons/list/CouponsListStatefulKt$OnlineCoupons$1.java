package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23843c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1 */
public final class CouponsListStatefulKt$OnlineCoupons$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;
    final /* synthetic */ List<CouponModel> $filteredCoupons;
    final /* synthetic */ List<String> $loadingButtonIds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$OnlineCoupons$1(C11300l<? super C23843c, C11079d2> lVar, List<CouponModel> list, List<String> list2, int i) {
        super(1);
        this.$actioner = lVar;
        this.$filteredCoupons = list;
        this.$loadingButtonIds = list2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        LazyListScope.m10824g(lazyListScope, "online_coupon_description", (Object) null, ComposableSingletons$CouponsListStatefulKt.f59939a.mo69754b(), 2, (Object) null);
        final List<CouponModel> list = this.$filteredCoupons;
        final List<String> list2 = this.$loadingButtonIds;
        final C11300l<C23843c, C11079d2> lVar = this.$actioner;
        final int i = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "online_coupons", (Object) null, C8553b.m31049c(2020396768, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: kotlin.jvm.functions.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: kotlin.jvm.functions.p} */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.compose.runtime.C8540g
            @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r13, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r14, int r15) {
                /*
                    r12 = this;
                    java.lang.String r0 = "$this$item"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                    r0 = r15 & 14
                    if (r0 != 0) goto L_0x0014
                    boolean r0 = r14.mo15006n0(r13)
                    if (r0 == 0) goto L_0x0011
                    r0 = 4
                    goto L_0x0012
                L_0x0011:
                    r0 = 2
                L_0x0012:
                    r0 = r0 | r15
                    goto L_0x0015
                L_0x0014:
                    r0 = r15
                L_0x0015:
                    r0 = r0 & 91
                    r1 = 18
                    if (r0 != r1) goto L_0x0027
                    boolean r0 = r14.mo15011p()
                    if (r0 != 0) goto L_0x0022
                    goto L_0x0027
                L_0x0022:
                    r14.mo14958a0()
                    goto L_0x00c5
                L_0x0027:
                    boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r0 == 0) goto L_0x0036
                    r0 = -1
                    java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.coupons.list.OnlineCoupons.<anonymous>.<anonymous> (CouponsListStateful.kt:472)"
                    r2 = 2020396768(0x786ccee0, float:1.9212156E34)
                    androidx.compose.runtime.ComposerKt.m29845w0(r2, r15, r0, r1)
                L_0x0036:
                    androidx.compose.ui.m$a r15 = androidx.compose.p004ui.C8767m.f23478j
                    r0 = 1
                    r1 = 0
                    r2 = 0
                    androidx.compose.ui.m r3 = androidx.compose.foundation.lazy.C2455e.m10931b(r13, r15, r2, r0, r1)
                    java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r4 = r1
                    java.util.List<java.lang.String> r5 = r2
                    r6 = 0
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r13 = r3
                    r15 = 1157296644(0x44faf204, float:2007.563)
                    r14.mo14918M(r15)
                    boolean r0 = r14.mo15006n0(r13)
                    java.lang.Object r1 = r14.mo14921N()
                    if (r0 != 0) goto L_0x005e
                    androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r0 = r0.mo16277a()
                    if (r1 != r0) goto L_0x0066
                L_0x005e:
                    com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$1$1 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$1$1
                    r1.<init>(r13)
                    r14.mo14893C(r1)
                L_0x0066:
                    r14.mo15002m0()
                    r7 = r1
                    kotlin.jvm.functions.l r7 = (kotlin.jvm.functions.C11300l) r7
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r13 = r3
                    r14.mo14918M(r15)
                    boolean r0 = r14.mo15006n0(r13)
                    java.lang.Object r1 = r14.mo14921N()
                    if (r0 != 0) goto L_0x0083
                    androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r0 = r0.mo16277a()
                    if (r1 != r0) goto L_0x008b
                L_0x0083:
                    com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$2$1 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$2$1
                    r1.<init>(r13)
                    r14.mo14893C(r1)
                L_0x008b:
                    r14.mo15002m0()
                    r8 = r1
                    kotlin.jvm.functions.l r8 = (kotlin.jvm.functions.C11300l) r8
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r13 = r3
                    r14.mo14918M(r15)
                    boolean r15 = r14.mo15006n0(r13)
                    java.lang.Object r0 = r14.mo14921N()
                    if (r15 != 0) goto L_0x00a8
                    androidx.compose.runtime.o$a r15 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r15 = r15.mo16277a()
                    if (r0 != r15) goto L_0x00b0
                L_0x00a8:
                    com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$3$1 r0 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1$1$3$1
                    r0.<init>(r13)
                    r14.mo14893C(r0)
                L_0x00b0:
                    r14.mo15002m0()
                    r9 = r0
                    kotlin.jvm.functions.p r9 = (kotlin.jvm.functions.C11304p) r9
                    r11 = 3648(0xe40, float:5.112E-42)
                    r10 = r14
                    com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponsFlowRowKt.m105650a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r13 == 0) goto L_0x00c5
                    androidx.compose.runtime.ComposerKt.m29843v0()
                L_0x00c5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt$OnlineCoupons$1.C238381.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
            }
        }), 2, (Object) null);
        this.$actioner.invoke(C23843c.C23859h.C23861b.f59987a);
    }
}
