package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.g */
public final class C30057g extends C30178q0 {

    /* renamed from: d */
    public final transient Map f71868d;

    /* renamed from: e */
    public final /* synthetic */ zzao f71869e;

    public C30057g(zzao zzao, Map map) {
        this.f71869e = zzao;
        this.f71868d = map;
    }

    /* renamed from: a */
    public final Set<Map.Entry> mo85114a() {
        return new C30033e(this);
    }

    public final void clear() {
        if (this.f71868d == this.f71869e.f72391c) {
            this.f71869e.mo85420m();
        } else {
            C30058g0.m121681a(new C30045f(this));
        }
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return C30202s0.m121843b(this.f71868d, obj);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj || this.f71868d.equals(obj)) {
            return true;
        }
        return false;
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) C30202s0.m121842a(this.f71868d, obj);
        if (collection == null) {
            return null;
        }
        return this.f71869e.mo85417f(obj, collection);
    }

    public final int hashCode() {
        return this.f71868d.hashCode();
    }

    public final Set keySet() {
        return this.f71869e.mo85287u();
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f71868d.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection e = this.f71869e.mo85416e();
        e.addAll(collection);
        zzao zzao = this.f71869e;
        zzao.f72392d = zzao.f72392d - collection.size();
        collection.clear();
        return e;
    }

    public final int size() {
        return this.f71868d.size();
    }

    public final String toString() {
        return this.f71868d.toString();
    }
}
