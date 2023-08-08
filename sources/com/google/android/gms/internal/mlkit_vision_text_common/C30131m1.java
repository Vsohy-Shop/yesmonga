package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.m1 */
public final class C30131m1 {

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f72009a;

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f72010b;

    /* renamed from: c */
    public final C33005d<Object> f72011c;

    public C30131m1(Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f72009a = map;
        this.f72010b = map2;
        this.f72011c = dVar;
    }

    @C0359n0
    /* renamed from: a */
    public final byte[] mo85227a(@C0359n0 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C30095j1(byteArrayOutputStream, this.f72009a, this.f72010b, this.f72011c).mo85178t(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
