package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g1 */
public final class C38924g1 extends C38954j1 {

    /* renamed from: a */
    public int f98848a = 0;

    /* renamed from: b */
    public final int f98849b;

    /* renamed from: c */
    public final /* synthetic */ zzdc f98850c;

    public C38924g1(zzdc zzdc) {
        this.f98850c = zzdc;
        this.f98849b = zzdc.mo123184k();
    }

    public final boolean hasNext() {
        return this.f98848a < this.f98849b;
    }

    public final byte zza() {
        int i = this.f98848a;
        if (i < this.f98849b) {
            this.f98848a = i + 1;
            return this.f98850c.mo123183h(i);
        }
        throw new NoSuchElementException();
    }
}
