package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.C22258o;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.drawable.C22463i;
import com.bumptech.glide.util.C22635o;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
public class C22396c extends C22463i<BitmapDrawable> implements C22258o {

    /* renamed from: b */
    public final C22162e f57501b;

    public C22396c(BitmapDrawable bitmapDrawable, C22162e eVar) {
        super(bitmapDrawable);
        this.f57501b = eVar;
    }

    /* renamed from: a */
    public void mo66175a() {
        this.f57501b.mo65956d(((BitmapDrawable) this.f57598a).getBitmap());
    }

    /* renamed from: b */
    public void mo66184b() {
        ((BitmapDrawable) this.f57598a).getBitmap().prepareToDraw();
    }

    @C0359n0
    /* renamed from: c */
    public Class<BitmapDrawable> mo66177c() {
        return BitmapDrawable.class;
    }

    public int getSize() {
        return C22635o.m102633h(((BitmapDrawable) this.f57598a).getBitmap());
    }
}
