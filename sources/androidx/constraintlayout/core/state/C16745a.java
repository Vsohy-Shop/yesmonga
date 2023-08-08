package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.C16758e;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: androidx.constraintlayout.core.state.a */
public class C16745a extends ConstraintReference implements C16758e {

    /* renamed from: j0 */
    public final State f42540j0;

    /* renamed from: k0 */
    public final State.C16743Helper f42541k0;

    /* renamed from: l0 */
    public ArrayList<Object> f42542l0 = new ArrayList<>();

    /* renamed from: m0 */
    public C16804h f42543m0;

    public C16745a(State state, State.C16743Helper helper) {
        super(state);
        this.f42540j0 = state;
        this.f42541k0 = helper;
    }

    /* renamed from: M0 */
    public C16745a mo49328M0(Object... objArr) {
        Collections.addAll(this.f42542l0, objArr);
        return this;
    }

    /* renamed from: N0 */
    public C16804h mo49329N0() {
        return this.f42543m0;
    }

    /* renamed from: O0 */
    public State.C16743Helper mo49330O0() {
        return this.f42541k0;
    }

    /* renamed from: P0 */
    public void mo49331P0(C16804h hVar) {
        this.f42543m0 = hVar;
    }

    /* renamed from: a */
    public void mo49232a() {
    }

    /* renamed from: b */
    public ConstraintWidget mo49234b() {
        return mo49329N0();
    }
}
