package com.carrefour.fid.android.core.datastore;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class AppPreferencesStorage$getAppPreferences$$inlined$map$1 implements C11907e<C36193a> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f89370a;

    public AppPreferencesStorage$getAppPreferences$$inlined$map$1(C11907e eVar) {
        this.f89370a = eVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f89370a.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r28, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r29) {
                /*
                    r27 = this;
                    r0 = r27
                    r1 = r29
                    boolean r2 = r1 instanceof com.carrefour.fid.android.core.datastore.AppPreferencesStorage$getAppPreferences$$inlined$map$1.C361902.C361911
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    com.carrefour.fid.android.core.datastore.AppPreferencesStorage$getAppPreferences$$inlined$map$1$2$1 r2 = (com.carrefour.fid.android.core.datastore.AppPreferencesStorage$getAppPreferences$$inlined$map$1.C361902.C361911) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    com.carrefour.fid.android.core.datastore.AppPreferencesStorage$getAppPreferences$$inlined$map$1$2$1 r2 = new com.carrefour.fid.android.core.datastore.AppPreferencesStorage$getAppPreferences$$inlined$map$1$2$1
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r4 = r2.label
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    kotlin.C11661u0.m45747n(r1)
                    goto L_0x0188
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    kotlin.C11661u0.m45747n(r1)
                    kotlinx.coroutines.flow.f r1 = r3
                    r4 = r28
                    androidx.datastore.preferences.core.a r4 = (androidx.datastore.preferences.core.C18602a) r4
                    com.carrefour.fid.android.core.datastore.a r15 = new com.carrefour.fid.android.core.datastore.a
                    com.carrefour.fid.android.shared.data.datastore.pref.a r6 = com.carrefour.fid.android.shared.data.datastore.pref.C28627a.f70161a
                    androidx.datastore.preferences.core.a$a r7 = r6.mo83503d()
                    java.lang.Object r7 = r4.mo53694c(r7)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    r8 = 0
                    if (r7 == 0) goto L_0x0055
                    boolean r7 = r7.booleanValue()
                    goto L_0x0056
                L_0x0055:
                    r7 = r8
                L_0x0056:
                    androidx.datastore.preferences.core.a$a r9 = r6.mo83504e()
                    java.lang.Object r9 = r4.mo53694c(r9)
                    java.lang.Integer r9 = (java.lang.Integer) r9
                    if (r9 == 0) goto L_0x0067
                    int r9 = r9.intValue()
                    goto L_0x0068
                L_0x0067:
                    r9 = r8
                L_0x0068:
                    androidx.datastore.preferences.core.a$a r10 = r6.mo83513n()
                    java.lang.Object r10 = r4.mo53694c(r10)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    if (r10 == 0) goto L_0x0079
                    int r10 = r10.intValue()
                    goto L_0x007a
                L_0x0079:
                    r10 = r8
                L_0x007a:
                    androidx.datastore.preferences.core.a$a r11 = r6.mo83509j()
                    java.lang.Object r11 = r4.mo53694c(r11)
                    java.lang.Integer r11 = (java.lang.Integer) r11
                    if (r11 == 0) goto L_0x008b
                    int r11 = r11.intValue()
                    goto L_0x008c
                L_0x008b:
                    r11 = r8
                L_0x008c:
                    androidx.datastore.preferences.core.a$a r12 = r6.mo83508i()
                    java.lang.Object r12 = r4.mo53694c(r12)
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    if (r12 == 0) goto L_0x009d
                    boolean r12 = r12.booleanValue()
                    goto L_0x009e
                L_0x009d:
                    r12 = r8
                L_0x009e:
                    androidx.datastore.preferences.core.a$a r13 = r6.mo83515p()
                    java.lang.Object r13 = r4.mo53694c(r13)
                    java.lang.Integer r13 = (java.lang.Integer) r13
                    if (r13 == 0) goto L_0x00af
                    int r13 = r13.intValue()
                    goto L_0x00b0
                L_0x00af:
                    r13 = r8
                L_0x00b0:
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83516q()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.lang.Long r14 = (java.lang.Long) r14
                    if (r14 == 0) goto L_0x00c1
                    long r16 = r14.longValue()
                    goto L_0x00c9
                L_0x00c1:
                    java.util.Calendar r14 = java.util.Calendar.getInstance()
                    long r16 = r14.getTimeInMillis()
                L_0x00c9:
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83500a()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    if (r14 == 0) goto L_0x00dc
                    boolean r14 = r14.booleanValue()
                    r18 = r14
                    goto L_0x00de
                L_0x00dc:
                    r18 = r8
                L_0x00de:
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83505f()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.util.Set r14 = (java.util.Set) r14
                    if (r14 != 0) goto L_0x00ee
                    java.util.Set r14 = kotlin.collections.C10930d1.m40892k()
                L_0x00ee:
                    r19 = r14
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83506g()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.util.Set r14 = (java.util.Set) r14
                    if (r14 != 0) goto L_0x0100
                    java.util.Set r14 = kotlin.collections.C10930d1.m40892k()
                L_0x0100:
                    r20 = r14
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83510k()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.util.Set r14 = (java.util.Set) r14
                    if (r14 != 0) goto L_0x0112
                    java.util.Set r14 = kotlin.collections.C10930d1.m40892k()
                L_0x0112:
                    r21 = r14
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83507h()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    if (r14 == 0) goto L_0x0127
                    boolean r14 = r14.booleanValue()
                    r22 = r14
                    goto L_0x0129
                L_0x0127:
                    r22 = r8
                L_0x0129:
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83511l()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.util.Set r14 = (java.util.Set) r14
                    if (r14 != 0) goto L_0x0139
                    java.util.Set r14 = kotlin.collections.C10930d1.m40892k()
                L_0x0139:
                    r23 = r14
                    androidx.datastore.preferences.core.a$a r14 = r6.mo83512m()
                    java.lang.Object r14 = r4.mo53694c(r14)
                    java.lang.Long r14 = (java.lang.Long) r14
                    if (r14 == 0) goto L_0x014c
                    long r24 = r14.longValue()
                    goto L_0x014e
                L_0x014c:
                    r24 = 0
                L_0x014e:
                    androidx.datastore.preferences.core.a$a r6 = r6.mo83502c()
                    java.lang.Object r4 = r4.mo53694c(r6)
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    if (r4 == 0) goto L_0x015f
                    boolean r4 = r4.booleanValue()
                    goto L_0x0160
                L_0x015f:
                    r4 = r8
                L_0x0160:
                    r6 = r15
                    r8 = r9
                    r9 = r10
                    r10 = r11
                    r11 = r12
                    r12 = r13
                    r13 = r16
                    r26 = r15
                    r15 = r18
                    r16 = r19
                    r17 = r20
                    r18 = r21
                    r19 = r22
                    r20 = r23
                    r21 = r24
                    r23 = r4
                    r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r23)
                    r2.label = r5
                    r4 = r26
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L_0x0188
                    return r3
                L_0x0188:
                    kotlin.d2 r1 = kotlin.C11079d2.f28267a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.core.datastore.AppPreferencesStorage$getAppPreferences$$inlined$map$1.C361902.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
