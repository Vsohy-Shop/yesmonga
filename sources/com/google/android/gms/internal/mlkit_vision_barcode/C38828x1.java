package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.x1 */
public final class C38828x1 {

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f98267a;

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f98268b;

    /* renamed from: c */
    public final C33005d<Object> f98269c;

    public C38828x1(Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f98267a = map;
        this.f98268b = map2;
        this.f98269c = dVar;
    }

    @C0359n0
    /* renamed from: a */
    public final byte[] mo122567a(@C0359n0 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C38792u1(byteArrayOutputStream, this.f98267a, this.f98268b, this.f98269c).mo122538t(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
