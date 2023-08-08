package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29611px;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29648qx;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.qx */
public abstract class C29648qx<MessageType extends C29648qx<MessageType, BuilderType>, BuilderType extends C29611px<MessageType, BuilderType>> implements x00 {
    protected int zba = 0;

    /* renamed from: a */
    public void mo84726a(int i) {
        throw null;
    }

    /* renamed from: d */
    public int mo84729d() {
        throw null;
    }

    /* renamed from: e0 */
    public final zbwp mo84804e0() {
        try {
            int b = mo84727b();
            zbwp zbwp = zbwp.f71626a;
            byte[] bArr = new byte[b];
            C29686ry h = C29686ry.m121017h(bArr);
            mo84732f(h);
            return C29353iy.m120524a(h, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: g */
    public final byte[] mo84805g() {
        try {
            byte[] bArr = new byte[mo84727b()];
            C29686ry h = C29686ry.m121017h(bArr);
            mo84732f(h);
            h.mo84814i();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
