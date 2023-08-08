package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.i */
public final class C30081i extends C30154o0 {

    /* renamed from: b */
    public final /* synthetic */ zzao f71911b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30081i(zzao zzao, Map map) {
        super(map);
        this.f71911b = zzao;
    }

    public final void clear() {
        C30058g0.m121681a(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f72052a.keySet().containsAll(collection);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj || this.f72052a.keySet().equals(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f72052a.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new C30069h(this, this.f72052a.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f72052a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzao zzao = this.f71911b;
        zzao.f72392d = zzao.f72392d - size;
        if (size > 0) {
            return true;
        }
        return false;
    }
}
