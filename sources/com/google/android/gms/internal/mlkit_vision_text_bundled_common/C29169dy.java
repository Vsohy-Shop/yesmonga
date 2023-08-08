package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.dy */
public final class C29169dy extends C29280gy {

    /* renamed from: a */
    public int f71212a = 0;

    /* renamed from: b */
    public final int f71213b;

    /* renamed from: c */
    public final /* synthetic */ zbwp f71214c;

    public C29169dy(zbwp zbwp) {
        this.f71214c = zbwp;
        this.f71213b = zbwp.mo84991i();
    }

    public final boolean hasNext() {
        return this.f71212a < this.f71213b;
    }

    /* renamed from: i */
    public final byte mo84589i() {
        int i = this.f71212a;
        if (i < this.f71213b) {
            this.f71212a = i + 1;
            return this.f71214c.mo84990h(i);
        }
        throw new NoSuchElementException();
    }
}
