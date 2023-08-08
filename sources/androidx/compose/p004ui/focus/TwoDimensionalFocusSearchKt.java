package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.runtime.collection.C8423g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,425:1\n1#2:426\n1161#3,2:427\n1161#3,2:431\n1182#3:437\n1161#3,2:438\n1182#3:467\n1161#3,2:468\n359#4:429\n523#4:430\n48#4:447\n460#4,11:482\n460#4,11:501\n87#5:433\n87#5:463\n340#6:434\n206#6,2:435\n208#6,7:440\n215#6,15:448\n346#6:464\n237#6,2:465\n239#6,12:470\n251#6,8:493\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n120#1:427,2\n178#1:431,2\n179#1:437\n179#1:438,2\n214#1:467\n214#1:468,2\n125#1:429\n125#1:430\n179#1:447\n227#1:482,11\n259#1:501,11\n179#1:433\n214#1:463\n179#1:434\n179#1:435,2\n179#1:440,7\n179#1:448,15\n214#1:464\n214#1:465,2\n214#1:470,12\n214#1:493,8\n*E\n"})
/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt */
public final class TwoDimensionalFocusSearchKt {
    @C12579k

    /* renamed from: a */
    public static final String f37223a = "This function should only be used for 2-D focus search";
    @C12579k

    /* renamed from: b */
    public static final String f37224b = "ActiveParent must have a focusedChild";

    /* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$a */
    public /* synthetic */ class C15052a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p004ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.TwoDimensionalFocusSearchKt.C15052a.<clinit>():void");
        }
    }

    @C8761g
    /* renamed from: b */
    public static final FocusTargetModifierNode m64660b(FocusTargetModifierNode focusTargetModifierNode) {
        boolean z;
        if (focusTargetModifierNode.mo42164r0() == FocusStateImpl.ActiveParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FocusTargetModifierNode b = C15054a0.m64682b(focusTargetModifierNode);
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public static final boolean m64661c(C15098i iVar, C15098i iVar2, C15098i iVar3, int i) {
        if (m64662d(iVar3, i, iVar) || !m64662d(iVar2, i, iVar)) {
            return false;
        }
        if (m64663e(iVar3, i, iVar)) {
            C15059d.C15060a aVar = C15059d.f37228b;
            if (!C15059d.m64709n(i, aVar.mo42188h()) && !C15059d.m64709n(i, aVar.mo42192m()) && m64664f(iVar2, i, iVar) >= m64665g(iVar3, i, iVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m64662d(C15098i iVar, int i, C15098i iVar2) {
        boolean z;
        boolean z2;
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            z = true;
        } else {
            z = C15059d.m64709n(i, aVar.mo42192m());
        }
        if (!z) {
            if (C15059d.m64709n(i, aVar.mo42193n())) {
                z2 = true;
            } else {
                z2 = C15059d.m64709n(i, aVar.mo42184a());
            }
            if (!z2) {
                throw new IllegalStateException(f37223a.toString());
            } else if (iVar.mo42283x() > iVar2.mo42279t() && iVar.mo42279t() < iVar2.mo42283x()) {
                return true;
            }
        } else if (iVar.mo42271j() > iVar2.mo42249B() && iVar.mo42249B() < iVar2.mo42271j()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m64663e(C15098i iVar, int i, C15098i iVar2) {
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            if (iVar2.mo42279t() >= iVar.mo42283x()) {
                return true;
            }
        } else if (C15059d.m64709n(i, aVar.mo42192m())) {
            if (iVar2.mo42283x() <= iVar.mo42279t()) {
                return true;
            }
        } else if (C15059d.m64709n(i, aVar.mo42193n())) {
            if (iVar2.mo42249B() >= iVar.mo42271j()) {
                return true;
            }
        } else if (!C15059d.m64709n(i, aVar.mo42184a())) {
            throw new IllegalStateException(f37223a.toString());
        } else if (iVar2.mo42271j() <= iVar.mo42249B()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final float m64664f(C15098i iVar, int i, C15098i iVar2) {
        float f;
        float B;
        float j;
        float B2;
        float j2;
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            B2 = iVar2.mo42279t();
            j2 = iVar.mo42283x();
        } else {
            if (C15059d.m64709n(i, aVar.mo42192m())) {
                B = iVar.mo42279t();
                j = iVar2.mo42283x();
            } else if (C15059d.m64709n(i, aVar.mo42193n())) {
                B2 = iVar2.mo42249B();
                j2 = iVar.mo42271j();
            } else if (C15059d.m64709n(i, aVar.mo42184a())) {
                B = iVar.mo42249B();
                j = iVar2.mo42271j();
            } else {
                throw new IllegalStateException(f37223a.toString());
            }
            f = B - j;
            return Math.max(0.0f, f);
        }
        f = B2 - j2;
        return Math.max(0.0f, f);
    }

    /* renamed from: g */
    public static final float m64665g(C15098i iVar, int i, C15098i iVar2) {
        float f;
        float j;
        float j2;
        float B;
        float B2;
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            B = iVar2.mo42279t();
            B2 = iVar.mo42279t();
        } else {
            if (C15059d.m64709n(i, aVar.mo42192m())) {
                j = iVar.mo42283x();
                j2 = iVar2.mo42283x();
            } else if (C15059d.m64709n(i, aVar.mo42193n())) {
                B = iVar2.mo42249B();
                B2 = iVar.mo42249B();
            } else if (C15059d.m64709n(i, aVar.mo42184a())) {
                j = iVar.mo42271j();
                j2 = iVar2.mo42271j();
            } else {
                throw new IllegalStateException(f37223a.toString());
            }
            f = j - j2;
            return Math.max(1.0f, f);
        }
        f = B - B2;
        return Math.max(1.0f, f);
    }

    /* renamed from: h */
    public static final C15098i m64666h(C15098i iVar) {
        return new C15098i(iVar.mo42283x(), iVar.mo42271j(), iVar.mo42283x(), iVar.mo42271j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x002f A[EDGE_INSN: B:43:0x002f->B:41:0x002f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1 A[SYNTHETIC] */
    @androidx.compose.p004ui.C8761g
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64667i(androidx.compose.p004ui.node.C15678d r9, androidx.compose.runtime.collection.C8423g<androidx.compose.p004ui.focus.FocusTargetModifierNode> r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p004ui.node.C15739v0.m70597b(r0)
            androidx.compose.ui.m$d r1 = r9.mo17252q()
            boolean r1 = r1.mo17236Q()
            if (r1 == 0) goto L_0x00cc
            androidx.compose.runtime.collection.g r1 = new androidx.compose.runtime.collection.g
            r2 = 16
            androidx.compose.ui.m$d[] r2 = new androidx.compose.p004ui.C8767m.C8772d[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.m$d r2 = r9.mo17252q()
            androidx.compose.ui.m$d r2 = r2.mo17229F()
            if (r2 != 0) goto L_0x002c
            androidx.compose.ui.m$d r9 = r9.mo17252q()
            androidx.compose.p004ui.node.C15681e.m70221b(r1, r9)
            goto L_0x002f
        L_0x002c:
            r1.mo15463e(r2)
        L_0x002f:
            boolean r9 = r1.mo15477m0()
            if (r9 == 0) goto L_0x00cb
            int r9 = r1.mo15469h0()
            r2 = 1
            int r9 = r9 - r2
            java.lang.Object r9 = r1.mo15437D0(r9)
            androidx.compose.ui.m$d r9 = (androidx.compose.p004ui.C8767m.C8772d) r9
            int r4 = r9.mo17228E()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x00c6
            r4 = r9
        L_0x0049:
            if (r4 == 0) goto L_0x00c6
            int r5 = r4.mo17232I()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00c1
            boolean r5 = r4 instanceof androidx.compose.p004ui.focus.FocusTargetModifierNode
            if (r5 == 0) goto L_0x00be
            r5 = r4
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p004ui.focus.FocusTargetModifierNode) r5
            boolean r6 = r5.mo17236Q()
            if (r6 != 0) goto L_0x0061
        L_0x005f:
            r5 = r3
            goto L_0x00bf
        L_0x0061:
            androidx.compose.ui.focus.FocusProperties r6 = r5.mo42161p0()
            boolean r6 = r6.mo42109o()
            if (r6 == 0) goto L_0x006f
            r10.mo15463e(r5)
            goto L_0x005f
        L_0x006f:
            androidx.compose.ui.focus.FocusProperties r5 = r5.mo42161p0()
            kotlin.jvm.functions.l r5 = r5.mo42103i()
            androidx.compose.ui.focus.d$a r6 = androidx.compose.p004ui.focus.C15059d.f37228b
            int r6 = r6.mo42185b()
            androidx.compose.ui.focus.d r6 = androidx.compose.p004ui.focus.C15059d.m64706k(r6)
            java.lang.Object r5 = r5.invoke(r6)
            r6 = r5
            androidx.compose.ui.focus.FocusRequester r6 = (androidx.compose.p004ui.focus.FocusRequester) r6
            androidx.compose.ui.focus.FocusRequester$a r7 = androidx.compose.p004ui.focus.FocusRequester.f37201b
            androidx.compose.ui.focus.FocusRequester r8 = r7.mo42132d()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            if (r6 != 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            androidx.compose.ui.focus.FocusRequester r5 = (androidx.compose.p004ui.focus.FocusRequester) r5
            if (r5 == 0) goto L_0x00be
            androidx.compose.ui.focus.FocusRequester r6 = r7.mo42131b()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 != 0) goto L_0x005f
            androidx.compose.runtime.collection.g r5 = r5.mo42128f()
            int r6 = r5.mo15469h0()
            if (r6 <= 0) goto L_0x005f
            java.lang.Object[] r5 = r5.mo15462d0()
            r7 = r3
        L_0x00b3:
            r8 = r5[r7]
            androidx.compose.ui.focus.w r8 = (androidx.compose.p004ui.focus.C15084w) r8
            m64667i(r8, r10)
            int r7 = r7 + r2
            if (r7 < r6) goto L_0x00b3
            goto L_0x005f
        L_0x00be:
            r5 = r2
        L_0x00bf:
            if (r5 == 0) goto L_0x002f
        L_0x00c1:
            androidx.compose.ui.m$d r4 = r4.mo17229F()
            goto L_0x0049
        L_0x00c6:
            androidx.compose.p004ui.node.C15681e.m70221b(r1, r9)
            goto L_0x002f
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.TwoDimensionalFocusSearchKt.m64667i(androidx.compose.ui.node.d, androidx.compose.runtime.collection.g):void");
    }

    @C8761g
    /* renamed from: j */
    public static final FocusTargetModifierNode m64668j(C8423g<FocusTargetModifierNode> gVar, C15098i iVar, int i) {
        C15098i iVar2;
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            iVar2 = iVar.mo42260R(iVar.mo42253G() + ((float) 1), 0.0f);
        } else if (C15059d.m64709n(i, aVar.mo42192m())) {
            iVar2 = iVar.mo42260R(-(iVar.mo42253G() + ((float) 1)), 0.0f);
        } else if (C15059d.m64709n(i, aVar.mo42193n())) {
            iVar2 = iVar.mo42260R(0.0f, iVar.mo42278r() + ((float) 1));
        } else if (C15059d.m64709n(i, aVar.mo42184a())) {
            iVar2 = iVar.mo42260R(0.0f, -(iVar.mo42278r() + ((float) 1)));
        } else {
            throw new IllegalStateException(f37223a.toString());
        }
        int h0 = gVar.mo15469h0();
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i2 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) d0[i2];
                if (C15054a0.m64688h(focusTargetModifierNode2)) {
                    C15098i d = C15054a0.m64684d(focusTargetModifierNode2);
                    if (m64671m(d, iVar2, iVar, i)) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        iVar2 = d;
                    }
                }
                i2++;
            } while (i2 < h0);
        }
        return focusTargetModifierNode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: androidx.compose.ui.focus.FocusTargetModifierNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.p004ui.C8761g
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m64669k(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.focus.FocusTargetModifierNode r5, int r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.focus.FocusTargetModifierNode, java.lang.Boolean> r7) {
        /*
            java.lang.String r0 = "$this$findChildCorrespondingToFocusEnter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onFound"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.compose.ui.focus.FocusProperties r0 = r5.mo42161p0()
            kotlin.jvm.functions.l r0 = r0.mo42103i()
            androidx.compose.ui.focus.d r1 = androidx.compose.p004ui.focus.C15059d.m64706k(r6)
            java.lang.Object r0 = r0.invoke(r1)
            r1 = r0
            androidx.compose.ui.focus.FocusRequester r1 = (androidx.compose.p004ui.focus.FocusRequester) r1
            androidx.compose.ui.focus.FocusRequester$a r2 = androidx.compose.p004ui.focus.FocusRequester.f37201b
            androidx.compose.ui.focus.FocusRequester r3 = r2.mo42132d()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            r3 = 0
            if (r1 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r3
        L_0x002c:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.p004ui.focus.FocusRequester) r0
            r1 = 0
            if (r0 == 0) goto L_0x0041
            androidx.compose.ui.focus.FocusRequester r5 = r2.mo42131b()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            boolean r1 = r0.mo42126d(r7)
        L_0x0040:
            return r1
        L_0x0041:
            androidx.compose.runtime.collection.g r0 = new androidx.compose.runtime.collection.g
            r2 = 16
            androidx.compose.ui.focus.FocusTargetModifierNode[] r2 = new androidx.compose.p004ui.focus.FocusTargetModifierNode[r2]
            r0.<init>(r2, r1)
            m64667i(r5, r0)
            int r2 = r0.mo15469h0()
            r4 = 1
            if (r2 > r4) goto L_0x0070
            boolean r5 = r0.mo15476l0()
            if (r5 == 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            java.lang.Object[] r5 = r0.mo15462d0()
            r3 = r5[r1]
        L_0x0061:
            androidx.compose.ui.focus.FocusTargetModifierNode r3 = (androidx.compose.p004ui.focus.FocusTargetModifierNode) r3
            if (r3 == 0) goto L_0x006f
            java.lang.Object r5 = r7.invoke(r3)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
        L_0x006f:
            return r1
        L_0x0070:
            androidx.compose.ui.focus.d$a r2 = androidx.compose.p004ui.focus.C15059d.f37228b
            int r3 = r2.mo42185b()
            boolean r3 = androidx.compose.p004ui.focus.C15059d.m64709n(r6, r3)
            if (r3 == 0) goto L_0x0080
            int r6 = r2.mo42192m()
        L_0x0080:
            int r3 = r2.mo42192m()
            boolean r3 = androidx.compose.p004ui.focus.C15059d.m64709n(r6, r3)
            if (r3 == 0) goto L_0x008c
            r3 = r4
            goto L_0x0094
        L_0x008c:
            int r3 = r2.mo42184a()
            boolean r3 = androidx.compose.p004ui.focus.C15059d.m64709n(r6, r3)
        L_0x0094:
            if (r3 == 0) goto L_0x009f
            androidx.compose.ui.geometry.i r5 = androidx.compose.p004ui.focus.C15054a0.m64684d(r5)
            androidx.compose.ui.geometry.i r5 = m64677s(r5)
            goto L_0x00bc
        L_0x009f:
            int r3 = r2.mo42188h()
            boolean r3 = androidx.compose.p004ui.focus.C15059d.m64709n(r6, r3)
            if (r3 == 0) goto L_0x00aa
            goto L_0x00b2
        L_0x00aa:
            int r2 = r2.mo42193n()
            boolean r4 = androidx.compose.p004ui.focus.C15059d.m64709n(r6, r2)
        L_0x00b2:
            if (r4 == 0) goto L_0x00cd
            androidx.compose.ui.geometry.i r5 = androidx.compose.p004ui.focus.C15054a0.m64684d(r5)
            androidx.compose.ui.geometry.i r5 = m64666h(r5)
        L_0x00bc:
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = m64668j(r0, r5, r6)
            if (r5 == 0) goto L_0x00cc
            java.lang.Object r5 = r7.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
        L_0x00cc:
            return r1
        L_0x00cd:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This function should only be used for 2-D focus search"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.TwoDimensionalFocusSearchKt.m64669k(androidx.compose.ui.focus.FocusTargetModifierNode, int, kotlin.jvm.functions.l):boolean");
    }

    @C8761g
    /* renamed from: l */
    public static final boolean m64670l(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        if (m64676r(focusTargetModifierNode, focusTargetModifierNode2, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) C15053a.m64680a(focusTargetModifierNode, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetModifierNode, focusTargetModifierNode2, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m64671m(C15098i iVar, C15098i iVar2, C15098i iVar3, int i) {
        if (!m64672n(iVar, i, iVar3)) {
            return false;
        }
        if (m64672n(iVar2, i, iVar3) && !m64661c(iVar3, iVar, iVar2, i) && (m64661c(iVar3, iVar2, iVar, i) || m64675q(i, iVar3, iVar) >= m64675q(i, iVar3, iVar2))) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m64672n(C15098i iVar, int i, C15098i iVar2) {
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            if ((iVar2.mo42283x() > iVar.mo42283x() || iVar2.mo42279t() >= iVar.mo42283x()) && iVar2.mo42279t() > iVar.mo42279t()) {
                return true;
            }
        } else if (C15059d.m64709n(i, aVar.mo42192m())) {
            if ((iVar2.mo42279t() < iVar.mo42279t() || iVar2.mo42283x() <= iVar.mo42279t()) && iVar2.mo42283x() < iVar.mo42283x()) {
                return true;
            }
        } else if (C15059d.m64709n(i, aVar.mo42193n())) {
            if ((iVar2.mo42271j() > iVar.mo42271j() || iVar2.mo42249B() >= iVar.mo42271j()) && iVar2.mo42249B() > iVar.mo42249B()) {
                return true;
            }
        } else if (!C15059d.m64709n(i, aVar.mo42184a())) {
            throw new IllegalStateException(f37223a.toString());
        } else if ((iVar2.mo42249B() < iVar.mo42249B() || iVar2.mo42271j() <= iVar.mo42249B()) && iVar2.mo42271j() < iVar.mo42271j()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final float m64673o(C15098i iVar, int i, C15098i iVar2) {
        float f;
        float B;
        float j;
        float B2;
        float j2;
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            B2 = iVar2.mo42279t();
            j2 = iVar.mo42283x();
        } else {
            if (C15059d.m64709n(i, aVar.mo42192m())) {
                B = iVar.mo42279t();
                j = iVar2.mo42283x();
            } else if (C15059d.m64709n(i, aVar.mo42193n())) {
                B2 = iVar2.mo42249B();
                j2 = iVar.mo42271j();
            } else if (C15059d.m64709n(i, aVar.mo42184a())) {
                B = iVar.mo42249B();
                j = iVar2.mo42271j();
            } else {
                throw new IllegalStateException(f37223a.toString());
            }
            f = B - j;
            return Math.max(0.0f, f);
        }
        f = B2 - j2;
        return Math.max(0.0f, f);
    }

    /* renamed from: p */
    public static final float m64674p(C15098i iVar, int i, C15098i iVar2) {
        boolean z;
        float f;
        float t;
        float t2;
        float G;
        C15059d.C15060a aVar = C15059d.f37228b;
        boolean z2 = true;
        if (C15059d.m64709n(i, aVar.mo42188h())) {
            z = true;
        } else {
            z = C15059d.m64709n(i, aVar.mo42192m());
        }
        if (z) {
            f = (float) 2;
            t = iVar2.mo42249B() + (iVar2.mo42278r() / f);
            t2 = iVar.mo42249B();
            G = iVar.mo42278r();
        } else {
            if (!C15059d.m64709n(i, aVar.mo42193n())) {
                z2 = C15059d.m64709n(i, aVar.mo42184a());
            }
            if (z2) {
                f = (float) 2;
                t = iVar2.mo42279t() + (iVar2.mo42253G() / f);
                t2 = iVar.mo42279t();
                G = iVar.mo42253G();
            } else {
                throw new IllegalStateException(f37223a.toString());
            }
        }
        return t - (t2 + (G / f));
    }

    /* renamed from: q */
    public static final long m64675q(int i, C15098i iVar, C15098i iVar2) {
        long abs = (long) Math.abs(m64673o(iVar2, i, iVar));
        long abs2 = (long) Math.abs(m64674p(iVar2, i, iVar));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    @C8761g
    /* renamed from: r */
    public static final boolean m64676r(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        FocusTargetModifierNode j;
        C8423g gVar = new C8423g(new FocusTargetModifierNode[16], 0);
        int b = C15739v0.m70597b(1024);
        if (focusTargetModifierNode.mo17252q().mo17236Q()) {
            C8423g gVar2 = new C8423g(new C8767m.C8772d[16], 0);
            C8767m.C8772d F = focusTargetModifierNode.mo17252q().mo17229F();
            if (F == null) {
                C15681e.m70221b(gVar2, focusTargetModifierNode.mo17252q());
            } else {
                gVar2.mo15463e(F);
            }
            while (gVar2.mo15477m0()) {
                C8767m.C8772d dVar = (C8767m.C8772d) gVar2.mo15437D0(gVar2.mo15469h0() - 1);
                if ((dVar.mo17228E() & b) == 0) {
                    C15681e.m70221b(gVar2, dVar);
                } else {
                    while (true) {
                        if (dVar == null) {
                            break;
                        } else if ((dVar.mo17232I() & b) == 0) {
                            dVar = dVar.mo17229F();
                        } else if (dVar instanceof FocusTargetModifierNode) {
                            gVar.mo15463e((FocusTargetModifierNode) dVar);
                        }
                    }
                }
            }
            while (gVar.mo15477m0() && (j = m64668j(gVar, C15054a0.m64684d(focusTargetModifierNode2), i)) != null) {
                if (j.mo42161p0().mo42109o()) {
                    return lVar.invoke(j).booleanValue();
                }
                FocusRequester invoke = j.mo42161p0().mo42103i().invoke(C15059d.m64706k(i));
                FocusRequester.C15047a aVar = FocusRequester.f37201b;
                if (Intrinsics.areEqual((Object) invoke, (Object) aVar.mo42132d())) {
                    invoke = null;
                }
                FocusRequester focusRequester = invoke;
                if (focusRequester != null) {
                    if (Intrinsics.areEqual((Object) focusRequester, (Object) aVar.mo42131b())) {
                        return false;
                    }
                    return focusRequester.mo42126d(lVar);
                } else if (m64670l(j, focusTargetModifierNode2, i, lVar)) {
                    return true;
                } else {
                    gVar.mo15495z0(j);
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: s */
    public static final C15098i m64677s(C15098i iVar) {
        return new C15098i(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42279t(), iVar.mo42249B());
    }

    @C12580l
    @C8761g
    /* renamed from: t */
    public static final Boolean m64678t(@C12579k FocusTargetModifierNode focusTargetModifierNode, int i, @C12579k C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(lVar, "onFound");
        FocusStateImpl s0 = focusTargetModifierNode.mo42165s0();
        int[] iArr = C15052a.$EnumSwitchMapping$0;
        int i2 = iArr[s0.ordinal()];
        if (i2 == 1) {
            FocusTargetModifierNode f = C15054a0.m64686f(focusTargetModifierNode);
            if (f != null) {
                int i3 = iArr[f.mo42165s0().ordinal()];
                if (i3 == 1) {
                    Boolean t = m64678t(f, i, lVar);
                    if (!Intrinsics.areEqual((Object) t, (Object) Boolean.FALSE)) {
                        return t;
                    }
                    FocusRequester invoke = f.mo42161p0().mo42097e().invoke(C15059d.m64706k(i));
                    FocusRequester.C15047a aVar = FocusRequester.f37201b;
                    if (Intrinsics.areEqual((Object) invoke, (Object) aVar.mo42132d())) {
                        invoke = null;
                    }
                    FocusRequester focusRequester = invoke;
                    if (focusRequester == null) {
                        return Boolean.valueOf(m64670l(focusTargetModifierNode, m64660b(f), i, lVar));
                    }
                    if (Intrinsics.areEqual((Object) focusRequester, (Object) aVar.mo42131b())) {
                        return null;
                    }
                    return Boolean.valueOf(focusRequester.mo42126d(lVar));
                } else if (i3 == 2 || i3 == 3) {
                    return Boolean.valueOf(m64670l(focusTargetModifierNode, f, i, lVar));
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        } else if (i2 == 2 || i2 == 3) {
            return Boolean.valueOf(m64669k(focusTargetModifierNode, i, lVar));
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (focusTargetModifierNode.mo42161p0().mo42109o()) {
                return lVar.invoke(focusTargetModifierNode);
            } else {
                return Boolean.FALSE;
            }
        }
    }
}
