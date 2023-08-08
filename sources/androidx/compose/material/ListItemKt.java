package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,429:1\n74#2:430\n75#2,11:432\n88#2:457\n74#2:458\n75#2,11:460\n88#2:485\n76#3:431\n76#3:459\n456#4,14:443\n456#4,14:471\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n353#1:430\n353#1:432,11\n353#1:457\n395#1:458\n395#1:460,11\n395#1:485\n353#1:431\n395#1:459\n353#1:443,14\n395#1:471,14\n*E\n"})
public final class ListItemKt {
    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m13552a(List<C16483g> list, C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i, int i2) {
        C8592o o = oVar.mo15009o(1631148337);
        if ((i2 & 2) != 0) {
            mVar = C8767m.f23478j;
        }
        C8767m mVar2 = mVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1631148337, i, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:347)");
        }
        ListItemKt$BaselinesOffsetColumn$1 listItemKt$BaselinesOffsetColumn$1 = new ListItemKt$BaselinesOffsetColumn$1(list);
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar2);
        int i3 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a);
        } else {
            o.mo14888A();
        }
        C8592o b = Updater.m30180b(o);
        Updater.m30188j(b, listItemKt$BaselinesOffsetColumn$1, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i3 >> 3) & 112));
        o.mo14918M(2058660585);
        pVar.invoke(o, Integer.valueOf((i3 >> 9) & 14));
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ListItemKt$BaselinesOffsetColumn$2(list, mVar2, pVar, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fb  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13553b(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r21, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r22, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r23, boolean r24, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29, int r30) {
        /*
            r7 = r27
            r8 = r29
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -450923337(0xffffffffe51f74b7, float:-4.706308E22)
            r1 = r28
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r8 | 6
            r4 = r3
            r3 = r21
            goto L_0x0030
        L_0x001c:
            r3 = r8 & 14
            if (r3 != 0) goto L_0x002d
            r3 = r21
            boolean r4 = r1.mo15006n0(r3)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 2
        L_0x002b:
            r4 = r4 | r8
            goto L_0x0030
        L_0x002d:
            r3 = r21
            r4 = r8
        L_0x0030:
            r5 = r30 & 2
            if (r5 == 0) goto L_0x0037
            r4 = r4 | 48
            goto L_0x004a
        L_0x0037:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r22
            boolean r9 = r1.mo14927P(r6)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r4 = r4 | r9
            goto L_0x004c
        L_0x004a:
            r6 = r22
        L_0x004c:
            r9 = r30 & 4
            if (r9 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r23
            boolean r11 = r1.mo14927P(r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r11
            goto L_0x0068
        L_0x0066:
            r10 = r23
        L_0x0068:
            r11 = r30 & 8
            if (r11 == 0) goto L_0x006f
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r12 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r24
            boolean r13 = r1.mo14961b(r12)
            if (r13 == 0) goto L_0x007e
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r4 = r4 | r13
            goto L_0x0084
        L_0x0082:
            r12 = r24
        L_0x0084:
            r13 = r30 & 16
            if (r13 == 0) goto L_0x008b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008b:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00a0
            r14 = r25
            boolean r15 = r1.mo14927P(r14)
            if (r15 == 0) goto L_0x009c
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r15
            goto L_0x00a2
        L_0x00a0:
            r14 = r25
        L_0x00a2:
            r15 = r30 & 32
            if (r15 == 0) goto L_0x00ad
            r16 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r16
            r0 = r26
            goto L_0x00c2
        L_0x00ad:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r8 & r16
            r0 = r26
            if (r16 != 0) goto L_0x00c2
            boolean r17 = r1.mo14927P(r0)
            if (r17 == 0) goto L_0x00be
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r4 = r4 | r17
        L_0x00c2:
            r17 = r30 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00cb
            r4 = r4 | r18
            goto L_0x00de
        L_0x00cb:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r8 & r17
            if (r17 != 0) goto L_0x00de
            boolean r17 = r1.mo14927P(r7)
            if (r17 == 0) goto L_0x00da
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r4 = r4 | r17
        L_0x00de:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r4 & r17
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00fb
            boolean r0 = r1.mo15011p()
            if (r0 != 0) goto L_0x00ef
            goto L_0x00fb
        L_0x00ef:
            r1.mo14958a0()
            r2 = r21
            r9 = r26
            r3 = r10
            r4 = r12
            r5 = r14
            goto L_0x01dd
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0102
        L_0x0100:
            r0 = r21
        L_0x0102:
            r2 = 0
            if (r5 == 0) goto L_0x0106
            r6 = r2
        L_0x0106:
            if (r9 == 0) goto L_0x010a
            r3 = r2
            goto L_0x010b
        L_0x010a:
            r3 = r10
        L_0x010b:
            if (r11 == 0) goto L_0x0110
            r19 = 1
            goto L_0x0112
        L_0x0110:
            r19 = r12
        L_0x0112:
            if (r13 == 0) goto L_0x0115
            r14 = r2
        L_0x0115:
            if (r15 == 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r2 = r26
        L_0x011a:
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0129
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.ListItem (ListItem.kt:72)"
            r11 = -450923337(0xffffffffe51f74b7, float:-4.706308E22)
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r4, r9, r10)
        L_0x0129:
            androidx.compose.material.t0 r9 = androidx.compose.material.C7933t0.f19075a
            r10 = 6
            androidx.compose.material.w1 r9 = r9.mo11077c(r1, r10)
            androidx.compose.ui.text.p0 r11 = r9.mo11101n()
            androidx.compose.material.r r12 = androidx.compose.material.C7904r.f18969a
            float r13 = r12.mo10992c(r1, r10)
            kotlin.jvm.functions.p r13 = m13557f(r11, r13, r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            androidx.compose.ui.text.p0 r11 = r9.mo11089d()
            float r15 = r12.mo10993d(r1, r10)
            kotlin.jvm.functions.p r15 = m13557f(r11, r15, r3)
            androidx.compose.ui.text.p0 r11 = r9.mo11100m()
            float r5 = r12.mo10992c(r1, r10)
            kotlin.jvm.functions.p r5 = m13557f(r11, r5, r14)
            androidx.compose.ui.text.p0 r9 = r9.mo11092f()
            float r10 = r12.mo10992c(r1, r10)
            kotlin.jvm.functions.p r16 = m13557f(r9, r10, r2)
            androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1 r9 = androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1.f7692f
            r10 = 1
            androidx.compose.ui.m r10 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71867b(r0, r10, r9)
            if (r15 != 0) goto L_0x018d
            if (r5 != 0) goto L_0x018d
            r5 = -210280579(0xfffffffff3775f7d, float:-1.9598908E31)
            r1.mo14918M(r5)
            androidx.compose.material.OneLine r9 = androidx.compose.material.OneLine.f7737a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r15 = r4 | 24576(0x6000, float:3.4438E-41)
            r4 = 0
            r11 = r6
            r12 = r13
            r13 = r16
            r20 = r14
            r14 = r1
            r16 = r4
            r9.mo10312a(r10, r11, r12, r13, r14, r15, r16)
            r1.mo15002m0()
            goto L_0x01ce
        L_0x018d:
            r20 = r14
            if (r5 != 0) goto L_0x0193
            if (r19 != 0) goto L_0x0195
        L_0x0193:
            if (r15 != 0) goto L_0x01b2
        L_0x0195:
            r9 = -210280382(0xfffffffff3776042, float:-1.9599146E31)
            r1.mo14918M(r9)
            androidx.compose.material.TwoLine r9 = androidx.compose.material.TwoLine.f8018a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r17 = r4 | r18
            r18 = 0
            r11 = r6
            r12 = r13
            r13 = r15
            r14 = r5
            r15 = r16
            r16 = r1
            r9.mo10696a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.mo15002m0()
            goto L_0x01ce
        L_0x01b2:
            r9 = -210280168(0xfffffffff3776118, float:-1.9599405E31)
            r1.mo14918M(r9)
            androidx.compose.material.ThreeLine r9 = androidx.compose.material.ThreeLine.f8006a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r17 = r4 | r18
            r18 = 0
            r11 = r6
            r12 = r13
            r13 = r15
            r14 = r5
            r15 = r16
            r16 = r1
            r9.mo10693a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.mo15002m0()
        L_0x01ce:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x01d7
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d7:
            r9 = r2
            r4 = r19
            r5 = r20
            r2 = r0
        L_0x01dd:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x01e4
            goto L_0x01f6
        L_0x01e4:
            androidx.compose.material.ListItemKt$ListItem$1 r11 = new androidx.compose.material.ListItemKt$ListItem$1
            r0 = r11
            r1 = r2
            r2 = r6
            r6 = r9
            r7 = r27
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.mo15202a(r11)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.m13553b(androidx.compose.ui.m, kotlin.jvm.functions.p, kotlin.jvm.functions.p, boolean, kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    public static final void m13554c(float f, C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(-1062692685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14968d(f)) {
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
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !o.mo15011p()) {
            if (i7 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1062692685, i3, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:389)");
            }
            ListItemKt$OffsetToBaselineOrCenter$1 listItemKt$OffsetToBaselineOrCenter$1 = new ListItemKt$OffsetToBaselineOrCenter$1(f);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(mVar);
            int i8 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 9) & 7168) | 6;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, listItemKt$OffsetToBaselineOrCenter$1, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i8 >> 3) & 112));
            o.mo14918M(2058660585);
            pVar.invoke(o, Integer.valueOf((i8 >> 9) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ListItemKt$OffsetToBaselineOrCenter$2(f, mVar2, pVar, i, i2));
        }
    }

    /* renamed from: f */
    public static final C11304p<C8592o, Integer, C11079d2> m13557f(C16361p0 p0Var, float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        if (pVar == null) {
            return null;
        }
        return C8553b.m31049c(-830176860, true, new ListItemKt$applyTextStyle$1(f, p0Var, pVar));
    }
}
