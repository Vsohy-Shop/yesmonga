package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.f */
public final class C30045f implements Iterator<Map.Entry> {

    /* renamed from: a */
    public final Iterator<Map.Entry> f71833a;
    @CheckForNull

    /* renamed from: b */
    public Collection f71834b;

    /* renamed from: c */
    public final /* synthetic */ C30057g f71835c;

    public C30045f(C30057g gVar) {
        this.f71835c = gVar;
        this.f71833a = gVar.f71868d.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f71833a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f71833a.next();
        this.f71834b = (Collection) next.getValue();
        C30057g gVar = this.f71835c;
        Object key = next.getKey();
        return new zzbi(key, gVar.f71869e.mo85417f(key, (Collection) next.getValue()));
    }

    public final void remove() {
        boolean z;
        if (this.f71834b != null) {
            z = true;
        } else {
            z = false;
        }
        C29997b.m121590d(z, "no calls to next() since the last call to remove()");
        this.f71833a.remove();
        zzao zzao = this.f71835c.f71869e;
        zzao.f72392d = zzao.f72392d - this.f71834b.size();
        this.f71834b.clear();
        this.f71834b = null;
    }
}
