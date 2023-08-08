package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.C2250j;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nServiceSetComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSetComponent.kt\ncom/carrefour/fid/android/design/components/compose/ServiceSetComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,179:1\n36#2:180\n460#2,13:205\n460#2,13:238\n473#2,3:252\n25#2:258\n473#2,3:266\n460#2,13:289\n473#2,3:304\n1114#3,6:181\n1114#3,6:259\n154#4:187\n154#4:188\n154#4:189\n154#4:257\n154#4:265\n154#4:271\n154#4:272\n154#4:273\n154#4:303\n79#5,2:190\n81#5:218\n85#5:270\n79#5,2:274\n81#5:302\n85#5:308\n75#6:192\n76#6,11:194\n75#6:225\n76#6,11:227\n89#6:255\n89#6:269\n75#6:276\n76#6,11:278\n89#6:307\n76#7:193\n76#7:226\n76#7:277\n74#8,6:219\n80#8:251\n84#8:256\n*S KotlinDebug\n*F\n+ 1 ServiceSetComponent.kt\ncom/carrefour/fid/android/design/components/compose/ServiceSetComponentKt\n*L\n53#1:180\n51#1:205,13\n67#1:238,13\n67#1:252,3\n81#1:258\n51#1:266,3\n96#1:289,13\n96#1:304,3\n53#1:181,6\n81#1:259,6\n56#1:187\n58#1:188\n60#1:189\n79#1:257\n85#1:265\n100#1:271\n102#1:272\n104#1:273\n110#1:303\n51#1:190,2\n51#1:218\n51#1:270\n96#1:274,2\n96#1:302\n96#1:308\n51#1:192\n51#1:194,11\n67#1:225\n67#1:227,11\n67#1:255\n51#1:269\n96#1:276\n96#1:278,11\n96#1:307\n51#1:193\n67#1:226\n96#1:277\n67#1:219,6\n67#1:251\n67#1:256\n*E\n"})
public final class ServiceSetComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0119  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151619a(@org.jetbrains.annotations.C12579k java.lang.String r38, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r39, boolean r40, boolean r41, @org.jetbrains.annotations.C12580l java.lang.String r42, long r43, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r45, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r46, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r47, int r48, int r49) {
        /*
            r0 = r38
            r15 = r48
            r13 = r49
            java.lang.String r1 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = -584124594(0xffffffffdd2ef74e, float:-7.8797697E17)
            r2 = r47
            androidx.compose.runtime.o r14 = r2.mo15009o(r1)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r15 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r15 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r14.mo15006n0(r0)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r15
            goto L_0x002b
        L_0x002a:
            r2 = r15
        L_0x002b:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r5 = r15 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0045
            r5 = r39
            boolean r6 = r14.mo15006n0(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r2 = r2 | r6
            goto L_0x0047
        L_0x0045:
            r5 = r39
        L_0x0047:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0061
            r7 = r40
            boolean r8 = r14.mo14961b(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r8
            goto L_0x0063
        L_0x0061:
            r7 = r40
        L_0x0063:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007d
            r9 = r41
            boolean r10 = r14.mo14961b(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r10
            goto L_0x007f
        L_0x007d:
            r9 = r41
        L_0x007f:
            r10 = r13 & 16
            if (r10 == 0) goto L_0x0086
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x009b
            r11 = r42
            boolean r12 = r14.mo15006n0(r11)
            if (r12 == 0) goto L_0x0097
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r2 = r2 | r12
            goto L_0x009d
        L_0x009b:
            r11 = r42
        L_0x009d:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r15
            if (r12 != 0) goto L_0x00b5
            r12 = r13 & 32
            r4 = r43
            if (r12 != 0) goto L_0x00b1
            boolean r12 = r14.mo14980g(r4)
            if (r12 == 0) goto L_0x00b1
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r2 = r2 | r12
            goto L_0x00b7
        L_0x00b5:
            r4 = r43
        L_0x00b7:
            r12 = r13 & 64
            if (r12 == 0) goto L_0x00c2
            r16 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r16
            r1 = r45
            goto L_0x00d7
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            r1 = r45
            if (r16 != 0) goto L_0x00d7
            boolean r17 = r14.mo14927P(r1)
            if (r17 == 0) goto L_0x00d3
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r2 = r2 | r17
        L_0x00d7:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00e2
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r17
            r1 = r46
            goto L_0x00f7
        L_0x00e2:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r15 & r17
            r1 = r46
            if (r17 != 0) goto L_0x00f7
            boolean r17 = r14.mo14927P(r1)
            if (r17 == 0) goto L_0x00f3
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f3:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r2 = r2 | r17
        L_0x00f7:
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r2 & r17
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r4) goto L_0x0119
            boolean r1 = r14.mo15011p()
            if (r1 != 0) goto L_0x0108
            goto L_0x0119
        L_0x0108:
            r14.mo14958a0()
            r2 = r39
            r8 = r45
            r3 = r7
            r4 = r9
            r5 = r11
            r1 = r14
            r6 = r43
            r9 = r46
            goto L_0x04e0
        L_0x0119:
            r14.mo14930Q()
            r1 = r15 & 1
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = 1
            if (r1 == 0) goto L_0x0143
            boolean r1 = r14.mo14977f0()
            if (r1 == 0) goto L_0x012b
            goto L_0x0143
        L_0x012b:
            r14.mo14958a0()
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0133
            r2 = r2 & r4
        L_0x0133:
            r27 = r39
            r31 = r43
            r0 = r45
            r33 = r46
            r12 = r2
            r28 = r7
            r29 = r9
            r30 = r11
            goto L_0x017e
        L_0x0143:
            if (r3 == 0) goto L_0x0148
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x014a
        L_0x0148:
            r1 = r39
        L_0x014a:
            if (r6 == 0) goto L_0x014d
            r7 = 0
        L_0x014d:
            if (r8 == 0) goto L_0x0150
            r9 = r5
        L_0x0150:
            if (r10 == 0) goto L_0x0154
            r3 = 0
            r11 = r3
        L_0x0154:
            r3 = r13 & 32
            if (r3 == 0) goto L_0x0160
            com.carrefour.fid.android.design.theme.b r3 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r18 = r3.mo114218O()
            r2 = r2 & r4
            goto L_0x0162
        L_0x0160:
            r18 = r43
        L_0x0162:
            if (r12 == 0) goto L_0x0167
            com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$1 r3 = com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$1.f92325f
            goto L_0x0169
        L_0x0167:
            r3 = r45
        L_0x0169:
            if (r0 == 0) goto L_0x0170
            com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$2 r0 = com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$2.f92326f
            r33 = r0
            goto L_0x0172
        L_0x0170:
            r33 = r46
        L_0x0172:
            r27 = r1
            r12 = r2
            r0 = r3
            r28 = r7
            r29 = r9
            r30 = r11
            r31 = r18
        L_0x017e:
            r14.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0190
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.components.compose.ServiceSetComponent (ServiceSetComponent.kt:34)"
            r3 = -584124594(0xffffffffdd2ef74e, float:-7.8797697E17)
            androidx.compose.runtime.ComposerKt.m29845w0(r3, r12, r1, r2)
        L_0x0190:
            if (r28 == 0) goto L_0x0199
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r1 = r1.mo114218O()
            goto L_0x019f
        L_0x0199:
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r1 = r1.mo114204A()
        L_0x019f:
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r7)
            boolean r7 = r14.mo15006n0(r0)
            java.lang.Object r8 = r14.mo14921N()
            if (r7 != 0) goto L_0x01ba
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r8 != r7) goto L_0x01c2
        L_0x01ba:
            com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$3$1 r8 = new com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$3$1
            r8.<init>(r0)
            r14.mo14893C(r8)
        L_0x01c2:
            r14.mo15002m0()
            r7 = r8
            kotlin.jvm.functions.a r7 = (kotlin.jvm.functions.C11289a) r7
            r8 = 7
            r9 = 0
            r39 = r27
            r40 = r3
            r41 = r4
            r42 = r6
            r43 = r7
            r44 = r8
            r45 = r9
            androidx.compose.ui.m r3 = androidx.compose.foundation.ClickableKt.m8878e(r39, r40, r41, r42, r43, r44, r45)
            androidx.compose.material.t0 r4 = androidx.compose.material.C7933t0.f19075a
            int r6 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.f1 r7 = r4.mo11076b(r14, r6)
            androidx.compose.foundation.shape.e r7 = r7.mo10758e()
            androidx.compose.ui.m r3 = androidx.compose.p004ui.draw.C8744d.m32514a(r3, r7)
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.foundation.i r1 = androidx.compose.foundation.C2250j.m9695a(r5, r1)
            androidx.compose.material.f1 r2 = r4.mo11076b(r14, r6)
            androidx.compose.foundation.shape.e r2 = r2.mo10758e()
            androidx.compose.ui.m r1 = androidx.compose.foundation.BorderKt.m8850f(r3, r1, r2)
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10024k(r1, r2)
            androidx.compose.ui.c$a r16 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r2 = r16.mo17070q()
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.f6010a
            r3 = 8
            float r10 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            androidx.compose.foundation.layout.Arrangement$e r3 = r11.mo7638z(r3)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r4)
            r4 = 54
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r2, r14, r4)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r9)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r18.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r7 = r14.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x0264
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0264:
            r14.mo14938T()
            boolean r7 = r14.mo14997l()
            if (r7 == 0) goto L_0x0271
            r14.mo14947W(r6)
            goto L_0x0274
        L_0x0271:
            r14.mo14888A()
        L_0x0274:
            r14.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r7 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r7)
            kotlin.jvm.functions.p r2 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r2)
            kotlin.jvm.functions.p r2 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r2)
            kotlin.jvm.functions.p r2 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r2)
            r14.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r5 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1.invoke(r2, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r17 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r19 = 0
            r20 = 0
            r21 = 0
            androidx.compose.material.b1 r2 = androidx.compose.material.C3030b1.f8083a
            com.carrefour.fid.android.design.theme.b r34 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r3 = r34.mo114218O()
            r6 = 0
            long r22 = r34.mo114204A()
            int r8 = androidx.compose.material.C3030b1.f8084b
            int r24 = r8 << 9
            r25 = 2
            r8 = r5
            r5 = r6
            r15 = r8
            r7 = r22
            r1 = r9
            r9 = r14
            r35 = r10
            r10 = r24
            r23 = r11
            r11 = r25
            androidx.compose.material.a1 r2 = r2.mo10719a(r3, r5, r7, r9, r10, r11)
            int r3 = r12 >> 6
            r3 = r3 & 14
            int r4 = r12 >> 15
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 28
            r39 = r28
            r40 = r0
            r41 = r19
            r42 = r20
            r43 = r21
            r44 = r2
            r45 = r14
            r46 = r3
            r47 = r4
            androidx.compose.material.RadioButtonKt.m13736a(r39, r40, r41, r42, r43, r44, r45, r46, r47)
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 2
            r5 = 0
            r39 = r17
            r40 = r11
            r41 = r2
            r42 = r3
            r43 = r4
            r44 = r5
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.C2411u0.m10660e(r39, r40, r41, r42, r43, r44)
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement$l r3 = r23.mo7631r()
            androidx.compose.ui.c$b r4 = r16.mo17072u()
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r3, r4, r14, r15)
            r14.mo14918M(r1)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r1 = r14.mo15032w(r1)
            androidx.compose.ui.unit.d r1 = (androidx.compose.p004ui.unit.C16479d) r1
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r6 = r18.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r7 = r14.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x035c
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x035c:
            r14.mo14938T()
            boolean r7 = r14.mo14997l()
            if (r7 == 0) goto L_0x0369
            r14.mo14947W(r6)
            goto L_0x036c
        L_0x0369:
            r14.mo14888A()
        L_0x036c:
            r14.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r7 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r7)
            kotlin.jvm.functions.p r3 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r3)
            kotlin.jvm.functions.p r1 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            kotlin.jvm.functions.p r1 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r1)
            r14.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2.invoke(r1, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r36 = r11
            r11 = r16
            r25 = r12
            r12 = r16
            r16 = 0
            r47 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material.w1 r20 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r20 = r20.mo11098k()
            r22 = r25 & 14
            r23 = 0
            r24 = 65534(0xfffe, float:9.1833E-41)
            r37 = r0
            r0 = r38
            r21 = r47
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 2096820259(0x7cfaf023, float:1.0423558E37)
            r1 = r47
            r1.mo14918M(r0)
            if (r30 != 0) goto L_0x03f0
            goto L_0x0428
        L_0x03f0:
            androidx.compose.material.w1 r0 = com.carrefour.fid.android.design.theme.C37477d.m153887N()
            androidx.compose.ui.text.p0 r22 = r0.mo11098k()
            r3 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            int r0 = r25 >> 12
            r0 = r0 & 14
            int r2 = r25 >> 9
            r2 = r2 & 896(0x380, float:1.256E-42)
            r24 = r0 | r2
            r25 = 0
            r26 = 65530(0xfffa, float:9.1827E-41)
            r2 = r30
            r4 = r31
            r23 = r1
            androidx.compose.material.TextKt.m14196c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
        L_0x0428:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r0 = 292127612(0x1169837c, float:1.8420976E-28)
            r1.mo14918M(r0)
            if (r29 == 0) goto L_0x04ba
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_circle_info
            r2 = 0
            androidx.compose.ui.graphics.painter.Painter r0 = androidx.compose.p004ui.res.C16015f.m71849d(r0, r1, r2)
            long r2 = r34.mo114218O()
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r35)
            r5 = r36
            androidx.compose.ui.m r18 = androidx.compose.foundation.layout.PaddingKt.m10024k(r5, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r4)
            java.lang.Object r4 = r1.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r4 != r5) goto L_0x046d
            androidx.compose.foundation.interaction.g r4 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r1.mo14893C(r4)
        L_0x046d:
            r1.mo15002m0()
            r19 = r4
            androidx.compose.foundation.interaction.g r19 = (androidx.compose.foundation.interaction.C2243g) r19
            r4 = 1
            r5 = 0
            r6 = 0
            r8 = 6
            r9 = 6
            r39 = r4
            r40 = r5
            r41 = r6
            r43 = r1
            r44 = r8
            r45 = r9
            androidx.compose.foundation.a0 r20 = androidx.compose.material.ripple.C7922j.m25285e(r39, r40, r41, r43, r44, r45)
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 28
            r26 = 0
            r24 = r33
            androidx.compose.ui.m r4 = androidx.compose.foundation.ClickableKt.m8876c(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = 22
            float r5 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r5)
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10121u(r4, r5)
            r5 = 0
            r6 = 56
            r7 = 0
            r39 = r0
            r40 = r5
            r41 = r4
            r42 = r2
            r44 = r1
            r45 = r6
            r46 = r7
            androidx.compose.material.IconKt.m13539b(r39, r40, r41, r42, r44, r45, r46)
        L_0x04ba:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x04d2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04d2:
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r9 = r33
            r8 = r37
        L_0x04e0:
            androidx.compose.runtime.t1 r12 = r1.mo15020s()
            if (r12 != 0) goto L_0x04e7
            goto L_0x04f6
        L_0x04e7:
            com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$5 r13 = new com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt$ServiceSetComponent$5
            r0 = r13
            r1 = r38
            r10 = r48
            r11 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x04f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.ServiceSetComponentKt.m151619a(java.lang.String, androidx.compose.ui.m, boolean, boolean, java.lang.String, long, kotlin.jvm.functions.a, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151620b(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-132925708);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-132925708, i, -1, "com.carrefour.fid.android.design.components.compose.ServiceSetComponentPreview (ServiceSetComponent.kt:117)");
            }
            ThemeKt.m153788a(ComposableSingletons$ServiceSetComponentKt.f92266a.mo112128b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ServiceSetComponentKt$ServiceSetComponentPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151621c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1837383065);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1837383065, i, -1, "com.carrefour.fid.android.design.components.compose.ServiceSetComponentSelectedPreview (ServiceSetComponent.kt:134)");
            }
            ThemeKt.m153788a(ComposableSingletons$ServiceSetComponentKt.f92266a.mo112130d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ServiceSetComponentKt$ServiceSetComponentSelectedPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151622d(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(401551859);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(401551859, i, -1, "com.carrefour.fid.android.design.components.compose.ServiceSetComponentSelectedWithoutSubTitlePreview (ServiceSetComponent.kt:152)");
            }
            ThemeKt.m153788a(ComposableSingletons$ServiceSetComponentKt.f92266a.mo112132f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C36961x297faf75(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151623e(@C12580l C8767m mVar, @C12579k String str, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar;
        int i4;
        int i5;
        String str2 = str;
        int i6 = i;
        int i7 = i2;
        Intrinsics.checkNotNullParameter(str2, "title");
        C8592o o = oVar.mo15009o(-431403408);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i6 | 6;
            mVar2 = mVar;
        } else if ((i6 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i6;
        } else {
            mVar2 = mVar;
            i3 = i6;
        }
        if ((i7 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 91) != 18 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-431403408, i9, -1, "com.carrefour.fid.android.design.components.compose.ServiceSetUnavailableComponent (ServiceSetComponent.kt:91)");
            }
            C7933t0 t0Var = C7933t0.f19075a;
            int i10 = C7933t0.f19076b;
            C8767m a = C8744d.m32514a(aVar, t0Var.mo11076b(o, i10).mo10758e());
            float M = C16483g.m74435M((float) 1);
            C37475b bVar = C37475b.f94185a;
            float f = (float) 16;
            C8767m k = PaddingKt.m10024k(BorderKt.m8850f(a, C2250j.m9695a(M, bVar.mo114204A()), t0Var.mo11076b(o, i10).mo10758e()), C16483g.m74435M(f));
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            Arrangement.C2271e z = Arrangement.f6010a.mo7638z(C16483g.m74435M((float) 8));
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(z, q, o, 54);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(k);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a2);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            IconKt.m13539b(C16015f.m71849d(C36896b.C36904h.ds_ic_missing_image, o, 0), (String) null, SizeKt.m10121u(C8767m.f23478j, C16483g.m74435M(f)), bVar.mo114258z(), o, 440, 0);
            C8767m mVar3 = aVar;
            oVar2 = o;
            TextKt.m14196c(str, (C8767m) null, bVar.mo114258z(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153887N().mo11098k(), oVar2, (i9 >> 3) & 14, 0, 65530);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = mVar3;
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new ServiceSetComponentKt$ServiceSetUnavailableComponent$2(mVar2, str, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151624f(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1569141390);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1569141390, i, -1, "com.carrefour.fid.android.design.components.compose.ServiceSetUnavailableComponentPreview (ServiceSetComponent.kt:168)");
            }
            ThemeKt.m153788a(ComposableSingletons$ServiceSetComponentKt.f92266a.mo112134h(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ServiceSetComponentKt$ServiceSetUnavailableComponentPreview$1(i));
        }
    }
}
