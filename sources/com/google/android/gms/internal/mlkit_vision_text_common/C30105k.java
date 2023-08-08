package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.k */
public class C30105k implements Iterator {

    /* renamed from: a */
    public final Iterator f71959a;

    /* renamed from: b */
    public final Collection f71960b;

    /* renamed from: c */
    public final /* synthetic */ C30117l f71961c;

    public C30105k(C30117l lVar, Iterator it) {
        this.f71961c = lVar;
        this.f71960b = lVar.f71983b;
        this.f71959a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo85187b() {
        this.f71961c.zzb();
        if (this.f71961c.f71983b != this.f71960b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo85187b();
        return this.f71959a.hasNext();
    }

    public final Object next() {
        mo85187b();
        return this.f71959a.next();
    }

    public final void remove() {
        this.f71959a.remove();
        zzao zzao = this.f71961c.f71986e;
        zzao.f72392d = zzao.f72392d - 1;
        this.f71961c.mo85203h();
    }

    public C30105k(C30117l lVar) {
        Iterator it;
        this.f71961c = lVar;
        Collection collection = lVar.f71983b;
        this.f71960b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f71959a = it;
    }
}
