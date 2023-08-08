package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.core.extension.C36311i;
import com.carrefour.fid.android.data.entities.ConfirmPaymentRequestBody;
import com.carrefour.fid.android.data.entities.ConfirmPaymentResponse;
import com.carrefour.fid.android.data.entities.PaymentMode;
import com.carrefour.fid.android.data.service.C36634m;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$2", mo22502f = "PaymentRepository.kt", mo22503i = {}, mo22504l = {50}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/data/entities/ConfirmPaymentResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PaymentRepository$confirmPayment$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends ConfirmPaymentResponse>>, Object> {
    final /* synthetic */ String $event;
    final /* synthetic */ String $payLineData;
    final /* synthetic */ String $payLineToken;
    int label;
    final /* synthetic */ PaymentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentRepository$confirmPayment$2(PaymentRepository paymentRepository, String str, String str2, String str3, C11045c<? super PaymentRepository$confirmPayment$2> cVar) {
        super(1, cVar);
        this.this$0 = paymentRepository;
        this.$payLineData = str;
        this.$payLineToken = str2;
        this.$event = str3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new PaymentRepository$confirmPayment$2(this.this$0, this.$payLineData, this.$payLineToken, this.$event, cVar);
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
            ConfirmPaymentRequestBody confirmPaymentRequestBody = new ConfirmPaymentRequestBody(this.$payLineData, this.$payLineToken, PaymentMode.PAYLINE.mo110576q());
            this.label = 1;
            obj = e.mo111655a(a, confirmPaymentRequestBody, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = this.$payLineData;
        String str2 = this.$payLineToken;
        String str3 = this.$event;
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            Object a2 = wVar.mo30572a();
            Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type com.carrefour.fid.android.data.entities.ConfirmPaymentResponse");
            obj2 = Result.m38702b((ConfirmPaymentResponse) a2);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C36311i.m148968d(wVar, "Error confirm Payment payLineData='" + str + "' and payLineToken='" + str2 + "'", str3)));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<ConfirmPaymentResponse>> cVar) {
        return ((PaymentRepository$confirmPayment$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
