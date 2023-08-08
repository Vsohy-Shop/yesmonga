package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import java.io.IOException;

@C0376v0(21)
/* renamed from: com.bumptech.glide.load.resource.bitmap.f0 */
public final class C22408f0 implements C22278g<ParcelFileDescriptor, Bitmap> {

    /* renamed from: b */
    public static final int f57525b = 536870912;

    /* renamed from: a */
    public final C22439v f57526a;

    public C22408f0(C22439v vVar) {
        this.f57526a = vVar;
    }

    @C0363p0
    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        return this.f57526a.mo66453d(parcelFileDescriptor, i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 ParcelFileDescriptor parcelFileDescriptor, @C0359n0 C22277f fVar) {
        return mo66422e(parcelFileDescriptor) && this.f57526a.mo66461r(parcelFileDescriptor);
    }

    /* renamed from: e */
    public final boolean mo66422e(@C0359n0 ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
            return false;
        }
        return true;
    }
}
