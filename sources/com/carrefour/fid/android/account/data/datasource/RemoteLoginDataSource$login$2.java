package com.carrefour.fid.android.account.data.datasource;

import com.carrefour.fid.android.account.data.entities.LoginResponse;
import com.carrefour.fid.android.account.data.service.C13212c;
import com.carrefour.fid.android.shared.data.entities.extension.C28639a;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11067d(mo22501c = "com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource$login$2", mo22502f = "RemoteLoginDataSource.kt", mo22503i = {}, mo22504l = {30}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/account/data/entities/LoginResponse;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RemoteLoginDataSource$login$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends LoginResponse>>, Object> {
    final /* synthetic */ String $password;
    final /* synthetic */ String $userName;
    int label;
    final /* synthetic */ RemoteLoginDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteLoginDataSource$login$2(RemoteLoginDataSource remoteLoginDataSource, String str, String str2, C11045c<? super RemoteLoginDataSource$login$2> cVar) {
        super(1, cVar);
        this.this$0 = remoteLoginDataSource;
        this.$userName = str;
        this.$password = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new RemoteLoginDataSource$login$2(this.this$0, this.$userName, this.$password, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C13212c a = this.this$0.f32346a;
            HashMap c = this.this$0.mo31145e(this.$userName, this.$password);
            HashMap<String, String> a2 = this.this$0.f32347b.mo31320a(true);
            this.label = 1;
            obj = C13212c.C13213a.m57261a(a, c, a2, (String) null, this, 4, (Object) null);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C13091w wVar = (C13091w) obj;
        if (!wVar.mo30576g()) {
            Result.C10852a aVar = Result.f28060a;
            int b = wVar.mo30573b();
            String h2 = wVar.mo30577h();
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error login. " + b + " -> " + h2)));
        } else if (wVar.mo30572a() != null) {
            Result.C10852a aVar2 = Result.f28060a;
            LoginResponse loginResponse = (LoginResponse) wVar.mo30572a();
            if (loginResponse == null) {
                loginResponse = new LoginResponse((String) null, (String) null, (String) null, (String) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
            }
            obj2 = Result.m38702b(loginResponse);
        } else {
            Result.C10852a aVar3 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(C28639a.m118565d(wVar, "Error login. Empty body")));
        }
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<LoginResponse>> cVar) {
        return ((RemoteLoginDataSource$login$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
