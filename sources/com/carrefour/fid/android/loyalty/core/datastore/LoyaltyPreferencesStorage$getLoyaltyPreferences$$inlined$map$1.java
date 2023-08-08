package com.carrefour.fid.android.loyalty.core.datastore;

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
public final class LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1 implements C11907e<LoyaltyPreferences> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f97014a;

    public LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1(C11907e eVar) {
        this.f97014a = eVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f97014a.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1.C382952.C382961
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1.C382952.C382961) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1$2$1
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r10)
                    goto L_0x0079
                L_0x0029:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0031:
                    kotlin.C11661u0.m45747n(r10)
                    kotlinx.coroutines.flow.f r10 = r3
                    androidx.datastore.preferences.core.a r9 = (androidx.datastore.preferences.core.C18602a) r9
                    com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences r2 = new com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferences
                    com.carrefour.fid.android.shared.data.datastore.pref.f r4 = com.carrefour.fid.android.shared.data.datastore.pref.C28632f.f70212a
                    androidx.datastore.preferences.core.a$a r5 = r4.mo83526c()
                    java.lang.Object r5 = r9.mo53694c(r5)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    r6 = 0
                    if (r5 == 0) goto L_0x004e
                    boolean r5 = r5.booleanValue()
                    goto L_0x004f
                L_0x004e:
                    r5 = r6
                L_0x004f:
                    androidx.datastore.preferences.core.a$a r7 = r4.mo83525b()
                    java.lang.Object r7 = r9.mo53694c(r7)
                    java.lang.String r7 = (java.lang.String) r7
                    if (r7 != 0) goto L_0x005d
                    java.lang.String r7 = ""
                L_0x005d:
                    androidx.datastore.preferences.core.a$a r4 = r4.mo83524a()
                    java.lang.Object r9 = r9.mo53694c(r4)
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    if (r9 == 0) goto L_0x006d
                    boolean r6 = r9.booleanValue()
                L_0x006d:
                    r2.<init>(r5, r7, r6)
                    r0.label = r3
                    java.lang.Object r9 = r10.emit(r2, r0)
                    if (r9 != r1) goto L_0x0079
                    return r1
                L_0x0079:
                    kotlin.d2 r9 = kotlin.C11079d2.f28267a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage$getLoyaltyPreferences$$inlined$map$1.C382952.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
