package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16803g;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.m */
public class C16792m extends WidgetRun {

    /* renamed from: k */
    public DependencyNode f42886k;

    /* renamed from: l */
    public C16784f f42887l = null;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.m$a */
    public static /* synthetic */ class C16793a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42888a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42888a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42888a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42888a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16792m.C16793a.<clinit>():void");
        }
    }

    public C16792m(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f42886k = dependencyNode;
        this.f42819h.f42795e = DependencyNode.Type.f42808f;
        this.f42820i.f42795e = DependencyNode.Type.BOTTOM;
        dependencyNode.f42795e = DependencyNode.Type.BASELINE;
        this.f42817f = 1;
    }

    /* renamed from: a */
    public void mo49621a(C16782d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C16793a.f42888a[this.f42821j.ordinal()];
        if (i2 == 1) {
            mo49644s(dVar);
        } else if (i2 == 2) {
            mo49643r(dVar);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget = this.f42813b;
            mo49642q(dVar, constraintWidget.f42710R, constraintWidget.f42714T, 1);
            return;
        }
        C16784f fVar = this.f42816e;
        if (fVar.f42793c && !fVar.f42800j && this.f42815d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f42813b;
            int i3 = constraintWidget2.f42768x;
            if (i3 == 2) {
                ConstraintWidget U = constraintWidget2.mo49507U();
                if (U != null) {
                    C16784f fVar2 = U.f42732f.f42816e;
                    if (fVar2.f42800j) {
                        this.f42816e.mo49625e((int) ((((float) fVar2.f42797g) * this.f42813b.f42684E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget2.f42730e.f42816e.f42800j) {
                int B = constraintWidget2.mo49450B();
                if (B == -1) {
                    ConstraintWidget constraintWidget3 = this.f42813b;
                    f3 = (float) constraintWidget3.f42730e.f42816e.f42797g;
                    f2 = constraintWidget3.mo49447A();
                } else if (B == 0) {
                    ConstraintWidget constraintWidget4 = this.f42813b;
                    f = ((float) constraintWidget4.f42730e.f42816e.f42797g) * constraintWidget4.mo49447A();
                    i = (int) (f + 0.5f);
                    this.f42816e.mo49625e(i);
                } else if (B != 1) {
                    i = 0;
                    this.f42816e.mo49625e(i);
                } else {
                    ConstraintWidget constraintWidget5 = this.f42813b;
                    f3 = (float) constraintWidget5.f42730e.f42816e.f42797g;
                    f2 = constraintWidget5.mo49447A();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f42816e.mo49625e(i);
            }
        }
        DependencyNode dependencyNode = this.f42819h;
        if (dependencyNode.f42793c) {
            DependencyNode dependencyNode2 = this.f42820i;
            if (dependencyNode2.f42793c) {
                if (!dependencyNode.f42800j || !dependencyNode2.f42800j || !this.f42816e.f42800j) {
                    if (!this.f42816e.f42800j && this.f42815d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget6 = this.f42813b;
                        if (constraintWidget6.f42766w == 0 && !constraintWidget6.mo49457D0()) {
                            int i4 = this.f42819h.f42802l.get(0).f42797g;
                            DependencyNode dependencyNode3 = this.f42819h;
                            int i5 = i4 + dependencyNode3.f42796f;
                            int i6 = this.f42820i.f42802l.get(0).f42797g + this.f42820i.f42796f;
                            dependencyNode3.mo49625e(i5);
                            this.f42820i.mo49625e(i6);
                            this.f42816e.mo49625e(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f42816e.f42800j && this.f42815d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f42812a == 1 && this.f42819h.f42802l.size() > 0 && this.f42820i.f42802l.size() > 0) {
                        int i7 = (this.f42820i.f42802l.get(0).f42797g + this.f42820i.f42796f) - (this.f42819h.f42802l.get(0).f42797g + this.f42819h.f42796f);
                        C16784f fVar3 = this.f42816e;
                        int i8 = fVar3.f42864m;
                        if (i7 < i8) {
                            fVar3.mo49625e(i7);
                        } else {
                            fVar3.mo49625e(i8);
                        }
                    }
                    if (this.f42816e.f42800j && this.f42819h.f42802l.size() > 0 && this.f42820i.f42802l.size() > 0) {
                        DependencyNode dependencyNode4 = this.f42819h.f42802l.get(0);
                        DependencyNode dependencyNode5 = this.f42820i.f42802l.get(0);
                        int i9 = dependencyNode4.f42797g + this.f42819h.f42796f;
                        int i10 = dependencyNode5.f42797g + this.f42820i.f42796f;
                        float g0 = this.f42813b.mo49547g0();
                        if (dependencyNode4 == dependencyNode5) {
                            i9 = dependencyNode4.f42797g;
                            i10 = dependencyNode5.f42797g;
                            g0 = 0.5f;
                        }
                        this.f42819h.mo49625e((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f42816e.f42797g)) * g0)));
                        this.f42820i.mo49625e(this.f42819h.f42797g + this.f42816e.f42797g);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo49629d() {
        ConstraintWidget U;
        ConstraintWidget U2;
        ConstraintWidget constraintWidget = this.f42813b;
        if (constraintWidget.f42722a) {
            this.f42816e.mo49625e(constraintWidget.mo49456D());
        }
        if (!this.f42816e.f42800j) {
            this.f42815d = this.f42813b.mo49559j0();
            if (this.f42813b.mo49581q0()) {
                this.f42887l = new C16777a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f42815d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (U2 = this.f42813b.mo49507U()) != null && U2.mo49559j0() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int D = (U2.mo49456D() - this.f42813b.f42710R.mo49426g()) - this.f42813b.f42714T.mo49426g();
                    mo49627b(this.f42819h, U2.f42732f.f42819h, this.f42813b.f42710R.mo49426g());
                    mo49627b(this.f42820i, U2.f42732f.f42820i, -this.f42813b.f42714T.mo49426g());
                    this.f42816e.mo49625e(D);
                    return;
                } else if (this.f42815d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f42816e.mo49625e(this.f42813b.mo49456D());
                }
            }
        } else if (this.f42815d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (U = this.f42813b.mo49507U()) != null && U.mo49559j0() == ConstraintWidget.DimensionBehaviour.FIXED) {
            mo49627b(this.f42819h, U.f42732f.f42819h, this.f42813b.f42710R.mo49426g());
            mo49627b(this.f42820i, U.f42732f.f42820i, -this.f42813b.f42714T.mo49426g());
            return;
        }
        C16784f fVar = this.f42816e;
        boolean z = fVar.f42800j;
        if (z) {
            ConstraintWidget constraintWidget2 = this.f42813b;
            if (constraintWidget2.f42722a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f42720Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f42629f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f42629f != null) {
                    if (constraintWidget2.mo49457D0()) {
                        this.f42819h.f42796f = this.f42813b.f42720Y[2].mo49426g();
                        this.f42820i.f42796f = -this.f42813b.f42720Y[3].mo49426g();
                    } else {
                        DependencyNode h = mo49633h(this.f42813b.f42720Y[2]);
                        if (h != null) {
                            mo49627b(this.f42819h, h, this.f42813b.f42720Y[2].mo49426g());
                        }
                        DependencyNode h2 = mo49633h(this.f42813b.f42720Y[3]);
                        if (h2 != null) {
                            mo49627b(this.f42820i, h2, -this.f42813b.f42720Y[3].mo49426g());
                        }
                        this.f42819h.f42792b = true;
                        this.f42820i.f42792b = true;
                    }
                    if (this.f42813b.mo49581q0()) {
                        mo49627b(this.f42886k, this.f42819h, this.f42813b.mo49589t());
                        return;
                    }
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode h3 = mo49633h(constraintAnchor);
                    if (h3 != null) {
                        mo49627b(this.f42819h, h3, this.f42813b.f42720Y[2].mo49426g());
                        mo49627b(this.f42820i, this.f42819h, this.f42816e.f42797g);
                        if (this.f42813b.mo49581q0()) {
                            mo49627b(this.f42886k, this.f42819h, this.f42813b.mo49589t());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.f42629f != null) {
                        DependencyNode h4 = mo49633h(constraintAnchor3);
                        if (h4 != null) {
                            mo49627b(this.f42820i, h4, -this.f42813b.f42720Y[3].mo49426g());
                            mo49627b(this.f42819h, this.f42820i, -this.f42816e.f42797g);
                        }
                        if (this.f42813b.mo49581q0()) {
                            mo49627b(this.f42886k, this.f42819h, this.f42813b.mo49589t());
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                    if (constraintAnchor4.f42629f != null) {
                        DependencyNode h5 = mo49633h(constraintAnchor4);
                        if (h5 != null) {
                            mo49627b(this.f42886k, h5, 0);
                            mo49627b(this.f42819h, this.f42886k, -this.f42813b.mo49589t());
                            mo49627b(this.f42820i, this.f42819h, this.f42816e.f42797g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof C16803g) && constraintWidget2.mo49507U() != null && this.f42813b.mo49583r(ConstraintAnchor.Type.CENTER).f42629f == null) {
                        mo49627b(this.f42819h, this.f42813b.mo49507U().f42732f.f42819h, this.f42813b.mo49578p0());
                        mo49627b(this.f42820i, this.f42819h, this.f42816e.f42797g);
                        if (this.f42813b.mo49581q0()) {
                            mo49627b(this.f42886k, this.f42819h, this.f42813b.mo49589t());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z || this.f42815d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            fVar.mo49622b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f42813b;
            int i = constraintWidget3.f42768x;
            if (i == 2) {
                ConstraintWidget U3 = constraintWidget3.mo49507U();
                if (U3 != null) {
                    C16784f fVar2 = U3.f42732f.f42816e;
                    this.f42816e.f42802l.add(fVar2);
                    fVar2.f42801k.add(this.f42816e);
                    C16784f fVar3 = this.f42816e;
                    fVar3.f42792b = true;
                    fVar3.f42801k.add(this.f42819h);
                    this.f42816e.f42801k.add(this.f42820i);
                }
            } else if (i == 3 && !constraintWidget3.mo49457D0()) {
                ConstraintWidget constraintWidget4 = this.f42813b;
                if (constraintWidget4.f42766w != 3) {
                    C16784f fVar4 = constraintWidget4.f42730e.f42816e;
                    this.f42816e.f42802l.add(fVar4);
                    fVar4.f42801k.add(this.f42816e);
                    C16784f fVar5 = this.f42816e;
                    fVar5.f42792b = true;
                    fVar5.f42801k.add(this.f42819h);
                    this.f42816e.f42801k.add(this.f42820i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f42813b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.f42720Y;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f42629f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f42629f != null) {
            if (constraintWidget5.mo49457D0()) {
                this.f42819h.f42796f = this.f42813b.f42720Y[2].mo49426g();
                this.f42820i.f42796f = -this.f42813b.f42720Y[3].mo49426g();
            } else {
                DependencyNode h6 = mo49633h(this.f42813b.f42720Y[2]);
                DependencyNode h7 = mo49633h(this.f42813b.f42720Y[3]);
                if (h6 != null) {
                    h6.mo49622b(this);
                }
                if (h7 != null) {
                    h7.mo49622b(this);
                }
                this.f42821j = WidgetRun.RunType.CENTER;
            }
            if (this.f42813b.mo49581q0()) {
                mo49628c(this.f42886k, this.f42819h, 1, this.f42887l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode h8 = mo49633h(constraintAnchor5);
            if (h8 != null) {
                mo49627b(this.f42819h, h8, this.f42813b.f42720Y[2].mo49426g());
                mo49628c(this.f42820i, this.f42819h, 1, this.f42816e);
                if (this.f42813b.mo49581q0()) {
                    mo49628c(this.f42886k, this.f42819h, 1, this.f42887l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f42815d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f42813b.mo49447A() > 0.0f) {
                    C16789k kVar = this.f42813b.f42730e;
                    if (kVar.f42815d == dimensionBehaviour3) {
                        kVar.f42816e.f42801k.add(this.f42816e);
                        this.f42816e.f42802l.add(this.f42813b.f42730e.f42816e);
                        this.f42816e.f42791a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f42629f != null) {
                DependencyNode h9 = mo49633h(constraintAnchor7);
                if (h9 != null) {
                    mo49627b(this.f42820i, h9, -this.f42813b.f42720Y[3].mo49426g());
                    mo49628c(this.f42819h, this.f42820i, -1, this.f42816e);
                    if (this.f42813b.mo49581q0()) {
                        mo49628c(this.f42886k, this.f42819h, 1, this.f42887l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f42629f != null) {
                    DependencyNode h10 = mo49633h(constraintAnchor8);
                    if (h10 != null) {
                        mo49627b(this.f42886k, h10, 0);
                        mo49628c(this.f42819h, this.f42886k, -1, this.f42887l);
                        mo49628c(this.f42820i, this.f42819h, 1, this.f42816e);
                    }
                } else if (!(constraintWidget5 instanceof C16803g) && constraintWidget5.mo49507U() != null) {
                    mo49627b(this.f42819h, this.f42813b.mo49507U().f42732f.f42819h, this.f42813b.mo49578p0());
                    mo49628c(this.f42820i, this.f42819h, 1, this.f42816e);
                    if (this.f42813b.mo49581q0()) {
                        mo49628c(this.f42886k, this.f42819h, 1, this.f42887l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f42815d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f42813b.mo49447A() > 0.0f) {
                        C16789k kVar2 = this.f42813b.f42730e;
                        if (kVar2.f42815d == dimensionBehaviour5) {
                            kVar2.f42816e.f42801k.add(this.f42816e);
                            this.f42816e.f42802l.add(this.f42813b.f42730e.f42816e);
                            this.f42816e.f42791a = this;
                        }
                    }
                }
            }
        }
        if (this.f42816e.f42802l.size() == 0) {
            this.f42816e.f42793c = true;
        }
    }

    /* renamed from: e */
    public void mo49630e() {
        DependencyNode dependencyNode = this.f42819h;
        if (dependencyNode.f42800j) {
            this.f42813b.mo49549g2(dependencyNode.f42797g);
        }
    }

    /* renamed from: f */
    public void mo49631f() {
        this.f42814c = null;
        this.f42819h.mo49623c();
        this.f42820i.mo49623c();
        this.f42886k.mo49623c();
        this.f42816e.mo49623c();
        this.f42818g = false;
    }

    /* renamed from: n */
    public void mo49639n() {
        this.f42818g = false;
        this.f42819h.mo49623c();
        this.f42819h.f42800j = false;
        this.f42820i.mo49623c();
        this.f42820i.f42800j = false;
        this.f42886k.mo49623c();
        this.f42886k.f42800j = false;
        this.f42816e.f42800j = false;
    }

    /* renamed from: p */
    public boolean mo49641p() {
        if (this.f42815d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f42813b.f42768x == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "VerticalRun " + this.f42813b.mo49605y();
    }
}
