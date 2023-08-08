package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.network.C28811g;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.auth.g */
public final class C36152g implements Interceptor {

    /* renamed from: c */
    public static final int f89234c = 8;
    @C12579k

    /* renamed from: a */
    public final TokenRefresher f89235a;
    @C12579k

    /* renamed from: b */
    public final C36145a f89236b;

    public C36152g(@C12579k TokenRefresher tokenRefresher, @C12579k C36145a aVar) {
        Intrinsics.checkNotNullParameter(tokenRefresher, "tokenRefresher");
        Intrinsics.checkNotNullParameter(aVar, "bearerSelector");
        this.f89235a = tokenRefresher;
        this.f89236b = aVar;
    }

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        Object obj;
        boolean z;
        C28811g gVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this.f89235a) {
            Request request = chain.request();
            try {
                Result.C10852a aVar = Result.f28060a;
                if (!this.f89235a.mo107985b()) {
                    gVar = this.f89235a.mo107984a();
                } else {
                    gVar = this.f89235a.mo107988e();
                }
                obj = Result.m38702b(gVar);
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            if (Result.m38709i(obj)) {
                obj = null;
            }
            C28811g gVar2 = (C28811g) obj;
            if (gVar2 == null) {
                C12451Response proceed = chain.proceed(request);
                return proceed;
            }
            String a = this.f89236b.mo107991a(request, gVar2);
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C12451Response proceed2 = chain.proceed(request);
                return proceed2;
            }
            Request.Builder newBuilder = request.newBuilder();
            C12451Response proceed3 = chain.proceed(newBuilder.header(C28534f.f69113B, "Bearer " + a).build());
            return proceed3;
        }
    }
}
