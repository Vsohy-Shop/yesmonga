package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.C16747c;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.core.state.helpers.f */
public class C16759f implements C16758e, C16747c {

    /* renamed from: a */
    public final State f42555a;

    /* renamed from: b */
    public int f42556b;

    /* renamed from: c */
    public C16801f f42557c;

    /* renamed from: d */
    public int f42558d = -1;

    /* renamed from: e */
    public int f42559e = -1;

    /* renamed from: f */
    public float f42560f = 0.0f;

    /* renamed from: g */
    public Object f42561g;

    public C16759f(State state) {
        this.f42555a = state;
    }

    /* renamed from: a */
    public void mo49232a() {
        this.f42557c.mo49792B2(this.f42556b);
        int i = this.f42558d;
        if (i != -1) {
            this.f42557c.mo49805w2(i);
            return;
        }
        int i2 = this.f42559e;
        if (i2 != -1) {
            this.f42557c.mo49806x2(i2);
        } else {
            this.f42557c.mo49807y2(this.f42560f);
        }
    }

    /* renamed from: b */
    public ConstraintWidget mo49234b() {
        if (this.f42557c == null) {
            this.f42557c = new C16801f();
        }
        return this.f42557c;
    }

    /* renamed from: c */
    public void mo49236c(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof C16801f) {
            this.f42557c = (C16801f) constraintWidget;
        } else {
            this.f42557c = null;
        }
    }

    /* renamed from: d */
    public void mo49238d(Object obj) {
        this.f42561g = obj;
    }

    /* renamed from: e */
    public C16758e mo49240e() {
        return null;
    }

    /* renamed from: f */
    public C16759f mo49349f(Object obj) {
        this.f42558d = -1;
        this.f42559e = this.f42555a.mo48546f(obj);
        this.f42560f = 0.0f;
        return this;
    }

    /* renamed from: g */
    public int mo49350g() {
        return this.f42556b;
    }

    public Object getKey() {
        return this.f42561g;
    }

    /* renamed from: h */
    public C16759f mo49351h(float f) {
        this.f42558d = -1;
        this.f42559e = -1;
        this.f42560f = f;
        return this;
    }

    /* renamed from: i */
    public void mo49352i(int i) {
        this.f42556b = i;
    }

    /* renamed from: j */
    public C16759f mo49353j(Object obj) {
        this.f42558d = this.f42555a.mo48546f(obj);
        this.f42559e = -1;
        this.f42560f = 0.0f;
        return this;
    }
}
