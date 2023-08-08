package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C16639b;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.constraintlayout.core.h */
public class C16650h extends C16639b {

    /* renamed from: o */
    public static final float f41485o = 1.0E-4f;

    /* renamed from: p */
    public static final boolean f41486p = false;

    /* renamed from: q */
    public static final int f41487q = -1;

    /* renamed from: i */
    public int f41488i = 128;

    /* renamed from: j */
    public SolverVariable[] f41489j = new SolverVariable[128];

    /* renamed from: k */
    public SolverVariable[] f41490k = new SolverVariable[128];

    /* renamed from: l */
    public int f41491l = 0;

    /* renamed from: m */
    public C16652b f41492m = new C16652b(this);

    /* renamed from: n */
    public C16641c f41493n;

    /* renamed from: androidx.constraintlayout.core.h$a */
    public class C16651a implements Comparator<SolverVariable> {
        public C16651a() {
        }

        /* renamed from: a */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f41363c - solverVariable2.f41363c;
        }
    }

    /* renamed from: androidx.constraintlayout.core.h$b */
    public class C16652b {

        /* renamed from: a */
        public SolverVariable f41495a;

        /* renamed from: b */
        public C16650h f41496b;

        public C16652b(C16650h hVar) {
            this.f41496b = hVar;
        }

        /* renamed from: a */
        public void mo48742a(SolverVariable solverVariable) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f41495a.f41369w;
                float f = fArr[i] + solverVariable.f41369w[i];
                fArr[i] = f;
                if (Math.abs(f) < 1.0E-4f) {
                    this.f41495a.f41369w[i] = 0.0f;
                }
            }
        }

        /* renamed from: b */
        public boolean mo48743b(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (this.f41495a.f41361a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f41495a.f41369w;
                    float f2 = fArr[i] + (solverVariable.f41369w[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f41495a.f41369w[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C16650h.this.mo48739J(this.f41495a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = solverVariable.f41369w[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f41495a.f41369w[i2] = f4;
                } else {
                    this.f41495a.f41369w[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: c */
        public void mo48744c(SolverVariable solverVariable) {
            this.f41495a = solverVariable;
        }

        /* renamed from: d */
        public final boolean mo48745d() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f41495a.f41369w[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo48746e() {
            for (int i = 0; i < 9; i++) {
                if (this.f41495a.f41369w[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo48747f(SolverVariable solverVariable) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = solverVariable.f41369w[i];
                float f2 = this.f41495a.f41369w[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public void mo48748g() {
            Arrays.fill(this.f41495a.f41369w, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f41495a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f41495a.f41369w[i] + " ";
                }
            }
            return str + "] " + this.f41495a;
        }
    }

    public C16650h(C16641c cVar) {
        super(cVar);
        this.f41493n = cVar;
    }

    /* renamed from: I */
    public final void mo48738I(SolverVariable solverVariable) {
        int i;
        int i2 = this.f41491l + 1;
        SolverVariable[] solverVariableArr = this.f41489j;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f41489j = solverVariableArr2;
            this.f41490k = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f41489j;
        int i3 = this.f41491l;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f41491l = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f41363c > solverVariable.f41363c) {
            int i5 = 0;
            while (true) {
                i = this.f41491l;
                if (i5 >= i) {
                    break;
                }
                this.f41490k[i5] = this.f41489j[i5];
                i5++;
            }
            Arrays.sort(this.f41490k, 0, i, new C16651a());
            for (int i6 = 0; i6 < this.f41491l; i6++) {
                this.f41489j[i6] = this.f41490k[i6];
            }
        }
        solverVariable.f41361a = true;
        solverVariable.mo48615b(this);
    }

    /* renamed from: J */
    public final void mo48739J(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f41491l) {
            if (this.f41489j[i] == solverVariable) {
                while (true) {
                    int i2 = this.f41491l;
                    if (i < i2 - 1) {
                        SolverVariable[] solverVariableArr = this.f41489j;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.f41491l = i2 - 1;
                        solverVariable.f41361a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: c */
    public void mo48655c(C16643e eVar, C16639b bVar, boolean z) {
        SolverVariable solverVariable = bVar.f41397a;
        if (solverVariable != null) {
            C16639b.C16640a aVar = bVar.f41401e;
            int d = aVar.mo48628d();
            for (int i = 0; i < d; i++) {
                SolverVariable g = aVar.mo48631g(i);
                float o = aVar.mo48639o(i);
                this.f41492m.mo48744c(g);
                if (this.f41492m.mo48743b(solverVariable, o)) {
                    mo48738I(g);
                }
                this.f41398b += bVar.f41398b * o;
            }
            mo48739J(solverVariable);
        }
    }

    public void clear() {
        this.f41491l = 0;
        this.f41398b = 0.0f;
    }

    /* renamed from: e */
    public SolverVariable mo48658e(C16643e eVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f41491l; i2++) {
            SolverVariable solverVariable = this.f41489j[i2];
            if (!zArr[solverVariable.f41363c]) {
                this.f41492m.mo48744c(solverVariable);
                if (i == -1) {
                    if (!this.f41492m.mo48745d()) {
                    }
                } else if (!this.f41492m.mo48747f(this.f41489j[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f41489j[i];
    }

    /* renamed from: f */
    public void mo48659f(SolverVariable solverVariable) {
        this.f41492m.mo48744c(solverVariable);
        this.f41492m.mo48748g();
        solverVariable.f41369w[solverVariable.f41365e] = 1.0f;
        mo48738I(solverVariable);
    }

    public boolean isEmpty() {
        return this.f41491l == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f41398b + ") : ";
        for (int i = 0; i < this.f41491l; i++) {
            this.f41492m.mo48744c(this.f41489j[i]);
            str = str + this.f41492m + " ";
        }
        return str;
    }
}
