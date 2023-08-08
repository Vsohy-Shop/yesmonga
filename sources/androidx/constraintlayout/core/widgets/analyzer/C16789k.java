package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16803g;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.k */
public class C16789k extends WidgetRun {

    /* renamed from: k */
    public static int[] f42873k = new int[2];

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.k$a */
    public static /* synthetic */ class C16790a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42874a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42874a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42874a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42874a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16789k.C16790a.<clinit>():void");
        }
    }

    public C16789k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f42819h.f42795e = DependencyNode.Type.LEFT;
        this.f42820i.f42795e = DependencyNode.Type.RIGHT;
        this.f42817f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b9, code lost:
        if (r14 != 1) goto L_0x031e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49621a(androidx.constraintlayout.core.widgets.analyzer.C16782d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.C16789k.C16790a.f42874a
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r8.f42821j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42708Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f42712S
            r3 = r17
            r8.mo49642q(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo49643r(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo49644s(r17)
        L_0x002e:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            boolean r0 = r0.f42800j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x031e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f42815d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x031e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            int r3 = r0.f42766w
            if (r3 == r1) goto L_0x0301
            if (r3 == r2) goto L_0x0046
            goto L_0x031e
        L_0x0046:
            int r1 = r0.f42768x
            r3 = -1
            if (r1 == 0) goto L_0x008e
            if (r1 != r2) goto L_0x004e
            goto L_0x008e
        L_0x004e:
            int r0 = r0.mo49450B()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x0087
        L_0x005a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r1 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r1 = r1.f42816e
            int r1 = r1.f42797g
            float r1 = (float) r1
            float r0 = r0.mo49447A()
            goto L_0x0084
        L_0x0068:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r1 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r1 = r1.f42816e
            int r1 = r1.f42797g
            float r1 = (float) r1
            float r0 = r0.mo49447A()
            float r1 = r1 / r0
            goto L_0x0085
        L_0x0077:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r1 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r1 = r1.f42816e
            int r1 = r1.f42797g
            float r1 = (float) r1
            float r0 = r0.mo49447A()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0085:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0087:
            androidx.constraintlayout.core.widgets.analyzer.f r1 = r8.f42816e
            r1.mo49625e(r0)
            goto L_0x031e
        L_0x008e:
            androidx.constraintlayout.core.widgets.analyzer.m r1 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r1.f42819h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r1.f42820i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f42708Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f42629f
            if (r1 == 0) goto L_0x009c
            r1 = r9
            goto L_0x009d
        L_0x009c:
            r1 = r10
        L_0x009d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f42629f
            if (r2 == 0) goto L_0x00a5
            r2 = r9
            goto L_0x00a6
        L_0x00a5:
            r2 = r10
        L_0x00a6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.f42712S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f42629f
            if (r4 == 0) goto L_0x00ae
            r4 = r9
            goto L_0x00af
        L_0x00ae:
            r4 = r10
        L_0x00af:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f42629f
            if (r5 == 0) goto L_0x00b7
            r5 = r9
            goto L_0x00b8
        L_0x00b7:
            r5 = r10
        L_0x00b8:
            int r14 = r0.mo49450B()
            if (r1 == 0) goto L_0x01ff
            if (r2 == 0) goto L_0x01ff
            if (r4 == 0) goto L_0x01ff
            if (r5 == 0) goto L_0x01ff
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            float r15 = r0.mo49447A()
            boolean r0 = r12.f42800j
            if (r0 == 0) goto L_0x012d
            boolean r0 = r13.f42800j
            if (r0 == 0) goto L_0x012d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            boolean r1 = r0.f42793c
            if (r1 == 0) goto L_0x012c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            boolean r1 = r1.f42793c
            if (r1 != 0) goto L_0x00df
            goto L_0x012c
        L_0x00df:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42819h
            int r1 = r1.f42796f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            int r1 = r1.f42796f
            int r3 = r0 - r1
            int r0 = r12.f42797g
            int r1 = r12.f42796f
            int r4 = r0 + r1
            int r0 = r13.f42797g
            int r1 = r13.f42796f
            int r5 = r0 - r1
            int[] r1 = f42873k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo49680u(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            int[] r1 = f42873k
            r1 = r1[r10]
            r0.mo49625e(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            int[] r1 = f42873k
            r1 = r1[r9]
            r0.mo49625e(r1)
        L_0x012c:
            return
        L_0x012d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            boolean r1 = r0.f42800j
            if (r1 == 0) goto L_0x018a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            boolean r2 = r1.f42800j
            if (r2 == 0) goto L_0x018a
            boolean r2 = r12.f42793c
            if (r2 == 0) goto L_0x0189
            boolean r2 = r13.f42793c
            if (r2 != 0) goto L_0x0142
            goto L_0x0189
        L_0x0142:
            int r2 = r0.f42797g
            int r0 = r0.f42796f
            int r2 = r2 + r0
            int r0 = r1.f42797g
            int r1 = r1.f42796f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            int r1 = r12.f42796f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            int r1 = r13.f42796f
            int r5 = r0 - r1
            int[] r1 = f42873k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo49680u(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            int[] r1 = f42873k
            r1 = r1[r10]
            r0.mo49625e(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            int[] r1 = f42873k
            r1 = r1[r9]
            r0.mo49625e(r1)
            goto L_0x018a
        L_0x0189:
            return
        L_0x018a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            boolean r1 = r0.f42793c
            if (r1 == 0) goto L_0x01fe
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            boolean r1 = r1.f42793c
            if (r1 == 0) goto L_0x01fe
            boolean r1 = r12.f42793c
            if (r1 == 0) goto L_0x01fe
            boolean r1 = r13.f42793c
            if (r1 != 0) goto L_0x019f
            goto L_0x01fe
        L_0x019f:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42819h
            int r1 = r1.f42796f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            int r1 = r1.f42796f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            int r1 = r12.f42796f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f42797g
            int r1 = r13.f42796f
            int r5 = r0 - r1
            int[] r1 = f42873k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo49680u(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            int[] r1 = f42873k
            r1 = r1[r10]
            r0.mo49625e(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            int[] r1 = f42873k
            r1 = r1[r9]
            r0.mo49625e(r1)
            goto L_0x031e
        L_0x01fe:
            return
        L_0x01ff:
            if (r1 == 0) goto L_0x0288
            if (r4 == 0) goto L_0x0288
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            boolean r0 = r0.f42793c
            if (r0 == 0) goto L_0x0287
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42820i
            boolean r0 = r0.f42793c
            if (r0 != 0) goto L_0x0211
            goto L_0x0287
        L_0x0211:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            float r0 = r0.mo49447A()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42819h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f42802l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f42819h
            int r2 = r2.f42796f
            int r1 = r1 + r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.f42802l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f42820i
            int r4 = r4.f42796f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0264
            if (r14 == 0) goto L_0x0264
            if (r14 == r9) goto L_0x0241
            goto L_0x031e
        L_0x0241:
            int r2 = r2 - r1
            int r1 = r8.mo49632g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo49632g(r2, r9)
            if (r2 == r3) goto L_0x0254
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0254:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            r0.mo49625e(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            r0.mo49625e(r3)
            goto L_0x031e
        L_0x0264:
            int r2 = r2 - r1
            int r1 = r8.mo49632g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo49632g(r2, r9)
            if (r2 == r3) goto L_0x0277
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0277:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            r0.mo49625e(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            r0.mo49625e(r3)
            goto L_0x031e
        L_0x0287:
            return
        L_0x0288:
            if (r2 == 0) goto L_0x031e
            if (r5 == 0) goto L_0x031e
            boolean r0 = r12.f42793c
            if (r0 == 0) goto L_0x0300
            boolean r0 = r13.f42793c
            if (r0 != 0) goto L_0x0295
            goto L_0x0300
        L_0x0295:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            float r0 = r0.mo49447A()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r12.f42802l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f42797g
            int r2 = r12.f42796f
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r13.f42802l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f42797g
            int r4 = r13.f42796f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02de
            if (r14 == 0) goto L_0x02bc
            if (r14 == r9) goto L_0x02de
            goto L_0x031e
        L_0x02bc:
            int r2 = r2 - r1
            int r1 = r8.mo49632g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo49632g(r2, r10)
            if (r2 == r3) goto L_0x02cf
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02cf:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            r0.mo49625e(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            r0.mo49625e(r1)
            goto L_0x031e
        L_0x02de:
            int r2 = r2 - r1
            int r1 = r8.mo49632g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo49632g(r2, r10)
            if (r2 == r3) goto L_0x02f1
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f1:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            r0.mo49625e(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            androidx.constraintlayout.core.widgets.analyzer.m r0 = r0.f42732f
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            r0.mo49625e(r1)
            goto L_0x031e
        L_0x0300:
            return
        L_0x0301:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mo49507U()
            if (r0 == 0) goto L_0x031e
            androidx.constraintlayout.core.widgets.analyzer.k r0 = r0.f42730e
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r0.f42816e
            boolean r1 = r0.f42800j
            if (r1 == 0) goto L_0x031e
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f42813b
            float r1 = r1.f42678B
            int r0 = r0.f42797g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.analyzer.f r1 = r8.f42816e
            r1.mo49625e(r0)
        L_0x031e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            boolean r1 = r0.f42793c
            if (r1 == 0) goto L_0x043e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            boolean r2 = r1.f42793c
            if (r2 != 0) goto L_0x032c
            goto L_0x043e
        L_0x032c:
            boolean r0 = r0.f42800j
            if (r0 == 0) goto L_0x033b
            boolean r0 = r1.f42800j
            if (r0 == 0) goto L_0x033b
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            boolean r0 = r0.f42800j
            if (r0 == 0) goto L_0x033b
            return
        L_0x033b:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            boolean r0 = r0.f42800j
            if (r0 != 0) goto L_0x0385
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f42815d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0385
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f42813b
            int r1 = r0.f42766w
            if (r1 != 0) goto L_0x0385
            boolean r0 = r0.mo49451B0()
            if (r0 != 0) goto L_0x0385
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f42802l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f42819h
            int r3 = r2.f42796f
            int r0 = r0 + r3
            int r1 = r1.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f42820i
            int r3 = r3.f42796f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo49625e(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42820i
            r0.mo49625e(r1)
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            r0.mo49625e(r3)
            return
        L_0x0385:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            boolean r0 = r0.f42800j
            if (r0 != 0) goto L_0x03e9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f42815d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03e9
            int r0 = r8.f42812a
            if (r0 != r9) goto L_0x03e9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03e9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03e9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f42802l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f42819h
            int r2 = r2.f42796f
            int r0 = r0 + r2
            int r1 = r1.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f42820i
            int r2 = r2.f42796f
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            int r0 = r0.f42864m
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f42813b
            int r2 = r1.f42676A
            int r1 = r1.f42772z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03e4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03e4:
            androidx.constraintlayout.core.widgets.analyzer.f r1 = r8.f42816e
            r1.mo49625e(r0)
        L_0x03e9:
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            boolean r0 = r0.f42800j
            if (r0 != 0) goto L_0x03f0
            return
        L_0x03f0:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f42802l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42820i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f42802l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f42819h
            int r3 = r3.f42796f
            int r2 = r2 + r3
            int r3 = r1.f42797g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f42820i
            int r4 = r4.f42796f
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.f42813b
            float r4 = r4.mo49459E()
            if (r0 != r1) goto L_0x041f
            int r2 = r0.f42797g
            int r3 = r1.f42797g
            r4 = r11
        L_0x041f:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.f r0 = r8.f42816e
            int r0 = r0.f42797g
            int r3 = r3 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42819h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo49625e(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f42820i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f42819h
            int r1 = r1.f42797g
            androidx.constraintlayout.core.widgets.analyzer.f r2 = r8.f42816e
            int r2 = r2.f42797g
            int r1 = r1 + r2
            r0.mo49625e(r1)
        L_0x043e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16789k.mo49621a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    /* renamed from: d */
    public void mo49629d() {
        ConstraintWidget U;
        ConstraintWidget U2;
        ConstraintWidget constraintWidget = this.f42813b;
        if (constraintWidget.f42722a) {
            this.f42816e.mo49625e(constraintWidget.mo49569m0());
        }
        if (!this.f42816e.f42800j) {
            ConstraintWidget.DimensionBehaviour H = this.f42813b.mo49468H();
            this.f42815d = H;
            if (H != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (H == dimensionBehaviour && (U2 = this.f42813b.mo49507U()) != null && (U2.mo49468H() == ConstraintWidget.DimensionBehaviour.FIXED || U2.mo49468H() == dimensionBehaviour)) {
                    int m0 = (U2.mo49569m0() - this.f42813b.f42708Q.mo49426g()) - this.f42813b.f42712S.mo49426g();
                    mo49627b(this.f42819h, U2.f42730e.f42819h, this.f42813b.f42708Q.mo49426g());
                    mo49627b(this.f42820i, U2.f42730e.f42820i, -this.f42813b.f42712S.mo49426g());
                    this.f42816e.mo49625e(m0);
                    return;
                } else if (this.f42815d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f42816e.mo49625e(this.f42813b.mo49569m0());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f42815d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (U = this.f42813b.mo49507U()) != null && (U.mo49468H() == ConstraintWidget.DimensionBehaviour.FIXED || U.mo49468H() == dimensionBehaviour3)) {
                mo49627b(this.f42819h, U.f42730e.f42819h, this.f42813b.f42708Q.mo49426g());
                mo49627b(this.f42820i, U.f42730e.f42820i, -this.f42813b.f42712S.mo49426g());
                return;
            }
        }
        C16784f fVar = this.f42816e;
        if (fVar.f42800j) {
            ConstraintWidget constraintWidget2 = this.f42813b;
            if (constraintWidget2.f42722a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f42720Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f42629f;
                if (constraintAnchor2 == null || constraintAnchorArr[1].f42629f == null) {
                    if (constraintAnchor2 != null) {
                        DependencyNode h = mo49633h(constraintAnchor);
                        if (h != null) {
                            mo49627b(this.f42819h, h, this.f42813b.f42720Y[0].mo49426g());
                            mo49627b(this.f42820i, this.f42819h, this.f42816e.f42797g);
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                    if (constraintAnchor3.f42629f != null) {
                        DependencyNode h2 = mo49633h(constraintAnchor3);
                        if (h2 != null) {
                            mo49627b(this.f42820i, h2, -this.f42813b.f42720Y[1].mo49426g());
                            mo49627b(this.f42819h, this.f42820i, -this.f42816e.f42797g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof C16803g) && constraintWidget2.mo49507U() != null && this.f42813b.mo49583r(ConstraintAnchor.Type.CENTER).f42629f == null) {
                        mo49627b(this.f42819h, this.f42813b.mo49507U().f42730e.f42819h, this.f42813b.mo49575o0());
                        mo49627b(this.f42820i, this.f42819h, this.f42816e.f42797g);
                        return;
                    } else {
                        return;
                    }
                } else if (constraintWidget2.mo49451B0()) {
                    this.f42819h.f42796f = this.f42813b.f42720Y[0].mo49426g();
                    this.f42820i.f42796f = -this.f42813b.f42720Y[1].mo49426g();
                    return;
                } else {
                    DependencyNode h3 = mo49633h(this.f42813b.f42720Y[0]);
                    if (h3 != null) {
                        mo49627b(this.f42819h, h3, this.f42813b.f42720Y[0].mo49426g());
                    }
                    DependencyNode h4 = mo49633h(this.f42813b.f42720Y[1]);
                    if (h4 != null) {
                        mo49627b(this.f42820i, h4, -this.f42813b.f42720Y[1].mo49426g());
                    }
                    this.f42819h.f42792b = true;
                    this.f42820i.f42792b = true;
                    return;
                }
            }
        }
        if (this.f42815d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f42813b;
            int i = constraintWidget3.f42766w;
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
            } else if (i == 3) {
                if (constraintWidget3.f42768x == 3) {
                    this.f42819h.f42791a = this;
                    this.f42820i.f42791a = this;
                    C16792m mVar = constraintWidget3.f42732f;
                    mVar.f42819h.f42791a = this;
                    mVar.f42820i.f42791a = this;
                    fVar.f42791a = this;
                    if (constraintWidget3.mo49457D0()) {
                        this.f42816e.f42802l.add(this.f42813b.f42732f.f42816e);
                        this.f42813b.f42732f.f42816e.f42801k.add(this.f42816e);
                        C16792m mVar2 = this.f42813b.f42732f;
                        mVar2.f42816e.f42791a = this;
                        this.f42816e.f42802l.add(mVar2.f42819h);
                        this.f42816e.f42802l.add(this.f42813b.f42732f.f42820i);
                        this.f42813b.f42732f.f42819h.f42801k.add(this.f42816e);
                        this.f42813b.f42732f.f42820i.f42801k.add(this.f42816e);
                    } else if (this.f42813b.mo49451B0()) {
                        this.f42813b.f42732f.f42816e.f42802l.add(this.f42816e);
                        this.f42816e.f42801k.add(this.f42813b.f42732f.f42816e);
                    } else {
                        this.f42813b.f42732f.f42816e.f42802l.add(this.f42816e);
                    }
                } else {
                    C16784f fVar4 = constraintWidget3.f42732f.f42816e;
                    fVar.f42802l.add(fVar4);
                    fVar4.f42801k.add(this.f42816e);
                    this.f42813b.f42732f.f42819h.f42801k.add(this.f42816e);
                    this.f42813b.f42732f.f42820i.f42801k.add(this.f42816e);
                    C16784f fVar5 = this.f42816e;
                    fVar5.f42792b = true;
                    fVar5.f42801k.add(this.f42819h);
                    this.f42816e.f42801k.add(this.f42820i);
                    this.f42819h.f42802l.add(this.f42816e);
                    this.f42820i.f42802l.add(this.f42816e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f42813b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.f42720Y;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f42629f;
        if (constraintAnchor5 == null || constraintAnchorArr2[1].f42629f == null) {
            if (constraintAnchor5 != null) {
                DependencyNode h5 = mo49633h(constraintAnchor4);
                if (h5 != null) {
                    mo49627b(this.f42819h, h5, this.f42813b.f42720Y[0].mo49426g());
                    mo49628c(this.f42820i, this.f42819h, 1, this.f42816e);
                    return;
                }
                return;
            }
            ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
            if (constraintAnchor6.f42629f != null) {
                DependencyNode h6 = mo49633h(constraintAnchor6);
                if (h6 != null) {
                    mo49627b(this.f42820i, h6, -this.f42813b.f42720Y[1].mo49426g());
                    mo49628c(this.f42819h, this.f42820i, -1, this.f42816e);
                }
            } else if (!(constraintWidget4 instanceof C16803g) && constraintWidget4.mo49507U() != null) {
                mo49627b(this.f42819h, this.f42813b.mo49507U().f42730e.f42819h, this.f42813b.mo49575o0());
                mo49628c(this.f42820i, this.f42819h, 1, this.f42816e);
            }
        } else if (constraintWidget4.mo49451B0()) {
            this.f42819h.f42796f = this.f42813b.f42720Y[0].mo49426g();
            this.f42820i.f42796f = -this.f42813b.f42720Y[1].mo49426g();
        } else {
            DependencyNode h7 = mo49633h(this.f42813b.f42720Y[0]);
            DependencyNode h8 = mo49633h(this.f42813b.f42720Y[1]);
            if (h7 != null) {
                h7.mo49622b(this);
            }
            if (h8 != null) {
                h8.mo49622b(this);
            }
            this.f42821j = WidgetRun.RunType.CENTER;
        }
    }

    /* renamed from: e */
    public void mo49630e() {
        DependencyNode dependencyNode = this.f42819h;
        if (dependencyNode.f42800j) {
            this.f42813b.mo49545f2(dependencyNode.f42797g);
        }
    }

    /* renamed from: f */
    public void mo49631f() {
        this.f42814c = null;
        this.f42819h.mo49623c();
        this.f42820i.mo49623c();
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
        this.f42816e.f42800j = false;
    }

    /* renamed from: p */
    public boolean mo49641p() {
        if (this.f42815d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f42813b.f42766w == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "HorizontalRun " + this.f42813b.mo49605y();
    }

    /* renamed from: u */
    public final void mo49680u(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }
}
