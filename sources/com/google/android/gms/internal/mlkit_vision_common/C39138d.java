package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.d */
public final class C39138d {

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f99902a;

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f99903b;

    /* renamed from: c */
    public final C33005d<Object> f99904c;

    public C39138d(Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f99902a = map;
        this.f99903b = map2;
        this.f99904c = dVar;
    }

    @C0359n0
    /* renamed from: a */
    public final byte[] mo123239a(@C0359n0 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C39147d8(byteArrayOutputStream, this.f99902a, this.f99903b, this.f99904c).mo123251t(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
