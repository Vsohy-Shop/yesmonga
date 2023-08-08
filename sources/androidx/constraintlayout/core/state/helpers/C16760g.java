package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.state.helpers.g */
public class C16760g extends C16757d {

    /* renamed from: androidx.constraintlayout.core.state.helpers.g$a */
    public static /* synthetic */ class C16761a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42562a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.state.State$Chain[] r0 = androidx.constraintlayout.core.state.State.Chain.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42562a = r0
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42562a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42562a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.state.State$Chain r1 = androidx.constraintlayout.core.state.State.Chain.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.C16760g.C16761a.<clinit>():void");
        }
    }

    public C16760g(State state) {
        super(state, State.C16743Helper.HORIZONTAL_CHAIN);
    }

    /* renamed from: a */
    public void mo49232a() {
        Iterator<Object> it = this.f42542l0.iterator();
        while (it.hasNext()) {
            this.f42540j0.mo49308e(it.next()).mo49275v();
        }
        Iterator<Object> it2 = this.f42542l0.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference e = this.f42540j0.mo49308e(it2.next());
            if (constraintReference2 == null) {
                Object obj = this.f42424O;
                if (obj != null) {
                    e.mo49197B0(obj).mo49237c0(this.f42457m).mo49241e0(this.f42463s);
                } else {
                    Object obj2 = this.f42425P;
                    if (obj2 != null) {
                        e.mo49195A0(obj2).mo49237c0(this.f42457m).mo49241e0(this.f42463s);
                    } else {
                        Object obj3 = this.f42420K;
                        if (obj3 != null) {
                            e.mo49197B0(obj3).mo49237c0(this.f42455k).mo49241e0(this.f42461q);
                        } else {
                            Object obj4 = this.f42421L;
                            if (obj4 != null) {
                                e.mo49195A0(obj4).mo49237c0(this.f42455k).mo49241e0(this.f42461q);
                            } else {
                                e.mo49197B0(State.f42495j);
                            }
                        }
                    }
                }
                constraintReference2 = e;
            }
            if (constraintReference != null) {
                constraintReference.mo49196B(e.getKey());
                e.mo49195A0(constraintReference.getKey());
            }
            constraintReference = e;
        }
        if (constraintReference != null) {
            Object obj5 = this.f42426Q;
            if (obj5 != null) {
                constraintReference.mo49196B(obj5).mo49237c0(this.f42458n).mo49241e0(this.f42464t);
            } else {
                Object obj6 = this.f42427R;
                if (obj6 != null) {
                    constraintReference.mo49194A(obj6).mo49237c0(this.f42458n).mo49241e0(this.f42464t);
                } else {
                    Object obj7 = this.f42422M;
                    if (obj7 != null) {
                        constraintReference.mo49196B(obj7).mo49237c0(this.f42456l).mo49241e0(this.f42462r);
                    } else {
                        Object obj8 = this.f42423N;
                        if (obj8 != null) {
                            constraintReference.mo49194A(obj8).mo49237c0(this.f42456l).mo49241e0(this.f42462r);
                        } else {
                            constraintReference.mo49194A(State.f42495j);
                        }
                    }
                }
            }
        }
        if (constraintReference2 != null) {
            float f = this.f42553n0;
            if (f != 0.5f) {
                constraintReference2.mo49230Y(f);
            }
            int i = C16761a.f42562a[this.f42554o0.ordinal()];
            if (i == 1) {
                constraintReference2.mo49270s0(0);
            } else if (i == 2) {
                constraintReference2.mo49270s0(1);
            } else if (i == 3) {
                constraintReference2.mo49270s0(2);
            }
        }
    }
}
