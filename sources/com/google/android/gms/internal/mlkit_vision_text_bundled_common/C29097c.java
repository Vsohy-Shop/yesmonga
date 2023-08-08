package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.c */
public final class C29097c implements Iterator<Map.Entry> {

    /* renamed from: a */
    public int f71170a = -1;

    /* renamed from: b */
    public boolean f71171b;

    /* renamed from: c */
    public Iterator<Map.Entry> f71172c;

    /* renamed from: d */
    public final /* synthetic */ C29245g f71173d;

    public /* synthetic */ C29097c(C29245g gVar, r10 r10) {
        this.f71173d = gVar;
    }

    /* renamed from: b */
    public final Iterator<Map.Entry> mo84545b() {
        if (this.f71172c == null) {
            this.f71172c = this.f71173d.f71250c.entrySet().iterator();
        }
        return this.f71172c;
    }

    public final boolean hasNext() {
        if (this.f71170a + 1 < this.f71173d.f71249b.size()) {
            return true;
        }
        if (this.f71173d.f71250c.isEmpty()) {
            return false;
        }
        if (mo84545b().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f71171b = true;
        int i = this.f71170a + 1;
        this.f71170a = i;
        if (i < this.f71173d.f71249b.size()) {
            return (Map.Entry) this.f71173d.f71249b.get(this.f71170a);
        }
        return mo84545b().next();
    }

    public final void remove() {
        if (this.f71171b) {
            this.f71171b = false;
            this.f71173d.mo84630p();
            if (this.f71170a < this.f71173d.f71249b.size()) {
                C29245g gVar = this.f71173d;
                int i = this.f71170a;
                this.f71170a = i - 1;
                Object unused = gVar.mo84628n(i);
                return;
            }
            mo84545b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
