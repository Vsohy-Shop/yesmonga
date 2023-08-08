package org.joda.time.format;

/* renamed from: org.joda.time.format.e */
public class C12679e implements C12686k {

    /* renamed from: a */
    public final C12675c f31243a;

    public C12679e(C12675c cVar) {
        this.f31243a = cVar;
    }

    /* renamed from: c */
    public static C12686k m54142c(C12675c cVar) {
        if (cVar instanceof C12687l) {
            return (C12686k) cVar;
        }
        if (cVar == null) {
            return null;
        }
        return new C12679e(cVar);
    }

    /* renamed from: a */
    public C12675c mo29295a() {
        return this.f31243a;
    }

    /* renamed from: b */
    public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
        return this.f31243a.mo29265h(dVar, charSequence.toString(), i);
    }

    /* renamed from: g */
    public int mo29197g() {
        return this.f31243a.mo29264g();
    }
}
