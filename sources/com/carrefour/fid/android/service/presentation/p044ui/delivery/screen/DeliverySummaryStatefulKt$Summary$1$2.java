package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$2 */
public final class DeliverySummaryStatefulKt$Summary$1$2 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<DeliverySummaryAction, C11079d2> $actioner;
    final /* synthetic */ Address $address;
    final /* synthetic */ DeliveryType $deliveryType;
    final /* synthetic */ Double $minAmount;
    final /* synthetic */ StoreService $storeService;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$Summary$1$2(Address address, Double d, DeliveryType deliveryType, int i, StoreService storeService, C11300l<? super DeliverySummaryAction, C11079d2> lVar) {
        super(1);
        this.$address = address;
        this.$minAmount = d;
        this.$deliveryType = deliveryType;
        this.$$dirty = i;
        this.$storeService = storeService;
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final Address address = this.$address;
        LazyListScope.m10824g(lazyListScope, "address", (Object) null, C8553b.m31049c(1957045284, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                        ComposerKt.m29845w0(1957045284, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.Summary.<anonymous>.<anonymous>.<anonymous> (DeliverySummaryStateful.kt:204)");
                    }
                    BlockAddressKt.BlockAddress(false, address.mo116724x(), oVar, 0, 1);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 2, (Object) null);
        final Double d = this.$minAmount;
        final DeliveryType deliveryType = this.$deliveryType;
        final int i = this.$$dirty;
        LazyListScope lazyListScope2 = lazyListScope;
        LazyListScope.m10824g(lazyListScope2, "description", (Object) null, C8553b.m31049c(-1816352933, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                        ComposerKt.m29845w0(-1816352933, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.Summary.<anonymous>.<anonymous>.<anonymous> (DeliverySummaryStateful.kt:208)");
                    }
                    BlocPictoComponentKt.BlocPictoComponent(false, d, deliveryType, oVar, (i >> 3) & 896, 1);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 2, (Object) null);
        LazyListScope.m10824g(lazyListScope, "spacer", (Object) null, ComposableSingletons$DeliverySummaryStatefulKt.INSTANCE.m172888getLambda1$service_release(), 2, (Object) null);
        final StoreService storeService = this.$storeService;
        final C11300l<DeliverySummaryAction, C11079d2> lVar = this.$actioner;
        final int i2 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope2, "delivery_fee", (Object) null, C8553b.m31049c(1110923101, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.jvm.functions.a} */
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
                r1 = r1.mo119161E();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual(r2, 0.0d) != false) goto L_0x007f;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x015f  */
            /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            @androidx.compose.runtime.C8540g
            @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r29, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r30, int r31) {
                /*
                    r28 = this;
                    r0 = r28
                    r14 = r30
                    r1 = r31
                    java.lang.String r2 = "$this$item"
                    r3 = r29
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    r2 = r1 & 81
                    r3 = 16
                    if (r2 != r3) goto L_0x001f
                    boolean r2 = r30.mo15011p()
                    if (r2 != 0) goto L_0x001a
                    goto L_0x001f
                L_0x001a:
                    r30.mo14958a0()
                    goto L_0x0162
                L_0x001f:
                    boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r2 == 0) goto L_0x002e
                    r2 = -1
                    java.lang.String r4 = "com.carrefour.fid.android.service.presentation.ui.delivery.screen.Summary.<anonymous>.<anonymous>.<anonymous> (DeliverySummaryStateful.kt:222)"
                    r5 = 1110923101(0x4237575d, float:45.835316)
                    androidx.compose.runtime.ComposerKt.m29845w0(r5, r1, r2, r4)
                L_0x002e:
                    com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1
                    r15 = 0
                    if (r1 == 0) goto L_0x003e
                    java.util.List r1 = r1.mo119161E()
                    if (r1 == 0) goto L_0x003e
                    int r1 = r1.size()
                    goto L_0x003f
                L_0x003e:
                    r1 = r15
                L_0x003f:
                    r2 = 1
                    if (r1 != r2) goto L_0x0110
                    com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1
                    r2 = 0
                    if (r1 == 0) goto L_0x005a
                    java.util.List r1 = r1.mo119161E()
                    if (r1 == 0) goto L_0x005a
                    java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r1)
                    com.carrefour.fid.android.domain.models.service.models.DeliveryFee r1 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee) r1
                    if (r1 == 0) goto L_0x005a
                    com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r1 = r1.mo119072i()
                    goto L_0x005b
                L_0x005a:
                    r1 = r2
                L_0x005b:
                    r12 = 0
                    if (r1 == 0) goto L_0x007f
                    com.carrefour.fid.android.domain.models.service.models.StoreService r1 = r1
                    java.util.List r1 = r1.mo119161E()
                    java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r1)
                    com.carrefour.fid.android.domain.models.service.models.DeliveryFee r1 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee) r1
                    com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r1 = r1.mo119072i()
                    if (r1 == 0) goto L_0x0079
                    double r1 = r1.mo119083f()
                    java.lang.Double r2 = java.lang.Double.valueOf(r1)
                L_0x0079:
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Double) r2, (double) r12)
                    if (r1 == 0) goto L_0x0110
                L_0x007f:
                    r1 = 1238148850(0x49cca6f2, float:1676510.2)
                    r14.mo14918M(r1)
                    androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
                    r5 = 0
                    float r1 = (float) r3
                    float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
                    r7 = 0
                    r8 = 0
                    r9 = 13
                    r10 = 0
                    androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10028o(r4, r5, r6, r7, r8, r9, r10)
                    int r1 = com.carrefour.fid.android.service.C28330R.string.delivery_service_summary_price_list_title
                    java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r14, r15)
                    androidx.compose.material.t0 r3 = androidx.compose.material.C7933t0.f19075a
                    int r4 = androidx.compose.material.C7933t0.f19076b
                    androidx.compose.material.w1 r3 = r3.mo11077c(r14, r4)
                    androidx.compose.ui.text.p0 r21 = com.carrefour.fid.android.design.theme.C37477d.m153885L(r3)
                    androidx.compose.ui.text.font.i0$a r3 = androidx.compose.p004ui.text.font.C16209i0.f40292b
                    androidx.compose.ui.text.font.i0 r8 = r3.mo46947c()
                    com.carrefour.fid.android.design.theme.b r3 = com.carrefour.fid.android.design.theme.C37475b.f94185a
                    long r3 = r3.mo114205B()
                    r5 = 0
                    r7 = 0
                    r9 = 0
                    r10 = 0
                    r16 = 0
                    r26 = r12
                    r12 = r16
                    r13 = 0
                    r16 = 0
                    r14 = r16
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r23 = 196656(0x30030, float:2.75574E-40)
                    r24 = 0
                    r25 = 65496(0xffd8, float:9.178E-41)
                    r22 = r30
                    androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                    r1 = 0
                    int r2 = com.carrefour.fid.android.service.C28330R.string.delivery_summary_basket_unique
                    r8 = r30
                    r3 = 0
                    java.lang.String r2 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r8, r3)
                    com.carrefour.fid.android.domain.models.service.models.StoreService r3 = r1
                    if (r3 == 0) goto L_0x0103
                    java.util.List r3 = r3.mo119161E()
                    if (r3 == 0) goto L_0x0103
                    java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r3)
                    com.carrefour.fid.android.domain.models.service.models.DeliveryFee r3 = (com.carrefour.fid.android.domain.models.service.models.DeliveryFee) r3
                    if (r3 == 0) goto L_0x0103
                    com.carrefour.fid.android.domain.models.service.models.DeliveryFee$FeeAmount r3 = r3.mo119070h()
                    if (r3 == 0) goto L_0x0103
                    double r3 = r3.mo119083f()
                    goto L_0x0105
                L_0x0103:
                    r3 = r26
                L_0x0105:
                    r6 = 0
                    r7 = 1
                    r5 = r30
                    com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.ItemDeliveryFeePriceKt.ItemDeliveryFeePrice(r1, r2, r3, r5, r6, r7)
                    r30.mo15002m0()
                    goto L_0x0159
                L_0x0110:
                    r8 = r14
                    r1 = 1238149544(0x49cca9a8, float:1676597.0)
                    r8.mo14918M(r1)
                    r1 = 0
                    com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r1
                    if (r2 == 0) goto L_0x0122
                    java.util.List r2 = r2.mo119161E()
                    if (r2 != 0) goto L_0x0126
                L_0x0122:
                    java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                L_0x0126:
                    kotlin.jvm.functions.l<com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryAction, kotlin.d2> r3 = r2
                    r4 = 1157296644(0x44faf204, float:2007.563)
                    r8.mo14918M(r4)
                    boolean r4 = r8.mo15006n0(r3)
                    java.lang.Object r5 = r30.mo14921N()
                    if (r4 != 0) goto L_0x0140
                    androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r4 = r4.mo16277a()
                    if (r5 != r4) goto L_0x0148
                L_0x0140:
                    com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$2$3$1$1 r5 = new com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$2$3$1$1
                    r5.<init>(r3)
                    r8.mo14893C(r5)
                L_0x0148:
                    r30.mo15002m0()
                    r3 = r5
                    kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
                    r5 = 64
                    r6 = 1
                    r4 = r30
                    com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.BlockDeliveryFeeKt.BlockDeliveryFee(r1, r2, r3, r4, r5, r6)
                    r30.mo15002m0()
                L_0x0159:
                    boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r1 == 0) goto L_0x0162
                    androidx.compose.runtime.ComposerKt.m29843v0()
                L_0x0162:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.delivery.screen.DeliverySummaryStatefulKt$Summary$1$2.C283933.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
            }
        }), 2, (Object) null);
    }
}
