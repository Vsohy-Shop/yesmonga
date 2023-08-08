package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.m */
public final class C30129m extends C30105k implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C30141n f72008d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30129m(C30141n nVar) {
        super(nVar);
        this.f72008d = nVar;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f72008d.isEmpty();
        mo85187b();
        ((ListIterator) this.f71959a).add(obj);
        zzao zzao = this.f72008d.f72033f;
        zzao.f72392d = zzao.f72392d + 1;
        if (isEmpty) {
            this.f72008d.mo85201e();
        }
    }

    public final boolean hasPrevious() {
        mo85187b();
        return ((ListIterator) this.f71959a).hasPrevious();
    }

    public final int nextIndex() {
        mo85187b();
        return ((ListIterator) this.f71959a).nextIndex();
    }

    public final Object previous() {
        mo85187b();
        return ((ListIterator) this.f71959a).previous();
    }

    public final int previousIndex() {
        mo85187b();
        return ((ListIterator) this.f71959a).previousIndex();
    }

    public final void set(Object obj) {
        mo85187b();
        ((ListIterator) this.f71959a).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30129m(C30141n nVar, int i) {
        super(nVar, ((List) nVar.f71983b).listIterator(i));
        this.f72008d = nVar;
    }
}
