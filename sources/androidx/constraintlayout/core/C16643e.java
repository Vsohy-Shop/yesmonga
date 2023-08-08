package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.carrefour.fid.android.core.extension.C36306e;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.e */
public class C16643e {

    /* renamed from: A */
    public static boolean f41407A = false;

    /* renamed from: B */
    public static int f41408B = 1000;

    /* renamed from: C */
    public static C16646f f41409C = null;

    /* renamed from: D */
    public static long f41410D = 0;

    /* renamed from: E */
    public static long f41411E = 0;

    /* renamed from: r */
    public static final boolean f41412r = false;

    /* renamed from: s */
    public static final boolean f41413s = false;

    /* renamed from: t */
    public static final boolean f41414t = false;

    /* renamed from: u */
    public static final boolean f41415u = false;

    /* renamed from: v */
    public static boolean f41416v = false;

    /* renamed from: w */
    public static boolean f41417w = true;

    /* renamed from: x */
    public static boolean f41418x = true;

    /* renamed from: y */
    public static boolean f41419y = true;

    /* renamed from: z */
    public static boolean f41420z = true;

    /* renamed from: a */
    public boolean f41421a;

    /* renamed from: b */
    public int f41422b;

    /* renamed from: c */
    public HashMap<String, SolverVariable> f41423c;

    /* renamed from: d */
    public C16644a f41424d;

    /* renamed from: e */
    public int f41425e;

    /* renamed from: f */
    public int f41426f;

    /* renamed from: g */
    public C16639b[] f41427g;

    /* renamed from: h */
    public boolean f41428h;

    /* renamed from: i */
    public boolean f41429i;

    /* renamed from: j */
    public boolean[] f41430j;

    /* renamed from: k */
    public int f41431k;

    /* renamed from: l */
    public int f41432l;

    /* renamed from: m */
    public int f41433m;

    /* renamed from: n */
    public final C16641c f41434n;

    /* renamed from: o */
    public SolverVariable[] f41435o;

    /* renamed from: p */
    public int f41436p;

    /* renamed from: q */
    public C16644a f41437q;

    /* renamed from: androidx.constraintlayout.core.e$a */
    public interface C16644a {
        /* renamed from: a */
        void mo48653a(C16643e eVar, SolverVariable solverVariable, boolean z);

        /* renamed from: b */
        void mo48654b(C16643e eVar);

        /* renamed from: c */
        void mo48655c(C16643e eVar, C16639b bVar, boolean z);

        void clear();

        /* renamed from: d */
        void mo48657d(C16644a aVar);

        /* renamed from: e */
        SolverVariable mo48658e(C16643e eVar, boolean[] zArr);

        /* renamed from: f */
        void mo48659f(SolverVariable solverVariable);

        SolverVariable getKey();

        boolean isEmpty();
    }

    /* renamed from: androidx.constraintlayout.core.e$b */
    public class C16645b extends C16639b {
        public C16645b(C16641c cVar) {
            this.f41401e = new C16653i(this, cVar);
        }
    }

    public C16643e() {
        this.f41421a = false;
        this.f41422b = 0;
        this.f41423c = null;
        this.f41425e = 32;
        this.f41426f = 32;
        this.f41427g = null;
        this.f41428h = false;
        this.f41429i = false;
        this.f41430j = new boolean[32];
        this.f41431k = 1;
        this.f41432l = 0;
        this.f41433m = 32;
        this.f41435o = new SolverVariable[f41408B];
        this.f41436p = 0;
        this.f41427g = new C16639b[32];
        mo48704W();
        C16641c cVar = new C16641c();
        this.f41434n = cVar;
        this.f41424d = new C16650h(cVar);
        if (f41407A) {
            this.f41437q = new C16645b(cVar);
        } else {
            this.f41437q = new C16639b(cVar);
        }
    }

    /* renamed from: L */
    public static C16646f m75761L() {
        return f41409C;
    }

    /* renamed from: w */
    public static C16639b m75762w(C16643e eVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return eVar.mo48728v().mo48668m(solverVariable, solverVariable2, f);
    }

    /* renamed from: A */
    public final void mo48683A() {
        mo48684B();
        String str = "";
        for (int i = 0; i < this.f41432l; i++) {
            str = (str + this.f41427g[i]) + "\n";
        }
        System.out.println(str + this.f41424d + "\n");
    }

    /* renamed from: B */
    public final void mo48684B() {
        System.out.println("Display Rows (" + this.f41432l + "x" + this.f41431k + ")\n");
    }

    /* renamed from: C */
    public void mo48685C() {
        int i = 0;
        for (int i2 = 0; i2 < this.f41425e; i2++) {
            C16639b bVar = this.f41427g[i2];
            if (bVar != null) {
                i += bVar.mo48650E();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f41432l; i4++) {
            C16639b bVar2 = this.f41427g[i4];
            if (bVar2 != null) {
                i3 += bVar2.mo48650E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f41425e);
        sb.append(C36306e.f89637a);
        int i5 = this.f41425e;
        sb.append(mo48690H(i5 * i5));
        sb.append(") -- row sizes: ");
        sb.append(mo48690H(i));
        sb.append(", actual size: ");
        sb.append(mo48690H(i3));
        sb.append(" rows: ");
        sb.append(this.f41432l);
        sb.append("/");
        sb.append(this.f41433m);
        sb.append(" cols: ");
        sb.append(this.f41431k);
        sb.append("/");
        sb.append(this.f41426f);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(mo48690H(0));
        printStream.println(sb.toString());
    }

    /* renamed from: D */
    public void mo48686D() {
        mo48684B();
        String str = "";
        for (int i = 0; i < this.f41432l; i++) {
            if (this.f41427g[i].f41397a.f41370x == SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.f41427g[i].mo48651F()) + "\n";
            }
        }
        System.out.println(str + this.f41424d + "\n");
    }

    /* renamed from: E */
    public final int mo48687E(C16644a aVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f41432l) {
                z = false;
                break;
            }
            C16639b bVar = this.f41427g[i];
            if (bVar.f41397a.f41370x != SolverVariable.Type.UNRESTRICTED && bVar.f41398b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C16646f fVar = f41409C;
            if (fVar != null) {
                fVar.f41470o++;
            }
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f41432l; i6++) {
                C16639b bVar2 = this.f41427g[i6];
                if (bVar2.f41397a.f41370x != SolverVariable.Type.UNRESTRICTED && !bVar2.f41402f && bVar2.f41398b < 0.0f) {
                    int i7 = 9;
                    if (f41420z) {
                        int d = bVar2.f41401e.mo48628d();
                        int i8 = 0;
                        while (i8 < d) {
                            SolverVariable g = bVar2.f41401e.mo48631g(i8);
                            float p = bVar2.f41401e.mo48640p(g);
                            if (p > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f2 = g.f41368v[i9] / p;
                                    if ((f2 < f && i9 == i5) || i9 > i5) {
                                        i4 = g.f41363c;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f2;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f41431k; i10++) {
                            SolverVariable solverVariable = this.f41434n.f41406d[i10];
                            float p2 = bVar2.f41401e.mo48640p(solverVariable);
                            if (p2 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f3 = solverVariable.f41368v[i11] / p2;
                                    if ((f3 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i5 = i11;
                                        i3 = i6;
                                        f = f3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C16639b bVar3 = this.f41427g[i3];
                bVar3.f41397a.f41364d = -1;
                C16646f fVar2 = f41409C;
                if (fVar2 != null) {
                    fVar2.f41469n++;
                }
                bVar3.mo48648C(this.f41434n.f41406d[i4]);
                SolverVariable solverVariable2 = bVar3.f41397a;
                solverVariable2.f41364d = i3;
                solverVariable2.mo48618f0(this, bVar3);
            } else {
                z2 = true;
            }
            if (i2 > this.f41431k / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: F */
    public void mo48688F(C16646f fVar) {
        f41409C = fVar;
    }

    /* renamed from: G */
    public C16641c mo48689G() {
        return this.f41434n;
    }

    /* renamed from: H */
    public final String mo48690H(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        } else if (i3 > 0) {
            return "" + i3 + " Kb";
        } else {
            return "" + i2 + " bytes";
        }
    }

    /* renamed from: I */
    public final String mo48691I(int i) {
        return i == 1 ? "LOW" : i == 2 ? "MEDIUM" : i == 3 ? "HIGH" : i == 4 ? "HIGHEST" : i == 5 ? "EQUALITY" : i == 8 ? "FIXED" : i == 6 ? "BARRIER" : "NONE";
    }

    /* renamed from: J */
    public C16644a mo48692J() {
        return this.f41424d;
    }

    /* renamed from: K */
    public int mo48693K() {
        int i = 0;
        for (int i2 = 0; i2 < this.f41432l; i2++) {
            C16639b bVar = this.f41427g[i2];
            if (bVar != null) {
                i += bVar.mo48650E();
            }
        }
        return i;
    }

    /* renamed from: M */
    public int mo48694M() {
        return this.f41432l;
    }

    /* renamed from: N */
    public int mo48695N() {
        return this.f41422b;
    }

    /* renamed from: O */
    public int mo48696O(Object obj) {
        SolverVariable j = ((ConstraintAnchor) obj).mo49429j();
        if (j != null) {
            return (int) (j.f41366f + 0.5f);
        }
        return 0;
    }

    /* renamed from: P */
    public C16639b mo48697P(int i) {
        return this.f41427g[i];
    }

    /* renamed from: Q */
    public float mo48698Q(String str) {
        SolverVariable R = mo48699R(str, SolverVariable.Type.UNRESTRICTED);
        if (R == null) {
            return 0.0f;
        }
        return R.f41366f;
    }

    /* renamed from: R */
    public SolverVariable mo48699R(String str, SolverVariable.Type type) {
        if (this.f41423c == null) {
            this.f41423c = new HashMap<>();
        }
        SolverVariable solverVariable = this.f41423c.get(str);
        if (solverVariable == null) {
            return mo48730y(str, type);
        }
        return solverVariable;
    }

    /* renamed from: S */
    public final void mo48700S() {
        int i = this.f41425e * 2;
        this.f41425e = i;
        this.f41427g = (C16639b[]) Arrays.copyOf(this.f41427g, i);
        C16641c cVar = this.f41434n;
        cVar.f41406d = (SolverVariable[]) Arrays.copyOf(cVar.f41406d, this.f41425e);
        int i2 = this.f41425e;
        this.f41430j = new boolean[i2];
        this.f41426f = i2;
        this.f41433m = i2;
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41463h++;
            fVar.f41475t = Math.max(fVar.f41475t, (long) i2);
            C16646f fVar2 = f41409C;
            fVar2.f41448J = fVar2.f41475t;
        }
    }

    /* renamed from: T */
    public void mo48701T() throws Exception {
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41464i++;
        }
        if (this.f41424d.isEmpty()) {
            mo48724r();
        } else if (this.f41428h || this.f41429i) {
            C16646f fVar2 = f41409C;
            if (fVar2 != null) {
                fVar2.f41477v++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f41432l) {
                    z = true;
                    break;
                } else if (!this.f41427g[i].f41402f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo48702U(this.f41424d);
                return;
            }
            C16646f fVar3 = f41409C;
            if (fVar3 != null) {
                fVar3.f41476u++;
            }
            mo48724r();
        } else {
            mo48702U(this.f41424d);
        }
    }

    /* renamed from: U */
    public void mo48702U(C16644a aVar) throws Exception {
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41481z++;
            fVar.f41439A = Math.max(fVar.f41439A, (long) this.f41431k);
            C16646f fVar2 = f41409C;
            fVar2.f41440B = Math.max(fVar2.f41440B, (long) this.f41432l);
        }
        mo48687E(aVar);
        mo48703V(aVar, false);
        mo48724r();
    }

    /* renamed from: V */
    public final int mo48703V(C16644a aVar, boolean z) {
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41467l++;
        }
        for (int i = 0; i < this.f41431k; i++) {
            this.f41430j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C16646f fVar2 = f41409C;
            if (fVar2 != null) {
                fVar2.f41468m++;
            }
            i2++;
            if (i2 >= this.f41431k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f41430j[aVar.getKey().f41363c] = true;
            }
            SolverVariable e = aVar.mo48658e(this, this.f41430j);
            if (e != null) {
                boolean[] zArr = this.f41430j;
                int i3 = e.f41363c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (e != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f41432l; i5++) {
                    C16639b bVar = this.f41427g[i5];
                    if (bVar.f41397a.f41370x != SolverVariable.Type.UNRESTRICTED && !bVar.f41402f && bVar.mo48681y(e)) {
                        float p = bVar.f41401e.mo48640p(e);
                        if (p < 0.0f) {
                            float f2 = (-bVar.f41398b) / p;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C16639b bVar2 = this.f41427g[i4];
                    bVar2.f41397a.f41364d = -1;
                    C16646f fVar3 = f41409C;
                    if (fVar3 != null) {
                        fVar3.f41469n++;
                    }
                    bVar2.mo48648C(e);
                    SolverVariable solverVariable = bVar2.f41397a;
                    solverVariable.f41364d = i4;
                    solverVariable.mo48618f0(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: W */
    public final void mo48704W() {
        int i = 0;
        if (f41407A) {
            while (i < this.f41432l) {
                C16639b bVar = this.f41427g[i];
                if (bVar != null) {
                    this.f41434n.f41403a.mo48734a(bVar);
                }
                this.f41427g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f41432l) {
            C16639b bVar2 = this.f41427g[i];
            if (bVar2 != null) {
                this.f41434n.f41404b.mo48734a(bVar2);
            }
            this.f41427g[i] = null;
            i++;
        }
    }

    /* renamed from: X */
    public void mo48705X(C16639b bVar) {
        SolverVariable solverVariable;
        int i;
        if (bVar.f41402f && (solverVariable = bVar.f41397a) != null) {
            int i2 = solverVariable.f41364d;
            if (i2 != -1) {
                while (true) {
                    i = this.f41432l;
                    if (i2 >= i - 1) {
                        break;
                    }
                    C16639b[] bVarArr = this.f41427g;
                    int i3 = i2 + 1;
                    C16639b bVar2 = bVarArr[i3];
                    SolverVariable solverVariable2 = bVar2.f41397a;
                    if (solverVariable2.f41364d == i3) {
                        solverVariable2.f41364d = i2;
                    }
                    bVarArr[i2] = bVar2;
                    i2 = i3;
                }
                this.f41432l = i - 1;
            }
            SolverVariable solverVariable3 = bVar.f41397a;
            if (!solverVariable3.f41367g) {
                solverVariable3.mo48611Q(this, bVar.f41398b);
            }
            if (f41407A) {
                this.f41434n.f41403a.mo48734a(bVar);
            } else {
                this.f41434n.f41404b.mo48734a(bVar);
            }
        }
    }

    /* renamed from: Y */
    public void mo48706Y() {
        C16641c cVar;
        int i = 0;
        while (true) {
            cVar = this.f41434n;
            SolverVariable[] solverVariableArr = cVar.f41406d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.mo48610M();
            }
            i++;
        }
        cVar.f41405c.mo48736c(this.f41435o, this.f41436p);
        this.f41436p = 0;
        Arrays.fill(this.f41434n.f41406d, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.f41423c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f41422b = 0;
        this.f41424d.clear();
        this.f41431k = 1;
        for (int i2 = 0; i2 < this.f41432l; i2++) {
            C16639b bVar = this.f41427g[i2];
            if (bVar != null) {
                bVar.f41399c = false;
            }
        }
        mo48704W();
        this.f41432l = 0;
        if (f41407A) {
            this.f41437q = new C16645b(this.f41434n);
        } else {
            this.f41437q = new C16639b(this.f41434n);
        }
    }

    /* renamed from: a */
    public final SolverVariable mo48707a(SolverVariable.Type type, String str) {
        SolverVariable b = this.f41434n.f41405c.mo48735b();
        if (b == null) {
            b = new SolverVariable(type, str);
            b.mo48614Z(type, str);
        } else {
            b.mo48610M();
            b.mo48614Z(type, str);
        }
        int i = this.f41436p;
        int i2 = f41408B;
        if (i >= i2) {
            int i3 = i2 * 2;
            f41408B = i3;
            this.f41435o = (SolverVariable[]) Arrays.copyOf(this.f41435o, i3);
        }
        SolverVariable[] solverVariableArr = this.f41435o;
        int i4 = this.f41436p;
        this.f41436p = i4 + 1;
        solverVariableArr[i4] = b;
        return b;
    }

    /* renamed from: b */
    public void mo48708b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable u = mo48727u(constraintWidget3.mo49583r(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f42635c;
        SolverVariable u2 = mo48727u(constraintWidget3.mo49583r(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable u3 = mo48727u(constraintWidget3.mo49583r(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable u4 = mo48727u(constraintWidget3.mo49583r(type4));
        SolverVariable u5 = mo48727u(constraintWidget4.mo49583r(type));
        SolverVariable u6 = mo48727u(constraintWidget4.mo49583r(type2));
        SolverVariable u7 = mo48727u(constraintWidget4.mo49583r(type3));
        SolverVariable u8 = mo48727u(constraintWidget4.mo49583r(type4));
        C16639b v = mo48728v();
        double d = (double) f;
        SolverVariable solverVariable = u7;
        double d2 = (double) i;
        v.mo48678v(u2, u4, u6, u8, (float) (Math.sin(d) * d2));
        mo48710d(v);
        C16639b v2 = mo48728v();
        v2.mo48678v(u, u3, u5, solverVariable, (float) (Math.cos(d) * d2));
        mo48710d(v2);
    }

    /* renamed from: c */
    public void mo48709c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        int i4 = i3;
        C16639b v = mo48728v();
        v.mo48666k(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i4 != 8) {
            v.mo48660g(this, i4);
        }
        mo48710d(v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48710d(androidx.constraintlayout.core.C16639b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            androidx.constraintlayout.core.f r0 = f41409C
            r1 = 1
            if (r0 == 0) goto L_0x0017
            long r3 = r0.f41465j
            long r3 = r3 + r1
            r0.f41465j = r3
            boolean r3 = r8.f41402f
            if (r3 == 0) goto L_0x0017
            long r3 = r0.f41466k
            long r3 = r3 + r1
            r0.f41466k = r3
        L_0x0017:
            int r0 = r7.f41432l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f41433m
            if (r0 >= r4) goto L_0x0026
            int r0 = r7.f41431k
            int r0 = r0 + r3
            int r4 = r7.f41426f
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r7.mo48700S()
        L_0x0029:
            boolean r0 = r8.f41402f
            r4 = 0
            if (r0 != 0) goto L_0x00a1
            r8.mo48654b(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0038
            return
        L_0x0038:
            r8.mo48679w()
            boolean r0 = r8.mo48663i(r7)
            if (r0 == 0) goto L_0x0098
            androidx.constraintlayout.core.SolverVariable r0 = r7.mo48726t()
            r8.f41397a = r0
            int r5 = r7.f41432l
            r7.mo48719m(r8)
            int r6 = r7.f41432l
            int r5 = r5 + r3
            if (r6 != r5) goto L_0x0098
            androidx.constraintlayout.core.e$a r4 = r7.f41437q
            r4.mo48657d(r8)
            androidx.constraintlayout.core.e$a r4 = r7.f41437q
            r7.mo48703V(r4, r3)
            int r4 = r0.f41364d
            r5 = -1
            if (r4 != r5) goto L_0x0099
            androidx.constraintlayout.core.SolverVariable r4 = r8.f41397a
            if (r4 != r0) goto L_0x0076
            androidx.constraintlayout.core.SolverVariable r0 = r8.mo48646A(r0)
            if (r0 == 0) goto L_0x0076
            androidx.constraintlayout.core.f r4 = f41409C
            if (r4 == 0) goto L_0x0073
            long r5 = r4.f41469n
            long r5 = r5 + r1
            r4.f41469n = r5
        L_0x0073:
            r8.mo48648C(r0)
        L_0x0076:
            boolean r0 = r8.f41402f
            if (r0 != 0) goto L_0x007f
            androidx.constraintlayout.core.SolverVariable r0 = r8.f41397a
            r0.mo48618f0(r7, r8)
        L_0x007f:
            boolean r0 = f41407A
            if (r0 == 0) goto L_0x008b
            androidx.constraintlayout.core.c r0 = r7.f41434n
            androidx.constraintlayout.core.g$a<androidx.constraintlayout.core.b> r0 = r0.f41403a
            r0.mo48734a(r8)
            goto L_0x0092
        L_0x008b:
            androidx.constraintlayout.core.c r0 = r7.f41434n
            androidx.constraintlayout.core.g$a<androidx.constraintlayout.core.b> r0 = r0.f41404b
            r0.mo48734a(r8)
        L_0x0092:
            int r0 = r7.f41432l
            int r0 = r0 - r3
            r7.f41432l = r0
            goto L_0x0099
        L_0x0098:
            r3 = r4
        L_0x0099:
            boolean r0 = r8.mo48680x()
            if (r0 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r4 = r3
        L_0x00a1:
            if (r4 != 0) goto L_0x00a6
            r7.mo48719m(r8)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C16643e.mo48710d(androidx.constraintlayout.core.b):void");
    }

    /* renamed from: e */
    public C16639b mo48711e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (!f41417w || i2 != 8 || !solverVariable2.f41367g || solverVariable.f41364d != -1) {
            C16639b v = mo48728v();
            v.mo48673r(solverVariable, solverVariable2, i);
            if (i2 != 8) {
                v.mo48660g(this, i2);
            }
            mo48710d(v);
            return v;
        }
        solverVariable.mo48611Q(this, solverVariable2.f41366f + ((float) i));
        return null;
    }

    /* renamed from: f */
    public void mo48712f(SolverVariable solverVariable, int i) {
        if (!f41417w || solverVariable.f41364d != -1) {
            int i2 = solverVariable.f41364d;
            if (i2 != -1) {
                C16639b bVar = this.f41427g[i2];
                if (bVar.f41402f) {
                    bVar.f41398b = (float) i;
                } else if (bVar.f41401e.mo48628d() == 0) {
                    bVar.f41402f = true;
                    bVar.f41398b = (float) i;
                } else {
                    C16639b v = mo48728v();
                    v.mo48672q(solverVariable, i);
                    mo48710d(v);
                }
            } else {
                C16639b v2 = mo48728v();
                v2.mo48667l(solverVariable, i);
                mo48710d(v2);
            }
        } else {
            float f = (float) i;
            solverVariable.mo48611Q(this, f);
            for (int i3 = 0; i3 < this.f41422b + 1; i3++) {
                SolverVariable solverVariable2 = this.f41434n.f41406d[i3];
                if (solverVariable2 != null && solverVariable2.f41359Y && solverVariable2.f41360Z == solverVariable.f41363c) {
                    solverVariable2.mo48611Q(this, solverVariable2.f41356E0 + f);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo48713g(C16639b bVar) {
        bVar.mo48660g(this, 0);
    }

    /* renamed from: h */
    public void mo48714h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        C16639b v = mo48728v();
        SolverVariable x = mo48729x();
        x.f41365e = 0;
        v.mo48675t(solverVariable, solverVariable2, x, i);
        mo48710d(v);
    }

    /* renamed from: i */
    public void mo48715i(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C16639b v = mo48728v();
        SolverVariable x = mo48729x();
        x.f41365e = 0;
        v.mo48675t(solverVariable, solverVariable2, x, i);
        if (i2 != 8) {
            mo48721o(v, (int) (v.f41401e.mo48640p(x) * -1.0f), i2);
        }
        mo48710d(v);
    }

    /* renamed from: j */
    public void mo48716j(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        C16639b v = mo48728v();
        SolverVariable x = mo48729x();
        x.f41365e = 0;
        v.mo48677u(solverVariable, solverVariable2, x, i);
        mo48710d(v);
    }

    /* renamed from: k */
    public void mo48717k(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C16639b v = mo48728v();
        SolverVariable x = mo48729x();
        x.f41365e = 0;
        v.mo48677u(solverVariable, solverVariable2, x, i);
        if (i2 != 8) {
            mo48721o(v, (int) (v.f41401e.mo48640p(x) * -1.0f), i2);
        }
        mo48710d(v);
    }

    /* renamed from: l */
    public void mo48718l(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C16639b v = mo48728v();
        v.mo48669n(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            v.mo48660g(this, i);
        }
        mo48710d(v);
    }

    /* renamed from: m */
    public final void mo48719m(C16639b bVar) {
        int i;
        if (!f41418x || !bVar.f41402f) {
            C16639b[] bVarArr = this.f41427g;
            int i2 = this.f41432l;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.f41397a;
            solverVariable.f41364d = i2;
            this.f41432l = i2 + 1;
            solverVariable.mo48618f0(this, bVar);
        } else {
            bVar.f41397a.mo48611Q(this, bVar.f41398b);
        }
        if (f41418x && this.f41421a) {
            int i3 = 0;
            while (i3 < this.f41432l) {
                if (this.f41427g[i3] == null) {
                    System.out.println("WTF");
                }
                C16639b bVar2 = this.f41427g[i3];
                if (bVar2 != null && bVar2.f41402f) {
                    bVar2.f41397a.mo48611Q(this, bVar2.f41398b);
                    if (f41407A) {
                        this.f41434n.f41403a.mo48734a(bVar2);
                    } else {
                        this.f41434n.f41404b.mo48734a(bVar2);
                    }
                    this.f41427g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f41432l;
                        if (i4 >= i) {
                            break;
                        }
                        C16639b[] bVarArr2 = this.f41427g;
                        int i6 = i4 - 1;
                        C16639b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f41397a;
                        if (solverVariable2.f41364d == i4) {
                            solverVariable2.f41364d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f41427g[i5] = null;
                    }
                    this.f41432l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f41421a = false;
        }
    }

    /* renamed from: n */
    public final void mo48720n(C16639b bVar, int i) {
        mo48721o(bVar, i, 0);
    }

    /* renamed from: o */
    public void mo48721o(C16639b bVar, int i, int i2) {
        bVar.mo48662h(mo48725s(i2, (String) null), i);
    }

    /* renamed from: p */
    public void mo48722p(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        if (solverVariable.f41364d == -1 && i == 0) {
            if (solverVariable2.f41359Y) {
                solverVariable2 = this.f41434n.f41406d[solverVariable2.f41360Z];
            }
            if (solverVariable.f41359Y) {
                SolverVariable solverVariable3 = this.f41434n.f41406d[solverVariable.f41360Z];
            } else {
                solverVariable.mo48613X(this, solverVariable2, 0.0f);
            }
        } else {
            mo48711e(solverVariable, solverVariable2, i, 8);
        }
    }

    /* renamed from: q */
    public final void mo48723q() {
        int i;
        int i2 = 0;
        while (i2 < this.f41432l) {
            C16639b bVar = this.f41427g[i2];
            if (bVar.f41401e.mo48628d() == 0) {
                bVar.f41402f = true;
            }
            if (bVar.f41402f) {
                SolverVariable solverVariable = bVar.f41397a;
                solverVariable.f41366f = bVar.f41398b;
                solverVariable.mo48623z(bVar);
                int i3 = i2;
                while (true) {
                    i = this.f41432l;
                    if (i3 >= i - 1) {
                        break;
                    }
                    C16639b[] bVarArr = this.f41427g;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f41427g[i - 1] = null;
                this.f41432l = i - 1;
                i2--;
                if (f41407A) {
                    this.f41434n.f41403a.mo48734a(bVar);
                } else {
                    this.f41434n.f41404b.mo48734a(bVar);
                }
            }
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo48724r() {
        for (int i = 0; i < this.f41432l; i++) {
            C16639b bVar = this.f41427g[i];
            bVar.f41397a.f41366f = bVar.f41398b;
        }
    }

    /* renamed from: s */
    public SolverVariable mo48725s(int i, String str) {
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41472q++;
        }
        if (this.f41431k + 1 >= this.f41426f) {
            mo48700S();
        }
        SolverVariable a = mo48707a(SolverVariable.Type.ERROR, str);
        int i2 = this.f41422b + 1;
        this.f41422b = i2;
        this.f41431k++;
        a.f41363c = i2;
        a.f41365e = i;
        this.f41434n.f41406d[i2] = a;
        this.f41424d.mo48659f(a);
        return a;
    }

    /* renamed from: t */
    public SolverVariable mo48726t() {
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41474s++;
        }
        if (this.f41431k + 1 >= this.f41426f) {
            mo48700S();
        }
        SolverVariable a = mo48707a(SolverVariable.Type.SLACK, (String) null);
        int i = this.f41422b + 1;
        this.f41422b = i;
        this.f41431k++;
        a.f41363c = i;
        this.f41434n.f41406d[i] = a;
        return a;
    }

    /* renamed from: u */
    public SolverVariable mo48727u(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f41431k + 1 >= this.f41426f) {
            mo48700S();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.mo49429j();
            if (solverVariable == null) {
                constraintAnchor.mo49446z(this.f41434n);
                solverVariable = constraintAnchor.mo49429j();
            }
            int i = solverVariable.f41363c;
            if (i == -1 || i > this.f41422b || this.f41434n.f41406d[i] == null) {
                if (i != -1) {
                    solverVariable.mo48610M();
                }
                int i2 = this.f41422b + 1;
                this.f41422b = i2;
                this.f41431k++;
                solverVariable.f41363c = i2;
                solverVariable.f41370x = SolverVariable.Type.UNRESTRICTED;
                this.f41434n.f41406d[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* renamed from: v */
    public C16639b mo48728v() {
        C16639b bVar;
        if (f41407A) {
            bVar = this.f41434n.f41403a.mo48735b();
            if (bVar == null) {
                bVar = new C16645b(this.f41434n);
                f41411E++;
            } else {
                bVar.mo48649D();
            }
        } else {
            bVar = this.f41434n.f41404b.mo48735b();
            if (bVar == null) {
                bVar = new C16639b(this.f41434n);
                f41410D++;
            } else {
                bVar.mo48649D();
            }
        }
        SolverVariable.m75680y();
        return bVar;
    }

    /* renamed from: x */
    public SolverVariable mo48729x() {
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41473r++;
        }
        if (this.f41431k + 1 >= this.f41426f) {
            mo48700S();
        }
        SolverVariable a = mo48707a(SolverVariable.Type.SLACK, (String) null);
        int i = this.f41422b + 1;
        this.f41422b = i;
        this.f41431k++;
        a.f41363c = i;
        this.f41434n.f41406d[i] = a;
        return a;
    }

    /* renamed from: y */
    public final SolverVariable mo48730y(String str, SolverVariable.Type type) {
        C16646f fVar = f41409C;
        if (fVar != null) {
            fVar.f41471p++;
        }
        if (this.f41431k + 1 >= this.f41426f) {
            mo48700S();
        }
        SolverVariable a = mo48707a(type, (String) null);
        a.mo48612W(str);
        int i = this.f41422b + 1;
        this.f41422b = i;
        this.f41431k++;
        a.f41363c = i;
        if (this.f41423c == null) {
            this.f41423c = new HashMap<>();
        }
        this.f41423c.put(str, a);
        this.f41434n.f41406d[this.f41422b] = a;
        return a;
    }

    /* renamed from: z */
    public void mo48731z() {
        mo48684B();
        String str = " num vars " + this.f41422b + "\n";
        for (int i = 0; i < this.f41422b + 1; i++) {
            SolverVariable solverVariable = this.f41434n.f41406d[i];
            if (solverVariable != null && solverVariable.f41367g) {
                str = str + " $[" + i + "] => " + solverVariable + " = " + solverVariable.f41366f + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i2 = 0; i2 < this.f41422b + 1; i2++) {
            SolverVariable[] solverVariableArr = this.f41434n.f41406d;
            SolverVariable solverVariable2 = solverVariableArr[i2];
            if (solverVariable2 != null && solverVariable2.f41359Y) {
                str2 = str2 + " ~[" + i2 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.f41360Z] + " + " + solverVariable2.f41356E0 + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.f41432l; i3++) {
            str3 = (str3 + this.f41427g[i3].mo48651F()) + "\n #  ";
        }
        if (this.f41424d != null) {
            str3 = str3 + "Goal: " + this.f41424d + "\n";
        }
        System.out.println(str3);
    }
}
