package com.google.android.odml.image;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;

/* renamed from: com.google.android.odml.image.a */
public final class C31843a {
    @C0359n0
    /* renamed from: a */
    public static Bitmap m129215a(@C0359n0 C31850h hVar) {
        C31861p d = hVar.mo92364d();
        if (d.zzb().mo92357b() == 1) {
            return ((C31859n) d).mo92375a();
        }
        throw new IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }
}
