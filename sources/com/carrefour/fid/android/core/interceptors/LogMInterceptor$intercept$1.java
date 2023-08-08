package com.carrefour.fid.android.core.interceptors;

import com.carrefour.fid.android.C13140a;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.models.logm.LogMAction;
import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.carrefour.fid.android.domain.models.logm.LogMSeverity;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.data.datastore.pref.C28631e;
import com.carrefour.fid.android.shared.util.C28932h;
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

@C11067d(mo22501c = "com.carrefour.fid.android.core.interceptors.LogMInterceptor$intercept$1", mo22502f = "LogMInterceptor.kt", mo22503i = {}, mo22504l = {44, 34}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/Result;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LogMInterceptor$intercept$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Result<? extends C11079d2>>, Object> {
    final /* synthetic */ Request $request;
    final /* synthetic */ C12451Response $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ LogMInterceptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogMInterceptor$intercept$1(LogMInterceptor logMInterceptor, Request request, C12451Response response, C11045c<? super LogMInterceptor$intercept$1> cVar) {
        super(2, cVar);
        this.this$0 = logMInterceptor;
        this.$request = request;
        this.$response = response;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LogMInterceptor$intercept$1(this.this$0, this.$request, this.$response, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        LogMAction logMAction;
        String str;
        Object c;
        String str2;
        C37694a aVar;
        String str3;
        String str4;
        LogMSeverity logMSeverity;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37694a d = this.this$0.f89643a;
            logMAction = LogMAction.NETWORK_CALL;
            String c2 = this.this$0.mo108311e(this.$request);
            String k = C28932h.f70914a.mo84241k(this.$response.receivedResponseAtMillis());
            if (!this.$response.isSuccessful()) {
                str = this.$response.peekBody(Long.MAX_VALUE).string();
            } else {
                str = new String();
            }
            BaseAppPreferencesStorage b = this.this$0.f89644b;
            this.L$0 = d;
            this.L$1 = logMAction;
            this.L$2 = c2;
            this.L$3 = k;
            this.L$4 = str;
            this.label = 1;
            c = b.mo83495c(this);
            if (c == h) {
                return h;
            }
            str2 = k;
            aVar = d;
            str3 = str;
            str4 = c2;
        } else if (i == 1) {
            logMAction = (LogMAction) this.L$1;
            C11661u0.m45747n(obj);
            str3 = (String) this.L$4;
            str2 = (String) this.L$3;
            str4 = (String) this.L$2;
            aVar = (C37694a) this.L$0;
            c = obj;
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
            return Result.m38701a(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LogMAction logMAction2 = logMAction;
        String d2 = ((C28631e) c).mo83520d();
        if (!this.$response.isSuccessful() || this.$response.body() == null) {
            logMSeverity = LogMSeverity.ERROR;
        } else {
            logMSeverity = LogMSeverity.INFO;
        }
        LogMEntry logMEntry = new LogMEntry((String) null, logMAction2, str4, (String) null, (String) null, str2, (Long) null, str3, d2, logMSeverity, String.valueOf(this.$response.code()), C28932h.f70914a.mo84241k(this.$response.sentRequestAtMillis()), this.this$0.f89645c.mo84151b(), (String) null, this.$request.url().toString(), C13140a.f32263e, this.$request.method(), 8281, (DefaultConstructorMarker) null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        Object r2 = aVar.m172966invokegIAlus(logMEntry, this);
        if (r2 == h) {
            return h;
        }
        obj2 = r2;
        return Result.m38701a(obj2);
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Result<C11079d2>> cVar) {
        return ((LogMInterceptor$intercept$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
