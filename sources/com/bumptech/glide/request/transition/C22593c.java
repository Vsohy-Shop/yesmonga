package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.bumptech.glide.request.transition.c */
public class C22593c implements C22600g<Drawable> {

    /* renamed from: a */
    public final int f57965a;

    /* renamed from: b */
    public final boolean f57966b;

    /* renamed from: c */
    public C22595d f57967c;

    /* renamed from: com.bumptech.glide.request.transition.c$a */
    public static class C22594a {

        /* renamed from: c */
        public static final int f57968c = 300;

        /* renamed from: a */
        public final int f57969a;

        /* renamed from: b */
        public boolean f57970b;

        public C22594a() {
            this(300);
        }

        /* renamed from: a */
        public C22593c mo66942a() {
            return new C22593c(this.f57969a, this.f57970b);
        }

        /* renamed from: b */
        public C22594a mo66943b(boolean z) {
            this.f57970b = z;
            return this;
        }

        public C22594a(int i) {
            this.f57969a = i;
        }
    }

    public C22593c(int i, boolean z) {
        this.f57965a = i;
        this.f57966b = z;
    }

    /* renamed from: a */
    public C22598f<Drawable> mo66937a(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return C22596e.m102547b();
        }
        return mo66941b();
    }

    /* renamed from: b */
    public final C22598f<Drawable> mo66941b() {
        if (this.f57967c == null) {
            this.f57967c = new C22595d(this.f57965a, this.f57966b);
        }
        return this.f57967c;
    }
}
