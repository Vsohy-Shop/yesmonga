package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.network.C28811g;
import com.carrefour.fid.android.shared.network.C28812h;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class TokenProviderImpl implements C28812h {

    /* renamed from: b */
    public static final int f89213b = 0;
    @C12579k

    /* renamed from: a */
    public final TokenRefresher f89214a;

    public TokenProviderImpl(@C12579k TokenRefresher tokenRefresher) {
        Intrinsics.checkNotNullParameter(tokenRefresher, "tokenRefresher");
        this.f89214a = tokenRefresher;
    }

    @C12580l
    /* renamed from: a */
    public Object mo83891a(@C12579k C11045c<? super C28811g> cVar) {
        return C11965h.m47673h(C11768d1.m46781c(), new TokenProviderImpl$getToken$2(this, (C11045c<? super TokenProviderImpl$getToken$2>) null), cVar);
    }
}
