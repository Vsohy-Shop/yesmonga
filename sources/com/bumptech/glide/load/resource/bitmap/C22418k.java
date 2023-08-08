package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
public class C22418k implements C22278g<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C22439v f57543a;

    public C22418k(C22439v vVar) {
        this.f57543a = vVar;
    }

    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 ByteBuffer byteBuffer, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        return this.f57543a.mo66457h(byteBuffer, i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 ByteBuffer byteBuffer, @C0359n0 C22277f fVar) {
        return this.f57543a.mo66463t(byteBuffer);
    }
}
