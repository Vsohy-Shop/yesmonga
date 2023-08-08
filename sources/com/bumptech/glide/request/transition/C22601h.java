package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.C22607k;

/* renamed from: com.bumptech.glide.request.transition.h */
public class C22601h<R> implements C22600g<R> {

    /* renamed from: a */
    public final C22607k.C22608a f57975a;

    /* renamed from: b */
    public C22598f<R> f57976b;

    /* renamed from: com.bumptech.glide.request.transition.h$a */
    public static class C22602a implements C22607k.C22608a {

        /* renamed from: a */
        public final Animation f57977a;

        public C22602a(Animation animation) {
            this.f57977a = animation;
        }

        /* renamed from: a */
        public Animation mo66946a(Context context) {
            return this.f57977a;
        }
    }

    /* renamed from: com.bumptech.glide.request.transition.h$b */
    public static class C22603b implements C22607k.C22608a {

        /* renamed from: a */
        public final int f57978a;

        public C22603b(int i) {
            this.f57978a = i;
        }

        /* renamed from: a */
        public Animation mo66946a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f57978a);
        }
    }

    public C22601h(Animation animation) {
        this((C22607k.C22608a) new C22602a(animation));
    }

    /* renamed from: a */
    public C22598f<R> mo66937a(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return C22596e.m102547b();
        }
        if (this.f57976b == null) {
            this.f57976b = new C22607k(this.f57975a);
        }
        return this.f57976b;
    }

    public C22601h(int i) {
        this((C22607k.C22608a) new C22603b(i));
    }

    public C22601h(C22607k.C22608a aVar) {
        this.f57975a = aVar;
    }
}
