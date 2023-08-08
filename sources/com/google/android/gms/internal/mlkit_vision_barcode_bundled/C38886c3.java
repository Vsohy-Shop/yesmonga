package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c3 */
public class C38886c3 {

    /* renamed from: c */
    public static final C39101z1 f98815c = C39101z1.m160998a();

    /* renamed from: a */
    public volatile C39076w3 f98816a;

    /* renamed from: b */
    public volatile zzdc f98817b;

    /* renamed from: a */
    public final int mo122807a() {
        if (this.f98817b != null) {
            return ((zzcz) this.f98817b).zza.length;
        }
        if (this.f98816a != null) {
            return this.f98816a.mo122992x();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzdc mo122808b() {
        if (this.f98817b != null) {
            return this.f98817b;
        }
        synchronized (this) {
            if (this.f98817b != null) {
                zzdc zzdc = this.f98817b;
                return zzdc;
            }
            if (this.f98816a == null) {
                this.f98817b = zzdc.f99077a;
            } else {
                this.f98817b = this.f98816a.mo123114y();
            }
            zzdc zzdc2 = this.f98817b;
            return zzdc2;
        }
    }

    /* renamed from: c */
    public final C39076w3 mo122809c(C39076w3 w3Var) {
        C39076w3 w3Var2 = this.f98816a;
        this.f98817b = null;
        this.f98816a = w3Var;
        return w3Var2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122810d(com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39076w3 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w3 r0 = r1.f98816a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w3 r0 = r1.f98816a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f98816a = r2     // Catch:{ zzep -> 0x0011 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc.f99077a     // Catch:{ zzep -> 0x0011 }
            r1.f98817b = r0     // Catch:{ zzep -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f98816a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc.f99077a     // Catch:{ all -> 0x001b }
            r1.f98817b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38886c3.mo122810d(com.google.android.gms.internal.mlkit_vision_barcode_bundled.w3):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38886c3)) {
            return false;
        }
        C38886c3 c3Var = (C38886c3) obj;
        C39076w3 w3Var = this.f98816a;
        C39076w3 w3Var2 = c3Var.f98816a;
        if (w3Var == null && w3Var2 == null) {
            return mo122808b().equals(c3Var.mo122808b());
        }
        if (w3Var != null && w3Var2 != null) {
            return w3Var.equals(w3Var2);
        }
        if (w3Var != null) {
            c3Var.mo122810d(w3Var.mo122909c());
            return w3Var.equals(c3Var.f98816a);
        }
        mo122810d(w3Var2.mo122909c());
        return this.f98816a.equals(w3Var2);
    }

    public int hashCode() {
        return 1;
    }
}
