package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.C22598f;

/* renamed from: com.bumptech.glide.request.transition.a */
public abstract class C22590a<R> implements C22600g<R> {

    /* renamed from: a */
    public final C22600g<Drawable> f57962a;

    /* renamed from: com.bumptech.glide.request.transition.a$a */
    public final class C22591a implements C22598f<R> {

        /* renamed from: a */
        public final C22598f<Drawable> f57963a;

        public C22591a(C22598f<Drawable> fVar) {
            this.f57963a = fVar;
        }

        /* renamed from: a */
        public boolean mo66939a(R r, C22598f.C22599a aVar) {
            return this.f57963a.mo66939a(new BitmapDrawable(aVar.getView().getResources(), C22590a.this.mo66938b(r)), aVar);
        }
    }

    public C22590a(C22600g<Drawable> gVar) {
        this.f57962a = gVar;
    }

    /* renamed from: a */
    public C22598f<R> mo66937a(DataSource dataSource, boolean z) {
        return new C22591a(this.f57962a.mo66937a(dataSource, z));
    }

    /* renamed from: b */
    public abstract Bitmap mo66938b(R r);
}
