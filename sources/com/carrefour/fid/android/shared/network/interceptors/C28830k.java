package com.carrefour.fid.android.shared.network.interceptors;

import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.installations.remote.C33122c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.k */
public final class C28830k implements Interceptor {

    /* renamed from: a */
    public static final int f70628a = 0;

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request()).newBuilder().header(C33122c.f80338t, new CacheControl.Builder().maxAge(1, TimeUnit.HOURS).build().toString()).build();
    }
}
