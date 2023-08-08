package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class WidgetRun implements C16782d {

    /* renamed from: a */
    public int f42812a;

    /* renamed from: b */
    public ConstraintWidget f42813b;

    /* renamed from: c */
    public C16791l f42814c;

    /* renamed from: d */
    public ConstraintWidget.DimensionBehaviour f42815d;

    /* renamed from: e */
    public C16784f f42816e = new C16784f(this);

    /* renamed from: f */
    public int f42817f = 0;

    /* renamed from: g */
    public boolean f42818g = false;

    /* renamed from: h */
    public DependencyNode f42819h = new DependencyNode(this);

    /* renamed from: i */
    public DependencyNode f42820i = new DependencyNode(this);

    /* renamed from: j */
    public RunType f42821j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$a */
    public static /* synthetic */ class C16776a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42827a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42827a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42827a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42827a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.f42635c     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42827a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42827a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C16776a.<clinit>():void");
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f42813b = constraintWidget;
    }

    /* renamed from: a */
    public void mo49621a(C16782d dVar) {
    }

    /* renamed from: b */
    public final void mo49627b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f42802l.add(dependencyNode2);
        dependencyNode.f42796f = i;
        dependencyNode2.f42801k.add(dependencyNode);
    }

    /* renamed from: c */
    public final void mo49628c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, C16784f fVar) {
        dependencyNode.f42802l.add(dependencyNode2);
        dependencyNode.f42802l.add(this.f42816e);
        dependencyNode.f42798h = i;
        dependencyNode.f42799i = fVar;
        dependencyNode2.f42801k.add(dependencyNode);
        fVar.f42801k.add(dependencyNode);
    }

    /* renamed from: d */
    public abstract void mo49629d();

    /* renamed from: e */
    public abstract void mo49630e();

    /* renamed from: f */
    public abstract void mo49631f();

    /* renamed from: g */
    public final int mo49632g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f42813b;
            int i4 = constraintWidget.f42676A;
            i3 = Math.max(constraintWidget.f42772z, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f42813b;
            int i5 = constraintWidget2.f42682D;
            int max = Math.max(constraintWidget2.f42680C, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: h */
    public final DependencyNode mo49633h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f42629f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f42627d;
        int i = C16776a.f42827a[constraintAnchor2.f42628e.ordinal()];
        if (i == 1) {
            return constraintWidget.f42730e.f42819h;
        }
        if (i == 2) {
            return constraintWidget.f42730e.f42820i;
        }
        if (i == 3) {
            return constraintWidget.f42732f.f42819h;
        }
        if (i == 4) {
            return constraintWidget.f42732f.f42886k;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f42732f.f42820i;
    }

    /* renamed from: i */
    public final DependencyNode mo49634i(ConstraintAnchor constraintAnchor, int i) {
        WidgetRun widgetRun;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f42629f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f42627d;
        if (i == 0) {
            widgetRun = constraintWidget.f42730e;
        } else {
            widgetRun = constraintWidget.f42732f;
        }
        int i2 = C16776a.f42827a[constraintAnchor2.f42628e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f42820i;
        }
        return widgetRun.f42819h;
    }

    /* renamed from: j */
    public long mo49635j() {
        C16784f fVar = this.f42816e;
        if (fVar.f42800j) {
            return (long) fVar.f42797g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo49636k() {
        int size = this.f42819h.f42802l.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f42819h.f42802l.get(i2).f42794d != this) {
                i++;
            }
        }
        int size2 = this.f42820i.f42802l.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.f42820i.f42802l.get(i3).f42794d != this) {
                i++;
            }
        }
        if (i >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo49637l() {
        return this.f42816e.f42800j;
    }

    /* renamed from: m */
    public boolean mo49638m() {
        return this.f42818g;
    }

    /* renamed from: n */
    public abstract void mo49639n();

    /* renamed from: o */
    public final void mo49640o(int i, int i2) {
        WidgetRun widgetRun;
        float f;
        int i3;
        int i4 = this.f42812a;
        if (i4 == 0) {
            this.f42816e.mo49625e(mo49632g(i2, i));
        } else if (i4 == 1) {
            this.f42816e.mo49625e(Math.min(mo49632g(this.f42816e.f42864m, i), i2));
        } else if (i4 == 2) {
            ConstraintWidget U = this.f42813b.mo49507U();
            if (U != null) {
                if (i == 0) {
                    widgetRun = U.f42730e;
                } else {
                    widgetRun = U.f42732f;
                }
                C16784f fVar = widgetRun.f42816e;
                if (fVar.f42800j) {
                    ConstraintWidget constraintWidget = this.f42813b;
                    if (i == 0) {
                        f = constraintWidget.f42678B;
                    } else {
                        f = constraintWidget.f42684E;
                    }
                    this.f42816e.mo49625e(mo49632g((int) ((((float) fVar.f42797g) * f) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            ConstraintWidget constraintWidget2 = this.f42813b;
            WidgetRun widgetRun2 = constraintWidget2.f42730e;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun2.f42815d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && widgetRun2.f42812a == 3) {
                C16792m mVar = constraintWidget2.f42732f;
                if (mVar.f42815d == dimensionBehaviour2 && mVar.f42812a == 3) {
                    return;
                }
            }
            if (i == 0) {
                widgetRun2 = constraintWidget2.f42732f;
            }
            if (widgetRun2.f42816e.f42800j) {
                float A = constraintWidget2.mo49447A();
                if (i == 1) {
                    i3 = (int) ((((float) widgetRun2.f42816e.f42797g) / A) + 0.5f);
                } else {
                    i3 = (int) ((A * ((float) widgetRun2.f42816e.f42797g)) + 0.5f);
                }
                this.f42816e.mo49625e(i3);
            }
        }
    }

    /* renamed from: p */
    public abstract boolean mo49641p();

    /* renamed from: q */
    public void mo49642q(C16782d dVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        float f;
        DependencyNode h = mo49633h(constraintAnchor);
        DependencyNode h2 = mo49633h(constraintAnchor2);
        if (h.f42800j && h2.f42800j) {
            int g = h.f42797g + constraintAnchor.mo49426g();
            int g2 = h2.f42797g - constraintAnchor2.mo49426g();
            int i2 = g2 - g;
            if (!this.f42816e.f42800j && this.f42815d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                mo49640o(i, i2);
            }
            C16784f fVar = this.f42816e;
            if (fVar.f42800j) {
                if (fVar.f42797g == i2) {
                    this.f42819h.mo49625e(g);
                    this.f42820i.mo49625e(g2);
                    return;
                }
                ConstraintWidget constraintWidget = this.f42813b;
                if (i == 0) {
                    f = constraintWidget.mo49459E();
                } else {
                    f = constraintWidget.mo49547g0();
                }
                if (h == h2) {
                    g = h.f42797g;
                    g2 = h2.f42797g;
                    f = 0.5f;
                }
                this.f42819h.mo49625e((int) (((float) g) + 0.5f + (((float) ((g2 - g) - this.f42816e.f42797g)) * f)));
                this.f42820i.mo49625e(this.f42819h.f42797g + this.f42816e.f42797g);
            }
        }
    }

    /* renamed from: r */
    public void mo49643r(C16782d dVar) {
    }

    /* renamed from: s */
    public void mo49644s(C16782d dVar) {
    }

    /* renamed from: t */
    public long mo49645t(int i) {
        int i2;
        C16784f fVar = this.f42816e;
        if (!fVar.f42800j) {
            return 0;
        }
        long j = (long) fVar.f42797g;
        if (mo49636k()) {
            i2 = this.f42819h.f42796f - this.f42820i.f42796f;
        } else if (i != 0) {
            return j - ((long) this.f42820i.f42796f);
        } else {
            i2 = this.f42819h.f42796f;
        }
        return j + ((long) i2);
    }
}
