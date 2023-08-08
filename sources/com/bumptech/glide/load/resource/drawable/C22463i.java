package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.C22258o;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.resource.gif.C22477c;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.load.resource.drawable.i */
public abstract class C22463i<T extends Drawable> implements C22270s<T>, C22258o {

    /* renamed from: a */
    public final T f57598a;

    public C22463i(T t) {
        this.f57598a = (Drawable) C22633m.m102624d(t);
    }

    /* renamed from: b */
    public void mo66184b() {
        T t = this.f57598a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C22477c) {
            ((C22477c) t).mo66508h().prepareToDraw();
        }
    }

    @C0359n0
    /* renamed from: d */
    public final T get() {
        Drawable.ConstantState constantState = this.f57598a.getConstantState();
        if (constantState == null) {
            return this.f57598a;
        }
        return constantState.newDrawable();
    }
}
