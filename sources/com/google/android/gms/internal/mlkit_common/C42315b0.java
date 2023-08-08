package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33007f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_common.b0 */
public final class C42315b0 {

    /* renamed from: a */
    public final Map<Class<?>, C33005d<?>> f106839a;

    /* renamed from: b */
    public final Map<Class<?>, C33007f<?>> f106840b;

    /* renamed from: c */
    public final C33005d<Object> f106841c;

    public C42315b0(Map<Class<?>, C33005d<?>> map, Map<Class<?>, C33007f<?>> map2, C33005d<Object> dVar) {
        this.f106839a = map;
        this.f106840b = map2;
        this.f106841c = dVar;
    }

    @C0359n0
    /* renamed from: a */
    public final byte[] mo137625a(@C0359n0 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C42564y(byteArrayOutputStream, this.f106839a, this.f106840b, this.f106841c).mo137833t(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
