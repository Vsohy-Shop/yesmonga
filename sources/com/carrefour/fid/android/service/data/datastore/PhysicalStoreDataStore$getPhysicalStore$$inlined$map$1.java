package com.carrefour.fid.android.service.data.datastore;

import com.carrefour.fid.android.domain.models.service.models.C38163l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, mo22516d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/d2;", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1 implements C11907e<C38163l> {
    final /* synthetic */ C11907e $this_unsafeTransform$inlined;
    final /* synthetic */ PhysicalStoreDataStore this$0;

    public PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1(C11907e eVar, PhysicalStoreDataStore physicalStoreDataStore) {
        this.$this_unsafeTransform$inlined = eVar;
        this.this$0 = physicalStoreDataStore;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.$this_unsafeTransform$inlined;
        final PhysicalStoreDataStore physicalStoreDataStore = this.this$0;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1.C283472.C283481
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1.C283472.C283481) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1$2$1
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
                    com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore r2 = r2
                    androidx.datastore.preferences.core.a$a r2 = r2.storeKey
                    java.lang.Object r7 = r7.mo53694c(r2)
                    java.lang.String r7 = (java.lang.String) r7
                    if (r7 == 0) goto L_0x0061
                    com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore r2 = r2
                    kotlinx.serialization.json.a r2 = r2.json
                    kotlinx.serialization.modules.e r4 = r2.mo25277a()
                    java.lang.Class<com.carrefour.fid.android.domain.models.service.models.l> r5 = com.carrefour.fid.android.domain.models.service.models.C38163l.class
                    kotlin.reflect.r r5 = kotlin.jvm.internal.C11342l0.m43538A(r5)
                    kotlinx.serialization.g r4 = kotlinx.serialization.C12442r.m50317h(r4, r5)
                    java.lang.Object r7 = r2.mo25278b(r4, r7)
                    com.carrefour.fid.android.domain.models.service.models.l r7 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r7
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
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.datastore.PhysicalStoreDataStore$getPhysicalStore$$inlined$map$1.C283472.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
