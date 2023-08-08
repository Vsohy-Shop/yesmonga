package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.config.C33004b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.c */
public final class C39128c implements C33004b<C39128c> {

    /* renamed from: d */
    public static final C33005d<Object> f99872d = C39118b.f99858a;

    /* renamed from: e */
    public static final /* synthetic */ int f99873e = 0;

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f99874a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f99875b = new HashMap();

    /* renamed from: c */
    public final C33005d<Object> f99876c = f99872d;

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33004b mo85212a(@C0359n0 Class cls, @C0359n0 C33007f fVar) {
        this.f99875b.put(cls, fVar);
        this.f99874a.remove(cls);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33004b mo85213b(@C0359n0 Class cls, @C0359n0 C33005d dVar) {
        this.f99874a.put(cls, dVar);
        this.f99875b.remove(cls);
        return this;
    }

    /* renamed from: c */
    public final C39138d mo123234c() {
        return new C39138d(new HashMap(this.f99874a), new HashMap(this.f99875b), this.f99876c);
    }
}
