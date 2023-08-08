package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27028a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.OrderServiceCustomerComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nOrderOnlineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderOnlineScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineScreenKt$OrderOnlineScreen$1$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,624:1\n171#2,12:625\n*S KotlinDebug\n*F\n+ 1 OrderOnlineScreen.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderOnlineScreenKt$OrderOnlineScreen$1$1\n*L\n306#1:625,12\n*E\n"})
public final class OrderOnlineScreenKt$OrderOnlineScreen$1$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27028a, C11079d2> $actioner;
    final /* synthetic */ List<OrdersOnlineItemModel> $orders;
    final /* synthetic */ C27077a $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineScreen$1$1(List<OrdersOnlineItemModel> list, C27077a aVar, C11300l<? super C27028a, C11079d2> lVar, int i) {
        super(1);
        this.$orders = list;
        this.$state = aVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        final C11300l<C27028a, C11079d2> lVar = this.$actioner;
        final int i = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "NotificationStaticBannerComponent", (Object) null, C8553b.m31049c(-473966296, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.jvm.functions.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlin.jvm.functions.a} */
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
                    goto L_0x00c2
                L_0x0017:
                    boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r10 == 0) goto L_0x0026
                    r10 = -1
                    java.lang.String r0 = "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreen.<anonymous>.<anonymous>.<anonymous> (OrderOnlineScreen.kt:275)"
                    r1 = -473966296(0xffffffffe3bfd928, float:-7.077952E21)
                    androidx.compose.runtime.ComposerKt.m29845w0(r1, r12, r10, r0)
                L_0x0026:
                    r10 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r10]
                    r1 = 0
                    r2 = 0
                    com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1$1$isDisplayed$1 r3 = com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1$1$isDisplayed$1.f65867f
                    r5 = 3080(0xc08, float:4.316E-42)
                    r6 = 6
                    r4 = r11
                    java.lang.Object r12 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
                    androidx.compose.runtime.z0 r12 = (androidx.compose.runtime.C8700z0) r12
                    java.lang.Object r0 = r12.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x00b9
                    r1 = 0
                    r0 = 2131953318(0x7f1306a6, float:1.9543104E38)
                    java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r11, r10)
                    r0 = 2131953315(0x7f1306a3, float:1.9543098E38)
                    java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r11, r10)
                    r5 = 1
                    r0 = 2131953314(0x7f1306a2, float:1.9543095E38)
                    java.lang.String r6 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r11, r10)
                    kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.order.refont.a, kotlin.d2> r0 = r1
                    r2 = 1157296644(0x44faf204, float:2007.563)
                    r11.mo14918M(r2)
                    boolean r7 = r11.mo15006n0(r0)
                    java.lang.Object r8 = r11.mo14921N()
                    if (r7 != 0) goto L_0x0074
                    androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r7 = r7.mo16277a()
                    if (r8 != r7) goto L_0x007c
                L_0x0074:
                    com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1$1$1$1 r8 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1$1$1$1
                    r8.<init>(r0)
                    r11.mo14893C(r8)
                L_0x007c:
                    r11.mo15002m0()
                    r7 = r8
                    kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
                    r11.mo14918M(r2)
                    boolean r0 = r11.mo15006n0(r12)
                    java.lang.Object r2 = r11.mo14921N()
                    if (r0 != 0) goto L_0x0097
                    androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
                    java.lang.Object r0 = r0.mo16277a()
                    if (r2 != r0) goto L_0x009f
                L_0x0097:
                    com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1$1$2$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1$1$2$1
                    r2.<init>(r12)
                    r11.mo14893C(r2)
                L_0x009f:
                    r11.mo15002m0()
                    r8 = r2
                    kotlin.jvm.functions.a r8 = (kotlin.jvm.functions.C11289a) r8
                    com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationConfig r12 = new com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationConfig
                    r2 = r12
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    com.carrefour.fid.android.presentation.ui.orders.online.view.a$b r3 = new com.carrefour.fid.android.presentation.ui.orders.online.view.a$b
                    r0 = 1
                    r2 = 0
                    r3.<init>(r10, r0, r2)
                    r5 = 0
                    r6 = 1
                    r2 = r12
                    r4 = r11
                    com.carrefour.fid.android.presentation.p035ui.orders.online.view.NotificationStaticBannerComponentKt.m109338f(r1, r2, r3, r4, r5, r6)
                L_0x00b9:
                    boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
                    if (r10 == 0) goto L_0x00c2
                    androidx.compose.runtime.ComposerKt.m29843v0()
                L_0x00c2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenKt$OrderOnlineScreen$1$1.C270851.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
            }
        }), 2, (Object) null);
        final List<OrdersOnlineItemModel> list = this.$orders;
        final C11300l<C27028a, C11079d2> lVar2 = this.$actioner;
        final int i2 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "first element", (Object) null, C8553b.m31049c(1548763615, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                        ComposerKt.m29845w0(1548763615, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreen.<anonymous>.<anonymous>.<anonymous> (OrderOnlineScreen.kt:295)");
                    }
                    OrdersOnlineItemModel ordersOnlineItemModel = (OrdersOnlineItemModel) CollectionsKt___CollectionsKt.m40479B2(list);
                    if (ordersOnlineItemModel != null) {
                        OrderOnlineScreenKt.m114526o(ordersOnlineItemModel, lVar2, oVar, ((i2 >> 15) & 112) | 8);
                    }
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 2, (Object) null);
        final C11300l<C27028a, C11079d2> lVar3 = this.$actioner;
        final int i3 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, "ServiceCustomer", (Object) null, C8553b.m31049c(-1194549152, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                        ComposerKt.m29845w0(-1194549152, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreen.<anonymous>.<anonymous>.<anonymous> (OrderOnlineScreen.kt:301)");
                    }
                    C11300l<C27028a, C11079d2> lVar = lVar3;
                    oVar.mo14918M(1157296644);
                    boolean n0 = oVar.mo15006n0(lVar);
                    Object N = oVar.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new OrderOnlineScreenKt$OrderOnlineScreen$1$1$3$1$1(lVar);
                        oVar.mo14893C(N);
                    }
                    oVar.mo15002m0();
                    OrderServiceCustomerComponentKt.m114278a((C8767m) null, (C11289a) N, oVar, 0, 1);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 2, (Object) null);
        List<OrdersOnlineItemModel> list2 = this.$orders;
        List<OrdersOnlineItemModel> subList = list2.subList(1, list2.size());
        C270884 r0 = C270884.f65866f;
        lazyListScope.mo8310k(subList.size(), r0 != null ? new C27079x808cf937(r0, subList) : null, new C27080x808cf938(subList), C8553b.m31049c(-1091073711, true, new C27081x808cf939(subList, this.$orders, this.$state, this.$actioner, this.$$dirty)));
        if (this.$state.mo78668i()) {
            LazyListScope.m10824g(lazyListScope, "LoagindMoreIndicator", (Object) null, ComposableSingletons$OrderOnlineScreenKt.f65839a.mo78683a(), 2, (Object) null);
        }
    }
}
