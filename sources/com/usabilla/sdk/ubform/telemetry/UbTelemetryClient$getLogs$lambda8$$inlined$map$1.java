package com.usabilla.sdk.ubform.telemetry;

import com.usabilla.sdk.ubform.p007db.telemetry.C9783a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda-8$$inlined$map$1  reason: invalid class name */
public final class UbTelemetryClient$getLogs$lambda8$$inlined$map$1 implements C11907e<String> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27763a;

    /* renamed from: b */
    public final /* synthetic */ C9783a f27764b;

    /* renamed from: c */
    public final /* synthetic */ UbTelemetryClient f27765c;

    public UbTelemetryClient$getLogs$lambda8$$inlined$map$1(C11907e eVar, C9783a aVar, UbTelemetryClient ubTelemetryClient) {
        this.f27763a = eVar;
        this.f27764b = aVar;
        this.f27765c = ubTelemetryClient;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27763a.collect(new C11908f<List<? extends String>>() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda8$$inlined$map$1.C100922.C100931
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda-8$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda8$$inlined$map$1.C100922.C100931) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda-8$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda-8$$inlined$map$1$2$1
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    r4 = 2
                    if (r2 == 0) goto L_0x0045
                    if (r2 == r3) goto L_0x0035
                    if (r2 != r4) goto L_0x002d
                    kotlin.C11661u0.m45747n(r12)
                    goto L_0x00d5
                L_0x002d:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0035:
                    java.lang.Object r11 = r0.L$2
                    java.util.List r11 = (java.util.List) r11
                    java.lang.Object r2 = r0.L$1
                    kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
                    java.lang.Object r3 = r0.L$0
                    com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda-8$$inlined$map$1$2 r3 = (com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda8$$inlined$map$1.C100922) r3
                    kotlin.C11661u0.m45747n(r12)
                    goto L_0x0064
                L_0x0045:
                    kotlin.C11661u0.m45747n(r12)
                    kotlinx.coroutines.flow.f r2 = r3
                    java.util.List r11 = (java.util.List) r11
                    com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda-8$$inlined$map$1 r12 = r2
                    com.usabilla.sdk.ubform.db.telemetry.a r12 = r12.f27764b
                    kotlinx.coroutines.flow.e r12 = r12.mo20047a()
                    r0.L$0 = r10
                    r0.L$1 = r2
                    r0.L$2 = r11
                    r0.label = r3
                    java.lang.Object r12 = kotlinx.coroutines.flow.C11909g.m47374I1(r12, r0)
                    if (r12 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    r3 = r10
                L_0x0064:
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.ArrayList r12 = new java.util.ArrayList
                    r12.<init>()
                    java.util.Iterator r11 = r11.iterator()
                L_0x006f:
                    boolean r5 = r11.hasNext()
                    r6 = 0
                    if (r5 == 0) goto L_0x0092
                    java.lang.Object r5 = r11.next()
                    r7 = r5
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String r8 = "\"i\":"
                    r9 = 0
                    boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r8, (boolean) r9, (int) r4, (java.lang.Object) r6)
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L_0x006f
                    r12.add(r5)
                    goto L_0x006f
                L_0x0092:
                    boolean r11 = r12.isEmpty()
                    if (r11 == 0) goto L_0x009b
                    java.lang.String r11 = ""
                    goto L_0x00c6
                L_0x009b:
                    com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda-8$$inlined$map$1 r11 = r2
                    com.usabilla.sdk.ubform.telemetry.UbTelemetryClient r11 = r11.f27765c
                    com.usabilla.sdk.ubform.telemetry.d r11 = r11.f27757b
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r5 = 10
                    int r5 = kotlin.collections.C10978t.m41495Y(r12, r5)
                    r3.<init>(r5)
                    java.util.Iterator r12 = r12.iterator()
                L_0x00b2:
                    boolean r5 = r12.hasNext()
                    if (r5 == 0) goto L_0x00c2
                    java.lang.Object r5 = r12.next()
                    java.lang.String r5 = (java.lang.String) r5
                    r3.add(r5)
                    goto L_0x00b2
                L_0x00c2:
                    java.lang.String r11 = r11.mo21554b(r3)
                L_0x00c6:
                    r0.L$0 = r6
                    r0.L$1 = r6
                    r0.L$2 = r6
                    r0.label = r4
                    java.lang.Object r11 = r2.emit(r11, r0)
                    if (r11 != r1) goto L_0x00d5
                    return r1
                L_0x00d5:
                    kotlin.d2 r11 = kotlin.C11079d2.f28267a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.telemetry.UbTelemetryClient$getLogs$lambda8$$inlined$map$1.C100922.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
