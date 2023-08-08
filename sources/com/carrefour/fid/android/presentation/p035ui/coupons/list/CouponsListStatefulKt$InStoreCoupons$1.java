package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23843c;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CouponsSwitchActivateAllKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.ShowBarCodeKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1 */
public final class CouponsListStatefulKt$InStoreCoupons$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23843c, C11079d2> $actioner;
    final /* synthetic */ List<CouponModel> $coupons;
    final /* synthetic */ List<CouponModel> $filteredCoupons;
    final /* synthetic */ boolean $hasBurnedCoupons;
    final /* synthetic */ boolean $isButtonActivated;
    final /* synthetic */ List<String> $loadingButtonIds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$InStoreCoupons$1(List<CouponModel> list, C11300l<? super C23843c, C11079d2> lVar, List<CouponModel> list2, boolean z, int i, List<String> list3, boolean z2) {
        super(1);
        this.$coupons = list;
        this.$actioner = lVar;
        this.$filteredCoupons = list2;
        this.$hasBurnedCoupons = z;
        this.$$dirty = i;
        this.$loadingButtonIds = list3;
        this.$isButtonActivated = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final List<CouponModel> list = this.$filteredCoupons;
        final boolean z = this.$hasBurnedCoupons;
        final C11300l<C23843c, C11079d2> lVar = this.$actioner;
        final int i = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "in_store_coupons_availability_card", (Object) null, C8553b.m31049c(-1158925988, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.jvm.functions.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.compose.runtime.C8540g
            @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
                /*
                    r9 = this;
                    java.lang.String r0 = "$this$item"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                    r10 = r12 & 81
                    r0 = 16
                    if (r10 != r0) goto L_0x0017
                    boolean r10 = r11.mo15011p()
                    if (r10 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r11.mo14958a0()
                    goto L_0x00fa
                L_0x0017:
                    boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r10 == 0) goto L_0x0026
                    r10 = -1
                    java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.coupons.list.InStoreCoupons.<anonymous>.<anonymous> (CouponsListStateful.kt:372)"
                    r2 = -1158925988(0xffffffffbaec315c, float:-0.0018020081)
                    androidx.compose.runtime.ComposerKt.m29845w0(r2, r12, r10, r1)
                L_0x0026:
                    androidx.compose.ui.m$a r10 = androidx.compose.p004ui.C8767m.f23478j
                    float r12 = (float) r0
                    float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
                    androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r10, r12)
                    java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r10 = r1
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    boolean r12 = r10 instanceof java.util.Collection
                    r1 = 0
                    if (r12 == 0) goto L_0x0045
                    r12 = r10
                    java.util.Collection r12 = (java.util.Collection) r12
                    boolean r12 = r12.isEmpty()
                    if (r12 == 0) goto L_0x0045
                    r2 = r1
                    goto L_0x0065
                L_0x0045:
                    java.util.Iterator r10 = r10.iterator()
                    r12 = r1
                L_0x004a:
                    boolean r2 = r10.hasNext()
                    if (r2 == 0) goto L_0x0064
                    java.lang.Object r2 = r10.next()
                    com.carrefour.fid.android.presentation.models.CouponModel r2 = (com.carrefour.fid.android.presentation.models.CouponModel) r2
                    boolean r2 = r2.isSelected()
                    if (r2 == 0) goto L_0x004a
                    int r12 = r12 + 1
                    if (r12 >= 0) goto L_0x004a
                    kotlin.collections.CollectionsKt__CollectionsKt.m40458V()
                    goto L_0x004a
                L_0x0064:
                    r2 = r12
                L_0x0065:
                    java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r10 = r1
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    boolean r12 = r10 instanceof java.util.Collection
                    if (r12 == 0) goto L_0x0078
                    r12 = r10
                    java.util.Collection r12 = (java.util.Collection) r12
                    boolean r12 = r12.isEmpty()
                    if (r12 == 0) goto L_0x0078
                L_0x0076:
                    r3 = r1
                    goto L_0x0096
                L_0x0078:
                    java.util.Iterator r10 = r10.iterator()
                L_0x007c:
                    boolean r12 = r10.hasNext()
                    if (r12 == 0) goto L_0x0076
                    java.lang.Object r12 = r10.next()
                    com.carrefour.fid.android.presentation.models.CouponModel r12 = (com.carrefour.fid.android.presentation.models.CouponModel) r12
                    boolean r12 = r12.mo121385A()
                    if (r12 == 0) goto L_0x007c
                    int r1 = r1 + 1
                    if (r1 >= 0) goto L_0x007c
                    kotlin.collections.CollectionsKt__CollectionsKt.m40458V()
                    goto L_0x007c
                L_0x0096:
                    boolean r1 = r4
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r10 = r5
                    r12 = 1157296644(0x44faf204, float:2007.563)
                    r11.mo14918M(r12)
                    boolean r4 = r11.mo15006n0(r10)
                    java.lang.Object r5 = r11.mo14921N()
                    if (r4 != 0) goto L_0x00b2
                    androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r4 = r4.mo16277a()
                    if (r5 != r4) goto L_0x00ba
                L_0x00b2:
                    com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$1$3$1 r5 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$1$3$1
                    r5.<init>(r10)
                    r11.mo14893C(r5)
                L_0x00ba:
                    r11.mo15002m0()
                    r4 = r5
                    kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r10 = r5
                    r11.mo14918M(r12)
                    boolean r12 = r11.mo15006n0(r10)
                    java.lang.Object r5 = r11.mo14921N()
                    if (r12 != 0) goto L_0x00d7
                    androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r12 = r12.mo16277a()
                    if (r5 != r12) goto L_0x00df
                L_0x00d7:
                    com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$1$4$1 r5 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$1$4$1
                    r5.<init>(r10)
                    r11.mo14893C(r5)
                L_0x00df:
                    r11.mo15002m0()
                    kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
                    int r10 = r6
                    int r10 = r10 >> 9
                    r10 = r10 & 112(0x70, float:1.57E-43)
                    r7 = r10 | 6
                    r8 = 0
                    r6 = r11
                    com.carrefour.fid.android.presentation.p035ui.coupons.list.components.CardNumberOfActivatedCouponsKt.m105597a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r10 == 0) goto L_0x00fa
                    androidx.compose.runtime.ComposerKt.m29843v0()
                L_0x00fa:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1.C238341.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
            }
        }), 2, (Object) null);
        if (!this.$coupons.isEmpty()) {
            LazyListScope.m10824g(lazyListScope, "in_store_coupons_description", (Object) null, ComposableSingletons$CouponsListStatefulKt.f59939a.mo69753a(), 2, (Object) null);
            final List<CouponModel> list2 = this.$coupons;
            final List<String> list3 = this.$loadingButtonIds;
            final C11300l<C23843c, C11079d2> lVar2 = this.$actioner;
            final int i2 = this.$$dirty;
            LazyListScope lazyListScope2 = lazyListScope;
            LazyListScope.m10824g(lazyListScope2, "in_store_coupon_activate_all", (Object) null, C8553b.m31049c(-174392502, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(eVar, "$this$item");
                    if ((i & 81) != 16 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-174392502, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.InStoreCoupons.<anonymous>.<anonymous> (CouponsListStateful.kt:394)");
                        }
                        C8767m k = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16));
                        boolean z2 = false;
                        if (!list2.isEmpty()) {
                            Iterable iterable = list2;
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                Iterator it = iterable.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!((CouponModel) it.next()).isSelected()) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z = true;
                            if (z) {
                                z2 = true;
                            }
                        }
                        boolean z3 = !list3.isEmpty();
                        C11300l<C23843c, C11079d2> lVar = lVar2;
                        oVar.mo14918M(1157296644);
                        boolean n0 = oVar.mo15006n0(lVar);
                        Object N = oVar.mo14921N();
                        if (n0 || N == C8592o.f23032a.mo16277a()) {
                            N = new CouponsListStatefulKt$InStoreCoupons$1$2$2$1(lVar);
                            oVar.mo14893C(N);
                        }
                        oVar.mo15002m0();
                        CouponsSwitchActivateAllKt.m105654a(k, z2, z3, (C11300l) N, oVar, 6, 0);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), 2, (Object) null);
            final List<CouponModel> list4 = this.$filteredCoupons;
            final List<String> list5 = this.$loadingButtonIds;
            final C11300l<C23843c, C11079d2> lVar3 = this.$actioner;
            final int i3 = this.$$dirty;
            LazyListScope.m10824g(lazyListScope, "in_store_coupons", (Object) null, C8553b.m31049c(419096169, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                        java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.coupons.list.InStoreCoupons.<anonymous>.<anonymous> (CouponsListStateful.kt:405)"
                        r2 = 419096169(0x18fae669, float:6.485614E-24)
                        androidx.compose.runtime.ComposerKt.m29845w0(r2, r15, r0, r1)
                    L_0x0036:
                        androidx.compose.ui.m$a r15 = androidx.compose.p004ui.C8767m.f23478j
                        r0 = 1
                        r1 = 0
                        r2 = 0
                        androidx.compose.ui.m r3 = androidx.compose.foundation.lazy.C2455e.m10931b(r13, r15, r2, r0, r1)
                        java.util.List<com.carrefour.fid.android.presentation.models.CouponModel> r4 = r3
                        java.util.List<java.lang.String> r5 = r4
                        r6 = 1
                        kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r13 = r5
                        r15 = 1157296644(0x44faf204, float:2007.563)
                        r14.mo14918M(r15)
                        boolean r0 = r14.mo15006n0(r13)
                        java.lang.Object r1 = r14.mo14921N()
                        if (r0 != 0) goto L_0x005e
                        androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r0 = r0.mo16277a()
                        if (r1 != r0) goto L_0x0066
                    L_0x005e:
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$3$1$1 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$3$1$1
                        r1.<init>(r13)
                        r14.mo14893C(r1)
                    L_0x0066:
                        r14.mo15002m0()
                        r7 = r1
                        kotlin.jvm.functions.l r7 = (kotlin.jvm.functions.C11300l) r7
                        kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r13 = r5
                        r14.mo14918M(r15)
                        boolean r0 = r14.mo15006n0(r13)
                        java.lang.Object r1 = r14.mo14921N()
                        if (r0 != 0) goto L_0x0083
                        androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r0 = r0.mo16277a()
                        if (r1 != r0) goto L_0x008b
                    L_0x0083:
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$3$2$1 r1 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$3$2$1
                        r1.<init>(r13)
                        r14.mo14893C(r1)
                    L_0x008b:
                        r14.mo15002m0()
                        r8 = r1
                        kotlin.jvm.functions.l r8 = (kotlin.jvm.functions.C11300l) r8
                        kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.coupons.list.c, kotlin.d2> r13 = r5
                        r14.mo14918M(r15)
                        boolean r15 = r14.mo15006n0(r13)
                        java.lang.Object r0 = r14.mo14921N()
                        if (r15 != 0) goto L_0x00a8
                        androidx.compose.runtime.o$a r15 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r15 = r15.mo16277a()
                        if (r0 != r15) goto L_0x00b0
                    L_0x00a8:
                        com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$3$3$1 r0 = new com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1$3$3$1
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
                    throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.list.CouponsListStatefulKt$InStoreCoupons$1.C238363.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
                }
            }), 2, (Object) null);
            final boolean z2 = this.$isButtonActivated;
            final C11300l<C23843c, C11079d2> lVar4 = this.$actioner;
            final int i4 = this.$$dirty;
            LazyListScope.m10824g(lazyListScope2, "show_barcode", (Object) null, C8553b.m31049c(1012584840, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(1012584840, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.InStoreCoupons.<anonymous>.<anonymous> (CouponsListStateful.kt:429)");
                        }
                        C8767m k = PaddingKt.m10024k(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 10));
                        C8734c i2 = C8734c.f23406a.mo17066i();
                        boolean z = z2;
                        C11300l<C23843c, C11079d2> lVar = lVar4;
                        oVar.mo14918M(733328855);
                        C15560f0 k2 = BoxKt.m9849k(i2, false, oVar, 6);
                        oVar.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
                        if (!(oVar.mo15017r() instanceof C8428d)) {
                            ComposablesKt.m29519n();
                        }
                        oVar.mo14938T();
                        if (oVar.mo14997l()) {
                            oVar.mo14947W(a);
                        } else {
                            oVar.mo14888A();
                        }
                        oVar.mo14941U();
                        C8592o b = Updater.m30180b(oVar);
                        Updater.m30188j(b, k2, companion.mo44588d());
                        Updater.m30188j(b, dVar, companion.mo44586b());
                        Updater.m30188j(b, layoutDirection, companion.mo44587c());
                        Updater.m30188j(b, c4Var, companion.mo44590f());
                        oVar.mo14972e();
                        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
                        oVar.mo14918M(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                        oVar.mo14918M(1157296644);
                        boolean n0 = oVar.mo15006n0(lVar);
                        Object N = oVar.mo14921N();
                        if (n0 || N == C8592o.f23032a.mo16277a()) {
                            N = new CouponsListStatefulKt$InStoreCoupons$1$4$1$1$1(lVar);
                            oVar.mo14893C(N);
                        }
                        oVar.mo15002m0();
                        ShowBarCodeKt.m105664a(z, (C11289a) N, oVar, 0);
                        oVar.mo15002m0();
                        oVar.mo14896D();
                        oVar.mo15002m0();
                        oVar.mo15002m0();
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), 2, (Object) null);
        }
        this.$actioner.invoke(C23843c.C23859h.C23861b.f59987a);
    }
}
