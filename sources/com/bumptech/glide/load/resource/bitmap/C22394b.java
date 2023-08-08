package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22279h;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public class C22394b implements C22279h<BitmapDrawable> {

    /* renamed from: a */
    public final C22162e f57481a;

    /* renamed from: b */
    public final C22279h<Bitmap> f57482b;

    public C22394b(C22162e eVar, C22279h<Bitmap> hVar) {
        this.f57481a = eVar;
        this.f57482b = hVar;
    }

    @C0359n0
    /* renamed from: b */
    public EncodeStrategy mo66238b(@C0359n0 C22277f fVar) {
        return this.f57482b.mo66238b(fVar);
    }

    /* renamed from: c */
    public boolean mo65770a(@C0359n0 C22270s<BitmapDrawable> sVar, @C0359n0 File file, @C0359n0 C22277f fVar) {
        return this.f57482b.mo65770a(new C22411h(sVar.get().getBitmap(), this.f57481a), file, fVar);
    }
}
