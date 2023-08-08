package com.google.android.datatransport.runtime;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.runtime.C40097b;
import com.google.auto.value.C32455c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C32455c
/* renamed from: com.google.android.datatransport.runtime.j */
public abstract class C40190j {

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.runtime.j$a */
    public static abstract class C40191a {
        /* renamed from: a */
        public final C40191a mo132841a(String str, int i) {
            mo132687e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C40191a mo132842b(String str, long j) {
            mo132687e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C40191a mo132843c(String str, String str2) {
            mo132687e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C40190j mo132686d();

        /* renamed from: e */
        public abstract Map<String, String> mo132687e();

        /* renamed from: f */
        public abstract C40191a mo132688f(Map<String, String> map);

        /* renamed from: g */
        public abstract C40191a mo132689g(Integer num);

        /* renamed from: h */
        public abstract C40191a mo132690h(C40189i iVar);

        /* renamed from: i */
        public abstract C40191a mo132691i(long j);

        /* renamed from: j */
        public abstract C40191a mo132692j(String str);

        /* renamed from: k */
        public abstract C40191a mo132693k(long j);
    }

    /* renamed from: a */
    public static C40191a m163460a() {
        return new C40097b.C40099b().mo132688f(new HashMap());
    }

    /* renamed from: b */
    public final String mo132834b(String str) {
        String str2 = mo132677c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo132677c();

    @C0363p0
    /* renamed from: d */
    public abstract Integer mo132678d();

    /* renamed from: e */
    public abstract C40189i mo132679e();

    /* renamed from: f */
    public abstract long mo132681f();

    /* renamed from: g */
    public final int mo132835g(String str) {
        String str2 = mo132677c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo132836h(String str) {
        String str2 = mo132677c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo132837i() {
        return Collections.unmodifiableMap(mo132677c());
    }

    /* renamed from: j */
    public final String mo132838j(String str, String str2) {
        String str3 = mo132677c().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    /* renamed from: k */
    public byte[] mo132839k() {
        return mo132679e().mo132829a();
    }

    /* renamed from: l */
    public abstract String mo132683l();

    /* renamed from: m */
    public abstract long mo132684m();

    /* renamed from: n */
    public C40191a mo132840n() {
        return new C40097b.C40099b().mo132692j(mo132683l()).mo132689g(mo132678d()).mo132690h(mo132679e()).mo132691i(mo132681f()).mo132693k(mo132684m()).mo132688f(new HashMap(mo132677c()));
    }
}
