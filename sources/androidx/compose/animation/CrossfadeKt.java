package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,147:1\n25#2:148\n25#2:156\n36#2:163\n460#2,13:202\n473#2,3:222\n1057#3,3:149\n1060#3,3:153\n1057#3,6:157\n1057#3,6:164\n1#4:152\n350#5,7:170\n32#6,6:177\n32#6,6:216\n67#7,6:183\n73#7:215\n77#7:226\n75#8:189\n76#8,11:191\n89#8:225\n76#9:190\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:148\n105#1:156\n112#1:163\n139#1:202,13\n139#1:222,3\n104#1:149,3\n104#1:153,3\n105#1:157,6\n112#1:164,6\n118#1:170,7\n127#1:177,6\n140#1:216,6\n139#1:183,6\n139#1:215\n139#1:226\n139#1:189\n139#1:191,11\n139#1:225\n139#1:190\n*E\n"})
public final class CrossfadeKt {
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    @androidx.compose.animation.C2031i
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m7788a(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.Transition<T> r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r19, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C1956d0<java.lang.Float> r20, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super T, ? extends java.lang.Object> r21, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super T, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r22, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24, int r25) {
        /*
            r6 = r18
            r7 = r22
            r8 = r24
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 679005231(0x2878cc2f, float:1.3811041E-14)
            r1 = r23
            androidx.compose.runtime.o r9 = r1.mo15009o(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r25 & r1
            r10 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r8 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x0032
            boolean r1 = r9.mo15006n0(r6)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = r10
        L_0x0030:
            r1 = r1 | r8
            goto L_0x0033
        L_0x0032:
            r1 = r8
        L_0x0033:
            r2 = r25 & 1
            if (r2 == 0) goto L_0x003a
            r1 = r1 | 48
            goto L_0x004d
        L_0x003a:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r19
            boolean r4 = r9.mo15006n0(r3)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r1 = r1 | r4
            goto L_0x004f
        L_0x004d:
            r3 = r19
        L_0x004f:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 128(0x80, float:1.794E-43)
        L_0x0055:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x005c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005c:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x006f
            r11 = r21
            boolean r12 = r9.mo15006n0(r11)
            if (r12 == 0) goto L_0x006b
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r1 = r1 | r12
            goto L_0x0071
        L_0x006f:
            r11 = r21
        L_0x0071:
            r12 = r25 & 8
            if (r12 == 0) goto L_0x0078
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008a
        L_0x0078:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x008a
            boolean r12 = r9.mo15006n0(r7)
            if (r12 == 0) goto L_0x0087
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r1 = r1 | r12
        L_0x008a:
            r12 = r1
            if (r4 != r10) goto L_0x00a5
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r12
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r13) goto L_0x00a5
            boolean r1 = r9.mo15011p()
            if (r1 != 0) goto L_0x009c
            goto L_0x00a5
        L_0x009c:
            r9.mo14958a0()
            r2 = r3
            r4 = r11
            r3 = r20
            goto L_0x0300
        L_0x00a5:
            if (r2 == 0) goto L_0x00ab
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r13 = r1
            goto L_0x00ac
        L_0x00ab:
            r13 = r3
        L_0x00ac:
            r14 = 0
            if (r4 == 0) goto L_0x00b7
            r1 = 7
            r2 = 0
            androidx.compose.animation.core.z0 r1 = androidx.compose.animation.core.C1972h.m8392q(r14, r14, r2, r1, r2)
            r15 = r1
            goto L_0x00b9
        L_0x00b7:
            r15 = r20
        L_0x00b9:
            if (r5 == 0) goto L_0x00be
            androidx.compose.animation.CrossfadeKt$Crossfade$3 r1 = androidx.compose.animation.CrossfadeKt$Crossfade$3.f5224f
            r11 = r1
        L_0x00be:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            r2 = -1
            if (r1 == 0) goto L_0x00ca
            java.lang.String r1 = "androidx.compose.animation.Crossfade (Crossfade.kt:97)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r12, r2, r1)
        L_0x00ca:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo14918M(r0)
            java.lang.Object r1 = r9.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            if (r1 != r4) goto L_0x00ea
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.C8415c2.m30237f()
            java.lang.Object r4 = r18.mo6700h()
            r1.add(r4)
            r9.mo14893C(r1)
        L_0x00ea:
            r9.mo15002m0()
            r5 = r1
            androidx.compose.runtime.snapshots.SnapshotStateList r5 = (androidx.compose.runtime.snapshots.SnapshotStateList) r5
            r9.mo14918M(r0)
            java.lang.Object r0 = r9.mo14921N()
            java.lang.Object r1 = r3.mo16277a()
            if (r0 != r1) goto L_0x0105
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9.mo14893C(r0)
        L_0x0105:
            r9.mo15002m0()
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4
            r0 = -1621449213(0xffffffff9f5aa603, float:-4.6300617E-20)
            r9.mo14918M(r0)
            java.lang.Object r0 = r18.mo6700h()
            java.lang.Object r1 = r18.mo6706o()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r1 = 1
            if (r0 == 0) goto L_0x015d
            int r0 = r5.size()
            if (r0 != r1) goto L_0x0134
            java.lang.Object r0 = r5.get(r14)
            java.lang.Object r1 = r18.mo6706o()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x015d
        L_0x0134:
            r0 = 1157296644(0x44faf204, float:2007.563)
            r9.mo14918M(r0)
            boolean r0 = r9.mo15006n0(r6)
            java.lang.Object r1 = r9.mo14921N()
            if (r0 != 0) goto L_0x014a
            java.lang.Object r0 = r3.mo16277a()
            if (r1 != r0) goto L_0x0152
        L_0x014a:
            androidx.compose.animation.CrossfadeKt$Crossfade$4$1 r1 = new androidx.compose.animation.CrossfadeKt$Crossfade$4$1
            r1.<init>(r6)
            r9.mo14893C(r1)
        L_0x0152:
            r9.mo15002m0()
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.C11300l) r1
            kotlin.collections.C10994x.m42348I0(r5, r1)
            r4.clear()
        L_0x015d:
            r9.mo15002m0()
            java.lang.Object r0 = r18.mo6706o()
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x01df
            java.util.Iterator r0 = r5.iterator()
            r1 = r14
        L_0x016f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0190
            java.lang.Object r3 = r0.next()
            java.lang.Object r3 = r11.invoke(r3)
            java.lang.Object r10 = r18.mo6706o()
            java.lang.Object r10 = r11.invoke(r10)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r10)
            if (r3 == 0) goto L_0x018c
            goto L_0x0191
        L_0x018c:
            int r1 = r1 + 1
            r10 = 2
            goto L_0x016f
        L_0x0190:
            r1 = r2
        L_0x0191:
            if (r1 != r2) goto L_0x019b
            java.lang.Object r0 = r18.mo6706o()
            r5.add(r0)
            goto L_0x01a2
        L_0x019b:
            java.lang.Object r0 = r18.mo6706o()
            r5.set(r1, r0)
        L_0x01a2:
            r4.clear()
            int r10 = r5.size()
            r3 = r14
        L_0x01aa:
            if (r3 >= r10) goto L_0x01df
            java.lang.Object r2 = r5.get(r3)
            androidx.compose.animation.CrossfadeKt$Crossfade$5$1 r1 = new androidx.compose.animation.CrossfadeKt$Crossfade$5$1
            r0 = r1
            r14 = r1
            r6 = 1
            r1 = r18
            r19 = r2
            r2 = r12
            r16 = r3
            r3 = r15
            r17 = r4
            r4 = r19
            r20 = r5
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1426421288(0xffffffffaafa89d8, float:-4.450457E-13)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r9, r0, r6, r14)
            r2 = r19
            r1 = r17
            r1.put(r2, r0)
            int r3 = r16 + 1
            r14 = 0
            r6 = r18
            r5 = r20
            r4 = r1
            goto L_0x01aa
        L_0x01df:
            r1 = r4
            r20 = r5
            int r0 = r12 >> 3
            r0 = r0 & 14
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r9.mo14918M(r2)
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r2 = r2.mo17061C()
            int r3 = r0 >> 3
            r4 = r3 & 14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.BoxKt.m9849k(r2, r4, r9, r3)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r9.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r9.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r9.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r9.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r10 = r6.mo44585a()
            kotlin.jvm.functions.q r12 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r13)
            int r0 = r0 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | 6
            androidx.compose.runtime.d r14 = r9.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x0241
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0241:
            r9.mo14938T()
            boolean r14 = r9.mo14997l()
            if (r14 == 0) goto L_0x024e
            r9.mo14947W(r10)
            goto L_0x0251
        L_0x024e:
            r9.mo14888A()
        L_0x0251:
            r9.mo14941U()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r9)
            kotlin.jvm.functions.p r14 = r6.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r10, r2, r14)
            kotlin.jvm.functions.p r2 = r6.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r10, r3, r2)
            kotlin.jvm.functions.p r2 = r6.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r10, r4, r2)
            kotlin.jvm.functions.p r2 = r6.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r10, r5, r2)
            r9.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r9)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            int r3 = r0 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.invoke(r2, r9, r3)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.mo14918M(r2)
            int r0 = r0 >> 9
            r0 = r0 & 14
            r2 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r9.mo14918M(r2)
            r0 = r0 & 11
            r2 = 2
            if (r0 != r2) goto L_0x02aa
            boolean r0 = r9.mo15011p()
            if (r0 != 0) goto L_0x02a6
            goto L_0x02aa
        L_0x02a6:
            r9.mo14958a0()
            goto L_0x02e5
        L_0x02aa:
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r0 = -1621447954(0xffffffff9f5aaaee, float:-4.6304685E-20)
            r9.mo14918M(r0)
            int r0 = r20.size()
            r4 = 0
        L_0x02b7:
            if (r4 >= r0) goto L_0x02e2
            r2 = r20
            java.lang.Object r3 = r2.get(r4)
            r5 = -450541366(0xffffffffe52548ca, float:-4.8783324E22)
            java.lang.Object r6 = r11.invoke(r3)
            r9.mo14933R(r5, r6)
            java.lang.Object r3 = r1.get(r3)
            kotlin.jvm.functions.p r3 = (kotlin.jvm.functions.C11304p) r3
            r5 = 0
            if (r3 != 0) goto L_0x02d3
            goto L_0x02da
        L_0x02d3:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.invoke(r9, r6)
        L_0x02da:
            r9.mo14998l0()
            int r4 = r4 + 1
            r20 = r2
            goto L_0x02b7
        L_0x02e2:
            r9.mo15002m0()
        L_0x02e5:
            r9.mo15002m0()
            r9.mo15002m0()
            r9.mo14896D()
            r9.mo15002m0()
            r9.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02fd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02fd:
            r4 = r11
            r2 = r13
            r3 = r15
        L_0x0300:
            androidx.compose.runtime.t1 r9 = r9.mo15020s()
            if (r9 != 0) goto L_0x0307
            goto L_0x0318
        L_0x0307:
            androidx.compose.animation.CrossfadeKt$Crossfade$7 r10 = new androidx.compose.animation.CrossfadeKt$Crossfade$7
            r0 = r10
            r1 = r18
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.mo15202a(r10)
        L_0x0318:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.m7788a(androidx.compose.animation.core.Transition, androidx.compose.ui.m, androidx.compose.animation.core.d0, kotlin.jvm.functions.l, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m7789b(T r16, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r17, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C1956d0<java.lang.Float> r18, @org.jetbrains.annotations.C12580l java.lang.String r19, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super T, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r20, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r21, int r22, int r23) {
        /*
            r1 = r16
            r10 = r20
            r11 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -310686752(0xffffffffed7b4be0, float:-4.860779E27)
            r2 = r21
            androidx.compose.runtime.o r12 = r2.mo15009o(r0)
            r2 = r23 & 1
            r3 = 4
            if (r2 == 0) goto L_0x001c
            r2 = r11 | 6
            goto L_0x002c
        L_0x001c:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002b
            boolean r2 = r12.mo15006n0(r1)
            if (r2 == 0) goto L_0x0028
            r2 = r3
            goto L_0x0029
        L_0x0028:
            r2 = 2
        L_0x0029:
            r2 = r2 | r11
            goto L_0x002c
        L_0x002b:
            r2 = r11
        L_0x002c:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0033
            r2 = r2 | 48
            goto L_0x0046
        L_0x0033:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0046
            r5 = r17
            boolean r6 = r12.mo15006n0(r5)
            if (r6 == 0) goto L_0x0042
            r6 = 32
            goto L_0x0044
        L_0x0042:
            r6 = 16
        L_0x0044:
            r2 = r2 | r6
            goto L_0x0048
        L_0x0046:
            r5 = r17
        L_0x0048:
            r6 = r23 & 4
            if (r6 == 0) goto L_0x004e
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x004e:
            r7 = r23 & 8
            if (r7 == 0) goto L_0x0055
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0068
        L_0x0055:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0068
            r8 = r19
            boolean r9 = r12.mo15006n0(r8)
            if (r9 == 0) goto L_0x0064
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0066
        L_0x0064:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0066:
            r2 = r2 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r19
        L_0x006a:
            r9 = r23 & 16
            r13 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0074
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0084
        L_0x0074:
            r9 = r11 & r13
            if (r9 != 0) goto L_0x0084
            boolean r9 = r12.mo15006n0(r10)
            if (r9 == 0) goto L_0x0081
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0083
        L_0x0081:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0083:
            r2 = r2 | r9
        L_0x0084:
            if (r6 != r3) goto L_0x009e
            r3 = 46811(0xb6db, float:6.5596E-41)
            r3 = r3 & r2
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r9) goto L_0x009e
            boolean r3 = r12.mo15011p()
            if (r3 != 0) goto L_0x0095
            goto L_0x009e
        L_0x0095:
            r12.mo14958a0()
            r3 = r18
            r2 = r5
            r4 = r8
            goto L_0x00f3
        L_0x009e:
            if (r4 == 0) goto L_0x00a4
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r14 = r3
            goto L_0x00a5
        L_0x00a4:
            r14 = r5
        L_0x00a5:
            r3 = 0
            if (r6 == 0) goto L_0x00b0
            r4 = 7
            r5 = 0
            androidx.compose.animation.core.z0 r4 = androidx.compose.animation.core.C1972h.m8392q(r3, r3, r5, r4, r5)
            r15 = r4
            goto L_0x00b2
        L_0x00b0:
            r15 = r18
        L_0x00b2:
            if (r7 == 0) goto L_0x00b8
            java.lang.String r4 = "Crossfade"
            r9 = r4
            goto L_0x00b9
        L_0x00b8:
            r9 = r8
        L_0x00b9:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x00c5
            r4 = -1
            java.lang.String r5 = "androidx.compose.animation.Crossfade (Crossfade.kt:48)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r2, r4, r5)
        L_0x00c5:
            r0 = r2 & 8
            r4 = r2 & 14
            r0 = r0 | r4
            int r4 = r2 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8196o(r1, r9, r12, r0, r3)
            r5 = 0
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2 = r2 & r13
            r8 = r3 | r2
            r13 = 4
            r2 = r0
            r3 = r14
            r4 = r15
            r6 = r20
            r7 = r12
            r0 = r9
            r9 = r13
            m7788a(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00f0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00f0:
            r4 = r0
            r2 = r14
            r3 = r15
        L_0x00f3:
            androidx.compose.runtime.t1 r8 = r12.mo15020s()
            if (r8 != 0) goto L_0x00fa
            goto L_0x010b
        L_0x00fa:
            androidx.compose.animation.CrossfadeKt$Crossfade$1 r9 = new androidx.compose.animation.CrossfadeKt$Crossfade$1
            r0 = r9
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.m7789b(java.lang.Object, androidx.compose.ui.m, androidx.compose.animation.core.d0, java.lang.String, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Crossfade API now has a new label parameter added.")
    /* renamed from: c */
    public static final /* synthetic */ void m7790c(Object obj, C8767m mVar, C1956d0 d0Var, C11305q qVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(qVar, "content");
        C8592o o = oVar.mo15009o(523603005);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(obj)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (o.mo15006n0(qVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if (i8 == 4 && (i3 & 5851) == 1170 && o.mo15011p()) {
            o.mo14958a0();
        } else {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (i8 != 0) {
                d0Var = C1972h.m8392q(0, 0, (C2022z) null, 7, (Object) null);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(523603005, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            m7788a(TransitionKt.m8196o(obj, (String) null, o, (i3 & 8) | (i3 & 14), 2), mVar, d0Var, (C11300l) null, qVar, o, (i3 & 112) | 512 | ((i3 << 3) & 57344), 4);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        }
        C8767m mVar2 = mVar;
        C1956d0 d0Var2 = d0Var;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CrossfadeKt$Crossfade$2(obj, mVar2, d0Var2, qVar, i, i2));
        }
    }
}
