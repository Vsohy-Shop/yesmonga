package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.appupdate.C31877k;
import com.google.android.play.core.internal.C32046e1;
import com.google.android.play.core.internal.C32052g1;
import com.google.android.play.core.splitinstall.testing.C32200a;
import com.google.android.play.core.splitinstall.testing.C32211l;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.h0 */
public final class C32172h0 implements C32193q0 {

    /* renamed from: a */
    public C32052g1<Context> f78420a;

    /* renamed from: b */
    public C32052g1<C32162d0> f78421b;

    /* renamed from: c */
    public C32052g1<C32217w0> f78422c;

    /* renamed from: d */
    public C32052g1<C32199t0> f78423d = C32046e1.m129795b(C31877k.m129299b(this.f78420a));

    /* renamed from: e */
    public C32052g1<C32166e0> f78424e;

    /* renamed from: f */
    public C32052g1<C32223z0> f78425f;

    /* renamed from: g */
    public C32052g1<File> f78426g;

    /* renamed from: h */
    public C32052g1<C32200a> f78427h;

    /* renamed from: i */
    public C32052g1<C32187n0> f78428i;

    /* renamed from: j */
    public C32052g1<C32158c> f78429j;

    public /* synthetic */ C32172h0(C32157b1 b1Var) {
        C32160c1 c1Var = new C32160c1(b1Var);
        this.f78420a = c1Var;
        this.f78421b = C32046e1.m129795b(new C32168f0(c1Var, (byte[]) null));
        this.f78422c = C32046e1.m129795b(new C32173i(b1Var));
        C32052g1<C32166e0> b = C32046e1.m129795b(new C32168f0(this.f78420a));
        this.f78424e = b;
        this.f78425f = C32046e1.m129795b(new C32154a1(this.f78421b, this.f78422c, this.f78423d, b));
        C32052g1<File> b2 = C32046e1.m129795b(new C32163d1(this.f78420a));
        this.f78426g = b2;
        C32052g1<C32200a> b3 = C32046e1.m129795b(new C32211l(this.f78420a, b2, this.f78423d));
        this.f78427h = b3;
        C32052g1<C32187n0> b4 = C32046e1.m129795b(new C32189o0(this.f78425f, b3, this.f78426g));
        this.f78428i = b4;
        this.f78429j = C32046e1.m129795b(new C32175j(b1Var, b4));
    }

    /* renamed from: a */
    public final C32158c mo92972a() {
        return this.f78429j.mo92416a();
    }

    /* renamed from: b */
    public final File mo92973b() {
        return this.f78426g.mo92416a();
    }
}
