package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.urbanairship.channel.z */
public class C9060z {

    /* renamed from: a */
    public final List<C9004a0> f24408a = new ArrayList();

    @C0359n0
    /* renamed from: a */
    public C9060z mo17951a(@C0359n0 String str, @C0359n0 String str2) {
        return mo17952b(str, Collections.singleton(str2));
    }

    @C0359n0
    /* renamed from: b */
    public C9060z mo17952b(@C0359n0 String str, @C0359n0 Set<String> set) {
        String trim = str.trim();
        if (C9669o0.m36224e(trim)) {
            C36059m.m148409e("The tag group ID string cannot be null.", new Object[0]);
            return this;
        } else if (!mo17821c(trim)) {
            return this;
        } else {
            Set<String> b = C9006b0.m33508b(set);
            if (b.isEmpty()) {
                return this;
            }
            this.f24408a.add(C9004a0.m33500f(trim, b));
            return this;
        }
    }

    /* renamed from: c */
    public boolean mo17821c(@C0359n0 String str) {
        return true;
    }

    /* renamed from: d */
    public void mo17953d() {
        mo17822e(C9004a0.m33497b(this.f24408a));
    }

    /* renamed from: e */
    public void mo17822e(@C0359n0 List<C9004a0> list) {
    }

    @C0359n0
    /* renamed from: f */
    public C9060z mo17954f(@C0359n0 String str, @C0359n0 String str2) {
        return mo17955g(str, Collections.singleton(str2));
    }

    @C0359n0
    /* renamed from: g */
    public C9060z mo17955g(@C0359n0 String str, @C0359n0 Set<String> set) {
        String trim = str.trim();
        if (C9669o0.m36224e(trim)) {
            C36059m.m148409e("The tag group ID string cannot be null.", new Object[0]);
            return this;
        } else if (!mo17821c(trim)) {
            return this;
        } else {
            Set<String> b = C9006b0.m33508b(set);
            if (b.isEmpty()) {
                return this;
            }
            this.f24408a.add(C9004a0.m33501g(trim, b));
            return this;
        }
    }

    @C0359n0
    /* renamed from: h */
    public C9060z mo17956h(@C0359n0 String str, @C0359n0 String str2) {
        return mo17957i(str, Collections.singleton(str2));
    }

    @C0359n0
    /* renamed from: i */
    public C9060z mo17957i(@C0359n0 String str, @C0363p0 Set<String> set) {
        Set<String> set2;
        String trim = str.trim();
        if (C9669o0.m36224e(trim)) {
            C36059m.m148409e("The tag group ID string cannot be null.", new Object[0]);
            return this;
        } else if (!mo17821c(trim)) {
            return this;
        } else {
            if (set == null) {
                set2 = new HashSet<>();
            } else {
                set2 = C9006b0.m33508b(set);
            }
            this.f24408a.add(C9004a0.m33502h(trim, set2));
            return this;
        }
    }
}
