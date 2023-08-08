package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

public class c00 {

    /* renamed from: c */
    public static final C29908xy f71174c = C29908xy.m121340a();

    /* renamed from: a */
    public volatile x00 f71175a;

    /* renamed from: b */
    public volatile zbwp f71176b;

    /* renamed from: a */
    public final int mo84549a() {
        if (this.f71176b != null) {
            return ((zbwm) this.f71176b).zba.length;
        }
        if (this.f71175a != null) {
            return this.f71175a.mo84727b();
        }
        return 0;
    }

    /* renamed from: b */
    public final zbwp mo84550b() {
        if (this.f71176b != null) {
            return this.f71176b;
        }
        synchronized (this) {
            if (this.f71176b != null) {
                zbwp zbwp = this.f71176b;
                return zbwp;
            }
            if (this.f71175a == null) {
                this.f71176b = zbwp.f71626a;
            } else {
                this.f71176b = this.f71175a.mo84804e0();
            }
            zbwp zbwp2 = this.f71176b;
            return zbwp2;
        }
    }

    /* renamed from: c */
    public final x00 mo84551c(x00 x00) {
        x00 x002 = this.f71175a;
        this.f71176b = null;
        this.f71175a = x00;
        return x002;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84552d(com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r0 = r1.f71175a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00 r0 = r1.f71175a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f71175a = r2     // Catch:{ zbye -> 0x0011 }
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp.f71626a     // Catch:{ zbye -> 0x0011 }
            r1.f71176b = r0     // Catch:{ zbye -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f71175a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwp.f71626a     // Catch:{ all -> 0x001b }
            r1.f71176b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.c00.mo84552d(com.google.android.gms.internal.mlkit_vision_text_bundled_common.x00):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00 = (c00) obj;
        x00 x00 = this.f71175a;
        x00 x002 = c00.f71175a;
        if (x00 == null && x002 == null) {
            return mo84550b().equals(c00.mo84550b());
        }
        if (x00 != null && x002 != null) {
            return x00.equals(x002);
        }
        if (x00 != null) {
            c00.mo84552d(x00.mo84649i());
            return x00.equals(c00.f71175a);
        }
        mo84552d(x002.mo84649i());
        return this.f71175a.equals(x002);
    }

    public int hashCode() {
        return 1;
    }
}
