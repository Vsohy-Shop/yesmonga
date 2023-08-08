package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.bitmap.C22439v;
import com.bumptech.glide.util.C22620e;
import com.bumptech.glide.util.C22631k;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j0 */
public class C22416j0 implements C22278g<InputStream, Bitmap> {

    /* renamed from: a */
    public final C22439v f57539a;

    /* renamed from: b */
    public final C22157b f57540b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.j0$a */
    public static class C22417a implements C22439v.C22441b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f57541a;

        /* renamed from: b */
        public final C22620e f57542b;

        public C22417a(RecyclableBufferedInputStream recyclableBufferedInputStream, C22620e eVar) {
            this.f57541a = recyclableBufferedInputStream;
            this.f57542b = eVar;
        }

        /* renamed from: a */
        public void mo66435a(C22162e eVar, Bitmap bitmap) throws IOException {
            IOException b = this.f57542b.mo66975b();
            if (b != null) {
                if (bitmap != null) {
                    eVar.mo65956d(bitmap);
                }
                throw b;
            }
        }

        /* renamed from: b */
        public void mo66436b() {
            this.f57541a.mo66381b();
        }
    }

    public C22416j0(C22439v vVar, C22157b bVar) {
        this.f57539a = vVar;
        this.f57540b = bVar;
    }

    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 InputStream inputStream, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f57540b);
        }
        C22620e c = C22620e.m102594c(recyclableBufferedInputStream);
        try {
            return this.f57539a.mo66456g(new C22631k(c), i, i2, fVar, new C22417a(recyclableBufferedInputStream, c));
        } finally {
            c.release();
            if (z) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 InputStream inputStream, @C0359n0 C22277f fVar) {
        return this.f57539a.mo66462s(inputStream);
    }
}
