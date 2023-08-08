package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.sa */
public class C14704sa {

    /* renamed from: e */
    public static final C14787v2 f36386e = C14787v2.m63752a();

    /* renamed from: a */
    public C14719t0 f36387a;

    /* renamed from: b */
    public C14787v2 f36388b;

    /* renamed from: c */
    public volatile C14218ba f36389c;

    /* renamed from: d */
    public volatile C14719t0 f36390d;

    /* renamed from: a */
    public int mo36395a() {
        if (this.f36390d != null) {
            return this.f36390d.size();
        }
        C14719t0 t0Var = this.f36387a;
        if (t0Var != null) {
            return t0Var.size();
        }
        if (this.f36389c != null) {
            return this.f36389c.mo34698c();
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f36389c = r4;
        r3.f36390d = com.contentsquare.android.sdk.C14719t0.f36442b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36396b(com.contentsquare.android.sdk.C14218ba r4) {
        /*
            r3 = this;
            com.contentsquare.android.sdk.ba r0 = r3.f36389c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.contentsquare.android.sdk.ba r0 = r3.f36389c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x000c:
            com.contentsquare.android.sdk.t0 r0 = r3.f36387a     // Catch:{ h5 -> 0x002a }
            if (r0 == 0) goto L_0x0023
            com.contentsquare.android.sdk.ee r0 = r4.mo34696b()     // Catch:{ h5 -> 0x002a }
            com.contentsquare.android.sdk.t0 r1 = r3.f36387a     // Catch:{ h5 -> 0x002a }
            com.contentsquare.android.sdk.v2 r2 = r3.f36388b     // Catch:{ h5 -> 0x002a }
            java.lang.Object r0 = r0.mo35090b(r1, r2)     // Catch:{ h5 -> 0x002a }
            com.contentsquare.android.sdk.ba r0 = (com.contentsquare.android.sdk.C14218ba) r0     // Catch:{ h5 -> 0x002a }
            r3.f36389c = r0     // Catch:{ h5 -> 0x002a }
            com.contentsquare.android.sdk.t0 r0 = r3.f36387a     // Catch:{ h5 -> 0x002a }
            goto L_0x0027
        L_0x0023:
            r3.f36389c = r4     // Catch:{ h5 -> 0x002a }
            com.contentsquare.android.sdk.t0 r0 = com.contentsquare.android.sdk.C14719t0.f36442b     // Catch:{ h5 -> 0x002a }
        L_0x0027:
            r3.f36390d = r0     // Catch:{ h5 -> 0x002a }
            goto L_0x0030
        L_0x002a:
            r3.f36389c = r4     // Catch:{ all -> 0x0032 }
            com.contentsquare.android.sdk.t0 r4 = com.contentsquare.android.sdk.C14719t0.f36442b     // Catch:{ all -> 0x0032 }
            r3.f36390d = r4     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14704sa.mo36396b(com.contentsquare.android.sdk.ba):void");
    }

    /* renamed from: c */
    public C14218ba mo36397c(C14218ba baVar) {
        mo36396b(baVar);
        return this.f36389c;
    }

    /* renamed from: d */
    public C14719t0 mo36398d() {
        if (this.f36390d != null) {
            return this.f36390d;
        }
        C14719t0 t0Var = this.f36387a;
        if (t0Var != null) {
            return t0Var;
        }
        synchronized (this) {
            if (this.f36390d != null) {
                C14719t0 t0Var2 = this.f36390d;
                return t0Var2;
            }
            this.f36390d = this.f36389c == null ? C14719t0.f36442b : this.f36389c.mo34699i();
            C14719t0 t0Var3 = this.f36390d;
            return t0Var3;
        }
    }

    /* renamed from: e */
    public C14218ba mo36399e(C14218ba baVar) {
        C14218ba baVar2 = this.f36389c;
        this.f36387a = null;
        this.f36390d = null;
        this.f36389c = baVar;
        return baVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14704sa)) {
            return false;
        }
        C14704sa saVar = (C14704sa) obj;
        C14218ba baVar = this.f36389c;
        C14218ba baVar2 = saVar.f36389c;
        return (baVar == null && baVar2 == null) ? mo36398d().equals(saVar.mo36398d()) : (baVar == null || baVar2 == null) ? baVar != null ? baVar.equals(saVar.mo36397c(baVar.mo35313Y())) : mo36397c(baVar2.mo35313Y()).equals(baVar2) : baVar.equals(baVar2);
    }

    public int hashCode() {
        return 1;
    }
}
