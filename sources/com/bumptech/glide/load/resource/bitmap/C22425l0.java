package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.util.C22635o;

/* renamed from: com.bumptech.glide.load.resource.bitmap.l0 */
public final class C22425l0 implements C22278g<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.l0$a */
    public static final class C22426a implements C22270s<Bitmap> {

        /* renamed from: a */
        public final Bitmap f57557a;

        public C22426a(@C0359n0 Bitmap bitmap) {
            this.f57557a = bitmap;
        }

        /* renamed from: a */
        public void mo66175a() {
        }

        @C0359n0
        /* renamed from: b */
        public Bitmap get() {
            return this.f57557a;
        }

        @C0359n0
        /* renamed from: c */
        public Class<Bitmap> mo66177c() {
            return Bitmap.class;
        }

        public int getSize() {
            return C22635o.m102633h(this.f57557a);
        }
    }

    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 Bitmap bitmap, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22426a(bitmap);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 Bitmap bitmap, @C0359n0 C22277f fVar) {
        return true;
    }
}
