package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C16745a;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.state.helpers.a */
public class C16753a extends C16745a {

    /* renamed from: n0 */
    public float f42547n0 = 0.5f;

    public C16753a(State state) {
        super(state, State.C16743Helper.ALIGN_VERTICALLY);
    }

    /* renamed from: a */
    public void mo49232a() {
        Iterator<Object> it = this.f42542l0.iterator();
        while (it.hasNext()) {
            ConstraintReference e = this.f42540j0.mo49308e(it.next());
            e.mo49275v();
            Object obj = this.f42424O;
            if (obj != null) {
                e.mo49197B0(obj);
            } else {
                Object obj2 = this.f42425P;
                if (obj2 != null) {
                    e.mo49195A0(obj2);
                } else {
                    e.mo49197B0(State.f42495j);
                }
            }
            Object obj3 = this.f42426Q;
            if (obj3 != null) {
                e.mo49196B(obj3);
            } else {
                Object obj4 = this.f42427R;
                if (obj4 != null) {
                    e.mo49194A(obj4);
                } else {
                    e.mo49194A(State.f42495j);
                }
            }
            float f = this.f42547n0;
            if (f != 0.5f) {
                e.mo49230Y(f);
            }
        }
    }
}
