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

@C11067d(mo22501c = "com.carrefour.fid.android.core.auth.TokenRefresherImpl$renewToken$2", mo22502f = "TokenRefresherImpl.kt", mo22503i = {1, 2}, mo22504l = {35, 46, 40}, mo22505m = "invokeSuspend", mo22506n = {"it", "it"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lcom/carrefour/fid/android/shared/network/g;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TokenRefresherImpl$renewToken$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C28811g>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ TokenRefresherImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenRefresherImpl$renewToken$2(TokenRefresherImpl tokenRefresherImpl, C11045c<? super TokenRefresherImpl$renewToken$2> cVar) {
        super(2, cVar);
        this.this$0 = tokenRefresherImpl;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new TokenRefresherImpl$renewToken$2(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f4 A[Catch:{ IOException -> 0x0059 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5 A[Catch:{ IOException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fe A[Catch:{ IOException -> 0x0059 }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r28
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            java.lang.String r3 = ""
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x002d
            if (r2 != r4) goto L_0x0025
            java.lang.Object r0 = r1.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.C11661u0.m45747n(r29)     // Catch:{ IOException -> 0x0059 }
            r2 = r29
            kotlin.Result r2 = (kotlin.Result) r2     // Catch:{ IOException -> 0x0059 }
            r2.mo21858l()     // Catch:{ IOException -> 0x0059 }
            goto L_0x00f6
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x002d:
            java.lang.Object r2 = r1.L$4
            com.carrefour.fid.android.domain.interactors.logm.a r2 = (com.carrefour.fid.android.domain.interactors.logm.C37694a) r2
            java.lang.Object r5 = r1.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$2
            com.carrefour.fid.android.domain.models.logm.LogMSeverity r6 = (com.carrefour.fid.android.domain.models.logm.LogMSeverity) r6
            java.lang.Object r7 = r1.L$1
            com.carrefour.fid.android.domain.models.logm.LogMAction r7 = (com.carrefour.fid.android.domain.models.logm.LogMAction) r7
            java.lang.Object r8 = r1.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.C11661u0.m45747n(r29)     // Catch:{ IOException -> 0x0059 }
            r20 = r5
            r18 = r6
            r10 = r7
            r7 = r8
            r5 = r29
            goto L_0x00b5
        L_0x004d:
            kotlin.C11661u0.m45747n(r29)     // Catch:{ IOException -> 0x0059 }
            r2 = r29
            kotlin.Result r2 = (kotlin.Result) r2     // Catch:{ IOException -> 0x0059 }
            java.lang.Object r2 = r2.mo21858l()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0079
        L_0x0059:
            r0 = move-exception
            goto L_0x0103
        L_0x005c:
            kotlin.C11661u0.m45747n(r29)
            com.carrefour.fid.android.shared.util.i r7 = com.carrefour.fid.android.shared.util.C28935i.f70940a     // Catch:{ IOException -> 0x0059 }
            java.lang.String r8 = "Refreshing token"
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.core.auth.TokenRefresherImpl r2 = r1.this$0     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = r2.f89217b     // Catch:{ IOException -> 0x0059 }
            r1.label = r6     // Catch:{ IOException -> 0x0059 }
            java.lang.Object r2 = r2.mo31356h(r1)     // Catch:{ IOException -> 0x0059 }
            if (r2 != r0) goto L_0x0079
            return r0
        L_0x0079:
            com.carrefour.fid.android.core.auth.TokenRefresherImpl r6 = r1.this$0     // Catch:{ IOException -> 0x0059 }
            java.lang.Throwable r7 = kotlin.Result.m38705e(r2)     // Catch:{ IOException -> 0x0059 }
            if (r7 != 0) goto L_0x008b
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ IOException -> 0x0059 }
            r2.booleanValue()     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.shared.network.g r0 = r6.mo107984a()     // Catch:{ IOException -> 0x0059 }
            return r0
        L_0x008b:
            com.carrefour.fid.android.domain.interactors.logm.a r2 = r6.f89219d     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.domain.models.logm.LogMAction r8 = com.carrefour.fid.android.domain.models.logm.LogMAction.TOKEN_REFRESH     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.domain.models.logm.LogMSeverity r9 = com.carrefour.fid.android.domain.models.logm.LogMSeverity.ERROR     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.shared.util.h$a r10 = com.carrefour.fid.android.shared.util.C28932h.f70914a     // Catch:{ IOException -> 0x0059 }
            java.lang.String r10 = r10.mo84245o()     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage r6 = r6.f89220e     // Catch:{ IOException -> 0x0059 }
            r1.L$0 = r7     // Catch:{ IOException -> 0x0059 }
            r1.L$1 = r8     // Catch:{ IOException -> 0x0059 }
            r1.L$2 = r9     // Catch:{ IOException -> 0x0059 }
            r1.L$3 = r10     // Catch:{ IOException -> 0x0059 }
            r1.L$4 = r2     // Catch:{ IOException -> 0x0059 }
            r1.label = r5     // Catch:{ IOException -> 0x0059 }
            java.lang.Object r5 = r6.mo83495c(r1)     // Catch:{ IOException -> 0x0059 }
            if (r5 != r0) goto L_0x00b0
            return r0
        L_0x00b0:
            r18 = r9
            r20 = r10
            r10 = r8
        L_0x00b5:
            com.carrefour.fid.android.shared.data.datastore.pref.e r5 = (com.carrefour.fid.android.shared.data.datastore.pref.C28631e) r5     // Catch:{ IOException -> 0x0059 }
            java.lang.String r17 = r5.mo83520d()     // Catch:{ IOException -> 0x0059 }
            java.util.UUID r5 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x0059 }
            java.lang.String r11 = r5.toString()     // Catch:{ IOException -> 0x0059 }
            com.carrefour.fid.android.domain.models.logm.LogMEntry r5 = new com.carrefour.fid.android.domain.models.logm.LogMEntry     // Catch:{ IOException -> 0x0059 }
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            java.lang.String r23 = "1"
            java.lang.String r24 = "17.7.1"
            r25 = 0
            r26 = 79097(0x134f9, float:1.10839E-40)
            r27 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IOException -> 0x0059 }
            r1.L$0 = r7     // Catch:{ IOException -> 0x0059 }
            r6 = 0
            r1.L$1 = r6     // Catch:{ IOException -> 0x0059 }
            r1.L$2 = r6     // Catch:{ IOException -> 0x0059 }
            r1.L$3 = r6     // Catch:{ IOException -> 0x0059 }
            r1.L$4 = r6     // Catch:{ IOException -> 0x0059 }
            r1.label = r4     // Catch:{ IOException -> 0x0059 }
            java.lang.Object r2 = r2.m172966invokegIAlus(r5, r1)     // Catch:{ IOException -> 0x0059 }
            if (r2 != r0) goto L_0x00f5
            return r0
        L_0x00f5:
            r0 = r7
        L_0x00f6:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0059 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ IOException -> 0x0059 }
            if (r4 != 0) goto L_0x00ff
            r4 = r3
        L_0x00ff:
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x0059 }
            throw r2     // Catch:{ IOException -> 0x0059 }
        L_0x0103:
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Error: refresh token "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            com.carrefour.fid.android.shared.io.NetworkException r2 = new com.carrefour.fid.android.shared.io.NetworkException
            java.lang.String r4 = r0.getMessage()
            if (r4 != 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r3 = r4
        L_0x012b:
            java.lang.Throwable r4 = r0.getCause()
            if (r4 != 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r0 = r4
        L_0x0133:
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.auth.TokenRefresherImpl$renewToken$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C28811g> cVar) {
        return ((TokenRefresherImpl$renewToken$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
