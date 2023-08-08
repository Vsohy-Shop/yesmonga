package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.util.C22614a;
import java.io.IOException;
import java.io.InputStream;

@C0376v0(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.d0 */
public final class C22404d0 implements C22278g<InputStream, Bitmap> {

    /* renamed from: a */
    public final C22409g f57518a = new C22409g();

    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 InputStream inputStream, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        return this.f57518a.mo66423c(ImageDecoder.createSource(C22614a.m102575b(inputStream)), i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 InputStream inputStream, @C0359n0 C22277f fVar) throws IOException {
        return true;
    }
}
