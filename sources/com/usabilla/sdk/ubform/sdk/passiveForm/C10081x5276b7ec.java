package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.net.C9851c;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager$resubmitPassiveFeedback$$inlined$map$1 */
public final class C10081x5276b7ec implements C11907e<Integer> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27722a;

    /* renamed from: b */
    public final /* synthetic */ PassiveResubmissionManager f27723b;

    public C10081x5276b7ec(C11907e eVar, PassiveResubmissionManager passiveResubmissionManager) {
        this.f27722a = eVar;
        this.f27723b = passiveResubmissionManager;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27722a.collect(new C11908f<List<? extends C9851c>>() {
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00f4  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x012c  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0132  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0167 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r19) {
                /*
                    r17 = this;
                    r1 = r17
                    r0 = r19
                    boolean r2 = r0 instanceof com.usabilla.sdk.ubform.sdk.passiveForm.C10081x5276b7ec.C100822.C100831
                    if (r2 == 0) goto L_0x0017
                    r2 = r0
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager$resubmitPassiveFeedback$$inlined$map$1$2$1 r2 = (com.usabilla.sdk.ubform.sdk.passiveForm.C10081x5276b7ec.C100822.C100831) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager$resubmitPassiveFeedback$$inlined$map$1$2$1 r2 = new com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager$resubmitPassiveFeedback$$inlined$map$1$2$1
                    r2.<init>(r1, r0)
                L_0x001c:
                    java.lang.Object r0 = r2.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r4 = r2.label
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    r8 = 0
                    if (r4 == 0) goto L_0x0063
                    if (r4 == r7) goto L_0x0046
                    if (r4 == r6) goto L_0x003d
                    if (r4 != r5) goto L_0x0035
                    kotlin.C11661u0.m45747n(r0)
                    goto L_0x0168
                L_0x0035:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x003d:
                    java.lang.Object r4 = r2.L$0
                    kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.C11908f) r4
                    kotlin.C11661u0.m45747n(r0)
                    goto L_0x0153
                L_0x0046:
                    java.lang.Object r4 = r2.L$5
                    java.lang.Object r9 = r2.L$4
                    java.util.Iterator r9 = (java.util.Iterator) r9
                    java.lang.Object r10 = r2.L$3
                    java.util.Collection r10 = (java.util.Collection) r10
                    java.lang.Object r11 = r2.L$2
                    java.util.List r11 = (java.util.List) r11
                    java.lang.Object r12 = r2.L$1
                    kotlinx.coroutines.flow.f r12 = (kotlinx.coroutines.flow.C11908f) r12
                    java.lang.Object r13 = r2.L$0
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager$resubmitPassiveFeedback$$inlined$map$1$2 r13 = (com.usabilla.sdk.ubform.sdk.passiveForm.C10081x5276b7ec.C100822) r13
                    kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0060 }
                    goto L_0x00cf
                L_0x0060:
                    r0 = move-exception
                    goto L_0x00dc
                L_0x0063:
                    kotlin.C11661u0.m45747n(r0)
                    kotlinx.coroutines.flow.f r0 = r3
                    r4 = r18
                    java.util.List r4 = (java.util.List) r4
                    com.usabilla.sdk.ubform.Logger$Companion r9 = com.usabilla.sdk.ubform.Logger.f26647a
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r11 = "Submit "
                    r10.append(r11)
                    int r11 = r4.size()
                    r10.append(r11)
                    java.lang.String r11 = " previously unsent feedback"
                    r10.append(r11)
                    java.lang.String r10 = r10.toString()
                    r9.logInfo(r10)
                    r9 = r4
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    java.util.Iterator r9 = r9.iterator()
                    r13 = r1
                    r11 = r4
                    r4 = r0
                L_0x009a:
                    boolean r0 = r9.hasNext()
                    if (r0 == 0) goto L_0x00f9
                    java.lang.Object r12 = r9.next()
                    r0 = r12
                    com.usabilla.sdk.ubform.net.c r0 = (com.usabilla.sdk.ubform.net.C9851c) r0
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager$resubmitPassiveFeedback$$inlined$map$1 r14 = r2
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager r14 = r14.f27723b
                    kotlin.Result$a r15 = kotlin.Result.f28060a     // Catch:{ all -> 0x00d6 }
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveFormService r14 = r14.f27720a     // Catch:{ all -> 0x00d6 }
                    kotlinx.coroutines.flow.e r0 = r14.mo21478g(r0)     // Catch:{ all -> 0x00d6 }
                    r2.L$0 = r13     // Catch:{ all -> 0x00d6 }
                    r2.L$1 = r4     // Catch:{ all -> 0x00d6 }
                    r2.L$2 = r11     // Catch:{ all -> 0x00d6 }
                    r2.L$3 = r10     // Catch:{ all -> 0x00d6 }
                    r2.L$4 = r9     // Catch:{ all -> 0x00d6 }
                    r2.L$5 = r12     // Catch:{ all -> 0x00d6 }
                    r2.label = r7     // Catch:{ all -> 0x00d6 }
                    java.lang.Object r0 = kotlinx.coroutines.flow.C11909g.m47503x(r0, r2)     // Catch:{ all -> 0x00d6 }
                    if (r0 != r3) goto L_0x00ca
                    return r3
                L_0x00ca:
                    r16 = r12
                    r12 = r4
                    r4 = r16
                L_0x00cf:
                    kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0060 }
                    java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0060 }
                    goto L_0x00e6
                L_0x00d6:
                    r0 = move-exception
                    r16 = r12
                    r12 = r4
                    r4 = r16
                L_0x00dc:
                    kotlin.Result$a r14 = kotlin.Result.f28060a
                    java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
                    java.lang.Object r0 = kotlin.Result.m38702b(r0)
                L_0x00e6:
                    boolean r0 = kotlin.Result.m38710j(r0)
                    java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r0)
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x00f7
                    r10.add(r4)
                L_0x00f7:
                    r4 = r12
                    goto L_0x009a
                L_0x00f9:
                    java.util.List r10 = (java.util.List) r10
                    com.usabilla.sdk.ubform.Logger$Companion r0 = com.usabilla.sdk.ubform.Logger.f26647a
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    int r9 = r10.size()
                    r7.append(r9)
                    java.lang.String r9 = " previously unsent feedback are sent; "
                    r7.append(r9)
                    int r9 = r11.size()
                    int r11 = r10.size()
                    int r9 = r9 - r11
                    r7.append(r9)
                    java.lang.String r9 = " still not sent"
                    r7.append(r9)
                    java.lang.String r7 = r7.toString()
                    r0.logInfo(r7)
                    boolean r0 = r10.isEmpty()
                    if (r0 == 0) goto L_0x0132
                    r0 = 0
                    java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r0)
                    goto L_0x0153
                L_0x0132:
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager$resubmitPassiveFeedback$$inlined$map$1 r0 = r2
                    com.usabilla.sdk.ubform.sdk.passiveForm.PassiveResubmissionManager r0 = r0.f27723b
                    com.usabilla.sdk.ubform.db.unsent.a r0 = r0.f27721b
                    kotlinx.coroutines.flow.e r0 = r0.mo20063c(r10)
                    r2.L$0 = r4
                    r2.L$1 = r8
                    r2.L$2 = r8
                    r2.L$3 = r8
                    r2.L$4 = r8
                    r2.L$5 = r8
                    r2.label = r6
                    java.lang.Object r0 = kotlinx.coroutines.flow.C11909g.m47374I1(r0, r2)
                    if (r0 != r3) goto L_0x0153
                    return r3
                L_0x0153:
                    r2.L$0 = r8
                    r2.L$1 = r8
                    r2.L$2 = r8
                    r2.L$3 = r8
                    r2.L$4 = r8
                    r2.L$5 = r8
                    r2.label = r5
                    java.lang.Object r0 = r4.emit(r0, r2)
                    if (r0 != r3) goto L_0x0168
                    return r3
                L_0x0168:
                    kotlin.d2 r0 = kotlin.C11079d2.f28267a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.passiveForm.C10081x5276b7ec.C100822.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
