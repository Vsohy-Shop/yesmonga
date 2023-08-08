package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C16639b;
import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.a */
public class C16638a implements C16639b.C16640a {

    /* renamed from: l */
    public static final boolean f41380l = false;

    /* renamed from: m */
    public static final int f41381m = -1;

    /* renamed from: n */
    public static final boolean f41382n = false;

    /* renamed from: o */
    public static float f41383o = 0.001f;

    /* renamed from: a */
    public int f41384a = 0;

    /* renamed from: b */
    public final C16639b f41385b;

    /* renamed from: c */
    public final C16641c f41386c;

    /* renamed from: d */
    public int f41387d = 8;

    /* renamed from: e */
    public SolverVariable f41388e = null;

    /* renamed from: f */
    public int[] f41389f = new int[8];

    /* renamed from: g */
    public int[] f41390g = new int[8];

    /* renamed from: h */
    public float[] f41391h = new float[8];

    /* renamed from: i */
    public int f41392i = -1;

    /* renamed from: j */
    public int f41393j = -1;

    /* renamed from: k */
    public boolean f41394k = false;

    public C16638a(C16639b bVar, C16641c cVar) {
        this.f41385b = bVar;
        this.f41386c = cVar;
    }

    /* renamed from: a */
    public int mo48624a() {
        return this.f41392i;
    }

    /* renamed from: b */
    public final int mo48625b(int i) {
        return this.f41389f[i];
    }

    /* renamed from: c */
    public final int mo48626c(int i) {
        return this.f41390g[i];
    }

    public final void clear() {
        int i = this.f41392i;
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            SolverVariable solverVariable = this.f41386c.f41406d[this.f41389f[i]];
            if (solverVariable != null) {
                solverVariable.mo48623z(this.f41385b);
            }
            i = this.f41390g[i];
            i2++;
        }
        this.f41392i = -1;
        this.f41393j = -1;
        this.f41394k = false;
        this.f41384a = 0;
    }

    /* renamed from: d */
    public int mo48628d() {
        return this.f41384a;
    }

    /* renamed from: e */
    public int mo48629e(SolverVariable solverVariable) {
        int i = this.f41392i;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            if (this.f41389f[i] == solverVariable.f41363c) {
                return i;
            }
            i = this.f41390g[i];
            i2++;
        }
        return -1;
    }

    /* renamed from: f */
    public boolean mo48630f(SolverVariable solverVariable) {
        int i = this.f41392i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            if (this.f41389f[i] == solverVariable.f41363c) {
                return true;
            }
            i = this.f41390g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: g */
    public SolverVariable mo48631g(int i) {
        int i2 = this.f41392i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f41384a) {
            if (i3 == i) {
                return this.f41386c.f41406d[this.f41389f[i2]];
            }
            i2 = this.f41390g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: h */
    public void mo48632h(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f41383o;
        if (f <= (-f2) || f >= f2) {
            int i = this.f41392i;
            if (i == -1) {
                this.f41392i = 0;
                this.f41391h[0] = f;
                this.f41389f[0] = solverVariable.f41363c;
                this.f41390g[0] = -1;
                solverVariable.f41358X++;
                solverVariable.mo48615b(this.f41385b);
                this.f41384a++;
                if (!this.f41394k) {
                    int i2 = this.f41393j + 1;
                    this.f41393j = i2;
                    int[] iArr = this.f41389f;
                    if (i2 >= iArr.length) {
                        this.f41394k = true;
                        this.f41393j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f41384a) {
                int i5 = this.f41389f[i];
                int i6 = solverVariable.f41363c;
                if (i5 == i6) {
                    float[] fArr = this.f41391h;
                    float f3 = fArr[i] + f;
                    float f4 = f41383o;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f41392i) {
                            this.f41392i = this.f41390g[i];
                        } else {
                            int[] iArr2 = this.f41390g;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.mo48623z(this.f41385b);
                        }
                        if (this.f41394k) {
                            this.f41393j = i;
                        }
                        solverVariable.f41358X--;
                        this.f41384a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f41390g[i];
                i3++;
            }
            int i7 = this.f41393j;
            int i8 = i7 + 1;
            if (this.f41394k) {
                int[] iArr3 = this.f41389f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f41389f;
            if (i7 >= iArr4.length && this.f41384a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f41389f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f41389f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f41387d * 2;
                this.f41387d = i10;
                this.f41394k = false;
                this.f41393j = i7 - 1;
                this.f41391h = Arrays.copyOf(this.f41391h, i10);
                this.f41389f = Arrays.copyOf(this.f41389f, this.f41387d);
                this.f41390g = Arrays.copyOf(this.f41390g, this.f41387d);
            }
            this.f41389f[i7] = solverVariable.f41363c;
            this.f41391h[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f41390g;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f41390g[i7] = this.f41392i;
                this.f41392i = i7;
            }
            solverVariable.f41358X++;
            solverVariable.mo48615b(this.f41385b);
            this.f41384a++;
            if (!this.f41394k) {
                this.f41393j++;
            }
            int i11 = this.f41393j;
            int[] iArr8 = this.f41389f;
            if (i11 >= iArr8.length) {
                this.f41394k = true;
                this.f41393j = iArr8.length - 1;
            }
        }
    }

    /* renamed from: i */
    public void mo48633i() {
        int i = this.f41392i;
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            float[] fArr = this.f41391h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f41390g[i];
            i2++;
        }
    }

    /* renamed from: j */
    public final float mo48634j(SolverVariable solverVariable, boolean z) {
        if (this.f41388e == solverVariable) {
            this.f41388e = null;
        }
        int i = this.f41392i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f41384a) {
            if (this.f41389f[i] == solverVariable.f41363c) {
                if (i == this.f41392i) {
                    this.f41392i = this.f41390g[i];
                } else {
                    int[] iArr = this.f41390g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.mo48623z(this.f41385b);
                }
                solverVariable.f41358X--;
                this.f41384a--;
                this.f41389f[i] = -1;
                if (this.f41394k) {
                    this.f41393j = i;
                }
                return this.f41391h[i];
            }
            i2++;
            i3 = i;
            i = this.f41390g[i];
        }
        return 0.0f;
    }

    /* renamed from: k */
    public int mo48635k() {
        return (this.f41389f.length * 4 * 3) + 0 + 36;
    }

    /* renamed from: l */
    public void mo48636l() {
        int i = this.f41384a;
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
        C16639b.C16640a aVar = bVar.f41401e;
        int d = aVar.mo48628d();
        for (int i = 0; i < d; i++) {
            SolverVariable g = aVar.mo48631g(i);
            mo48632h(g, aVar.mo48640p(g) * p, z);
        }
        return p;
    }

    /* renamed from: n */
    public final void mo48638n(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            mo48634j(solverVariable, true);
            return;
        }
        int i = this.f41392i;
        if (i == -1) {
            this.f41392i = 0;
            this.f41391h[0] = f;
            this.f41389f[0] = solverVariable.f41363c;
            this.f41390g[0] = -1;
            solverVariable.f41358X++;
            solverVariable.mo48615b(this.f41385b);
            this.f41384a++;
            if (!this.f41394k) {
                int i2 = this.f41393j + 1;
                this.f41393j = i2;
                int[] iArr = this.f41389f;
                if (i2 >= iArr.length) {
                    this.f41394k = true;
                    this.f41393j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f41384a) {
            int i5 = this.f41389f[i];
            int i6 = solverVariable.f41363c;
            if (i5 == i6) {
                this.f41391h[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f41390g[i];
            i3++;
        }
        int i7 = this.f41393j;
        int i8 = i7 + 1;
        if (this.f41394k) {
            int[] iArr2 = this.f41389f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f41389f;
        if (i7 >= iArr3.length && this.f41384a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f41389f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f41389f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f41387d * 2;
            this.f41387d = i10;
            this.f41394k = false;
            this.f41393j = i7 - 1;
            this.f41391h = Arrays.copyOf(this.f41391h, i10);
            this.f41389f = Arrays.copyOf(this.f41389f, this.f41387d);
            this.f41390g = Arrays.copyOf(this.f41390g, this.f41387d);
        }
        this.f41389f[i7] = solverVariable.f41363c;
        this.f41391h[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f41390g;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f41390g[i7] = this.f41392i;
            this.f41392i = i7;
        }
        solverVariable.f41358X++;
        solverVariable.mo48615b(this.f41385b);
        int i11 = this.f41384a + 1;
        this.f41384a = i11;
        if (!this.f41394k) {
            this.f41393j++;
        }
        int[] iArr7 = this.f41389f;
        if (i11 >= iArr7.length) {
            this.f41394k = true;
        }
        if (this.f41393j >= iArr7.length) {
            this.f41394k = true;
            this.f41393j = iArr7.length - 1;
        }
    }

    /* renamed from: o */
    public float mo48639o(int i) {
        int i2 = this.f41392i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f41384a) {
            if (i3 == i) {
                return this.f41391h[i2];
            }
            i2 = this.f41390g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: p */
    public final float mo48640p(SolverVariable solverVariable) {
        int i = this.f41392i;
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            if (this.f41389f[i] == solverVariable.f41363c) {
                return this.f41391h[i];
            }
            i = this.f41390g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: q */
    public void mo48641q(float f) {
        int i = this.f41392i;
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            float[] fArr = this.f41391h;
            fArr[i] = fArr[i] / f;
            i = this.f41390g[i];
            i2++;
        }
    }

    /* renamed from: r */
    public SolverVariable mo48642r() {
        SolverVariable solverVariable = this.f41388e;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i = this.f41392i;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        while (i != -1 && i2 < this.f41384a) {
            if (this.f41391h[i] < 0.0f) {
                SolverVariable solverVariable3 = this.f41386c.f41406d[this.f41389f[i]];
                if (solverVariable2 == null || solverVariable2.f41365e < solverVariable3.f41365e) {
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.f41390g[i];
            i2++;
        }
        return solverVariable2;
    }

    /* renamed from: s */
    public final float mo48643s(int i) {
        return this.f41391h[i];
    }

    /* renamed from: t */
    public boolean mo48644t() {
        int i = this.f41392i;
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            if (this.f41391h[i] > 0.0f) {
                return true;
            }
            i = this.f41390g[i];
            i2++;
        }
        return false;
    }

    public String toString() {
        int i = this.f41392i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f41384a) {
            str = ((str + " -> ") + this.f41391h[i] + " : ") + this.f41386c.f41406d[this.f41389f[i]];
            i = this.f41390g[i];
            i2++;
        }
        return str;
    }
}
