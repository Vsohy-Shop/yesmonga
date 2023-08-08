package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.c */
public class C16797c {

    /* renamed from: a */
    public ConstraintWidget f42907a;

    /* renamed from: b */
    public ConstraintWidget f42908b;

    /* renamed from: c */
    public ConstraintWidget f42909c;

    /* renamed from: d */
    public ConstraintWidget f42910d;

    /* renamed from: e */
    public ConstraintWidget f42911e;

    /* renamed from: f */
    public ConstraintWidget f42912f;

    /* renamed from: g */
    public ConstraintWidget f42913g;

    /* renamed from: h */
    public ArrayList<ConstraintWidget> f42914h;

    /* renamed from: i */
    public int f42915i;

    /* renamed from: j */
    public int f42916j;

    /* renamed from: k */
    public float f42917k = 0.0f;

    /* renamed from: l */
    public int f42918l;

    /* renamed from: m */
    public int f42919m;

    /* renamed from: n */
    public int f42920n;

    /* renamed from: o */
    public boolean f42921o;

    /* renamed from: p */
    public int f42922p;

    /* renamed from: q */
    public boolean f42923q;

    /* renamed from: r */
    public boolean f42924r;

    /* renamed from: s */
    public boolean f42925s;

    /* renamed from: t */
    public boolean f42926t;

    /* renamed from: u */
    public boolean f42927u;

    /* renamed from: v */
    public boolean f42928v;

    public C16797c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f42907a = constraintWidget;
        this.f42922p = i;
        this.f42923q = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f42770y[r3];
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m77086k(androidx.constraintlayout.core.widgets.ConstraintWidget r2, int r3) {
        /*
            int r0 = r2.mo49566l0()
            r1 = 8
            if (r0 == r1) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.f42725b0
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001b
            int[] r2 = r2.f42770y
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0019
            r3 = 3
            if (r2 != r3) goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C16797c.m77086k(androidx.constraintlayout.core.widgets.ConstraintWidget, int):boolean");
    }

    /* renamed from: a */
    public void mo49707a() {
        if (!this.f42928v) {
            mo49708b();
        }
        this.f42928v = true;
    }

    /* renamed from: b */
    public final void mo49708b() {
        int i = this.f42922p * 2;
        ConstraintWidget constraintWidget = this.f42907a;
        boolean z = true;
        this.f42921o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.f42915i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f42707P0;
            int i2 = this.f42922p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i2] = null;
            constraintWidget.f42705O0[i2] = null;
            if (constraintWidget.mo49566l0() != 8) {
                this.f42918l++;
                ConstraintWidget.DimensionBehaviour z3 = constraintWidget.mo49608z(this.f42922p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (z3 != dimensionBehaviour) {
                    this.f42919m += constraintWidget.mo49483M(this.f42922p);
                }
                int g = this.f42919m + constraintWidget.f42720Y[i].mo49426g();
                this.f42919m = g;
                int i3 = i + 1;
                this.f42919m = g + constraintWidget.f42720Y[i3].mo49426g();
                int g2 = this.f42920n + constraintWidget.f42720Y[i].mo49426g();
                this.f42920n = g2;
                this.f42920n = g2 + constraintWidget.f42720Y[i3].mo49426g();
                if (this.f42908b == null) {
                    this.f42908b = constraintWidget;
                }
                this.f42910d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f42725b0;
                int i4 = this.f42922p;
                if (dimensionBehaviourArr[i4] == dimensionBehaviour) {
                    int i5 = constraintWidget.f42770y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f42916j++;
                        float f = constraintWidget.f42703N0[i4];
                        if (f > 0.0f) {
                            this.f42917k += f;
                        }
                        if (m77086k(constraintWidget, i4)) {
                            if (f < 0.0f) {
                                this.f42924r = true;
                            } else {
                                this.f42925s = true;
                            }
                            if (this.f42914h == null) {
                                this.f42914h = new ArrayList<>();
                            }
                            this.f42914h.add(constraintWidget);
                        }
                        if (this.f42912f == null) {
                            this.f42912f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f42913g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f42705O0[this.f42922p] = constraintWidget;
                        }
                        this.f42913g = constraintWidget;
                    }
                    if (this.f42922p == 0) {
                        if (constraintWidget.f42766w != 0) {
                            this.f42921o = false;
                        } else if (!(constraintWidget.f42772z == 0 && constraintWidget.f42676A == 0)) {
                            this.f42921o = false;
                        }
                    } else if (constraintWidget.f42768x != 0) {
                        this.f42921o = false;
                    } else if (!(constraintWidget.f42680C == 0 && constraintWidget.f42682D == 0)) {
                        this.f42921o = false;
                    }
                    if (constraintWidget.f42733f0 != 0.0f) {
                        this.f42921o = false;
                        this.f42927u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f42707P0[this.f42922p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f42720Y[i + 1].f42629f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f42627d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f42720Y[i].f42629f;
                if (constraintAnchor2 != null && constraintAnchor2.f42627d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f42908b;
        if (constraintWidget6 != null) {
            this.f42919m -= constraintWidget6.f42720Y[i].mo49426g();
        }
        ConstraintWidget constraintWidget7 = this.f42910d;
        if (constraintWidget7 != null) {
            this.f42919m -= constraintWidget7.f42720Y[i + 1].mo49426g();
        }
        this.f42909c = constraintWidget;
        if (this.f42922p != 0 || !this.f42923q) {
            this.f42911e = this.f42907a;
        } else {
            this.f42911e = constraintWidget;
        }
        if (!this.f42925s || !this.f42924r) {
            z = false;
        }
        this.f42926t = z;
    }

    /* renamed from: c */
    public ConstraintWidget mo49709c() {
        return this.f42907a;
    }

    /* renamed from: d */
    public ConstraintWidget mo49710d() {
        return this.f42912f;
    }

    /* renamed from: e */
    public ConstraintWidget mo49711e() {
        return this.f42908b;
    }

    /* renamed from: f */
    public ConstraintWidget mo49712f() {
        return this.f42911e;
    }

    /* renamed from: g */
    public ConstraintWidget mo49713g() {
        return this.f42909c;
    }

    /* renamed from: h */
    public ConstraintWidget mo49714h() {
        return this.f42913g;
    }

    /* renamed from: i */
    public ConstraintWidget mo49715i() {
        return this.f42910d;
    }

    /* renamed from: j */
    public float mo49716j() {
        return this.f42917k;
    }
}
