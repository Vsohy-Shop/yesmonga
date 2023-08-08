package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.config.C33004b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.l1 */
public final class C30119l1 implements C33004b<C30119l1> {

    /* renamed from: d */
    public static final C33005d<Object> f71987d = C30107k1.f71962a;

    /* renamed from: e */
    public static final /* synthetic */ int f71988e = 0;

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f71989a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f71990b = new HashMap();

    /* renamed from: c */
    public final C33005d<Object> f71991c = f71987d;

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33004b mo85212a(@C0359n0 Class cls, @C0359n0 C33007f fVar) {
        this.f71990b.put(cls, fVar);
        this.f71989a.remove(cls);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33004b mo85213b(@C0359n0 Class cls, @C0359n0 C33005d dVar) {
        this.f71989a.put(cls, dVar);
        this.f71990b.remove(cls);
        return this;
    }

    /* renamed from: c */
    public final C30131m1 mo85214c() {
        return new C30131m1(new HashMap(this.f71989a), new HashMap(this.f71990b), this.f71991c);
    }
}
