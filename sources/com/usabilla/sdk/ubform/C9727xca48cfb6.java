package com.usabilla.sdk.ubform;

import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;

/* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$submitTelemetryData$1$invokeSuspend$$inlined$collect$1 */
public final class C9727xca48cfb6 implements C11908f<String> {

    /* renamed from: a */
    public final /* synthetic */ C12074o0 f26697a;

    /* renamed from: b */
    public final /* synthetic */ UsabillaInternal f26698b;

    /* renamed from: c */
    public final /* synthetic */ String f26699c;

    public C9727xca48cfb6(C12074o0 o0Var, UsabillaInternal usabillaInternal, String str) {
        this.f26697a = o0Var;
        this.f26698b = usabillaInternal;
        this.f26699c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.usabilla.sdk.ubform.C9727xca48cfb6.C97281
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.usabilla.sdk.ubform.UsabillaInternal$submitTelemetryData$1$invokeSuspend$$inlined$collect$1$1 r0 = (com.usabilla.sdk.ubform.C9727xca48cfb6.C97281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.usabilla.sdk.ubform.UsabillaInternal$submitTelemetryData$1$invokeSuspend$$inlined$collect$1$1 r0 = new com.usabilla.sdk.ubform.UsabillaInternal$submitTelemetryData$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0056
        L_0x0029:
            r5 = move-exception
            goto L_0x005c
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.C11661u0.m45747n(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = kotlin.text.C11622t.isBlank(r5)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0065
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0029 }
            com.usabilla.sdk.ubform.UsabillaInternal r6 = r4.f26698b     // Catch:{ all -> 0x0029 }
            com.usabilla.sdk.ubform.sdk.telemetry.a r6 = r6.mo19862j0()     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = r4.f26699c     // Catch:{ all -> 0x0029 }
            kotlinx.coroutines.flow.e r5 = r6.mo21520a(r2, r5)     // Catch:{ all -> 0x0029 }
            r0.label = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = kotlinx.coroutines.flow.C11909g.m47503x(r5, r0)     // Catch:{ all -> 0x0029 }
            if (r5 != r1) goto L_0x0056
            return r1
        L_0x0056:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0029 }
            kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x0065
        L_0x005c:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            kotlin.Result.m38702b(r5)
        L_0x0065:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.C9727xca48cfb6.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
