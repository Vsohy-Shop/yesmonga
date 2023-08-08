package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y4 */
public final class C39095y4 implements Iterator<Map.Entry> {

    /* renamed from: a */
    public int f98969a = -1;

    /* renamed from: b */
    public boolean f98970b;

    /* renamed from: c */
    public Iterator<Map.Entry> f98971c;

    /* renamed from: d */
    public final /* synthetic */ C38888c5 f98972d;

    public /* synthetic */ C39095y4(C38888c5 c5Var, C39086x4 x4Var) {
        this.f98972d = c5Var;
    }

    /* renamed from: b */
    public final Iterator<Map.Entry> mo123127b() {
        if (this.f98971c == null) {
            this.f98971c = this.f98972d.f98820c.entrySet().iterator();
        }
        return this.f98971c;
    }

    public final boolean hasNext() {
        if (this.f98969a + 1 < this.f98972d.f98819b.size()) {
            return true;
        }
        if (this.f98972d.f98820c.isEmpty()) {
            return false;
        }
        if (mo123127b().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f98970b = true;
        int i = this.f98969a + 1;
        this.f98969a = i;
        if (i < this.f98972d.f98819b.size()) {
            return (Map.Entry) this.f98972d.f98819b.get(this.f98969a);
        }
        return mo123127b().next();
    }

    public final void remove() {
        if (this.f98970b) {
            this.f98970b = false;
            this.f98972d.mo122826p();
            if (this.f98969a < this.f98972d.f98819b.size()) {
                C38888c5 c5Var = this.f98972d;
                int i = this.f98969a;
                this.f98969a = i - 1;
                Object unused = c5Var.mo122824n(i);
                return;
            }
            mo123127b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
