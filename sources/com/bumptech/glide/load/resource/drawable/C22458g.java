package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22099b;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.resource.C22491i;
import com.bumptech.glide.util.C22614a;
import com.bumptech.glide.util.C22635o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

@C0376v0(28)
/* renamed from: com.bumptech.glide.load.resource.drawable.g */
public final class C22458g {

    /* renamed from: a */
    public final List<ImageHeaderParser> f57591a;

    /* renamed from: b */
    public final C22157b f57592b;

    /* renamed from: com.bumptech.glide.load.resource.drawable.g$a */
    public static final class C22459a implements C22270s<Drawable> {

        /* renamed from: b */
        public static final int f57593b = 2;

        /* renamed from: a */
        public final AnimatedImageDrawable f57594a;

        public C22459a(AnimatedImageDrawable animatedImageDrawable) {
            this.f57594a = animatedImageDrawable;
        }

        /* renamed from: a */
        public void mo66175a() {
            this.f57594a.stop();
            this.f57594a.clearAnimationCallbacks();
        }

        @C0359n0
        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.f57594a;
        }

        @C0359n0
        /* renamed from: c */
        public Class<Drawable> mo66177c() {
            return Drawable.class;
        }

        public int getSize() {
            return this.f57594a.getIntrinsicWidth() * this.f57594a.getIntrinsicHeight() * C22635o.m102634i(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.drawable.g$b */
    public static final class C22460b implements C22278g<ByteBuffer, Drawable> {

        /* renamed from: a */
        public final C22458g f57595a;

        public C22460b(C22458g gVar) {
            this.f57595a = gVar;
        }

        /* renamed from: c */
        public C22270s<Drawable> mo66237b(@C0359n0 ByteBuffer byteBuffer, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
            return this.f57595a.mo66469b(ImageDecoder.createSource(byteBuffer), i, i2, fVar);
        }

        /* renamed from: d */
        public boolean mo66236a(@C0359n0 ByteBuffer byteBuffer, @C0359n0 C22277f fVar) throws IOException {
            return this.f57595a.mo66471d(byteBuffer);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.drawable.g$c */
    public static final class C22461c implements C22278g<InputStream, Drawable> {

        /* renamed from: a */
        public final C22458g f57596a;

        public C22461c(C22458g gVar) {
            this.f57596a = gVar;
        }

        /* renamed from: c */
        public C22270s<Drawable> mo66237b(@C0359n0 InputStream inputStream, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
            return this.f57596a.mo66469b(ImageDecoder.createSource(C22614a.m102575b(inputStream)), i, i2, fVar);
        }

        /* renamed from: d */
        public boolean mo66236a(@C0359n0 InputStream inputStream, @C0359n0 C22277f fVar) throws IOException {
            return this.f57596a.mo66470c(inputStream);
        }
    }

    public C22458g(List<ImageHeaderParser> list, C22157b bVar) {
        this.f57591a = list;
        this.f57592b = bVar;
    }

    /* renamed from: a */
    public static C22278g<ByteBuffer, Drawable> m101905a(List<ImageHeaderParser> list, C22157b bVar) {
        return new C22460b(new C22458g(list, bVar));
    }

    /* renamed from: f */
    public static C22278g<InputStream, Drawable> m101906f(List<ImageHeaderParser> list, C22157b bVar) {
        return new C22461c(new C22458g(list, bVar));
    }

    /* renamed from: b */
    public C22270s<Drawable> mo66469b(@C0359n0 ImageDecoder.Source source, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        Drawable a = ImageDecoder.decodeDrawable(source, new C22491i(i, i2, fVar));
        if (C22452a.m101899a(a)) {
            return new C22459a(C22453b.m101900a(a));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + a);
    }

    /* renamed from: c */
    public boolean mo66470c(InputStream inputStream) throws IOException {
        return mo66472e(C22099b.m100714f(this.f57591a, inputStream, this.f57592b));
    }

    /* renamed from: d */
    public boolean mo66471d(ByteBuffer byteBuffer) throws IOException {
        return mo66472e(C22099b.m100715g(this.f57591a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean mo66472e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}
