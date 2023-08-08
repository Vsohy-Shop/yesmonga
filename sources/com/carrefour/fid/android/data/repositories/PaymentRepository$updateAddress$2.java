package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.UpdateAddressBody;
import com.carrefour.fid.android.data.service.C36634m;
import com.carrefour.fid.android.domain.models.account.Address;
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

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$2", mo22502f = "PaymentRepository.kt", mo22503i = {}, mo22504l = {173}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PaymentRepository$updateAddress$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C11079d2>>, Object> {
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ String $contactNumber;
    final /* synthetic */ Address $deliveryAddress;
    final /* synthetic */ String $event;
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ PaymentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentRepository$updateAddress$2(PaymentRepository paymentRepository, String str, Address address, Address address2, String str2, String str3, C11045c<? super PaymentRepository$updateAddress$2> cVar) {
        super(1, cVar);
        this.this$0 = paymentRepository;
        this.$orderId = str;
        this.$billingAddress = address;
        this.$deliveryAddress = address2;
        this.$contactNumber = str2;
        this.$event = str3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new PaymentRepository$updateAddress$2(this.this$0, this.$orderId, this.$billingAddress, this.$deliveryAddress, this.$contactNumber, this.$event, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C36634m e = this.this$0.f90425a;
            HashMap<String, String> a = this.this$0.f90426b.mo111425a();
            UpdateAddressBody f = this.this$0.mo111551s(this.$orderId, this.$billingAddress, this.$deliveryAddress, this.$contactNumber);
            this.label = 1;
            obj = e.mo111657c(a, f, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = this.$orderId;
        String str2 = this.$event;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            obj2 = Result.m38702b(C11079d2.f28267a);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148968d(wVar, "Error updating Payment by orderId='" + str + "'", str2)));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C11079d2>> cVar) {
        return ((PaymentRepository$updateAddress$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
