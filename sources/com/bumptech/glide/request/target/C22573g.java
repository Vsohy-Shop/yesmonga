package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.C0363p0;

/* renamed from: com.bumptech.glide.request.target.g */
public class C22573g extends C22577j<Drawable> {
    public C22573g(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: y */
    public void mo66843w(@C0363p0 Drawable drawable) {
        ((ImageView) this.f57949b).setImageDrawable(drawable);
    }

    @Deprecated
    public C22573g(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
