package com.carrefour.fid.android.core.auth;

import com.carrefour.fid.android.shared.network.C28811g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.core.auth.TokenProviderImpl$getToken$2", mo22502f = "TokenProvider.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lcom/carrefour/fid/android/shared/network/g;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TokenProviderImpl$getToken$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C28811g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TokenProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenProviderImpl$getToken$2(TokenProviderImpl tokenProviderImpl, C11045c<? super TokenProviderImpl$getToken$2> cVar) {
        super(2, cVar);
        this.this$0 = tokenProviderImpl;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TokenProviderImpl$getToken$2 tokenProviderImpl$getToken$2 = new TokenProviderImpl$getToken$2(this.this$0, cVar);
        tokenProviderImpl$getToken$2.L$0 = obj;
        return tokenProviderImpl$getToken$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        if (r3 != false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[Catch:{ all -> 0x0039 }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r5.label
            if (r0 != 0) goto L_0x0080
            kotlin.C11661u0.m45747n(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.o0 r6 = (kotlinx.coroutines.C12074o0) r6
            com.carrefour.fid.android.core.auth.TokenProviderImpl r6 = r5.this$0
            com.carrefour.fid.android.core.auth.TokenRefresher r6 = r6.f89214a
            com.carrefour.fid.android.core.auth.TokenProviderImpl r0 = r5.this$0
            monitor-enter(r6)
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ all -> 0x0039 }
            com.carrefour.fid.android.core.auth.TokenRefresher r1 = r0.f89214a     // Catch:{ all -> 0x0039 }
            boolean r1 = r1.mo107985b()     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002c
            com.carrefour.fid.android.core.auth.TokenRefresher r0 = r0.f89214a     // Catch:{ all -> 0x0039 }
            com.carrefour.fid.android.shared.network.g r0 = r0.mo107984a()     // Catch:{ all -> 0x0039 }
            goto L_0x0034
        L_0x002c:
            com.carrefour.fid.android.core.auth.TokenRefresher r0 = r0.f89214a     // Catch:{ all -> 0x0039 }
            com.carrefour.fid.android.shared.network.g r0 = r0.mo107988e()     // Catch:{ all -> 0x0039 }
        L_0x0034:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0044
        L_0x0039:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x007d }
        L_0x0044:
            boolean r1 = kotlin.Result.m38709i(r0)     // Catch:{ all -> 0x007d }
            r2 = 0
            if (r1 == 0) goto L_0x004c
            r0 = r2
        L_0x004c:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = r0.mo83888f()     // Catch:{ all -> 0x007d }
            goto L_0x0056
        L_0x0055:
            r1 = r2
        L_0x0056:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0063
            int r1 = r1.length()     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r1 = r3
            goto L_0x0064
        L_0x0063:
            r1 = r4
        L_0x0064:
            if (r1 == 0) goto L_0x007a
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r0.mo83886e()     // Catch:{ all -> 0x007d }
            goto L_0x006e
        L_0x006d:
            r1 = r2
        L_0x006e:
            if (r1 == 0) goto L_0x0076
            int r1 = r1.length()     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x0077
        L_0x0076:
            r3 = r4
        L_0x0077:
            if (r3 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r2 = r0
        L_0x007b:
            monitor-exit(r6)
            return r2
        L_0x007d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.auth.TokenProviderImpl$getToken$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C28811g> cVar) {
        return ((TokenProviderImpl$getToken$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
