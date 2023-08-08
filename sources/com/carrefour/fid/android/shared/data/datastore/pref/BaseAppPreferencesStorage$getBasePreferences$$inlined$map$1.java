package com.carrefour.fid.android.shared.data.datastore.pref;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1 implements C11907e<C28631e> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f70157a;

    /* renamed from: b */
    public final /* synthetic */ BaseAppPreferencesStorage f70158b;

    public BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1(C11907e eVar, BaseAppPreferencesStorage baseAppPreferencesStorage) {
        this.f70157a = eVar;
        this.f70158b = baseAppPreferencesStorage;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f70157a;
        final BaseAppPreferencesStorage baseAppPreferencesStorage = this.f70158b;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1.C286252.C286261
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1.C286252.C286261) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r7)
                    goto L_0x0056
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    kotlin.C11661u0.m45747n(r7)
                    kotlinx.coroutines.flow.f r7 = r4
                    androidx.datastore.preferences.core.a r6 = (androidx.datastore.preferences.core.C18602a) r6
                    com.carrefour.fid.android.shared.data.datastore.pref.e r2 = new com.carrefour.fid.android.shared.data.datastore.pref.e
                    com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage r4 = r2
                    androidx.datastore.preferences.core.a$a r4 = r4.f70156c
                    java.lang.Object r6 = r6.mo53694c(r4)
                    java.lang.String r6 = (java.lang.String) r6
                    if (r6 != 0) goto L_0x004a
                    java.lang.String r6 = ""
                L_0x004a:
                    r2.<init>(r6)
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0056
                    return r1
                L_0x0056:
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage$getBasePreferences$$inlined$map$1.C286252.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
