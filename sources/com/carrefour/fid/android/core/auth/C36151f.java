package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.p056di.module.C36292x;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Interceptor;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.auth.f */
public final class C36151f implements Interceptor {

    /* renamed from: b */
    public static final int f89232b = 8;
    @C12579k

    /* renamed from: a */
    public final Interceptor f89233a;

    @Inject
    public C36151f(@C36292x @C12579k Interceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f89233a = interceptor;
    }

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return this.f89233a.intercept(chain);
    }
}
