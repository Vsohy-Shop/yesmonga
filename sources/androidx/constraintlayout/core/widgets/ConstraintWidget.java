package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16641c;
import androidx.constraintlayout.core.C16643e;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.C16772o;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.C16781c;
import androidx.constraintlayout.core.widgets.analyzer.C16789k;
import androidx.constraintlayout.core.widgets.analyzer.C16792m;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.bumptech.glide.load.engine.GlideException;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.C12412q;

public class ConstraintWidget {

    /* renamed from: U0 */
    public static final boolean f42644U0 = false;

    /* renamed from: V0 */
    public static final int f42645V0 = 1;

    /* renamed from: W0 */
    public static final int f42646W0 = 2;

    /* renamed from: X0 */
    public static final boolean f42647X0 = false;

    /* renamed from: Y0 */
    public static final int f42648Y0 = 0;

    /* renamed from: Z0 */
    public static final int f42649Z0 = 1;

    /* renamed from: a1 */
    public static final int f42650a1 = 2;

    /* renamed from: b1 */
    public static final int f42651b1 = 3;

    /* renamed from: c1 */
    public static final int f42652c1 = 4;

    /* renamed from: d1 */
    public static final int f42653d1 = -1;

    /* renamed from: e1 */
    public static final int f42654e1 = 0;

    /* renamed from: f1 */
    public static final int f42655f1 = 1;

    /* renamed from: g1 */
    public static final int f42656g1 = 2;

    /* renamed from: h1 */
    public static final int f42657h1 = 0;

    /* renamed from: i1 */
    public static final int f42658i1 = 4;

    /* renamed from: j1 */
    public static final int f42659j1 = 8;

    /* renamed from: k1 */
    public static final int f42660k1 = 0;

    /* renamed from: l1 */
    public static final int f42661l1 = 1;

    /* renamed from: m1 */
    public static final int f42662m1 = 2;

    /* renamed from: n1 */
    public static final int f42663n1 = 0;

    /* renamed from: o1 */
    public static final int f42664o1 = 1;

    /* renamed from: p1 */
    public static final int f42665p1 = 2;

    /* renamed from: q1 */
    public static final int f42666q1 = 3;

    /* renamed from: r1 */
    public static final int f42667r1 = -2;

    /* renamed from: s1 */
    public static final int f42668s1 = 0;

    /* renamed from: t1 */
    public static final int f42669t1 = 1;

    /* renamed from: u1 */
    public static final int f42670u1 = 2;

    /* renamed from: v1 */
    public static final int f42671v1 = 3;

    /* renamed from: w1 */
    public static final int f42672w1 = 4;

    /* renamed from: x1 */
    public static final int f42673x1 = 0;

    /* renamed from: y1 */
    public static final int f42674y1 = 1;

    /* renamed from: z1 */
    public static float f42675z1 = 0.5f;

    /* renamed from: A */
    public int f42676A;

    /* renamed from: A0 */
    public int f42677A0;

    /* renamed from: B */
    public float f42678B;

    /* renamed from: B0 */
    public int f42679B0;

    /* renamed from: C */
    public int f42680C;

    /* renamed from: C0 */
    public boolean f42681C0;

    /* renamed from: D */
    public int f42682D;

    /* renamed from: D0 */
    public boolean f42683D0;

    /* renamed from: E */
    public float f42684E;

    /* renamed from: E0 */
    public boolean f42685E0;

    /* renamed from: F */
    public boolean f42686F;

    /* renamed from: F0 */
    public boolean f42687F0;

    /* renamed from: G */
    public boolean f42688G;

    /* renamed from: G0 */
    public boolean f42689G0;

    /* renamed from: H */
    public int f42690H;

    /* renamed from: H0 */
    public boolean f42691H0;

    /* renamed from: I */
    public float f42692I;

    /* renamed from: I0 */
    public boolean f42693I0;

    /* renamed from: J */
    public int[] f42694J;

    /* renamed from: J0 */
    public int f42695J0;

    /* renamed from: K */
    public float f42696K;

    /* renamed from: K0 */
    public int f42697K0;

    /* renamed from: L */
    public boolean f42698L;

    /* renamed from: L0 */
    public boolean f42699L0;

    /* renamed from: M */
    public boolean f42700M;

    /* renamed from: M0 */
    public boolean f42701M0;

    /* renamed from: N */
    public boolean f42702N;

    /* renamed from: N0 */
    public float[] f42703N0;

    /* renamed from: O */
    public int f42704O;

    /* renamed from: O0 */
    public ConstraintWidget[] f42705O0;

    /* renamed from: P */
    public int f42706P;

    /* renamed from: P0 */
    public ConstraintWidget[] f42707P0;

    /* renamed from: Q */
    public ConstraintAnchor f42708Q;

    /* renamed from: Q0 */
    public ConstraintWidget f42709Q0;

    /* renamed from: R */
    public ConstraintAnchor f42710R;

    /* renamed from: R0 */
    public ConstraintWidget f42711R0;

    /* renamed from: S */
    public ConstraintAnchor f42712S;

    /* renamed from: S0 */
    public int f42713S0;

    /* renamed from: T */
    public ConstraintAnchor f42714T;

    /* renamed from: T0 */
    public int f42715T0;

    /* renamed from: U */
    public ConstraintAnchor f42716U;

    /* renamed from: V */
    public ConstraintAnchor f42717V;

    /* renamed from: W */
    public ConstraintAnchor f42718W;

    /* renamed from: X */
    public ConstraintAnchor f42719X;

    /* renamed from: Y */
    public ConstraintAnchor[] f42720Y;

    /* renamed from: Z */
    public ArrayList<ConstraintAnchor> f42721Z;

    /* renamed from: a */
    public boolean f42722a;

    /* renamed from: a0 */
    public boolean[] f42723a0;

    /* renamed from: b */
    public WidgetRun[] f42724b;

    /* renamed from: b0 */
    public DimensionBehaviour[] f42725b0;

    /* renamed from: c */
    public C16781c f42726c;

    /* renamed from: c0 */
    public ConstraintWidget f42727c0;

    /* renamed from: d */
    public C16781c f42728d;

    /* renamed from: d0 */
    public int f42729d0;

    /* renamed from: e */
    public C16789k f42730e;

    /* renamed from: e0 */
    public int f42731e0;

    /* renamed from: f */
    public C16792m f42732f;

    /* renamed from: f0 */
    public float f42733f0;

    /* renamed from: g */
    public boolean[] f42734g;

    /* renamed from: g0 */
    public int f42735g0;

    /* renamed from: h */
    public boolean f42736h;

    /* renamed from: h0 */
    public int f42737h0;

    /* renamed from: i */
    public boolean f42738i;

    /* renamed from: i0 */
    public int f42739i0;

    /* renamed from: j */
    public boolean f42740j;

    /* renamed from: j0 */
    public int f42741j0;

    /* renamed from: k */
    public boolean f42742k;

    /* renamed from: k0 */
    public int f42743k0;

    /* renamed from: l */
    public int f42744l;

    /* renamed from: l0 */
    public int f42745l0;

    /* renamed from: m */
    public int f42746m;

    /* renamed from: m0 */
    public int f42747m0;

    /* renamed from: n */
    public C16772o f42748n;

    /* renamed from: n0 */
    public int f42749n0;

    /* renamed from: o */
    public String f42750o;

    /* renamed from: o0 */
    public int f42751o0;

    /* renamed from: p */
    public boolean f42752p;

    /* renamed from: p0 */
    public int f42753p0;

    /* renamed from: q */
    public boolean f42754q;

    /* renamed from: q0 */
    public float f42755q0;

    /* renamed from: r */
    public boolean f42756r;

    /* renamed from: r0 */
    public float f42757r0;

    /* renamed from: s */
    public boolean f42758s;

    /* renamed from: s0 */
    public Object f42759s0;

    /* renamed from: t */
    public int f42760t;

    /* renamed from: t0 */
    public int f42761t0;

    /* renamed from: u */
    public int f42762u;

    /* renamed from: u0 */
    public int f42763u0;

    /* renamed from: v */
    public int f42764v;

    /* renamed from: v0 */
    public boolean f42765v0;

    /* renamed from: w */
    public int f42766w;

    /* renamed from: w0 */
    public String f42767w0;

    /* renamed from: x */
    public int f42768x;

    /* renamed from: x0 */
    public String f42769x0;

    /* renamed from: y */
    public int[] f42770y;

    /* renamed from: y0 */
    public int f42771y0;

    /* renamed from: z */
    public int f42772z;

    /* renamed from: z0 */
    public int f42773z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$a */
    public static /* synthetic */ class C16774a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42779a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f42780b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42780b = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f42780b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f42780b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f42780b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f42779a = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f42779a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.f42635c     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.C16774a.<clinit>():void");
        }
    }

    public ConstraintWidget() {
        this.f42722a = false;
        this.f42724b = new WidgetRun[2];
        this.f42730e = null;
        this.f42732f = null;
        this.f42734g = new boolean[]{true, true};
        this.f42736h = false;
        this.f42738i = true;
        this.f42740j = false;
        this.f42742k = true;
        this.f42744l = -1;
        this.f42746m = -1;
        this.f42748n = new C16772o(this);
        this.f42752p = false;
        this.f42754q = false;
        this.f42756r = false;
        this.f42758s = false;
        this.f42760t = -1;
        this.f42762u = -1;
        this.f42764v = 0;
        this.f42766w = 0;
        this.f42768x = 0;
        this.f42770y = new int[2];
        this.f42772z = 0;
        this.f42676A = 0;
        this.f42678B = 1.0f;
        this.f42680C = 0;
        this.f42682D = 0;
        this.f42684E = 1.0f;
        this.f42690H = -1;
        this.f42692I = 1.0f;
        this.f42694J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f42696K = 0.0f;
        this.f42698L = false;
        this.f42702N = false;
        this.f42704O = 0;
        this.f42706P = 0;
        this.f42708Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f42710R = new ConstraintAnchor(this, ConstraintAnchor.Type.f42635c);
        this.f42712S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f42714T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f42716U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f42717V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f42718W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f42719X = constraintAnchor;
        this.f42720Y = new ConstraintAnchor[]{this.f42708Q, this.f42712S, this.f42710R, this.f42714T, this.f42716U, constraintAnchor};
        this.f42721Z = new ArrayList<>();
        this.f42723a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f42725b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f42727c0 = null;
        this.f42729d0 = 0;
        this.f42731e0 = 0;
        this.f42733f0 = 0.0f;
        this.f42735g0 = -1;
        this.f42737h0 = 0;
        this.f42739i0 = 0;
        this.f42741j0 = 0;
        this.f42743k0 = 0;
        this.f42745l0 = 0;
        this.f42747m0 = 0;
        this.f42749n0 = 0;
        float f = f42675z1;
        this.f42755q0 = f;
        this.f42757r0 = f;
        this.f42761t0 = 0;
        this.f42763u0 = 0;
        this.f42765v0 = false;
        this.f42767w0 = null;
        this.f42769x0 = null;
        this.f42693I0 = false;
        this.f42695J0 = 0;
        this.f42697K0 = 0;
        this.f42703N0 = new float[]{-1.0f, -1.0f};
        this.f42705O0 = new ConstraintWidget[]{null, null};
        this.f42707P0 = new ConstraintWidget[]{null, null};
        this.f42709Q0 = null;
        this.f42711R0 = null;
        this.f42713S0 = -1;
        this.f42715T0 = -1;
        mo49534d();
    }

    /* renamed from: A */
    public float mo49447A() {
        return this.f42733f0;
    }

    /* renamed from: A0 */
    public boolean mo49448A0(int i) {
        return this.f42723a0[i];
    }

    /* renamed from: A1 */
    public void mo49449A1(float f) {
        this.f42755q0 = f;
    }

    /* renamed from: B */
    public int mo49450B() {
        return this.f42735g0;
    }

    /* renamed from: B0 */
    public boolean mo49451B0() {
        ConstraintAnchor constraintAnchor = this.f42708Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f42629f;
        if (constraintAnchor2 != null && constraintAnchor2.f42629f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f42712S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f42629f;
        return constraintAnchor4 != null && constraintAnchor4.f42629f == constraintAnchor3;
    }

    /* renamed from: B1 */
    public void mo49452B1(int i) {
        this.f42695J0 = i;
    }

    /* renamed from: C */
    public boolean mo49453C() {
        return this.f42698L;
    }

    /* renamed from: C0 */
    public boolean mo49454C0() {
        return this.f42700M;
    }

    /* renamed from: C1 */
    public void mo49455C1(int i, int i2) {
        this.f42737h0 = i;
        int i3 = i2 - i;
        this.f42729d0 = i3;
        int i4 = this.f42751o0;
        if (i3 < i4) {
            this.f42729d0 = i4;
        }
    }

    /* renamed from: D */
    public int mo49456D() {
        if (this.f42763u0 == 8) {
            return 0;
        }
        return this.f42731e0;
    }

    /* renamed from: D0 */
    public boolean mo49457D0() {
        ConstraintAnchor constraintAnchor = this.f42710R;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f42629f;
        if (constraintAnchor2 != null && constraintAnchor2.f42629f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f42714T;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f42629f;
        return constraintAnchor4 != null && constraintAnchor4.f42629f == constraintAnchor3;
    }

    /* renamed from: D1 */
    public void mo49458D1(DimensionBehaviour dimensionBehaviour) {
        this.f42725b0[0] = dimensionBehaviour;
    }

    /* renamed from: E */
    public float mo49459E() {
        return this.f42755q0;
    }

    /* renamed from: E0 */
    public boolean mo49460E0() {
        return this.f42702N;
    }

    /* renamed from: E1 */
    public void mo49461E1(int i, int i2, int i3, float f) {
        this.f42766w = i;
        this.f42772z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f42676A = i3;
        this.f42678B = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f42766w = 2;
        }
    }

    /* renamed from: F */
    public ConstraintWidget mo49462F() {
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor2;
        if (!mo49451B0()) {
            return null;
        }
        ConstraintWidget constraintWidget2 = this;
        ConstraintWidget constraintWidget3 = null;
        while (constraintWidget3 == null && constraintWidget2 != null) {
            ConstraintAnchor r = constraintWidget2.mo49583r(ConstraintAnchor.Type.LEFT);
            if (r == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = r.mo49430k();
            }
            if (constraintAnchor == null) {
                constraintWidget = null;
            } else {
                constraintWidget = constraintAnchor.mo49428i();
            }
            if (constraintWidget == mo49507U()) {
                return constraintWidget2;
            }
            if (constraintWidget == null) {
                constraintAnchor2 = null;
            } else {
                constraintAnchor2 = constraintWidget.mo49583r(ConstraintAnchor.Type.RIGHT).mo49430k();
            }
            if (constraintAnchor2 == null || constraintAnchor2.mo49428i() == constraintWidget2) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget3 = constraintWidget2;
            }
        }
        return constraintWidget3;
    }

    /* renamed from: F0 */
    public boolean mo49463F0() {
        return this.f42738i && this.f42763u0 != 8;
    }

    /* renamed from: F1 */
    public void mo49464F1(float f) {
        this.f42703N0[0] = f;
    }

    /* renamed from: G */
    public int mo49465G() {
        return this.f42695J0;
    }

    /* renamed from: G0 */
    public boolean mo49466G0() {
        return this.f42752p || (this.f42708Q.mo49434o() && this.f42712S.mo49434o());
    }

    /* renamed from: G1 */
    public void mo49467G1(int i, boolean z) {
        this.f42723a0[i] = z;
    }

    /* renamed from: H */
    public DimensionBehaviour mo49468H() {
        return this.f42725b0[0];
    }

    /* renamed from: H0 */
    public boolean mo49469H0() {
        return this.f42754q || (this.f42710R.mo49434o() && this.f42714T.mo49434o());
    }

    /* renamed from: H1 */
    public void mo49470H1(boolean z) {
        this.f42700M = z;
    }

    /* renamed from: I */
    public int mo49471I() {
        ConstraintAnchor constraintAnchor = this.f42708Q;
        int i = 0;
        if (constraintAnchor != null) {
            i = 0 + constraintAnchor.f42630g;
        }
        ConstraintAnchor constraintAnchor2 = this.f42712S;
        if (constraintAnchor2 != null) {
            return i + constraintAnchor2.f42630g;
        }
        return i;
    }

    /* renamed from: I0 */
    public boolean mo49472I0() {
        return this.f42727c0 == null;
    }

    /* renamed from: I1 */
    public void mo49473I1(boolean z) {
        this.f42702N = z;
    }

    /* renamed from: J */
    public int mo49474J() {
        return this.f42704O;
    }

    /* renamed from: J0 */
    public boolean mo49475J0() {
        return this.f42768x == 0 && this.f42733f0 == 0.0f && this.f42680C == 0 && this.f42682D == 0 && this.f42725b0[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* renamed from: J1 */
    public void mo49476J1(int i, int i2) {
        this.f42704O = i;
        this.f42706P = i2;
        mo49488N1(false);
    }

    /* renamed from: K */
    public int mo49477K() {
        return this.f42706P;
    }

    /* renamed from: K0 */
    public boolean mo49478K0() {
        return this.f42766w == 0 && this.f42733f0 == 0.0f && this.f42772z == 0 && this.f42676A == 0 && this.f42725b0[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* renamed from: K1 */
    public void mo49479K1(int i, int i2) {
        if (i2 == 0) {
            mo49533c2(i);
        } else if (i2 == 1) {
            mo49607y1(i);
        }
    }

    /* renamed from: L */
    public int mo49480L() {
        return mo49575o0();
    }

    /* renamed from: L0 */
    public boolean mo49481L0() {
        return this.f42758s;
    }

    /* renamed from: L1 */
    public void mo49482L1(int i) {
        this.f42694J[1] = i;
    }

    /* renamed from: M */
    public int mo49483M(int i) {
        if (i == 0) {
            return mo49569m0();
        }
        if (i == 1) {
            return mo49456D();
        }
        return 0;
    }

    /* renamed from: M0 */
    public boolean mo49484M0() {
        return this.f42686F;
    }

    /* renamed from: M1 */
    public void mo49485M1(int i) {
        this.f42694J[0] = i;
    }

    /* renamed from: N */
    public int mo49486N() {
        return this.f42694J[1];
    }

    /* renamed from: N0 */
    public void mo49487N0() {
        this.f42756r = true;
    }

    /* renamed from: N1 */
    public void mo49488N1(boolean z) {
        this.f42738i = z;
    }

    /* renamed from: O */
    public int mo49489O() {
        return this.f42694J[0];
    }

    /* renamed from: O0 */
    public void mo49490O0() {
        this.f42758s = true;
    }

    /* renamed from: O1 */
    public void mo49491O1(int i) {
        if (i < 0) {
            this.f42753p0 = 0;
        } else {
            this.f42753p0 = i;
        }
    }

    /* renamed from: P */
    public int mo49492P() {
        return this.f42753p0;
    }

    /* renamed from: P0 */
    public boolean mo49493P0(int i) {
        char c;
        if (i == 0) {
            c = 1;
        } else {
            c = 0;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f42725b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3) {
            return true;
        }
        return false;
    }

    /* renamed from: P1 */
    public void mo49494P1(int i) {
        if (i < 0) {
            this.f42751o0 = 0;
        } else {
            this.f42751o0 = i;
        }
    }

    /* renamed from: Q */
    public int mo49495Q() {
        return this.f42751o0;
    }

    /* renamed from: Q0 */
    public boolean mo49496Q0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f42725b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    /* renamed from: Q1 */
    public void mo49497Q1(int i, int i2) {
        this.f42745l0 = i;
        this.f42747m0 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f42714T;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget mo49498R(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f42712S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f42629f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42629f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f42627d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f42629f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42629f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f42627d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo49498R(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* renamed from: R0 */
    public void mo49499R0() {
        this.f42708Q.mo49444x();
        this.f42710R.mo49444x();
        this.f42712S.mo49444x();
        this.f42714T.mo49444x();
        this.f42716U.mo49444x();
        this.f42717V.mo49444x();
        this.f42718W.mo49444x();
        this.f42719X.mo49444x();
        this.f42727c0 = null;
        this.f42696K = 0.0f;
        this.f42729d0 = 0;
        this.f42731e0 = 0;
        this.f42733f0 = 0.0f;
        this.f42735g0 = -1;
        this.f42737h0 = 0;
        this.f42739i0 = 0;
        this.f42745l0 = 0;
        this.f42747m0 = 0;
        this.f42749n0 = 0;
        this.f42751o0 = 0;
        this.f42753p0 = 0;
        float f = f42675z1;
        this.f42755q0 = f;
        this.f42757r0 = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f42725b0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f42759s0 = null;
        this.f42761t0 = 0;
        this.f42763u0 = 0;
        this.f42769x0 = null;
        this.f42689G0 = false;
        this.f42691H0 = false;
        this.f42695J0 = 0;
        this.f42697K0 = 0;
        this.f42699L0 = false;
        this.f42701M0 = false;
        float[] fArr = this.f42703N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f42760t = -1;
        this.f42762u = -1;
        int[] iArr = this.f42694J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f42766w = 0;
        this.f42768x = 0;
        this.f42678B = 1.0f;
        this.f42684E = 1.0f;
        this.f42676A = Integer.MAX_VALUE;
        this.f42682D = Integer.MAX_VALUE;
        this.f42772z = 0;
        this.f42680C = 0;
        this.f42736h = false;
        this.f42690H = -1;
        this.f42692I = 1.0f;
        this.f42693I0 = false;
        boolean[] zArr = this.f42734g;
        zArr[0] = true;
        zArr[1] = true;
        this.f42702N = false;
        boolean[] zArr2 = this.f42723a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f42738i = true;
        int[] iArr2 = this.f42770y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f42744l = -1;
        this.f42746m = -1;
    }

    /* renamed from: R1 */
    public void mo49500R1(int i, int i2) {
        this.f42737h0 = i;
        this.f42739i0 = i2;
    }

    /* renamed from: S */
    public int mo49501S() {
        int i;
        int i2 = this.f42731e0;
        if (this.f42725b0[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.f42768x == 1) {
            i = Math.max(this.f42680C, i2);
        } else {
            i = this.f42680C;
            if (i > 0) {
                this.f42731e0 = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.f42682D;
        if (i3 <= 0 || i3 >= i) {
            return i;
        }
        return i3;
    }

    /* renamed from: S0 */
    public void mo49502S0() {
        mo49508U0();
        mo49512V1(f42675z1);
        mo49449A1(f42675z1);
    }

    /* renamed from: S1 */
    public void mo49503S1(ConstraintWidget constraintWidget) {
        this.f42727c0 = constraintWidget;
    }

    /* renamed from: T */
    public int mo49504T() {
        int i;
        int i2 = this.f42729d0;
        if (this.f42725b0[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.f42766w == 1) {
            i = Math.max(this.f42772z, i2);
        } else {
            i = this.f42772z;
            if (i > 0) {
                this.f42729d0 = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.f42676A;
        if (i3 <= 0 || i3 >= i) {
            return i;
        }
        return i3;
    }

    /* renamed from: T0 */
    public void mo49505T0(ConstraintAnchor constraintAnchor) {
        if (mo49507U() == null || !(mo49507U() instanceof C16798d) || !((C16798d) mo49507U()).mo49727K2()) {
            ConstraintAnchor r = mo49583r(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor r2 = mo49583r(ConstraintAnchor.Type.RIGHT);
            ConstraintAnchor r3 = mo49583r(ConstraintAnchor.Type.f42635c);
            ConstraintAnchor r4 = mo49583r(ConstraintAnchor.Type.BOTTOM);
            ConstraintAnchor r5 = mo49583r(ConstraintAnchor.Type.CENTER);
            ConstraintAnchor r6 = mo49583r(ConstraintAnchor.Type.CENTER_X);
            ConstraintAnchor r7 = mo49583r(ConstraintAnchor.Type.CENTER_Y);
            if (constraintAnchor == r5) {
                if (r.mo49435p() && r2.mo49435p() && r.mo49430k() == r2.mo49430k()) {
                    r.mo49444x();
                    r2.mo49444x();
                }
                if (r3.mo49435p() && r4.mo49435p() && r3.mo49430k() == r4.mo49430k()) {
                    r3.mo49444x();
                    r4.mo49444x();
                }
                this.f42755q0 = 0.5f;
                this.f42757r0 = 0.5f;
            } else if (constraintAnchor == r6) {
                if (r.mo49435p() && r2.mo49435p() && r.mo49430k().mo49428i() == r2.mo49430k().mo49428i()) {
                    r.mo49444x();
                    r2.mo49444x();
                }
                this.f42755q0 = 0.5f;
            } else if (constraintAnchor == r7) {
                if (r3.mo49435p() && r4.mo49435p() && r3.mo49430k().mo49428i() == r4.mo49430k().mo49428i()) {
                    r3.mo49444x();
                    r4.mo49444x();
                }
                this.f42757r0 = 0.5f;
            } else if (constraintAnchor == r || constraintAnchor == r2) {
                if (r.mo49435p() && r.mo49430k() == r2.mo49430k()) {
                    r5.mo49444x();
                }
            } else if ((constraintAnchor == r3 || constraintAnchor == r4) && r3.mo49435p() && r3.mo49430k() == r4.mo49430k()) {
                r5.mo49444x();
            }
            constraintAnchor.mo49444x();
        }
    }

    /* renamed from: T1 */
    public void mo49506T1(int i, int i2) {
        if (i2 == 0) {
            this.f42741j0 = i;
        } else if (i2 == 1) {
            this.f42743k0 = i;
        }
    }

    /* renamed from: U */
    public ConstraintWidget mo49507U() {
        return this.f42727c0;
    }

    /* renamed from: U0 */
    public void mo49508U0() {
        ConstraintWidget U = mo49507U();
        if (U == null || !(U instanceof C16798d) || !((C16798d) mo49507U()).mo49727K2()) {
            int size = this.f42721Z.size();
            for (int i = 0; i < size; i++) {
                this.f42721Z.get(i).mo49444x();
            }
        }
    }

    /* renamed from: U1 */
    public void mo49509U1(String str) {
        this.f42769x0 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f42710R;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget mo49510V(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f42708Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f42629f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42629f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f42627d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f42629f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42629f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f42627d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo49510V(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* renamed from: V0 */
    public void mo49511V0() {
        this.f42752p = false;
        this.f42754q = false;
        this.f42756r = false;
        this.f42758s = false;
        int size = this.f42721Z.size();
        for (int i = 0; i < size; i++) {
            this.f42721Z.get(i).mo49445y();
        }
    }

    /* renamed from: V1 */
    public void mo49512V1(float f) {
        this.f42757r0 = f;
    }

    /* renamed from: W */
    public int mo49513W(int i) {
        if (i == 0) {
            return this.f42741j0;
        }
        if (i == 1) {
            return this.f42743k0;
        }
        return 0;
    }

    /* renamed from: W0 */
    public void mo49514W0(C16641c cVar) {
        this.f42708Q.mo49446z(cVar);
        this.f42710R.mo49446z(cVar);
        this.f42712S.mo49446z(cVar);
        this.f42714T.mo49446z(cVar);
        this.f42716U.mo49446z(cVar);
        this.f42719X.mo49446z(cVar);
        this.f42717V.mo49446z(cVar);
        this.f42718W.mo49446z(cVar);
    }

    /* renamed from: W1 */
    public void mo49515W1(int i) {
        this.f42697K0 = i;
    }

    /* renamed from: X */
    public int mo49516X() {
        return mo49575o0() + this.f42729d0;
    }

    /* renamed from: X0 */
    public void mo49517X0() {
        this.f42756r = false;
        this.f42758s = false;
    }

    /* renamed from: X1 */
    public void mo49518X1(int i, int i2) {
        this.f42739i0 = i;
        int i3 = i2 - i;
        this.f42731e0 = i3;
        int i4 = this.f42753p0;
        if (i3 < i4) {
            this.f42731e0 = i4;
        }
    }

    /* renamed from: Y */
    public int mo49519Y() {
        return this.f42737h0 + this.f42745l0;
    }

    /* renamed from: Y0 */
    public StringBuilder mo49520Y0(StringBuilder sb) {
        sb.append("{\n");
        mo49523Z0(sb, C9168d0.f24880E0, this.f42708Q);
        mo49523Z0(sb, C9156c.f24820X, this.f42710R);
        mo49523Z0(sb, C9168d0.f24887Z, this.f42712S);
        mo49523Z0(sb, C9156c.f24821Y, this.f42714T);
        mo49523Z0(sb, "baseline", this.f42716U);
        mo49523Z0(sb, "centerX", this.f42717V);
        mo49523Z0(sb, "centerY", this.f42718W);
        mo49532c1(sb, this.f42719X, this.f42696K);
        mo49540e1(sb, "width", this.f42729d0, this.f42751o0, this.f42694J[0], this.f42744l, this.f42772z, this.f42766w, this.f42678B, this.f42703N0[0]);
        mo49540e1(sb, "height", this.f42731e0, this.f42753p0, this.f42694J[1], this.f42746m, this.f42680C, this.f42768x, this.f42684E, this.f42703N0[1]);
        mo49536d1(sb, "dimensionRatio", this.f42733f0, this.f42735g0);
        mo49526a1(sb, "horizontalBias", this.f42755q0, f42675z1);
        mo49526a1(sb, "verticalBias", this.f42757r0, f42675z1);
        sb.append("}\n");
        return sb;
    }

    /* renamed from: Y1 */
    public void mo49521Y1(DimensionBehaviour dimensionBehaviour) {
        this.f42725b0[1] = dimensionBehaviour;
    }

    /* renamed from: Z */
    public int mo49522Z() {
        return this.f42739i0 + this.f42747m0;
    }

    /* renamed from: Z0 */
    public final void mo49523Z0(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f42629f != null) {
            sb.append(str);
            sb.append(" : [ '");
            sb.append(constraintAnchor.f42629f);
            sb.append("',");
            sb.append(constraintAnchor.f42630g);
            sb.append(",");
            sb.append(constraintAnchor.f42631h);
            sb.append(",");
            sb.append(" ] ,\n");
        }
    }

    /* renamed from: Z1 */
    public void mo49524Z1(int i, int i2, int i3, float f) {
        this.f42768x = i;
        this.f42680C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f42682D = i3;
        this.f42684E = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.f42768x = 2;
        }
    }

    /* renamed from: a0 */
    public WidgetRun mo49525a0(int i) {
        if (i == 0) {
            return this.f42730e;
        }
        if (i == 1) {
            return this.f42732f;
        }
        return null;
    }

    /* renamed from: a1 */
    public final void mo49526a1(StringBuilder sb, String str, float f, float f2) {
        if (f != f2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    /* renamed from: a2 */
    public void mo49527a2(float f) {
        this.f42703N0[1] = f;
    }

    /* renamed from: b0 */
    public void mo49528b0(StringBuilder sb) {
        sb.append(GlideException.C22148a.f56917d + this.f42750o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f42729d0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f42731e0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f42737h0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f42739i0);
        sb.append("\n");
        mo49535d0(sb, C9168d0.f24880E0, this.f42708Q);
        mo49535d0(sb, C9156c.f24820X, this.f42710R);
        mo49535d0(sb, C9168d0.f24887Z, this.f42712S);
        mo49535d0(sb, C9156c.f24821Y, this.f42714T);
        mo49535d0(sb, "baseline", this.f42716U);
        mo49535d0(sb, "centerX", this.f42717V);
        mo49535d0(sb, "centerY", this.f42718W);
        mo49531c0(sb, "    width", this.f42729d0, this.f42751o0, this.f42694J[0], this.f42744l, this.f42772z, this.f42766w, this.f42678B, this.f42703N0[0]);
        mo49531c0(sb, "    height", this.f42731e0, this.f42753p0, this.f42694J[1], this.f42746m, this.f42680C, this.f42768x, this.f42684E, this.f42703N0[1]);
        mo49536d1(sb, "    dimensionRatio", this.f42733f0, this.f42735g0);
        mo49526a1(sb, "    horizontalBias", this.f42755q0, f42675z1);
        mo49526a1(sb, "    verticalBias", this.f42757r0, f42675z1);
        mo49529b1(sb, "    horizontalChainStyle", this.f42695J0, 0);
        mo49529b1(sb, "    verticalChainStyle", this.f42697K0, 0);
        sb.append("  }");
    }

    /* renamed from: b1 */
    public final void mo49529b1(StringBuilder sb, String str, int i, int i2) {
        if (i != i2) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i);
            sb.append(",\n");
        }
    }

    /* renamed from: b2 */
    public void mo49530b2(int i) {
        this.f42763u0 = i;
    }

    /* renamed from: c0 */
    public final void mo49531c0(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        mo49529b1(sb, "      size", i, 0);
        mo49529b1(sb, "      min", i2, 0);
        mo49529b1(sb, "      max", i3, Integer.MAX_VALUE);
        mo49529b1(sb, "      matchMin", i5, 0);
        mo49529b1(sb, "      matchDef", i6, 0);
        mo49526a1(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* renamed from: c1 */
    public final void mo49532c1(StringBuilder sb, ConstraintAnchor constraintAnchor, float f) {
        if (constraintAnchor.f42629f != null) {
            sb.append("circle : [ '");
            sb.append(constraintAnchor.f42629f);
            sb.append("',");
            sb.append(constraintAnchor.f42630g);
            sb.append(",");
            sb.append(f);
            sb.append(",");
            sb.append(" ] ,\n");
        }
    }

    /* renamed from: c2 */
    public void mo49533c2(int i) {
        this.f42729d0 = i;
        int i2 = this.f42751o0;
        if (i < i2) {
            this.f42729d0 = i2;
        }
    }

    /* renamed from: d */
    public final void mo49534d() {
        this.f42721Z.add(this.f42708Q);
        this.f42721Z.add(this.f42710R);
        this.f42721Z.add(this.f42712S);
        this.f42721Z.add(this.f42714T);
        this.f42721Z.add(this.f42717V);
        this.f42721Z.add(this.f42718W);
        this.f42721Z.add(this.f42719X);
        this.f42721Z.add(this.f42716U);
    }

    /* renamed from: d0 */
    public final void mo49535d0(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f42629f != null) {
            sb.append(C12412q.f30348a);
            sb.append(str);
            sb.append(" : [ '");
            sb.append(constraintAnchor.f42629f);
            sb.append("'");
            if (!(constraintAnchor.f42631h == Integer.MIN_VALUE && constraintAnchor.f42630g == 0)) {
                sb.append(",");
                sb.append(constraintAnchor.f42630g);
                if (constraintAnchor.f42631h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(constraintAnchor.f42631h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    /* renamed from: d1 */
    public final void mo49536d1(StringBuilder sb, String str, float f, int i) {
        if (f != 0.0f) {
            sb.append(str);
            sb.append(" :  [");
            sb.append(f);
            sb.append(",");
            sb.append(i);
            sb.append("");
            sb.append("],\n");
        }
    }

    /* renamed from: d2 */
    public void mo49537d2(boolean z) {
        this.f42686F = z;
    }

    /* renamed from: e */
    public void mo49538e(C16798d dVar, C16643e eVar, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C16805i.m77234a(dVar, eVar, this);
                hashSet.remove(this);
                mo49546g(eVar, dVar.mo49734S2(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> e = this.f42708Q.mo49424e();
            if (e != null) {
                Iterator<ConstraintAnchor> it = e.iterator();
                while (it.hasNext()) {
                    it.next().f42627d.mo49538e(dVar, eVar, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> e2 = this.f42712S.mo49424e();
            if (e2 != null) {
                Iterator<ConstraintAnchor> it2 = e2.iterator();
                while (it2.hasNext()) {
                    it2.next().f42627d.mo49538e(dVar, eVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> e3 = this.f42710R.mo49424e();
        if (e3 != null) {
            Iterator<ConstraintAnchor> it3 = e3.iterator();
            while (it3.hasNext()) {
                it3.next().f42627d.mo49538e(dVar, eVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> e4 = this.f42714T.mo49424e();
        if (e4 != null) {
            Iterator<ConstraintAnchor> it4 = e4.iterator();
            while (it4.hasNext()) {
                it4.next().f42627d.mo49538e(dVar, eVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> e5 = this.f42716U.mo49424e();
        if (e5 != null) {
            Iterator<ConstraintAnchor> it5 = e5.iterator();
            while (it5.hasNext()) {
                it5.next().f42627d.mo49538e(dVar, eVar, hashSet, i, true);
            }
        }
    }

    /* renamed from: e0 */
    public int mo49539e0() {
        return mo49578p0();
    }

    /* renamed from: e1 */
    public final void mo49540e1(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        mo49529b1(sb, C9168d0.f24889w, i, Integer.MIN_VALUE);
        mo49529b1(sb, "min", i2, 0);
        mo49529b1(sb, "max", i3, Integer.MAX_VALUE);
        mo49529b1(sb, "matchMin", i5, 0);
        mo49529b1(sb, "matchDef", i6, 0);
        mo49529b1(sb, "matchPercent", i6, 1);
        sb.append("},\n");
    }

    /* renamed from: e2 */
    public void mo49541e2(int i) {
        if (i >= 0 && i <= 3) {
            this.f42764v = i;
        }
    }

    /* renamed from: f */
    public boolean mo49542f() {
        return (this instanceof C16808l) || (this instanceof C16801f);
    }

    /* renamed from: f0 */
    public String mo49543f0() {
        return this.f42769x0;
    }

    /* renamed from: f1 */
    public void mo49544f1(boolean z) {
        this.f42765v0 = z;
    }

    /* renamed from: f2 */
    public void mo49545f2(int i) {
        this.f42737h0 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05dd  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49546g(androidx.constraintlayout.core.C16643e r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42708Q
            androidx.constraintlayout.core.SolverVariable r13 = r14.mo48727u(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42712S
            androidx.constraintlayout.core.SolverVariable r12 = r14.mo48727u(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42710R
            androidx.constraintlayout.core.SolverVariable r11 = r14.mo48727u(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42714T
            androidx.constraintlayout.core.SolverVariable r10 = r14.mo48727u(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42716U
            androidx.constraintlayout.core.SolverVariable r9 = r14.mo48727u(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0055
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.f42725b0
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = r7
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.f42725b0
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = r7
            goto L_0x0044
        L_0x0043:
            r0 = r6
        L_0x0044:
            int r3 = r15.f42764v
            if (r3 == r7) goto L_0x0052
            if (r3 == r8) goto L_0x004f
            if (r3 == r1) goto L_0x0055
            r5 = r0
            r4 = r2
            goto L_0x0057
        L_0x004f:
            r5 = r0
            r4 = r6
            goto L_0x0057
        L_0x0052:
            r4 = r2
            r5 = r6
            goto L_0x0057
        L_0x0055:
            r4 = r6
            r5 = r4
        L_0x0057:
            int r0 = r15.f42763u0
            r3 = 8
            if (r0 != r3) goto L_0x0072
            boolean r0 = r15.f42765v0
            if (r0 != 0) goto L_0x0072
            boolean r0 = r53.mo49587s0()
            if (r0 != 0) goto L_0x0072
            boolean[] r0 = r15.f42723a0
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0072
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r0 = r15.f42752p
            r2 = 5
            if (r0 != 0) goto L_0x007b
            boolean r8 = r15.f42754q
            if (r8 == 0) goto L_0x00f8
        L_0x007b:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f42737h0
            r14.mo48712f(r13, r0)
            int r0 = r15.f42737h0
            int r8 = r15.f42729d0
            int r0 = r0 + r8
            r14.mo48712f(r12, r0)
            if (r4 == 0) goto L_0x00aa
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x00aa
            boolean r8 = r15.f42742k
            if (r8 == 0) goto L_0x00a1
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C16798d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f42708Q
            r0.mo49748u2(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f42712S
            r0.mo49747t2(r8)
            goto L_0x00aa
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42712S
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r14.mo48715i(r0, r12, r6, r2)
        L_0x00aa:
            boolean r0 = r15.f42754q
            if (r0 == 0) goto L_0x00eb
            int r0 = r15.f42739i0
            r14.mo48712f(r11, r0)
            int r0 = r15.f42739i0
            int r8 = r15.f42731e0
            int r0 = r0 + r8
            r14.mo48712f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42716U
            boolean r0 = r0.mo49433n()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f42739i0
            int r8 = r15.f42749n0
            int r0 = r0 + r8
            r14.mo48712f(r9, r0)
        L_0x00cb:
            if (r5 == 0) goto L_0x00eb
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x00eb
            boolean r8 = r15.f42742k
            if (r8 == 0) goto L_0x00e2
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C16798d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f42710R
            r0.mo49753z2(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f42714T
            r0.mo49752y2(r8)
            goto L_0x00eb
        L_0x00e2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42714T
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r14.mo48715i(r0, r10, r6, r2)
        L_0x00eb:
            boolean r0 = r15.f42752p
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r15.f42754q
            if (r0 == 0) goto L_0x00f8
            r15.f42752p = r6
            r15.f42754q = r6
            return
        L_0x00f8:
            androidx.constraintlayout.core.f r0 = androidx.constraintlayout.core.C16643e.f41409C
            r17 = 1
            if (r0 == 0) goto L_0x0104
            long r1 = r0.f41449K
            long r1 = r1 + r17
            r0.f41449K = r1
        L_0x0104:
            if (r55 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.analyzer.k r1 = r15.f42730e
            if (r1 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.analyzer.m r2 = r15.f42732f
            if (r2 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r1.f42819h
            boolean r7 = r8.f42800j
            if (r7 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f42820i
            boolean r1 = r1.f42800j
            if (r1 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.f42819h
            boolean r1 = r1.f42800j
            if (r1 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.f42820i
            boolean r1 = r1.f42800j
            if (r1 == 0) goto L_0x0193
            if (r0 == 0) goto L_0x012e
            long r1 = r0.f41478w
            long r1 = r1 + r17
            r0.f41478w = r1
        L_0x012e:
            int r0 = r8.f42797g
            r14.mo48712f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.k r0 = r15.f42730e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42820i
            int r0 = r0.f42797g
            r14.mo48712f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r15.f42732f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42819h
            int r0 = r0.f42797g
            r14.mo48712f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r15.f42732f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42820i
            int r0 = r0.f42797g
            r14.mo48712f(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r15.f42732f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42886k
            int r0 = r0.f42797g
            r14.mo48712f(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x018e
            if (r4 == 0) goto L_0x0174
            boolean[] r0 = r15.f42734g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0174
            boolean r0 = r53.mo49451B0()
            if (r0 != 0) goto L_0x0174
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42712S
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r14.mo48715i(r0, r12, r6, r3)
        L_0x0174:
            if (r5 == 0) goto L_0x018e
            boolean[] r0 = r15.f42734g
            r1 = 1
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x018e
            boolean r0 = r53.mo49457D0()
            if (r0 != 0) goto L_0x018e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42714T
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r14.mo48715i(r0, r10, r6, r3)
        L_0x018e:
            r15.f42752p = r6
            r15.f42754q = r6
            return
        L_0x0193:
            if (r0 == 0) goto L_0x019b
            long r1 = r0.f41479x
            long r1 = r1 + r17
            r0.f41479x = r1
        L_0x019b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x020f
            boolean r0 = r15.mo49603x0(r6)
            if (r0 == 0) goto L_0x01ae
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C16798d) r0
            r0.mo49744q2(r15, r6)
            r0 = 1
            goto L_0x01b2
        L_0x01ae:
            boolean r0 = r53.mo49451B0()
        L_0x01b2:
            r1 = 1
            boolean r2 = r15.mo49603x0(r1)
            if (r2 == 0) goto L_0x01c2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f42727c0
            androidx.constraintlayout.core.widgets.d r2 = (androidx.constraintlayout.core.widgets.C16798d) r2
            r2.mo49744q2(r15, r1)
            r1 = 1
            goto L_0x01c6
        L_0x01c2:
            boolean r1 = r53.mo49457D0()
        L_0x01c6:
            if (r0 != 0) goto L_0x01e6
            if (r4 == 0) goto L_0x01e6
            int r2 = r15.f42763u0
            if (r2 == r3) goto L_0x01e6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f42708Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42629f
            if (r2 != 0) goto L_0x01e6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f42712S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42629f
            if (r2 != 0) goto L_0x01e6
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42712S
            androidx.constraintlayout.core.SolverVariable r2 = r14.mo48727u(r2)
            r7 = 1
            r14.mo48715i(r2, r12, r6, r7)
        L_0x01e6:
            if (r1 != 0) goto L_0x020a
            if (r5 == 0) goto L_0x020a
            int r2 = r15.f42763u0
            if (r2 == r3) goto L_0x020a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42629f
            if (r2 != 0) goto L_0x020a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42629f
            if (r2 != 0) goto L_0x020a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f42716U
            if (r2 != 0) goto L_0x020a
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42714T
            androidx.constraintlayout.core.SolverVariable r2 = r14.mo48727u(r2)
            r7 = 1
            r14.mo48715i(r2, r10, r6, r7)
        L_0x020a:
            r29 = r0
            r28 = r1
            goto L_0x0213
        L_0x020f:
            r28 = r6
            r29 = r28
        L_0x0213:
            int r0 = r15.f42729d0
            int r1 = r15.f42751o0
            if (r0 >= r1) goto L_0x021a
            goto L_0x021b
        L_0x021a:
            r1 = r0
        L_0x021b:
            int r2 = r15.f42731e0
            int r7 = r15.f42753p0
            if (r2 >= r7) goto L_0x0222
            goto L_0x0223
        L_0x0222:
            r7 = r2
        L_0x0223:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.f42725b0
            r3 = r8[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r22 = r1
            if (r3 == r6) goto L_0x022f
            r1 = 1
            goto L_0x0230
        L_0x022f:
            r1 = 0
        L_0x0230:
            r21 = 1
            r8 = r8[r21]
            r23 = r7
            r27 = r9
            if (r8 == r6) goto L_0x023c
            r7 = 1
            goto L_0x023d
        L_0x023c:
            r7 = 0
        L_0x023d:
            int r9 = r15.f42735g0
            r15.f42690H = r9
            r30 = r10
            float r10 = r15.f42733f0
            r15.f42692I = r10
            r31 = r11
            int r11 = r15.f42766w
            r32 = r12
            int r12 = r15.f42768x
            r24 = 0
            int r24 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            r33 = r13
            if (r24 <= 0) goto L_0x02c3
            int r13 = r15.f42763u0
            r14 = 8
            if (r13 == r14) goto L_0x02c3
            if (r3 != r6) goto L_0x0262
            if (r11 != 0) goto L_0x0262
            r11 = 3
        L_0x0262:
            if (r8 != r6) goto L_0x0267
            if (r12 != 0) goto L_0x0267
            r12 = 3
        L_0x0267:
            if (r3 != r6) goto L_0x0274
            if (r8 != r6) goto L_0x0274
            r13 = 3
            if (r11 != r13) goto L_0x0275
            if (r12 != r13) goto L_0x0275
            r15.mo49553h2(r4, r5, r1, r7)
            goto L_0x02b9
        L_0x0274:
            r13 = 3
        L_0x0275:
            r1 = 4
            if (r3 != r6) goto L_0x0291
            if (r11 != r13) goto L_0x0291
            r7 = 0
            r15.f42690H = r7
            float r0 = (float) r2
            float r10 = r10 * r0
            int r0 = (int) r10
            if (r8 == r6) goto L_0x028b
            r36 = r1
            r35 = r12
            r34 = r23
            r14 = 0
            r1 = r0
            goto L_0x02cc
        L_0x028b:
            r1 = r0
            r36 = r11
            r35 = r12
            goto L_0x02bf
        L_0x0291:
            if (r8 != r6) goto L_0x02b9
            if (r12 != r13) goto L_0x02b9
            r2 = 1
            r15.f42690H = r2
            r2 = -1
            if (r9 != r2) goto L_0x02a0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r10
            r15.f42692I = r2
        L_0x02a0:
            float r2 = r15.f42692I
            float r0 = (float) r0
            float r2 = r2 * r0
            int r7 = (int) r2
            if (r3 == r6) goto L_0x02b0
            r35 = r1
            r34 = r7
            r36 = r11
            r1 = r22
            goto L_0x02cb
        L_0x02b0:
            r34 = r7
            r36 = r11
            r35 = r12
            r1 = r22
            goto L_0x02c1
        L_0x02b9:
            r36 = r11
            r35 = r12
            r1 = r22
        L_0x02bf:
            r34 = r23
        L_0x02c1:
            r14 = 1
            goto L_0x02cc
        L_0x02c3:
            r36 = r11
            r35 = r12
            r1 = r22
            r34 = r23
        L_0x02cb:
            r14 = 0
        L_0x02cc:
            int[] r0 = r15.f42770y
            r2 = 0
            r0[r2] = r36
            r2 = 1
            r0[r2] = r35
            r15.f42736h = r14
            if (r14 == 0) goto L_0x02e2
            int r0 = r15.f42690H
            r2 = -1
            if (r0 == 0) goto L_0x02df
            if (r0 != r2) goto L_0x02e3
        L_0x02df:
            r20 = 1
            goto L_0x02e5
        L_0x02e2:
            r2 = -1
        L_0x02e3:
            r20 = 0
        L_0x02e5:
            if (r14 == 0) goto L_0x02f1
            int r0 = r15.f42690H
            r3 = 1
            if (r0 == r3) goto L_0x02ee
            if (r0 != r2) goto L_0x02f1
        L_0x02ee:
            r37 = 1
            goto L_0x02f3
        L_0x02f1:
            r37 = 0
        L_0x02f3:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f42725b0
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x0302
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.C16798d
            if (r0 == 0) goto L_0x0302
            r9 = 1
            goto L_0x0303
        L_0x0302:
            r9 = 0
        L_0x0303:
            if (r9 == 0) goto L_0x0308
            r22 = 0
            goto L_0x030a
        L_0x0308:
            r22 = r1
        L_0x030a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42719X
            boolean r0 = r0.mo49435p()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.f42723a0
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f42760t
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0431
            boolean r0 = r15.f42752p
            if (r0 != 0) goto L_0x0431
            if (r55 == 0) goto L_0x0388
            androidx.constraintlayout.core.widgets.analyzer.k r0 = r15.f42730e
            if (r0 == 0) goto L_0x0388
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f42819h
            boolean r2 = r1.f42800j
            if (r2 == 0) goto L_0x0388
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42820i
            boolean r0 = r0.f42800j
            if (r0 != 0) goto L_0x0338
            goto L_0x0388
        L_0x0338:
            if (r55 == 0) goto L_0x0384
            int r0 = r1.f42797g
            r12 = r54
            r11 = r33
            r12.mo48712f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.k r0 = r15.f42730e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42820i
            int r0 = r0.f42797g
            r10 = r32
            r12.mo48712f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x036e
            if (r4 == 0) goto L_0x036e
            boolean[] r0 = r15.f42734g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x036e
            boolean r0 = r53.mo49451B0()
            if (r0 != 0) goto L_0x036e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42712S
            androidx.constraintlayout.core.SolverVariable r0 = r12.mo48727u(r0)
            r3 = 8
            r12.mo48715i(r0, r10, r1, r3)
        L_0x036e:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0445
        L_0x0384:
            r12 = r54
            goto L_0x0431
        L_0x0388:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x039c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42712S
            androidx.constraintlayout.core.SolverVariable r0 = r12.mo48727u(r0)
            r7 = r0
            goto L_0x039e
        L_0x039c:
            r7 = r40
        L_0x039e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x03ab
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42708Q
            androidx.constraintlayout.core.SolverVariable r0 = r12.mo48727u(r0)
            r16 = r0
            goto L_0x03ad
        L_0x03ab:
            r16 = r40
        L_0x03ad:
            boolean[] r0 = r15.f42734g
            r17 = 0
            boolean r18 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f42725b0
            r32 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.f42708Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f42712S
            r41 = r2
            int r2 = r15.f42737h0
            r42 = r2
            int r2 = r15.f42751o0
            int[] r3 = r15.f42694J
            r44 = r3[r17]
            float r3 = r15.f42755q0
            r21 = 1
            r0 = r0[r21]
            if (r0 != r6) goto L_0x03d2
            r45 = r21
            goto L_0x03d4
        L_0x03d2:
            r45 = r17
        L_0x03d4:
            int r0 = r15.f42772z
            r24 = r0
            int r0 = r15.f42676A
            r25 = r0
            float r0 = r15.f42678B
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r19 = r41
            r33 = r42
            r41 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r18
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r17 = r11
            r51 = r31
            r11 = r19
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r17
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r44
            r16 = r42
            r17 = r20
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.mo49554i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0445
        L_0x0431:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
        L_0x0445:
            if (r55 == 0) goto L_0x04ab
            r15 = r53
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r15.f42732f
            if (r0 == 0) goto L_0x049e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f42819h
            boolean r2 = r1.f42800j
            if (r2 == 0) goto L_0x049e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42820i
            boolean r0 = r0.f42800j
            if (r0 == 0) goto L_0x049e
            int r0 = r1.f42797g
            r14 = r54
            r13 = r51
            r14.mo48712f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r15.f42732f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42820i
            int r0 = r0.f42797g
            r12 = r50
            r14.mo48712f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r15.f42732f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f42886k
            int r0 = r0.f42797g
            r1 = r49
            r14.mo48712f(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x0498
            if (r28 != 0) goto L_0x0498
            if (r47 == 0) goto L_0x0498
            boolean[] r2 = r15.f42734g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0494
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42714T
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r2 = 8
            r10 = 0
            r14.mo48715i(r0, r12, r10, r2)
            goto L_0x049c
        L_0x0494:
            r2 = 8
            r10 = 0
            goto L_0x049c
        L_0x0498:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x049c:
            r7 = r10
            goto L_0x04ba
        L_0x049e:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x04b9
        L_0x04ab:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x04b9:
            r7 = r11
        L_0x04ba:
            int r0 = r15.f42762u
            r3 = 2
            if (r0 != r3) goto L_0x04c1
            r6 = r10
            goto L_0x04c2
        L_0x04c1:
            r6 = r7
        L_0x04c2:
            if (r6 == 0) goto L_0x05a2
            boolean r0 = r15.f42754q
            if (r0 != 0) goto L_0x05a2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f42725b0
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04d6
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.C16798d
            if (r0 == 0) goto L_0x04d6
            r9 = r11
            goto L_0x04d7
        L_0x04d6:
            r9 = r10
        L_0x04d7:
            if (r9 == 0) goto L_0x04db
            r34 = r10
        L_0x04db:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x04e7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42714T
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r7 = r0
            goto L_0x04e9
        L_0x04e7:
            r7 = r40
        L_0x04e9:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f42727c0
            if (r0 == 0) goto L_0x04f5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42710R
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r6 = r0
            goto L_0x04f7
        L_0x04f5:
            r6 = r40
        L_0x04f7:
            int r0 = r15.f42749n0
            if (r0 > 0) goto L_0x04ff
            int r0 = r15.f42763u0
            if (r0 != r2) goto L_0x053f
        L_0x04ff:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42716U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f42629f
            if (r3 == 0) goto L_0x052c
            int r0 = r53.mo49589t()
            r14.mo48711e(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42716U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42629f
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f42716U
            int r3 = r3.mo49426g()
            r14.mo48711e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x0529
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f42714T
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo48727u(r0)
            r1 = 5
            r14.mo48715i(r7, r0, r10, r1)
        L_0x0529:
            r27 = r10
            goto L_0x0541
        L_0x052c:
            int r3 = r15.f42763u0
            if (r3 != r2) goto L_0x0538
            int r0 = r0.mo49426g()
            r14.mo48711e(r1, r13, r0, r2)
            goto L_0x053f
        L_0x0538:
            int r0 = r53.mo49589t()
            r14.mo48711e(r1, r13, r0, r2)
        L_0x053f:
            r27 = r38
        L_0x0541:
            boolean[] r0 = r15.f42734g
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f42725b0
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f42714T
            int r1 = r15.f42739i0
            int r2 = r15.f42753p0
            int[] r10 = r15.f42694J
            r16 = r10[r11]
            float r10 = r15.f42757r0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0562
            r18 = 1
            goto L_0x0564
        L_0x0562:
            r18 = r17
        L_0x0564:
            int r0 = r15.f42680C
            r24 = r0
            int r0 = r15.f42682D
            r25 = r0
            float r0 = r15.f42684E
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r19
            r38 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.mo49554i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05a6
        L_0x05a2:
            r33 = r12
            r38 = r13
        L_0x05a6:
            if (r32 == 0) goto L_0x05d3
            r6 = 8
            r7 = r53
            int r0 = r7.f42690H
            r1 = 1
            if (r0 != r1) goto L_0x05c1
            float r5 = r7.f42692I
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
            r0.mo48718l(r1, r2, r3, r4, r5, r6)
            goto L_0x05d5
        L_0x05c1:
            float r5 = r7.f42692I
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
            r0.mo48718l(r1, r2, r3, r4, r5, r6)
            goto L_0x05d5
        L_0x05d3:
            r7 = r53
        L_0x05d5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.f42719X
            boolean r0 = r0.mo49435p()
            if (r0 == 0) goto L_0x05fd
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.f42719X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mo49430k()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mo49428i()
            float r1 = r7.f42696K
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.f42719X
            int r2 = r2.mo49426g()
            r3 = r54
            r3.mo48708b(r7, r0, r1, r2)
        L_0x05fd:
            r0 = 0
            r7.f42752p = r0
            r7.f42754q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo49546g(androidx.constraintlayout.core.e, boolean):void");
    }

    /* renamed from: g0 */
    public float mo49547g0() {
        return this.f42757r0;
    }

    /* renamed from: g1 */
    public void mo49548g1(int i) {
        boolean z;
        this.f42749n0 = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f42698L = z;
    }

    /* renamed from: g2 */
    public void mo49549g2(int i) {
        this.f42739i0 = i;
    }

    /* renamed from: h */
    public boolean mo49550h() {
        return this.f42763u0 != 8;
    }

    /* renamed from: h0 */
    public ConstraintWidget mo49551h0() {
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor2;
        if (!mo49457D0()) {
            return null;
        }
        ConstraintWidget constraintWidget2 = this;
        ConstraintWidget constraintWidget3 = null;
        while (constraintWidget3 == null && constraintWidget2 != null) {
            ConstraintAnchor r = constraintWidget2.mo49583r(ConstraintAnchor.Type.f42635c);
            if (r == null) {
                constraintAnchor = null;
            } else {
                constraintAnchor = r.mo49430k();
            }
            if (constraintAnchor == null) {
                constraintWidget = null;
            } else {
                constraintWidget = constraintAnchor.mo49428i();
            }
            if (constraintWidget == mo49507U()) {
                return constraintWidget2;
            }
            if (constraintWidget == null) {
                constraintAnchor2 = null;
            } else {
                constraintAnchor2 = constraintWidget.mo49583r(ConstraintAnchor.Type.BOTTOM).mo49430k();
            }
            if (constraintAnchor2 == null || constraintAnchor2.mo49428i() == constraintWidget2) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget3 = constraintWidget2;
            }
        }
        return constraintWidget3;
    }

    /* renamed from: h1 */
    public void mo49552h1(Object obj) {
        this.f42759s0 = obj;
    }

    /* renamed from: h2 */
    public void mo49553h2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f42690H == -1) {
            if (z3 && !z4) {
                this.f42690H = 0;
            } else if (!z3 && z4) {
                this.f42690H = 1;
                if (this.f42735g0 == -1) {
                    this.f42692I = 1.0f / this.f42692I;
                }
            }
        }
        if (this.f42690H == 0 && (!this.f42710R.mo49435p() || !this.f42714T.mo49435p())) {
            this.f42690H = 1;
        } else if (this.f42690H == 1 && (!this.f42708Q.mo49435p() || !this.f42712S.mo49435p())) {
            this.f42690H = 0;
        }
        if (this.f42690H == -1 && (!this.f42710R.mo49435p() || !this.f42714T.mo49435p() || !this.f42708Q.mo49435p() || !this.f42712S.mo49435p())) {
            if (this.f42710R.mo49435p() && this.f42714T.mo49435p()) {
                this.f42690H = 0;
            } else if (this.f42708Q.mo49435p() && this.f42712S.mo49435p()) {
                this.f42692I = 1.0f / this.f42692I;
                this.f42690H = 1;
            }
        }
        if (this.f42690H == -1) {
            int i = this.f42772z;
            if (i > 0 && this.f42680C == 0) {
                this.f42690H = 0;
            } else if (i == 0 && this.f42680C > 0) {
                this.f42692I = 1.0f / this.f42692I;
                this.f42690H = 1;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x041a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x045d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x04df A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:371:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49554i(androidx.constraintlayout.core.C16643e r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.SolverVariable r38, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, androidx.constraintlayout.core.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r54
            r3 = r55
            r4 = r56
            androidx.constraintlayout.core.SolverVariable r9 = r10.mo48727u(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.mo48727u(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r41.mo49430k()
            androidx.constraintlayout.core.SolverVariable r7 = r10.mo48727u(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r42.mo49430k()
            androidx.constraintlayout.core.SolverVariable r6 = r10.mo48727u(r5)
            androidx.constraintlayout.core.f r5 = androidx.constraintlayout.core.C16643e.m75761L()
            if (r5 == 0) goto L_0x0040
            androidx.constraintlayout.core.f r5 = androidx.constraintlayout.core.C16643e.m75761L()
            long r11 = r5.f41446H
            r16 = 1
            long r11 = r11 + r16
            r5.f41446H = r11
        L_0x0040:
            boolean r11 = r41.mo49435p()
            boolean r12 = r42.mo49435p()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.f42719X
            boolean r16 = r5.mo49435p()
            if (r12 == 0) goto L_0x0053
            int r5 = r11 + 1
            goto L_0x0054
        L_0x0053:
            r5 = r11
        L_0x0054:
            if (r16 == 0) goto L_0x0058
            int r5 = r5 + 1
        L_0x0058:
            if (r48 == 0) goto L_0x005d
            r18 = 3
            goto L_0x005f
        L_0x005d:
            r18 = r53
        L_0x005f:
            int[] r17 = androidx.constraintlayout.core.widgets.ConstraintWidget.C16774a.f42780b
            int r19 = r39.ordinal()
            r2 = r17[r19]
            r14 = 1
            if (r2 == r14) goto L_0x0073
            r14 = 2
            if (r2 == r14) goto L_0x0073
            r14 = 3
            if (r2 == r14) goto L_0x0073
            r14 = 4
            if (r2 == r14) goto L_0x0078
        L_0x0073:
            r2 = r18
        L_0x0075:
            r18 = 0
            goto L_0x007e
        L_0x0078:
            r2 = r18
            if (r2 == r14) goto L_0x0075
            r18 = 1
        L_0x007e:
            int r14 = r0.f42744l
            r13 = -1
            if (r14 == r13) goto L_0x008c
            if (r33 == 0) goto L_0x008c
            r0.f42744l = r13
            r21 = r6
            r18 = 0
            goto L_0x0090
        L_0x008c:
            r14 = r44
            r21 = r6
        L_0x0090:
            int r6 = r0.f42746m
            if (r6 == r13) goto L_0x009b
            if (r33 != 0) goto L_0x009b
            r0.f42746m = r13
            r14 = r6
            r18 = 0
        L_0x009b:
            int r6 = r0.f42763u0
            r13 = 8
            if (r6 != r13) goto L_0x00a4
            r14 = 0
            r18 = 0
        L_0x00a4:
            if (r58 == 0) goto L_0x00bd
            if (r11 != 0) goto L_0x00b2
            if (r12 != 0) goto L_0x00b2
            if (r16 != 0) goto L_0x00b2
            r6 = r43
            r10.mo48712f(r9, r6)
            goto L_0x00bd
        L_0x00b2:
            if (r11 == 0) goto L_0x00bd
            if (r12 != 0) goto L_0x00bd
            int r6 = r41.mo49426g()
            r10.mo48711e(r9, r7, r6, r13)
        L_0x00bd:
            if (r18 != 0) goto L_0x00ea
            if (r40 == 0) goto L_0x00d6
            r6 = 3
            r13 = 0
            r10.mo48711e(r8, r9, r13, r6)
            r6 = 8
            if (r15 <= 0) goto L_0x00cd
            r10.mo48715i(r8, r9, r15, r6)
        L_0x00cd:
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r14) goto L_0x00db
            r10.mo48717k(r8, r9, r1, r6)
            goto L_0x00db
        L_0x00d6:
            r6 = r13
            r13 = 0
            r10.mo48711e(r8, r9, r14, r6)
        L_0x00db:
            r1 = r4
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
            r21 = r3
            goto L_0x01ec
        L_0x00ea:
            r1 = 2
            r13 = 0
            if (r5 == r1) goto L_0x0113
            if (r48 != 0) goto L_0x0113
            r1 = 1
            if (r2 == r1) goto L_0x00f5
            if (r2 != 0) goto L_0x0113
        L_0x00f5:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00ff
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00ff:
            r6 = 8
            r10.mo48711e(r8, r9, r1, r6)
            r18 = r36
            r1 = r4
            r40 = r5
            r15 = r8
            r23 = r13
            r14 = r21
            r21 = r3
            r13 = r7
            goto L_0x01ec
        L_0x0113:
            r1 = -2
            if (r3 != r1) goto L_0x0118
            r6 = r14
            goto L_0x0119
        L_0x0118:
            r6 = r3
        L_0x0119:
            if (r4 != r1) goto L_0x011d
            r1 = r14
            goto L_0x011e
        L_0x011d:
            r1 = r4
        L_0x011e:
            if (r14 <= 0) goto L_0x0124
            r3 = 1
            if (r2 == r3) goto L_0x0124
            r14 = r13
        L_0x0124:
            if (r6 <= 0) goto L_0x012f
            r3 = 8
            r10.mo48715i(r8, r9, r6, r3)
            int r14 = java.lang.Math.max(r14, r6)
        L_0x012f:
            if (r1 <= 0) goto L_0x0148
            if (r34 == 0) goto L_0x0138
            r3 = 1
            if (r2 != r3) goto L_0x0138
            r3 = r13
            goto L_0x0139
        L_0x0138:
            r3 = 1
        L_0x0139:
            if (r3 == 0) goto L_0x0141
            r3 = 8
            r10.mo48717k(r8, r9, r1, r3)
            goto L_0x0143
        L_0x0141:
            r3 = 8
        L_0x0143:
            int r14 = java.lang.Math.min(r14, r1)
            goto L_0x014a
        L_0x0148:
            r3 = 8
        L_0x014a:
            r4 = 1
            if (r2 != r4) goto L_0x0173
            if (r34 == 0) goto L_0x0154
            r10.mo48711e(r8, r9, r14, r3)
            r4 = 5
            goto L_0x0165
        L_0x0154:
            if (r50 == 0) goto L_0x015e
            r4 = 5
            r10.mo48711e(r8, r9, r14, r4)
            r10.mo48717k(r8, r9, r14, r3)
            goto L_0x0165
        L_0x015e:
            r4 = 5
            r10.mo48711e(r8, r9, r14, r4)
            r10.mo48717k(r8, r9, r14, r3)
        L_0x0165:
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
            r21 = r6
            goto L_0x01ec
        L_0x0173:
            r4 = 5
            r14 = 2
            if (r2 != r14) goto L_0x01e0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.mo49431l()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.f42635c
            if (r3 == r4) goto L_0x01a1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.mo49431l()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r13) goto L_0x0188
            goto L_0x01a1
        L_0x0188:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mo49583r(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.mo48727u(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mo49583r(r13)
            androidx.constraintlayout.core.SolverVariable r4 = r10.mo48727u(r4)
            goto L_0x01b7
        L_0x01a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mo49583r(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.mo48727u(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f42727c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mo49583r(r13)
            androidx.constraintlayout.core.SolverVariable r4 = r10.mo48727u(r4)
        L_0x01b7:
            r23 = r3
            r13 = r4
            androidx.constraintlayout.core.b r3 = r32.mo48728v()
            r24 = 5
            r4 = r8
            r14 = r5
            r5 = r9
            r40 = r14
            r14 = r21
            r21 = r6
            r6 = r13
            r13 = r7
            r7 = r23
            r15 = r8
            r8 = r57
            androidx.constraintlayout.core.b r3 = r3.mo48669n(r4, r5, r6, r7, r8)
            r10.mo48710d(r3)
            if (r34 == 0) goto L_0x01db
            r18 = 0
        L_0x01db:
            r23 = r18
            r18 = r36
            goto L_0x01ec
        L_0x01e0:
            r40 = r5
            r13 = r7
            r15 = r8
            r14 = r21
            r21 = r6
            r23 = r18
            r18 = 1
        L_0x01ec:
            if (r58 == 0) goto L_0x050f
            if (r50 == 0) goto L_0x01fc
            r1 = r37
            r4 = r38
            r5 = r40
            r2 = r15
            r3 = 0
            r6 = 2
            r15 = r9
            goto L_0x0519
        L_0x01fc:
            if (r11 != 0) goto L_0x0207
            if (r12 != 0) goto L_0x0207
            if (r16 != 0) goto L_0x0207
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x04da
        L_0x0207:
            if (r11 == 0) goto L_0x0223
            if (r12 != 0) goto L_0x0223
            r7 = r41
            r8 = 0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.f42629f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f42627d
            if (r34 == 0) goto L_0x021b
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r1 == 0) goto L_0x021b
            r13 = 8
            goto L_0x021c
        L_0x021b:
            r13 = 5
        L_0x021c:
            r22 = r34
            r3 = r8
            r6 = r13
            r2 = r15
            goto L_0x04dd
        L_0x0223:
            r7 = r41
            r8 = 0
            if (r11 != 0) goto L_0x025a
            if (r12 == 0) goto L_0x025a
            int r1 = r42.mo49426g()
            int r1 = -r1
            r2 = 8
            r10.mo48711e(r15, r14, r1, r2)
            if (r34 == 0) goto L_0x04d7
            boolean r1 = r0.f42740j
            if (r1 == 0) goto L_0x0250
            boolean r1 = r9.f41367g
            if (r1 == 0) goto L_0x0250
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f42727c0
            if (r1 == 0) goto L_0x0250
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.C16798d) r1
            if (r33 == 0) goto L_0x024b
            r1.mo49748u2(r7)
            goto L_0x04d7
        L_0x024b:
            r1.mo49753z2(r7)
            goto L_0x04d7
        L_0x0250:
            r6 = r37
            r1 = 5
            r10.mo48715i(r9, r6, r8, r1)
            r3 = r8
            r2 = r15
            goto L_0x04da
        L_0x025a:
            r6 = r37
            if (r11 == 0) goto L_0x04d7
            if (r12 == 0) goto L_0x04d7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r7.f42629f
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.f42627d
            r12 = r42
            r3 = 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r12.f42629f
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.f42627d
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r31.mo49507U()
            r16 = 6
            if (r23 == 0) goto L_0x0366
            if (r2 != 0) goto L_0x02c9
            if (r1 != 0) goto L_0x029e
            if (r21 != 0) goto L_0x029e
            boolean r1 = r13.f41367g
            if (r1 == 0) goto L_0x0293
            boolean r1 = r14.f41367g
            if (r1 == 0) goto L_0x0293
            int r1 = r41.mo49426g()
            r2 = 8
            r10.mo48711e(r9, r13, r1, r2)
            int r1 = r42.mo49426g()
            int r1 = -r1
            r10.mo48711e(r15, r14, r1, r2)
            return
        L_0x0293:
            r19 = r8
            r24 = r19
            r1 = 8
            r3 = 8
            r22 = 1
            goto L_0x02a6
        L_0x029e:
            r22 = r8
            r1 = 5
            r3 = 5
            r19 = 1
            r24 = 1
        L_0x02a6:
            boolean r8 = r11 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r8 != 0) goto L_0x02bc
            boolean r8 = r5 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r8 == 0) goto L_0x02af
            goto L_0x02bc
        L_0x02af:
            r8 = r38
            r25 = r22
            r22 = r19
            r19 = r3
        L_0x02b7:
            r3 = r1
            r1 = r16
            goto L_0x03b1
        L_0x02bc:
            r8 = r38
            r3 = r1
            r1 = r16
            r25 = r22
            r22 = r19
            r19 = 4
            goto L_0x03b1
        L_0x02c9:
            if (r2 != r3) goto L_0x02e1
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r1 != 0) goto L_0x02dd
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r1 == 0) goto L_0x02d4
            goto L_0x02dd
        L_0x02d4:
            r8 = r38
            r1 = r16
            r3 = 5
            r19 = 5
            goto L_0x03ab
        L_0x02dd:
            r8 = r38
            goto L_0x03a6
        L_0x02e1:
            r8 = 1
            if (r2 != r8) goto L_0x02ec
            r8 = r38
            r1 = r16
            r3 = 8
            goto L_0x03a9
        L_0x02ec:
            r8 = 3
            if (r2 != r8) goto L_0x035a
            int r8 = r0.f42690H
            r3 = -1
            if (r8 != r3) goto L_0x030e
            if (r51 == 0) goto L_0x02fe
            r8 = r38
            if (r34 == 0) goto L_0x02fc
            r1 = 5
            goto L_0x0302
        L_0x02fc:
            r1 = 4
            goto L_0x0302
        L_0x02fe:
            r8 = r38
            r1 = 8
        L_0x0302:
            r3 = 8
        L_0x0304:
            r19 = 5
        L_0x0306:
            r22 = 1
            r24 = 1
            r25 = 1
            goto L_0x03b1
        L_0x030e:
            if (r48 == 0) goto L_0x032f
            r3 = r54
            r8 = 2
            if (r3 == r8) goto L_0x031b
            r1 = 1
            if (r3 != r1) goto L_0x0319
            goto L_0x031b
        L_0x0319:
            r1 = 0
            goto L_0x031c
        L_0x031b:
            r1 = 1
        L_0x031c:
            if (r1 != 0) goto L_0x0322
            r1 = 8
            r3 = 5
            goto L_0x0324
        L_0x0322:
            r1 = 5
            r3 = 4
        L_0x0324:
            r8 = r38
            r19 = r3
            r22 = 1
            r24 = 1
            r25 = 1
            goto L_0x02b7
        L_0x032f:
            if (r1 <= 0) goto L_0x0337
            r8 = r38
            r1 = r16
            r3 = 5
            goto L_0x0304
        L_0x0337:
            if (r1 != 0) goto L_0x0352
            if (r21 != 0) goto L_0x0352
            if (r51 != 0) goto L_0x0345
            r8 = r38
            r1 = r16
            r3 = 5
            r19 = 8
            goto L_0x0306
        L_0x0345:
            if (r11 == r4) goto L_0x034b
            if (r5 == r4) goto L_0x034b
            r1 = 4
            goto L_0x034c
        L_0x034b:
            r1 = 5
        L_0x034c:
            r8 = r38
            r3 = r1
            r1 = r16
            goto L_0x0357
        L_0x0352:
            r8 = r38
            r1 = r16
            r3 = 5
        L_0x0357:
            r19 = 4
            goto L_0x0306
        L_0x035a:
            r8 = r38
            r1 = r16
            r3 = 5
            r19 = 4
            r22 = 0
            r24 = 0
            goto L_0x03af
        L_0x0366:
            boolean r1 = r13.f41367g
            if (r1 == 0) goto L_0x02dd
            boolean r1 = r14.f41367g
            if (r1 == 0) goto L_0x02dd
            int r1 = r41.mo49426g()
            int r2 = r42.mo49426g()
            r3 = 8
            r48 = r32
            r49 = r9
            r50 = r13
            r51 = r1
            r52 = r47
            r53 = r14
            r54 = r15
            r55 = r2
            r56 = r3
            r48.mo48709c(r49, r50, r51, r52, r53, r54, r55, r56)
            if (r34 == 0) goto L_0x03a5
            if (r18 == 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.f42629f
            if (r1 == 0) goto L_0x039c
            int r13 = r42.mo49426g()
            r8 = r38
            goto L_0x039f
        L_0x039c:
            r8 = r38
            r13 = 0
        L_0x039f:
            if (r14 == r8) goto L_0x03a5
            r1 = 5
            r10.mo48715i(r8, r15, r13, r1)
        L_0x03a5:
            return
        L_0x03a6:
            r1 = r16
            r3 = 5
        L_0x03a9:
            r19 = 4
        L_0x03ab:
            r22 = 1
            r24 = 1
        L_0x03af:
            r25 = 0
        L_0x03b1:
            if (r24 == 0) goto L_0x03bc
            if (r13 != r14) goto L_0x03bc
            if (r11 == r4) goto L_0x03bc
            r24 = 0
            r26 = 0
            goto L_0x03be
        L_0x03bc:
            r26 = 1
        L_0x03be:
            if (r22 == 0) goto L_0x0404
            if (r23 != 0) goto L_0x03d3
            if (r49 != 0) goto L_0x03d3
            if (r51 != 0) goto L_0x03d3
            if (r13 != r6) goto L_0x03d3
            if (r14 != r8) goto L_0x03d3
            r22 = 0
            r26 = 8
            r27 = 8
            r28 = 0
            goto L_0x03db
        L_0x03d3:
            r22 = r34
            r27 = r1
            r28 = r26
            r26 = r3
        L_0x03db:
            int r29 = r41.mo49426g()
            int r30 = r42.mo49426g()
            r1 = r32
            r3 = r2
            r2 = r9
            r12 = r3
            r3 = r13
            r39 = r12
            r12 = r4
            r4 = r29
            r29 = r12
            r12 = r5
            r5 = r47
            r6 = r14
            r7 = r15
            r8 = r30
            r20 = r15
            r15 = r9
            r9 = r27
            r1.mo48709c(r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r26
            r26 = r28
            goto L_0x040e
        L_0x0404:
            r39 = r2
            r29 = r4
            r12 = r5
            r20 = r15
            r15 = r9
            r22 = r34
        L_0x040e:
            int r1 = r0.f42763u0
            r2 = 8
            if (r1 != r2) goto L_0x041b
            boolean r1 = r42.mo49433n()
            if (r1 != 0) goto L_0x041b
            return
        L_0x041b:
            if (r24 == 0) goto L_0x043f
            if (r22 == 0) goto L_0x042d
            if (r13 == r14) goto L_0x042d
            if (r23 != 0) goto L_0x042d
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r1 != 0) goto L_0x042b
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r1 == 0) goto L_0x042d
        L_0x042b:
            r3 = r16
        L_0x042d:
            int r1 = r41.mo49426g()
            r10.mo48715i(r15, r13, r1, r3)
            int r1 = r42.mo49426g()
            int r1 = -r1
            r2 = r20
            r10.mo48717k(r2, r14, r1, r3)
            goto L_0x0441
        L_0x043f:
            r2 = r20
        L_0x0441:
            if (r22 == 0) goto L_0x0457
            if (r52 == 0) goto L_0x0457
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r1 != 0) goto L_0x0457
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r1 != 0) goto L_0x0457
            r1 = r29
            if (r12 == r1) goto L_0x0459
            r3 = r16
            r4 = r3
            r26 = 1
            goto L_0x045b
        L_0x0457:
            r1 = r29
        L_0x0459:
            r4 = r19
        L_0x045b:
            if (r26 == 0) goto L_0x04a5
            if (r25 == 0) goto L_0x0485
            if (r51 == 0) goto L_0x0463
            if (r35 == 0) goto L_0x0485
        L_0x0463:
            if (r11 == r1) goto L_0x046a
            if (r12 != r1) goto L_0x0468
            goto L_0x046a
        L_0x0468:
            r6 = r4
            goto L_0x046c
        L_0x046a:
            r6 = r16
        L_0x046c:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.C16801f
            if (r5 != 0) goto L_0x0474
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.C16801f
            if (r5 == 0) goto L_0x0475
        L_0x0474:
            r6 = 5
        L_0x0475:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r5 != 0) goto L_0x047d
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r5 == 0) goto L_0x047e
        L_0x047d:
            r6 = 5
        L_0x047e:
            if (r51 == 0) goto L_0x0481
            r6 = 5
        L_0x0481:
            int r4 = java.lang.Math.max(r6, r4)
        L_0x0485:
            if (r22 == 0) goto L_0x0496
            int r3 = java.lang.Math.min(r3, r4)
            if (r48 == 0) goto L_0x0495
            if (r51 != 0) goto L_0x0495
            if (r11 == r1) goto L_0x0493
            if (r12 != r1) goto L_0x0495
        L_0x0493:
            r4 = 4
            goto L_0x0496
        L_0x0495:
            r4 = r3
        L_0x0496:
            int r1 = r41.mo49426g()
            r10.mo48711e(r15, r13, r1, r4)
            int r1 = r42.mo49426g()
            int r1 = -r1
            r10.mo48711e(r2, r14, r1, r4)
        L_0x04a5:
            if (r22 == 0) goto L_0x04b7
            r1 = r37
            if (r1 != r13) goto L_0x04b0
            int r3 = r41.mo49426g()
            goto L_0x04b1
        L_0x04b0:
            r3 = 0
        L_0x04b1:
            if (r13 == r1) goto L_0x04b7
            r4 = 5
            r10.mo48715i(r15, r1, r3, r4)
        L_0x04b7:
            if (r22 == 0) goto L_0x04d4
            if (r23 == 0) goto L_0x04d4
            if (r45 != 0) goto L_0x04d4
            if (r21 != 0) goto L_0x04d4
            if (r23 == 0) goto L_0x04ce
            r1 = r39
            r3 = 3
            if (r1 != r3) goto L_0x04ce
            r1 = 8
            r3 = 0
            r10.mo48715i(r2, r15, r3, r1)
            r1 = 5
            goto L_0x04dc
        L_0x04ce:
            r3 = 0
            r1 = 5
            r10.mo48715i(r2, r15, r3, r1)
            goto L_0x04dc
        L_0x04d4:
            r1 = 5
            r3 = 0
            goto L_0x04dc
        L_0x04d7:
            r3 = r8
            r2 = r15
            r1 = 5
        L_0x04da:
            r22 = r34
        L_0x04dc:
            r6 = r1
        L_0x04dd:
            if (r22 == 0) goto L_0x050e
            if (r18 == 0) goto L_0x050e
            r1 = r42
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.f42629f
            if (r4 == 0) goto L_0x04ee
            int r13 = r42.mo49426g()
            r4 = r38
            goto L_0x04f1
        L_0x04ee:
            r4 = r38
            r13 = r3
        L_0x04f1:
            if (r14 == r4) goto L_0x050e
            boolean r3 = r0.f42740j
            if (r3 == 0) goto L_0x050b
            boolean r3 = r2.f41367g
            if (r3 == 0) goto L_0x050b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f42727c0
            if (r3 == 0) goto L_0x050b
            androidx.constraintlayout.core.widgets.d r3 = (androidx.constraintlayout.core.widgets.C16798d) r3
            if (r33 == 0) goto L_0x0507
            r3.mo49747t2(r1)
            goto L_0x050a
        L_0x0507:
            r3.mo49752y2(r1)
        L_0x050a:
            return
        L_0x050b:
            r10.mo48715i(r4, r2, r13, r6)
        L_0x050e:
            return
        L_0x050f:
            r1 = r37
            r4 = r38
            r2 = r15
            r3 = 0
            r15 = r9
            r5 = r40
            r6 = 2
        L_0x0519:
            if (r5 >= r6) goto L_0x055a
            if (r34 == 0) goto L_0x055a
            if (r18 == 0) goto L_0x055a
            r5 = 8
            r10.mo48715i(r15, r1, r3, r5)
            if (r33 != 0) goto L_0x052f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42716U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f42629f
            if (r1 != 0) goto L_0x052d
            goto L_0x052f
        L_0x052d:
            r13 = r3
            goto L_0x0530
        L_0x052f:
            r13 = 1
        L_0x0530:
            if (r33 != 0) goto L_0x0552
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42716U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f42629f
            if (r1 == 0) goto L_0x0552
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f42627d
            float r5 = r1.f42733f0
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0550
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.f42725b0
            r5 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0550
            r5 = 1
            r1 = r1[r5]
            if (r1 != r6) goto L_0x0550
            r14 = r5
            goto L_0x0553
        L_0x0550:
            r14 = r3
            goto L_0x0553
        L_0x0552:
            r14 = r13
        L_0x0553:
            if (r14 == 0) goto L_0x055a
            r1 = 8
            r10.mo48715i(r4, r2, r3, r1)
        L_0x055a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo49554i(androidx.constraintlayout.core.e, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: i0 */
    public int mo49555i0() {
        return this.f42697K0;
    }

    /* renamed from: i1 */
    public void mo49556i1(int i) {
        if (i >= 0) {
            this.f42761t0 = i;
        } else {
            this.f42761t0 = 0;
        }
    }

    /* renamed from: i2 */
    public void mo49557i2(boolean z, boolean z2) {
        int i;
        int i2;
        boolean m = z & this.f42730e.mo49638m();
        boolean m2 = z2 & this.f42732f.mo49638m();
        C16789k kVar = this.f42730e;
        int i3 = kVar.f42819h.f42797g;
        C16792m mVar = this.f42732f;
        int i4 = mVar.f42819h.f42797g;
        int i5 = kVar.f42820i.f42797g;
        int i6 = mVar.f42820i.f42797g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (m) {
            this.f42737h0 = i3;
        }
        if (m2) {
            this.f42739i0 = i4;
        }
        if (this.f42763u0 == 8) {
            this.f42729d0 = 0;
            this.f42731e0 = 0;
            return;
        }
        if (m) {
            if (this.f42725b0[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f42729d0)) {
                i8 = i2;
            }
            this.f42729d0 = i8;
            int i10 = this.f42751o0;
            if (i8 < i10) {
                this.f42729d0 = i10;
            }
        }
        if (m2) {
            if (this.f42725b0[1] == DimensionBehaviour.FIXED && i9 < (i = this.f42731e0)) {
                i9 = i;
            }
            this.f42731e0 = i9;
            int i11 = this.f42753p0;
            if (i9 < i11) {
                this.f42731e0 = i11;
            }
        }
    }

    /* renamed from: j */
    public void mo49558j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        mo49562k(type, constraintWidget, type2, 0);
    }

    /* renamed from: j0 */
    public DimensionBehaviour mo49559j0() {
        return this.f42725b0[1];
    }

    /* renamed from: j1 */
    public void mo49560j1(String str) {
        this.f42767w0 = str;
    }

    /* renamed from: j2 */
    public void mo49561j2(C16643e eVar, boolean z) {
        C16792m mVar;
        C16789k kVar;
        int O = eVar.mo48696O(this.f42708Q);
        int O2 = eVar.mo48696O(this.f42710R);
        int O3 = eVar.mo48696O(this.f42712S);
        int O4 = eVar.mo48696O(this.f42714T);
        if (z && (kVar = this.f42730e) != null) {
            DependencyNode dependencyNode = kVar.f42819h;
            if (dependencyNode.f42800j) {
                DependencyNode dependencyNode2 = kVar.f42820i;
                if (dependencyNode2.f42800j) {
                    O = dependencyNode.f42797g;
                    O3 = dependencyNode2.f42797g;
                }
            }
        }
        if (z && (mVar = this.f42732f) != null) {
            DependencyNode dependencyNode3 = mVar.f42819h;
            if (dependencyNode3.f42800j) {
                DependencyNode dependencyNode4 = mVar.f42820i;
                if (dependencyNode4.f42800j) {
                    O2 = dependencyNode3.f42797g;
                    O4 = dependencyNode4.f42797g;
                }
            }
        }
        int i = O4 - O2;
        if (O3 - O < 0 || i < 0 || O == Integer.MIN_VALUE || O == Integer.MAX_VALUE || O2 == Integer.MIN_VALUE || O2 == Integer.MAX_VALUE || O3 == Integer.MIN_VALUE || O3 == Integer.MAX_VALUE || O4 == Integer.MIN_VALUE || O4 == Integer.MAX_VALUE) {
            O = 0;
            O4 = 0;
            O2 = 0;
            O3 = 0;
        }
        mo49598v1(O, O2, O3, O4);
    }

    /* renamed from: k */
    public void mo49562k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type != type5) {
            ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER_X;
            if (type == type6 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor r = mo49583r(type4);
                ConstraintAnchor r2 = constraintWidget.mo49583r(type2);
                ConstraintAnchor r3 = mo49583r(ConstraintAnchor.Type.RIGHT);
                r.mo49420a(r2, 0);
                r3.mo49420a(r2, 0);
                mo49583r(type6).mo49420a(r2, 0);
                return;
            }
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.CENTER_Y;
            if (type == type7 && (type2 == (type3 = ConstraintAnchor.Type.f42635c) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                ConstraintAnchor r4 = constraintWidget.mo49583r(type2);
                mo49583r(type3).mo49420a(r4, 0);
                mo49583r(ConstraintAnchor.Type.BOTTOM).mo49420a(r4, 0);
                mo49583r(type7).mo49420a(r4, 0);
            } else if (type == type6 && type2 == type6) {
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                mo49583r(type8).mo49420a(constraintWidget.mo49583r(type8), 0);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
                mo49583r(type9).mo49420a(constraintWidget.mo49583r(type9), 0);
                mo49583r(type6).mo49420a(constraintWidget.mo49583r(type2), 0);
            } else if (type == type7 && type2 == type7) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.f42635c;
                mo49583r(type10).mo49420a(constraintWidget.mo49583r(type10), 0);
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
                mo49583r(type11).mo49420a(constraintWidget.mo49583r(type11), 0);
                mo49583r(type7).mo49420a(constraintWidget.mo49583r(type2), 0);
            } else {
                ConstraintAnchor r5 = mo49583r(type);
                ConstraintAnchor r6 = constraintWidget.mo49583r(type2);
                if (r5.mo49442v(r6)) {
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BASELINE;
                    if (type == type12) {
                        ConstraintAnchor r7 = mo49583r(ConstraintAnchor.Type.f42635c);
                        ConstraintAnchor r8 = mo49583r(ConstraintAnchor.Type.BOTTOM);
                        if (r7 != null) {
                            r7.mo49444x();
                        }
                        if (r8 != null) {
                            r8.mo49444x();
                        }
                    } else if (type == ConstraintAnchor.Type.f42635c || type == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor r9 = mo49583r(type12);
                        if (r9 != null) {
                            r9.mo49444x();
                        }
                        ConstraintAnchor r10 = mo49583r(type5);
                        if (r10.mo49430k() != r6) {
                            r10.mo49444x();
                        }
                        ConstraintAnchor h = mo49583r(type).mo49427h();
                        ConstraintAnchor r11 = mo49583r(type7);
                        if (r11.mo49435p()) {
                            h.mo49444x();
                            r11.mo49444x();
                        }
                    } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor r12 = mo49583r(type5);
                        if (r12.mo49430k() != r6) {
                            r12.mo49444x();
                        }
                        ConstraintAnchor h2 = mo49583r(type).mo49427h();
                        ConstraintAnchor r13 = mo49583r(type6);
                        if (r13.mo49435p()) {
                            h2.mo49444x();
                            r13.mo49444x();
                        }
                    }
                    r5.mo49420a(r6, i);
                }
            }
        } else if (type2 == type5) {
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor r14 = mo49583r(type13);
            ConstraintAnchor.Type type14 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor r15 = mo49583r(type14);
            ConstraintAnchor.Type type15 = ConstraintAnchor.Type.f42635c;
            ConstraintAnchor r16 = mo49583r(type15);
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor r17 = mo49583r(type16);
            boolean z2 = true;
            if ((r14 == null || !r14.mo49435p()) && (r15 == null || !r15.mo49435p())) {
                mo49562k(type13, constraintWidget, type13, 0);
                mo49562k(type14, constraintWidget, type14, 0);
                z = true;
            } else {
                z = false;
            }
            if ((r16 == null || !r16.mo49435p()) && (r17 == null || !r17.mo49435p())) {
                mo49562k(type15, constraintWidget, type15, 0);
                mo49562k(type16, constraintWidget, type16, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo49583r(type5).mo49420a(constraintWidget.mo49583r(type5), 0);
            } else if (z) {
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.CENTER_X;
                mo49583r(type17).mo49420a(constraintWidget.mo49583r(type17), 0);
            } else if (z2) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.CENTER_Y;
                mo49583r(type18).mo49420a(constraintWidget.mo49583r(type18), 0);
            }
        } else {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.LEFT;
            if (type2 == type19 || type2 == ConstraintAnchor.Type.RIGHT) {
                mo49562k(type19, constraintWidget, type2, 0);
                mo49562k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                mo49583r(type5).mo49420a(constraintWidget.mo49583r(type2), 0);
                return;
            }
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.f42635c;
            if (type2 == type20 || type2 == ConstraintAnchor.Type.BOTTOM) {
                mo49562k(type20, constraintWidget, type2, 0);
                mo49562k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                mo49583r(type5).mo49420a(constraintWidget.mo49583r(type2), 0);
            }
        }
    }

    /* renamed from: k0 */
    public int mo49563k0() {
        int i = 0;
        if (this.f42708Q != null) {
            i = 0 + this.f42710R.f42630g;
        }
        if (this.f42712S != null) {
            return i + this.f42714T.f42630g;
        }
        return i;
    }

    /* renamed from: k1 */
    public void mo49564k1(C16643e eVar, String str) {
        this.f42767w0 = str;
        SolverVariable u = eVar.mo48727u(this.f42708Q);
        SolverVariable u2 = eVar.mo48727u(this.f42710R);
        SolverVariable u3 = eVar.mo48727u(this.f42712S);
        SolverVariable u4 = eVar.mo48727u(this.f42714T);
        u.mo48612W(str + ".left");
        u2.mo48612W(str + ".top");
        u3.mo48612W(str + ".right");
        u4.mo48612W(str + ".bottom");
        SolverVariable u5 = eVar.mo48727u(this.f42716U);
        u5.mo48612W(str + ".baseline");
    }

    /* renamed from: l */
    public void mo49565l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.mo49428i() == this) {
            mo49562k(constraintAnchor.mo49431l(), constraintAnchor2.mo49428i(), constraintAnchor2.mo49431l(), i);
        }
    }

    /* renamed from: l0 */
    public int mo49566l0() {
        return this.f42763u0;
    }

    /* renamed from: l1 */
    public void mo49567l1(int i, int i2) {
        this.f42729d0 = i;
        int i3 = this.f42751o0;
        if (i < i3) {
            this.f42729d0 = i3;
        }
        this.f42731e0 = i2;
        int i4 = this.f42753p0;
        if (i2 < i4) {
            this.f42731e0 = i4;
        }
    }

    /* renamed from: m */
    public void mo49568m(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        mo49597v0(type, constraintWidget, type, i, 0);
        this.f42696K = f;
    }

    /* renamed from: m0 */
    public int mo49569m0() {
        if (this.f42763u0 == 8) {
            return 0;
        }
        return this.f42729d0;
    }

    /* renamed from: m1 */
    public void mo49570m1(float f, int i) {
        this.f42733f0 = f;
        this.f42735g0 = i;
    }

    /* renamed from: n */
    public void mo49571n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        this.f42760t = constraintWidget.f42760t;
        this.f42762u = constraintWidget.f42762u;
        this.f42766w = constraintWidget.f42766w;
        this.f42768x = constraintWidget.f42768x;
        int[] iArr = this.f42770y;
        int[] iArr2 = constraintWidget.f42770y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f42772z = constraintWidget.f42772z;
        this.f42676A = constraintWidget.f42676A;
        this.f42680C = constraintWidget.f42680C;
        this.f42682D = constraintWidget.f42682D;
        this.f42684E = constraintWidget.f42684E;
        this.f42686F = constraintWidget.f42686F;
        this.f42688G = constraintWidget.f42688G;
        this.f42690H = constraintWidget.f42690H;
        this.f42692I = constraintWidget.f42692I;
        int[] iArr3 = constraintWidget.f42694J;
        this.f42694J = Arrays.copyOf(iArr3, iArr3.length);
        this.f42696K = constraintWidget.f42696K;
        this.f42698L = constraintWidget.f42698L;
        this.f42700M = constraintWidget.f42700M;
        this.f42708Q.mo49444x();
        this.f42710R.mo49444x();
        this.f42712S.mo49444x();
        this.f42714T.mo49444x();
        this.f42716U.mo49444x();
        this.f42717V.mo49444x();
        this.f42718W.mo49444x();
        this.f42719X.mo49444x();
        this.f42725b0 = (DimensionBehaviour[]) Arrays.copyOf(this.f42725b0, 2);
        ConstraintWidget constraintWidget4 = null;
        if (this.f42727c0 == null) {
            constraintWidget2 = null;
        } else {
            constraintWidget2 = hashMap.get(constraintWidget.f42727c0);
        }
        this.f42727c0 = constraintWidget2;
        this.f42729d0 = constraintWidget.f42729d0;
        this.f42731e0 = constraintWidget.f42731e0;
        this.f42733f0 = constraintWidget.f42733f0;
        this.f42735g0 = constraintWidget.f42735g0;
        this.f42737h0 = constraintWidget.f42737h0;
        this.f42739i0 = constraintWidget.f42739i0;
        this.f42741j0 = constraintWidget.f42741j0;
        this.f42743k0 = constraintWidget.f42743k0;
        this.f42745l0 = constraintWidget.f42745l0;
        this.f42747m0 = constraintWidget.f42747m0;
        this.f42749n0 = constraintWidget.f42749n0;
        this.f42751o0 = constraintWidget.f42751o0;
        this.f42753p0 = constraintWidget.f42753p0;
        this.f42755q0 = constraintWidget.f42755q0;
        this.f42757r0 = constraintWidget.f42757r0;
        this.f42759s0 = constraintWidget.f42759s0;
        this.f42761t0 = constraintWidget.f42761t0;
        this.f42763u0 = constraintWidget.f42763u0;
        this.f42765v0 = constraintWidget.f42765v0;
        this.f42767w0 = constraintWidget.f42767w0;
        this.f42769x0 = constraintWidget.f42769x0;
        this.f42771y0 = constraintWidget.f42771y0;
        this.f42773z0 = constraintWidget.f42773z0;
        this.f42677A0 = constraintWidget.f42677A0;
        this.f42679B0 = constraintWidget.f42679B0;
        this.f42681C0 = constraintWidget.f42681C0;
        this.f42683D0 = constraintWidget.f42683D0;
        this.f42685E0 = constraintWidget.f42685E0;
        this.f42687F0 = constraintWidget.f42687F0;
        this.f42689G0 = constraintWidget.f42689G0;
        this.f42691H0 = constraintWidget.f42691H0;
        this.f42695J0 = constraintWidget.f42695J0;
        this.f42697K0 = constraintWidget.f42697K0;
        this.f42699L0 = constraintWidget.f42699L0;
        this.f42701M0 = constraintWidget.f42701M0;
        float[] fArr = this.f42703N0;
        float[] fArr2 = constraintWidget.f42703N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.f42705O0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.f42705O0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.f42707P0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.f42707P0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget5 = constraintWidget.f42709Q0;
        if (constraintWidget5 == null) {
            constraintWidget3 = null;
        } else {
            constraintWidget3 = hashMap.get(constraintWidget5);
        }
        this.f42709Q0 = constraintWidget3;
        ConstraintWidget constraintWidget6 = constraintWidget.f42711R0;
        if (constraintWidget6 != null) {
            constraintWidget4 = hashMap.get(constraintWidget6);
        }
        this.f42711R0 = constraintWidget4;
    }

    /* renamed from: n0 */
    public int mo49572n0() {
        return this.f42764v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49573n1(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0090
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x0090
        L_0x000b:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L_0x0039
            int r6 = r1 + -1
            if (r2 >= r6) goto L_0x0039
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r5
        L_0x0036:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L_0x0039:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L_0x0077
            int r1 = r1 - r4
            if (r2 >= r1) goto L_0x0077
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0086
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0086
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            if (r5 != r4) goto L_0x0071
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0071:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0077:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0086
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r9 = r0
        L_0x0087:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            r8.f42733f0 = r9
            r8.f42735g0 = r5
        L_0x008f:
            return
        L_0x0090:
            r8.f42733f0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo49573n1(java.lang.String):void");
    }

    /* renamed from: o */
    public void mo49574o(C16643e eVar) {
        eVar.mo48727u(this.f42708Q);
        eVar.mo48727u(this.f42710R);
        eVar.mo48727u(this.f42712S);
        eVar.mo48727u(this.f42714T);
        if (this.f42749n0 > 0) {
            eVar.mo48727u(this.f42716U);
        }
    }

    /* renamed from: o0 */
    public int mo49575o0() {
        ConstraintWidget constraintWidget = this.f42727c0;
        if (constraintWidget == null || !(constraintWidget instanceof C16798d)) {
            return this.f42737h0;
        }
        return ((C16798d) constraintWidget).f42941I1 + this.f42737h0;
    }

    /* renamed from: o1 */
    public void mo49576o1(int i) {
        if (this.f42698L) {
            int i2 = i - this.f42749n0;
            int i3 = this.f42731e0 + i2;
            this.f42739i0 = i2;
            this.f42710R.mo49417A(i2);
            this.f42714T.mo49417A(i3);
            this.f42716U.mo49417A(i);
            this.f42754q = true;
        }
    }

    /* renamed from: p */
    public void mo49577p() {
        this.f42738i = true;
    }

    /* renamed from: p0 */
    public int mo49578p0() {
        ConstraintWidget constraintWidget = this.f42727c0;
        if (constraintWidget == null || !(constraintWidget instanceof C16798d)) {
            return this.f42739i0;
        }
        return ((C16798d) constraintWidget).f42942J1 + this.f42739i0;
    }

    /* renamed from: p1 */
    public void mo49579p1(int i, int i2, int i3, int i4, int i5, int i6) {
        mo49598v1(i, i2, i3, i4);
        mo49548g1(i5);
        if (i6 == 0) {
            this.f42752p = true;
            this.f42754q = false;
        } else if (i6 == 1) {
            this.f42752p = false;
            this.f42754q = true;
        } else if (i6 == 2) {
            this.f42752p = true;
            this.f42754q = true;
        } else {
            this.f42752p = false;
            this.f42754q = false;
        }
    }

    /* renamed from: q */
    public void mo49580q() {
        if (this.f42730e == null) {
            this.f42730e = new C16789k(this);
        }
        if (this.f42732f == null) {
            this.f42732f = new C16792m(this);
        }
    }

    /* renamed from: q0 */
    public boolean mo49581q0() {
        return this.f42698L;
    }

    /* renamed from: q1 */
    public void mo49582q1(int i, int i2) {
        if (!this.f42752p) {
            this.f42708Q.mo49417A(i);
            this.f42712S.mo49417A(i2);
            this.f42737h0 = i;
            this.f42729d0 = i2 - i;
            this.f42752p = true;
        }
    }

    /* renamed from: r */
    public ConstraintAnchor mo49583r(ConstraintAnchor.Type type) {
        switch (C16774a.f42779a[type.ordinal()]) {
            case 1:
                return this.f42708Q;
            case 2:
                return this.f42710R;
            case 3:
                return this.f42712S;
            case 4:
                return this.f42714T;
            case 5:
                return this.f42716U;
            case 6:
                return this.f42719X;
            case 7:
                return this.f42717V;
            case 8:
                return this.f42718W;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: r0 */
    public boolean mo49584r0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.f42708Q.f42629f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.f42712S.f42629f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.f42710R.f42629f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f42714T.f42629f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.f42716U.f42629f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    /* renamed from: r1 */
    public void mo49585r1(int i) {
        this.f42708Q.mo49417A(i);
        this.f42737h0 = i;
    }

    /* renamed from: s */
    public ArrayList<ConstraintAnchor> mo49586s() {
        return this.f42721Z;
    }

    /* renamed from: s0 */
    public boolean mo49587s0() {
        int size = this.f42721Z.size();
        for (int i = 0; i < size; i++) {
            if (this.f42721Z.get(i).mo49433n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s1 */
    public void mo49588s1(int i) {
        this.f42710R.mo49417A(i);
        this.f42739i0 = i;
    }

    /* renamed from: t */
    public int mo49589t() {
        return this.f42749n0;
    }

    /* renamed from: t0 */
    public boolean mo49590t0() {
        return (this.f42744l == -1 && this.f42746m == -1) ? false : true;
    }

    /* renamed from: t1 */
    public void mo49591t1(int i, int i2) {
        if (!this.f42754q) {
            this.f42710R.mo49417A(i);
            this.f42714T.mo49417A(i2);
            this.f42739i0 = i;
            this.f42731e0 = i2 - i;
            if (this.f42698L) {
                this.f42716U.mo49417A(i + this.f42749n0);
            }
            this.f42754q = true;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f42769x0 != null) {
            str = "type: " + this.f42769x0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f42767w0 != null) {
            str2 = "id: " + this.f42767w0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f42737h0);
        sb.append(", ");
        sb.append(this.f42739i0);
        sb.append(") - (");
        sb.append(this.f42729d0);
        sb.append(" x ");
        sb.append(this.f42731e0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public float mo49593u(int i) {
        if (i == 0) {
            return this.f42755q0;
        }
        if (i == 1) {
            return this.f42757r0;
        }
        return -1.0f;
    }

    /* renamed from: u0 */
    public boolean mo49594u0(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.f42708Q.f42629f;
            if (constraintAnchor3 != null && constraintAnchor3.mo49434o() && (constraintAnchor2 = this.f42712S.f42629f) != null && constraintAnchor2.mo49434o()) {
                if ((this.f42712S.f42629f.mo49425f() - this.f42712S.mo49426g()) - (this.f42708Q.f42629f.mo49425f() + this.f42708Q.mo49426g()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.f42710R.f42629f;
            if (constraintAnchor4 != null && constraintAnchor4.mo49434o() && (constraintAnchor = this.f42714T.f42629f) != null && constraintAnchor.mo49434o()) {
                if ((this.f42714T.f42629f.mo49425f() - this.f42714T.mo49426g()) - (this.f42710R.f42629f.mo49425f() + this.f42710R.mo49426g()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: u1 */
    public void mo49595u1(int i, int i2, int i3) {
        if (i3 == 0) {
            mo49455C1(i, i2);
        } else if (i3 == 1) {
            mo49518X1(i, i2);
        }
    }

    /* renamed from: v */
    public int mo49596v() {
        return mo49578p0() + this.f42731e0;
    }

    /* renamed from: v0 */
    public void mo49597v0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        mo49583r(type).mo49421b(constraintWidget.mo49583r(type2), i, i2, true);
    }

    /* renamed from: v1 */
    public void mo49598v1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f42737h0 = i;
        this.f42739i0 = i2;
        if (this.f42763u0 == 8) {
            this.f42729d0 = 0;
            this.f42731e0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f42725b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.f42729d0)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.f42731e0)) {
            i8 = i5;
        }
        this.f42729d0 = i7;
        this.f42731e0 = i8;
        int i9 = this.f42753p0;
        if (i8 < i9) {
            this.f42731e0 = i9;
        }
        int i10 = this.f42751o0;
        if (i7 < i10) {
            this.f42729d0 = i10;
        }
        int i11 = this.f42676A;
        if (i11 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f42729d0 = Math.min(this.f42729d0, i11);
        }
        int i12 = this.f42682D;
        if (i12 > 0 && this.f42725b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f42731e0 = Math.min(this.f42731e0, i12);
        }
        int i13 = this.f42729d0;
        if (i7 != i13) {
            this.f42744l = i13;
        }
        int i14 = this.f42731e0;
        if (i8 != i14) {
            this.f42746m = i14;
        }
    }

    /* renamed from: w */
    public Object mo49599w() {
        return this.f42759s0;
    }

    /* renamed from: w0 */
    public boolean mo49600w0() {
        return this.f42765v0;
    }

    /* renamed from: w1 */
    public void mo49601w1(ConstraintAnchor.Type type, int i) {
        int i2 = C16774a.f42779a[type.ordinal()];
        if (i2 == 1) {
            this.f42708Q.f42631h = i;
        } else if (i2 == 2) {
            this.f42710R.f42631h = i;
        } else if (i2 == 3) {
            this.f42712S.f42631h = i;
        } else if (i2 == 4) {
            this.f42714T.f42631h = i;
        } else if (i2 == 5) {
            this.f42716U.f42631h = i;
        }
    }

    /* renamed from: x */
    public int mo49602x() {
        return this.f42761t0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
        r0 = r4.f42629f;
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49603x0(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r3.f42720Y
            r1 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f42629f
            if (r2 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42629f
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.f42629f
            if (r0 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42629f
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo49603x0(int):boolean");
    }

    /* renamed from: x1 */
    public void mo49604x1(boolean z) {
        this.f42698L = z;
    }

    /* renamed from: y */
    public String mo49605y() {
        return this.f42767w0;
    }

    /* renamed from: y0 */
    public boolean mo49606y0() {
        return this.f42688G;
    }

    /* renamed from: y1 */
    public void mo49607y1(int i) {
        this.f42731e0 = i;
        int i2 = this.f42753p0;
        if (i < i2) {
            this.f42731e0 = i2;
        }
    }

    /* renamed from: z */
    public DimensionBehaviour mo49608z(int i) {
        if (i == 0) {
            return mo49468H();
        }
        if (i == 1) {
            return mo49559j0();
        }
        return null;
    }

    /* renamed from: z0 */
    public boolean mo49609z0() {
        return this.f42756r;
    }

    /* renamed from: z1 */
    public void mo49610z1(boolean z) {
        this.f42688G = z;
    }

    public ConstraintWidget(String str) {
        this.f42722a = false;
        this.f42724b = new WidgetRun[2];
        this.f42730e = null;
        this.f42732f = null;
        this.f42734g = new boolean[]{true, true};
        this.f42736h = false;
        this.f42738i = true;
        this.f42740j = false;
        this.f42742k = true;
        this.f42744l = -1;
        this.f42746m = -1;
        this.f42748n = new C16772o(this);
        this.f42752p = false;
        this.f42754q = false;
        this.f42756r = false;
        this.f42758s = false;
        this.f42760t = -1;
        this.f42762u = -1;
        this.f42764v = 0;
        this.f42766w = 0;
        this.f42768x = 0;
        this.f42770y = new int[2];
        this.f42772z = 0;
        this.f42676A = 0;
        this.f42678B = 1.0f;
        this.f42680C = 0;
        this.f42682D = 0;
        this.f42684E = 1.0f;
        this.f42690H = -1;
        this.f42692I = 1.0f;
        this.f42694J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f42696K = 0.0f;
        this.f42698L = false;
        this.f42702N = false;
        this.f42704O = 0;
        this.f42706P = 0;
        this.f42708Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f42710R = new ConstraintAnchor(this, ConstraintAnchor.Type.f42635c);
        this.f42712S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f42714T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f42716U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f42717V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f42718W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f42719X = constraintAnchor;
        this.f42720Y = new ConstraintAnchor[]{this.f42708Q, this.f42712S, this.f42710R, this.f42714T, this.f42716U, constraintAnchor};
        this.f42721Z = new ArrayList<>();
        this.f42723a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f42725b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f42727c0 = null;
        this.f42729d0 = 0;
        this.f42731e0 = 0;
        this.f42733f0 = 0.0f;
        this.f42735g0 = -1;
        this.f42737h0 = 0;
        this.f42739i0 = 0;
        this.f42741j0 = 0;
        this.f42743k0 = 0;
        this.f42745l0 = 0;
        this.f42747m0 = 0;
        this.f42749n0 = 0;
        float f = f42675z1;
        this.f42755q0 = f;
        this.f42757r0 = f;
        this.f42761t0 = 0;
        this.f42763u0 = 0;
        this.f42765v0 = false;
        this.f42767w0 = null;
        this.f42769x0 = null;
        this.f42693I0 = false;
        this.f42695J0 = 0;
        this.f42697K0 = 0;
        this.f42703N0 = new float[]{-1.0f, -1.0f};
        this.f42705O0 = new ConstraintWidget[]{null, null};
        this.f42707P0 = new ConstraintWidget[]{null, null};
        this.f42709Q0 = null;
        this.f42711R0 = null;
        this.f42713S0 = -1;
        this.f42715T0 = -1;
        mo49534d();
        mo49560j1(str);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.f42722a = false;
        this.f42724b = new WidgetRun[2];
        this.f42730e = null;
        this.f42732f = null;
        this.f42734g = new boolean[]{true, true};
        this.f42736h = false;
        this.f42738i = true;
        this.f42740j = false;
        this.f42742k = true;
        this.f42744l = -1;
        this.f42746m = -1;
        this.f42748n = new C16772o(this);
        this.f42752p = false;
        this.f42754q = false;
        this.f42756r = false;
        this.f42758s = false;
        this.f42760t = -1;
        this.f42762u = -1;
        this.f42764v = 0;
        this.f42766w = 0;
        this.f42768x = 0;
        this.f42770y = new int[2];
        this.f42772z = 0;
        this.f42676A = 0;
        this.f42678B = 1.0f;
        this.f42680C = 0;
        this.f42682D = 0;
        this.f42684E = 1.0f;
        this.f42690H = -1;
        this.f42692I = 1.0f;
        this.f42694J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f42696K = 0.0f;
        this.f42698L = false;
        this.f42702N = false;
        this.f42704O = 0;
        this.f42706P = 0;
        this.f42708Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f42710R = new ConstraintAnchor(this, ConstraintAnchor.Type.f42635c);
        this.f42712S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f42714T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f42716U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f42717V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f42718W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f42719X = constraintAnchor;
        this.f42720Y = new ConstraintAnchor[]{this.f42708Q, this.f42712S, this.f42710R, this.f42714T, this.f42716U, constraintAnchor};
        this.f42721Z = new ArrayList<>();
        this.f42723a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f42725b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f42727c0 = null;
        this.f42733f0 = 0.0f;
        this.f42735g0 = -1;
        this.f42741j0 = 0;
        this.f42743k0 = 0;
        this.f42745l0 = 0;
        this.f42747m0 = 0;
        this.f42749n0 = 0;
        float f = f42675z1;
        this.f42755q0 = f;
        this.f42757r0 = f;
        this.f42761t0 = 0;
        this.f42763u0 = 0;
        this.f42765v0 = false;
        this.f42767w0 = null;
        this.f42769x0 = null;
        this.f42693I0 = false;
        this.f42695J0 = 0;
        this.f42697K0 = 0;
        this.f42703N0 = new float[]{-1.0f, -1.0f};
        this.f42705O0 = new ConstraintWidget[]{null, null};
        this.f42707P0 = new ConstraintWidget[]{null, null};
        this.f42709Q0 = null;
        this.f42711R0 = null;
        this.f42713S0 = -1;
        this.f42715T0 = -1;
        this.f42737h0 = i;
        this.f42739i0 = i2;
        this.f42729d0 = i3;
        this.f42731e0 = i4;
        mo49534d();
    }

    public ConstraintWidget(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        mo49560j1(str);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public ConstraintWidget(String str, int i, int i2) {
        this(i, i2);
        mo49560j1(str);
    }
}
