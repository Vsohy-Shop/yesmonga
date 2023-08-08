package com.carrefour.fid.android.shared.network.interceptors;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.d */
public final class C28818d implements Interceptor {

    /* renamed from: a */
    public static final int f70616a = 0;

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        boolean z;
        long j;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        if (request.body() != null) {
            RequestBody body = request.body();
            if (body != null) {
                j = body.contentLength();
            } else {
                j = 0;
            }
            if (j > 0) {
                z = true;
                if (HttpMethod.requiresRequestBody(request.method()) && !z) {
                    newBuilder.method(request.method(), RequestBody.Companion.create(C28819e.f70617a, MediaType.Companion.get("application/json")));
                }
                return chain.proceed(newBuilder.build());
            }
        }
        z = false;
        newBuilder.method(request.method(), RequestBody.Companion.create(C28819e.f70617a, MediaType.Companion.get("application/json")));
        return chain.proceed(newBuilder.build());
    }
}
