package androidx.constraintlayout.core;

import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.design.components.extension.C37106a;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.google.zxing.client.android.C34651e;
import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: G0 */
    public static final boolean f41339G0 = false;

    /* renamed from: H0 */
    public static final boolean f41340H0 = false;

    /* renamed from: I0 */
    public static final int f41341I0 = 0;

    /* renamed from: J0 */
    public static final int f41342J0 = 1;

    /* renamed from: K0 */
    public static final int f41343K0 = 2;

    /* renamed from: L0 */
    public static final int f41344L0 = 3;

    /* renamed from: M0 */
    public static final int f41345M0 = 4;

    /* renamed from: N0 */
    public static final int f41346N0 = 5;

    /* renamed from: O0 */
    public static final int f41347O0 = 6;

    /* renamed from: P0 */
    public static final int f41348P0 = 7;

    /* renamed from: Q0 */
    public static final int f41349Q0 = 8;

    /* renamed from: R0 */
    public static int f41350R0 = 1;

    /* renamed from: S0 */
    public static int f41351S0 = 1;

    /* renamed from: T0 */
    public static int f41352T0 = 1;

    /* renamed from: U0 */
    public static int f41353U0 = 1;

    /* renamed from: V0 */
    public static int f41354V0 = 1;

    /* renamed from: W0 */
    public static final int f41355W0 = 9;

    /* renamed from: E0 */
    public float f41356E0 = 0.0f;

    /* renamed from: F0 */
    public HashSet<C16639b> f41357F0 = null;

    /* renamed from: X */
    public int f41358X = 0;

    /* renamed from: Y */
    public boolean f41359Y = false;

    /* renamed from: Z */
    public int f41360Z = -1;

    /* renamed from: a */
    public boolean f41361a;

    /* renamed from: b */
    public String f41362b;

    /* renamed from: c */
    public int f41363c = -1;

    /* renamed from: d */
    public int f41364d = -1;

    /* renamed from: e */
    public int f41365e = 0;

    /* renamed from: f */
    public float f41366f;

    /* renamed from: g */
    public boolean f41367g = false;

    /* renamed from: v */
    public float[] f41368v = new float[9];

    /* renamed from: w */
    public float[] f41369w = new float[9];

    /* renamed from: x */
    public Type f41370x;

    /* renamed from: y */
    public C16639b[] f41371y = new C16639b[16];

    /* renamed from: z */
    public int f41372z = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: androidx.constraintlayout.core.SolverVariable$a */
    public static /* synthetic */ class C16637a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41379a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.SolverVariable$Type[] r0 = androidx.constraintlayout.core.SolverVariable.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41379a = r0
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41379a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.CONSTANT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41379a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.SLACK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f41379a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f41379a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.SolverVariable.C16637a.<clinit>():void");
        }
    }

    public SolverVariable(String str, Type type) {
        this.f41362b = str;
        this.f41370x = type;
    }

    /* renamed from: w */
    public static String m75679w(Type type, String str) {
        if (str != null) {
            return str + f41351S0;
        }
        int i = C16637a.f41379a[type.ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(C37106a.f92903h);
            int i2 = f41352T0 + 1;
            f41352T0 = i2;
            sb.append(i2);
            return sb.toString();
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(EnergyLabelKt.f67708f);
            int i3 = f41353U0 + 1;
            f41353U0 = i3;
            sb2.append(i3);
            return sb2.toString();
        } else if (i == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C19135a.f48823R4);
            int i4 = f41350R0 + 1;
            f41350R0 = i4;
            sb3.append(i4);
            return sb3.toString();
        } else if (i == 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C34651e.f83829d);
            int i5 = f41351S0 + 1;
            f41351S0 = i5;
            sb4.append(i5);
            return sb4.toString();
        } else if (i == 5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(C19135a.f48877X4);
            int i6 = f41354V0 + 1;
            f41354V0 = i6;
            sb5.append(i6);
            return sb5.toString();
        } else {
            throw new AssertionError(type.name());
        }
    }

    /* renamed from: y */
    public static void m75680y() {
        f41351S0++;
    }

    /* renamed from: M */
    public void mo48610M() {
        this.f41362b = null;
        this.f41370x = Type.UNKNOWN;
        this.f41365e = 0;
        this.f41363c = -1;
        this.f41364d = -1;
        this.f41366f = 0.0f;
        this.f41367g = false;
        this.f41359Y = false;
        this.f41360Z = -1;
        this.f41356E0 = 0.0f;
        int i = this.f41372z;
        for (int i2 = 0; i2 < i; i2++) {
            this.f41371y[i2] = null;
        }
        this.f41372z = 0;
        this.f41358X = 0;
        this.f41361a = false;
        Arrays.fill(this.f41369w, 0.0f);
    }

    /* renamed from: Q */
    public void mo48611Q(C16643e eVar, float f) {
        this.f41366f = f;
        this.f41367g = true;
        this.f41359Y = false;
        this.f41360Z = -1;
        this.f41356E0 = 0.0f;
        int i = this.f41372z;
        this.f41364d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f41371y[i2].mo48653a(eVar, this, false);
        }
        this.f41372z = 0;
    }

    /* renamed from: W */
    public void mo48612W(String str) {
        this.f41362b = str;
    }

    /* renamed from: X */
    public void mo48613X(C16643e eVar, SolverVariable solverVariable, float f) {
        this.f41359Y = true;
        this.f41360Z = solverVariable.f41363c;
        this.f41356E0 = f;
        int i = this.f41372z;
        this.f41364d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f41371y[i2].mo48652G(eVar, this, false);
        }
        this.f41372z = 0;
        eVar.mo48731z();
    }

    /* renamed from: Z */
    public void mo48614Z(Type type, String str) {
        this.f41370x = type;
    }

    /* renamed from: b */
    public final void mo48615b(C16639b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f41372z;
            if (i >= i2) {
                C16639b[] bVarArr = this.f41371y;
                if (i2 >= bVarArr.length) {
                    this.f41371y = (C16639b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C16639b[] bVarArr2 = this.f41371y;
                int i3 = this.f41372z;
                bVarArr2[i3] = bVar;
                this.f41372z = i3 + 1;
                return;
            } else if (this.f41371y[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e0 */
    public String mo48617e0() {
        String str = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.f41368v.length; i++) {
            String str2 = str + this.f41368v[i];
            float[] fArr = this.f41368v;
            float f = fArr[i];
            if (f > 0.0f) {
                z = false;
            } else if (f < 0.0f) {
                z = true;
            }
            if (f != 0.0f) {
                z2 = false;
            }
            if (i < fArr.length - 1) {
                str = str2 + ", ";
            } else {
                str = str2 + "] ";
            }
        }
        if (z) {
            str = str + " (-)";
        }
        if (!z2) {
            return str;
        }
        return str + " (*)";
    }

    /* renamed from: f0 */
    public final void mo48618f0(C16643e eVar, C16639b bVar) {
        int i = this.f41372z;
        for (int i2 = 0; i2 < i; i2++) {
            this.f41371y[i2].mo48655c(eVar, bVar, false);
        }
        this.f41372z = 0;
    }

    /* renamed from: g */
    public void mo48619g() {
        for (int i = 0; i < 9; i++) {
            this.f41368v[i] = 0.0f;
        }
    }

    /* renamed from: q */
    public int compareTo(SolverVariable solverVariable) {
        return this.f41363c - solverVariable.f41363c;
    }

    /* renamed from: r */
    public String mo48621r() {
        return this.f41362b;
    }

    public String toString() {
        if (this.f41362b != null) {
            return "" + this.f41362b;
        }
        return "" + this.f41363c;
    }

    /* renamed from: z */
    public final void mo48623z(C16639b bVar) {
        int i = this.f41372z;
        int i2 = 0;
        while (i2 < i) {
            if (this.f41371y[i2] == bVar) {
                while (i2 < i - 1) {
                    C16639b[] bVarArr = this.f41371y;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f41372z--;
                return;
            }
            i2++;
        }
    }

    public SolverVariable(Type type, String str) {
        this.f41370x = type;
    }
}
