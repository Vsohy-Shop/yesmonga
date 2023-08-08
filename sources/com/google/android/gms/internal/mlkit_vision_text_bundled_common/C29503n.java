package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.n */
public final class C29503n implements Iterator<String> {

    /* renamed from: a */
    public final Iterator<String> f71365a;

    /* renamed from: b */
    public final /* synthetic */ C29540o f71366b;

    public C29503n(C29540o oVar) {
        this.f71366b = oVar;
        this.f71365a = oVar.f71377a.iterator();
    }

    public final boolean hasNext() {
        return this.f71365a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f71365a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
