package com.google.firebase.components;

import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import com.google.firebase.inject.C33056a;
import com.google.firebase.inject.C33058b;

/* renamed from: com.google.firebase.components.d0 */
public class C32574d0<T> implements C33058b<T>, C33056a<T> {

    /* renamed from: c */
    public static final C33056a.C33057a<Object> f79042c = new C32568a0();

    /* renamed from: d */
    public static final C33058b<Object> f79043d = new C32570b0();
    @C0323b0("this")

    /* renamed from: a */
    public C33056a.C33057a<T> f79044a;

    /* renamed from: b */
    public volatile C33058b<T> f79045b;

    public C32574d0(C33056a.C33057a<T> aVar, C33058b<T> bVar) {
        this.f79044a = aVar;
        this.f79045b = bVar;
    }

    /* renamed from: e */
    public static <T> C32574d0<T> m131610e() {
        return new C32574d0<>(f79042c, f79043d);
    }

    /* renamed from: f */
    public static /* synthetic */ void m131611f(C33058b bVar) {
    }

    /* renamed from: g */
    public static /* synthetic */ Object m131612g() {
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m131613h(C33056a.C33057a aVar, C33056a.C33057a aVar2, C33058b bVar) {
        aVar.mo94676a(bVar);
        aVar2.mo94676a(bVar);
    }

    /* renamed from: i */
    public static <T> C32574d0<T> m131614i(C33058b<T> bVar) {
        return new C32574d0<>((C33056a.C33057a) null, bVar);
    }

    /* renamed from: a */
    public void mo94677a(@C0359n0 C33056a.C33057a<T> aVar) {
        C33058b<T> bVar;
        C33058b<T> bVar2;
        C33058b<T> bVar3 = this.f79045b;
        C33058b<Object> bVar4 = f79043d;
        if (bVar3 != bVar4) {
            aVar.mo94676a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f79045b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                this.f79044a = new C32572c0(this.f79044a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.mo94676a(bVar);
        }
    }

    public T get() {
        return this.f79045b.get();
    }

    /* renamed from: j */
    public void mo94678j(C33058b<T> bVar) {
        C33056a.C33057a<T> aVar;
        if (this.f79045b == f79043d) {
            synchronized (this) {
                aVar = this.f79044a;
                this.f79044a = null;
                this.f79045b = bVar;
            }
            aVar.mo94676a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
