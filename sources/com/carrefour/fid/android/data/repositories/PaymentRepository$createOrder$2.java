package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.CreateOrderBody;
import com.carrefour.fid.android.data.entities.OrderChannel;
import com.carrefour.fid.android.data.entities.OrdersResponse;
import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.data.service.C36634m;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.domain.extension.StoreServiceKt;
import java.util.HashMap;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$2", mo22502f = "PaymentRepository.kt", mo22503i = {}, mo22504l = {102}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/data/entities/OrdersResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PaymentRepository$createOrder$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends OrdersResponse>>, Object> {
    final /* synthetic */ List<String> $basketIds;
    final /* synthetic */ String $event;
    final /* synthetic */ boolean $isExpressPickup;
    final /* synthetic */ boolean $isPostOrderSubstitutionEnabled;
    final /* synthetic */ String $oneOrderId;
    final /* synthetic */ StoreService $storeService;
    int label;
    final /* synthetic */ PaymentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentRepository$createOrder$2(PaymentRepository paymentRepository, boolean z, boolean z2, List<String> list, StoreService storeService, String str, String str2, C11045c<? super PaymentRepository$createOrder$2> cVar) {
        super(1, cVar);
        this.this$0 = paymentRepository;
        this.$isExpressPickup = z;
        this.$isPostOrderSubstitutionEnabled = z2;
        this.$basketIds = list;
        this.$storeService = storeService;
        this.$oneOrderId = str;
        this.$event = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new PaymentRepository$createOrder$2(this.this$0, this.$isExpressPickup, this.$isPostOrderSubstitutionEnabled, this.$basketIds, this.$storeService, this.$oneOrderId, this.$event, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object obj3;
        String str;
        Boolean bool;
        String str2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36634m e = this.this$0.f90425a;
            HashMap<String, String> a = this.this$0.f90427c.mo111438a(true, true);
            boolean z = this.$isExpressPickup;
            if (z) {
                bool = C11064a.m42615a(z);
            } else {
                bool = null;
            }
            Boolean a2 = C11064a.m42615a(this.$isPostOrderSubstitutionEnabled);
            List<String> list = this.$basketIds;
            String b = this.this$0.f90428d.mo84151b();
            StoreService storeService = this.$storeService;
            boolean z2 = false;
            if (storeService != null && StoreServiceKt.isDrive(storeService)) {
                z2 = true;
            }
            if (z2) {
                str2 = PaymentRepository.DriveDeliveryLocation.f90429a.mo111554a(this.$storeService.mo119175S()).mo111553q();
            } else {
                str2 = null;
            }
            CreateOrderBody createOrderBody = r6;
            CreateOrderBody createOrderBody2 = new CreateOrderBody(bool, a2, list, b, (OrderChannel) null, str2, this.$oneOrderId, 16, (DefaultConstructorMarker) null);
            this.label = 1;
            obj2 = e.mo111656b(a, createOrderBody, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<String> list2 = this.$basketIds;
        String str3 = this.$event;
        C13091w wVar = (C13091w) obj2;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            Object a3 = wVar.mo30572a();
            Intrinsics.checkNotNull(a3, "null cannot be cast to non-null type com.carrefour.fid.android.data.entities.OrdersResponse");
            obj3 = Result.m38702b((OrdersResponse) a3);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            OrdersResponse ordersResponse = (OrdersResponse) wVar.mo30572a();
            if (ordersResponse != null) {
                str = ordersResponse.getOneOrderId();
            } else {
                str = null;
            }
            obj3 = Result.m38702b(C11661u0.m45734a(C36311i.m148968d(wVar, "Error create order='" + str + "' and basketIds='" + list2 + "'", str3)));
        }
        return Result.m38701a(obj3);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<OrdersResponse>> cVar) {
        return ((PaymentRepository$createOrder$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
