package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(19)
/* renamed from: com.google.android.odml.image.f */
public class C31848f {
    @C0359n0
    /* renamed from: a */
    public static Image m129223a(@C0359n0 C31850h hVar) {
        C31861p d = hVar.mo92364d();
        if (d.zzb().mo92357b() == 3) {
            return ((C31863r) d).mo92379a();
        }
        throw new IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }
}
