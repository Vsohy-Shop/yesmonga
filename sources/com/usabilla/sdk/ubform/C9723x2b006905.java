package com.usabilla.sdk.ubform;

import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import kotlinx.coroutines.flow.C11908f;

/* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$invokeSuspend$$inlined$collect$1 */
public final class C9723x2b006905 implements C11908f<FormModel> {

    /* renamed from: a */
    public final /* synthetic */ UsabillaInternal f26688a;

    /* renamed from: b */
    public final /* synthetic */ String f26689b;

    /* renamed from: c */
    public final /* synthetic */ C10110e f26690c;

    /* renamed from: d */
    public final /* synthetic */ C9826e f26691d;

    public C9723x2b006905(UsabillaInternal usabillaInternal, String str, C10110e eVar, C9826e eVar2) {
        this.f26688a = usabillaInternal;
        this.f26689b = str;
        this.f26690c = eVar;
        this.f26691d = eVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r30, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r31
            boolean r2 = r1 instanceof com.usabilla.sdk.ubform.C9723x2b006905.C97241
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$invokeSuspend$$inlined$collect$1$1 r2 = (com.usabilla.sdk.ubform.C9723x2b006905.C97241) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$invokeSuspend$$inlined$collect$1$1 r2 = new com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$invokeSuspend$$inlined$collect$1$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            java.lang.Object r2 = r2.L$0
            com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$invokeSuspend$$inlined$collect$1 r2 = (com.usabilla.sdk.ubform.C9723x2b006905) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0178
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            kotlin.C11661u0.m45747n(r1)
            r6 = r30
            com.usabilla.sdk.ubform.sdk.form.model.FormModel r6 = (com.usabilla.sdk.ubform.sdk.form.model.FormModel) r6
            com.usabilla.sdk.ubform.UsabillaInternal r1 = r0.f26688a
            java.util.concurrent.ConcurrentMap r1 = r1.mo19841F()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r7 = r1.size()
            int r7 = kotlin.collections.C10975r0.m41400j(r7)
            r4.<init>(r7)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x005e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r1.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = r7.toString()
            r4.put(r8, r7)
            goto L_0x005e
        L_0x007a:
            android.os.Bundle r9 = com.usabilla.sdk.ubform.utils.ext.C10131e.m38336a(r4)
            com.usabilla.sdk.ubform.UsabillaInternal r1 = r0.f26688a
            boolean r24 = r1.mo19840E()
            com.usabilla.sdk.ubform.UsabillaInternal r1 = r0.f26688a
            boolean r25 = r1.mo19879w()
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r13 = r0.f26689b
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 655291(0x9ffbb, float:9.18258E-40)
            r28 = 0
            com.usabilla.sdk.ubform.sdk.form.model.FormModel r1 = com.usabilla.sdk.ubform.sdk.form.model.FormModel.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            com.usabilla.sdk.ubform.e r6 = r0.f26691d
            r4.<init>(r6)
            r1.setSdkCallbackReference(r4)
            com.usabilla.sdk.ubform.sdk.form.PassiveFormFragment$a r4 = com.usabilla.sdk.ubform.sdk.form.PassiveFormFragment.f27640Z
            com.usabilla.sdk.ubform.UsabillaInternal r6 = r0.f26688a
            com.usabilla.sdk.ubform.PlayStoreInfo r6 = r6.mo19854f0()
            boolean r6 = r6.mo19797f()
            com.usabilla.sdk.ubform.sdk.form.PassiveFormFragment r4 = r4.mo21169a(r1, r6)
            java.util.List r6 = r1.getPages()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.C10978t.m41495Y(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x00dd:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00f9
            java.lang.Object r8 = r6.next()
            com.usabilla.sdk.ubform.sdk.page.model.PageModel r8 = (com.usabilla.sdk.ubform.sdk.page.model.PageModel) r8
            java.util.List r8 = r8.mo21412n()
            int r8 = r8.size()
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r8)
            r7.add(r8)
            goto L_0x00dd
        L_0x00f9:
            r6 = 0
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)
            java.util.Iterator r7 = r7.iterator()
        L_0x0102:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x011c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r6 = r6.intValue()
            int r6 = r6 + r8
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)
            goto L_0x0102
        L_0x011c:
            int r6 = r6.intValue()
            com.usabilla.sdk.ubform.telemetry.e r7 = r0.f26690c
            com.usabilla.sdk.ubform.telemetry.b$b$d r8 = new com.usabilla.sdk.ubform.telemetry.b$b$d
            java.lang.String r9 = "formElements"
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)
            r8.<init>(r9, r6)
            r7.mo21540b(r8)
            com.usabilla.sdk.ubform.UsabillaInternal r6 = r0.f26688a
            com.usabilla.sdk.ubform.sdk.form.model.FormModel r6 = r6.mo19847c()
            if (r6 != 0) goto L_0x015a
            com.usabilla.sdk.ubform.UsabillaInternal r6 = r0.f26688a
            r6.mo19838C(r1)
            com.usabilla.sdk.ubform.UsabillaInternal r1 = r0.f26688a
            com.usabilla.sdk.ubform.utils.d r1 = r1.f26663b
            kotlinx.coroutines.CoroutineDispatcher r1 = r1.mo21561a()
            com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$2$1 r6 = new com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1$2$1
            com.usabilla.sdk.ubform.e r7 = r0.f26691d
            r8 = 0
            r6.<init>(r7, r4, r8)
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = kotlinx.coroutines.C11965h.m47673h(r1, r6, r2)
            if (r1 != r3) goto L_0x0177
            return r3
        L_0x015a:
            com.usabilla.sdk.ubform.Logger$Companion r1 = com.usabilla.sdk.ubform.Logger.f26647a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Passive form already present on screen. New form with id "
            r2.append(r3)
            java.lang.String r3 = r0.f26689b
            r2.append(r3)
            java.lang.String r3 = " not returned"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logInfo(r2)
        L_0x0177:
            r2 = r0
        L_0x0178:
            com.usabilla.sdk.ubform.telemetry.e r1 = r2.f26690c
            r1.stop()
            com.usabilla.sdk.ubform.UsabillaInternal r1 = r2.f26688a
            com.usabilla.sdk.ubform.AppInfo r2 = r1.mo19843Y()
            java.lang.String r2 = r2.mo19774t()
            r1.mo19868m0(r2)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.C9723x2b006905.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
