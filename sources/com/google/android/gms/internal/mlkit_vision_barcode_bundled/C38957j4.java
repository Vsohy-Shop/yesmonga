package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j4 */
public final class C38957j4 extends C38954j1 {

    /* renamed from: a */
    public final C38996n4 f98875a;

    /* renamed from: b */
    public C38964k1 f98876b = mo122937b();

    /* renamed from: c */
    public final /* synthetic */ zzgh f98877c;

    public C38957j4(zzgh zzgh) {
        this.f98877c = zzgh;
        this.f98875a = new C38996n4(zzgh, (C38987m4) null);
    }

    /* renamed from: b */
    public final C38964k1 mo122937b() {
        if (this.f98875a.hasNext()) {
            return this.f98875a.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f98876b != null;
    }

    public final byte zza() {
        C38964k1 k1Var = this.f98876b;
        if (k1Var != null) {
            byte zza = k1Var.zza();
            if (!this.f98876b.hasNext()) {
                this.f98876b = mo122937b();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
