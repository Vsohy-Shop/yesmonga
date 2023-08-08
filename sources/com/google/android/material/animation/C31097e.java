package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.animation.e */
public class C31097e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f74432b = new C31097e();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f74433a = new WeakHashMap<>();

    public C31097e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @C0363p0
    /* renamed from: a */
    public Integer get(@C0359n0 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* renamed from: b */
    public void set(@C0359n0 Drawable drawable, @C0359n0 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
