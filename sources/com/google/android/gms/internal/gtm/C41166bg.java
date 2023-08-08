package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.bg */
public final class C41166bg {

    /* renamed from: a */
    public final Integer f104460a;

    /* renamed from: b */
    public final Object f104461b;

    /* renamed from: c */
    public final List<Integer> f104462c = new ArrayList();

    /* renamed from: d */
    public boolean f104463d = false;

    public C41166bg(int i, Object obj) {
        this.f104460a = Integer.valueOf(i);
        this.f104461b = obj;
    }

    /* renamed from: a */
    public final C41166bg mo135067a(int i) {
        this.f104462c.add(Integer.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public final C41166bg mo135068b(boolean z) {
        this.f104463d = true;
        return this;
    }

    /* renamed from: c */
    public final C41214dg mo135069c() {
        C40843u.m166202l(this.f104460a);
        C40843u.m166202l(this.f104461b);
        return new C41214dg(this.f104460a, this.f104461b, this.f104462c, this.f104463d, (C41190cg) null);
    }
}
