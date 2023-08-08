package com.contentsquare.android.sdk;

import java.lang.ref.WeakReference;

/* renamed from: com.contentsquare.android.sdk.g5 */
public class C14366g5<E> {

    /* renamed from: a */
    public C14366g5<E>.b<E> f35538a;

    /* renamed from: b */
    public C14366g5<E>.b<E> f35539b;

    /* renamed from: c */
    public C14663r3<E> f35540c = new C14367a();

    /* renamed from: com.contentsquare.android.sdk.g5$a */
    public class C14367a implements C14663r3<E> {
        public C14367a() {
        }

        /* renamed from: b */
        public boolean mo34386b(E e) {
            return e != null;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.g5$b */
    public final class C14368b<T> {

        /* renamed from: a */
        public final WeakReference<T> f35542a;

        /* renamed from: b */
        public C14366g5<E>.b<T> f35543b;

        /* renamed from: c */
        public C14366g5<E>.b<T> f35544c;

        public C14368b(T t) {
            this.f35542a = new WeakReference<>(t);
        }

        /* renamed from: a */
        public T mo35349a() {
            return this.f35542a.get();
        }
    }

    /* renamed from: a */
    public final E mo35341a(C14663r3<E> r3Var) {
        for (C14368b bVar = this.f35538a; bVar != null; bVar = bVar.f35543b) {
            E a = bVar.mo35349a();
            if (this.f35540c.mo34386b(a) && r3Var.mo34386b(a)) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public E mo35342b(C14663r3<E> r3Var, int i) {
        return i == 2 ? mo35341a(r3Var) : mo35347g(r3Var);
    }

    /* renamed from: c */
    public void mo35343c() {
        C14366g5<E>.b<E> bVar = this.f35538a;
        while (bVar != null) {
            C14366g5<E>.b<T> bVar2 = bVar.f35543b;
            bVar.f35542a.clear();
            mo35344d(bVar);
            bVar = bVar2;
        }
        this.f35538a = null;
        this.f35539b = null;
    }

    /* renamed from: d */
    public final void mo35344d(C14366g5<E>.b<E> bVar) {
        bVar.f35544c = null;
        bVar.f35543b = null;
    }

    /* renamed from: e */
    public void mo35345e(E e) {
        mo35348h(e);
    }

    /* renamed from: f */
    public E mo35346f() {
        for (C14368b bVar = this.f35539b; bVar != null; bVar = bVar.f35544c) {
            E a = bVar.mo35349a();
            if (this.f35540c.mo34386b(a)) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final E mo35347g(C14663r3<E> r3Var) {
        for (C14368b bVar = this.f35539b; bVar != null; bVar = bVar.f35544c) {
            E a = bVar.mo35349a();
            if (this.f35540c.mo34386b(a) && r3Var.mo34386b(a)) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: h */
    public void mo35348h(E e) {
        C14366g5<E>.b<E> bVar = this.f35539b;
        C14366g5<E>.b<E> bVar2 = new C14368b<>(e);
        this.f35539b = bVar2;
        if (bVar == null) {
            this.f35538a = bVar2;
            return;
        }
        bVar2.f35544c = bVar;
        bVar.f35543b = bVar2;
    }
}
