package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C16639b;
import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.i */
public class C16653i implements C16639b.C16640a {

    /* renamed from: n */
    public static final boolean f41498n = false;

    /* renamed from: o */
    public static final boolean f41499o = true;

    /* renamed from: p */
    public static float f41500p = 0.001f;

    /* renamed from: a */
    public final int f41501a = -1;

    /* renamed from: b */
    public int f41502b = 16;

    /* renamed from: c */
    public int f41503c = 16;

    /* renamed from: d */
    public int[] f41504d = new int[16];

    /* renamed from: e */
    public int[] f41505e = new int[16];

    /* renamed from: f */
    public int[] f41506f = new int[16];

    /* renamed from: g */
    public float[] f41507g = new float[16];

    /* renamed from: h */
    public int[] f41508h = new int[16];

    /* renamed from: i */
    public int[] f41509i = new int[16];

    /* renamed from: j */
    public int f41510j = 0;

    /* renamed from: k */
    public int f41511k = -1;

    /* renamed from: l */
    public final C16639b f41512l;

    /* renamed from: m */
    public final C16641c f41513m;

    public C16653i(C16639b bVar, C16641c cVar) {
        this.f41512l = bVar;
        this.f41513m = cVar;
        clear();
    }

    /* renamed from: a */
    public final void mo48750a(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.f41363c % this.f41503c;
        int[] iArr2 = this.f41504d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f41505e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f41505e[i] = -1;
    }

    /* renamed from: b */
    public final void mo48751b(int i, SolverVariable solverVariable, float f) {
        this.f41506f[i] = solverVariable.f41363c;
        this.f41507g[i] = f;
        this.f41508h[i] = -1;
        this.f41509i[i] = -1;
        solverVariable.mo48615b(this.f41512l);
        solverVariable.f41358X++;
        this.f41510j++;
    }

    /* renamed from: c */
    public final void mo48752c() {
        for (int i = 0; i < this.f41503c; i++) {
            if (this.f41504d[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.f41504d[i];
                boolean z = false;
                while (!z) {
                    str = str + " " + this.f41506f[i2];
                    int i3 = this.f41505e[i2];
                    if (i3 != -1) {
                        i2 = i3;
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    public void clear() {
        int i = this.f41510j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable g = mo48631g(i2);
            if (g != null) {
                g.mo48623z(this.f41512l);
            }
        }
        for (int i3 = 0; i3 < this.f41502b; i3++) {
            this.f41506f[i3] = -1;
            this.f41505e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f41503c; i4++) {
            this.f41504d[i4] = -1;
        }
        this.f41510j = 0;
        this.f41511k = -1;
    }

    /* renamed from: d */
    public int mo48628d() {
        return this.f41510j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo48629e(androidx.constraintlayout.core.SolverVariable r4) {
        /*
            r3 = this;
            int r0 = r3.f41510j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f41363c
            int r0 = r3.f41503c
            int r0 = r4 % r0
            int[] r2 = r3.f41504d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f41506f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f41505e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f41506f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f41506f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C16653i.mo48629e(androidx.constraintlayout.core.SolverVariable):int");
    }

    /* renamed from: f */
    public boolean mo48630f(SolverVariable solverVariable) {
        return mo48629e(solverVariable) != -1;
    }

    /* renamed from: g */
    public SolverVariable mo48631g(int i) {
        int i2 = this.f41510j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f41511k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f41513m.f41406d[this.f41506f[i3]];
            }
            i3 = this.f41509i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: h */
    public void mo48632h(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f41500p;
        if (f <= (-f2) || f >= f2) {
            int e = mo48629e(solverVariable);
            if (e == -1) {
                mo48638n(solverVariable, f);
                return;
            }
            float[] fArr = this.f41507g;
            float f3 = fArr[e] + f;
            fArr[e] = f3;
            float f4 = f41500p;
            if (f3 > (-f4) && f3 < f4) {
                fArr[e] = 0.0f;
                mo48634j(solverVariable, z);
            }
        }
    }

    /* renamed from: i */
    public void mo48633i() {
        int i = this.f41510j;
        int i2 = this.f41511k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f41507g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f41509i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public float mo48634j(SolverVariable solverVariable, boolean z) {
        int e = mo48629e(solverVariable);
        if (e == -1) {
            return 0.0f;
        }
        mo48757u(solverVariable);
        float f = this.f41507g[e];
        if (this.f41511k == e) {
            this.f41511k = this.f41509i[e];
        }
        this.f41506f[e] = -1;
        int[] iArr = this.f41508h;
        int i = iArr[e];
        if (i != -1) {
            int[] iArr2 = this.f41509i;
            iArr2[i] = iArr2[e];
        }
        int i2 = this.f41509i[e];
        if (i2 != -1) {
            iArr[i2] = iArr[e];
        }
        this.f41510j--;
        solverVariable.f41358X--;
        if (z) {
            solverVariable.mo48623z(this.f41512l);
        }
        return f;
    }

    /* renamed from: k */
    public int mo48635k() {
        return 0;
    }

    /* renamed from: l */
    public void mo48636l() {
        int i = this.f41510j;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable g = mo48631g(i2);
            if (g != null) {
                PrintStream printStream = System.out;
                printStream.print(g + " = " + mo48639o(i2) + " ");
            }
        }
        System.out.println(" }");
    }

    /* renamed from: m */
    public float mo48637m(C16639b bVar, boolean z) {
        float p = mo48640p(bVar.f41397a);
        mo48634j(bVar.f41397a, z);
        C16653i iVar = (C16653i) bVar.f41401e;
        int d = iVar.mo48628d();
        int i = 0;
        int i2 = 0;
        while (i < d) {
            int i3 = iVar.f41506f[i2];
            if (i3 != -1) {
                mo48632h(this.f41513m.f41406d[i3], iVar.f41507g[i2] * p, z);
                i++;
            }
            i2++;
        }
        return p;
    }

    /* renamed from: n */
    public void mo48638n(SolverVariable solverVariable, float f) {
        float f2 = f41500p;
        if (f <= (-f2) || f >= f2) {
            if (this.f41510j == 0) {
                mo48751b(0, solverVariable, f);
                mo48750a(solverVariable, 0);
                this.f41511k = 0;
                return;
            }
            int e = mo48629e(solverVariable);
            if (e != -1) {
                this.f41507g[e] = f;
                return;
            }
            if (this.f41510j + 1 >= this.f41502b) {
                mo48754s();
            }
            int i = this.f41510j;
            int i2 = this.f41511k;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.f41506f[i2];
                int i6 = solverVariable.f41363c;
                if (i5 == i6) {
                    this.f41507g[i2] = f;
                    return;
                }
                if (i5 < i6) {
                    i3 = i2;
                }
                i2 = this.f41509i[i2];
                if (i2 == -1) {
                    break;
                }
            }
            mo48755t(i3, solverVariable, f);
            return;
        }
        mo48634j(solverVariable, true);
    }

    /* renamed from: o */
    public float mo48639o(int i) {
        int i2 = this.f41510j;
        int i3 = this.f41511k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f41507g[i3];
            }
            i3 = this.f41509i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: p */
    public float mo48640p(SolverVariable solverVariable) {
        int e = mo48629e(solverVariable);
        if (e != -1) {
            return this.f41507g[e];
        }
        return 0.0f;
    }

    /* renamed from: q */
    public void mo48641q(float f) {
        int i = this.f41510j;
        int i2 = this.f41511k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f41507g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f41509i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public final int mo48753r() {
        for (int i = 0; i < this.f41502b; i++) {
            if (this.f41506f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: s */
    public final void mo48754s() {
        int i = this.f41502b * 2;
        this.f41506f = Arrays.copyOf(this.f41506f, i);
        this.f41507g = Arrays.copyOf(this.f41507g, i);
        this.f41508h = Arrays.copyOf(this.f41508h, i);
        this.f41509i = Arrays.copyOf(this.f41509i, i);
        this.f41505e = Arrays.copyOf(this.f41505e, i);
        for (int i2 = this.f41502b; i2 < i; i2++) {
            this.f41506f[i2] = -1;
            this.f41505e[i2] = -1;
        }
        this.f41502b = i;
    }

    /* renamed from: t */
    public final void mo48755t(int i, SolverVariable solverVariable, float f) {
        int r = mo48753r();
        mo48751b(r, solverVariable, f);
        if (i != -1) {
            this.f41508h[r] = i;
            int[] iArr = this.f41509i;
            iArr[r] = iArr[i];
            iArr[i] = r;
        } else {
            this.f41508h[r] = -1;
            if (this.f41510j > 0) {
                this.f41509i[r] = this.f41511k;
                this.f41511k = r;
            } else {
                this.f41509i[r] = -1;
            }
        }
        int i2 = this.f41509i[r];
        if (i2 != -1) {
            this.f41508h[i2] = r;
        }
        mo48750a(solverVariable, r);
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f41510j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable g = mo48631g(i2);
            if (g != null) {
                String str4 = str3 + g + " = " + mo48639o(i2) + " ";
                int e = mo48629e(g);
                String str5 = str4 + "[p: ";
                if (this.f41508h[e] != -1) {
                    str = str5 + this.f41513m.f41406d[this.f41506f[this.f41508h[e]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f41509i[e] != -1) {
                    str2 = str6 + this.f41513m.f41406d[this.f41506f[this.f41509i[e]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48757u(androidx.constraintlayout.core.SolverVariable r6) {
        /*
            r5 = this;
            int r6 = r6.f41363c
            int r0 = r5.f41503c
            int r0 = r6 % r0
            int[] r1 = r5.f41504d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f41506f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f41505e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f41505e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f41506f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f41506f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C16653i.mo48757u(androidx.constraintlayout.core.SolverVariable):void");
    }
}
