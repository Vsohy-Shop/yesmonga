package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0363p0;

/* renamed from: com.bumptech.glide.request.target.q */
public abstract class C22585q<T> extends C22577j<T> {
    public C22585q(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: w */
    public void mo66843w(@C0363p0 T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f57949b).getLayoutParams();
        Drawable y = mo66845y(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            y = new C22575i(y, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f57949b).setImageDrawable(y);
    }

    /* renamed from: y */
    public abstract Drawable mo66845y(T t);

    @Deprecated
    public C22585q(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
