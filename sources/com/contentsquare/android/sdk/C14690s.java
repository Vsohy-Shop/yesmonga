package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14880y2;
import java.util.List;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.s */
public final class C14690s implements C14475k6 {

    /* renamed from: a */
    public final C14231c f36359a;

    /* renamed from: b */
    public int f36360b;

    /* renamed from: c */
    public int f36361c;

    /* renamed from: d */
    public int f36362d = 0;

    public C14690s(C14231c cVar) {
        C14231c cVar2 = (C14231c) C14566o3.m62806h(cVar, "input");
        this.f36359a = cVar2;
        cVar2.f35153d = this;
    }

    /* renamed from: b */
    public static C14690s m63305b(C14231c cVar) {
        C14690s sVar = cVar.f35153d;
        return sVar != null ? sVar : new C14690s(cVar);
    }

    /* renamed from: R0 */
    public void mo34560R0(List<Integer> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    x2Var.mo36802w(this.f36359a.mo34725B());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    x2Var.mo36802w(this.f36359a.mo34725B());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34725B()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34725B()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: S0 */
    public String mo34561S0() {
        mo36363e(2);
        return this.f36359a.mo34746y();
    }

    /* renamed from: T0 */
    public void mo34562T0(List<C14719t0> list) {
        int A;
        if (C14710sf.m63426c(this.f36360b) == 2) {
            do {
                list.add(mo34602p());
                if (!this.f36359a.mo34729h()) {
                    A = this.f36359a.mo34724A();
                } else {
                    return;
                }
            } while (A == this.f36360b);
            this.f36362d = A;
            return;
        }
        throw C14394h5.m62028f();
    }

    /* renamed from: U0 */
    public void mo34563U0(List<Float> list) {
        int A;
        int A2;
        if (list instanceof C14382gf) {
            C14382gf gfVar = (C14382gf) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 2) {
                int B = this.f36359a.mo34725B();
                mo36365g(B);
                int a = this.f36359a.mo34727a() + B;
                do {
                    gfVar.mo35387h(this.f36359a.mo34739r());
                } while (this.f36359a.mo34727a() < a);
            } else if (c == 5) {
                do {
                    gfVar.mo35387h(this.f36359a.mo34739r());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 2) {
                int B2 = this.f36359a.mo34725B();
                mo36365g(B2);
                int a2 = this.f36359a.mo34727a() + B2;
                do {
                    list.add(Float.valueOf(this.f36359a.mo34739r()));
                } while (this.f36359a.mo34727a() < a2);
            } else if (c2 == 5) {
                do {
                    list.add(Float.valueOf(this.f36359a.mo34739r()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
            } else {
                throw C14394h5.m62028f();
            }
        }
    }

    /* renamed from: V */
    public void mo34564V(List<Boolean> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14444j7) {
            C14444j7 j7Var = (C14444j7) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    j7Var.mo35631k(this.f36359a.mo34731j());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    j7Var.mo35631k(this.f36359a.mo34731j());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f36359a.mo34731j()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Boolean.valueOf(this.f36359a.mo34731j()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: V0 */
    public void mo34565V0(List<Integer> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    x2Var.mo36802w(this.f36359a.mo34744w());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    x2Var.mo36802w(this.f36359a.mo34744w());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34744w()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34744w()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: W */
    public void mo34566W(List<Long> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    yVar.mo36876k(this.f36359a.mo34726C());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    yVar.mo36876k(this.f36359a.mo34726C());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36359a.mo34726C()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Long.valueOf(this.f36359a.mo34726C()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: W0 */
    public <T> void mo34567W0(List<T> list, C14398h8<T> h8Var, C14787v2 v2Var) {
        int A;
        if (C14710sf.m63426c(this.f36360b) == 2) {
            int i = this.f36360b;
            do {
                list.add(mo36366h(h8Var, v2Var));
                if (!this.f36359a.mo34729h() && this.f36362d == 0) {
                    A = this.f36359a.mo34724A();
                } else {
                    return;
                }
            } while (A == i);
            this.f36362d = A;
            return;
        }
        throw C14394h5.m62028f();
    }

    /* renamed from: X0 */
    public void mo34568X0(List<Long> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    yVar.mo36876k(this.f36359a.mo34741t());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    yVar.mo36876k(this.f36359a.mo34741t());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36359a.mo34741t()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Long.valueOf(this.f36359a.mo34741t()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: Y */
    public int mo34569Y() {
        mo36363e(0);
        return this.f36359a.mo34740s();
    }

    @Deprecated
    /* renamed from: Y0 */
    public <T> void mo34570Y0(List<T> list, C14398h8<T> h8Var, C14787v2 v2Var) {
        int A;
        if (C14710sf.m63426c(this.f36360b) == 3) {
            int i = this.f36360b;
            do {
                list.add(mo36364f(h8Var, v2Var));
                if (!this.f36359a.mo34729h() && this.f36362d == 0) {
                    A = this.f36359a.mo34724A();
                } else {
                    return;
                }
            } while (A == i);
            this.f36362d = A;
            return;
        }
        throw C14394h5.m62028f();
    }

    /* renamed from: Z0 */
    public void mo34571Z0(List<Integer> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    x2Var.mo36802w(this.f36359a.mo34740s());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    x2Var.mo36802w(this.f36359a.mo34740s());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34740s()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34740s()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: a */
    public float mo34572a() {
        mo36363e(5);
        return this.f36359a.mo34739r();
    }

    /* renamed from: a1 */
    public void mo34573a1(List<Integer> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    x2Var.mo36802w(this.f36359a.mo34736o());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    x2Var.mo36802w(this.f36359a.mo34736o());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34736o()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34736o()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: b1 */
    public void mo34575b1(List<Long> list) {
        int A;
        int A2;
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 1) {
                do {
                    yVar.mo36876k(this.f36359a.mo34738q());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
            } else if (c == 2) {
                int B = this.f36359a.mo34725B();
                mo36367i(B);
                int a = this.f36359a.mo34727a() + B;
                do {
                    yVar.mo36876k(this.f36359a.mo34738q());
                } while (this.f36359a.mo34727a() < a);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 1) {
                do {
                    list.add(Long.valueOf(this.f36359a.mo34738q()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
            } else if (c2 == 2) {
                int B2 = this.f36359a.mo34725B();
                mo36367i(B2);
                int a2 = this.f36359a.mo34727a() + B2;
                do {
                    list.add(Long.valueOf(this.f36359a.mo34738q()));
                } while (this.f36359a.mo34727a() < a2);
            } else {
                throw C14394h5.m62028f();
            }
        }
    }

    /* renamed from: c */
    public final void mo36361c(int i) {
        if (this.f36359a.mo34727a() != i) {
            throw C14394h5.m62033k();
        }
    }

    /* renamed from: c1 */
    public boolean mo34577c1() {
        mo36363e(0);
        return this.f36359a.mo34731j();
    }

    /* renamed from: d */
    public void mo36362d(List<String> list, boolean z) {
        int A;
        int A2;
        if (C14710sf.m63426c(this.f36360b) != 2) {
            throw C14394h5.m62028f();
        } else if (!(list instanceof C14308ec) || z) {
            do {
                list.add(z ? mo34592k() : mo34561S0());
                if (!this.f36359a.mo34729h()) {
                    A = this.f36359a.mo34724A();
                } else {
                    return;
                }
            } while (A == this.f36360b);
            this.f36362d = A;
        } else {
            C14308ec ecVar = (C14308ec) list;
            do {
                ecVar.mo35080q0(mo34602p());
                if (!this.f36359a.mo34729h()) {
                    A2 = this.f36359a.mo34724A();
                } else {
                    return;
                }
            } while (A2 == this.f36360b);
            this.f36362d = A2;
        }
    }

    /* renamed from: d1 */
    public void mo34579d1(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 2) {
                int B = this.f36359a.mo34725B();
                mo36365g(B);
                int a = this.f36359a.mo34727a() + B;
                do {
                    x2Var.mo36802w(this.f36359a.mo34737p());
                } while (this.f36359a.mo34727a() < a);
            } else if (c == 5) {
                do {
                    x2Var.mo36802w(this.f36359a.mo34737p());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 2) {
                int B2 = this.f36359a.mo34725B();
                mo36365g(B2);
                int a2 = this.f36359a.mo34727a() + B2;
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34737p()));
                } while (this.f36359a.mo34727a() < a2);
            } else if (c2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34737p()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
            } else {
                throw C14394h5.m62028f();
            }
        }
    }

    /* renamed from: e */
    public final void mo36363e(int i) {
        if (C14710sf.m63426c(this.f36360b) != i) {
            throw C14394h5.m62028f();
        }
    }

    /* renamed from: e1 */
    public double mo34581e1() {
        mo36363e(1);
        return this.f36359a.mo34734m();
    }

    /* renamed from: f */
    public final <T> T mo36364f(C14398h8<T> h8Var, C14787v2 v2Var) {
        int i = this.f36361c;
        this.f36361c = C14710sf.m63425b(C14710sf.m63424a(this.f36360b), 4);
        try {
            T a = h8Var.mo35210a();
            h8Var.mo35221i(a, this, v2Var);
            h8Var.mo35216e(a);
            if (this.f36360b == this.f36361c) {
                return a;
            }
            throw C14394h5.m62031i();
        } finally {
            this.f36361c = i;
        }
    }

    /* renamed from: f1 */
    public void mo34583f1(List<Long> list) {
        int A;
        int A2;
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 1) {
                do {
                    yVar.mo36876k(this.f36359a.mo34743v());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
            } else if (c == 2) {
                int B = this.f36359a.mo34725B();
                mo36367i(B);
                int a = this.f36359a.mo34727a() + B;
                do {
                    yVar.mo36876k(this.f36359a.mo34743v());
                } while (this.f36359a.mo34727a() < a);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 1) {
                do {
                    list.add(Long.valueOf(this.f36359a.mo34743v()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
            } else if (c2 == 2) {
                int B2 = this.f36359a.mo34725B();
                mo36367i(B2);
                int a2 = this.f36359a.mo34727a() + B2;
                do {
                    list.add(Long.valueOf(this.f36359a.mo34743v()));
                } while (this.f36359a.mo34727a() < a2);
            } else {
                throw C14394h5.m62028f();
            }
        }
    }

    /* renamed from: g */
    public final void mo36365g(int i) {
        if ((i & 3) != 0) {
            throw C14394h5.m62031i();
        }
    }

    /* renamed from: g1 */
    public int mo34585g1() {
        int i = this.f36362d;
        if (i != 0) {
            this.f36360b = i;
            this.f36362d = 0;
        } else {
            this.f36360b = this.f36359a.mo34724A();
        }
        int i2 = this.f36360b;
        if (i2 == 0 || i2 == this.f36361c) {
            return Integer.MAX_VALUE;
        }
        return C14710sf.m63424a(i2);
    }

    /* renamed from: h */
    public final <T> T mo36366h(C14398h8<T> h8Var, C14787v2 v2Var) {
        int B = this.f36359a.mo34725B();
        C14231c cVar = this.f36359a;
        if (cVar.f35150a < cVar.f35151b) {
            int k = cVar.mo34732k(B);
            T a = h8Var.mo35210a();
            this.f36359a.f35150a++;
            h8Var.mo35221i(a, this, v2Var);
            h8Var.mo35216e(a);
            this.f36359a.mo34728f(0);
            C14231c cVar2 = this.f36359a;
            cVar2.f35150a--;
            cVar2.mo34730i(k);
            return a;
        }
        throw C14394h5.m62032j();
    }

    /* renamed from: h1 */
    public <T> T mo34587h1(C14398h8<T> h8Var, C14787v2 v2Var) {
        mo36363e(2);
        return mo36366h(h8Var, v2Var);
    }

    /* renamed from: i */
    public final void mo36367i(int i) {
        if ((i & 7) != 0) {
            throw C14394h5.m62031i();
        }
    }

    /* renamed from: i1 */
    public boolean mo34589i1() {
        int i;
        if (this.f36359a.mo34729h() || (i = this.f36360b) == this.f36361c) {
            return false;
        }
        return this.f36359a.mo34735n(i);
    }

    /* renamed from: j */
    public int mo34590j() {
        mo36363e(0);
        return this.f36359a.mo34736o();
    }

    @Deprecated
    /* renamed from: j1 */
    public <T> T mo34591j1(C14398h8<T> h8Var, C14787v2 v2Var) {
        mo36363e(3);
        return mo36364f(h8Var, v2Var);
    }

    /* renamed from: k */
    public String mo34592k() {
        mo36363e(2);
        return this.f36359a.mo34747z();
    }

    /* renamed from: k1 */
    public void mo34593k1(List<Long> list) {
        int i;
        int A;
        int A2;
        if (list instanceof C14871y) {
            C14871y yVar = (C14871y) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 0) {
                do {
                    yVar.mo36876k(this.f36359a.mo34745x());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
                return;
            } else if (c == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    yVar.mo36876k(this.f36359a.mo34745x());
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 0) {
                do {
                    list.add(Long.valueOf(this.f36359a.mo34745x()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
                return;
            } else if (c2 == 2) {
                i = this.f36359a.mo34727a() + this.f36359a.mo34725B();
                do {
                    list.add(Long.valueOf(this.f36359a.mo34745x()));
                } while (this.f36359a.mo34727a() < i);
            } else {
                throw C14394h5.m62028f();
            }
        }
        mo36361c(i);
    }

    /* renamed from: l */
    public long mo34594l() {
        mo36363e(0);
        return this.f36359a.mo34726C();
    }

    /* renamed from: l1 */
    public <K, V> void mo34595l1(Map<K, V> map, C14880y2.C14881a<K, V> aVar, C14787v2 v2Var) {
        mo36363e(2);
        this.f36359a.mo34732k(this.f36359a.mo34725B());
        throw null;
    }

    /* renamed from: m */
    public long mo34596m() {
        mo36363e(1);
        return this.f36359a.mo34738q();
    }

    /* renamed from: m1 */
    public long mo34597m1() {
        mo36363e(1);
        return this.f36359a.mo34743v();
    }

    /* renamed from: n */
    public int mo34598n() {
        mo36363e(5);
        return this.f36359a.mo34737p();
    }

    /* renamed from: n1 */
    public void mo34599n1(List<String> list) {
        mo36362d(list, false);
    }

    /* renamed from: o */
    public int mo34600o() {
        return this.f36360b;
    }

    /* renamed from: o1 */
    public void mo34601o1(List<Integer> list) {
        int A;
        int A2;
        if (list instanceof C14846x2) {
            C14846x2 x2Var = (C14846x2) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 2) {
                int B = this.f36359a.mo34725B();
                mo36365g(B);
                int a = this.f36359a.mo34727a() + B;
                do {
                    x2Var.mo36802w(this.f36359a.mo34742u());
                } while (this.f36359a.mo34727a() < a);
            } else if (c == 5) {
                do {
                    x2Var.mo36802w(this.f36359a.mo34742u());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 2) {
                int B2 = this.f36359a.mo34725B();
                mo36365g(B2);
                int a2 = this.f36359a.mo34727a() + B2;
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34742u()));
                } while (this.f36359a.mo34727a() < a2);
            } else if (c2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f36359a.mo34742u()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
            } else {
                throw C14394h5.m62028f();
            }
        }
    }

    /* renamed from: p */
    public C14719t0 mo34602p() {
        mo36363e(2);
        return this.f36359a.mo34733l();
    }

    /* renamed from: p1 */
    public void mo34603p1(List<String> list) {
        mo36362d(list, true);
    }

    @Deprecated
    /* renamed from: q1 */
    public <T> T mo34605q1(Class<T> cls, C14787v2 v2Var) {
        mo36363e(3);
        return mo36364f(C14599od.m62876d().mo36104a(cls), v2Var);
    }

    /* renamed from: r1 */
    public <T> T mo34607r1(Class<T> cls, C14787v2 v2Var) {
        mo36363e(2);
        return mo36366h(C14599od.m62876d().mo36104a(cls), v2Var);
    }

    /* renamed from: s */
    public int mo34608s() {
        mo36363e(0);
        return this.f36359a.mo34744w();
    }

    /* renamed from: s1 */
    public void mo34610s1(List<Double> list) {
        int A;
        int A2;
        if (list instanceof C14177a8) {
            C14177a8 a8Var = (C14177a8) list;
            int c = C14710sf.m63426c(this.f36360b);
            if (c == 1) {
                do {
                    a8Var.mo34512h(this.f36359a.mo34734m());
                    if (!this.f36359a.mo34729h()) {
                        A2 = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A2 == this.f36360b);
                this.f36362d = A2;
            } else if (c == 2) {
                int B = this.f36359a.mo34725B();
                mo36367i(B);
                int a = this.f36359a.mo34727a() + B;
                do {
                    a8Var.mo34512h(this.f36359a.mo34734m());
                } while (this.f36359a.mo34727a() < a);
            } else {
                throw C14394h5.m62028f();
            }
        } else {
            int c2 = C14710sf.m63426c(this.f36360b);
            if (c2 == 1) {
                do {
                    list.add(Double.valueOf(this.f36359a.mo34734m()));
                    if (!this.f36359a.mo34729h()) {
                        A = this.f36359a.mo34724A();
                    } else {
                        return;
                    }
                } while (A == this.f36360b);
                this.f36362d = A;
            } else if (c2 == 2) {
                int B2 = this.f36359a.mo34725B();
                mo36367i(B2);
                int a2 = this.f36359a.mo34727a() + B2;
                do {
                    list.add(Double.valueOf(this.f36359a.mo34734m()));
                } while (this.f36359a.mo34727a() < a2);
            } else {
                throw C14394h5.m62028f();
            }
        }
    }

    /* renamed from: b */
    public long mo34574b() {
        mo36363e(0);
        return this.f36359a.mo34745x();
    }

    /* renamed from: c */
    public int mo34576c() {
        mo36363e(5);
        return this.f36359a.mo34742u();
    }

    /* renamed from: f */
    public int mo34582f() {
        mo36363e(0);
        return this.f36359a.mo34725B();
    }

    /* renamed from: i */
    public long mo34588i() {
        mo36363e(0);
        return this.f36359a.mo34741t();
    }
}
