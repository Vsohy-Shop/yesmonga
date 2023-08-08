package com.carrefour.fid.android.core.p056di.module;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.auth.C36146b;
import com.carrefour.fid.android.core.auth.C36149d;
import com.carrefour.fid.android.core.auth.C36152g;
import com.carrefour.fid.android.core.auth.TokenProviderImpl;
import com.carrefour.fid.android.core.auth.TokenRefresherImpl;
import com.carrefour.fid.android.shared.network.C28812h;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.di.module.c */
public final class C36245c {

    /* renamed from: a */
    public static final int f89559a = 0;

    @C36291w
    @Singleton
    @C10315i
    @C12579k
    /* renamed from: a */
    public final Authenticator mo108211a(@C12579k TokenRefresherImpl tokenRefresherImpl, @C12579k C36146b bVar) {
        Intrinsics.checkNotNullParameter(tokenRefresherImpl, "tokenRefresher");
        Intrinsics.checkNotNullParameter(bVar, "bearerSelector");
        return new C36149d(tokenRefresherImpl, bVar, 0, 4, (DefaultConstructorMarker) null);
    }

    @C36292x
    @Singleton
    @C10315i
    @C12579k
    /* renamed from: b */
    public final Interceptor mo108212b(@C12579k TokenRefresherImpl tokenRefresherImpl, @C12579k C36146b bVar) {
        Intrinsics.checkNotNullParameter(tokenRefresherImpl, "tokenRefresher");
        Intrinsics.checkNotNullParameter(bVar, "bearerSelector");
        return new C36152g(tokenRefresherImpl, bVar);
    }

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: c */
    public final C28812h mo108213c(@C12579k TokenRefresherImpl tokenRefresherImpl) {
        Intrinsics.checkNotNullParameter(tokenRefresherImpl, "tokenRefresher");
        return new TokenProviderImpl(tokenRefresherImpl);
    }
}
