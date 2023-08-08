package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda-2$$inlined$map$1  reason: invalid class name */
public final class UsabillaInternal$sendEvent$1$invoke$lambda2$$inlined$map$1 implements C11907e<EventResult> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f26692a;

    /* renamed from: b */
    public final /* synthetic */ C10110e f26693b;

    /* renamed from: c */
    public final /* synthetic */ UsabillaInternal f26694c;

    public UsabillaInternal$sendEvent$1$invoke$lambda2$$inlined$map$1(C11907e eVar, C10110e eVar2, UsabillaInternal usabillaInternal) {
        this.f26692a = eVar;
        this.f26693b = eVar2;
        this.f26694c = usabillaInternal;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f26692a.collect(new C11908f<EventResult>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda2$$inlined$map$1.C97252.C97261
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda-2$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda2$$inlined$map$1.C97252.C97261) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda-2$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda-2$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r7)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    kotlin.C11661u0.m45747n(r7)
                    kotlinx.coroutines.flow.f r7 = r3
                    com.usabilla.sdk.ubform.eventengine.EventResult r6 = (com.usabilla.sdk.ubform.eventengine.EventResult) r6
                    com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda-2$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.telemetry.e r2 = r2.f26693b
                    r2.stop()
                    com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda-2$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.UsabillaInternal r2 = r2.f26694c
                    com.usabilla.sdk.ubform.AppInfo r4 = r2.mo19843Y()
                    java.lang.String r4 = r4.mo19774t()
                    r2.mo19868m0(r4)
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.UsabillaInternal$sendEvent$1$invoke$lambda2$$inlined$map$1.C97252.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
