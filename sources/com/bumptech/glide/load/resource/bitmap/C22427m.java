package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import java.io.IOException;
import java.nio.ByteBuffer;

@C0376v0(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
public final class C22427m implements C22278g<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C22409g f57558a = new C22409g();

    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 ByteBuffer byteBuffer, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        return this.f57558a.mo66423c(ImageDecoder.createSource(byteBuffer), i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 ByteBuffer byteBuffer, @C0359n0 C22277f fVar) throws IOException {
        return true;
    }
}
