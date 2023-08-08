package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39082x0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39091y0;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y0 */
public abstract class C39091y0<MessageType extends C39091y0<MessageType, BuilderType>, BuilderType extends C39082x0<MessageType, BuilderType>> implements C39076w3 {
    protected int zzb = 0;

    /* renamed from: a */
    public int mo122983a() {
        throw null;
    }

    /* renamed from: g */
    public void mo122987g(int i) {
        throw null;
    }

    /* renamed from: y */
    public final zzdc mo123114y() {
        try {
            int x = mo122992x();
            zzdc zzdc = zzdc.f99077a;
            byte[] bArr = new byte[x];
            C39056u1 f = C39056u1.m160860f(bArr);
            mo122984e(f);
            f.mo123059g();
            return new zzcz(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
