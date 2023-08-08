package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.p056di.module.C36291w;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.C28935i;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import okhttp3.Authenticator;
import okhttp3.C12451Response;
import okhttp3.Request;
import okhttp3.Route;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class TokenAuthenticator implements Authenticator {

    /* renamed from: f */
    public static final int f89207f = 8;
    @C12579k

    /* renamed from: a */
    public final C12074o0 f89208a;
    @C12579k

    /* renamed from: b */
    public final Authenticator f89209b;
    @C12579k

    /* renamed from: c */
    public final C37694a f89210c;
    @C12579k

    /* renamed from: d */
    public final C28909d f89211d;
    @C12579k

    /* renamed from: e */
    public final BaseAppPreferencesStorage f89212e;

    @Inject
    public TokenAuthenticator(@C28659c @C12579k C12074o0 o0Var, @C12579k @C36291w Authenticator authenticator, @C12579k C37694a aVar, @C12579k C28909d dVar, @C12579k BaseAppPreferencesStorage baseAppPreferencesStorage) {
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        Intrinsics.checkNotNullParameter(authenticator, "delegate");
        Intrinsics.checkNotNullParameter(aVar, "logM");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferencesStorage");
        this.f89208a = o0Var;
        this.f89209b = authenticator;
        this.f89210c = aVar;
        this.f89211d = dVar;
        this.f89212e = baseAppPreferencesStorage;
    }

    @C12580l
    public Request authenticate(@C12580l Route route, @C12579k C12451Response response) {
        Object obj;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(this.f89209b.authenticate(route, response));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        Throwable e = Result.m38705e(obj);
        if (e != null) {
            C28935i iVar = C28935i.f70940a;
            String message = e.getMessage();
            C28935i.m119705e(iVar, "network error: " + message, (Throwable) null, 0, 6, (Object) null);
            C11723c2 unused = C12038j.m48061f(this.f89208a, (CoroutineContext) null, (CoroutineStart) null, new TokenAuthenticator$authenticate$2$1(this, e, response.request(), response, (C11045c<? super TokenAuthenticator$authenticate$2$1>) null), 3, (Object) null);
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw new NetworkException(message2, e);
        }
        if (Result.m38709i(obj)) {
            obj = null;
        }
        return (Request) obj;
    }
}
