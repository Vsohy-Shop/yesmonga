package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.C22598f;

/* renamed from: com.bumptech.glide.request.transition.d */
public class C22595d implements C22598f<Drawable> {

    /* renamed from: a */
    public final int f57971a;

    /* renamed from: b */
    public final boolean f57972b;

    public C22595d(int i, boolean z) {
        this.f57971a = i;
        this.f57972b = z;
    }

    /* renamed from: b */
    public boolean mo66939a(Drawable drawable, C22598f.C22599a aVar) {
        Drawable f = aVar.mo66905f();
        if (f == null) {
            f = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{f, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f57972b);
        transitionDrawable.startTransition(this.f57971a);
        aVar.mo66904e(transitionDrawable);
        return true;
    }
}
