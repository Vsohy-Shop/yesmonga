package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.network.C28811g;
import java.io.IOException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C11970i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public abstract class TokenRefresher {

    /* renamed from: a */
    public static final int f89215a = 0;

    @C12580l
    /* renamed from: a */
    public final C28811g mo107984a() {
        return mo107986c();
    }

    /* renamed from: b */
    public abstract boolean mo107985b();

    @C12580l
    /* renamed from: c */
    public abstract C28811g mo107986c();

    @C12580l
    /* renamed from: d */
    public abstract Object mo107987d(@C12579k C11045c<? super C28811g> cVar);

    @C12580l
    /* renamed from: e */
    public final C28811g mo107988e() throws IOException {
        return (C28811g) C11970i.m47708b((CoroutineContext) null, new TokenRefresher$synchronouslyRenewToken$1(this, (C11045c<? super TokenRefresher$synchronouslyRenewToken$1>) null), 1, (Object) null);
    }
}
