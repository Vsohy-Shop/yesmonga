package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.h */
public class C16786h {

    /* renamed from: a */
    public static final boolean f42871a = false;

    /* renamed from: b */
    public static final boolean f42872b = false;

    /* renamed from: a */
    public static C16794n m77029a(ConstraintWidget constraintWidget, int i, ArrayList<C16794n> arrayList, C16794n nVar) {
        int i2;
        int l2;
        if (i == 0) {
            i2 = constraintWidget.f42713S0;
        } else {
            i2 = constraintWidget.f42715T0;
        }
        int i3 = 0;
        if (i2 != -1 && (nVar == null || i2 != nVar.f42892b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C16794n nVar2 = arrayList.get(i4);
                if (nVar2.mo49693f() == i2) {
                    if (nVar != null) {
                        nVar.mo49700m(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if ((constraintWidget instanceof C16804h) && (l2 = ((C16804h) constraintWidget).mo49813l2(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C16794n nVar3 = arrayList.get(i5);
                    if (nVar3.mo49693f() == l2) {
                        nVar = nVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (nVar == null) {
                nVar = new C16794n(i);
            }
            arrayList.add(nVar);
        }
        if (nVar.mo49688a(constraintWidget)) {
            if (constraintWidget instanceof C16801f) {
                C16801f fVar = (C16801f) constraintWidget;
                ConstraintAnchor l22 = fVar.mo49794l2();
                if (fVar.mo49795m2() == 0) {
                    i3 = 1;
                }
                l22.mo49423d(i3, arrayList, nVar);
            }
            if (i == 0) {
                constraintWidget.f42713S0 = nVar.mo49693f();
                constraintWidget.f42708Q.mo49423d(i, arrayList, nVar);
                constraintWidget.f42712S.mo49423d(i, arrayList, nVar);
            } else {
                constraintWidget.f42715T0 = nVar.mo49693f();
                constraintWidget.f42710R.mo49423d(i, arrayList, nVar);
                constraintWidget.f42716U.mo49423d(i, arrayList, nVar);
                constraintWidget.f42714T.mo49423d(i, arrayList, nVar);
            }
            constraintWidget.f42719X.mo49423d(i, arrayList, nVar);
        }
        return nVar;
    }

    /* renamed from: b */
    public static C16794n m77030b(ArrayList<C16794n> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16794n nVar = arrayList.get(i2);
            if (i == nVar.f42892b) {
                return nVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03a0 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m77031c(androidx.constraintlayout.core.widgets.C16798d r16, androidx.constraintlayout.core.widgets.analyzer.C16778b.C16780b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo49843l2()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r16.mo49468H()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r16.mo49559j0()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.mo49468H()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r5.mo49559j0()
            boolean r6 = m77032d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.C16799e
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            androidx.constraintlayout.core.f r4 = r0.f42939G1
            if (r4 == 0) goto L_0x003e
            long r5 = r4.f41455Q
            r7 = 1
            long r5 = r5 + r7
            r4.f41455Q = r5
        L_0x003e:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0045:
            if (r5 >= r2) goto L_0x0121
            java.lang.Object r13 = r1.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r16.mo49468H()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r16.mo49559j0()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r13.mo49468H()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r13.mo49559j0()
            boolean r4 = m77032d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x006d
            androidx.constraintlayout.core.widgets.analyzer.b$a r4 = r0.f42964f2
            int r12 = androidx.constraintlayout.core.widgets.analyzer.C16778b.C16779a.f42839k
            r14 = r17
            androidx.constraintlayout.core.widgets.C16798d.m77097R2(r3, r13, r14, r4, r12)
            goto L_0x006f
        L_0x006d:
            r14 = r17
        L_0x006f:
            boolean r4 = r13 instanceof androidx.constraintlayout.core.widgets.C16801f
            if (r4 == 0) goto L_0x0098
            r12 = r13
            androidx.constraintlayout.core.widgets.f r12 = (androidx.constraintlayout.core.widgets.C16801f) r12
            int r15 = r12.mo49795m2()
            if (r15 != 0) goto L_0x0086
            if (r8 != 0) goto L_0x0083
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0083:
            r8.add(r12)
        L_0x0086:
            int r15 = r12.mo49795m2()
            r3 = 1
            if (r15 != r3) goto L_0x0098
            if (r6 != 0) goto L_0x0095
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x0095:
            r6.add(r12)
        L_0x0098:
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.C16804h
            if (r3 == 0) goto L_0x00dc
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r3 == 0) goto L_0x00c5
            r3 = r13
            androidx.constraintlayout.core.widgets.a r3 = (androidx.constraintlayout.core.widgets.C16775a) r3
            int r12 = r3.mo49616r2()
            if (r12 != 0) goto L_0x00b3
            if (r7 != 0) goto L_0x00b0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00b0:
            r7.add(r3)
        L_0x00b3:
            int r12 = r3.mo49616r2()
            r15 = 1
            if (r12 != r15) goto L_0x00dc
            if (r9 != 0) goto L_0x00c1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00c1:
            r9.add(r3)
            goto L_0x00dc
        L_0x00c5:
            r3 = r13
            androidx.constraintlayout.core.widgets.h r3 = (androidx.constraintlayout.core.widgets.C16804h) r3
            if (r7 != 0) goto L_0x00cf
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00cf:
            r7.add(r3)
            if (r9 != 0) goto L_0x00d9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00d9:
            r9.add(r3)
        L_0x00dc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f42708Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f42629f
            if (r3 != 0) goto L_0x00f9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f42712S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f42629f
            if (r3 != 0) goto L_0x00f9
            if (r4 != 0) goto L_0x00f9
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r3 != 0) goto L_0x00f9
            if (r10 != 0) goto L_0x00f6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00f6:
            r10.add(r13)
        L_0x00f9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f42710R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f42629f
            if (r3 != 0) goto L_0x011c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f42714T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f42629f
            if (r3 != 0) goto L_0x011c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f42716U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f42629f
            if (r3 != 0) goto L_0x011c
            if (r4 != 0) goto L_0x011c
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.C16775a
            if (r3 != 0) goto L_0x011c
            if (r11 != 0) goto L_0x0119
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0119:
            r11.add(r13)
        L_0x011c:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0045
        L_0x0121:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x013e
            java.util.Iterator r4 = r6.iterator()
        L_0x012c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.C16801f) r5
            r6 = 0
            r12 = 0
            m77029a(r5, r12, r3, r6)
            goto L_0x012c
        L_0x013e:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x015f
            java.util.Iterator r4 = r7.iterator()
        L_0x0146:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x015f
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.h r5 = (androidx.constraintlayout.core.widgets.C16804h) r5
            androidx.constraintlayout.core.widgets.analyzer.n r7 = m77029a(r5, r12, r3, r6)
            r5.mo49812k2(r3, r12, r7)
            r7.mo49690c(r3)
            r6 = 0
            r12 = 0
            goto L_0x0146
        L_0x015f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            java.util.HashSet r5 = r4.mo49424e()
            if (r5 == 0) goto L_0x0187
            java.util.HashSet r4 = r4.mo49424e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0173:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0187
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f42627d
            r6 = 0
            r7 = 0
            m77029a(r5, r7, r3, r6)
            goto L_0x0173
        L_0x0187:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            java.util.HashSet r5 = r4.mo49424e()
            if (r5 == 0) goto L_0x01af
            java.util.HashSet r4 = r4.mo49424e()
            java.util.Iterator r4 = r4.iterator()
        L_0x019b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01af
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f42627d
            r6 = 0
            r7 = 0
            m77029a(r5, r7, r3, r6)
            goto L_0x019b
        L_0x01af:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            java.util.HashSet r5 = r4.mo49424e()
            if (r5 == 0) goto L_0x01d7
            java.util.HashSet r4 = r4.mo49424e()
            java.util.Iterator r4 = r4.iterator()
        L_0x01c3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d7
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f42627d
            r6 = 0
            r7 = 0
            m77029a(r5, r7, r3, r6)
            goto L_0x01c3
        L_0x01d7:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01ef
            java.util.Iterator r4 = r10.iterator()
        L_0x01df:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ef
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            m77029a(r5, r7, r3, r6)
            goto L_0x01df
        L_0x01ef:
            if (r8 == 0) goto L_0x0206
            java.util.Iterator r4 = r8.iterator()
        L_0x01f5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0206
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.C16801f) r5
            r7 = 1
            m77029a(r5, r7, r3, r6)
            goto L_0x01f5
        L_0x0206:
            r7 = 1
            if (r9 == 0) goto L_0x0226
            java.util.Iterator r4 = r9.iterator()
        L_0x020d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0226
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.h r5 = (androidx.constraintlayout.core.widgets.C16804h) r5
            androidx.constraintlayout.core.widgets.analyzer.n r8 = m77029a(r5, r7, r3, r6)
            r5.mo49812k2(r3, r7, r8)
            r8.mo49690c(r3)
            r6 = 0
            r7 = 1
            goto L_0x020d
        L_0x0226:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.f42635c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            java.util.HashSet r5 = r4.mo49424e()
            if (r5 == 0) goto L_0x024e
            java.util.HashSet r4 = r4.mo49424e()
            java.util.Iterator r4 = r4.iterator()
        L_0x023a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x024e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f42627d
            r6 = 1
            r7 = 0
            m77029a(r5, r6, r3, r7)
            goto L_0x023a
        L_0x024e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            java.util.HashSet r5 = r4.mo49424e()
            if (r5 == 0) goto L_0x0276
            java.util.HashSet r4 = r4.mo49424e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0262:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0276
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f42627d
            r6 = 1
            r7 = 0
            m77029a(r5, r6, r3, r7)
            goto L_0x0262
        L_0x0276:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            java.util.HashSet r5 = r4.mo49424e()
            if (r5 == 0) goto L_0x029e
            java.util.HashSet r4 = r4.mo49424e()
            java.util.Iterator r4 = r4.iterator()
        L_0x028a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x029e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f42627d
            r6 = 1
            r7 = 0
            m77029a(r5, r6, r3, r7)
            goto L_0x028a
        L_0x029e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo49583r(r4)
            java.util.HashSet r5 = r4.mo49424e()
            if (r5 == 0) goto L_0x02c6
            java.util.HashSet r4 = r4.mo49424e()
            java.util.Iterator r4 = r4.iterator()
        L_0x02b2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02c6
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f42627d
            r6 = 0
            r7 = 1
            m77029a(r5, r7, r3, r6)
            goto L_0x02b2
        L_0x02c6:
            r6 = 0
            r7 = 1
            if (r11 == 0) goto L_0x02de
            java.util.Iterator r4 = r11.iterator()
        L_0x02ce:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02de
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            m77029a(r5, r7, r3, r6)
            goto L_0x02ce
        L_0x02de:
            r4 = 0
        L_0x02df:
            if (r4 >= r2) goto L_0x030b
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r7 = r5.mo49496Q0()
            if (r7 == 0) goto L_0x0308
            int r7 = r5.f42713S0
            androidx.constraintlayout.core.widgets.analyzer.n r7 = m77030b(r3, r7)
            int r5 = r5.f42715T0
            androidx.constraintlayout.core.widgets.analyzer.n r5 = m77030b(r3, r5)
            if (r7 == 0) goto L_0x0308
            if (r5 == 0) goto L_0x0308
            r8 = 0
            r7.mo49700m(r8, r5)
            r8 = 2
            r5.mo49702o(r8)
            r3.remove(r7)
        L_0x0308:
            int r4 = r4 + 1
            goto L_0x02df
        L_0x030b:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0314
            r1 = 0
            return r1
        L_0x0314:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.mo49468H()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0356
            java.util.Iterator r1 = r3.iterator()
            r2 = r6
            r12 = 0
        L_0x0322:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0347
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.n r4 = (androidx.constraintlayout.core.widgets.analyzer.C16794n) r4
            int r5 = r4.mo49694g()
            r7 = 1
            if (r5 != r7) goto L_0x0336
            goto L_0x0322
        L_0x0336:
            r5 = 0
            r4.mo49701n(r5)
            androidx.constraintlayout.core.e r7 = r16.mo49725I2()
            int r7 = r4.mo49699l(r7, r5)
            if (r7 <= r12) goto L_0x0322
            r2 = r4
            r12 = r7
            goto L_0x0322
        L_0x0347:
            if (r2 == 0) goto L_0x0356
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.mo49458D1(r1)
            r0.mo49533c2(r12)
            r1 = 1
            r2.mo49701n(r1)
            goto L_0x0357
        L_0x0356:
            r2 = r6
        L_0x0357:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.mo49559j0()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto L_0x039b
            java.util.Iterator r1 = r3.iterator()
            r3 = r6
            r12 = 0
        L_0x0365:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x038a
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.n r4 = (androidx.constraintlayout.core.widgets.analyzer.C16794n) r4
            int r5 = r4.mo49694g()
            if (r5 != 0) goto L_0x0378
            goto L_0x0365
        L_0x0378:
            r5 = 0
            r4.mo49701n(r5)
            androidx.constraintlayout.core.e r7 = r16.mo49725I2()
            r8 = 1
            int r7 = r4.mo49699l(r7, r8)
            if (r7 <= r12) goto L_0x0365
            r3 = r4
            r12 = r7
            goto L_0x0365
        L_0x038a:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x039d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.mo49521Y1(r1)
            r0.mo49607y1(r12)
            r3.mo49701n(r8)
            r4 = r3
            goto L_0x039e
        L_0x039b:
            r5 = 0
            r8 = 1
        L_0x039d:
            r4 = r6
        L_0x039e:
            if (r2 != 0) goto L_0x03a5
            if (r4 == 0) goto L_0x03a3
            goto L_0x03a5
        L_0x03a3:
            r3 = r5
            goto L_0x03a6
        L_0x03a5:
            r3 = r8
        L_0x03a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C16786h.m77031c(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.analyzer.b$b):boolean");
    }

    /* renamed from: d */
    public static boolean m77032d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z;
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) {
            z = true;
        } else {
            z = false;
        }
        if (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
