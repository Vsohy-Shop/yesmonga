package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C16745a;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.state.helpers.b */
public class C16754b extends C16745a {

    /* renamed from: n0 */
    public float f42548n0 = 0.5f;

    public C16754b(State state) {
        super(state, State.C16743Helper.ALIGN_VERTICALLY);
    }

    /* renamed from: a */
    public void mo49232a() {
        Iterator<Object> it = this.f42542l0.iterator();
        while (it.hasNext()) {
            ConstraintReference e = this.f42540j0.mo49308e(it.next());
            e.mo49277w();
            Object obj = this.f42428S;
            if (obj != null) {
                e.mo49203E0(obj);
            } else {
                Object obj2 = this.f42429T;
                if (obj2 != null) {
                    e.mo49201D0(obj2);
                } else {
                    e.mo49203E0(State.f42495j);
                }
            }
            Object obj3 = this.f42430U;
            if (obj3 != null) {
                e.mo49265q(obj3);
            } else {
                Object obj4 = this.f42431V;
                if (obj4 != null) {
                    e.mo49263p(obj4);
                } else {
                    e.mo49263p(State.f42495j);
                }
            }
            float f = this.f42548n0;
            if (f != 0.5f) {
                e.mo49213J0(f);
            }
        }
    }
}
