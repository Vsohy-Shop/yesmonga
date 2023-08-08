package com.usabilla.sdk.ubform.utils.ext;

import com.usabilla.sdk.ubform.net.http.C9873j;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ExtensionFlowKt$serviceFlow$$inlined$map$1 implements C11907e<Object> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27845a;

    /* renamed from: b */
    public final /* synthetic */ C11300l f27846b;

    /* renamed from: c */
    public final /* synthetic */ C11300l f27847c;

    public ExtensionFlowKt$serviceFlow$$inlined$map$1(C11907e eVar, C11300l lVar, C11300l lVar2) {
        this.f27845a = eVar;
        this.f27846b = lVar;
        this.f27847c = lVar2;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27845a.collect(new C11908f<C9873j>() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x007f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1.C101222.C101231
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1.C101222.C101231) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1$2$1
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x003d
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    kotlin.C11661u0.m45747n(r11)
                    goto L_0x0080
                L_0x002d:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0035:
                    java.lang.Object r10 = r0.L$0
                    kotlinx.coroutines.flow.f r10 = (kotlinx.coroutines.flow.C11908f) r10
                    kotlin.C11661u0.m45747n(r11)
                    goto L_0x0075
                L_0x003d:
                    kotlin.C11661u0.m45747n(r11)
                    kotlinx.coroutines.flow.f r11 = r3
                    com.usabilla.sdk.ubform.net.http.j r10 = (com.usabilla.sdk.ubform.net.http.C9873j) r10
                    kotlinx.coroutines.flow.e r2 = kotlinx.coroutines.flow.C11909g.m47385M0(r10)
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1 r6 = new com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1 r7 = r2
                    kotlin.jvm.functions.l r7 = r7.f27846b
                    r6.<init>(r2, r10, r7)
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$catchException$1 r10 = new com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$catchException$1
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1 r2 = r2
                    kotlin.jvm.functions.l r2 = r2.f27847c
                    r10.<init>(r5, r2)
                    kotlinx.coroutines.flow.e r10 = kotlinx.coroutines.flow.C11909g.m47494u(r6, r10)
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$catchException$2 r2 = new com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$catchException$2
                    r2.<init>(r5)
                    kotlinx.coroutines.flow.e r10 = kotlinx.coroutines.flow.C11909g.m47494u(r10, r2)
                    r0.L$0 = r11
                    r0.label = r4
                    java.lang.Object r10 = kotlinx.coroutines.flow.C11909g.m47495u0(r10, r0)
                    if (r10 != r1) goto L_0x0072
                    return r1
                L_0x0072:
                    r8 = r11
                    r11 = r10
                    r10 = r8
                L_0x0075:
                    r0.L$0 = r5
                    r0.label = r3
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L_0x0080
                    return r1
                L_0x0080:
                    kotlin.d2 r10 = kotlin.C11079d2.f28267a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$$inlined$map$1.C101222.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
