package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.ak */
public class C41146ak {

    /* renamed from: c */
    public static final C41673wi f104445c = C41673wi.m168680a();

    /* renamed from: a */
    public volatile C41627uk f104446a;

    /* renamed from: b */
    public volatile zztd f104447b;

    /* renamed from: a */
    public final int mo135033a() {
        if (this.f104447b != null) {
            return ((zzta) this.f104447b).zza.length;
        }
        if (this.f104446a != null) {
            return this.f104446a.mo135623b();
        }
        return 0;
    }

    /* renamed from: b */
    public final zztd mo135034b() {
        if (this.f104447b != null) {
            return this.f104447b;
        }
        synchronized (this) {
            if (this.f104447b != null) {
                zztd zztd = this.f104447b;
                return zztd;
            }
            if (this.f104446a == null) {
                this.f104447b = zztd.f105744a;
            } else {
                this.f104447b = this.f104446a.mo135930j();
            }
            zztd zztd2 = this.f104447b;
            return zztd2;
        }
    }

    /* renamed from: c */
    public final C41627uk mo135035c(C41627uk ukVar) {
        C41627uk ukVar2 = this.f104446a;
        this.f104447b = null;
        this.f104446a = ukVar;
        return ukVar2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135036d(com.google.android.gms.internal.gtm.C41627uk r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.gtm.uk r0 = r1.f104446a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.gtm.uk r0 = r1.f104446a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f104446a = r2     // Catch:{ zzvk -> 0x0011 }
            com.google.android.gms.internal.gtm.zztd r0 = com.google.android.gms.internal.gtm.zztd.f105744a     // Catch:{ zzvk -> 0x0011 }
            r1.f104447b = r0     // Catch:{ zzvk -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f104446a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.gtm.zztd r2 = com.google.android.gms.internal.gtm.zztd.f105744a     // Catch:{ all -> 0x001b }
            r1.f104447b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41146ak.mo135036d(com.google.android.gms.internal.gtm.uk):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41146ak)) {
            return false;
        }
        C41146ak akVar = (C41146ak) obj;
        C41627uk ukVar = this.f104446a;
        C41627uk ukVar2 = akVar.f104446a;
        if (ukVar == null && ukVar2 == null) {
            return mo135034b().equals(akVar.mo135034b());
        }
        if (ukVar != null && ukVar2 != null) {
            return ukVar.equals(ukVar2);
        }
        if (ukVar != null) {
            akVar.mo135036d(ukVar.mo135365h());
            return ukVar.equals(akVar.f104446a);
        }
        mo135036d(ukVar2.mo135365h());
        return this.f104446a.equals(ukVar2);
    }

    public int hashCode() {
        return 1;
    }
}
