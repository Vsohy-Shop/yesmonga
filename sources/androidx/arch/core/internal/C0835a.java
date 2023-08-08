package androidx.arch.core.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.C0836b;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.internal.a */
public class C0835a<K, V> extends C0836b<K, V> {

    /* renamed from: e */
    public final HashMap<K, C0836b.C0839c<K, V>> f2660e = new HashMap<>();

    public boolean contains(K k) {
        return this.f2660e.containsKey(k);
    }

    @C0363p0
    /* renamed from: h */
    public C0836b.C0839c<K, V> mo3802h(K k) {
        return this.f2660e.get(k);
    }

    /* renamed from: r */
    public V mo3803r(@C0359n0 K k, @C0359n0 V v) {
        C0836b.C0839c h = mo3802h(k);
        if (h != null) {
            return h.f2666b;
        }
        this.f2660e.put(k, mo3813q(k, v));
        return null;
    }

    /* renamed from: w */
    public V mo3804w(@C0359n0 K k) {
        V w = super.mo3804w(k);
        this.f2660e.remove(k);
        return w;
    }

    @C0363p0
    /* renamed from: y */
    public Map.Entry<K, V> mo3805y(K k) {
        if (contains(k)) {
            return this.f2660e.get(k).f2668d;
        }
        return null;
    }
}
