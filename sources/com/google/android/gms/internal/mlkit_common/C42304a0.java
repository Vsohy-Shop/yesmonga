package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.config.C33004b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_common.a0 */
public final class C42304a0 implements C33004b<C42304a0> {

    /* renamed from: d */
    public static final C33005d<Object> f106805d = C42574z.f107476a;

    /* renamed from: e */
    public static final /* synthetic */ int f106806e = 0;

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f106807a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f106808b = new HashMap();

    /* renamed from: c */
    public final C33005d<Object> f106809c = f106805d;

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33004b mo85212a(@C0359n0 Class cls, @C0359n0 C33007f fVar) {
        this.f106808b.put(cls, fVar);
        this.f106807a.remove(cls);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33004b mo85213b(@C0359n0 Class cls, @C0359n0 C33005d dVar) {
        this.f106807a.put(cls, dVar);
        this.f106808b.remove(cls);
        return this;
    }

    /* renamed from: c */
    public final C42315b0 mo137620c() {
        return new C42315b0(new HashMap(this.f106807a), new HashMap(this.f106808b), this.f106809c);
    }
}
