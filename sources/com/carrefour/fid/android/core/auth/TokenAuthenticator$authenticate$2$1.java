package com.carrefour.fid.android.core.auth;

import com.carrefour.fid.android.C13140a;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.models.logm.LogMAction;
import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.carrefour.fid.android.domain.models.logm.LogMSeverity;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.data.datastore.pref.C28631e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import okhttp3.C12451Response;
import okhttp3.Request;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.core.auth.TokenAuthenticator$authenticate$2$1", mo22502f = "TokenAuthenticator.kt", mo22503i = {}, mo22504l = {50, 45}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TokenAuthenticator$authenticate$2$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Throwable $it;
    final /* synthetic */ Request $request;
    final /* synthetic */ C12451Response $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ TokenAuthenticator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenAuthenticator$authenticate$2$1(TokenAuthenticator tokenAuthenticator, Throwable th, Request request, C12451Response response, C11045c<? super TokenAuthenticator$authenticate$2$1> cVar) {
        super(2, cVar);
        this.this$0 = tokenAuthenticator;
        this.$it = th;
        this.$request = request;
        this.$response = response;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new TokenAuthenticator$authenticate$2$1(this.this$0, this.$it, this.$request, this.$response, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        String str;
        LogMSeverity logMSeverity;
        LogMAction logMAction;
        Object obj2;
        C37694a aVar;
        String str2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            aVar = this.this$0.f89210c;
            LogMAction logMAction2 = LogMAction.NETWORK_CALL;
            String message = this.$it.getMessage();
            if (message == null) {
                message = "";
            }
            LogMSeverity logMSeverity2 = LogMSeverity.ERROR;
            BaseAppPreferencesStorage b = this.this$0.f89212e;
            this.L$0 = logMAction2;
            this.L$1 = message;
            this.L$2 = logMSeverity2;
            this.L$3 = aVar;
            this.label = 1;
            obj2 = b.mo83495c(this);
            if (obj2 == h) {
                return h;
            }
            str = message;
            logMSeverity = logMSeverity2;
            logMAction = logMAction2;
        } else if (i == 1) {
            aVar = (C37694a) this.L$3;
            C11661u0.m45747n(obj);
            logMSeverity = (LogMSeverity) this.L$2;
            str = (String) this.L$1;
            logMAction = (LogMAction) this.L$0;
            obj2 = obj;
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            ((Result) obj).mo21858l();
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String d = ((C28631e) obj2).mo83520d();
        String header = this.$request.header("X-Correlation-Id");
        if (header == null) {
            str2 = "";
        } else {
            str2 = header;
        }
        String httpUrl = this.$request.url().toString();
        LogMEntry logMEntry = new LogMEntry((String) null, logMAction, str2, (String) null, (String) null, (String) null, (Long) null, (String) null, d, logMSeverity, String.valueOf(this.$response.code()), (String) null, this.this$0.f89211d.mo84151b(), str, httpUrl, C13140a.f32263e, this.$request.method(), 2297, (DefaultConstructorMarker) null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (aVar.m172966invokegIAlus(logMEntry, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((TokenAuthenticator$authenticate$2$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
