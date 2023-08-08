package com.carrefour.fid.android.utilities.domain.interactors;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureToken;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureTokenResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureTokenResponseData;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
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

@C11067d(mo22501c = "com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSecureTokenUseCase$invoke$2", mo22502f = "UtilitiesGetSecureTokenUseCase.kt", mo22503i = {}, mo22504l = {13}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class UtilitiesGetSecureTokenUseCase$invoke$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends String>>, Object> {
    final /* synthetic */ C37888b.C37889a $param;
    int label;
    final /* synthetic */ UtilitiesGetSecureTokenUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UtilitiesGetSecureTokenUseCase$invoke$2(UtilitiesGetSecureTokenUseCase utilitiesGetSecureTokenUseCase, C37888b.C37889a aVar, C11045c<? super UtilitiesGetSecureTokenUseCase$invoke$2> cVar) {
        super(1, cVar);
        this.this$0 = utilitiesGetSecureTokenUseCase;
        this.$param = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new UtilitiesGetSecureTokenUseCase$invoke$2(this.this$0, this.$param, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        BffSecureToken bffSecureToken;
        BffSecureTokenResponseData data;
        Object h = C11063b.m42612h();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C11661u0.m45747n(obj);
            BffUtilitiesManagementApi a = this.this$0.f58090a;
            String e = this.$param.mo115375e();
            String f = this.$param.mo115377f();
            this.label = 1;
            obj = BffUtilitiesManagementApi.DefaultImpls.getSecureTokenSTS$default(a, e, f, (String) null, (String) null, (String) null, this, 28, (Object) null);
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
            BffSecureTokenResponse bffSecureTokenResponse = (BffSecureTokenResponse) wVar.mo30572a();
            if (bffSecureTokenResponse == null || (data = bffSecureTokenResponse.getData()) == null) {
                bffSecureToken = null;
            } else {
                bffSecureToken = data.getSecureToken();
            }
            if (bffSecureToken != null) {
                if (bffSecureToken.getIdToken().length() <= 0) {
                    z = false;
                }
                if (z) {
                    Result.C10852a aVar = Result.f28060a;
                    return Result.m38701a(Result.m38702b(bffSecureToken.getIdToken()));
                }
            }
        }
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38701a(Result.m38702b(C11661u0.m45734a(new Throwable("could not get secure Token"))));
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<String>> cVar) {
        return ((UtilitiesGetSecureTokenUseCase$invoke$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
