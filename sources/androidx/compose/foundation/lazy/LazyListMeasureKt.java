package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.C2550i;
import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11463j;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 DataIndex.kt\nandroidx/compose/foundation/lazy/DataIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,515:1\n30#2:516\n25#2:521\n27#2:523\n25#2:524\n30#2:525\n33#3,4:517\n38#3:522\n33#3,6:526\n33#3,6:532\n33#3,4:541\n38#3:547\n33#3,6:549\n33#3,6:555\n33#3,6:561\n33#3,6:567\n33#3,6:573\n36#4,3:538\n39#4,2:545\n41#4:548\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n127#1:516\n152#1:521\n169#1:523\n176#1:524\n186#1:525\n151#1:517,4\n151#1:522\n248#1:526,6\n264#1:532,6\n330#1:541,4\n330#1:547\n376#1:549,6\n419#1:555,6\n494#1:561,6\n500#1:567,6\n505#1:573,6\n330#1:538,3\n330#1:545,2\n330#1:548\n*E\n"})
public final class LazyListMeasureKt {
    @C12579k

    /* renamed from: a */
    public static final Pair<Integer, Integer> f6419a = C11078d1.m42659a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: a */
    public static final List<C2574r> m10807a(List<C2620u> list, List<C2620u> list2, List<C2620u> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.C2279l lVar, Arrangement.C2269d dVar, boolean z2, C16479d dVar2) {
        int i6;
        boolean z3;
        boolean z4;
        List<C2620u> list4 = list;
        int i7 = i;
        int i8 = i2;
        Arrangement.C2279l lVar2 = lVar;
        boolean z5 = z2;
        int i9 = i4;
        if (z) {
            i6 = i8;
        } else {
            i6 = i7;
        }
        boolean z6 = true;
        if (i3 < Math.min(i6, i9)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i5 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z6 = false;
            }
            if (z6) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = list.get(m10808b(i10, z5, size)).mo9030d();
                }
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = 0;
                }
                if (!z) {
                    C16479d dVar3 = dVar2;
                    if (dVar != null) {
                        dVar.mo7649e(dVar2, i6, iArr, LayoutDirection.Ltr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (lVar2 != null) {
                    lVar2.mo7656d(dVar2, i6, iArr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C11463j Me = ArraysKt___ArraysKt.m39171Me(iArr2);
                if (z5) {
                    Me = C11479u.m44437q1(Me);
                }
                int r = Me.mo23049r();
                int w = Me.mo23051w();
                int y = Me.mo23052y();
                if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
                    while (true) {
                        int i12 = iArr2[r];
                        C2620u uVar = list.get(m10808b(r, z5, size));
                        if (z5) {
                            i12 = (i6 - i12) - uVar.mo9030d();
                        }
                        arrayList.add(uVar.mo9032f(i12, i7, i8));
                        if (r == w) {
                            break;
                        }
                        r += y;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i13 = i5;
            for (int i14 = 0; i14 < size2; i14++) {
                List<C2620u> list5 = list2;
                C2620u uVar2 = list2.get(i14);
                i13 -= uVar2.mo9031e();
                arrayList.add(uVar2.mo9032f(i13, i7, i8));
            }
            int size3 = list.size();
            int i15 = i5;
            for (int i16 = 0; i16 < size3; i16++) {
                C2620u uVar3 = list.get(i16);
                arrayList.add(uVar3.mo9032f(i15, i7, i8));
                i15 += uVar3.mo9031e();
            }
            int size4 = list3.size();
            for (int i17 = 0; i17 < size4; i17++) {
                C2620u uVar4 = list3.get(i17);
                arrayList.add(uVar4.mo9032f(i15, i7, i8));
                i15 += uVar4.mo9031e();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int m10808b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: c */
    public static final List<C2620u> m10809c(C2458g gVar, List<C2620u> list, C2621v vVar, C2569n nVar, int i, int i2, C2555n nVar2) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int b = ((C2620u) CollectionsKt___CollectionsKt.m40653k3(list)).mo9028b();
        if (gVar.mo8396d()) {
            b = Math.max(m10811e(gVar, i), b);
        }
        int min = Math.min(b + i2, i - 1);
        int b2 = ((C2620u) CollectionsKt___CollectionsKt.m40653k3(list)).mo9028b() + 1;
        if (b2 <= min) {
            while (true) {
                m10810d(objectRef, vVar, b2);
                if (b2 == min) {
                    break;
                }
                b2++;
            }
        }
        int size = nVar2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2555n.C2556a aVar = (C2555n.C2556a) nVar2.get(i3);
            int c = C2550i.m11425c(nVar, aVar.getKey(), aVar.getIndex());
            if (c > min && c < i) {
                m10810d(objectRef, vVar, c);
            }
        }
        List<C2620u> list2 = (List) objectRef.element;
        if (list2 == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return list2;
    }

    /* renamed from: d */
    public static final void m10810d(Ref.ObjectRef<List<C2620u>> objectRef, C2621v vVar, int i) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        T t = objectRef.element;
        if (t != null) {
            ((List) t).add(vVar.mo9033a(C2452b.m10906c(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: e */
    public static final int m10811e(C2458g gVar, int i) {
        return Math.min(gVar.mo8394b(), i - 1);
    }

    /* renamed from: f */
    public static final List<C2620u> m10812f(C2458g gVar, int i, C2621v vVar, C2569n nVar, int i2, int i3, C2555n nVar2) {
        int i4;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (gVar.mo8396d()) {
            i4 = Math.min(m10814h(gVar, i2), i);
        } else {
            i4 = i;
        }
        int max = Math.max(0, i4 - i3);
        int i5 = i - 1;
        if (max <= i5) {
            while (true) {
                m10813g(objectRef, vVar, i5);
                if (i5 == max) {
                    break;
                }
                i5--;
            }
        }
        int size = nVar2.size();
        for (int i6 = 0; i6 < size; i6++) {
            C2555n.C2556a aVar = (C2555n.C2556a) nVar2.get(i6);
            int c = C2550i.m11425c(nVar, aVar.getKey(), aVar.getIndex());
            if (c < max) {
                m10813g(objectRef, vVar, c);
            }
        }
        List<C2620u> list = (List) objectRef.element;
        if (list == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return list;
    }

    /* renamed from: g */
    public static final void m10813g(Ref.ObjectRef<List<C2620u>> objectRef, C2621v vVar, int i) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        T t = objectRef.element;
        if (t != null) {
            ((List) t).add(vVar.mo9033a(C2452b.m10906c(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: h */
    public static final int m10814h(C2458g gVar, int i) {
        return Math.min(gVar.mo8395c(), i - 1);
    }

    /* renamed from: i */
    public static final boolean m10815i(int i) {
        return i != Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: androidx.compose.foundation.lazy.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f2  */
    @org.jetbrains.annotations.C12579k
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.C2572p m10816j(int r32, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2569n r33, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2621v r34, int r35, int r36, int r37, int r38, int r39, int r40, float r41, long r42, boolean r44, @org.jetbrains.annotations.C12579k java.util.List<java.lang.Integer> r45, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2279l r46, @org.jetbrains.annotations.C12580l androidx.compose.foundation.layout.Arrangement.C2269d r47, boolean r48, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16479d r49, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r50, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2458g r51, int r52, @org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.layout.C2555n r53, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.layout.C15611w0.C15612a, kotlin.C11079d2>, ? extends androidx.compose.p004ui.layout.C15564g0> r54) {
        /*
            r9 = r32
            r7 = r34
            r8 = r35
            r15 = r36
            r10 = r42
            r14 = r45
            r13 = r54
            java.lang.String r0 = "itemProvider"
            r12 = r33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "measuredItemProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "headerIndexes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "density"
            r6 = r49
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "placementAnimator"
            r5 = r50
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "beyondBoundsInfo"
            r4 = r51
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pinnedItems"
            r3 = r53
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "layout"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r23 = 1
            r2 = 0
            if (r15 < 0) goto L_0x0048
            r0 = r23
            goto L_0x0049
        L_0x0048:
            r0 = r2
        L_0x0049:
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x03b0
            if (r37 < 0) goto L_0x0052
            r0 = r23
            goto L_0x0053
        L_0x0052:
            r0 = r2
        L_0x0053:
            if (r0 == 0) goto L_0x03a6
            if (r9 > 0) goto L_0x0091
            androidx.compose.foundation.lazy.p r14 = new androidx.compose.foundation.lazy.p
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            int r0 = androidx.compose.p004ui.unit.C16476b.m74364r(r42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = androidx.compose.p004ui.unit.C16476b.m74363q(r42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1 r6 = androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1.f6420f
            java.lang.Object r0 = r13.invoke(r0, r5, r6)
            r5 = r0
            androidx.compose.ui.layout.g0 r5 = (androidx.compose.p004ui.layout.C15564g0) r5
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            int r7 = -r15
            int r8 = r8 + r37
            r9 = 0
            if (r44 == 0) goto L_0x0083
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0085
        L_0x0083:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0085:
            r11 = r0
            r0 = r14
            r10 = r48
            r12 = r37
            r13 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x0091:
            r0 = r39
            if (r0 < r9) goto L_0x009e
            int r0 = r9 + -1
            int r0 = androidx.compose.foundation.lazy.C2452b.m10906c(r0)
            r16 = r2
            goto L_0x00a0
        L_0x009e:
            r16 = r40
        L_0x00a0:
            int r17 = kotlin.math.C11409d.m43851L0(r41)
            int r16 = r16 - r17
            int r3 = androidx.compose.foundation.lazy.C2452b.m10906c(r2)
            boolean r3 = androidx.compose.foundation.lazy.C2452b.m10909f(r0, r3)
            if (r3 == 0) goto L_0x00b6
            if (r16 >= 0) goto L_0x00b6
            int r17 = r17 + r16
            r16 = r2
        L_0x00b6:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r2 = -r15
            if (r38 >= 0) goto L_0x00c3
            r19 = r38
            r20 = r0
            goto L_0x00c7
        L_0x00c3:
            r20 = r0
            r19 = 0
        L_0x00c7:
            int r0 = r2 + r19
            int r16 = r16 + r0
            r4 = 0
            r31 = r16
            r16 = r2
            r2 = r31
        L_0x00d2:
            if (r2 >= 0) goto L_0x0103
            r39 = 0
            int r18 = androidx.compose.foundation.lazy.C2452b.m10906c(r39)
            int r18 = r20 - r18
            if (r18 <= 0) goto L_0x0103
            int r20 = r20 + -1
            int r5 = androidx.compose.foundation.lazy.C2452b.m10906c(r20)
            androidx.compose.foundation.lazy.u r6 = r7.mo9033a(r5)
            r40 = r5
            r5 = r39
            r3.add(r5, r6)
            int r5 = r6.mo9027a()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r6.mo9031e()
            int r2 = r2 + r5
            r20 = r40
            r6 = r49
            r5 = r50
            goto L_0x00d2
        L_0x0103:
            if (r2 >= r0) goto L_0x0108
            int r17 = r17 + r2
            r2 = r0
        L_0x0108:
            int r2 = r2 - r0
            int r6 = r8 + r37
            r19 = r4
            r5 = 0
            int r4 = kotlin.ranges.C11479u.m44447u(r6, r5)
            int r5 = -r2
            r39 = r2
            int r2 = r3.size()
            r21 = r5
            r22 = r20
            r5 = 0
        L_0x011e:
            if (r5 >= r2) goto L_0x0135
            java.lang.Object r24 = r3.get(r5)
            androidx.compose.foundation.lazy.u r24 = (androidx.compose.foundation.lazy.C2620u) r24
            int r22 = r22 + 1
            int r22 = androidx.compose.foundation.lazy.C2452b.m10906c(r22)
            int r24 = r24.mo9031e()
            int r21 = r21 + r24
            int r5 = r5 + 1
            goto L_0x011e
        L_0x0135:
            r2 = r39
            r39 = r6
            r5 = r19
            r6 = r21
            r14 = r22
        L_0x013f:
            if (r14 >= r9) goto L_0x0186
            if (r6 < r4) goto L_0x014b
            if (r6 <= 0) goto L_0x014b
            boolean r19 = r3.isEmpty()
            if (r19 == 0) goto L_0x0186
        L_0x014b:
            r40 = r4
            androidx.compose.foundation.lazy.u r4 = r7.mo9033a(r14)
            int r19 = r4.mo9031e()
            int r6 = r6 + r19
            if (r6 > r0) goto L_0x016d
            r19 = r0
            int r0 = r9 + -1
            if (r14 == r0) goto L_0x016f
            int r0 = r14 + 1
            int r0 = androidx.compose.foundation.lazy.C2452b.m10906c(r0)
            int r4 = r4.mo9031e()
            int r2 = r2 - r4
            r20 = r0
            goto L_0x017b
        L_0x016d:
            r19 = r0
        L_0x016f:
            int r0 = r4.mo9027a()
            int r0 = java.lang.Math.max(r5, r0)
            r3.add(r4)
            r5 = r0
        L_0x017b:
            int r14 = r14 + 1
            int r14 = androidx.compose.foundation.lazy.C2452b.m10906c(r14)
            r4 = r40
            r0 = r19
            goto L_0x013f
        L_0x0186:
            if (r6 >= r8) goto L_0x01c5
            int r0 = r8 - r6
            int r2 = r2 - r0
            int r6 = r6 + r0
        L_0x018c:
            if (r2 >= r15) goto L_0x01b8
            r4 = 0
            int r18 = androidx.compose.foundation.lazy.C2452b.m10906c(r4)
            int r18 = r20 - r18
            if (r18 <= 0) goto L_0x01b8
            int r20 = r20 + -1
            int r12 = androidx.compose.foundation.lazy.C2452b.m10906c(r20)
            androidx.compose.foundation.lazy.u r13 = r7.mo9033a(r12)
            r3.add(r4, r13)
            int r4 = r13.mo9027a()
            int r5 = java.lang.Math.max(r5, r4)
            int r4 = r13.mo9031e()
            int r2 = r2 + r4
            r13 = r54
            r20 = r12
            r12 = r33
            goto L_0x018c
        L_0x01b8:
            int r17 = r17 + r0
            if (r2 >= 0) goto L_0x01c5
            int r17 = r17 + r2
            int r6 = r6 + r2
            r12 = r5
            r13 = r6
            r0 = r17
            r2 = 0
            goto L_0x01c9
        L_0x01c5:
            r12 = r5
            r13 = r6
            r0 = r17
        L_0x01c9:
            int r4 = kotlin.math.C11409d.m43851L0(r41)
            int r4 = kotlin.math.C11409d.m43868U(r4)
            int r5 = kotlin.math.C11409d.m43868U(r0)
            if (r4 != r5) goto L_0x01e8
            int r4 = kotlin.math.C11409d.m43851L0(r41)
            int r4 = java.lang.Math.abs(r4)
            int r5 = java.lang.Math.abs(r0)
            if (r4 < r5) goto L_0x01e8
            float r0 = (float) r0
            r6 = r0
            goto L_0x01ea
        L_0x01e8:
            r6 = r41
        L_0x01ea:
            if (r2 < 0) goto L_0x01ef
            r0 = r23
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            if (r0 == 0) goto L_0x039c
            int r5 = -r2
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r3)
            androidx.compose.foundation.lazy.u r0 = (androidx.compose.foundation.lazy.C2620u) r0
            if (r15 > 0) goto L_0x0202
            if (r38 >= 0) goto L_0x01fe
            goto L_0x0202
        L_0x01fe:
            r4 = r0
            r24 = r2
            goto L_0x0236
        L_0x0202:
            int r1 = r3.size()
            r4 = r2
            r2 = r0
            r0 = 0
        L_0x0209:
            if (r0 >= r1) goto L_0x0230
            java.lang.Object r17 = r3.get(r0)
            androidx.compose.foundation.lazy.u r17 = (androidx.compose.foundation.lazy.C2620u) r17
            r40 = r1
            int r1 = r17.mo9031e()
            if (r4 == 0) goto L_0x0230
            if (r1 > r4) goto L_0x0230
            r41 = r2
            int r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r3)
            if (r0 == r2) goto L_0x0232
            int r4 = r4 - r1
            int r0 = r0 + 1
            java.lang.Object r1 = r3.get(r0)
            r2 = r1
            androidx.compose.foundation.lazy.u r2 = (androidx.compose.foundation.lazy.C2620u) r2
            r1 = r40
            goto L_0x0209
        L_0x0230:
            r41 = r2
        L_0x0232:
            r24 = r4
            r4 = r41
        L_0x0236:
            r0 = r51
            r1 = r20
            r26 = r16
            r25 = 0
            r2 = r34
            r27 = r3
            r3 = r33
            r7 = r4
            r4 = r32
            r17 = r5
            r5 = r52
            r28 = r39
            r8 = r6
            r6 = r53
            java.util.List r6 = m10812f(r0, r1, r2, r3, r4, r5, r6)
            int r0 = r6.size()
            r2 = r25
        L_0x025a:
            if (r2 >= r0) goto L_0x026d
            java.lang.Object r1 = r6.get(r2)
            androidx.compose.foundation.lazy.u r1 = (androidx.compose.foundation.lazy.C2620u) r1
            int r1 = r1.mo9027a()
            int r12 = java.lang.Math.max(r12, r1)
            int r2 = r2 + 1
            goto L_0x025a
        L_0x026d:
            r0 = r51
            r1 = r27
            r2 = r34
            r3 = r33
            r4 = r32
            r5 = r52
            r16 = r6
            r6 = r53
            java.util.List r0 = m10809c(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r0.size()
            r2 = r25
        L_0x0287:
            if (r2 >= r1) goto L_0x029a
            java.lang.Object r3 = r0.get(r2)
            androidx.compose.foundation.lazy.u r3 = (androidx.compose.foundation.lazy.C2620u) r3
            int r3 = r3.mo9027a()
            int r12 = java.lang.Math.max(r12, r3)
            int r2 = r2 + 1
            goto L_0x0287
        L_0x029a:
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r27)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x02b3
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x02b3
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x02b3
            r6 = r23
            goto L_0x02b5
        L_0x02b3:
            r6 = r25
        L_0x02b5:
            if (r44 == 0) goto L_0x02b9
            r1 = r12
            goto L_0x02ba
        L_0x02b9:
            r1 = r13
        L_0x02ba:
            int r29 = androidx.compose.p004ui.unit.C16478c.m74382g(r10, r1)
            if (r44 == 0) goto L_0x02c1
            r12 = r13
        L_0x02c1:
            int r30 = androidx.compose.p004ui.unit.C16478c.m74381f(r10, r12)
            r10 = r27
            r11 = r16
            r12 = r0
            r5 = r54
            r4 = r13
            r13 = r29
            r3 = r14
            r14 = r30
            r15 = r4
            r16 = r35
            r18 = r44
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            java.util.List r10 = m10807a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r1 = (int) r8
            r0 = r50
            r2 = r29
            r14 = r3
            r3 = r30
            r11 = r4
            r4 = r10
            r12 = r5
            r5 = r34
            r0.mo8278g(r1, r2, r3, r4, r5)
            r0 = r45
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x030f
            r0 = r10
            r1 = r34
            r2 = r45
            r3 = r36
            r4 = r29
            r5 = r30
            androidx.compose.foundation.lazy.r r0 = androidx.compose.foundation.lazy.C2515j.m11299a(r0, r1, r2, r3, r4, r5)
            goto L_0x0310
        L_0x030f:
            r0 = 0
        L_0x0310:
            if (r14 < r9) goto L_0x031b
            r1 = r35
            r4 = r8
            if (r11 <= r1) goto L_0x0318
            goto L_0x031c
        L_0x0318:
            r3 = r25
            goto L_0x031e
        L_0x031b:
            r4 = r8
        L_0x031c:
            r3 = r23
        L_0x031e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$5 r5 = new androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$5
            r5.<init>(r10, r0)
            java.lang.Object r1 = r12.invoke(r1, r2, r5)
            r5 = r1
            androidx.compose.ui.layout.g0 r5 = (androidx.compose.p004ui.layout.C15564g0) r5
            if (r6 == 0) goto L_0x0336
            r6 = r10
            goto L_0x037e
        L_0x0336:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r10.size()
            r1.<init>(r2)
            int r2 = r10.size()
            r6 = r25
        L_0x0345:
            if (r6 >= r2) goto L_0x037d
            java.lang.Object r8 = r10.get(r6)
            r11 = r8
            androidx.compose.foundation.lazy.r r11 = (androidx.compose.foundation.lazy.C2574r) r11
            int r12 = r11.getIndex()
            java.lang.Object r13 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r27)
            androidx.compose.foundation.lazy.u r13 = (androidx.compose.foundation.lazy.C2620u) r13
            int r13 = r13.mo9028b()
            if (r12 < r13) goto L_0x036e
            int r12 = r11.getIndex()
            java.lang.Object r13 = kotlin.collections.CollectionsKt___CollectionsKt.m40653k3(r27)
            androidx.compose.foundation.lazy.u r13 = (androidx.compose.foundation.lazy.C2620u) r13
            int r13 = r13.mo9028b()
            if (r12 <= r13) goto L_0x0370
        L_0x036e:
            if (r11 != r0) goto L_0x0373
        L_0x0370:
            r11 = r23
            goto L_0x0375
        L_0x0373:
            r11 = r25
        L_0x0375:
            if (r11 == 0) goto L_0x037a
            r1.add(r8)
        L_0x037a:
            int r6 = r6 + 1
            goto L_0x0345
        L_0x037d:
            r6 = r1
        L_0x037e:
            if (r44 == 0) goto L_0x0383
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0385
        L_0x0383:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0385:
            r11 = r0
            androidx.compose.foundation.lazy.p r14 = new androidx.compose.foundation.lazy.p
            r0 = r14
            r1 = r7
            r2 = r24
            r7 = r26
            r8 = r28
            r9 = r32
            r10 = r48
            r12 = r37
            r13 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x039c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03a6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m10816j(int, androidx.compose.foundation.lazy.n, androidx.compose.foundation.lazy.v, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.foundation.layout.Arrangement$d, boolean, androidx.compose.ui.unit.d, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.foundation.lazy.g, int, androidx.compose.foundation.lazy.layout.n, kotlin.jvm.functions.q):androidx.compose.foundation.lazy.p");
    }
}
