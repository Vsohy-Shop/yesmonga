package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.o */
public final class C29540o extends AbstractList<String> implements RandomAccess, e00 {

    /* renamed from: a */
    public final e00 f71377a;

    public C29540o(e00 e00) {
        this.f71377a = e00;
    }

    /* renamed from: Q2 */
    public final List<?> mo84574Q2() {
        return this.f71377a.mo84574Q2();
    }

    /* renamed from: c3 */
    public final Object mo84576c3(int i) {
        return this.f71377a.mo84576c3(i);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((d00) this.f71377a).get(i);
    }

    public final Iterator<String> iterator() {
        return new C29503n(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C29466m(this, i);
    }

    public final int size() {
        return this.f71377a.size();
    }

    /* renamed from: x */
    public final e00 mo84581x() {
        return this;
    }
}
