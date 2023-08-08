package com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel;

import com.carrefour.fid.android.core.p057io.CancelOrderOnlineThrowable;
import com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27055e;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel$cancelOrder$2", mo22502f = "OrderOnlineViewModel.kt", mo22503i = {}, mo22504l = {116, 125, 121}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOrderOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderOnlineViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/viewmodel/OrderOnlineViewModel$cancelOrder$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,135:1\n230#2,5:136\n230#2,5:141\n*S KotlinDebug\n*F\n+ 1 OrderOnlineViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/order/refont/viewmodel/OrderOnlineViewModel$cancelOrder$2\n*L\n124#1:136,5\n120#1:141,5\n*E\n"})
public final class OrderOnlineViewModel$cancelOrder$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ OrderType $orderType;
    int label;
    final /* synthetic */ OrderOnlineViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineViewModel$cancelOrder$2(OrderOnlineViewModel orderOnlineViewModel, String str, OrderType orderType, C11045c<? super OrderOnlineViewModel$cancelOrder$2> cVar) {
        super(2, cVar);
        this.this$0 = orderOnlineViewModel;
        this.$orderId = str;
        this.$orderType = orderType;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new OrderOnlineViewModel$cancelOrder$2(this.this$0, this.$orderId, this.$orderType, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        C27077a value;
        C27077a value2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            CancelOrderOnlineUseCase c0 = this.this$0.f65895c;
            CancelOrderOnlineUseCase.C37719a aVar = new CancelOrderOnlineUseCase.C37719a(this.$orderId);
            this.label = 1;
            obj2 = c0.m172976invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else if (i == 2 || i == 3) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        OrderOnlineViewModel orderOnlineViewModel = this.this$0;
        String str = this.$orderId;
        OrderType orderType = this.$orderType;
        Throwable e = Result.m38705e(obj2);
        if (e == null) {
            C11079d2 d2Var = (C11079d2) obj2;
            C11940j<C27077a> h0 = orderOnlineViewModel.mo78787h0();
            do {
                value2 = h0.getValue();
            } while (!h0.mo24216e(value2, C27077a.m114460f(value2, (C28892e) null, false, false, false, 11, (Object) null)));
            C11744g d0 = orderOnlineViewModel.f65896d;
            C27055e.C27056a aVar2 = new C27055e.C27056a(str, orderType);
            this.label = 2;
            if (d0.mo23757h0(aVar2, this) == h) {
                return h;
            }
        } else {
            C11940j<C27077a> h02 = orderOnlineViewModel.mo78787h0();
            do {
                value = h02.getValue();
            } while (!h02.mo24216e(value, C27077a.m114460f(value, (C28892e) null, false, false, false, 11, (Object) null)));
            C11744g d02 = orderOnlineViewModel.f65896d;
            C27055e.C27057b bVar = new C27055e.C27057b(new CancelOrderOnlineThrowable(e.getMessage()));
            this.label = 3;
            if (d02.mo23757h0(bVar, this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((OrderOnlineViewModel$cancelOrder$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
