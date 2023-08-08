package com.carrefour.fid.android.core.interceptors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28909d;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11970i;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class LogMInterceptor implements Interceptor {
    @C12579k

    /* renamed from: d */
    public static final C36314a f89640d = new C36314a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f89641e = 8;
    @C12579k

    /* renamed from: f */
    public static final String f89642f = "X-Correlation-Id";
    @C12579k

    /* renamed from: a */
    public final C37694a f89643a;
    @C12579k

    /* renamed from: b */
    public final BaseAppPreferencesStorage f89644b;
    @C12579k

    /* renamed from: c */
    public final C28909d f89645c;

    /* renamed from: com.carrefour.fid.android.core.interceptors.LogMInterceptor$a */
    public static final class C36314a {
        public /* synthetic */ C36314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36314a() {
        }
    }

    @Inject
    public LogMInterceptor(@C12579k C37694a aVar, @C12579k BaseAppPreferencesStorage baseAppPreferencesStorage, @C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(aVar, "remoteLogUseCase");
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferencesStorage");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        this.f89643a = aVar;
        this.f89644b = baseAppPreferencesStorage;
        this.f89645c = dVar;
    }

    /* renamed from: e */
    public final String mo108311e(Request request) {
        String header = request.header("X-Correlation-Id");
        if (header == null) {
            return "";
        }
        return header;
    }

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        C12451Response proceed = chain.proceed(request);
        Object unused = C11970i.m47708b((CoroutineContext) null, new LogMInterceptor$intercept$1(this, request, proceed, (C11045c<? super LogMInterceptor$intercept$1>) null), 1, (Object) null);
        return proceed;
    }
}
