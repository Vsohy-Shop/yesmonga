package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ab */
public final class C41861ab implements C41987hb {

    /* renamed from: a */
    public final C42246wa f106001a;

    /* renamed from: b */
    public final C42281yb f106002b;

    /* renamed from: c */
    public final boolean f106003c;

    /* renamed from: d */
    public final C41949f9 f106004d;

    public C41861ab(C42281yb ybVar, C41949f9 f9Var, C42246wa waVar) {
        this.f106002b = ybVar;
        this.f106003c = f9Var.mo136766c(waVar);
        this.f106004d = f9Var;
        this.f106001a = waVar;
    }

    /* renamed from: j */
    public static C41861ab m169670j(C42281yb ybVar, C41949f9 f9Var, C42246wa waVar) {
        return new C41861ab(ybVar, f9Var, waVar);
    }

    /* renamed from: a */
    public final int mo136563a(Object obj) {
        int hashCode = this.f106002b.mo136575d(obj).hashCode();
        if (!this.f106003c) {
            return hashCode;
        }
        this.f106004d.mo136764a(obj);
        throw null;
    }

    /* renamed from: b */
    public final int mo136564b(Object obj) {
        C42281yb ybVar = this.f106002b;
        int b = ybVar.mo136573b(ybVar.mo136575d(obj));
        if (!this.f106003c) {
            return b;
        }
        this.f106004d.mo136764a(obj);
        throw null;
    }

    /* renamed from: c */
    public final void mo136565c(Object obj) {
        this.f106002b.mo136578g(obj);
        this.f106004d.mo136765b(obj);
    }

    /* renamed from: d */
    public final void mo136566d(Object obj, Object obj2) {
        C42023jb.m170390c(this.f106002b, obj, obj2);
        if (this.f106003c) {
            this.f106004d.mo136764a(obj2);
            throw null;
        }
    }

    /* renamed from: e */
    public final boolean mo136567e(Object obj, Object obj2) {
        if (!this.f106002b.mo136575d(obj).equals(this.f106002b.mo136575d(obj2))) {
            return false;
        }
        if (!this.f106003c) {
            return true;
        }
        this.f106004d.mo136764a(obj);
        this.f106004d.mo136764a(obj2);
        throw null;
    }

    /* renamed from: f */
    public final Object mo136568f() {
        C42246wa waVar = this.f106001a;
        if (waVar instanceof C42177s9) {
            return ((C42177s9) waVar).mo137279m();
        }
        return waVar.mo137272c().mo137175N0();
    }

    /* renamed from: g */
    public final boolean mo136569g(Object obj) {
        this.f106004d.mo136764a(obj);
        throw null;
    }

    /* renamed from: h */
    public final void mo136570h(Object obj, C42112oc ocVar) throws IOException {
        this.f106004d.mo136764a(obj);
        throw null;
    }

    /* renamed from: i */
    public final void mo136571i(Object obj, byte[] bArr, int i, int i2, C42002i8 i8Var) throws IOException {
        C42177s9 s9Var = (C42177s9) obj;
        if (s9Var.zzc == C42298zb.m171286c()) {
            s9Var.zzc = C42298zb.m171288f();
        }
        C42109o9 o9Var = (C42109o9) obj;
        throw null;
    }
}
