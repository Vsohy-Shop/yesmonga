package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.C16758e;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintReference implements C16747c {

    /* renamed from: A */
    public float f42410A = Float.NaN;

    /* renamed from: B */
    public float f42411B = Float.NaN;

    /* renamed from: C */
    public float f42412C = Float.NaN;

    /* renamed from: D */
    public float f42413D = Float.NaN;

    /* renamed from: E */
    public float f42414E = Float.NaN;

    /* renamed from: F */
    public float f42415F = Float.NaN;

    /* renamed from: G */
    public float f42416G = Float.NaN;

    /* renamed from: H */
    public float f42417H = Float.NaN;

    /* renamed from: I */
    public float f42418I = Float.NaN;

    /* renamed from: J */
    public int f42419J = 0;

    /* renamed from: K */
    public Object f42420K = null;

    /* renamed from: L */
    public Object f42421L = null;

    /* renamed from: M */
    public Object f42422M = null;

    /* renamed from: N */
    public Object f42423N = null;

    /* renamed from: O */
    public Object f42424O = null;

    /* renamed from: P */
    public Object f42425P = null;

    /* renamed from: Q */
    public Object f42426Q = null;

    /* renamed from: R */
    public Object f42427R = null;

    /* renamed from: S */
    public Object f42428S = null;

    /* renamed from: T */
    public Object f42429T = null;

    /* renamed from: U */
    public Object f42430U = null;

    /* renamed from: V */
    public Object f42431V = null;

    /* renamed from: W */
    public Object f42432W = null;

    /* renamed from: X */
    public Object f42433X = null;

    /* renamed from: Y */
    public Object f42434Y = null;

    /* renamed from: Z */
    public Object f42435Z = null;

    /* renamed from: a */
    public Object f42436a;

    /* renamed from: a0 */
    public float f42437a0;

    /* renamed from: b */
    public final State f42438b;

    /* renamed from: b0 */
    public float f42439b0;

    /* renamed from: c */
    public String f42440c = null;

    /* renamed from: c0 */
    public State.Constraint f42441c0 = null;

    /* renamed from: d */
    public C16758e f42442d = null;

    /* renamed from: d0 */
    public Dimension f42443d0;

    /* renamed from: e */
    public int f42444e = 0;

    /* renamed from: e0 */
    public Dimension f42445e0;

    /* renamed from: f */
    public int f42446f = 0;

    /* renamed from: f0 */
    public Object f42447f0;

    /* renamed from: g */
    public float f42448g = -1.0f;

    /* renamed from: g0 */
    public ConstraintWidget f42449g0;

    /* renamed from: h */
    public float f42450h = -1.0f;

    /* renamed from: h0 */
    public HashMap<String, Integer> f42451h0;

    /* renamed from: i */
    public float f42452i = 0.5f;

    /* renamed from: i0 */
    public HashMap<String, Float> f42453i0;

    /* renamed from: j */
    public float f42454j = 0.5f;

    /* renamed from: k */
    public int f42455k = 0;

    /* renamed from: l */
    public int f42456l = 0;

    /* renamed from: m */
    public int f42457m = 0;

    /* renamed from: n */
    public int f42458n = 0;

    /* renamed from: o */
    public int f42459o = 0;

    /* renamed from: p */
    public int f42460p = 0;

    /* renamed from: q */
    public int f42461q = 0;

    /* renamed from: r */
    public int f42462r = 0;

    /* renamed from: s */
    public int f42463s = 0;

    /* renamed from: t */
    public int f42464t = 0;

    /* renamed from: u */
    public int f42465u = 0;

    /* renamed from: v */
    public int f42466v = 0;

    /* renamed from: w */
    public int f42467w = 0;

    /* renamed from: x */
    public int f42468x = 0;

    /* renamed from: y */
    public float f42469y = Float.NaN;

    /* renamed from: z */
    public float f42470z = Float.NaN;

    public static class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        /* renamed from: a */
        public ArrayList<String> mo49285a() {
            return this.mErrors;
        }

        public String toString() {
            return "IncorrectConstraintException: " + this.mErrors.toString();
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$a */
    public static /* synthetic */ class C16741a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42471a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.state.State$Constraint[] r0 = androidx.constraintlayout.core.state.State.Constraint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42471a = r0
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.START_TO_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.START_TO_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.END_TO_START     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.END_TO_END     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f42471a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintReference.C16741a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$b */
    public interface C16742b {
        /* renamed from: a */
        ConstraintReference mo49287a(State state);
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.f42473j;
        this.f42443d0 = Dimension.m76549b(obj);
        this.f42445e0 = Dimension.m76549b(obj);
        this.f42451h0 = new HashMap<>();
        this.f42453i0 = new HashMap<>();
        this.f42438b = state;
    }

    /* renamed from: A */
    public ConstraintReference mo49194A(Object obj) {
        this.f42441c0 = State.Constraint.END_TO_END;
        this.f42427R = obj;
        return this;
    }

    /* renamed from: A0 */
    public ConstraintReference mo49195A0(Object obj) {
        this.f42441c0 = State.Constraint.START_TO_END;
        this.f42425P = obj;
        return this;
    }

    /* renamed from: B */
    public ConstraintReference mo49196B(Object obj) {
        this.f42441c0 = State.Constraint.END_TO_START;
        this.f42426Q = obj;
        return this;
    }

    /* renamed from: B0 */
    public ConstraintReference mo49197B0(Object obj) {
        this.f42441c0 = State.Constraint.START_TO_START;
        this.f42424O = obj;
        return this;
    }

    /* renamed from: C */
    public final Object mo49198C(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof ConstraintReference)) {
            return this.f42438b.mo49320r(obj);
        }
        return obj;
    }

    /* renamed from: C0 */
    public ConstraintReference mo49199C0() {
        if (this.f42428S != null) {
            this.f42441c0 = State.Constraint.TOP_TO_TOP;
        } else {
            this.f42441c0 = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    /* renamed from: D */
    public float mo49200D() {
        return this.f42416G;
    }

    /* renamed from: D0 */
    public ConstraintReference mo49201D0(Object obj) {
        this.f42441c0 = State.Constraint.TOP_TO_BOTTOM;
        this.f42429T = obj;
        return this;
    }

    /* renamed from: E */
    public Dimension mo49202E() {
        return this.f42445e0;
    }

    /* renamed from: E0 */
    public ConstraintReference mo49203E0(Object obj) {
        this.f42441c0 = State.Constraint.TOP_TO_TOP;
        this.f42428S = obj;
        return this;
    }

    /* renamed from: F */
    public int mo49204F() {
        return this.f42444e;
    }

    /* renamed from: F0 */
    public ConstraintReference mo49205F0(float f) {
        this.f42413D = f;
        return this;
    }

    /* renamed from: G */
    public float mo49206G() {
        return this.f42448g;
    }

    /* renamed from: G0 */
    public ConstraintReference mo49207G0(float f) {
        this.f42414E = f;
        return this;
    }

    /* renamed from: H */
    public float mo49208H() {
        return this.f42469y;
    }

    /* renamed from: H0 */
    public ConstraintReference mo49209H0(float f) {
        this.f42415F = f;
        return this;
    }

    /* renamed from: I */
    public float mo49210I() {
        return this.f42470z;
    }

    /* renamed from: I0 */
    public void mo49211I0() throws IncorrectConstraintException {
        ArrayList arrayList = new ArrayList();
        if (!(this.f42420K == null || this.f42421L == null)) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (!(this.f42422M == null || this.f42423N == null)) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (!(this.f42424O == null || this.f42425P == null)) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (!(this.f42426Q == null || this.f42427R == null)) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if (!((this.f42420K == null && this.f42421L == null && this.f42422M == null && this.f42423N == null) || (this.f42424O == null && this.f42425P == null && this.f42426Q == null && this.f42427R == null))) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    /* renamed from: J */
    public float mo49212J() {
        return this.f42410A;
    }

    /* renamed from: J0 */
    public ConstraintReference mo49213J0(float f) {
        this.f42454j = f;
        return this;
    }

    /* renamed from: K */
    public float mo49214K() {
        return this.f42411B;
    }

    /* renamed from: K0 */
    public ConstraintReference mo49215K0(int i) {
        this.f42419J = i;
        return this;
    }

    /* renamed from: L */
    public float mo49216L() {
        return this.f42412C;
    }

    /* renamed from: L0 */
    public ConstraintReference mo49217L0(Dimension dimension) {
        return mo49282y0(dimension);
    }

    /* renamed from: M */
    public float mo49218M() {
        return this.f42417H;
    }

    /* renamed from: N */
    public float mo49219N() {
        return this.f42418I;
    }

    /* renamed from: O */
    public String mo49220O() {
        return this.f42440c;
    }

    /* renamed from: P */
    public final ConstraintWidget mo49221P(Object obj) {
        if (obj instanceof C16747c) {
            return ((C16747c) obj).mo49234b();
        }
        return null;
    }

    /* renamed from: Q */
    public float mo49222Q() {
        return this.f42413D;
    }

    /* renamed from: R */
    public float mo49223R() {
        return this.f42414E;
    }

    /* renamed from: S */
    public float mo49224S() {
        return this.f42415F;
    }

    /* renamed from: T */
    public int mo49225T(int i) {
        return this.f42446f;
    }

    /* renamed from: U */
    public float mo49226U() {
        return this.f42450h;
    }

    /* renamed from: V */
    public Object mo49227V() {
        return this.f42447f0;
    }

    /* renamed from: W */
    public Dimension mo49228W() {
        return this.f42443d0;
    }

    /* renamed from: X */
    public ConstraintReference mo49229X(Dimension dimension) {
        return mo49268r0(dimension);
    }

    /* renamed from: Y */
    public ConstraintReference mo49230Y(float f) {
        this.f42452i = f;
        return this;
    }

    /* renamed from: Z */
    public ConstraintReference mo49231Z() {
        if (this.f42420K != null) {
            this.f42441c0 = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.f42441c0 = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    /* renamed from: a */
    public void mo49232a() {
        if (this.f42449g0 != null) {
            C16758e eVar = this.f42442d;
            if (eVar != null) {
                eVar.mo49232a();
            }
            this.f42443d0.mo49288j(this.f42438b, this.f42449g0, 0);
            this.f42445e0.mo49288j(this.f42438b, this.f42449g0, 1);
            mo49281y();
            mo49249i(this.f42449g0, this.f42420K, State.Constraint.LEFT_TO_LEFT);
            mo49249i(this.f42449g0, this.f42421L, State.Constraint.LEFT_TO_RIGHT);
            mo49249i(this.f42449g0, this.f42422M, State.Constraint.RIGHT_TO_LEFT);
            mo49249i(this.f42449g0, this.f42423N, State.Constraint.RIGHT_TO_RIGHT);
            mo49249i(this.f42449g0, this.f42424O, State.Constraint.START_TO_START);
            mo49249i(this.f42449g0, this.f42425P, State.Constraint.START_TO_END);
            mo49249i(this.f42449g0, this.f42426Q, State.Constraint.END_TO_START);
            mo49249i(this.f42449g0, this.f42427R, State.Constraint.END_TO_END);
            mo49249i(this.f42449g0, this.f42428S, State.Constraint.TOP_TO_TOP);
            mo49249i(this.f42449g0, this.f42429T, State.Constraint.TOP_TO_BOTTOM);
            mo49249i(this.f42449g0, this.f42430U, State.Constraint.BOTTOM_TO_TOP);
            mo49249i(this.f42449g0, this.f42431V, State.Constraint.BOTTOM_TO_BOTTOM);
            mo49249i(this.f42449g0, this.f42432W, State.Constraint.BASELINE_TO_BASELINE);
            mo49249i(this.f42449g0, this.f42433X, State.Constraint.BASELINE_TO_TOP);
            mo49249i(this.f42449g0, this.f42434Y, State.Constraint.BASELINE_TO_BOTTOM);
            mo49249i(this.f42449g0, this.f42435Z, State.Constraint.CIRCULAR_CONSTRAINT);
            int i = this.f42444e;
            if (i != 0) {
                this.f42449g0.mo49452B1(i);
            }
            int i2 = this.f42446f;
            if (i2 != 0) {
                this.f42449g0.mo49515W1(i2);
            }
            float f = this.f42448g;
            if (f != -1.0f) {
                this.f42449g0.mo49464F1(f);
            }
            float f2 = this.f42450h;
            if (f2 != -1.0f) {
                this.f42449g0.mo49527a2(f2);
            }
            this.f42449g0.mo49449A1(this.f42452i);
            this.f42449g0.mo49512V1(this.f42454j);
            ConstraintWidget constraintWidget = this.f42449g0;
            C16772o oVar = constraintWidget.f42748n;
            oVar.f42607f = this.f42469y;
            oVar.f42608g = this.f42470z;
            oVar.f42609h = this.f42410A;
            oVar.f42610i = this.f42411B;
            oVar.f42611j = this.f42412C;
            oVar.f42612k = this.f42413D;
            oVar.f42613l = this.f42414E;
            oVar.f42614m = this.f42415F;
            oVar.f42615n = this.f42417H;
            oVar.f42616o = this.f42418I;
            oVar.f42617p = this.f42416G;
            int i3 = this.f42419J;
            oVar.f42619r = i3;
            constraintWidget.mo49530b2(i3);
            HashMap<String, Integer> hashMap = this.f42451h0;
            if (hashMap != null) {
                for (String next : hashMap.keySet()) {
                    this.f42449g0.f42748n.mo49413w(next, 902, this.f42451h0.get(next).intValue());
                }
            }
            HashMap<String, Float> hashMap2 = this.f42453i0;
            if (hashMap2 != null) {
                for (String next2 : hashMap2.keySet()) {
                    this.f42449g0.f42748n.mo49412v(next2, 901, this.f42453i0.get(next2).floatValue());
                }
            }
        }
    }

    /* renamed from: a0 */
    public ConstraintReference mo49233a0(Object obj) {
        this.f42441c0 = State.Constraint.LEFT_TO_LEFT;
        this.f42420K = obj;
        return this;
    }

    /* renamed from: b */
    public ConstraintWidget mo49234b() {
        if (this.f42449g0 == null) {
            ConstraintWidget x = mo49279x();
            this.f42449g0 = x;
            x.mo49552h1(this.f42447f0);
        }
        return this.f42449g0;
    }

    /* renamed from: b0 */
    public ConstraintReference mo49235b0(Object obj) {
        this.f42441c0 = State.Constraint.LEFT_TO_RIGHT;
        this.f42421L = obj;
        return this;
    }

    /* renamed from: c */
    public void mo49236c(ConstraintWidget constraintWidget) {
        if (constraintWidget != null) {
            this.f42449g0 = constraintWidget;
            constraintWidget.mo49552h1(this.f42447f0);
        }
    }

    /* renamed from: c0 */
    public ConstraintReference mo49237c0(int i) {
        State.Constraint constraint = this.f42441c0;
        if (constraint != null) {
            switch (C16741a.f42471a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f42455k = i;
                    break;
                case 3:
                case 4:
                    this.f42456l = i;
                    break;
                case 5:
                case 6:
                    this.f42457m = i;
                    break;
                case 7:
                case 8:
                    this.f42458n = i;
                    break;
                case 9:
                case 10:
                    this.f42459o = i;
                    break;
                case 11:
                case 12:
                    this.f42460p = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f42467w = i;
                    break;
                case 16:
                    this.f42439b0 = (float) i;
                    break;
            }
        } else {
            this.f42455k = i;
            this.f42456l = i;
            this.f42457m = i;
            this.f42458n = i;
            this.f42459o = i;
            this.f42460p = i;
        }
        return this;
    }

    /* renamed from: d */
    public void mo49238d(Object obj) {
        this.f42436a = obj;
    }

    /* renamed from: d0 */
    public ConstraintReference mo49239d0(Object obj) {
        return mo49237c0(this.f42438b.mo48546f(obj));
    }

    /* renamed from: e */
    public C16758e mo49240e() {
        return this.f42442d;
    }

    /* renamed from: e0 */
    public ConstraintReference mo49241e0(int i) {
        State.Constraint constraint = this.f42441c0;
        if (constraint != null) {
            switch (C16741a.f42471a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f42461q = i;
                    break;
                case 3:
                case 4:
                    this.f42462r = i;
                    break;
                case 5:
                case 6:
                    this.f42463s = i;
                    break;
                case 7:
                case 8:
                    this.f42464t = i;
                    break;
                case 9:
                case 10:
                    this.f42465u = i;
                    break;
                case 11:
                case 12:
                    this.f42466v = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f42468x = i;
                    break;
            }
        } else {
            this.f42461q = i;
            this.f42462r = i;
            this.f42463s = i;
            this.f42464t = i;
            this.f42465u = i;
            this.f42466v = i;
        }
        return this;
    }

    /* renamed from: f */
    public void mo49242f(String str, int i) {
        this.f42451h0.put(str, Integer.valueOf(i));
    }

    /* renamed from: f0 */
    public ConstraintReference mo49243f0(Object obj) {
        return mo49241e0(this.f42438b.mo48546f(obj));
    }

    /* renamed from: g */
    public void mo49244g(String str, float f) {
        if (this.f42453i0 == null) {
            this.f42453i0 = new HashMap<>();
        }
        this.f42453i0.put(str, Float.valueOf(f));
    }

    /* renamed from: g0 */
    public ConstraintReference mo49245g0(float f) {
        this.f42469y = f;
        return this;
    }

    public Object getKey() {
        return this.f42436a;
    }

    /* renamed from: h */
    public ConstraintReference mo49247h(float f) {
        this.f42416G = f;
        return this;
    }

    /* renamed from: h0 */
    public ConstraintReference mo49248h0(float f) {
        this.f42470z = f;
        return this;
    }

    /* renamed from: i */
    public final void mo49249i(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget P = mo49221P(obj);
        if (P != null) {
            int[] iArr = C16741a.f42471a;
            int i = iArr[constraint.ordinal()];
            switch (iArr[constraint.ordinal()]) {
                case 1:
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.mo49583r(type).mo49421b(P.mo49583r(type), this.f42455k, this.f42461q, false);
                    return;
                case 2:
                    constraintWidget.mo49583r(ConstraintAnchor.Type.LEFT).mo49421b(P.mo49583r(ConstraintAnchor.Type.RIGHT), this.f42455k, this.f42461q, false);
                    return;
                case 3:
                    constraintWidget.mo49583r(ConstraintAnchor.Type.RIGHT).mo49421b(P.mo49583r(ConstraintAnchor.Type.LEFT), this.f42456l, this.f42462r, false);
                    return;
                case 4:
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.mo49583r(type2).mo49421b(P.mo49583r(type2), this.f42456l, this.f42462r, false);
                    return;
                case 5:
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                    constraintWidget.mo49583r(type3).mo49421b(P.mo49583r(type3), this.f42457m, this.f42463s, false);
                    return;
                case 6:
                    constraintWidget.mo49583r(ConstraintAnchor.Type.LEFT).mo49421b(P.mo49583r(ConstraintAnchor.Type.RIGHT), this.f42457m, this.f42463s, false);
                    return;
                case 7:
                    constraintWidget.mo49583r(ConstraintAnchor.Type.RIGHT).mo49421b(P.mo49583r(ConstraintAnchor.Type.LEFT), this.f42458n, this.f42464t, false);
                    return;
                case 8:
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.mo49583r(type4).mo49421b(P.mo49583r(type4), this.f42458n, this.f42464t, false);
                    return;
                case 9:
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f42635c;
                    constraintWidget.mo49583r(type5).mo49421b(P.mo49583r(type5), this.f42459o, this.f42465u, false);
                    return;
                case 10:
                    constraintWidget.mo49583r(ConstraintAnchor.Type.f42635c).mo49421b(P.mo49583r(ConstraintAnchor.Type.BOTTOM), this.f42459o, this.f42465u, false);
                    return;
                case 11:
                    constraintWidget.mo49583r(ConstraintAnchor.Type.BOTTOM).mo49421b(P.mo49583r(ConstraintAnchor.Type.f42635c), this.f42460p, this.f42466v, false);
                    return;
                case 12:
                    ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.mo49583r(type6).mo49421b(P.mo49583r(type6), this.f42460p, this.f42466v, false);
                    return;
                case 13:
                    constraintWidget.mo49597v0(ConstraintAnchor.Type.BASELINE, P, ConstraintAnchor.Type.BOTTOM, this.f42467w, this.f42468x);
                    return;
                case 14:
                    constraintWidget.mo49597v0(ConstraintAnchor.Type.BASELINE, P, ConstraintAnchor.Type.f42635c, this.f42467w, this.f42468x);
                    return;
                case 15:
                    ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                    constraintWidget.mo49597v0(type7, P, type7, this.f42467w, this.f42468x);
                    return;
                case 16:
                    constraintWidget.mo49568m(P, this.f42437a0, (int) this.f42439b0);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: i0 */
    public ConstraintReference mo49250i0() {
        if (this.f42422M != null) {
            this.f42441c0 = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.f42441c0 = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    /* renamed from: j */
    public ConstraintReference mo49251j() {
        this.f42441c0 = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    /* renamed from: j0 */
    public ConstraintReference mo49252j0(Object obj) {
        this.f42441c0 = State.Constraint.RIGHT_TO_LEFT;
        this.f42422M = obj;
        return this;
    }

    /* renamed from: k */
    public ConstraintReference mo49253k(Object obj) {
        this.f42441c0 = State.Constraint.BASELINE_TO_BASELINE;
        this.f42432W = obj;
        return this;
    }

    /* renamed from: k0 */
    public ConstraintReference mo49254k0(Object obj) {
        this.f42441c0 = State.Constraint.RIGHT_TO_RIGHT;
        this.f42423N = obj;
        return this;
    }

    /* renamed from: l */
    public ConstraintReference mo49255l(Object obj) {
        this.f42441c0 = State.Constraint.BASELINE_TO_BOTTOM;
        this.f42434Y = obj;
        return this;
    }

    /* renamed from: l0 */
    public ConstraintReference mo49256l0(float f) {
        this.f42410A = f;
        return this;
    }

    /* renamed from: m */
    public ConstraintReference mo49257m(Object obj) {
        this.f42441c0 = State.Constraint.BASELINE_TO_TOP;
        this.f42433X = obj;
        return this;
    }

    /* renamed from: m0 */
    public ConstraintReference mo49258m0(float f) {
        this.f42411B = f;
        return this;
    }

    /* renamed from: n */
    public ConstraintReference mo49259n(float f) {
        State.Constraint constraint = this.f42441c0;
        if (constraint == null) {
            return this;
        }
        int i = C16741a.f42471a[constraint.ordinal()];
        if (i != 17) {
            if (i != 18) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                }
            }
            this.f42454j = f;
            return this;
        }
        this.f42452i = f;
        return this;
    }

    /* renamed from: n0 */
    public ConstraintReference mo49260n0(float f) {
        this.f42412C = f;
        return this;
    }

    /* renamed from: o */
    public ConstraintReference mo49261o() {
        if (this.f42430U != null) {
            this.f42441c0 = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.f42441c0 = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    /* renamed from: o0 */
    public ConstraintReference mo49262o0(float f) {
        this.f42417H = f;
        return this;
    }

    /* renamed from: p */
    public ConstraintReference mo49263p(Object obj) {
        this.f42441c0 = State.Constraint.BOTTOM_TO_BOTTOM;
        this.f42431V = obj;
        return this;
    }

    /* renamed from: p0 */
    public ConstraintReference mo49264p0(float f) {
        this.f42418I = f;
        return this;
    }

    /* renamed from: q */
    public ConstraintReference mo49265q(Object obj) {
        this.f42441c0 = State.Constraint.BOTTOM_TO_TOP;
        this.f42430U = obj;
        return this;
    }

    /* renamed from: q0 */
    public void mo49266q0(C16758e eVar) {
        this.f42442d = eVar;
        if (eVar != null) {
            mo49236c(eVar.mo49234b());
        }
    }

    /* renamed from: r */
    public ConstraintReference mo49267r(Object obj) {
        Object C = mo49198C(obj);
        this.f42424O = C;
        this.f42427R = C;
        this.f42441c0 = State.Constraint.CENTER_HORIZONTALLY;
        this.f42452i = 0.5f;
        return this;
    }

    /* renamed from: r0 */
    public ConstraintReference mo49268r0(Dimension dimension) {
        this.f42445e0 = dimension;
        return this;
    }

    /* renamed from: s */
    public ConstraintReference mo49269s(Object obj) {
        Object C = mo49198C(obj);
        this.f42428S = C;
        this.f42431V = C;
        this.f42441c0 = State.Constraint.CENTER_VERTICALLY;
        this.f42454j = 0.5f;
        return this;
    }

    /* renamed from: s0 */
    public void mo49270s0(int i) {
        this.f42444e = i;
    }

    /* renamed from: t */
    public ConstraintReference mo49271t(Object obj, float f, float f2) {
        this.f42435Z = mo49198C(obj);
        this.f42437a0 = f;
        this.f42439b0 = f2;
        this.f42441c0 = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    /* renamed from: t0 */
    public void mo49272t0(float f) {
        this.f42448g = f;
    }

    /* renamed from: u */
    public ConstraintReference mo49273u() {
        State.Constraint constraint = this.f42441c0;
        if (constraint != null) {
            switch (C16741a.f42471a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f42420K = null;
                    this.f42421L = null;
                    this.f42455k = 0;
                    this.f42461q = 0;
                    break;
                case 3:
                case 4:
                    this.f42422M = null;
                    this.f42423N = null;
                    this.f42456l = 0;
                    this.f42462r = 0;
                    break;
                case 5:
                case 6:
                    this.f42424O = null;
                    this.f42425P = null;
                    this.f42457m = 0;
                    this.f42463s = 0;
                    break;
                case 7:
                case 8:
                    this.f42426Q = null;
                    this.f42427R = null;
                    this.f42458n = 0;
                    this.f42464t = 0;
                    break;
                case 9:
                case 10:
                    this.f42428S = null;
                    this.f42429T = null;
                    this.f42459o = 0;
                    this.f42465u = 0;
                    break;
                case 11:
                case 12:
                    this.f42430U = null;
                    this.f42431V = null;
                    this.f42460p = 0;
                    this.f42466v = 0;
                    break;
                case 15:
                    this.f42432W = null;
                    break;
                case 16:
                    this.f42435Z = null;
                    break;
            }
        } else {
            this.f42420K = null;
            this.f42421L = null;
            this.f42455k = 0;
            this.f42422M = null;
            this.f42423N = null;
            this.f42456l = 0;
            this.f42424O = null;
            this.f42425P = null;
            this.f42457m = 0;
            this.f42426Q = null;
            this.f42427R = null;
            this.f42458n = 0;
            this.f42428S = null;
            this.f42429T = null;
            this.f42459o = 0;
            this.f42430U = null;
            this.f42431V = null;
            this.f42460p = 0;
            this.f42432W = null;
            this.f42435Z = null;
            this.f42452i = 0.5f;
            this.f42454j = 0.5f;
            this.f42461q = 0;
            this.f42462r = 0;
            this.f42463s = 0;
            this.f42464t = 0;
            this.f42465u = 0;
            this.f42466v = 0;
        }
        return this;
    }

    /* renamed from: u0 */
    public void mo49274u0(String str) {
        this.f42440c = str;
    }

    /* renamed from: v */
    public ConstraintReference mo49275v() {
        mo49284z0().mo49273u();
        mo49283z().mo49273u();
        mo49231Z().mo49273u();
        mo49250i0().mo49273u();
        return this;
    }

    /* renamed from: v0 */
    public void mo49276v0(int i) {
        this.f42446f = i;
    }

    /* renamed from: w */
    public ConstraintReference mo49277w() {
        mo49199C0().mo49273u();
        mo49251j().mo49273u();
        mo49261o().mo49273u();
        return this;
    }

    /* renamed from: w0 */
    public void mo49278w0(float f) {
        this.f42450h = f;
    }

    /* renamed from: x */
    public ConstraintWidget mo49279x() {
        return new ConstraintWidget(mo49228W().mo49292n(), mo49202E().mo49292n());
    }

    /* renamed from: x0 */
    public void mo49280x0(Object obj) {
        this.f42447f0 = obj;
        ConstraintWidget constraintWidget = this.f42449g0;
        if (constraintWidget != null) {
            constraintWidget.mo49552h1(obj);
        }
    }

    /* renamed from: y */
    public final void mo49281y() {
        this.f42420K = mo49198C(this.f42420K);
        this.f42421L = mo49198C(this.f42421L);
        this.f42422M = mo49198C(this.f42422M);
        this.f42423N = mo49198C(this.f42423N);
        this.f42424O = mo49198C(this.f42424O);
        this.f42425P = mo49198C(this.f42425P);
        this.f42426Q = mo49198C(this.f42426Q);
        this.f42427R = mo49198C(this.f42427R);
        this.f42428S = mo49198C(this.f42428S);
        this.f42429T = mo49198C(this.f42429T);
        this.f42430U = mo49198C(this.f42430U);
        this.f42431V = mo49198C(this.f42431V);
        this.f42432W = mo49198C(this.f42432W);
        this.f42433X = mo49198C(this.f42433X);
        this.f42434Y = mo49198C(this.f42434Y);
    }

    /* renamed from: y0 */
    public ConstraintReference mo49282y0(Dimension dimension) {
        this.f42443d0 = dimension;
        return this;
    }

    /* renamed from: z */
    public ConstraintReference mo49283z() {
        if (this.f42426Q != null) {
            this.f42441c0 = State.Constraint.END_TO_START;
        } else {
            this.f42441c0 = State.Constraint.END_TO_END;
        }
        return this;
    }

    /* renamed from: z0 */
    public ConstraintReference mo49284z0() {
        if (this.f42424O != null) {
            this.f42441c0 = State.Constraint.START_TO_START;
        } else {
            this.f42441c0 = State.Constraint.START_TO_END;
        }
        return this;
    }
}
