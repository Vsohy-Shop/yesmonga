package androidx.constraintlayout.core.widgets.analyzer;

import com.google.firebase.installations.C33124s;
import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements C16782d {

    /* renamed from: a */
    public C16782d f42791a = null;

    /* renamed from: b */
    public boolean f42792b = false;

    /* renamed from: c */
    public boolean f42793c = false;

    /* renamed from: d */
    public WidgetRun f42794d;

    /* renamed from: e */
    public Type f42795e = Type.UNKNOWN;

    /* renamed from: f */
    public int f42796f;

    /* renamed from: g */
    public int f42797g;

    /* renamed from: h */
    public int f42798h = 1;

    /* renamed from: i */
    public C16784f f42799i = null;

    /* renamed from: j */
    public boolean f42800j = false;

    /* renamed from: k */
    public List<C16782d> f42801k = new ArrayList();

    /* renamed from: l */
    public List<DependencyNode> f42802l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        f42808f,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f42794d = widgetRun;
    }

    /* renamed from: a */
    public void mo49621a(C16782d dVar) {
        for (DependencyNode dependencyNode : this.f42802l) {
            if (!dependencyNode.f42800j) {
                return;
            }
        }
        this.f42793c = true;
        C16782d dVar2 = this.f42791a;
        if (dVar2 != null) {
            dVar2.mo49621a(this);
        }
        if (this.f42792b) {
            this.f42794d.mo49621a(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i = 0;
        for (DependencyNode next : this.f42802l) {
            if (!(next instanceof C16784f)) {
                i++;
                dependencyNode2 = next;
            }
        }
        if (dependencyNode2 != null && i == 1 && dependencyNode2.f42800j) {
            C16784f fVar = this.f42799i;
            if (fVar != null) {
                if (fVar.f42800j) {
                    this.f42796f = this.f42798h * fVar.f42797g;
                } else {
                    return;
                }
            }
            mo49625e(dependencyNode2.f42797g + this.f42796f);
        }
        C16782d dVar3 = this.f42791a;
        if (dVar3 != null) {
            dVar3.mo49621a(this);
        }
    }

    /* renamed from: b */
    public void mo49622b(C16782d dVar) {
        this.f42801k.add(dVar);
        if (this.f42800j) {
            dVar.mo49621a(dVar);
        }
    }

    /* renamed from: c */
    public void mo49623c() {
        this.f42802l.clear();
        this.f42801k.clear();
        this.f42800j = false;
        this.f42797g = 0;
        this.f42793c = false;
        this.f42792b = false;
    }

    /* renamed from: d */
    public String mo49624d() {
        String str;
        String y = this.f42794d.f42813b.mo49605y();
        Type type = this.f42795e;
        if (type == Type.LEFT || type == Type.RIGHT) {
            str = y + "_HORIZONTAL";
        } else {
            str = y + "_VERTICAL";
        }
        return str + C33124s.f80355c + this.f42795e.name();
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

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42794d.f42813b.mo49605y());
        sb.append(C33124s.f80355c);
        sb.append(this.f42795e);
        sb.append("(");
        if (this.f42800j) {
            obj = Integer.valueOf(this.f42797g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f42802l.size());
        sb.append(":d=");
        sb.append(this.f42801k.size());
        sb.append(">");
        return sb.toString();
    }
}
