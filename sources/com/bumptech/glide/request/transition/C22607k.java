package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.bumptech.glide.request.transition.C22598f;

/* renamed from: com.bumptech.glide.request.transition.k */
public class C22607k<R> implements C22598f<R> {

    /* renamed from: a */
    public final C22608a f57982a;

    /* renamed from: com.bumptech.glide.request.transition.k$a */
    public interface C22608a {
        /* renamed from: a */
        Animation mo66946a(Context context);
    }

    public C22607k(C22608a aVar) {
        this.f57982a = aVar;
    }

    /* renamed from: a */
    public boolean mo66939a(R r, C22598f.C22599a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f57982a.mo66946a(view.getContext()));
        return false;
    }
}
