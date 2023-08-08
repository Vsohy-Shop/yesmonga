package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16798d;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.l */
public class C16791l {

    /* renamed from: h */
    public static final int f42875h = 0;

    /* renamed from: i */
    public static final int f42876i = 1;

    /* renamed from: j */
    public static final int f42877j = 2;

    /* renamed from: k */
    public static int f42878k;

    /* renamed from: a */
    public int f42879a = 0;

    /* renamed from: b */
    public boolean f42880b = false;

    /* renamed from: c */
    public WidgetRun f42881c = null;

    /* renamed from: d */
    public WidgetRun f42882d = null;

    /* renamed from: e */
    public ArrayList<WidgetRun> f42883e = new ArrayList<>();

    /* renamed from: f */
    public int f42884f;

    /* renamed from: g */
    public int f42885g;

    public C16791l(WidgetRun widgetRun, int i) {
        int i2 = f42878k;
        this.f42884f = i2;
        f42878k = i2 + 1;
        this.f42881c = widgetRun;
        this.f42882d = widgetRun;
        this.f42885g = i;
    }

    /* renamed from: a */
    public void mo49681a(WidgetRun widgetRun) {
        this.f42883e.add(widgetRun);
        this.f42882d = widgetRun;
    }

    /* renamed from: b */
    public long mo49682b(C16798d dVar, int i) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        int i2;
        long j;
        WidgetRun widgetRun3 = this.f42881c;
        long j2 = 0;
        if (widgetRun3 instanceof C16781c) {
            if (((C16781c) widgetRun3).f42817f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(widgetRun3 instanceof C16789k)) {
                return 0;
            }
        } else if (!(widgetRun3 instanceof C16792m)) {
            return 0;
        }
        if (i == 0) {
            widgetRun = dVar.f42730e;
        } else {
            widgetRun = dVar.f42732f;
        }
        DependencyNode dependencyNode = widgetRun.f42819h;
        if (i == 0) {
            widgetRun2 = dVar.f42730e;
        } else {
            widgetRun2 = dVar.f42732f;
        }
        DependencyNode dependencyNode2 = widgetRun2.f42820i;
        boolean contains = widgetRun3.f42819h.f42802l.contains(dependencyNode);
        boolean contains2 = this.f42881c.f42820i.f42802l.contains(dependencyNode2);
        long j3 = this.f42881c.mo49635j();
        if (contains && contains2) {
            long f = mo49686f(this.f42881c.f42819h, 0);
            long e = mo49685e(this.f42881c.f42820i, 0);
            long j4 = f - j3;
            WidgetRun widgetRun4 = this.f42881c;
            int i3 = widgetRun4.f42820i.f42796f;
            if (j4 >= ((long) (-i3))) {
                j4 += (long) i3;
            }
            int i4 = widgetRun4.f42819h.f42796f;
            long j5 = ((-e) - j3) - ((long) i4);
            if (j5 >= ((long) i4)) {
                j5 -= (long) i4;
            }
            float u = widgetRun4.f42813b.mo49593u(i);
            if (u > 0.0f) {
                j2 = (long) ((((float) j5) / u) + (((float) j4) / (1.0f - u)));
            }
            float f2 = (float) j2;
            long j6 = ((long) ((f2 * u) + 0.5f)) + j3 + ((long) ((f2 * (1.0f - u)) + 0.5f));
            WidgetRun widgetRun5 = this.f42881c;
            j = ((long) widgetRun5.f42819h.f42796f) + j6;
            i2 = widgetRun5.f42820i.f42796f;
        } else if (contains) {
            DependencyNode dependencyNode3 = this.f42881c.f42819h;
            return Math.max(mo49686f(dependencyNode3, (long) dependencyNode3.f42796f), ((long) this.f42881c.f42819h.f42796f) + j3);
        } else if (contains2) {
            DependencyNode dependencyNode4 = this.f42881c.f42820i;
            return Math.max(-mo49685e(dependencyNode4, (long) dependencyNode4.f42796f), ((long) (-this.f42881c.f42820i.f42796f)) + j3);
        } else {
            WidgetRun widgetRun6 = this.f42881c;
            j = ((long) widgetRun6.f42819h.f42796f) + widgetRun6.mo49635j();
            i2 = this.f42881c.f42820i.f42796f;
        }
        return j - ((long) i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49683c(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6, int r7) {
        /*
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.f42813b
            boolean[] r0 = r0.f42734g
            boolean r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.f42819h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.d> r0 = r0.f42801k
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.d r2 = (androidx.constraintlayout.core.widgets.analyzer.C16782d) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L_0x0012
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r2.f42794d
            if (r3 != r6) goto L_0x0029
            goto L_0x0012
        L_0x0029:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f42819h
            if (r2 != r3) goto L_0x0012
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.C16781c
            if (r3 == 0) goto L_0x004a
            r3 = r6
            androidx.constraintlayout.core.widgets.analyzer.c r3 = (androidx.constraintlayout.core.widgets.analyzer.C16781c) r3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r3.f42852k
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r4
            r5.mo49683c(r4, r7)
            goto L_0x003a
        L_0x004a:
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.C16788j
            if (r3 != 0) goto L_0x0054
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.f42813b
            boolean[] r3 = r3.f42734g
            r3[r7] = r1
        L_0x0054:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r2.f42794d
            r5.mo49683c(r2, r7)
            goto L_0x0012
        L_0x005a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r6.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.d> r0 = r0.f42801k
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.analyzer.d r2 = (androidx.constraintlayout.core.widgets.analyzer.C16782d) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode
            if (r3 == 0) goto L_0x0062
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = r2.f42794d
            if (r3 != r6) goto L_0x0079
            goto L_0x0062
        L_0x0079:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f42819h
            if (r2 != r3) goto L_0x0062
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.C16781c
            if (r3 == 0) goto L_0x009a
            r3 = r6
            androidx.constraintlayout.core.widgets.analyzer.c r3 = (androidx.constraintlayout.core.widgets.analyzer.C16781c) r3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r3.f42852k
            java.util.Iterator r3 = r3.iterator()
        L_0x008a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r4
            r5.mo49683c(r4, r7)
            goto L_0x008a
        L_0x009a:
            boolean r3 = r6 instanceof androidx.constraintlayout.core.widgets.analyzer.C16788j
            if (r3 != 0) goto L_0x00a4
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r6.f42813b
            boolean[] r3 = r3.f42734g
            r3[r7] = r1
        L_0x00a4:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r2.f42794d
            r5.mo49683c(r2, r7)
            goto L_0x0062
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16791l.mo49683c(androidx.constraintlayout.core.widgets.analyzer.WidgetRun, int):boolean");
    }

    /* renamed from: d */
    public void mo49684d(boolean z, boolean z2) {
        if (z) {
            WidgetRun widgetRun = this.f42881c;
            if (widgetRun instanceof C16789k) {
                mo49683c(widgetRun, 0);
            }
        }
        if (z2) {
            WidgetRun widgetRun2 = this.f42881c;
            if (widgetRun2 instanceof C16792m) {
                mo49683c(widgetRun2, 1);
            }
        }
    }

    /* renamed from: e */
    public final long mo49685e(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f42794d;
        if (widgetRun instanceof C16788j) {
            return j;
        }
        int size = dependencyNode.f42801k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C16782d dVar = dependencyNode.f42801k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f42794d != widgetRun) {
                    j2 = Math.min(j2, mo49685e(dependencyNode2, ((long) dependencyNode2.f42796f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f42820i) {
            return j2;
        }
        long j3 = j - widgetRun.mo49635j();
        return Math.min(Math.min(j2, mo49685e(widgetRun.f42819h, j3)), j3 - ((long) widgetRun.f42819h.f42796f));
    }

    /* renamed from: f */
    public final long mo49686f(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f42794d;
        if (widgetRun instanceof C16788j) {
            return j;
        }
        int size = dependencyNode.f42801k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C16782d dVar = dependencyNode.f42801k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f42794d != widgetRun) {
                    j2 = Math.max(j2, mo49686f(dependencyNode2, ((long) dependencyNode2.f42796f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f42819h) {
            return j2;
        }
        long j3 = j + widgetRun.mo49635j();
        return Math.max(Math.max(j2, mo49686f(widgetRun.f42820i, j3)), j3 - ((long) widgetRun.f42820i.f42796f));
    }
}
