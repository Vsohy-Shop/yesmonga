package com.carrefour.fid.android.checkout.data.api.datasources;

import com.carrefour.fid.android.checkout.data.api.entities.p068v1.request.GetWalletsRequest;
import com.carrefour.fid.android.checkout.data.api.entities.p068v1.response.GetWalletsResponse;
import com.carrefour.fid.android.checkout.data.api.services.C39837a;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$2", mo22502f = "PaymentDataSource.kt", mo22503i = {}, mo22504l = {33}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PaymentDataSource$getPspToken$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $customerRef;
    final /* synthetic */ String $firstName;
    final /* synthetic */ String $lastName;
    int label;
    final /* synthetic */ PaymentDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentDataSource$getPspToken$2(String str, String str2, String str3, PaymentDataSource paymentDataSource, C11045c<? super PaymentDataSource$getPspToken$2> cVar) {
        super(1, cVar);
        this.$firstName = str;
        this.$lastName = str2;
        this.$customerRef = str3;
        this.this$0 = paymentDataSource;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new PaymentDataSource$getPspToken$2(this.$firstName, this.$lastName, this.$customerRef, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        String str;
        Object h = C11063b.m42612h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C11661u0.m45747n(obj);
            GetWalletsRequest getWalletsRequest = new GetWalletsRequest(PaymentDataSource.f101593c, PaymentDataSource.f101594d, PaymentDataSource.f101595e, new GetWalletsRequest.Buyer(this.$firstName, this.$lastName, this.$customerRef));
            C39837a a = this.this$0.f101596a;
            this.label = 1;
            obj = a.mo131381a(getWalletsRequest, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (wVar.mo30576g()) {
            GetWalletsResponse getWalletsResponse = (GetWalletsResponse) wVar.mo30572a();
            String str2 = null;
            if (getWalletsResponse != null) {
                str = getWalletsResponse.getPsp_token();
            } else {
                str = null;
            }
            if (str != null && !C11622t.isBlank(str)) {
                z = false;
            }
            if (!z) {
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(str);
            } else {
                Result.C10852a aVar2 = Result.f28060a;
                GetWalletsResponse getWalletsResponse2 = (GetWalletsResponse) wVar.mo30572a();
                if (getWalletsResponse2 != null) {
                    str2 = getWalletsResponse2.getPsp_token();
                }
                obj2 = Result.m38702b(C11661u0.m45734a(new Throwable("Invalid token received: " + str2)));
            }
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error during fetching wallets for ref: " + this.$customerRef)));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<String>> cVar) {
        return ((PaymentDataSource$getPspToken$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
