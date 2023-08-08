package com.urbanairship.config;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36071u;
import com.urbanairship.config.C9062b;
import com.urbanairship.remoteconfig.C9603d;
import com.urbanairship.remoteconfig.C9604e;
import com.urbanairship.util.C9669o0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.config.e */
public class C9068e implements C9066c, C9604e {

    /* renamed from: f */
    public static final String f24424f = "com.urbanairship.config.REMOTE_CONFIG_KEY";

    /* renamed from: g */
    public static final String f24425g = "com.urbanairship.config.DISABLE_URL_FALLBACK_KEY";

    /* renamed from: a */
    public final C36071u f24426a;

    /* renamed from: b */
    public final AirshipConfigOptions f24427b;

    /* renamed from: c */
    public final Object f24428c = new Object();

    /* renamed from: d */
    public final List<C9062b.C9065c> f24429d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public C9062b f24430e;

    public C9068e(@C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C36071u uVar) {
        this.f24427b = airshipConfigOptions;
        this.f24426a = uVar;
    }

    /* renamed from: e */
    public static String m33781e(@C0359n0 String... strArr) {
        for (String str : strArr) {
            if (!C9669o0.m36224e(str)) {
                return str;
            }
        }
        return null;
    }

    @C0359n0
    /* renamed from: a */
    public C9062b mo17980a() {
        C9062b bVar;
        synchronized (this.f24428c) {
            if (this.f24430e == null) {
                mo17985f();
            }
            bVar = this.f24430e;
        }
        return bVar;
    }

    /* renamed from: b */
    public void mo17982b(@C0359n0 C9603d dVar) {
        mo17987h(dVar);
        this.f24426a.mo107854s(f24424f, dVar);
    }

    /* renamed from: c */
    public void mo17983c(C9062b.C9065c cVar) {
        this.f24429d.add(cVar);
    }

    /* renamed from: d */
    public void mo17984d() {
        this.f24426a.mo107857v(f24425g, true);
        mo17985f();
    }

    /* renamed from: f */
    public final void mo17985f() {
        mo17987h(C9603d.m35971a(this.f24426a.mo107845h(f24424f)));
    }

    /* renamed from: g */
    public void mo17986g(C9062b.C9065c cVar) {
        this.f24429d.remove(cVar);
    }

    /* renamed from: h */
    public final void mo17987h(@C0359n0 C9603d dVar) {
        C9062b.C9064b h = C9062b.m33756h();
        boolean z = false;
        AirshipConfigOptions airshipConfigOptions = this.f24427b;
        C9062b.C9064b i = h.mo17977l(m33781e(dVar.mo19527f(), airshipConfigOptions.f87126E, airshipConfigOptions.f87132e)).mo17975j(m33781e(dVar.mo19525d(), this.f24427b.f87134g)).mo17974i(m33781e(dVar.mo19524c(), this.f24427b.f87135h));
        if (this.f24426a.mo107843f(f24425g, this.f24427b.f87124C)) {
            i.mo17978m(dVar.mo19528g()).mo17973h(dVar.mo19523b()).mo17976k(dVar.mo19526e());
        } else {
            i.mo17978m(m33781e(dVar.mo19528g(), this.f24427b.f87133f)).mo17973h(m33781e(dVar.mo19523b(), this.f24427b.f87131d)).mo17976k(m33781e(dVar.mo19526e(), this.f24427b.f87130c));
        }
        C9062b g = i.mo17972g();
        synchronized (this.f24428c) {
            if (!g.equals(this.f24430e)) {
                z = true;
            }
            this.f24430e = g;
        }
        if (z) {
            for (C9062b.C9065c a : this.f24429d) {
                a.mo17979a();
            }
        }
    }
}
