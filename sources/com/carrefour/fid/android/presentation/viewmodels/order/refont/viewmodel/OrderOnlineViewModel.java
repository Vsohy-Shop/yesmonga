package com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import com.carrefour.fid.android.domain.models.OrdersOnlineDomain;
import com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain;
import com.carrefour.fid.android.domain.models.OrdersPagingDomain;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27055e;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper.C27073c;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u001d\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010+\u0002\u0004\n\u0002\b\u0019¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/viewmodel/OrderOnlineViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "g0", "j0", "", "orderId", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "orderType", "f0", "", "isFirstPage", "k0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/OrdersOnlineResultDomain;", "result", "i0", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;", "getOrderOnlineListUseCase", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/mapper/c;", "b", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/mapper/c;", "ordersOnlineModelDataMapper", "Lcom/carrefour/fid/android/domain/interactors/order/CancelOrderOnlineUseCase;", "c", "Lcom/carrefour/fid/android/domain/interactors/order/CancelOrderOnlineUseCase;", "cancelOrderOnlineUseCase", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/e;", "d", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "e", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/model/a;", "f", "Lkotlinx/coroutines/flow/j;", "h0", "()Lkotlinx/coroutines/flow/j;", "state", "Lcom/carrefour/fid/android/domain/models/OrdersPagingDomain;", "g", "pagingDomain", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/order/GetOrderOnlineListUseCase;Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/mapper/c;Lcom/carrefour/fid/android/domain/interactors/order/CancelOrderOnlineUseCase;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrderOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderOnlineViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/viewmodel/OrderOnlineViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n230#2,5:136\n230#2,5:141\n230#2,5:150\n230#2,5:155\n230#2,5:160\n230#2,5:165\n1549#3:146\n1620#3,3:147\n*S KotlinDebug\n*F\n+ 1 OrderOnlineViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/viewmodel/OrderOnlineViewModel\n*L\n43#1:136,5\n66#1:141,5\n80#1:150,5\n92#1:155,5\n101#1:160,5\n114#1:165,5\n77#1:146\n77#1:147,3\n*E\n"})
public final class OrderOnlineViewModel extends C19476v0 {

    /* renamed from: h */
    public static final int f65892h = 8;
    @C12579k

    /* renamed from: a */
    public final GetOrderOnlineListUseCase f65893a;
    @C12579k

    /* renamed from: b */
    public final C27073c f65894b;
    @C12579k

    /* renamed from: c */
    public final CancelOrderOnlineUseCase f65895c;
    @C12579k

    /* renamed from: d */
    public final C11744g<C27055e> f65896d;
    @C12579k

    /* renamed from: e */
    public final C11907e<C27055e> f65897e;
    @C12579k

    /* renamed from: f */
    public final C11940j<C27077a> f65898f = C11953v.m47628a(new C27077a((C28892e) null, false, false, false, 15, (DefaultConstructorMarker) null));
    @C12579k

    /* renamed from: g */
    public final C11940j<OrdersPagingDomain> f65899g = C11953v.m47628a(null);

    @Inject
    public OrderOnlineViewModel(@C12579k GetOrderOnlineListUseCase getOrderOnlineListUseCase, @C12579k C27073c cVar, @C12579k CancelOrderOnlineUseCase cancelOrderOnlineUseCase) {
        Intrinsics.checkNotNullParameter(getOrderOnlineListUseCase, "getOrderOnlineListUseCase");
        Intrinsics.checkNotNullParameter(cVar, "ordersOnlineModelDataMapper");
        Intrinsics.checkNotNullParameter(cancelOrderOnlineUseCase, "cancelOrderOnlineUseCase");
        this.f65893a = getOrderOnlineListUseCase;
        this.f65894b = cVar;
        this.f65895c = cancelOrderOnlineUseCase;
        C11744g<C27055e> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f65896d = d;
        this.f65897e = C11909g.m47490s1(d);
        mo78785g0();
    }

    /* renamed from: l0 */
    public static /* synthetic */ Object m114572l0(OrderOnlineViewModel orderOnlineViewModel, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return orderOnlineViewModel.mo78790k0(z, cVar);
    }

    /* renamed from: f0 */
    public final void mo78784f0(@C12579k String str, @C12579k OrderType orderType) {
        C27077a value;
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        C11940j<C27077a> jVar = this.f65898f;
        do {
            value = jVar.getValue();
        } while (!jVar.mo24216e(value, C27077a.m114460f(value, (C28892e) null, false, true, false, 11, (Object) null)));
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new OrderOnlineViewModel$cancelOrder$2(this, str, orderType, (C11045c<? super OrderOnlineViewModel$cancelOrder$2>) null), 3, (Object) null);
    }

    /* renamed from: g0 */
    public final void mo78785g0() {
        C27077a value;
        C11940j<C27077a> jVar = this.f65898f;
        do {
            value = jVar.getValue();
        } while (!jVar.mo24216e(value, C27077a.m114460f(value, (C28892e) null, false, true, false, 11, (Object) null)));
        this.f65899g.setValue(null);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new OrderOnlineViewModel$getOnlineOrders$2(this, (C11045c<? super OrderOnlineViewModel$getOnlineOrders$2>) null), 3, (Object) null);
    }

    @C12579k
    public final C11907e<C27055e> getSideEffect() {
        return this.f65897e;
    }

    @C12579k
    /* renamed from: h0 */
    public final C11940j<C27077a> mo78787h0() {
        return this.f65898f;
    }

    /* renamed from: i0 */
    public final void mo78788i0(OrdersOnlineResultDomain ordersOnlineResultDomain, boolean z) {
        C27077a value;
        C27077a value2;
        C27077a value3;
        C27077a aVar;
        List list;
        this.f65899g.setValue(ordersOnlineResultDomain.getPagingData());
        Iterable<OrdersOnlineDomain> orders = ordersOnlineResultDomain.getOrders();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(orders, 10));
        for (OrdersOnlineDomain a : orders) {
            arrayList.add(this.f65894b.mo78619a(a));
        }
        if (!z) {
            C11940j<C27077a> jVar = this.f65898f;
            do {
                value3 = jVar.getValue();
                aVar = value3;
                list = (List) C28897f.m119478b(aVar.mo78666h());
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                }
            } while (!jVar.mo24216e(value3, aVar.mo78663e(new C28892e.C28895c(CollectionsKt___CollectionsKt.m40718y4(list, arrayList)), C27094a.m114580b(ordersOnlineResultDomain), false, false)));
        } else if (ordersOnlineResultDomain.getOrders().isEmpty()) {
            C11940j<C27077a> jVar2 = this.f65898f;
            do {
                value2 = jVar2.getValue();
            } while (!jVar2.mo24216e(value2, C27077a.m114460f(value2, new C28892e.C28895c(CollectionsKt__CollectionsKt.m40441E()), false, false, false, 2, (Object) null)));
        } else {
            C11940j<C27077a> jVar3 = this.f65898f;
            do {
                value = jVar3.getValue();
            } while (!jVar3.mo24216e(value, value.mo78663e(new C28892e.C28895c(arrayList), C27094a.m114580b(ordersOnlineResultDomain), false, false)));
        }
    }

    /* renamed from: j0 */
    public final void mo78789j0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new OrderOnlineViewModel$loadMore$1(this, (C11045c<? super OrderOnlineViewModel$loadMore$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78790k0(boolean r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel$loadOnlineOrders$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel$loadOnlineOrders$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel$loadOnlineOrders$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel$loadOnlineOrders$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel$loadOnlineOrders$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            boolean r9 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0074
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003d:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase r10 = r8.f65893a
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.OrdersPagingDomain> r4 = r8.f65899g
            java.lang.Object r4 = r4.getValue()
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r4 = (com.carrefour.fid.android.domain.models.OrdersPagingDomain) r4
            r5 = 0
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = r4.getScrollHash()
            goto L_0x0055
        L_0x0054:
            r4 = r5
        L_0x0055:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.OrdersPagingDomain> r6 = r8.f65899g
            java.lang.Object r6 = r6.getValue()
            com.carrefour.fid.android.domain.models.OrdersPagingDomain r6 = (com.carrefour.fid.android.domain.models.OrdersPagingDomain) r6
            if (r6 == 0) goto L_0x0063
            java.lang.String r5 = r6.getScrollPaging()
        L_0x0063:
            r2.<init>(r4, r5)
            r0.L$0 = r8
            r0.Z$0 = r9
            r0.label = r3
            java.lang.Object r10 = r10.m172981invokegIAlus(r2, r0)
            if (r10 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r0 = r8
        L_0x0074:
            boolean r1 = kotlin.Result.m38710j(r10)
            if (r1 == 0) goto L_0x0080
            r1 = r10
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r1 = (com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain) r1
            r0.mo78788i0(r1, r9)
        L_0x0080:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r10)
            if (r9 == 0) goto L_0x00a4
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a> r10 = r0.f65898f
        L_0x0088:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r1 = (com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a) r1
            com.carrefour.fid.android.shared.type.e$a r2 = new com.carrefour.fid.android.shared.type.e$a
            r2.<init>(r9)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 10
            r7 = 0
            com.carrefour.fid.android.presentation.viewmodels.order.refont.model.a r1 = com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a.m114460f(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r10.mo24216e(r0, r1)
            if (r0 == 0) goto L_0x0088
        L_0x00a4:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel.mo78790k0(boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
