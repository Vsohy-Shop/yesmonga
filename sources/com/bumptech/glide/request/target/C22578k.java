package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.C0359n0;

/* renamed from: com.bumptech.glide.request.target.k */
public class C22578k {
    @C0359n0
    /* renamed from: a */
    public <Z> C22586r<ImageView, Z> mo66908a(@C0359n0 ImageView imageView, @C0359n0 Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C22566c(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C22573g(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
