package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n4 */
public final class C38996n4 implements Iterator<zzcy> {

    /* renamed from: a */
    public final ArrayDeque<zzgh> f98903a;

    /* renamed from: b */
    public zzcy f98904b;

    public /* synthetic */ C38996n4(zzdc zzdc, C38987m4 m4Var) {
        if (zzdc instanceof zzgh) {
            zzgh zzgh = (zzgh) zzdc;
            ArrayDeque<zzgh> arrayDeque = new ArrayDeque<>(zzgh.mo123187r());
            this.f98903a = arrayDeque;
            arrayDeque.push(zzgh);
            this.f98904b = mo122969c(zzgh.zzd);
            return;
        }
        this.f98903a = null;
        this.f98904b = (zzcy) zzdc;
    }

    /* renamed from: b */
    public final zzcy next() {
        zzcy zzcy;
        zzcy zzcy2 = this.f98904b;
        if (zzcy2 != null) {
            do {
                ArrayDeque<zzgh> arrayDeque = this.f98903a;
                zzcy = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f98904b = zzcy;
                } else {
                    zzcy = mo122969c(this.f98903a.pop().zze);
                }
            } while (zzcy.mo123184k() == 0);
            this.f98904b = zzcy;
            return zzcy2;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public final zzcy mo122969c(zzdc zzdc) {
        while (zzdc instanceof zzgh) {
            zzgh zzgh = (zzgh) zzdc;
            this.f98903a.push(zzgh);
            zzdc = zzgh.zzd;
        }
        return (zzcy) zzdc;
    }

    public final boolean hasNext() {
        return this.f98904b != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
