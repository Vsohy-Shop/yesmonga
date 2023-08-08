package org.joda.time.format;

/* renamed from: org.joda.time.format.l */
public class C12687l implements C12675c, C12686k {

    /* renamed from: a */
    public final C12686k f31310a;

    public C12687l(C12686k kVar) {
        this.f31310a = kVar;
    }

    /* renamed from: a */
    public static C12675c m54344a(C12686k kVar) {
        if (kVar instanceof C12679e) {
            return ((C12679e) kVar).mo29295a();
        }
        if (kVar instanceof C12675c) {
            return (C12675c) kVar;
        }
        if (kVar == null) {
            return null;
        }
        return new C12687l(kVar);
    }

    /* renamed from: b */
    public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
        return this.f31310a.mo29196b(dVar, charSequence, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12687l) {
            return this.f31310a.equals(((C12687l) obj).f31310a);
        }
        return false;
    }

    /* renamed from: g */
    public int mo29264g() {
        return this.f31310a.mo29197g();
    }

    /* renamed from: h */
    public int mo29265h(C12676d dVar, String str, int i) {
        return this.f31310a.mo29196b(dVar, str, i);
    }
}
