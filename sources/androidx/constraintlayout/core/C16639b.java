package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.b */
public class C16639b implements C16643e.C16644a {

    /* renamed from: g */
    public static final boolean f41395g = false;

    /* renamed from: h */
    public static final boolean f41396h = false;

    /* renamed from: a */
    public SolverVariable f41397a = null;

    /* renamed from: b */
    public float f41398b = 0.0f;

    /* renamed from: c */
    public boolean f41399c = false;

    /* renamed from: d */
    public ArrayList<SolverVariable> f41400d = new ArrayList<>();

    /* renamed from: e */
    public C16640a f41401e;

    /* renamed from: f */
    public boolean f41402f = false;

    /* renamed from: androidx.constraintlayout.core.b$a */
    public interface C16640a {
        void clear();

        /* renamed from: d */
        int mo48628d();

        /* renamed from: e */
        int mo48629e(SolverVariable solverVariable);

        /* renamed from: f */
        boolean mo48630f(SolverVariable solverVariable);

        /* renamed from: g */
        SolverVariable mo48631g(int i);

        /* renamed from: h */
        void mo48632h(SolverVariable solverVariable, float f, boolean z);

        /* renamed from: i */
        void mo48633i();

        /* renamed from: j */
        float mo48634j(SolverVariable solverVariable, boolean z);

        /* renamed from: k */
        int mo48635k();

        /* renamed from: l */
        void mo48636l();

        /* renamed from: m */
        float mo48637m(C16639b bVar, boolean z);

        /* renamed from: n */
        void mo48638n(SolverVariable solverVariable, float f);

        /* renamed from: o */
        float mo48639o(int i);

        /* renamed from: p */
        float mo48640p(SolverVariable solverVariable);

        /* renamed from: q */
        void mo48641q(float f);
    }

    public C16639b() {
    }

    /* renamed from: A */
    public SolverVariable mo48646A(SolverVariable solverVariable) {
        return mo48647B((boolean[]) null, solverVariable);
    }

    /* renamed from: B */
    public final SolverVariable mo48647B(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int d = this.f41401e.mo48628d();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float o = this.f41401e.mo48639o(i);
            if (o < 0.0f) {
                SolverVariable g = this.f41401e.mo48631g(i);
                if ((zArr == null || !zArr[g.f41363c]) && g != solverVariable && (((type = g.f41370x) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && o < f)) {
                    f = o;
                    solverVariable2 = g;
                }
            }
        }
        return solverVariable2;
    }

    /* renamed from: C */
    public void mo48648C(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f41397a;
        if (solverVariable2 != null) {
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41397a.f41364d = -1;
            this.f41397a = null;
        }
        float j = this.f41401e.mo48634j(solverVariable, true) * -1.0f;
        this.f41397a = solverVariable;
        if (j != 1.0f) {
            this.f41398b /= j;
            this.f41401e.mo48641q(j);
        }
    }

    /* renamed from: D */
    public void mo48649D() {
        this.f41397a = null;
        this.f41401e.clear();
        this.f41398b = 0.0f;
        this.f41402f = false;
    }

    /* renamed from: E */
    public int mo48650E() {
        int i;
        if (this.f41397a != null) {
            i = 4;
        } else {
            i = 0;
        }
        return i + 4 + 4 + this.f41401e.mo48635k();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo48651F() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f41397a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f41397a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f41398b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f41398b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            androidx.constraintlayout.core.b$a r5 = r10.f41401e
            int r5 = r5.mo48628d()
        L_0x005d:
            if (r3 >= r5) goto L_0x00eb
            androidx.constraintlayout.core.b$a r6 = r10.f41401e
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo48631g(r3)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e7
        L_0x0069:
            androidx.constraintlayout.core.b$a r7 = r10.f41401e
            float r7 = r7.mo48639o(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e7
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x0093:
            if (r8 <= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b9
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b8:
            float r7 = r7 * r9
        L_0x00b9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e6
        L_0x00cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e6:
            r1 = r4
        L_0x00e7:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00eb:
            if (r1 != 0) goto L_0x00fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C16639b.mo48651F():java.lang.String");
    }

    /* renamed from: G */
    public void mo48652G(C16643e eVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable != null && solverVariable.f41359Y) {
            float p = this.f41401e.mo48640p(solverVariable);
            this.f41398b += solverVariable.f41356E0 * p;
            this.f41401e.mo48634j(solverVariable, z);
            if (z) {
                solverVariable.mo48623z(this);
            }
            this.f41401e.mo48632h(eVar.f41434n.f41406d[solverVariable.f41360Z], p, z);
            if (C16643e.f41418x && this.f41401e.mo48628d() == 0) {
                this.f41402f = true;
                eVar.f41421a = true;
            }
        }
    }

    /* renamed from: a */
    public void mo48653a(C16643e eVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable != null && solverVariable.f41367g) {
            this.f41398b += solverVariable.f41366f * this.f41401e.mo48640p(solverVariable);
            this.f41401e.mo48634j(solverVariable, z);
            if (z) {
                solverVariable.mo48623z(this);
            }
            if (C16643e.f41418x && this.f41401e.mo48628d() == 0) {
                this.f41402f = true;
                eVar.f41421a = true;
            }
        }
    }

    /* renamed from: b */
    public void mo48654b(C16643e eVar) {
        if (eVar.f41427g.length != 0) {
            boolean z = false;
            while (!z) {
                int d = this.f41401e.mo48628d();
                for (int i = 0; i < d; i++) {
                    SolverVariable g = this.f41401e.mo48631g(i);
                    if (g.f41364d != -1 || g.f41367g || g.f41359Y) {
                        this.f41400d.add(g);
                    }
                }
                int size = this.f41400d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        SolverVariable solverVariable = this.f41400d.get(i2);
                        if (solverVariable.f41367g) {
                            mo48653a(eVar, solverVariable, true);
                        } else if (solverVariable.f41359Y) {
                            mo48652G(eVar, solverVariable, true);
                        } else {
                            mo48655c(eVar, eVar.f41427g[solverVariable.f41364d], true);
                        }
                    }
                    this.f41400d.clear();
                } else {
                    z = true;
                }
            }
            if (C16643e.f41418x && this.f41397a != null && this.f41401e.mo48628d() == 0) {
                this.f41402f = true;
                eVar.f41421a = true;
            }
        }
    }

    /* renamed from: c */
    public void mo48655c(C16643e eVar, C16639b bVar, boolean z) {
        this.f41398b += bVar.f41398b * this.f41401e.mo48637m(bVar, z);
        if (z) {
            bVar.f41397a.mo48623z(this);
        }
        if (C16643e.f41418x && this.f41397a != null && this.f41401e.mo48628d() == 0) {
            this.f41402f = true;
            eVar.f41421a = true;
        }
    }

    public void clear() {
        this.f41401e.clear();
        this.f41397a = null;
        this.f41398b = 0.0f;
    }

    /* renamed from: d */
    public void mo48657d(C16643e.C16644a aVar) {
        if (aVar instanceof C16639b) {
            C16639b bVar = (C16639b) aVar;
            this.f41397a = null;
            this.f41401e.clear();
            for (int i = 0; i < bVar.f41401e.mo48628d(); i++) {
                this.f41401e.mo48632h(bVar.f41401e.mo48631g(i), bVar.f41401e.mo48639o(i), true);
            }
        }
    }

    /* renamed from: e */
    public SolverVariable mo48658e(C16643e eVar, boolean[] zArr) {
        return mo48647B(zArr, (SolverVariable) null);
    }

    /* renamed from: f */
    public void mo48659f(SolverVariable solverVariable) {
        int i = solverVariable.f41365e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f41401e.mo48638n(solverVariable, f);
    }

    /* renamed from: g */
    public C16639b mo48660g(C16643e eVar, int i) {
        this.f41401e.mo48638n(eVar.mo48725s(i, "ep"), 1.0f);
        this.f41401e.mo48638n(eVar.mo48725s(i, "em"), -1.0f);
        return this;
    }

    public SolverVariable getKey() {
        return this.f41397a;
    }

    /* renamed from: h */
    public C16639b mo48662h(SolverVariable solverVariable, int i) {
        this.f41401e.mo48638n(solverVariable, (float) i);
        return this;
    }

    /* renamed from: i */
    public boolean mo48663i(C16643e eVar) {
        boolean z;
        SolverVariable j = mo48665j(eVar);
        if (j == null) {
            z = true;
        } else {
            mo48648C(j);
            z = false;
        }
        if (this.f41401e.mo48628d() == 0) {
            this.f41402f = true;
        }
        return z;
    }

    public boolean isEmpty() {
        return this.f41397a == null && this.f41398b == 0.0f && this.f41401e.mo48628d() == 0;
    }

    /* renamed from: j */
    public SolverVariable mo48665j(C16643e eVar) {
        boolean z;
        boolean z2;
        int d = this.f41401e.mo48628d();
        SolverVariable solverVariable = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z3 = false;
        boolean z4 = false;
        SolverVariable solverVariable2 = null;
        for (int i = 0; i < d; i++) {
            float o = this.f41401e.mo48639o(i);
            SolverVariable g = this.f41401e.mo48631g(i);
            if (g.f41370x == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    z2 = mo48682z(g, eVar);
                } else if (f > o) {
                    z2 = mo48682z(g, eVar);
                } else if (!z3 && mo48682z(g, eVar)) {
                    f = o;
                    solverVariable = g;
                    z3 = true;
                }
                z3 = z2;
                f = o;
                solverVariable = g;
            } else if (solverVariable == null && o < 0.0f) {
                if (solverVariable2 == null) {
                    z = mo48682z(g, eVar);
                } else if (f2 > o) {
                    z = mo48682z(g, eVar);
                } else if (!z4 && mo48682z(g, eVar)) {
                    f2 = o;
                    solverVariable2 = g;
                    z4 = true;
                }
                z4 = z;
                f2 = o;
                solverVariable2 = g;
            }
        }
        if (solverVariable != null) {
            return solverVariable;
        }
        return solverVariable2;
    }

    /* renamed from: k */
    public C16639b mo48666k(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable4, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41401e.mo48638n(solverVariable3, -1.0f);
            this.f41401e.mo48638n(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f41398b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f41401e.mo48638n(solverVariable, -1.0f);
            this.f41401e.mo48638n(solverVariable2, 1.0f);
            this.f41398b = (float) i;
        } else if (f >= 1.0f) {
            this.f41401e.mo48638n(solverVariable4, -1.0f);
            this.f41401e.mo48638n(solverVariable3, 1.0f);
            this.f41398b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f41401e.mo48638n(solverVariable, f2 * 1.0f);
            this.f41401e.mo48638n(solverVariable2, f2 * -1.0f);
            this.f41401e.mo48638n(solverVariable3, -1.0f * f);
            this.f41401e.mo48638n(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f41398b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: l */
    public C16639b mo48667l(SolverVariable solverVariable, int i) {
        this.f41397a = solverVariable;
        float f = (float) i;
        solverVariable.f41366f = f;
        this.f41398b = f;
        this.f41402f = true;
        return this;
    }

    /* renamed from: m */
    public C16639b mo48668m(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.f41401e.mo48638n(solverVariable, -1.0f);
        this.f41401e.mo48638n(solverVariable2, f);
        return this;
    }

    /* renamed from: n */
    public C16639b mo48669n(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f41401e.mo48638n(solverVariable, -1.0f);
        this.f41401e.mo48638n(solverVariable2, 1.0f);
        this.f41401e.mo48638n(solverVariable3, f);
        this.f41401e.mo48638n(solverVariable4, -f);
        return this;
    }

    /* renamed from: o */
    public C16639b mo48670o(float f, float f2, float f3, SolverVariable solverVariable, int i, SolverVariable solverVariable2, int i2, SolverVariable solverVariable3, int i3, SolverVariable solverVariable4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f41398b = (float) (((-i) - i2) + i3 + i4);
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41401e.mo48638n(solverVariable4, 1.0f);
            this.f41401e.mo48638n(solverVariable3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f41398b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41401e.mo48638n(solverVariable4, f4);
            this.f41401e.mo48638n(solverVariable3, -f4);
        }
        return this;
    }

    /* renamed from: p */
    public C16639b mo48671p(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f41398b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41401e.mo48638n(solverVariable4, 1.0f);
            this.f41401e.mo48638n(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f41401e.mo48638n(solverVariable3, 1.0f);
            this.f41401e.mo48638n(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41401e.mo48638n(solverVariable4, f4);
            this.f41401e.mo48638n(solverVariable3, -f4);
        }
        return this;
    }

    /* renamed from: q */
    public C16639b mo48672q(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f41398b = (float) (i * -1);
            this.f41401e.mo48638n(solverVariable, 1.0f);
        } else {
            this.f41398b = (float) i;
            this.f41401e.mo48638n(solverVariable, -1.0f);
        }
        return this;
    }

    /* renamed from: r */
    public C16639b mo48673r(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f41398b = (float) i;
        }
        if (!z) {
            this.f41401e.mo48638n(solverVariable, -1.0f);
            this.f41401e.mo48638n(solverVariable2, 1.0f);
        } else {
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
        }
        return this;
    }

    /* renamed from: s */
    public C16639b mo48674s(SolverVariable solverVariable, int i, SolverVariable solverVariable2) {
        this.f41398b = (float) i;
        this.f41401e.mo48638n(solverVariable, -1.0f);
        return this;
    }

    /* renamed from: t */
    public C16639b mo48675t(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f41398b = (float) i;
        }
        if (!z) {
            this.f41401e.mo48638n(solverVariable, -1.0f);
            this.f41401e.mo48638n(solverVariable2, 1.0f);
            this.f41401e.mo48638n(solverVariable3, 1.0f);
        } else {
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41401e.mo48638n(solverVariable3, -1.0f);
        }
        return this;
    }

    public String toString() {
        return mo48651F();
    }

    /* renamed from: u */
    public C16639b mo48677u(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f41398b = (float) i;
        }
        if (!z) {
            this.f41401e.mo48638n(solverVariable, -1.0f);
            this.f41401e.mo48638n(solverVariable2, 1.0f);
            this.f41401e.mo48638n(solverVariable3, -1.0f);
        } else {
            this.f41401e.mo48638n(solverVariable, 1.0f);
            this.f41401e.mo48638n(solverVariable2, -1.0f);
            this.f41401e.mo48638n(solverVariable3, 1.0f);
        }
        return this;
    }

    /* renamed from: v */
    public C16639b mo48678v(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f41401e.mo48638n(solverVariable3, 0.5f);
        this.f41401e.mo48638n(solverVariable4, 0.5f);
        this.f41401e.mo48638n(solverVariable, -0.5f);
        this.f41401e.mo48638n(solverVariable2, -0.5f);
        this.f41398b = -f;
        return this;
    }

    /* renamed from: w */
    public void mo48679w() {
        float f = this.f41398b;
        if (f < 0.0f) {
            this.f41398b = f * -1.0f;
            this.f41401e.mo48633i();
        }
    }

    /* renamed from: x */
    public boolean mo48680x() {
        SolverVariable solverVariable = this.f41397a;
        return solverVariable != null && (solverVariable.f41370x == SolverVariable.Type.UNRESTRICTED || this.f41398b >= 0.0f);
    }

    /* renamed from: y */
    public boolean mo48681y(SolverVariable solverVariable) {
        return this.f41401e.mo48630f(solverVariable);
    }

    /* renamed from: z */
    public final boolean mo48682z(SolverVariable solverVariable, C16643e eVar) {
        return solverVariable.f41358X <= 1;
    }

    public C16639b(C16641c cVar) {
        this.f41401e = new C16638a(this, cVar);
    }
}
