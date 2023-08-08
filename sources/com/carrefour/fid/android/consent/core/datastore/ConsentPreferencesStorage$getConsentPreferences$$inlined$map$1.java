package com.carrefour.fid.android.consent.core.datastore;

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
public final class ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1 implements C11907e<ConsentPreferences> {
    final /* synthetic */ C11907e $this_unsafeTransform$inlined;

    public ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1(C11907e eVar) {
        this.$this_unsafeTransform$inlined = eVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1.C361082.C361091
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1.C361082.C361091) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x005b
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r3
                    androidx.datastore.preferences.core.a r7 = (androidx.datastore.preferences.core.C18602a) r7
                    com.carrefour.fid.android.consent.core.datastore.ConsentPreferences r2 = new com.carrefour.fid.android.consent.core.datastore.ConsentPreferences
                    com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesKeys r4 = com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesKeys.INSTANCE
                    androidx.datastore.preferences.core.a$a r4 = r4.getCONSENT_SKIP_DATE()
                    java.lang.Object r7 = r7.mo53694c(r4)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 == 0) goto L_0x004d
                    long r4 = r7.longValue()
                    goto L_0x004f
                L_0x004d:
                    r4 = 0
                L_0x004f:
                    r2.<init>(r4)
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x005b
                    return r1
                L_0x005b:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage$getConsentPreferences$$inlined$map$1.C361082.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
