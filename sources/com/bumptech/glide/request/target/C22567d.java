package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.request.target.d */
public class C22567d extends C22585q<Bitmap> {
    public C22567d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: z */
    public Drawable mo66845y(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f57949b).getResources(), bitmap);
    }

    @Deprecated
    public C22567d(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
