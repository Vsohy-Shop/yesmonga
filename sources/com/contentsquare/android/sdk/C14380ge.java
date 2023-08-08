package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.ge */
public final class C14380ge {

    /* renamed from: com.contentsquare.android.sdk.ge$a */
    public static final class C14381a<T> extends C14869xe implements C14533md<T> {

        /* renamed from: w */
        public T f35558w;

        public C14381a(T t) {
            this.f35558w = C14169a3.m60808a(t);
        }

        /* renamed from: b */
        public void mo34827b(T t) {
            synchronized (this) {
                if (!t.equals(this.f35558w)) {
                    this.f35558w = t;
                    mo36860g();
                }
            }
        }

        /* renamed from: c */
        public synchronized T mo34977c() {
            return this.f35558w;
        }
    }

    /* renamed from: a */
    public static <T> C14533md<T> m61919a(T t) {
        return new C14381a(t);
    }

    /* renamed from: b */
    public static <T> C14511m<T, T> m61920b(T t) {
        return C14535mf.m62637h(t);
    }
}
