package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.urbanairship.contacts.t */
public abstract class C9101t {

    /* renamed from: a */
    public final List<C9102u> f24596a = new ArrayList();

    /* renamed from: b */
    public final C9656j f24597b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9101t(C9656j jVar) {
        this.f24597b = jVar;
    }

    /* renamed from: a */
    public void mo18094a() {
        mo18059c(C9102u.m33981b(this.f24596a));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: b */
    public C9101t mo18095b(@C0359n0 String str, @C0359n0 Set<Scope> set, boolean z) {
        for (Scope next : set) {
            if (z) {
                mo18096d(str, next);
            } else {
                mo18098f(str, next);
            }
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public abstract void mo18059c(@C0359n0 List<C9102u> list);

    @C0359n0
    /* renamed from: d */
    public C9101t mo18096d(@C0359n0 String str, @C0359n0 Scope scope) {
        String trim = str.trim();
        if (C9669o0.m36224e(trim)) {
            C36059m.m148409e("The subscription list ID must not be null or empty.", new Object[0]);
            return this;
        }
        this.f24596a.add(C9102u.m33984i(trim, scope, this.f24597b.mo19623a()));
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C9101t mo18097e(Set<String> set, @C0359n0 Scope scope) {
        for (String d : set) {
            mo18096d(d, scope);
        }
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public C9101t mo18098f(String str, @C0359n0 Scope scope) {
        String trim = str.trim();
        if (C9669o0.m36224e(trim)) {
            C36059m.m148409e("The subscription list ID must not be null or empty.", new Object[0]);
            return this;
        }
        this.f24596a.add(C9102u.m33985j(trim, scope, this.f24597b.mo19623a()));
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C9101t mo18099g(Set<String> set, @C0359n0 Scope scope) {
        for (String f : set) {
            mo18098f(f, scope);
        }
        return this;
    }
}
