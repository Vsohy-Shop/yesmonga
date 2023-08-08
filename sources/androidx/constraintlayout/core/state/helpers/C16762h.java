package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.state.helpers.h */
public class C16762h extends C16757d {

    /* renamed from: androidx.constraintlayout.core.state.helpers.h$a */
    public static /* synthetic */ class C16763a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42563a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42563a = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42563a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42563a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.C16762h.C16763a.<clinit>():void");
        }
    }

    public C16762h(State state) {
        super(state, State.C16743Helper.VERTICAL_CHAIN);
    }

    /* renamed from: a */
    public void mo49232a() {
        Iterator<Object> it = this.f42542l0.iterator();
        while (it.hasNext()) {
            this.f42540j0.mo49308e(it.next()).mo49277w();
        }
        Iterator<Object> it2 = this.f42542l0.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference e = this.f42540j0.mo49308e(it2.next());
            if (constraintReference2 == null) {
                Object obj = this.f42428S;
                if (obj != null) {
                    e.mo49203E0(obj).mo49237c0(this.f42459o).mo49241e0(this.f42465u);
                } else {
                    Object obj2 = this.f42429T;
                    if (obj2 != null) {
                        e.mo49201D0(obj2).mo49237c0(this.f42459o).mo49241e0(this.f42465u);
                    } else {
                        e.mo49203E0(State.f42495j);
                    }
                }
                constraintReference2 = e;
            }
            if (constraintReference != null) {
                constraintReference.mo49265q(e.getKey());
                e.mo49201D0(constraintReference.getKey());
            }
            constraintReference = e;
        }
        if (constraintReference != null) {
            Object obj3 = this.f42430U;
            if (obj3 != null) {
                constraintReference.mo49265q(obj3).mo49237c0(this.f42460p).mo49241e0(this.f42466v);
            } else {
                Object obj4 = this.f42431V;
                if (obj4 != null) {
                    constraintReference.mo49263p(obj4).mo49237c0(this.f42460p).mo49241e0(this.f42466v);
                } else {
                    constraintReference.mo49263p(State.f42495j);
                }
            }
        }
        if (constraintReference2 != null) {
            float f = this.f42553n0;
            if (f != 0.5f) {
                constraintReference2.mo49213J0(f);
            }
            int i = C16763a.f42563a[this.f42554o0.ordinal()];
            if (i == 1) {
                constraintReference2.mo49276v0(0);
            } else if (i == 2) {
                constraintReference2.mo49276v0(1);
            } else if (i == 3) {
                constraintReference2.mo49276v0(2);
            }
        }
    }
}
