package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.i */
public class C16787i extends WidgetRun {
    public C16787i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f42730e.mo49631f();
        constraintWidget.f42732f.mo49631f();
        this.f42817f = ((C16801f) constraintWidget).mo49795m2();
    }

    /* renamed from: a */
    public void mo49621a(C16782d dVar) {
        DependencyNode dependencyNode = this.f42819h;
        if (dependencyNode.f42793c && !dependencyNode.f42800j) {
            this.f42819h.mo49625e((int) ((((float) dependencyNode.f42802l.get(0).f42797g) * ((C16801f) this.f42813b).mo49799q2()) + 0.5f));
        }
    }

    /* renamed from: d */
    public void mo49629d() {
        C16801f fVar = (C16801f) this.f42813b;
        int n2 = fVar.mo49796n2();
        int p2 = fVar.mo49798p2();
        fVar.mo49799q2();
        if (fVar.mo49795m2() == 1) {
            if (n2 != -1) {
                this.f42819h.f42802l.add(this.f42813b.f42727c0.f42730e.f42819h);
                this.f42813b.f42727c0.f42730e.f42819h.f42801k.add(this.f42819h);
                this.f42819h.f42796f = n2;
            } else if (p2 != -1) {
                this.f42819h.f42802l.add(this.f42813b.f42727c0.f42730e.f42820i);
                this.f42813b.f42727c0.f42730e.f42820i.f42801k.add(this.f42819h);
                this.f42819h.f42796f = -p2;
            } else {
                DependencyNode dependencyNode = this.f42819h;
                dependencyNode.f42792b = true;
                dependencyNode.f42802l.add(this.f42813b.f42727c0.f42730e.f42820i);
                this.f42813b.f42727c0.f42730e.f42820i.f42801k.add(this.f42819h);
            }
            mo49677u(this.f42813b.f42730e.f42819h);
            mo49677u(this.f42813b.f42730e.f42820i);
            return;
        }
        if (n2 != -1) {
            this.f42819h.f42802l.add(this.f42813b.f42727c0.f42732f.f42819h);
            this.f42813b.f42727c0.f42732f.f42819h.f42801k.add(this.f42819h);
            this.f42819h.f42796f = n2;
        } else if (p2 != -1) {
            this.f42819h.f42802l.add(this.f42813b.f42727c0.f42732f.f42820i);
            this.f42813b.f42727c0.f42732f.f42820i.f42801k.add(this.f42819h);
            this.f42819h.f42796f = -p2;
        } else {
            DependencyNode dependencyNode2 = this.f42819h;
            dependencyNode2.f42792b = true;
            dependencyNode2.f42802l.add(this.f42813b.f42727c0.f42732f.f42820i);
            this.f42813b.f42727c0.f42732f.f42820i.f42801k.add(this.f42819h);
        }
        mo49677u(this.f42813b.f42732f.f42819h);
        mo49677u(this.f42813b.f42732f.f42820i);
    }

    /* renamed from: e */
    public void mo49630e() {
        if (((C16801f) this.f42813b).mo49795m2() == 1) {
            this.f42813b.mo49545f2(this.f42819h.f42797g);
        } else {
            this.f42813b.mo49549g2(this.f42819h.f42797g);
        }
    }

    /* renamed from: f */
    public void mo49631f() {
        this.f42819h.mo49623c();
    }

    /* renamed from: n */
    public void mo49639n() {
        this.f42819h.f42800j = false;
        this.f42820i.f42800j = false;
    }

    /* renamed from: p */
    public boolean mo49641p() {
        return false;
    }

    /* renamed from: u */
    public final void mo49677u(DependencyNode dependencyNode) {
        this.f42819h.f42801k.add(dependencyNode);
        dependencyNode.f42802l.add(this.f42819h);
    }
}
