package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import com.google.firebase.encoders.config.C33004b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.w1 */
public final class C38816w1 implements C33004b<C38816w1> {

    /* renamed from: d */
    public static final C33005d<Object> f98241d = C38804v1.f98221a;

    /* renamed from: e */
    public static final /* synthetic */ int f98242e = 0;

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f98243a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f98244b = new HashMap();

    /* renamed from: c */
    public final C33005d<Object> f98245c = f98241d;

    @C0359n0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C33004b mo85212a(@C0359n0 Class cls, @C0359n0 C33007f fVar) {
        this.f98244b.put(cls, fVar);
        this.f98243a.remove(cls);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C33004b mo85213b(@C0359n0 Class cls, @C0359n0 C33005d dVar) {
        this.f98243a.put(cls, dVar);
        this.f98244b.remove(cls);
        return this;
    }

    /* renamed from: c */
    public final C38828x1 mo122563c() {
        return new C38828x1(new HashMap(this.f98243a), new HashMap(this.f98244b), this.f98245c);
    }
}
