package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.C21397o;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21282o;
import androidx.work.impl.C21290u;
import androidx.work.impl.C21367x;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.e */
public class C21303e implements Runnable {

    /* renamed from: c */
    public static final String f54964c = C21377l.m98584i("EnqueueRunnable");

    /* renamed from: a */
    public final C21367x f54965a;

    /* renamed from: b */
    public final C21282o f54966b;

    public C21303e(@C0359n0 C21367x xVar) {
        this(xVar, new C21282o());
    }

    /* renamed from: b */
    public static boolean m98374b(@C0359n0 C21367x xVar) {
        boolean c = m98375c(xVar.mo63741n(), xVar.mo63740m(), (String[]) C21367x.m98531s(xVar).toArray(new String[0]), xVar.mo63738k(), xVar.mo63736i());
        xVar.mo63744r();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m98375c(androidx.work.impl.C21191g0 r18, @androidx.annotation.C0359n0 java.util.List<? extends androidx.work.C21414w> r19, java.lang.String[] r20, java.lang.String r21, androidx.work.ExistingWorkPolicy r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r18.mo63363P()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0017
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0017
            r8 = r6
            goto L_0x0018
        L_0x0017:
            r8 = r7
        L_0x0018:
            if (r8 == 0) goto L_0x0065
            int r9 = r0.length
            r11 = r6
            r10 = r7
            r12 = r10
            r13 = r12
        L_0x001f:
            if (r10 >= r9) goto L_0x0068
            r14 = r0[r10]
            androidx.work.impl.model.v r15 = r5.mo63207X()
            androidx.work.impl.model.u r15 = r15.mo63539l(r14)
            if (r15 != 0) goto L_0x004d
            androidx.work.l r0 = androidx.work.C21377l.m98582e()
            java.lang.String r1 = f54964c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prerequisite "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo63776c(r1, r2)
            return r7
        L_0x004d:
            androidx.work.WorkInfo$State r14 = r15.f54805b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r14 != r15) goto L_0x0055
            r15 = r6
            goto L_0x0056
        L_0x0055:
            r15 = r7
        L_0x0056:
            r11 = r11 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r14 != r15) goto L_0x005d
            r13 = r6
            goto L_0x0062
        L_0x005d:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r14 != r15) goto L_0x0062
            r12 = r6
        L_0x0062:
            int r10 = r10 + 1
            goto L_0x001f
        L_0x0065:
            r11 = r6
            r12 = r7
            r13 = r12
        L_0x0068:
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x0073
            if (r8 != 0) goto L_0x0073
            r10 = r6
            goto L_0x0074
        L_0x0073:
            r10 = r7
        L_0x0074:
            if (r10 == 0) goto L_0x0152
            androidx.work.impl.model.v r10 = r5.mo63207X()
            java.util.List r10 = r10.mo63548u(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x0152
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND
            if (r2 == r14) goto L_0x00cf
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x008d
            goto L_0x00cf
        L_0x008d:
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.KEEP
            if (r2 != r14) goto L_0x00ac
            java.util.Iterator r2 = r10.iterator()
        L_0x0095:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00ac
            java.lang.Object r14 = r2.next()
            androidx.work.impl.model.u$b r14 = (androidx.work.impl.model.C21249u.C21251b) r14
            androidx.work.WorkInfo$State r14 = r14.f54825b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r14 == r15) goto L_0x00ab
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.f54360b
            if (r14 != r15) goto L_0x0095
        L_0x00ab:
            return r7
        L_0x00ac:
            r14 = r18
            androidx.work.impl.utils.c r2 = androidx.work.impl.utils.C21295c.m98359d(r1, r14, r7)
            r2.run()
            androidx.work.impl.model.v r2 = r5.mo63207X()
            java.util.Iterator r10 = r10.iterator()
        L_0x00bd:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x0155
            java.lang.Object r15 = r10.next()
            androidx.work.impl.model.u$b r15 = (androidx.work.impl.model.C21249u.C21251b) r15
            java.lang.String r15 = r15.f54824a
            r2.mo63529b(r15)
            goto L_0x00bd
        L_0x00cf:
            r14 = r18
            androidx.work.impl.model.b r8 = r5.mo63201R()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00de:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0119
            java.lang.Object r16 = r10.next()
            r6 = r16
            androidx.work.impl.model.u$b r6 = (androidx.work.impl.model.C21249u.C21251b) r6
            java.lang.String r7 = r6.f54824a
            boolean r7 = r8.mo63392d(r7)
            if (r7 != 0) goto L_0x0112
            androidx.work.WorkInfo$State r7 = r6.f54825b
            r17 = r8
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r7 != r8) goto L_0x00fe
            r8 = 1
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            r8 = r8 & r11
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.FAILED
            if (r7 != r11) goto L_0x0106
            r13 = 1
            goto L_0x010b
        L_0x0106:
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.CANCELLED
            if (r7 != r11) goto L_0x010b
            r12 = 1
        L_0x010b:
            java.lang.String r6 = r6.f54824a
            r15.add(r6)
            r11 = r8
            goto L_0x0114
        L_0x0112:
            r17 = r8
        L_0x0114:
            r8 = r17
            r6 = 1
            r7 = 0
            goto L_0x00de
        L_0x0119:
            androidx.work.ExistingWorkPolicy r6 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0145
            if (r12 != 0) goto L_0x0121
            if (r13 == 0) goto L_0x0145
        L_0x0121:
            androidx.work.impl.model.v r2 = r5.mo63207X()
            java.util.List r6 = r2.mo63548u(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x012d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013f
            java.lang.Object r7 = r6.next()
            androidx.work.impl.model.u$b r7 = (androidx.work.impl.model.C21249u.C21251b) r7
            java.lang.String r7 = r7.f54824a
            r2.mo63529b(r7)
            goto L_0x012d
        L_0x013f:
            java.util.List r15 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0145:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0150
            r8 = 1
            goto L_0x0154
        L_0x0150:
            r8 = 0
            goto L_0x0154
        L_0x0152:
            r14 = r18
        L_0x0154:
            r6 = 0
        L_0x0155:
            java.util.Iterator r2 = r19.iterator()
        L_0x0159:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e6
            java.lang.Object r7 = r2.next()
            androidx.work.w r7 = (androidx.work.C21414w) r7
            androidx.work.impl.model.u r10 = r7.mo63860d()
            if (r8 == 0) goto L_0x0180
            if (r11 != 0) goto L_0x0180
            if (r13 == 0) goto L_0x0174
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r10.f54805b = r15
            goto L_0x0182
        L_0x0174:
            if (r12 == 0) goto L_0x017b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r10.f54805b = r15
            goto L_0x0182
        L_0x017b:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r10.f54805b = r15
            goto L_0x0182
        L_0x0180:
            r10.f54817n = r3
        L_0x0182:
            androidx.work.WorkInfo$State r15 = r10.f54805b
            r19 = r2
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.ENQUEUED
            if (r15 != r2) goto L_0x018b
            r6 = 1
        L_0x018b:
            androidx.work.impl.model.v r2 = r5.mo63207X()
            java.util.List r15 = r18.mo63361N()
            androidx.work.impl.model.u r10 = androidx.work.impl.utils.C21305f.m98382c(r15, r10)
            r2.mo63534g(r10)
            if (r8 == 0) goto L_0x01bd
            int r2 = r0.length
            r10 = 0
        L_0x019e:
            if (r10 >= r2) goto L_0x01bd
            r15 = r0[r10]
            r17 = r0
            androidx.work.impl.model.a r0 = new androidx.work.impl.model.a
            r20 = r2
            java.lang.String r2 = r7.mo63858b()
            r0.<init>(r2, r15)
            androidx.work.impl.model.b r2 = r5.mo63201R()
            r2.mo63389a(r0)
            int r10 = r10 + 1
            r2 = r20
            r0 = r17
            goto L_0x019e
        L_0x01bd:
            r17 = r0
            androidx.work.impl.model.z r0 = r5.mo63208Y()
            java.lang.String r2 = r7.mo63858b()
            java.util.Set r10 = r7.mo63859c()
            r0.mo63387e(r2, r10)
            if (r9 == 0) goto L_0x01e0
            androidx.work.impl.model.o r0 = r5.mo63205V()
            androidx.work.impl.model.n r2 = new androidx.work.impl.model.n
            java.lang.String r7 = r7.mo63858b()
            r2.<init>(r1, r7)
            r0.mo63442a(r2)
        L_0x01e0:
            r2 = r19
            r0 = r17
            goto L_0x0159
        L_0x01e6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.C21303e.m98375c(androidx.work.impl.g0, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    /* renamed from: e */
    public static boolean m98376e(@C0359n0 C21367x xVar) {
        List<C21367x> l = xVar.mo63739l();
        boolean z = false;
        if (l != null) {
            for (C21367x next : l) {
                if (!next.mo63743q()) {
                    z |= m98376e(next);
                } else {
                    C21377l e = C21377l.m98582e();
                    String str = f54964c;
                    e.mo63782l(str, "Already enqueued work ids (" + TextUtils.join(", ", next.mo63737j()) + ")");
                }
            }
        }
        return m98374b(xVar) | z;
    }

    @C0344h1
    /* renamed from: a */
    public boolean mo63637a() {
        WorkDatabase P = this.f54965a.mo63741n().mo63363P();
        P.mo60905e();
        try {
            boolean e = m98376e(this.f54965a);
            P.mo60901O();
            return e;
        } finally {
            P.mo60908k();
        }
    }

    @C0359n0
    /* renamed from: d */
    public C21397o mo63638d() {
        return this.f54966b;
    }

    @C0344h1
    /* renamed from: f */
    public void mo63639f() {
        C21191g0 n = this.f54965a.mo63741n();
        C21290u.m98344b(n.mo63065o(), n.mo63363P(), n.mo63361N());
    }

    public void run() {
        try {
            if (!this.f54965a.mo63742o()) {
                if (mo63637a()) {
                    C21341s.m98460c(this.f54965a.mo63741n().mo63357H(), RescheduleReceiver.class, true);
                    mo63639f();
                }
                this.f54966b.mo63600b(C21397o.f55145a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f54965a + ")");
        } catch (Throwable th) {
            this.f54966b.mo63600b(new C21397o.C21399b.C21400a(th));
        }
    }

    public C21303e(@C0359n0 C21367x xVar, @C0359n0 C21282o oVar) {
        this.f54965a = xVar;
        this.f54966b = oVar;
    }
}
