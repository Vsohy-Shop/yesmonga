package com.bumptech.glide.util;

/* renamed from: com.bumptech.glide.util.h */
public final class C22625h {

    /* renamed from: com.bumptech.glide.util.h$a */
    public class C22626a implements C22627b<T> {

        /* renamed from: a */
        public volatile T f58014a;

        /* renamed from: b */
        public final /* synthetic */ C22627b f58015b;

        public C22626a(C22627b bVar) {
            this.f58015b = bVar;
        }

        public T get() {
            if (this.f58014a == null) {
                synchronized (this) {
                    if (this.f58014a == null) {
                        this.f58014a = C22633m.m102624d(this.f58015b.get());
                    }
                }
            }
            return this.f58014a;
        }
    }

    /* renamed from: com.bumptech.glide.util.h$b */
    public interface C22627b<T> {
        T get();
    }

    /* renamed from: a */
    public static <T> C22627b<T> m102601a(C22627b<T> bVar) {
        return new C22626a(bVar);
    }
}
