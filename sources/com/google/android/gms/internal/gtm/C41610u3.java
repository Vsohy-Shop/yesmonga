package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;

@C40858y
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.u3 */
public final class C41610u3<V> {

    /* renamed from: a */
    public final C41586t3<V> f105046a;

    /* renamed from: b */
    public final V f105047b;

    /* renamed from: c */
    public final V f105048c;

    /* renamed from: d */
    public final Object f105049d = new Object();

    public C41610u3(V v, V v2, C41586t3<V> t3Var) {
        this.f105047b = v;
        this.f105048c = v2;
        this.f105046a = t3Var;
    }

    /* renamed from: a */
    public static <T> C41610u3<T> m168463a(T t, T t2, C41586t3<T> t3Var) {
        return new C41610u3<>(t, t2, t3Var);
    }

    /* renamed from: b */
    public final V mo135909b() {
        synchronized (this.f105049d) {
        }
        return this.f105047b;
    }
}
