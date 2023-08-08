package com.carrefour.fid.android.various.data.datastore.datatsource;

import com.carrefour.fid.android.various.domain.model.AppMessage;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class AppMessageDataStore$getAppVersionMessage$$inlined$map$1 implements C11907e<AppMessage> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f58288a;

    /* renamed from: b */
    public final /* synthetic */ AppMessageDataStore f58289b;

    public AppMessageDataStore$getAppVersionMessage$$inlined$map$1(C11907e eVar, AppMessageDataStore appMessageDataStore) {
        this.f58288a = eVar;
        this.f58289b = appMessageDataStore;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f58288a;
        final AppMessageDataStore appMessageDataStore = this.f58289b;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$getAppVersionMessage$$inlined$map$1.C227622.C227631
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$getAppVersionMessage$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$getAppVersionMessage$$inlined$map$1.C227622.C227631) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$getAppVersionMessage$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$getAppVersionMessage$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x006b
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r4
                    androidx.datastore.preferences.core.a r7 = (androidx.datastore.preferences.core.C18602a) r7
                    com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore r2 = r2
                    androidx.datastore.preferences.core.a$a r2 = r2.f58282d
                    java.lang.Object r7 = r7.mo53694c(r2)
                    java.lang.String r7 = (java.lang.String) r7
                    if (r7 == 0) goto L_0x0061
                    com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore r2 = r2
                    kotlinx.serialization.json.a r2 = r2.f58283e
                    kotlinx.serialization.modules.e r4 = r2.mo25277a()
                    java.lang.Class<com.carrefour.fid.android.various.domain.model.AppMessage> r5 = com.carrefour.fid.android.various.domain.model.AppMessage.class
                    kotlin.reflect.r r5 = kotlin.jvm.internal.C11342l0.m43538A(r5)
                    kotlinx.serialization.g r4 = kotlinx.serialization.C12442r.m50317h(r4, r5)
                    java.lang.Object r7 = r2.mo25278b(r4, r7)
                    com.carrefour.fid.android.various.domain.model.AppMessage r7 = (com.carrefour.fid.android.various.domain.model.AppMessage) r7
                    goto L_0x0062
                L_0x0061:
                    r7 = 0
                L_0x0062:
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x006b
                    return r1
                L_0x006b:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$getAppVersionMessage$$inlined$map$1.C227622.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
