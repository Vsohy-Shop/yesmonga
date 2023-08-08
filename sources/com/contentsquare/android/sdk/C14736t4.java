package com.contentsquare.android.sdk;

import java.util.List;

/* renamed from: com.contentsquare.android.sdk.t4 */
public final class C14736t4 extends C14869xe implements C14841we, C14325f5, Runnable {

    /* renamed from: E0 */
    public final C14653qc f36463E0;

    /* renamed from: F0 */
    public int f36464F0 = 0;

    /* renamed from: G0 */
    public boolean f36465G0;

    /* renamed from: H0 */
    public int f36466H0 = -1;

    /* renamed from: I0 */
    public Object f36467I0;

    /* renamed from: J0 */
    public Object f36468J0;

    /* renamed from: K0 */
    public Thread f36469K0;

    /* renamed from: X */
    public final int f36470X;

    /* renamed from: Y */
    public final int f36471Y;

    /* renamed from: Z */
    public final C14248c7 f36472Z;

    /* renamed from: w */
    public final Object f36473w;

    /* renamed from: x */
    public final C14501lb f36474x;

    /* renamed from: y */
    public final Object[] f36475y;

    /* renamed from: z */
    public final C14585o7<Object, Object, Boolean> f36476z;

    public C14736t4(Object obj, C14501lb lbVar, Object[] objArr, C14585o7<Object, Object, Boolean> o7Var, int i, int i2, C14248c7 c7Var) {
        this.f36473w = obj;
        this.f36467I0 = obj;
        this.f36468J0 = obj;
        this.f36474x = lbVar;
        this.f36475y = objArr;
        this.f36476z = o7Var;
        this.f36470X = i;
        this.f36471Y = i2;
        this.f36472Z = c7Var;
        this.f36463E0 = C14653qc.m63204a();
    }

    /* renamed from: k */
    public static int m63494k(Object[] objArr, int i) {
        C14169a3.m60810c(objArr[i].equals(6), "Inconsistent directive state for goLazy");
        return i + 1;
    }

    /* renamed from: l */
    public static C14841we m63495l(Object obj, List<C14501lb> list, int i, List<Object> list2, C14585o7<Object, Object, Boolean> o7Var, int i2, int i3, C14248c7 c7Var) {
        return new C14736t4(obj, C14377gc.m61914a(i, (C14501lb[]) list.toArray(new C14501lb[list.size()])), list2.toArray(), o7Var, i3, i2, c7Var);
    }

    /* renamed from: o */
    public static void m63496o(C14603p0 p0Var, C14441j4 j4Var, C14603p0 p0Var2, List<Object> list) {
        list.add(4);
        list.add(p0Var);
        list.add(j4Var);
        list.add(p0Var2);
    }

    /* renamed from: p */
    public static void m63497p(C14603p0 p0Var, List<Object> list) {
        list.add(9);
        list.add(p0Var);
    }

    /* renamed from: q */
    public static void m63498q(C14295e5 e5Var, C14585o7 o7Var, List<Object> list) {
        list.add(2);
        list.add(e5Var);
        list.add(o7Var);
    }

    /* renamed from: r */
    public static void m63499r(C14295e5 e5Var, List<Object> list) {
        list.add(1);
        list.add(e5Var);
    }

    /* renamed from: t */
    public static void m63500t(boolean z, List<Object> list) {
        list.add(0);
        list.add(Boolean.valueOf(z));
    }

    /* renamed from: u */
    public static int m63501u(Object[] objArr, int i) {
        C14169a3.m60810c(objArr[i].equals(5), "Inconsistent directive state for goTo");
        return i + 2;
    }

    /* renamed from: x */
    public static void m63502x(C14603p0 p0Var, List<Object> list) {
        list.add(3);
        list.add(p0Var);
    }

    /* renamed from: A */
    public final void mo36465A(Object obj) {
        boolean booleanValue = this.f36476z.mo34474c(this.f36467I0, obj).booleanValue();
        this.f36467I0 = obj;
        if (booleanValue) {
            mo36860g();
        }
    }

    /* renamed from: B */
    public final int mo36466B(Object[] objArr, int i) {
        C14603p0 p0Var = objArr[i + 3];
        Object d = objArr[i + 1].mo34472d(this.f36468J0);
        if (objArr[i + 2].mo34476d(d)) {
            return i + 4;
        }
        mo36483s(d, p0Var);
        return -1;
    }

    /* renamed from: C */
    public final int mo36467C(Object[] objArr, int i) {
        if (objArr[i + 1].booleanValue()) {
            mo36479O();
            return -1;
        }
        mo36486y(this.f36468J0);
        return -1;
    }

    /* renamed from: D */
    public final int mo36468D(Object[] objArr, int i) {
        C14210b5 b5Var = (C14210b5) this.f36468J0;
        if (b5Var.mo34660k()) {
            mo36483s(b5Var.mo34655g(), C14458k1.m62280a());
            return -1;
        }
        this.f36468J0 = b5Var.mo34656h();
        return i + 1;
    }

    /* renamed from: E */
    public final int mo36469E(Object[] objArr, int i) {
        C14603p0 p0Var = objArr[i + 1];
        C14210b5 b5Var = (C14210b5) this.f36468J0;
        if (b5Var.mo34660k()) {
            this.f36468J0 = b5Var.mo34655g();
            return i + 2;
        }
        mo36483s(b5Var.mo34656h(), p0Var);
        return -1;
    }

    /* renamed from: F */
    public final int mo36470F(Object[] objArr, int i) {
        this.f36468J0 = C14169a3.m60808a(objArr[i + 1].mo34977c());
        return i + 2;
    }

    /* renamed from: G */
    public void mo36471G() {
        boolean z;
        Object obj;
        synchronized (this) {
            z = false;
            obj = null;
            if (this.f36464F0 == 2) {
                this.f36464F0 = 0;
                Object obj2 = this.f36468J0;
                Object obj3 = this.f36467I0;
                if (obj2 != obj3) {
                    this.f36468J0 = obj3;
                    obj = obj2;
                }
                z = this.f36465G0;
            }
        }
        if (obj != null) {
            this.f36472Z.mo34827b(obj);
        }
        if (z) {
            mo36477M();
        }
    }

    /* renamed from: H */
    public final int mo36472H(Object[] objArr, int i) {
        objArr[i + 1].execute(this);
        return -1;
    }

    /* renamed from: I */
    public final boolean mo36473I() {
        if (this.f36464F0 != 2) {
            return false;
        }
        this.f36463E0.obtainMessage(5, this).sendToTarget();
        return true;
    }

    /* renamed from: J */
    public final int mo36474J(Object[] objArr, int i) {
        this.f36468J0 = C14169a3.m60808a(objArr[i + 2].mo34474c(this.f36468J0, objArr[i + 1].mo34977c()));
        return i + 3;
    }

    /* renamed from: K */
    public final void mo36475K() {
        if (this.f36465G0) {
            this.f36463E0.obtainMessage(4, this).sendToTarget();
        }
    }

    /* renamed from: L */
    public final int mo36476L(Object[] objArr, int i) {
        objArr[i + 1].mo34827b(this.f36468J0);
        return i + 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        return;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36477M() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f36464F0     // Catch:{ all -> 0x0022 }
            r1 = 1
            if (r0 == 0) goto L_0x0011
            r2 = 4
            if (r0 != r2) goto L_0x000a
            goto L_0x0011
        L_0x000a:
            r2 = 2
            if (r0 != r2) goto L_0x000f
            r3.f36465G0 = r1     // Catch:{ all -> 0x0022 }
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            return
        L_0x0011:
            r3.f36464F0 = r1     // Catch:{ all -> 0x0022 }
            r0 = -1
            r3.f36466H0 = r0     // Catch:{ all -> 0x0022 }
            r0 = 0
            r3.f36465G0 = r0     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            java.lang.Object r1 = r3.f36467I0
            r3.f36468J0 = r1
            r3.mo36485w(r0, r0)
            return
        L_0x0022:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14736t4.mo36477M():void");
    }

    /* renamed from: N */
    public final int mo36478N(Object[] objArr, int i) {
        this.f36468J0 = C14169a3.m60808a(objArr[i + 1].mo34472d(this.f36468J0));
        return i + 2;
    }

    /* renamed from: O */
    public final void mo36479O() {
        Object obj;
        synchronized (this) {
            this.f36464F0 = 0;
            obj = this.f36468J0;
            Object obj2 = this.f36467I0;
            if (obj != obj2) {
                this.f36468J0 = obj2;
            } else {
                obj = null;
            }
            mo36475K();
        }
        if (obj != null) {
            this.f36472Z.mo34827b(obj);
        }
    }

    /* renamed from: a */
    public void mo34402a() {
        mo36481n(this.f36471Y, true);
        mo36477M();
    }

    /* renamed from: c */
    public synchronized Object mo34977c() {
        if (this.f36464F0 == 4) {
            int i = this.f36466H0;
            this.f36464F0 = 5;
            mo36485w(m63494k(this.f36475y, i), false);
        }
        return this.f36467I0;
    }

    /* renamed from: h */
    public void mo35377h() {
        this.f36474x.mo34979d(this);
        mo36477M();
    }

    /* renamed from: i */
    public void mo35378i() {
        this.f36474x.mo34978c(this);
        mo36481n(this.f36470X, false);
    }

    /* renamed from: m */
    public final void mo36480m(int i) {
        this.f36466H0 = i;
        this.f36464F0 = 4;
        mo36860g();
        mo36475K();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36481n(int r4, boolean r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f36464F0     // Catch:{ all -> 0x002c }
            r1 = 1
            r2 = 3
            if (r0 == r1) goto L_0x0009
            if (r0 != r2) goto L_0x0020
        L_0x0009:
            r3.f36465G0 = r5     // Catch:{ all -> 0x002c }
            r0 = r4 & 1
            if (r0 != 0) goto L_0x0011
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return
        L_0x0011:
            r0 = 2
            r3.f36464F0 = r0     // Catch:{ all -> 0x002c }
            r0 = r4 & 5
            r1 = 5
            if (r0 != r1) goto L_0x0020
            java.lang.Thread r0 = r3.f36469K0     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0020
            r0.interrupt()     // Catch:{ all -> 0x002c }
        L_0x0020:
            if (r5 != 0) goto L_0x002a
            r4 = r4 & r2
            if (r4 != r2) goto L_0x002a
            java.lang.Object r4 = r3.f36473w     // Catch:{ all -> 0x002c }
            r3.mo36465A(r4)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14736t4.mo36481n(int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        mo36485w(m63501u(r5.f36475y, r1), true);
        java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r5.f36469K0 != r0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r5.f36469K0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            monitor-enter(r5)
            int r1 = r5.f36466H0     // Catch:{ all -> 0x0042 }
            int r2 = r5.f36464F0     // Catch:{ all -> 0x0042 }
            r3 = 3
            r4 = 1
            if (r2 == r3) goto L_0x0013
            r3 = 2
            if (r2 != r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = r4
        L_0x0014:
            java.lang.String r3 = "Illegal call of Runnable.run()"
            com.contentsquare.android.sdk.C14169a3.m60810c(r2, r3)     // Catch:{ all -> 0x0042 }
            r2 = -1
            r5.f36466H0 = r2     // Catch:{ all -> 0x0042 }
            boolean r2 = r5.mo36473I()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0024
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            return
        L_0x0024:
            r5.f36464F0 = r4     // Catch:{ all -> 0x0042 }
            r5.f36469K0 = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            java.lang.Object[] r2 = r5.f36475y
            int r1 = m63501u(r2, r1)
            r5.mo36485w(r1, r4)
            java.lang.Thread.interrupted()
            monitor-enter(r5)
            java.lang.Thread r1 = r5.f36469K0     // Catch:{ all -> 0x003f }
            if (r1 != r0) goto L_0x003d
            r0 = 0
            r5.f36469K0 = r0     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            throw r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14736t4.run():void");
    }

    /* renamed from: s */
    public final void mo36483s(Object obj, C14603p0 p0Var) {
        if (p0Var == null) {
            mo36479O();
        } else {
            mo36486y(C14169a3.m60808a(p0Var.mo34472d(obj)));
        }
    }

    /* renamed from: v */
    public final void mo36484v(int i) {
        this.f36466H0 = i;
        this.f36464F0 = 3;
    }

    /* renamed from: w */
    public final void mo36485w(int i, boolean z) {
        Object[] objArr = this.f36475y;
        int length = objArr.length;
        while (i >= 0 && i < length) {
            int intValue = ((Integer) objArr[i]).intValue();
            if (z || intValue == 5 || intValue == 6) {
                synchronized (this) {
                    if (!mo36473I()) {
                        if (intValue == 5) {
                            mo36484v(i);
                        } else if (intValue == 6) {
                            mo36480m(i);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            switch (intValue) {
                case 0:
                    i = mo36467C(objArr, i);
                    break;
                case 1:
                    i = mo36470F(objArr, i);
                    break;
                case 2:
                    i = mo36474J(objArr, i);
                    break;
                case 3:
                    i = mo36478N(objArr, i);
                    break;
                case 4:
                    i = mo36466B(objArr, i);
                    break;
                case 5:
                    i = mo36472H(objArr, i);
                    break;
                case 7:
                    i = mo36476L(objArr, i);
                    break;
                case 8:
                    i = mo36487z(objArr, i);
                    break;
                case 9:
                    i = mo36469E(objArr, i);
                    break;
                case 10:
                    i = mo36468D(objArr, i);
                    break;
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: y */
    public final synchronized void mo36486y(java.lang.Object r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x002d }
            int r0 = r3.f36464F0     // Catch:{ all -> 0x002a }
            r1 = 5
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            r3.f36464F0 = r2     // Catch:{ all -> 0x002a }
            java.lang.Object r1 = r3.f36468J0     // Catch:{ all -> 0x002a }
            if (r1 == r4) goto L_0x0014
            r3.f36468J0 = r4     // Catch:{ all -> 0x002a }
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            r3.f36467I0 = r4     // Catch:{ all -> 0x002a }
            goto L_0x001d
        L_0x001a:
            r3.mo36465A(r4)     // Catch:{ all -> 0x002a }
        L_0x001d:
            r3.mo36475K()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            com.contentsquare.android.sdk.c7 r4 = r3.f36472Z     // Catch:{ all -> 0x002d }
            r4.mo34827b(r1)     // Catch:{ all -> 0x002d }
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r4     // Catch:{ all -> 0x002d }
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14736t4.mo36486y(java.lang.Object):void");
    }

    /* renamed from: z */
    public final int mo36487z(Object[] objArr, int i) {
        objArr[i + 2].mo34828c(this.f36468J0, objArr[i + 1].mo34977c());
        return i + 3;
    }
}
