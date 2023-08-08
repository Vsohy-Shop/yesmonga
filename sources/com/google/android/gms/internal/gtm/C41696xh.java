package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.xh */
public final class C41696xh implements C41291gl {

    /* renamed from: a */
    public final C41672wh f105244a;

    /* renamed from: b */
    public int f105245b;

    /* renamed from: c */
    public int f105246c;

    /* renamed from: d */
    public int f105247d = 0;

    public C41696xh(C41672wh whVar) {
        C41650vj.m168604f(whVar, "input");
        this.f105244a = whVar;
        whVar.f105216c = this;
    }

    /* renamed from: i */
    public static final void m168721i(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzvk.m169000g();
        }
    }

    /* renamed from: l */
    public static final void m168722l(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzvk.m169000g();
        }
    }

    /* renamed from: m */
    public static C41696xh m168723m(C41672wh whVar) {
        C41696xh xhVar = whVar.f105216c;
        if (xhVar != null) {
            return xhVar;
        }
        return new C41696xh(whVar);
    }

    /* renamed from: A */
    public final boolean mo135236A() throws IOException {
        int i;
        if (this.f105244a.mo135842i() || (i = this.f105245b) == this.f105246c) {
            return false;
        }
        return this.f105244a.mo135844k(i);
    }

    /* renamed from: B */
    public final <T> T mo135237B(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        mo136044g(3);
        return mo136041a(hlVar, wiVar);
    }

    /* renamed from: C */
    public final void mo135238C(List<Boolean> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41311hh) {
            C41311hh hhVar = (C41311hh) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    hhVar.mo135445h(this.f105244a.mo135843j());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    hhVar.mo135445h(this.f105244a.mo135843j());
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f105244a.mo135843j()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Boolean.valueOf(this.f105244a.mo135843j()));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: D */
    public final void mo135239D(List<Float> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41193cj) {
            C41193cj cjVar = (C41193cj) list;
            int i = this.f105245b & 7;
            if (i == 2) {
                int p = ((C41624uh) this.f105244a).mo135917p();
                m168721i(p);
                int a = this.f105244a.mo135834a() + p;
                do {
                    cjVar.mo135182h(Float.intBitsToFloat(((C41624uh) this.f105244a).mo135916o()));
                } while (this.f105244a.mo135834a() < a);
            } else if (i == 5) {
                do {
                    cjVar.mo135182h(Float.intBitsToFloat(((C41624uh) this.f105244a).mo135916o()));
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 2) {
                int p2 = ((C41624uh) this.f105244a).mo135917p();
                m168721i(p2);
                int a2 = this.f105244a.mo135834a() + p2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C41624uh) this.f105244a).mo135916o())));
                } while (this.f105244a.mo135834a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C41624uh) this.f105244a).mo135916o())));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: E */
    public final void mo135240E(List<Long> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i = this.f105245b & 7;
            if (i == 1) {
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135918q());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int p = ((C41624uh) this.f105244a).mo135917p();
                m168722l(p);
                int a = this.f105244a.mo135834a() + p;
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135918q());
                } while (this.f105244a.mo135834a() < a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135918q()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int p2 = ((C41624uh) this.f105244a).mo135917p();
                m168722l(p2);
                int a2 = this.f105244a.mo135834a() + p2;
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135918q()));
                } while (this.f105244a.mo135834a() < a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: F */
    public final <T> void mo135241F(List<T> list, C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int c;
        int i = this.f105245b;
        if ((i & 7) == 3) {
            do {
                list.add(mo136041a(hlVar, wiVar));
                if (!this.f105244a.mo135842i() && this.f105247d == 0) {
                    c = this.f105244a.mo135836c();
                } else {
                    return;
                }
            } while (c == i);
            this.f105247d = c;
            return;
        }
        throw zzvk.m168994a();
    }

    /* renamed from: G */
    public final <T> T mo135242G(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        mo136044g(2);
        return mo136042b(hlVar, wiVar);
    }

    /* renamed from: H */
    public final void mo135243H(List<Long> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135919r());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135919r());
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135919r()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135919r()));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: I */
    public final void mo135244I(List<Integer> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135917p());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135917p());
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135917p()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135917p()));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: J */
    public final String mo135245J() throws IOException {
        mo136044g(2);
        return this.f105244a.mo135839f();
    }

    /* renamed from: K */
    public final <T> void mo135246K(List<T> list, C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int c;
        int i = this.f105245b;
        if ((i & 7) == 2) {
            do {
                list.add(mo136042b(hlVar, wiVar));
                if (!this.f105244a.mo135842i() && this.f105247d == 0) {
                    c = this.f105244a.mo135836c();
                } else {
                    return;
                }
            } while (c == i);
            this.f105247d = c;
            return;
        }
        throw zzvk.m168994a();
    }

    /* renamed from: L */
    public final void mo135247L(List<zztd> list) throws IOException {
        int c;
        if ((this.f105245b & 7) == 2) {
            do {
                list.add(mo135291v());
                if (!this.f105244a.mo135842i()) {
                    c = this.f105244a.mo135836c();
                } else {
                    return;
                }
            } while (c == this.f105245b);
            this.f105247d = c;
            return;
        }
        throw zzvk.m168994a();
    }

    /* renamed from: M */
    public final <T> T mo135248M(Class<T> cls, C41673wi wiVar) throws IOException {
        mo136044g(2);
        return mo136042b(C41219dl.m167407a().mo135299b(cls), wiVar);
    }

    /* renamed from: N */
    public final void mo135249N(List<Long> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135919r());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135919r());
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135919r()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135919r()));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: O */
    public final void mo135250O(List<Double> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41601ti) {
            C41601ti tiVar = (C41601ti) list;
            int i = this.f105245b & 7;
            if (i == 1) {
                do {
                    tiVar.mo135866h(Double.longBitsToDouble(((C41624uh) this.f105244a).mo135918q()));
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int p = ((C41624uh) this.f105244a).mo135917p();
                m168722l(p);
                int a = this.f105244a.mo135834a() + p;
                do {
                    tiVar.mo135866h(Double.longBitsToDouble(((C41624uh) this.f105244a).mo135918q()));
                } while (this.f105244a.mo135834a() < a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C41624uh) this.f105244a).mo135918q())));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int p2 = ((C41624uh) this.f105244a).mo135917p();
                m168722l(p2);
                int a2 = this.f105244a.mo135834a() + p2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C41624uh) this.f105244a).mo135918q())));
                } while (this.f105244a.mo135834a() < a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: P */
    public final void mo135251P(List<Integer> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135917p());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135917p());
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135917p()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135917p()));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: Q */
    public final <T> T mo135252Q(Class<T> cls, C41673wi wiVar) throws IOException {
        mo136044g(3);
        return mo136041a(C41219dl.m167407a().mo135299b(cls), wiVar);
    }

    /* renamed from: R */
    public final String mo135253R() throws IOException {
        mo136044g(2);
        return this.f105244a.mo135838e();
    }

    /* renamed from: S */
    public final void mo135254S(List<Integer> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i = this.f105245b & 7;
            if (i == 2) {
                int p = ((C41624uh) this.f105244a).mo135917p();
                m168721i(p);
                int a = this.f105244a.mo135834a() + p;
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135916o());
                } while (this.f105244a.mo135834a() < a);
            } else if (i == 5) {
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135916o());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 2) {
                int p2 = ((C41624uh) this.f105244a).mo135917p();
                m168721i(p2);
                int a2 = this.f105244a.mo135834a() + p2;
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135916o()));
                } while (this.f105244a.mo135834a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135916o()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: T */
    public final void mo135255T(List<Integer> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135917p());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135917p());
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135917p()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135917p()));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: U */
    public final void mo135256U(List<String> list) throws IOException {
        mo136045n(list, false);
    }

    /* renamed from: V */
    public final void mo135257V(List<Long> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    jkVar.mo135523i(C41672wh.m168668m(((C41624uh) this.f105244a).mo135919r()));
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    jkVar.mo135523i(C41672wh.m168668m(((C41624uh) this.f105244a).mo135919r()));
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(C41672wh.m168668m(((C41624uh) this.f105244a).mo135919r())));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Long.valueOf(C41672wh.m168668m(((C41624uh) this.f105244a).mo135919r())));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: W */
    public final void mo135258W(List<String> list) throws IOException {
        mo136045n(list, true);
    }

    /* renamed from: X */
    public final void mo135259X(List<Integer> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i = this.f105245b & 7;
            if (i == 2) {
                int p = ((C41624uh) this.f105244a).mo135917p();
                m168721i(p);
                int a = this.f105244a.mo135834a() + p;
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135916o());
                } while (this.f105244a.mo135834a() < a);
            } else if (i == 5) {
                do {
                    njVar.mo135665U(((C41624uh) this.f105244a).mo135916o());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 2) {
                int p2 = ((C41624uh) this.f105244a).mo135917p();
                m168721i(p2);
                int a2 = this.f105244a.mo135834a() + p2;
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135916o()));
                } while (this.f105244a.mo135834a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((C41624uh) this.f105244a).mo135916o()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: Y */
    public final boolean mo135260Y() throws IOException {
        mo136044g(0);
        return this.f105244a.mo135843j();
    }

    /* renamed from: Z */
    public final void mo135261Z(List<Integer> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i = this.f105245b & 7;
            if (i == 0) {
                do {
                    njVar.mo135665U(C41672wh.m168667l(((C41624uh) this.f105244a).mo135917p()));
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int a = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    njVar.mo135665U(C41672wh.m168667l(((C41624uh) this.f105244a).mo135917p()));
                } while (this.f105244a.mo135834a() < a);
                mo136043c(a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(C41672wh.m168667l(((C41624uh) this.f105244a).mo135917p())));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int a2 = this.f105244a.mo135834a() + ((C41624uh) this.f105244a).mo135917p();
                do {
                    list.add(Integer.valueOf(C41672wh.m168667l(((C41624uh) this.f105244a).mo135917p())));
                } while (this.f105244a.mo135834a() < a2);
                mo136043c(a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo136041a(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int i = this.f105246c;
        this.f105246c = ((this.f105245b >>> 3) << 3) | 4;
        try {
            T f = hlVar.mo135460f();
            hlVar.mo135464j(f, this, wiVar);
            hlVar.mo135457c(f);
            if (this.f105245b == this.f105246c) {
                return f;
            }
            throw zzvk.m169000g();
        } finally {
            this.f105246c = i;
        }
    }

    /* renamed from: a0 */
    public final void mo135263a0(List<Long> list) throws IOException {
        int c;
        int c2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i = this.f105245b & 7;
            if (i == 1) {
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135918q());
                    if (!this.f105244a.mo135842i()) {
                        c2 = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c2 == this.f105245b);
                this.f105247d = c2;
            } else if (i == 2) {
                int p = ((C41624uh) this.f105244a).mo135917p();
                m168722l(p);
                int a = this.f105244a.mo135834a() + p;
                do {
                    jkVar.mo135523i(((C41624uh) this.f105244a).mo135918q());
                } while (this.f105244a.mo135834a() < a);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i2 = this.f105245b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135918q()));
                    if (!this.f105244a.mo135842i()) {
                        c = this.f105244a.mo135836c();
                    } else {
                        return;
                    }
                } while (c == this.f105245b);
                this.f105247d = c;
            } else if (i2 == 2) {
                int p2 = ((C41624uh) this.f105244a).mo135917p();
                m168722l(p2);
                int a2 = this.f105244a.mo135834a() + p2;
                do {
                    list.add(Long.valueOf(((C41624uh) this.f105244a).mo135918q()));
                } while (this.f105244a.mo135834a() < a2);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: b */
    public final <T> T mo136042b(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int p = ((C41624uh) this.f105244a).mo135917p();
        C41672wh whVar = this.f105244a;
        if (whVar.f105214a < whVar.f105215b) {
            int b = whVar.mo135835b(p);
            T f = hlVar.mo135460f();
            this.f105244a.f105214a++;
            hlVar.mo135464j(f, this, wiVar);
            hlVar.mo135457c(f);
            this.f105244a.mo135840g(0);
            C41672wh whVar2 = this.f105244a;
            whVar2.f105214a--;
            whVar2.mo135841h(b);
            return f;
        }
        throw new zzvk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: c */
    public final void mo136043c(int i) throws IOException {
        if (this.f105244a.mo135834a() != i) {
            throw zzvk.m169002j();
        }
    }

    /* renamed from: d */
    public final int mo135268d() throws IOException {
        int i = this.f105247d;
        if (i != 0) {
            this.f105245b = i;
            this.f105247d = 0;
        } else {
            i = this.f105244a.mo135836c();
            this.f105245b = i;
        }
        if (i == 0 || i == this.f105246c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: e */
    public final int mo135270e() {
        return this.f105245b;
    }

    /* renamed from: f */
    public final int mo135272f() throws IOException {
        mo136044g(0);
        return ((C41624uh) this.f105244a).mo135917p();
    }

    /* renamed from: g */
    public final void mo136044g(int i) throws IOException {
        if ((this.f105245b & 7) != i) {
            throw zzvk.m168994a();
        }
    }

    /* renamed from: h */
    public final int mo135276h() throws IOException {
        mo136044g(0);
        return ((C41624uh) this.f105244a).mo135917p();
    }

    /* renamed from: j */
    public final int mo135279j() throws IOException {
        mo136044g(5);
        return ((C41624uh) this.f105244a).mo135916o();
    }

    /* renamed from: k */
    public final int mo135280k() throws IOException {
        mo136044g(0);
        return C41672wh.m168667l(((C41624uh) this.f105244a).mo135917p());
    }

    /* renamed from: n */
    public final void mo136045n(List<String> list, boolean z) throws IOException {
        String str;
        int c;
        int c2;
        if ((this.f105245b & 7) != 2) {
            throw zzvk.m168994a();
        } else if ((list instanceof C41194ck) && !z) {
            C41194ck ckVar = (C41194ck) list;
            do {
                ckVar.mo135120E0(mo135291v());
                if (!this.f105244a.mo135842i()) {
                    c2 = this.f105244a.mo135836c();
                } else {
                    return;
                }
            } while (c2 == this.f105245b);
            this.f105247d = c2;
        } else {
            do {
                if (z) {
                    str = mo135245J();
                } else {
                    str = mo135253R();
                }
                list.add(str);
                if (!this.f105244a.mo135842i()) {
                    c = this.f105244a.mo135836c();
                } else {
                    return;
                }
            } while (c == this.f105245b);
            this.f105247d = c;
        }
    }

    /* renamed from: o */
    public final int mo135284o() throws IOException {
        mo136044g(5);
        return ((C41624uh) this.f105244a).mo135916o();
    }

    /* renamed from: p */
    public final int mo135285p() throws IOException {
        mo136044g(0);
        return ((C41624uh) this.f105244a).mo135917p();
    }

    /* renamed from: q */
    public final long mo135286q() throws IOException {
        mo136044g(0);
        return ((C41624uh) this.f105244a).mo135919r();
    }

    /* renamed from: r */
    public final long mo135287r() throws IOException {
        mo136044g(1);
        return ((C41624uh) this.f105244a).mo135918q();
    }

    /* renamed from: s */
    public final long mo135288s() throws IOException {
        mo136044g(0);
        return C41672wh.m168668m(((C41624uh) this.f105244a).mo135919r());
    }

    /* renamed from: t */
    public final long mo135289t() throws IOException {
        mo136044g(1);
        return ((C41624uh) this.f105244a).mo135918q();
    }

    /* renamed from: u */
    public final long mo135290u() throws IOException {
        mo136044g(0);
        return ((C41624uh) this.f105244a).mo135919r();
    }

    /* renamed from: v */
    public final zztd mo135291v() throws IOException {
        mo136044g(2);
        return this.f105244a.mo135837d();
    }

    public final double zza() throws IOException {
        mo136044g(1);
        return Double.longBitsToDouble(((C41624uh) this.f105244a).mo135918q());
    }

    public final float zzb() throws IOException {
        mo136044g(5);
        return Float.intBitsToFloat(((C41624uh) this.f105244a).mo135916o());
    }
}
