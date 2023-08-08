package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16775a;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C16778b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.e */
public class C16783e {

    /* renamed from: j */
    public static final boolean f42854j = true;

    /* renamed from: a */
    public C16798d f42855a;

    /* renamed from: b */
    public boolean f42856b = true;

    /* renamed from: c */
    public boolean f42857c = true;

    /* renamed from: d */
    public C16798d f42858d;

    /* renamed from: e */
    public ArrayList<WidgetRun> f42859e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<C16791l> f42860f = new ArrayList<>();

    /* renamed from: g */
    public C16778b.C16780b f42861g = null;

    /* renamed from: h */
    public C16778b.C16779a f42862h = new C16778b.C16779a();

    /* renamed from: i */
    public ArrayList<C16791l> f42863i = new ArrayList<>();

    public C16783e(C16798d dVar) {
        this.f42855a = dVar;
        this.f42858d = dVar;
    }

    /* renamed from: a */
    public final void mo49656a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<C16791l> arrayList, C16791l lVar) {
        WidgetRun widgetRun = dependencyNode.f42794d;
        if (widgetRun.f42814c == null) {
            C16798d dVar = this.f42855a;
            if (widgetRun != dVar.f42730e && widgetRun != dVar.f42732f) {
                if (lVar == null) {
                    lVar = new C16791l(widgetRun, i2);
                    arrayList.add(lVar);
                }
                widgetRun.f42814c = lVar;
                lVar.mo49681a(widgetRun);
                for (C16782d next : widgetRun.f42819h.f42801k) {
                    if (next instanceof DependencyNode) {
                        mo49656a((DependencyNode) next, i, 0, dependencyNode2, arrayList, lVar);
                    }
                }
                for (C16782d next2 : widgetRun.f42820i.f42801k) {
                    if (next2 instanceof DependencyNode) {
                        mo49656a((DependencyNode) next2, i, 1, dependencyNode2, arrayList, lVar);
                    }
                }
                if (i == 1 && (widgetRun instanceof C16792m)) {
                    for (C16782d next3 : ((C16792m) widgetRun).f42886k.f42801k) {
                        if (next3 instanceof DependencyNode) {
                            mo49656a((DependencyNode) next3, i, 2, dependencyNode2, arrayList, lVar);
                        }
                    }
                }
                for (DependencyNode next4 : widgetRun.f42819h.f42802l) {
                    if (next4 == dependencyNode2) {
                        lVar.f42880b = true;
                    }
                    mo49656a(next4, i, 0, dependencyNode2, arrayList, lVar);
                }
                for (DependencyNode next5 : widgetRun.f42820i.f42802l) {
                    if (next5 == dependencyNode2) {
                        lVar.f42880b = true;
                    }
                    mo49656a(next5, i, 1, dependencyNode2, arrayList, lVar);
                }
                if (i == 1 && (widgetRun instanceof C16792m)) {
                    for (DependencyNode a : ((C16792m) widgetRun).f42886k.f42802l) {
                        mo49656a(a, i, 2, dependencyNode2, arrayList, lVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
        r4 = r0.f42725b0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49657b(androidx.constraintlayout.core.widgets.C16798d r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.f43070A1
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0338
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.f42725b0
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.mo49566l0()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f42722a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f42678B
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f42766w = r7
        L_0x0036:
            float r6 = r2.f42684E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f42768x = r7
        L_0x0042:
            float r6 = r2.mo49447A()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0078
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f42766w = r8
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f42768x = r8
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f42766w
            if (r6 != 0) goto L_0x0072
            r2.f42766w = r8
        L_0x0072:
            int r6 = r2.f42768x
            if (r6 != 0) goto L_0x0078
            r2.f42768x = r8
        L_0x0078:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r9 = r2.f42766w
            if (r9 != r10) goto L_0x008e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f42708Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f42629f
            if (r9 == 0) goto L_0x008c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f42712S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f42629f
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008e:
            r9 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f42768x
            if (r5 != r10) goto L_0x00a3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f42629f
            if (r5 == 0) goto L_0x00a1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f42629f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            androidx.constraintlayout.core.widgets.analyzer.k r4 = r2.f42730e
            r4.f42815d = r9
            int r5 = r2.f42766w
            r4.f42812a = r5
            androidx.constraintlayout.core.widgets.analyzer.m r4 = r2.f42732f
            r4.f42815d = r12
            int r13 = r2.f42768x
            r4.f42812a = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r9 == r4) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r14) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02e2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r14) goto L_0x02e2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02e2
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0199
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r11) goto L_0x0199
        L_0x00d8:
            if (r5 != r8) goto L_0x0113
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.mo49673r(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.mo49456D()
            float r3 = (float) r9
            float r4 = r2.f42733f0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x0113:
            if (r5 != r10) goto L_0x012b
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r2 = r2.mo49569m0()
            r3.f42864m = r2
            goto L_0x0008
        L_0x012b:
            if (r5 != r7) goto L_0x0167
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r0.f42725b0
            r11 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r11 == r15) goto L_0x0137
            if (r11 != r4) goto L_0x0199
        L_0x0137:
            float r3 = r2.f42678B
            int r4 = r17.mo49569m0()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.mo49456D()
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x0167:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r11 = r2.f42720Y
            r7 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f42629f
            if (r7 == 0) goto L_0x0175
            r7 = r11[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f42629f
            if (r7 != 0) goto L_0x0199
        L_0x0175:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x0199:
            if (r12 != r6) goto L_0x0272
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 == r11) goto L_0x01a3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 != r7) goto L_0x0272
        L_0x01a3:
            if (r13 != r8) goto L_0x01e9
            if (r9 != r11) goto L_0x01b1
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.mo49673r(r5, r6, r7, r8, r9)
        L_0x01b1:
            int r7 = r2.mo49569m0()
            float r3 = r2.f42733f0
            int r4 = r2.mo49450B()
            r5 = -1
            if (r4 != r5) goto L_0x01c2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c2:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x01e9:
            if (r13 != r10) goto L_0x0202
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r2 = r2.mo49456D()
            r3.f42864m = r2
            goto L_0x0008
        L_0x0202:
            r7 = 2
            if (r13 != r7) goto L_0x023f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.f42725b0
            r7 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 == r8) goto L_0x020f
            if (r7 != r4) goto L_0x0272
        L_0x020f:
            float r3 = r2.f42684E
            int r7 = r2.mo49569m0()
            int r4 = r17.mo49456D()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x023f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.f42720Y
            r7 = 2
            r15 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r15.f42629f
            if (r7 == 0) goto L_0x024e
            r4 = r4[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f42629f
            if (r4 != 0) goto L_0x0272
        L_0x024e:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x0272:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02c1
            if (r13 != r10) goto L_0x027b
            goto L_0x02c1
        L_0x027b:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f42725b0
            r3 = r4[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f42678B
            float r4 = r2.f42684E
            int r5 = r17.mo49569m0()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.mo49456D()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x02c1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.f42864m = r4
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r2 = r2.mo49456D()
            r3.f42864m = r2
            goto L_0x0008
        L_0x02e2:
            int r3 = r2.mo49569m0()
            if (r9 != r4) goto L_0x02fb
            int r3 = r17.mo49569m0()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f42708Q
            int r5 = r5.f42630g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f42712S
            int r5 = r5.f42630g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L_0x02fd
        L_0x02fb:
            r7 = r3
            r6 = r9
        L_0x02fd:
            int r3 = r2.mo49456D()
            if (r12 != r4) goto L_0x0316
            int r3 = r17.mo49456D()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f42710R
            int r4 = r4.f42630g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f42714T
            int r4 = r4.f42630g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0318
        L_0x0316:
            r9 = r3
            r8 = r12
        L_0x0318:
            r4 = r16
            r5 = r2
            r4.mo49673r(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.k r3 = r2.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49569m0()
            r3.mo49625e(r4)
            androidx.constraintlayout.core.widgets.analyzer.m r3 = r2.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r3 = r3.f42816e
            int r4 = r2.mo49456D()
            r3.mo49625e(r4)
            r2.f42722a = r10
            goto L_0x0008
        L_0x0338:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16783e.mo49657b(androidx.constraintlayout.core.widgets.d):boolean");
    }

    /* renamed from: c */
    public void mo49658c() {
        mo49659d(this.f42859e);
        this.f42863i.clear();
        C16791l.f42878k = 0;
        mo49666k(this.f42855a.f42730e, 0, this.f42863i);
        mo49666k(this.f42855a.f42732f, 1, this.f42863i);
        this.f42856b = false;
    }

    /* renamed from: d */
    public void mo49659d(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f42858d.f42730e.mo49631f();
        this.f42858d.f42732f.mo49631f();
        arrayList.add(this.f42858d.f42730e);
        arrayList.add(this.f42858d.f42732f);
        Iterator<ConstraintWidget> it = this.f42858d.f43070A1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof C16801f) {
                arrayList.add(new C16787i(next));
            } else {
                if (next.mo49451B0()) {
                    if (next.f42726c == null) {
                        next.f42726c = new C16781c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f42726c);
                } else {
                    arrayList.add(next.f42730e);
                }
                if (next.mo49457D0()) {
                    if (next.f42728d == null) {
                        next.f42728d = new C16781c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f42728d);
                } else {
                    arrayList.add(next.f42732f);
                }
                if (next instanceof C16804h) {
                    arrayList.add(new C16788j(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo49631f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f42813b != this.f42858d) {
                next2.mo49629d();
            }
        }
    }

    /* renamed from: e */
    public final int mo49660e(C16798d dVar, int i) {
        int size = this.f42863i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f42863i.get(i2).mo49682b(dVar, i));
        }
        return (int) j;
    }

    /* renamed from: f */
    public void mo49661f(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        boolean z;
        boolean z2;
        if (this.f42856b) {
            mo49658c();
            Iterator<ConstraintWidget> it = this.f42855a.f43070A1.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                boolean[] zArr = next.f42734g;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof C16775a) {
                    z3 = true;
                }
            }
            if (!z3) {
                Iterator<C16791l> it2 = this.f42863i.iterator();
                while (it2.hasNext()) {
                    C16791l next2 = it2.next();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    next2.mo49684d(z, z2);
                }
            }
        }
    }

    /* renamed from: g */
    public boolean mo49662g(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f42856b || this.f42857c) {
            Iterator<ConstraintWidget> it = this.f42855a.f43070A1.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.mo49580q();
                next.f42722a = false;
                next.f42730e.mo49639n();
                next.f42732f.mo49639n();
            }
            this.f42855a.mo49580q();
            C16798d dVar = this.f42855a;
            dVar.f42722a = false;
            dVar.f42730e.mo49639n();
            this.f42855a.f42732f.mo49639n();
            this.f42857c = false;
        }
        if (mo49657b(this.f42858d)) {
            return false;
        }
        this.f42855a.mo49545f2(0);
        this.f42855a.mo49549g2(0);
        ConstraintWidget.DimensionBehaviour z5 = this.f42855a.mo49608z(0);
        ConstraintWidget.DimensionBehaviour z6 = this.f42855a.mo49608z(1);
        if (this.f42856b) {
            mo49658c();
        }
        int o0 = this.f42855a.mo49575o0();
        int p0 = this.f42855a.mo49578p0();
        this.f42855a.f42730e.f42819h.mo49625e(o0);
        this.f42855a.f42732f.f42819h.mo49625e(p0);
        mo49674s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (z5 == dimensionBehaviour || z6 == dimensionBehaviour) {
            if (z4) {
                Iterator<WidgetRun> it2 = this.f42859e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo49641p()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && z5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f42855a.mo49458D1(ConstraintWidget.DimensionBehaviour.FIXED);
                C16798d dVar2 = this.f42855a;
                dVar2.mo49533c2(mo49660e(dVar2, 0));
                C16798d dVar3 = this.f42855a;
                dVar3.f42730e.f42816e.mo49625e(dVar3.mo49569m0());
            }
            if (z4 && z6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f42855a.mo49521Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                C16798d dVar4 = this.f42855a;
                dVar4.mo49607y1(mo49660e(dVar4, 1));
                C16798d dVar5 = this.f42855a;
                dVar5.f42732f.f42816e.mo49625e(dVar5.mo49456D());
            }
        }
        C16798d dVar6 = this.f42855a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.f42725b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int m0 = dVar6.mo49569m0() + o0;
            this.f42855a.f42730e.f42820i.mo49625e(m0);
            this.f42855a.f42730e.f42816e.mo49625e(m0 - o0);
            mo49674s();
            C16798d dVar7 = this.f42855a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.f42725b0[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int D = dVar7.mo49456D() + p0;
                this.f42855a.f42732f.f42820i.mo49625e(D);
                this.f42855a.f42732f.f42816e.mo49625e(D - p0);
            }
            mo49674s();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.f42859e.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f42813b != this.f42855a || next2.f42818g) {
                next2.mo49630e();
            }
        }
        Iterator<WidgetRun> it4 = this.f42859e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            WidgetRun next3 = it4.next();
            if ((z2 || next3.f42813b != this.f42855a) && (!next3.f42819h.f42800j || ((!next3.f42820i.f42800j && !(next3 instanceof C16787i)) || (!next3.f42816e.f42800j && !(next3 instanceof C16781c) && !(next3 instanceof C16787i))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f42855a.mo49458D1(z5);
        this.f42855a.mo49521Y1(z6);
        return z3;
    }

    /* renamed from: h */
    public boolean mo49663h(boolean z) {
        if (this.f42856b) {
            Iterator<ConstraintWidget> it = this.f42855a.f43070A1.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.mo49580q();
                next.f42722a = false;
                C16789k kVar = next.f42730e;
                kVar.f42816e.f42800j = false;
                kVar.f42818g = false;
                kVar.mo49639n();
                C16792m mVar = next.f42732f;
                mVar.f42816e.f42800j = false;
                mVar.f42818g = false;
                mVar.mo49639n();
            }
            this.f42855a.mo49580q();
            C16798d dVar = this.f42855a;
            dVar.f42722a = false;
            C16789k kVar2 = dVar.f42730e;
            kVar2.f42816e.f42800j = false;
            kVar2.f42818g = false;
            kVar2.mo49639n();
            C16792m mVar2 = this.f42855a.f42732f;
            mVar2.f42816e.f42800j = false;
            mVar2.f42818g = false;
            mVar2.mo49639n();
            mo49658c();
        }
        if (mo49657b(this.f42858d)) {
            return false;
        }
        this.f42855a.mo49545f2(0);
        this.f42855a.mo49549g2(0);
        this.f42855a.f42730e.f42819h.mo49625e(0);
        this.f42855a.f42732f.f42819h.mo49625e(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013f A[EDGE_INSN: B:76:0x013f->B:62:0x013f ?: BREAK  , SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49664i(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.core.widgets.d r1 = r9.f42855a
            r2 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.mo49608z(r2)
            androidx.constraintlayout.core.widgets.d r3 = r9.f42855a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.mo49608z(r0)
            androidx.constraintlayout.core.widgets.d r4 = r9.f42855a
            int r4 = r4.mo49575o0()
            androidx.constraintlayout.core.widgets.d r5 = r9.f42855a
            int r5 = r5.mo49578p0()
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r9.f42859e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            int r8 = r7.f42817f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo49641p()
            if (r7 != 0) goto L_0x0029
            r10 = r2
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.mo49458D1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            int r6 = r9.mo49660e(r10, r2)
            r10.mo49533c2(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            androidx.constraintlayout.core.widgets.analyzer.k r6 = r10.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r6 = r6.f42816e
            int r10 = r10.mo49569m0()
            r6.mo49625e(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.mo49521Y1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            int r6 = r9.mo49660e(r10, r0)
            r10.mo49607y1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            androidx.constraintlayout.core.widgets.analyzer.m r6 = r10.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r6 = r6.f42816e
            int r10 = r10.mo49456D()
            r6.mo49625e(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b2
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.f42725b0
            r5 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r6) goto L_0x0099
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto L_0x00c1
        L_0x0099:
            int r10 = r10.mo49569m0()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.d r5 = r9.f42855a
            androidx.constraintlayout.core.widgets.analyzer.k r5 = r5.f42730e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f42820i
            r5.mo49625e(r10)
            androidx.constraintlayout.core.widgets.d r5 = r9.f42855a
            androidx.constraintlayout.core.widgets.analyzer.k r5 = r5.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r5 = r5.f42816e
            int r10 = r10 - r4
            r5.mo49625e(r10)
            goto L_0x00db
        L_0x00b2:
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.f42725b0
            r4 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r6) goto L_0x00c3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = r2
            goto L_0x00dc
        L_0x00c3:
            int r10 = r10.mo49456D()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.d r4 = r9.f42855a
            androidx.constraintlayout.core.widgets.analyzer.m r4 = r4.f42732f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.f42820i
            r4.mo49625e(r10)
            androidx.constraintlayout.core.widgets.d r4 = r9.f42855a
            androidx.constraintlayout.core.widgets.analyzer.m r4 = r4.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r4 = r4.f42816e
            int r10 = r10 - r5
            r4.mo49625e(r10)
        L_0x00db:
            r10 = r0
        L_0x00dc:
            r9.mo49674s()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.f42859e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f42817f
            if (r6 == r11) goto L_0x00f6
            goto L_0x00e5
        L_0x00f6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f42813b
            androidx.constraintlayout.core.widgets.d r7 = r9.f42855a
            if (r6 != r7) goto L_0x0101
            boolean r6 = r5.f42818g
            if (r6 != 0) goto L_0x0101
            goto L_0x00e5
        L_0x0101:
            r5.mo49630e()
            goto L_0x00e5
        L_0x0105:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.f42859e
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013f
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f42817f
            if (r6 == r11) goto L_0x011c
            goto L_0x010b
        L_0x011c:
            if (r10 != 0) goto L_0x0125
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f42813b
            androidx.constraintlayout.core.widgets.d r7 = r9.f42855a
            if (r6 != r7) goto L_0x0125
            goto L_0x010b
        L_0x0125:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f42819h
            boolean r6 = r6.f42800j
            if (r6 != 0) goto L_0x012d
        L_0x012b:
            r0 = r2
            goto L_0x013f
        L_0x012d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f42820i
            boolean r6 = r6.f42800j
            if (r6 != 0) goto L_0x0134
            goto L_0x012b
        L_0x0134:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.analyzer.C16781c
            if (r6 != 0) goto L_0x010b
            androidx.constraintlayout.core.widgets.analyzer.f r5 = r5.f42816e
            boolean r5 = r5.f42800j
            if (r5 != 0) goto L_0x010b
            goto L_0x012b
        L_0x013f:
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            r10.mo49458D1(r1)
            androidx.constraintlayout.core.widgets.d r10 = r9.f42855a
            r10.mo49521Y1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16783e.mo49664i(boolean, int):boolean");
    }

    /* renamed from: j */
    public final void mo49665j() {
        Iterator<WidgetRun> it = this.f42859e.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = mo49668m(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    /* renamed from: k */
    public final void mo49666k(WidgetRun widgetRun, int i, ArrayList<C16791l> arrayList) {
        for (C16782d next : widgetRun.f42819h.f42801k) {
            if (next instanceof DependencyNode) {
                mo49656a((DependencyNode) next, i, 0, widgetRun.f42820i, arrayList, (C16791l) null);
            } else if (next instanceof WidgetRun) {
                mo49656a(((WidgetRun) next).f42819h, i, 0, widgetRun.f42820i, arrayList, (C16791l) null);
            }
        }
        for (C16782d next2 : widgetRun.f42820i.f42801k) {
            if (next2 instanceof DependencyNode) {
                mo49656a((DependencyNode) next2, i, 1, widgetRun.f42819h, arrayList, (C16791l) null);
            } else if (next2 instanceof WidgetRun) {
                mo49656a(((WidgetRun) next2).f42820i, i, 1, widgetRun.f42819h, arrayList, (C16791l) null);
            }
        }
        if (i == 1) {
            for (C16782d next3 : ((C16792m) widgetRun).f42886k.f42801k) {
                if (next3 instanceof DependencyNode) {
                    mo49656a((DependencyNode) next3, i, 2, (DependencyNode) null, arrayList, (C16791l) null);
                }
            }
        }
    }

    /* renamed from: l */
    public final String mo49667l(C16781c cVar, String str) {
        int i = cVar.f42817f;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(cVar.f42813b.mo49605y());
        if (i == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        Iterator<WidgetRun> it = cVar.f42852k.iterator();
        String str2 = "";
        while (it.hasNext()) {
            WidgetRun next = it.next();
            sb.append(next.f42813b.mo49605y());
            if (i == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            str2 = mo49668m(next, str2);
        }
        sb.append("}\n");
        return str + str2 + sb;
    }

    /* renamed from: m */
    public final String mo49668m(WidgetRun widgetRun, String str) {
        boolean z;
        DependencyNode dependencyNode = widgetRun.f42819h;
        DependencyNode dependencyNode2 = widgetRun.f42820i;
        StringBuilder sb = new StringBuilder(str);
        if (!(widgetRun instanceof C16788j) && dependencyNode.f42801k.isEmpty() && (dependencyNode2.f42801k.isEmpty() && dependencyNode.f42802l.isEmpty()) && dependencyNode2.f42802l.isEmpty()) {
            return str;
        }
        sb.append(mo49675t(widgetRun));
        boolean q = mo49672q(dependencyNode, dependencyNode2);
        String n = mo49669n(dependencyNode2, q, mo49669n(dependencyNode, q, str));
        boolean z2 = widgetRun instanceof C16792m;
        if (z2) {
            n = mo49669n(((C16792m) widgetRun).f42886k, q, n);
        }
        if ((widgetRun instanceof C16789k) || (((z = widgetRun instanceof C16781c)) && ((C16781c) widgetRun).f42817f == 0)) {
            ConstraintWidget.DimensionBehaviour H = widgetRun.f42813b.mo49468H();
            if (H == ConstraintWidget.DimensionBehaviour.FIXED || H == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.f42802l.isEmpty() && dependencyNode2.f42802l.isEmpty()) {
                    sb.append("\n");
                    sb.append(dependencyNode2.mo49624d());
                    sb.append(" -> ");
                    sb.append(dependencyNode.mo49624d());
                    sb.append("\n");
                } else if (dependencyNode.f42802l.isEmpty() && !dependencyNode2.f42802l.isEmpty()) {
                    sb.append("\n");
                    sb.append(dependencyNode.mo49624d());
                    sb.append(" -> ");
                    sb.append(dependencyNode2.mo49624d());
                    sb.append("\n");
                }
            } else if (H == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.f42813b.mo49447A() > 0.0f) {
                sb.append("\n");
                sb.append(widgetRun.f42813b.mo49605y());
                sb.append("_HORIZONTAL -> ");
                sb.append(widgetRun.f42813b.mo49605y());
                sb.append("_VERTICAL;\n");
            }
        } else if (z2 || (z && ((C16781c) widgetRun).f42817f == 1)) {
            ConstraintWidget.DimensionBehaviour j0 = widgetRun.f42813b.mo49559j0();
            if (j0 == ConstraintWidget.DimensionBehaviour.FIXED || j0 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.f42802l.isEmpty() && dependencyNode2.f42802l.isEmpty()) {
                    sb.append("\n");
                    sb.append(dependencyNode2.mo49624d());
                    sb.append(" -> ");
                    sb.append(dependencyNode.mo49624d());
                    sb.append("\n");
                } else if (dependencyNode.f42802l.isEmpty() && !dependencyNode2.f42802l.isEmpty()) {
                    sb.append("\n");
                    sb.append(dependencyNode.mo49624d());
                    sb.append(" -> ");
                    sb.append(dependencyNode2.mo49624d());
                    sb.append("\n");
                }
            } else if (j0 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.f42813b.mo49447A() > 0.0f) {
                sb.append("\n");
                sb.append(widgetRun.f42813b.mo49605y());
                sb.append("_VERTICAL -> ");
                sb.append(widgetRun.f42813b.mo49605y());
                sb.append("_HORIZONTAL;\n");
            }
        }
        if (widgetRun instanceof C16781c) {
            return mo49667l((C16781c) widgetRun, n);
        }
        return sb.toString();
    }

    /* renamed from: n */
    public final String mo49669n(DependencyNode dependencyNode, boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (DependencyNode d : dependencyNode.f42802l) {
            String str2 = ("\n" + dependencyNode.mo49624d()) + " -> " + d.mo49624d();
            if (dependencyNode.f42796f > 0 || z || (dependencyNode.f42794d instanceof C16788j)) {
                String str3 = str2 + "[";
                if (dependencyNode.f42796f > 0) {
                    str3 = str3 + "label=\"" + dependencyNode.f42796f + "\"";
                    if (z) {
                        str3 = str3 + ",";
                    }
                }
                if (z) {
                    str3 = str3 + " style=dashed ";
                }
                if (dependencyNode.f42794d instanceof C16788j) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb.append(str2 + "\n");
        }
        return sb.toString();
    }

    /* renamed from: o */
    public void mo49670o() {
        this.f42856b = true;
    }

    /* renamed from: p */
    public void mo49671p() {
        this.f42857c = true;
    }

    /* renamed from: q */
    public final boolean mo49672q(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        int i = 0;
        for (DependencyNode dependencyNode3 : dependencyNode.f42802l) {
            if (dependencyNode3 != dependencyNode2) {
                i++;
            }
        }
        int i2 = 0;
        for (DependencyNode dependencyNode4 : dependencyNode2.f42802l) {
            if (dependencyNode4 != dependencyNode) {
                i2++;
            }
        }
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final void mo49673r(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        C16778b.C16779a aVar = this.f42862h;
        aVar.f42842a = dimensionBehaviour;
        aVar.f42843b = dimensionBehaviour2;
        aVar.f42844c = i;
        aVar.f42845d = i2;
        this.f42861g.mo48388c(constraintWidget, aVar);
        constraintWidget.mo49533c2(this.f42862h.f42846e);
        constraintWidget.mo49607y1(this.f42862h.f42847f);
        constraintWidget.mo49604x1(this.f42862h.f42849h);
        constraintWidget.mo49548g1(this.f42862h.f42848g);
    }

    /* renamed from: s */
    public void mo49674s() {
        boolean z;
        C16784f fVar;
        Iterator<ConstraintWidget> it = this.f42855a.f43070A1.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f42722a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f42725b0;
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.f42766w;
                int i2 = next.f42768x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C16784f fVar2 = next.f42730e.f42816e;
                boolean z3 = fVar2.f42800j;
                C16784f fVar3 = next.f42732f.f42816e;
                boolean z4 = fVar3.f42800j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    mo49673r(next, dimensionBehaviour4, fVar2.f42797g, dimensionBehaviour4, fVar3.f42797g);
                    next.f42722a = true;
                } else if (z3 && z2) {
                    mo49673r(next, ConstraintWidget.DimensionBehaviour.FIXED, fVar2.f42797g, dimensionBehaviour3, fVar3.f42797g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f42732f.f42816e.f42864m = next.mo49456D();
                    } else {
                        next.f42732f.f42816e.mo49625e(next.mo49456D());
                        next.f42722a = true;
                    }
                } else if (z4 && z) {
                    mo49673r(next, dimensionBehaviour3, fVar2.f42797g, ConstraintWidget.DimensionBehaviour.FIXED, fVar3.f42797g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f42730e.f42816e.f42864m = next.mo49569m0();
                    } else {
                        next.f42730e.f42816e.mo49625e(next.mo49569m0());
                        next.f42722a = true;
                    }
                }
                if (next.f42722a && (fVar = next.f42732f.f42887l) != null) {
                    fVar.mo49625e(next.mo49589t());
                }
            }
        }
    }

    /* renamed from: t */
    public final String mo49675t(WidgetRun widgetRun) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z = widgetRun instanceof C16792m;
        String y = widgetRun.f42813b.mo49605y();
        StringBuilder sb = new StringBuilder(y);
        ConstraintWidget constraintWidget = widgetRun.f42813b;
        if (!z) {
            dimensionBehaviour = constraintWidget.mo49468H();
        } else {
            dimensionBehaviour = constraintWidget.mo49559j0();
        }
        C16791l lVar = widgetRun.f42814c;
        if (!z) {
            sb.append("_HORIZONTAL");
        } else {
            sb.append("_VERTICAL");
        }
        sb.append(" [shape=none, label=<");
        sb.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb.append("  <TR>");
        if (!z) {
            sb.append("    <TD ");
            if (widgetRun.f42819h.f42800j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        } else {
            sb.append("    <TD ");
            if (widgetRun.f42819h.f42800j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z2 = widgetRun.f42816e.f42800j;
        if (z2 && !widgetRun.f42813b.f42722a) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z2) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (widgetRun.f42813b.f42722a) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(y);
        if (lVar != null) {
            sb.append(" [");
            sb.append(lVar.f42884f + 1);
            sb.append("/");
            sb.append(C16791l.f42878k);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (!z) {
            sb.append("    <TD ");
            if (widgetRun.f42820i.f42800j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        } else {
            sb.append("    <TD ");
            if (((C16792m) widgetRun).f42886k.f42800j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (widgetRun.f42820i.f42800j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        }
        sb.append("  </TR></TABLE>");
        sb.append(">];\n");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo49676u(C16778b.C16780b bVar) {
        this.f42861g = bVar;
    }
}
