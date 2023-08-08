package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.urbanairship.channel.r */
public abstract class C9049r {

    /* renamed from: a */
    public final List<C9051t> f24370a = new ArrayList();

    /* renamed from: b */
    public final C9656j f24371b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9049r(C9656j jVar) {
        this.f24371b = jVar;
    }

    /* renamed from: a */
    public void mo17904a() {
        mo17824c(C9051t.m33699b(this.f24370a));
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public C9049r mo17905b(String str, boolean z) {
        return z ? mo17906d(str) : mo17908f(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public abstract void mo17824c(@C0359n0 List<C9051t> list);

    @C0359n0
    /* renamed from: d */
    public C9049r mo17906d(@C0359n0 String str) {
        String trim = str.trim();
        if (C9669o0.m36224e(trim)) {
            C36059m.m148409e("The subscription list ID must not be null or empty.", new Object[0]);
            return this;
        }
        this.f24370a.add(C9051t.m33702h(trim, this.f24371b.mo19623a()));
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C9049r mo17907e(Set<String> set) {
        for (String d : set) {
            mo17906d(d);
        }
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C9049r mo17908f(String str) {
        String trim = str.trim();
        if (C9669o0.m36224e(trim)) {
            C36059m.m148409e("The subscription list ID must not be null or empty.", new Object[0]);
            return this;
        }
        this.f24370a.add(C9051t.m33703i(trim, this.f24371b.mo19623a()));
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C9049r mo17909g(Set<String> set) {
        for (String f : set) {
            mo17908f(f);
        }
        return this;
    }
}
