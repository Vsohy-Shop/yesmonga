package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.OHMOrdersOnlineEntity;
import com.carrefour.fid.android.data.service.C36633l;
import com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain;
import com.carrefour.fid.android.shared.util.C28935i;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$2", mo22502f = "OrderOnlineRepository.kt", mo22503i = {}, mo22504l = {72, 80}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/OrdersOnlineResultDomain;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OrderOnlineRepository$getOrderList$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends OrdersOnlineResultDomain>>, Object> {
    final /* synthetic */ String $scrollHash;
    final /* synthetic */ String $scrollPaging;
    int label;
    final /* synthetic */ OrderOnlineRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineRepository$getOrderList$2(OrderOnlineRepository orderOnlineRepository, String str, String str2, C11045c<? super OrderOnlineRepository$getOrderList$2> cVar) {
        super(1, cVar);
        this.this$0 = orderOnlineRepository;
        this.$scrollHash = str;
        this.$scrollPaging = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new OrderOnlineRepository$getOrderList$2(this.this$0, this.$scrollHash, this.$scrollPaging, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36633l c = this.this$0.f90417a;
            HashMap<String, String> a = this.this$0.f90420d.mo111440a();
            String str = this.$scrollHash;
            String str2 = this.$scrollPaging;
            this.label = 1;
            obj = c.mo111651a(a, str, str2, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            try {
                C11661u0.m45747n(obj);
                obj2 = Result.m38702b(obj);
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                C28935i.m119705e(iVar, message, (Throwable) null, 0, 6, (Object) null);
                Result.C10852a aVar = Result.f28060a;
                String message2 = e.getMessage();
                obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Error during fetching online order list - " + message2, e)));
            }
            return Result.m38701a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        OrderOnlineRepository orderOnlineRepository = this.this$0;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar2 = Result.f28060a;
            this.label = 2;
            obj = orderOnlineRepository.f90418b.mo111179e((OHMOrdersOnlineEntity) wVar.mo30572a(), this);
            if (obj == h) {
                return h;
            }
            obj2 = Result.m38702b(obj);
            return Result.m38701a(obj2);
        }
        Result.C10852a aVar3 = Result.f28060a;
        obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148971g(wVar, "Error during fetching online order list")));
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<OrdersOnlineResultDomain>> cVar) {
        return ((OrderOnlineRepository$getOrderList$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
