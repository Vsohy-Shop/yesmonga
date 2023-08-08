package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C16745a;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.C16775a;
import androidx.constraintlayout.core.widgets.C16804h;

/* renamed from: androidx.constraintlayout.core.state.helpers.c */
public class C16755c extends C16745a {

    /* renamed from: n0 */
    public State.Direction f42549n0;

    /* renamed from: o0 */
    public int f42550o0;

    /* renamed from: p0 */
    public C16775a f42551p0;

    /* renamed from: androidx.constraintlayout.core.state.helpers.c$a */
    public static /* synthetic */ class C16756a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42552a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.state.State$Direction[] r0 = androidx.constraintlayout.core.state.State.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42552a = r0
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42552a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42552a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42552a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42552a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.f42528e     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f42552a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.state.State$Direction r1 = androidx.constraintlayout.core.state.State.Direction.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.C16755c.C16756a.<clinit>():void");
        }
    }

    public C16755c(State state) {
        super(state, State.C16743Helper.BARRIER);
    }

    /* renamed from: N0 */
    public C16804h mo49329N0() {
        if (this.f42551p0 == null) {
            this.f42551p0 = new C16775a();
        }
        return this.f42551p0;
    }

    /* renamed from: Q0 */
    public void mo49344Q0(State.Direction direction) {
        this.f42549n0 = direction;
    }

    /* renamed from: a */
    public void mo49232a() {
        mo49329N0();
        int i = C16756a.f42552a[this.f42549n0.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        this.f42551p0.mo49619u2(i2);
        this.f42551p0.mo49620v2(this.f42550o0);
    }

    /* renamed from: c0 */
    public ConstraintReference mo49237c0(int i) {
        this.f42550o0 = i;
        return this;
    }

    /* renamed from: d0 */
    public ConstraintReference mo49239d0(Object obj) {
        mo49237c0(this.f42540j0.mo48546f(obj));
        return this;
    }
}
