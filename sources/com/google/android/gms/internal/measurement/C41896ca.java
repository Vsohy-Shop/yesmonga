package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ca */
public class C41896ca {

    /* renamed from: c */
    public static final C41931e9 f106049c = C41931e9.f106096d;

    /* renamed from: a */
    public volatile C42246wa f106050a;

    /* renamed from: b */
    public volatile zzka f106051b;

    /* renamed from: a */
    public final int mo136659a() {
        if (this.f106051b != null) {
            return ((zzjx) this.f106051b).zza.length;
        }
        if (this.f106050a != null) {
            return this.f106050a.mo137271b();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzka mo136660b() {
        if (this.f106051b != null) {
            return this.f106051b;
        }
        synchronized (this) {
            if (this.f106051b != null) {
                zzka zzka = this.f106051b;
                return zzka;
            }
            if (this.f106050a == null) {
                this.f106051b = zzka.f106708a;
            } else {
                this.f106051b = this.f106050a.mo136763h();
            }
            zzka zzka2 = this.f106051b;
            return zzka2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136661c(com.google.android.gms.internal.measurement.C42246wa r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.wa r0 = r1.f106050a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.wa r0 = r1.f106050a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f106050a = r2     // Catch:{ zzll -> 0x0011 }
            com.google.android.gms.internal.measurement.zzka r0 = com.google.android.gms.internal.measurement.zzka.f106708a     // Catch:{ zzll -> 0x0011 }
            r1.f106051b = r0     // Catch:{ zzll -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f106050a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zzka r2 = com.google.android.gms.internal.measurement.zzka.f106708a     // Catch:{ all -> 0x001b }
            r1.f106051b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41896ca.mo136661c(com.google.android.gms.internal.measurement.wa):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41896ca)) {
            return false;
        }
        C41896ca caVar = (C41896ca) obj;
        C42246wa waVar = this.f106050a;
        C42246wa waVar2 = caVar.f106050a;
        if (waVar == null && waVar2 == null) {
            return mo136660b().equals(caVar.mo136660b());
        }
        if (waVar != null && waVar2 != null) {
            return waVar.equals(waVar2);
        }
        if (waVar != null) {
            caVar.mo136661c(waVar.mo137176f());
            return waVar.equals(caVar.f106050a);
        }
        mo136661c(waVar2.mo137176f());
        return this.f106050a.equals(waVar2);
    }

    public int hashCode() {
        return 1;
    }
}
