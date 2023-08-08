package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.urbanairship.channel.v */
public abstract class C9053v {

    /* renamed from: a */
    public boolean f24387a = false;

    /* renamed from: b */
    public final Set<String> f24388b = new HashSet();

    /* renamed from: c */
    public final Set<String> f24389c = new HashSet();

    @C0359n0
    /* renamed from: a */
    public C9053v mo17929a(@C0359n0 String str) {
        this.f24389c.remove(str);
        this.f24388b.add(str);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public C9053v mo17930b(@C0359n0 Set<String> set) {
        this.f24389c.removeAll(set);
        this.f24388b.addAll(set);
        return this;
    }

    /* renamed from: c */
    public void mo17931c() {
        mo17820e(this.f24387a, this.f24388b, this.f24389c);
    }

    @C0359n0
    /* renamed from: d */
    public C9053v mo17932d() {
        this.f24387a = true;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public abstract void mo17820e(boolean z, @C0359n0 Set<String> set, @C0359n0 Set<String> set2);

    @C0359n0
    /* renamed from: f */
    public C9053v mo17933f(@C0359n0 String str) {
        this.f24388b.remove(str);
        this.f24389c.add(str);
        return this;
    }

    @C0359n0
    /* renamed from: g */
    public C9053v mo17934g(@C0359n0 Set<String> set) {
        this.f24388b.removeAll(set);
        this.f24389c.addAll(set);
        return this;
    }
}
