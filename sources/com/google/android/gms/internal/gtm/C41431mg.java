package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.mg */
public final class C41431mg extends C41310hg<C41310hg<?>> {

    /* renamed from: e */
    public static final C41431mg f104797e = new C41431mg("BREAK");

    /* renamed from: f */
    public static final C41431mg f104798f = new C41431mg("CONTINUE");

    /* renamed from: g */
    public static final C41431mg f104799g = new C41431mg("NULL");

    /* renamed from: h */
    public static final C41431mg f104800h = new C41431mg("UNDEFINED");

    /* renamed from: b */
    public final String f104801b;

    /* renamed from: c */
    public final boolean f104802c;

    /* renamed from: d */
    public final C41310hg<?> f104803d;

    public C41431mg(String str) {
        this.f104801b = str;
        this.f104802c = false;
        this.f104803d = null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo135436c() {
        return this.f104803d;
    }

    /* renamed from: i */
    public final C41310hg mo135642i() {
        return this.f104803d;
    }

    /* renamed from: j */
    public final boolean mo135643j() {
        return this.f104802c;
    }

    public final String toString() {
        return this.f104801b;
    }

    public C41431mg(C41310hg<?> hgVar) {
        C40843u.m166202l(hgVar);
        this.f104801b = "RETURN";
        this.f104802c = true;
        this.f104803d = hgVar;
    }
}
