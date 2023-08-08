package com.bumptech.glide.request.transition;

import android.view.View;
import com.bumptech.glide.request.transition.C22598f;

/* renamed from: com.bumptech.glide.request.transition.j */
public class C22605j<R> implements C22598f<R> {

    /* renamed from: a */
    public final C22606a f57981a;

    /* renamed from: com.bumptech.glide.request.transition.j$a */
    public interface C22606a {
        /* renamed from: a */
        void mo66947a(View view);
    }

    public C22605j(C22606a aVar) {
        this.f57981a = aVar;
    }

    /* renamed from: a */
    public boolean mo66939a(R r, C22598f.C22599a aVar) {
        if (aVar.getView() == null) {
            return false;
        }
        this.f57981a.mo66947a(aVar.getView());
        return false;
    }
}
