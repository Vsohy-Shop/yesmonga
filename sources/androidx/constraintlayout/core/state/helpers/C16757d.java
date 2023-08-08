package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C16745a;
import androidx.constraintlayout.core.state.State;

/* renamed from: androidx.constraintlayout.core.state.helpers.d */
public class C16757d extends C16745a {

    /* renamed from: n0 */
    public float f42553n0 = 0.5f;

    /* renamed from: o0 */
    public State.Chain f42554o0 = State.Chain.SPREAD;

    public C16757d(State state, State.C16743Helper helper) {
        super(state, helper);
    }

    /* renamed from: Q0 */
    public C16757d mo49259n(float f) {
        this.f42553n0 = f;
        return this;
    }

    /* renamed from: R0 */
    public float mo49346R0() {
        return this.f42553n0;
    }

    /* renamed from: S0 */
    public State.Chain mo49347S0() {
        return State.Chain.SPREAD;
    }

    /* renamed from: T0 */
    public C16757d mo49348T0(State.Chain chain) {
        this.f42554o0 = chain;
        return this;
    }
}
