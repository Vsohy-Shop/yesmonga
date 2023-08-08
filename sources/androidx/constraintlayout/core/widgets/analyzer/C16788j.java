package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16775a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.j */
public class C16788j extends WidgetRun {
    public C16788j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: a */
    public void mo49621a(C16782d dVar) {
        C16775a aVar = (C16775a) this.f42813b;
        int p2 = aVar.mo49614p2();
        int i = 0;
        int i2 = -1;
        for (DependencyNode dependencyNode : this.f42819h.f42802l) {
            int i3 = dependencyNode.f42797g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (p2 == 0 || p2 == 2) {
            this.f42819h.mo49625e(i2 + aVar.mo49615q2());
        } else {
            this.f42819h.mo49625e(i + aVar.mo49615q2());
        }
    }

    /* renamed from: d */
    public void mo49629d() {
        ConstraintWidget constraintWidget = this.f42813b;
        if (constraintWidget instanceof C16775a) {
            this.f42819h.f42792b = true;
            C16775a aVar = (C16775a) constraintWidget;
            int p2 = aVar.mo49614p2();
            boolean o2 = aVar.mo49613o2();
            int i = 0;
            if (p2 == 0) {
                this.f42819h.f42795e = DependencyNode.Type.LEFT;
                while (i < aVar.f43035B1) {
                    ConstraintWidget constraintWidget2 = aVar.f43034A1[i];
                    if (o2 || constraintWidget2.mo49566l0() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f42730e.f42819h;
                        dependencyNode.f42801k.add(this.f42819h);
                        this.f42819h.f42802l.add(dependencyNode);
                    }
                    i++;
                }
                mo49678u(this.f42813b.f42730e.f42819h);
                mo49678u(this.f42813b.f42730e.f42820i);
            } else if (p2 == 1) {
                this.f42819h.f42795e = DependencyNode.Type.RIGHT;
                while (i < aVar.f43035B1) {
                    ConstraintWidget constraintWidget3 = aVar.f43034A1[i];
                    if (o2 || constraintWidget3.mo49566l0() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f42730e.f42820i;
                        dependencyNode2.f42801k.add(this.f42819h);
                        this.f42819h.f42802l.add(dependencyNode2);
                    }
                    i++;
                }
                mo49678u(this.f42813b.f42730e.f42819h);
                mo49678u(this.f42813b.f42730e.f42820i);
            } else if (p2 == 2) {
                this.f42819h.f42795e = DependencyNode.Type.f42808f;
                while (i < aVar.f43035B1) {
                    ConstraintWidget constraintWidget4 = aVar.f43034A1[i];
                    if (o2 || constraintWidget4.mo49566l0() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f42732f.f42819h;
                        dependencyNode3.f42801k.add(this.f42819h);
                        this.f42819h.f42802l.add(dependencyNode3);
                    }
                    i++;
                }
                mo49678u(this.f42813b.f42732f.f42819h);
                mo49678u(this.f42813b.f42732f.f42820i);
            } else if (p2 == 3) {
                this.f42819h.f42795e = DependencyNode.Type.BOTTOM;
                while (i < aVar.f43035B1) {
                    ConstraintWidget constraintWidget5 = aVar.f43034A1[i];
                    if (o2 || constraintWidget5.mo49566l0() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.f42732f.f42820i;
                        dependencyNode4.f42801k.add(this.f42819h);
                        this.f42819h.f42802l.add(dependencyNode4);
                    }
                    i++;
                }
                mo49678u(this.f42813b.f42732f.f42819h);
                mo49678u(this.f42813b.f42732f.f42820i);
            }
        }
    }

    /* renamed from: e */
    public void mo49630e() {
        ConstraintWidget constraintWidget = this.f42813b;
        if (constraintWidget instanceof C16775a) {
            int p2 = ((C16775a) constraintWidget).mo49614p2();
            if (p2 == 0 || p2 == 1) {
                this.f42813b.mo49545f2(this.f42819h.f42797g);
            } else {
                this.f42813b.mo49549g2(this.f42819h.f42797g);
            }
        }
    }

    /* renamed from: f */
    public void mo49631f() {
        this.f42814c = null;
        this.f42819h.mo49623c();
    }

    /* renamed from: n */
    public void mo49639n() {
        this.f42819h.f42800j = false;
    }

    /* renamed from: p */
    public boolean mo49641p() {
        return false;
    }

    /* renamed from: u */
    public final void mo49678u(DependencyNode dependencyNode) {
        this.f42819h.f42801k.add(dependencyNode);
        dependencyNode.f42802l.add(this.f42819h);
    }
}
