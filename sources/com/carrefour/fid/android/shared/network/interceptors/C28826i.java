package com.carrefour.fid.android.shared.network.interceptors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28935i;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.C12500m;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.i */
public final class C28826i implements Interceptor {
    @C12579k

    /* renamed from: a */
    public static final C28827a f70625a = new C28827a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f70626b = 0;

    /* renamed from: com.carrefour.fid.android.shared.network.interceptors.i$a */
    public static final class C28827a {
        public /* synthetic */ C28827a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final String mo83895a(@C12579k Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            try {
                Request build = request.newBuilder().build();
                C12500m mVar = new C12500m();
                RequestBody body = build.body();
                if (body != null) {
                    body.writeTo(mVar);
                }
                return mVar.mo27268B3();
            } catch (IOException unused) {
                return "did not work";
            }
        }

        public C28827a() {
        }
    }

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        String str;
        Interceptor.Chain chain2 = chain;
        Intrinsics.checkNotNullParameter(chain2, "chain");
        Request request = chain.request();
        long nanoTime = System.nanoTime();
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format("Sending sendRequest(" + request.method() + ") %s on %s%n%s", Arrays.copyOf(new Object[]{request.url(), chain.connection(), request.headers()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        if (Intrinsics.areEqual((Object) request.method(), (Object) "POST") || Intrinsics.areEqual((Object) request.method(), (Object) "PUT")) {
            format = "\n" + format + "\n" + f70625a.mo83895a(request);
        }
        C28935i.m119704b(C28935i.f70940a, "sendRequest\n" + format, (Throwable) null, 0, 6, (Object) null);
        Intrinsics.checkNotNull(request, "null cannot be cast to non-null type okhttp3.Request");
        C12451Response proceed = chain2.proceed(request);
        String format2 = String.format("Received response for %s in %.1fms%n%s", Arrays.copyOf(new Object[]{proceed.request().url(), Double.valueOf(((double) (System.nanoTime() - nanoTime)) / 1000000.0d), proceed.headers()}, 3));
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        try {
            str = proceed.peekBody(Long.MAX_VALUE).string();
        } catch (Exception e) {
            e.printStackTrace();
            str = new String();
        }
        if (proceed.isSuccessful()) {
            C28935i.m119704b(C28935i.f70940a, "response(" + proceed.request().method() + "): " + proceed.code() + "\n" + format2 + "\n" + str, (Throwable) null, 0, 6, (Object) null);
        } else {
            C28935i.m119705e(C28935i.f70940a, "response(" + proceed.request().method() + "): " + proceed.code() + "\n" + format2 + "\n" + str, (Throwable) null, 0, 6, (Object) null);
        }
        return proceed;
    }
}
