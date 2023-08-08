package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.engine.bitmap_recycle.C22163f;
import com.bumptech.glide.load.resource.C22491i;
import java.io.IOException;

@C0376v0(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.g */
public final class C22409g implements C22278g<ImageDecoder.Source, Bitmap> {

    /* renamed from: b */
    public static final String f57527b = "BitmapImageDecoder";

    /* renamed from: a */
    public final C22162e f57528a = new C22163f();

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo66236a(@C0359n0 Object obj, @C0359n0 C22277f fVar) throws IOException {
        return mo66424d(C22407f.m101748a(obj), fVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ C22270s mo66237b(@C0359n0 Object obj, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        return mo66423c(C22407f.m101748a(obj), i, i2, fVar);
    }

    /* renamed from: c */
    public C22270s<Bitmap> mo66423c(@C0359n0 ImageDecoder.Source source, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        Bitmap a = ImageDecoder.decodeBitmap(source, new C22491i(i, i2, fVar));
        if (Log.isLoggable(f57527b, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(a.getWidth());
            sb.append("x");
            sb.append(a.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
        }
        return new C22411h(a, this.f57528a);
    }

    /* renamed from: d */
    public boolean mo66424d(@C0359n0 ImageDecoder.Source source, @C0359n0 C22277f fVar) throws IOException {
        return true;
    }
}
