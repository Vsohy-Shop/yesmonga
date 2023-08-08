package com.carrefour.fid.android.shared.network.interceptors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.network.C28802c;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.m */
public final class C28833m implements Interceptor {

    /* renamed from: b */
    public static final int f70630b = 8;
    @C12579k

    /* renamed from: a */
    public final C28802c f70631a;

    @Inject
    public C28833m(@C12579k C28802c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "connectionManager");
        this.f70631a = cVar;
    }

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.f70631a.mo83873b()) {
            return chain.proceed(chain.request());
        }
        throw new NetworkException("No network connection", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }
}
