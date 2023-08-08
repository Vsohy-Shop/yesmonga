package com.google.zxing;

import com.google.zxing.common.C34709a;
import com.google.zxing.common.C34710b;

/* renamed from: com.google.zxing.b */
public final class C34644b {

    /* renamed from: a */
    public final C34629a f83814a;

    /* renamed from: b */
    public C34710b f83815b;

    public C34644b(C34629a aVar) {
        if (aVar != null) {
            this.f83814a = aVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C34644b mo102477a(int i, int i2, int i3, int i4) {
        return new C34644b(this.f83814a.mo102410a(this.f83814a.mo102414e().mo102741a(i, i2, i3, i4)));
    }

    /* renamed from: b */
    public C34710b mo102478b() throws NotFoundException {
        if (this.f83815b == null) {
            this.f83815b = this.f83814a.mo102411b();
        }
        return this.f83815b;
    }

    /* renamed from: c */
    public C34709a mo102479c(int i, C34709a aVar) throws NotFoundException {
        return this.f83814a.mo102412c(i, aVar);
    }

    /* renamed from: d */
    public int mo102480d() {
        return this.f83814a.mo102413d();
    }

    /* renamed from: e */
    public int mo102481e() {
        return this.f83814a.mo102415f();
    }

    /* renamed from: f */
    public boolean mo102482f() {
        return this.f83814a.mo102414e().mo102745g();
    }

    /* renamed from: g */
    public boolean mo102483g() {
        return this.f83814a.mo102414e().mo102746h();
    }

    /* renamed from: h */
    public C34644b mo102484h() {
        return new C34644b(this.f83814a.mo102410a(this.f83814a.mo102414e().mo102747i()));
    }

    /* renamed from: i */
    public C34644b mo102485i() {
        return new C34644b(this.f83814a.mo102410a(this.f83814a.mo102414e().mo102748j()));
    }

    public String toString() {
        try {
            return mo102478b().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
