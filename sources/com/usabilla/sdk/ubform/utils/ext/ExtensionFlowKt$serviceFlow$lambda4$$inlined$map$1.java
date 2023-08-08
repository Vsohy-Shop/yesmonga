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

/* renamed from: com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1  reason: invalid class name */
public final class ExtensionFlowKt$serviceFlow$lambda4$$inlined$map$1 implements C11907e<Object> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27850a;

    /* renamed from: b */
    public final /* synthetic */ C9873j f27851b;

    /* renamed from: c */
    public final /* synthetic */ C11300l f27852c;

    public ExtensionFlowKt$serviceFlow$lambda4$$inlined$map$1(C11907e eVar, C9873j jVar, C11300l lVar) {
        this.f27850a = eVar;
        this.f27851b = jVar;
        this.f27852c = lVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27850a.collect(new C11908f<C9873j>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda4$$inlined$map$1.C101242.C101251
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda4$$inlined$map$1.C101242.C101251) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x005a
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r3
                    com.usabilla.sdk.ubform.net.http.j r7 = (com.usabilla.sdk.ubform.net.http.C9873j) r7
                    java.lang.String r7 = r7.getBody()
                    if (r7 != 0) goto L_0x0040
                    r7 = 0
                    goto L_0x004f
                L_0x0040:
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1 r2 = r2
                    kotlin.jvm.functions.l r4 = r2.f27852c
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$a r5 = new com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$a
                    com.usabilla.sdk.ubform.net.http.j r2 = r2.f27851b
                    r5.<init>(r2, r7)
                    java.lang.Object r7 = r4.invoke(r5)
                L_0x004f:
                    if (r7 == 0) goto L_0x005d
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                L_0x005d:
                    com.usabilla.sdk.ubform.response.UbError$UbEmptyBodyError r7 = new com.usabilla.sdk.ubform.response.UbError$UbEmptyBodyError
                    com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$map$1 r8 = r2
                    com.usabilla.sdk.ubform.net.http.j r8 = r8.f27851b
                    java.lang.String r0 = "UbResponse has body parameter null"
                    r7.<init>(r0, r8)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda4$$inlined$map$1.C101242.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
