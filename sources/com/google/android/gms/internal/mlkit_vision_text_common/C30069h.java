package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.h */
public final class C30069h implements Iterator {
    @CheckForNull

    /* renamed from: a */
    public Map.Entry f71894a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f71895b;

    /* renamed from: c */
    public final /* synthetic */ C30081i f71896c;

    public C30069h(C30081i iVar, Iterator it) {
        this.f71896c = iVar;
        this.f71895b = it;
    }

    public final boolean hasNext() {
        return this.f71895b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f71895b.next();
        this.f71894a = entry;
        return entry.getKey();
    }

    public final void remove() {
        boolean z;
        if (this.f71894a != null) {
            z = true;
        } else {
            z = false;
        }
        C29997b.m121590d(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f71894a.getValue();
        this.f71895b.remove();
        zzao zzao = this.f71896c.f71911b;
        zzao.f72392d = zzao.f72392d - collection.size();
        collection.clear();
        this.f71894a = null;
    }
}
