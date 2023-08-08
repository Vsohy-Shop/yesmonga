package com.google.android.odml.image;

import androidx.annotation.C0359n0;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.odml.image.c */
public class C31845c {
    @C0359n0
    /* renamed from: a */
    public static ByteBuffer m129218a(@C0359n0 C31850h hVar) {
        C31861p d = hVar.mo92364d();
        if (d.zzb().mo92357b() == 2) {
            return ((C31860o) d).mo92378a().asReadOnlyBuffer();
        }
        throw new IllegalArgumentException("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
    }
}
