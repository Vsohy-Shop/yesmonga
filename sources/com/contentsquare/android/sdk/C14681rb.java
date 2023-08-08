package com.contentsquare.android.sdk;

import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.contentsquare.android.sdk.rb */
public class C14681rb<T> {

    /* renamed from: a */
    public final C14684c<T> f36351a = new C14684c<>();

    /* renamed from: b */
    public final C14684c<T> f36352b = new C14684c<>();

    /* renamed from: com.contentsquare.android.sdk.rb$a */
    public interface C14682a<T> {
        /* renamed from: a */
        T mo35875a();
    }

    /* renamed from: com.contentsquare.android.sdk.rb$b */
    public static class C14683b<T> {

        /* renamed from: a */
        public T f36353a;

        /* renamed from: b */
        public C14683b<T> f36354b;

        public String toString() {
            return "RecyclerWrapper{item=" + this.f36353a + ", next=" + this.f36354b + C12361b.f30259j;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.rb$c */
    public static class C14684c<T> {

        /* renamed from: a */
        public C14683b<T> f36355a;

        /* renamed from: a */
        public C14683b<T> mo36350a() {
            C14683b<T> bVar = this.f36355a;
            if (bVar == null) {
                return new C14683b<>();
            }
            this.f36355a = bVar.f36354b;
            return bVar;
        }

        /* renamed from: b */
        public void mo36351b(C14683b<T> bVar) {
            bVar.f36354b = this.f36355a;
            this.f36355a = bVar;
        }

        public String toString() {
            return "RecyclerWrapperQueue{pool=" + this.f36355a + C12361b.f30259j;
        }
    }

    /* renamed from: a */
    public synchronized T mo36346a(C14682a<T> aVar) {
        T t;
        C14683b<T> a = this.f36352b.mo36350a();
        t = a.f36353a;
        if (t == null) {
            t = aVar.mo35875a();
            a.f36353a = t;
        }
        this.f36351a.mo36351b(a);
        return t;
    }

    /* renamed from: b */
    public synchronized void mo36347b(T t) {
        C14683b<T> a = this.f36351a.mo36350a();
        a.f36353a = t;
        this.f36352b.mo36351b(a);
    }

    public String toString() {
        return "Recycler{in=" + this.f36351a + ", out=" + this.f36352b + C12361b.f30259j;
    }
}
