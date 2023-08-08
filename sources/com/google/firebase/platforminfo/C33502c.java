package com.google.firebase.platforminfo;

import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.platforminfo.c */
public class C33502c implements C33509i {

    /* renamed from: a */
    public final String f81504a;

    /* renamed from: b */
    public final C33503d f81505b;

    public C33502c(Set<C33505f> set, C33503d dVar) {
        this.f81504a = m135076d(set);
        this.f81505b = dVar;
    }

    /* renamed from: b */
    public static C32580g<C33509i> m135074b() {
        return C32580g.m131636h(C33509i.class).mo94693b(C32608v.m131751q(C33505f.class)).mo94697f(new C33501b()).mo94695d();
    }

    /* renamed from: c */
    public static /* synthetic */ C33509i m135075c(C32584h hVar) {
        return new C33502c(hVar.mo94708g(C33505f.class), C33503d.m135077a());
    }

    /* renamed from: d */
    public static String m135076d(Set<C33505f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C33505f> it = set.iterator();
        while (it.hasNext()) {
            C33505f next = it.next();
            sb.append(next.mo97255b());
            sb.append('/');
            sb.append(next.mo97256c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String getUserAgent() {
        if (this.f81505b.mo97261b().isEmpty()) {
            return this.f81504a;
        }
        return this.f81504a + ' ' + m135076d(this.f81505b.mo97261b());
    }
}
