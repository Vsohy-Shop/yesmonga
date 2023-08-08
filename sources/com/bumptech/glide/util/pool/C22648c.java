package com.bumptech.glide.util.pool;

import androidx.annotation.C0359n0;

/* renamed from: com.bumptech.glide.util.pool.c */
public abstract class C22648c {

    /* renamed from: a */
    public static final boolean f58046a = false;

    /* renamed from: com.bumptech.glide.util.pool.c$b */
    public static class C22650b extends C22648c {

        /* renamed from: b */
        public volatile RuntimeException f58047b;

        public C22650b() {
            super();
        }

        /* renamed from: b */
        public void mo67016b(boolean z) {
            if (z) {
                this.f58047b = new RuntimeException("Released");
            } else {
                this.f58047b = null;
            }
        }

        /* renamed from: c */
        public void mo67017c() {
            if (this.f58047b != null) {
                throw new IllegalStateException("Already released", this.f58047b);
            }
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.c$c */
    public static class C22651c extends C22648c {

        /* renamed from: b */
        public volatile boolean f58048b;

        public C22651c() {
            super();
        }

        /* renamed from: b */
        public void mo67016b(boolean z) {
            this.f58048b = z;
        }

        /* renamed from: c */
        public void mo67017c() {
            if (this.f58048b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C22648c m102683a() {
        return new C22651c();
    }

    /* renamed from: b */
    public abstract void mo67016b(boolean z);

    /* renamed from: c */
    public abstract void mo67017c();

    public C22648c() {
    }
}
