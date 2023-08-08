package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.f */
public class C22163f implements C22162e {
    /* renamed from: a */
    public void mo65953a(int i) {
    }

    /* renamed from: b */
    public void mo65954b() {
    }

    /* renamed from: c */
    public void mo65955c(float f) {
    }

    /* renamed from: d */
    public void mo65956d(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: e */
    public long mo65957e() {
        return 0;
    }

    @C0359n0
    /* renamed from: f */
    public Bitmap mo65958f(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @C0359n0
    /* renamed from: g */
    public Bitmap mo65959g(int i, int i2, Bitmap.Config config) {
        return mo65958f(i, i2, config);
    }
}
