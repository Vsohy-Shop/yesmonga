package com.google.mlkit.common.sdkinternal;

import androidx.annotation.C0323b0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import java.util.HashMap;
import java.util.Map;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.f */
public abstract class C33939f<K, V> {
    @C0323b0("instances")

    /* renamed from: a */
    public final Map<K, V> f82359a = new HashMap();

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public abstract V mo85076a(@RecentlyNonNull K k);

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public V mo98709b(@RecentlyNonNull K k) {
        synchronized (this.f82359a) {
            if (this.f82359a.containsKey(k)) {
                V v = this.f82359a.get(k);
                return v;
            }
            V a = mo85076a(k);
            this.f82359a.put(k, a);
            return a;
        }
    }
}
