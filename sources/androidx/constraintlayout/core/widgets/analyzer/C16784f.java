package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.f */
public class C16784f extends DependencyNode {

    /* renamed from: m */
    public int f42864m;

    public C16784f(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof C16789k) {
            this.f42795e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f42795e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: e */
    public void mo49625e(int i) {
        if (!this.f42800j) {
            this.f42800j = true;
            this.f42797g = i;
            for (C16782d next : this.f42801k) {
                next.mo49621a(next);
            }
        }
    }
}
