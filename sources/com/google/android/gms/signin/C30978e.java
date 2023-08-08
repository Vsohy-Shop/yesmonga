package com.google.android.gms.signin;

import com.google.android.gms.common.C40928r;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C40858y;

/* renamed from: com.google.android.gms.signin.e */
public final class C30978e {

    /* renamed from: a */
    public static final C40477a.C40490g f74217a;
    @C40858y

    /* renamed from: b */
    public static final C40477a.C40490g f74218b;

    /* renamed from: c */
    public static final C40477a.C40478a f74219c;

    /* renamed from: d */
    public static final C40477a.C40478a f74220d;

    /* renamed from: e */
    public static final Scope f74221e = new Scope(C40928r.f104100a);

    /* renamed from: f */
    public static final Scope f74222f = new Scope("email");

    /* renamed from: g */
    public static final C40477a f74223g;

    /* renamed from: h */
    public static final C40477a f74224h;

    static {
        C40477a.C40490g gVar = new C40477a.C40490g();
        f74217a = gVar;
        C40477a.C40490g gVar2 = new C40477a.C40490g();
        f74218b = gVar2;
        C30975b bVar = new C30975b();
        f74219c = bVar;
        C30976c cVar = new C30976c();
        f74220d = cVar;
        f74223g = new C40477a("SignIn.API", bVar, gVar);
        f74224h = new C40477a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
