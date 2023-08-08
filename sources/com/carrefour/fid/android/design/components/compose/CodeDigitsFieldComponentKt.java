package com.carrefour.fid.android.design.components.compose;

import androidx.annotation.C0375v;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2693n;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.foundation.text.C2776k;
import androidx.compose.foundation.text.C2779m;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C3049i;
import androidx.compose.material.C7870j;
import androidx.compose.material.C7930s1;
import androidx.compose.material.C7933t0;
import androidx.compose.material.IconKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.focus.C15056b;
import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.focus.C15083v;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.input.key.C15441f;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16051a0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.input.C16273a0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16288e0;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.compose.C36971c;
import com.carrefour.fid.android.design.components.compose.C36975d;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nCodeDigitsFieldComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeDigitsFieldComponent.kt\ncom/carrefour/fid/android/design/components/compose/CodeDigitsFieldComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,561:1\n25#2:562\n25#2:572\n25#2:581\n25#2:588\n25#2:595\n25#2:602\n83#2,3:611\n460#2,13:639\n460#2,13:673\n460#2,13:706\n50#2:720\n49#2:721\n50#2:728\n49#2:729\n473#2,3:736\n50#2:741\n49#2:742\n36#2:749\n473#2,3:756\n473#2,3:761\n36#2:767\n36#2:776\n460#2,13:805\n473#2,3:821\n1114#3,3:563\n1117#3,3:569\n1114#3,3:573\n1117#3,3:578\n1114#3,6:582\n1114#3,6:589\n1114#3,6:596\n1114#3,6:603\n1114#3,6:614\n1114#3,6:722\n1114#3,6:730\n1114#3,6:743\n1114#3,6:750\n1114#3,6:768\n1114#3,6:777\n1#4:566\n37#5,2:567\n37#5,2:576\n1855#6,2:609\n1747#6,3:783\n74#7,6:620\n80#7:652\n73#7,7:653\n80#7:686\n84#7:760\n84#7:765\n75#8:626\n76#8,11:628\n75#8:660\n76#8,11:662\n75#8:693\n76#8,11:695\n89#8:739\n89#8:759\n89#8:764\n75#8:792\n76#8,11:794\n89#8:824\n76#9:627\n76#9:661\n76#9:694\n76#9:793\n76#9:826\n76#9:829\n75#10,6:687\n81#10:719\n85#10:740\n75#10,6:786\n81#10:818\n85#10:825\n154#11:766\n154#11:774\n154#11:775\n154#11:819\n154#11:820\n154#11:827\n154#11:828\n154#11:830\n154#11:831\n76#12:832\n76#12:833\n102#12,2:834\n76#12:836\n*S KotlinDebug\n*F\n+ 1 CodeDigitsFieldComponent.kt\ncom/carrefour/fid/android/design/components/compose/CodeDigitsFieldComponentKt\n*L\n114#1:562\n115#1:572\n116#1:581\n117#1:588\n122#1:595\n123#1:602\n148#1:611,3\n181#1:639,13\n185#1:673,13\n192#1:706,13\n198#1:720\n198#1:721\n199#1:728\n199#1:729\n192#1:736,3\n229#1:741\n229#1:742\n233#1:749\n185#1:756,3\n181#1:761,3\n272#1:767\n320#1:776\n409#1:805,13\n409#1:821,3\n114#1:563,3\n114#1:569,3\n115#1:573,3\n115#1:578,3\n116#1:582,6\n117#1:589,6\n122#1:596,6\n123#1:603,6\n148#1:614,6\n198#1:722,6\n199#1:730,6\n229#1:743,6\n233#1:750,6\n272#1:768,6\n320#1:777,6\n114#1:567,2\n115#1:576,2\n130#1:609,2\n395#1:783,3\n181#1:620,6\n181#1:652\n185#1:653,7\n185#1:686\n185#1:760\n181#1:765\n181#1:626\n181#1:628,11\n185#1:660\n185#1:662,11\n192#1:693\n192#1:695,11\n192#1:739\n185#1:759\n181#1:764\n409#1:792\n409#1:794,11\n409#1:824\n181#1:627\n185#1:661\n192#1:694\n409#1:793\n451#1:826\n491#1:829\n192#1:687,6\n192#1:719\n192#1:740\n409#1:786,6\n409#1:818\n409#1:825\n270#1:766\n318#1:774\n319#1:775\n417#1:819\n418#1:820\n455#1:827\n465#1:828\n495#1:830\n506#1:831\n117#1:832\n122#1:833\n122#1:834,2\n123#1:836\n*E\n"})
public final class CodeDigitsFieldComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151373a(java.lang.String r27, java.util.List<java.lang.Boolean> r28, com.carrefour.fid.android.design.components.compose.C36971c r29, com.carrefour.fid.android.design.components.compose.C36975d r30, java.util.List<java.lang.String> r31, java.util.List<androidx.compose.p004ui.focus.FocusRequester> r32, char r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.C36965b, kotlin.C11079d2> r39, androidx.compose.runtime.C8592o r40, int r41, int r42) {
        /*
            r10 = r30
            r11 = r31
            r12 = r34
            r13 = r35
            r14 = r37
            r15 = r39
            r9 = r41
            r8 = r42
            r0 = 820729901(0x30eb582d, float:1.7123561E-9)
            r1 = r40
            androidx.compose.runtime.o r7 = r1.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = "com.carrefour.fid.android.design.components.compose.CodeInput (CodeDigitsFieldComponent.kt:165)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r8, r1)
        L_0x0024:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r1 = r0.mo17068m()
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r6, r2, r4, r3)
            r3 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r7.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement r23 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r4 = r23.mo7631r()
            r5 = 48
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.ColumnKt.m9863b(r4, r1, r7, r5)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r7.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r7.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r3 = r7.mo15032w(r3)
            androidx.compose.ui.platform.c4 r3 = (androidx.compose.p004ui.platform.C15863c4) r3
            androidx.compose.ui.node.ComposeUiNode$Companion r24 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r24.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r12 = r7.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x007e
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x007e:
            r7.mo14938T()
            boolean r12 = r7.mo14997l()
            if (r12 == 0) goto L_0x008b
            r7.mo14947W(r8)
            goto L_0x008e
        L_0x008b:
            r7.mo14888A()
        L_0x008e:
            r7.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r7)
            kotlin.jvm.functions.p r12 = r24.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r1, r12)
            kotlin.jvm.functions.p r1 = r24.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r1)
            kotlin.jvm.functions.p r1 = r24.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r1)
            kotlin.jvm.functions.p r1 = r24.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r1)
            r7.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r7)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r12 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2.invoke(r1, r7, r3)
            r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r7.mo14918M(r8)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.c$b r1 = r0.mo17072u()
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r7.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement$l r2 = r23.mo7631r()
            r3 = 48
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r1, r7, r3)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo14918M(r4)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r7.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r7.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r7.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r4 = r24.mo44585a()
            kotlin.jvm.functions.q r8 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r12 = r7.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0117
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0117:
            r7.mo14938T()
            boolean r12 = r7.mo14997l()
            if (r12 == 0) goto L_0x0124
            r7.mo14947W(r4)
            goto L_0x0127
        L_0x0124:
            r7.mo14888A()
        L_0x0127:
            r7.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r7)
            kotlin.jvm.functions.p r12 = r24.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r1, r12)
            kotlin.jvm.functions.p r1 = r24.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r2, r1)
            kotlin.jvm.functions.p r1 = r24.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r3, r1)
            kotlin.jvm.functions.p r1 = r24.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r5, r1)
            r7.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r7)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r8.invoke(r1, r7, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r7.mo14918M(r1)
            com.carrefour.fid.android.design.theme.b r1 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r1 = r1.mo114257y()
            long r4 = m151396x(r10, r1)
            r1 = r9 & 14
            r1 = r1 | 64
            r2 = r9 & 896(0x380, float:1.256E-42)
            r8 = r1 | r2
            r1 = r27
            r2 = r28
            r3 = r29
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r16 = r6
            r6 = r7
            r12 = r7
            r7 = r8
            m151379g(r1, r2, r3, r4, r6, r7)
            r17 = 0
            com.carrefour.fid.android.design.theme.a r1 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r18 = r1.mo114175A()
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r12.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement$d r2 = r23.mo7630p()
            androidx.compose.ui.c$c r0 = r0.mo17073w()
            r3 = 0
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r2, r0, r12, r3)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r12.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r12.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            kotlin.jvm.functions.a r5 = r24.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r6 = r12.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x01e4
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01e4:
            r12.mo14938T()
            boolean r6 = r12.mo14997l()
            if (r6 == 0) goto L_0x01f1
            r12.mo14947W(r5)
            goto L_0x01f4
        L_0x01f1:
            r12.mo14888A()
        L_0x01f4:
            r12.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r6 = r24.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r0, r6)
            kotlin.jvm.functions.p r0 = r24.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r0)
            kotlin.jvm.functions.p r0 = r24.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r0)
            kotlin.jvm.functions.p r0 = r24.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r0)
            r12.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.invoke(r0, r12, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r0 = 900956468(0x35b38134, float:1.3374142E-6)
            r12.mo14918M(r0)
            int r8 = r31.size()
            r7 = 0
        L_0x023d:
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            if (r7 >= r8) goto L_0x02df
            java.lang.Object r1 = r11.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r12.mo14918M(r0)
            boolean r3 = r12.mo15006n0(r15)
            boolean r2 = r12.mo15006n0(r2)
            r2 = r2 | r3
            java.lang.Object r3 = r12.mo14921N()
            if (r2 != 0) goto L_0x0266
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x026e
        L_0x0266:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$1$1$1 r3 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$1$1$1
            r3.<init>(r15, r7)
            r12.mo14893C(r3)
        L_0x026e:
            r12.mo15002m0()
            r2 = r3
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r15)
            boolean r3 = r12.mo15006n0(r3)
            r0 = r0 | r3
            java.lang.Object r3 = r12.mo14921N()
            if (r0 != 0) goto L_0x0292
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x029a
        L_0x0292:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$1$2$1 r3 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$1$2$1
            r3.<init>(r15, r7)
            r12.mo14893C(r3)
        L_0x029a:
            r12.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            com.carrefour.fid.android.design.components.compose.h r4 = new com.carrefour.fid.android.design.components.compose.h
            r6 = r32
            r4.<init>(r6, r7)
            int r0 = r9 >> 6
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r0
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r16 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r16
            r0 = r0 | r5
            int r5 = r9 << 12
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r5 & r16
            r0 = r0 | r16
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r16
            r16 = r0 | r5
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r33
            r5 = r34
            r6 = r29
            r17 = r7
            r7 = r30
            r18 = r8
            r8 = r12
            r9 = r16
            m151381i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r7 = r17 + 1
            r9 = r41
            r8 = r18
            goto L_0x023d
        L_0x02df:
            r12.mo15002m0()
            r1 = 1224150620(0x48f70e5c, float:505970.88)
            r12.mo14918M(r1)
            if (r36 == 0) goto L_0x02fd
            if (r38 != 0) goto L_0x02fd
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$1$3 r1 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$1$3
            r1.<init>(r15, r11)
            int r2 = r41 >> 24
            r2 = r2 & 14
            int r3 = r42 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            m151385m(r13, r14, r1, r12, r2)
        L_0x02fd:
            r12.mo15002m0()
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            r8 = r34
            if (r8 != 0) goto L_0x031a
            r1 = 1224151253(0x48f710d5, float:505990.66)
            r12.mo14918M(r1)
            int r1 = com.carrefour.fid.android.design.components.C36896b.C36912p.loyalty_display_code
            r2 = 0
            goto L_0x0323
        L_0x031a:
            r2 = 0
            r1 = 1224151309(0x48f7110d, float:505992.4)
            r12.mo14918M(r1)
            int r1 = com.carrefour.fid.android.design.components.C36896b.C36912p.loyalty_hide_code
        L_0x0323:
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r12, r2)
            r12.mo15002m0()
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            int r3 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r2 = r2.mo11077c(r12, r3)
            androidx.compose.ui.text.p0 r3 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r2)
            if (r8 != 0) goto L_0x033b
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_eye_on
            goto L_0x033d
        L_0x033b:
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_eye_off
        L_0x033d:
            com.carrefour.fid.android.design.theme.a r4 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r5 = r4.mo114176B()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r34)
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r15)
            boolean r4 = r12.mo15006n0(r4)
            r0 = r0 | r4
            java.lang.Object r4 = r12.mo14921N()
            if (r0 != 0) goto L_0x0361
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r4 != r0) goto L_0x0369
        L_0x0361:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$2$1 r4 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$2$1
            r4.<init>(r15, r8)
            r12.mo14893C(r4)
        L_0x0369:
            r12.mo15002m0()
            kotlin.jvm.functions.a r4 = (kotlin.jvm.functions.C11289a) r4
            r7 = 0
            r6 = r12
            m151384l(r1, r2, r3, r4, r5, r6, r7)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r15)
            java.lang.Object r1 = r12.mo14921N()
            if (r0 != 0) goto L_0x038b
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0393
        L_0x038b:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$3$1 r1 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$3$1
            r1.<init>(r15)
            r12.mo14893C(r1)
        L_0x0393:
            r12.mo15002m0()
            kotlin.jvm.functions.a r1 = (kotlin.jvm.functions.C11289a) r1
            int r0 = r41 >> 9
            r0 = r0 & 14
            m151380h(r10, r1, r12, r0)
            r0 = -1704463272(0xffffffff9a67f458, float:-4.796706E-23)
            r12.mo14918M(r0)
            if (r36 == 0) goto L_0x03ba
            if (r38 == 0) goto L_0x03ba
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$4 r0 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$1$1$4
            r0.<init>(r15, r11)
            int r1 = r41 >> 24
            r1 = r1 & 14
            int r2 = r42 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            m151386n(r13, r14, r0, r12, r1)
        L_0x03ba:
            r12.mo15002m0()
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03de
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03de:
            androidx.compose.runtime.t1 r12 = r12.mo15020s()
            if (r12 != 0) goto L_0x03e5
            goto L_0x0418
        L_0x03e5:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$2 r9 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInput$2
            r0 = r9
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r11 = r9
            r9 = r35
            r10 = r36
            r13 = r11
            r11 = r37
            r14 = r12
            r12 = r38
            r25 = r13
            r13 = r39
            r15 = r14
            r14 = r41
            r26 = r15
            r15 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r25
            r0 = r26
            r0.mo15202a(r1)
        L_0x0418:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt.m151373a(java.lang.String, java.util.List, com.carrefour.fid.android.design.components.compose.c, com.carrefour.fid.android.design.components.compose.d, java.util.List, java.util.List, char, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0140  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151374b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.compose.C36971c r27, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.compose.C36975d r28, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r29, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r30, int r31, @org.jetbrains.annotations.C12579k java.lang.String r32, boolean r33, boolean r34, boolean r35, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r36, int r37, int r38) {
        /*
            r15 = r27
            r14 = r28
            r13 = r29
            r12 = r30
            r11 = r32
            r10 = r37
            r9 = r38
            java.lang.String r0 = "codeInputState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "codeMessageStatus"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onValidateButtonClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onHelperLinkClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "fieldLabel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -1654837479(0xffffffff9d5d2f19, float:-2.9273455E-21)
            r1 = r36
            androidx.compose.runtime.o r8 = r1.mo15009o(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0037
            r1 = r10 | 6
            goto L_0x0047
        L_0x0037:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0046
            boolean r1 = r8.mo15006n0(r15)
            if (r1 == 0) goto L_0x0043
            r1 = 4
            goto L_0x0044
        L_0x0043:
            r1 = 2
        L_0x0044:
            r1 = r1 | r10
            goto L_0x0047
        L_0x0046:
            r1 = r10
        L_0x0047:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 48
            goto L_0x005e
        L_0x004e:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x005e
            boolean r4 = r8.mo15006n0(r14)
            if (r4 == 0) goto L_0x005b
            r4 = 32
            goto L_0x005d
        L_0x005b:
            r4 = 16
        L_0x005d:
            r1 = r1 | r4
        L_0x005e:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0065
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0075
        L_0x0065:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0075
            boolean r4 = r8.mo14927P(r13)
            if (r4 == 0) goto L_0x0072
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0074
        L_0x0072:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0074:
            r1 = r1 | r4
        L_0x0075:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x007c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008c
        L_0x007c:
            r4 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x008c
            boolean r4 = r8.mo14927P(r12)
            if (r4 == 0) goto L_0x0089
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x008b
        L_0x0089:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x008b:
            r1 = r1 | r4
        L_0x008c:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0093
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0093:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r10
            if (r5 != 0) goto L_0x00a8
            r5 = r31
            boolean r6 = r8.mo14976f(r5)
            if (r6 == 0) goto L_0x00a4
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r6
            goto L_0x00aa
        L_0x00a8:
            r5 = r31
        L_0x00aa:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x00b2
            r6 = 196608(0x30000, float:2.75506E-40)
        L_0x00b0:
            r1 = r1 | r6
            goto L_0x00c3
        L_0x00b2:
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r10
            if (r6 != 0) goto L_0x00c3
            boolean r6 = r8.mo15006n0(r11)
            if (r6 == 0) goto L_0x00c0
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00c0:
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00b0
        L_0x00c3:
            r6 = r9 & 64
            if (r6 == 0) goto L_0x00cb
            r7 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r7
            goto L_0x00e0
        L_0x00cb:
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r10
            if (r7 != 0) goto L_0x00e0
            r7 = r33
            boolean r16 = r8.mo14961b(r7)
            if (r16 == 0) goto L_0x00db
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r16
            goto L_0x00e2
        L_0x00e0:
            r7 = r33
        L_0x00e2:
            r2 = r9 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00ed
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r3 = r34
            goto L_0x0102
        L_0x00ed:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            r3 = r34
            if (r16 != 0) goto L_0x0102
            boolean r17 = r8.mo14961b(r3)
            if (r17 == 0) goto L_0x00fe
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r1 = r1 | r17
        L_0x0102:
            r0 = r9 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x010d
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r18
            r3 = r35
            goto L_0x0122
        L_0x010d:
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r10 & r18
            r3 = r35
            if (r18 != 0) goto L_0x0122
            boolean r18 = r8.mo14961b(r3)
            if (r18 == 0) goto L_0x011e
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0120
        L_0x011e:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0120:
            r1 = r1 | r18
        L_0x0122:
            r18 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r1 & r18
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x0140
            boolean r3 = r8.mo15011p()
            if (r3 != 0) goto L_0x0133
            goto L_0x0140
        L_0x0133:
            r8.mo14958a0()
            r5 = r31
            r9 = r35
            r17 = r8
            r8 = r34
            goto L_0x035c
        L_0x0140:
            if (r4 == 0) goto L_0x0144
            r5 = 4
            goto L_0x0146
        L_0x0144:
            r5 = r31
        L_0x0146:
            if (r6 == 0) goto L_0x014b
            r18 = 1
            goto L_0x014d
        L_0x014b:
            r18 = r7
        L_0x014d:
            r4 = 0
            if (r2 == 0) goto L_0x0153
            r19 = r4
            goto L_0x0155
        L_0x0153:
            r19 = r34
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            r20 = r4
            goto L_0x015c
        L_0x015a:
            r20 = r35
        L_0x015c:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x016b
            r0 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.components.compose.CodeInputComponent (CodeDigitsFieldComponent.kt:102)"
            r6 = -1654837479(0xffffffff9d5d2f19, float:-2.9273455E-21)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r1, r0, r2)
        L_0x016b:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r0)
            java.lang.Object r2 = r8.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r2 != r6) goto L_0x01a1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r6 = r4
        L_0x0183:
            if (r6 >= r5) goto L_0x018d
            java.lang.String r7 = ""
            r2.add(r7)
            int r6 = r6 + 1
            goto L_0x0183
        L_0x018d:
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r6 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = androidx.compose.runtime.C8415c2.m30238g(r2)
            r8.mo14893C(r2)
        L_0x01a1:
            r8.mo15002m0()
            r6 = r2
            androidx.compose.runtime.snapshots.SnapshotStateList r6 = (androidx.compose.runtime.snapshots.SnapshotStateList) r6
            r8.mo14918M(r0)
            java.lang.Object r2 = r8.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r7.mo16277a()
            if (r2 != r7) goto L_0x01da
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r7 = r4
        L_0x01bc:
            if (r7 >= r5) goto L_0x01c6
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.add(r3)
            int r7 = r7 + 1
            goto L_0x01bc
        L_0x01c6:
            java.lang.Boolean[] r3 = new java.lang.Boolean[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.Boolean[] r2 = (java.lang.Boolean[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = androidx.compose.runtime.C8415c2.m30238g(r2)
            r8.mo14893C(r2)
        L_0x01da:
            r8.mo15002m0()
            r7 = r2
            androidx.compose.runtime.snapshots.SnapshotStateList r7 = (androidx.compose.runtime.snapshots.SnapshotStateList) r7
            r8.mo14918M(r0)
            java.lang.Object r2 = r8.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r2 != r3) goto L_0x0206
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r3 = r4
        L_0x01f5:
            if (r3 >= r5) goto L_0x0203
            androidx.compose.ui.focus.FocusRequester r4 = new androidx.compose.ui.focus.FocusRequester
            r4.<init>()
            r2.add(r4)
            int r3 = r3 + 1
            r4 = 0
            goto L_0x01f5
        L_0x0203:
            r8.mo14893C(r2)
        L_0x0206:
            r8.mo15002m0()
            r17 = r2
            java.util.List r17 = (java.util.List) r17
            r8.mo14918M(r0)
            java.lang.Object r2 = r8.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            if (r2 != r4) goto L_0x0228
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$isValidateBtnEnabled$2$1 r2 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$isValidateBtnEnabled$2$1
            r2.<init>(r6)
            androidx.compose.runtime.k2 r2 = androidx.compose.runtime.C8415c2.m30235d(r2)
            r8.mo14893C(r2)
        L_0x0228:
            r8.mo15002m0()
            androidx.compose.runtime.k2 r2 = (androidx.compose.runtime.C8578k2) r2
            r8.mo14918M(r0)
            java.lang.Object r4 = r8.mo14921N()
            java.lang.Object r0 = r3.mo16277a()
            if (r4 != r0) goto L_0x0248
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4 = 0
            r21 = r1
            r1 = 2
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r0, r4, r1, r4)
            r8.mo14893C(r4)
            goto L_0x024a
        L_0x0248:
            r21 = r1
        L_0x024a:
            r8.mo15002m0()
            r22 = r4
            androidx.compose.runtime.z0 r22 = (androidx.compose.runtime.C8700z0) r22
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r0)
            java.lang.Object r0 = r8.mo14921N()
            java.lang.Object r1 = r3.mo16277a()
            if (r0 != r1) goto L_0x026d
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$blackDotState$2$1 r0 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$blackDotState$2$1
            r0.<init>(r6)
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30235d(r0)
            r8.mo14893C(r0)
        L_0x026d:
            r8.mo15002m0()
            androidx.compose.runtime.k2 r0 = (androidx.compose.runtime.C8578k2) r0
            boolean r1 = r15 instanceof com.carrefour.fid.android.design.components.compose.C36971c.C36974c
            if (r1 == 0) goto L_0x02a6
            r1 = r15
            com.carrefour.fid.android.design.components.compose.c$c r1 = (com.carrefour.fid.android.design.components.compose.C36971c.C36974c) r1
            java.lang.String r3 = r1.mo112350d()
            kotlin.ranges.l r3 = kotlin.text.StringsKt__StringsKt.getIndices(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0285:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02a6
            r4 = r3
            kotlin.collections.k0 r4 = (kotlin.collections.C10953k0) r4
            int r4 = r4.mo6374c()
            r34 = r3
            java.lang.String r3 = r1.mo112350d()
            char r3 = r3.charAt(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.set(r4, r3)
            r3 = r34
            goto L_0x0285
        L_0x02a6:
            char r23 = m151376d(r0)
            boolean r24 = m151378f(r22)
            boolean r25 = m151377e(r2)
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r12
            r3 = 1
            r1[r3] = r13
            r3 = 2
            r1[r3] = r22
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r8.mo14918M(r3)
            r4 = r2
        L_0x02cb:
            if (r4 >= r0) goto L_0x02d7
            r3 = r1[r4]
            boolean r3 = r8.mo15006n0(r3)
            r2 = r2 | r3
            int r4 = r4 + 1
            goto L_0x02cb
        L_0x02d7:
            java.lang.Object r0 = r8.mo14921N()
            if (r2 != 0) goto L_0x02eb
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x02e6
            goto L_0x02eb
        L_0x02e6:
            r16 = r21
            r21 = r5
            goto L_0x0302
        L_0x02eb:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$2$1 r4 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$2$1
            r0 = r4
            r16 = r21
            r1 = r30
            r2 = r29
            r3 = r6
            r9 = r4
            r4 = r7
            r21 = r5
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r8.mo14893C(r9)
            r0 = r9
        L_0x0302:
            r8.mo15002m0()
            r22 = r0
            kotlin.jvm.functions.l r22 = (kotlin.jvm.functions.C11300l) r22
            int r0 = r16 >> 15
            r0 = r0 & 14
            r1 = 286768(0x46030, float:4.01848E-40)
            r0 = r0 | r1
            int r1 = r16 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r16 << 9
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r26 = r0 | r1
            int r0 = r16 >> 21
            r1 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r16 = r1 | r0
            r0 = r32
            r1 = r7
            r2 = r27
            r3 = r28
            r4 = r6
            r5 = r17
            r6 = r23
            r7 = r24
            r17 = r8
            r8 = r25
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r22
            r13 = r17
            r14 = r26
            r15 = r16
            m151373a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0354
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0354:
            r7 = r18
            r8 = r19
            r9 = r20
            r5 = r21
        L_0x035c:
            androidx.compose.runtime.t1 r12 = r17.mo15020s()
            if (r12 != 0) goto L_0x0363
            goto L_0x037a
        L_0x0363:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$3 r13 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputComponent$3
            r0 = r13
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r6 = r32
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo15202a(r13)
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt.m151374b(com.carrefour.fid.android.design.components.compose.c, com.carrefour.fid.android.design.components.compose.d, kotlin.jvm.functions.l, kotlin.jvm.functions.a, int, java.lang.String, boolean, boolean, boolean, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public static final void m151375c(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public static final char m151376d(C8578k2<Character> k2Var) {
        return k2Var.getValue().charValue();
    }

    /* renamed from: e */
    public static final boolean m151377e(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: f */
    public static final boolean m151378f(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151379g(java.lang.String r32, java.util.List<java.lang.Boolean> r33, com.carrefour.fid.android.design.components.compose.C36971c r34, long r35, androidx.compose.runtime.C8592o r37, int r38) {
        /*
            r3 = r34
            r6 = r38
            r0 = -1638577581(0xffffffff9e554a53, float:-1.1291496E-20)
            r1 = r37
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0019
            r2 = -1
            java.lang.String r4 = "com.carrefour.fid.android.design.components.compose.CodeInputLabel (CodeDigitsFieldComponent.kt:381)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r2, r4)
        L_0x0019:
            androidx.compose.ui.m$a r7 = androidx.compose.p004ui.C8767m.f23478j
            com.carrefour.fid.android.design.theme.a r0 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r8 = r0.mo114176B()
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 14
            r13 = 0
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.PaddingKt.m10028o(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r2 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r1, r2)
            androidx.compose.ui.text.p0 r27 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r0)
            com.carrefour.fid.android.design.components.compose.c$b r0 = com.carrefour.fid.android.design.components.compose.C36971c.C36973b.f92360a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0047
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r0.mo114258z()
        L_0x0045:
            r9 = r4
            goto L_0x008b
        L_0x0047:
            boolean r0 = r3 instanceof com.carrefour.fid.android.design.components.compose.C36971c.C36974c
            r2 = 1
            if (r0 == 0) goto L_0x004e
            r0 = r2
            goto L_0x0054
        L_0x004e:
            com.carrefour.fid.android.design.components.compose.c$a r0 = com.carrefour.fid.android.design.components.compose.C36971c.C36972a.f92358a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
        L_0x0054:
            if (r0 == 0) goto L_0x00d4
            r0 = r33
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r4 = r0 instanceof java.util.Collection
            r5 = 0
            if (r4 == 0) goto L_0x006a
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x006a
        L_0x0068:
            r2 = r5
            goto L_0x0080
        L_0x006a:
            java.util.Iterator r0 = r0.iterator()
        L_0x006e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r0.next()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x006e
        L_0x0080:
            if (r2 == 0) goto L_0x0089
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r4 = r0.mo114218O()
            goto L_0x0045
        L_0x0089:
            r9 = r35
        L_0x008b:
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = r6 & 14
            r30 = 0
            r31 = 65528(0xfff8, float:9.1824E-41)
            r7 = r32
            r28 = r1
            androidx.compose.material.TextKt.m14196c(r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00b9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b9:
            androidx.compose.runtime.t1 r7 = r1.mo15020s()
            if (r7 != 0) goto L_0x00c0
            goto L_0x00d3
        L_0x00c0:
            com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputLabel$2 r8 = new com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt$CodeInputLabel$2
            r0 = r8
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r6 = r38
            r0.<init>(r1, r2, r3, r4, r6)
            r7.mo15202a(r8)
        L_0x00d3:
            return
        L_0x00d4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.CodeDigitsFieldComponentKt.m151379g(java.lang.String, java.util.List, com.carrefour.fid.android.design.components.compose.c, long, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m151380h(C36975d dVar, C11289a<C11079d2> aVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C8592o o = oVar.mo15009o(-1058788870);
        if ((i & 14) == 0) {
            if (o.mo15006n0(dVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1058788870, i2, -1, "com.carrefour.fid.android.design.components.compose.CodeInputMessage (CodeDigitsFieldComponent.kt:254)");
            }
            if (dVar instanceof C36975d.C36977b) {
                o.mo14918M(1756919893);
                m151382j(((C36975d.C36977b) dVar).mo112362d(), C37475b.f94185a.mo114257y(), o, 0);
                o.mo15002m0();
            } else if (dVar instanceof C36975d.C36976a) {
                o.mo14918M(1756920077);
                String d = ((C36975d.C36976a) dVar).mo112356d();
                int i5 = C36896b.C36904h.ds_ic_circle_info;
                float M = C16483g.m74435M((float) 14);
                C16361p0 C = C37477d.m153876C(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b));
                o.mo14918M(1157296644);
                boolean n0 = o.mo15006n0(aVar);
                Object N = o.mo14921N();
                if (n0 || N == C8592o.f23032a.mo16277a()) {
                    N = new CodeDigitsFieldComponentKt$CodeInputMessage$1$1(aVar);
                    o.mo14893C(N);
                }
                o.mo15002m0();
                m151384l(d, i5, C, (C11289a) N, M, o, C12888a.f31808q);
                o.mo15002m0();
            } else if (dVar instanceof C36975d.C36978c) {
                o.mo14918M(1756920441);
                m151382j(((C36975d.C36978c) dVar).mo112368d(), C37475b.f94185a.mo114245m(), o, 0);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) dVar, (Object) C36975d.C36982g.f92376a)) {
                o.mo14918M(1756920640);
                m151382j(C16018i.m71858d(C36896b.C36912p.loyalty_wrong_secret_code, o, 0), C37475b.f94185a.mo114224U(), o, 0);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) dVar, (Object) C36975d.C36980e.f92372a)) {
                o.mo14918M(1756920862);
                m151382j(C16018i.m71858d(C36896b.C36912p.loyalty_unsecure_secret_code, o, 0), C37475b.f94185a.mo114224U(), o, 0);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) dVar, (Object) C36975d.C36981f.f92374a)) {
                o.mo14918M(1756921085);
                m151382j(C16018i.m71858d(C36896b.C36912p.loyalty_unvalid_secret_code, o, 0), C37475b.f94185a.mo114224U(), o, 0);
                o.mo15002m0();
            } else if (Intrinsics.areEqual((Object) dVar, (Object) C36975d.C36979d.f92370a)) {
                o.mo14918M(1756921305);
                o.mo15002m0();
            } else {
                o.mo14918M(1756921313);
                o.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CodeDigitsFieldComponentKt$CodeInputMessage$2(dVar, aVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m151381i(String str, C11300l<? super String, C11079d2> lVar, C11300l<? super Boolean, C11079d2> lVar2, C36988h hVar, char c, boolean z, C36971c cVar, C36975d dVar, C8592o oVar, int i) {
        C16275a1 a1Var;
        C7930s1 l;
        C11300l<? super Boolean, C11079d2> lVar3 = lVar2;
        C36988h hVar2 = hVar;
        C36971c cVar2 = cVar;
        C36975d dVar2 = dVar;
        int i2 = i;
        C8592o o = oVar.mo15009o(-1856530656);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1856530656, i2, -1, "com.carrefour.fid.android.design.components.compose.CodeInputTextField (CodeDigitsFieldComponent.kt:304)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C37474a aVar2 = C37474a.f94133a;
        float f = (float) 56;
        C8767m o2 = SizeKt.m10115o(SizeKt.m10092H(PaddingKt.m10026m(aVar, aVar2.mo114176B(), 0.0f, 2, (Object) null), C16483g.m74435M(f)), C16483g.m74435M(f));
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(lVar3);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new CodeDigitsFieldComponentKt$CodeInputTextField$1$1(lVar3);
            o.mo14893C(N);
        }
        o.mo15002m0();
        C8767m a = C15441f.m68286a(C15083v.m64810a(C15056b.m64690a(o2, (C11300l) N), hVar.mo112411e().get(hVar.mo112413f())), new CodeDigitsFieldComponentKt$CodeInputTextField$3(hVar2));
        boolean z2 = !(cVar2 instanceof C36971c.C36973b);
        C2779m mVar = new C2779m(0, false, C16273a0.f40446b.mo47156i(), C16310p.f40516b.mo47282g(), 3, (DefaultConstructorMarker) null);
        if (z) {
            a1Var = C16275a1.f40457a.mo47161a();
            char c2 = c;
        } else {
            a1Var = new C16288e0(c);
        }
        C16275a1 a1Var2 = a1Var;
        C2693n h = C2694o.m12166h(aVar2.mo114176B());
        C16361p0 c3 = C16361p0.m73795c(C37477d.m153889a(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), 0, 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), (C16436k) null, 0, (C16442o) null, (C16051a0) null, (C16426h) null, (C16417f) null, (C16415e) null, 4177919, (Object) null);
        if (Intrinsics.areEqual((Object) cVar2, (Object) C36971c.C36972a.f92358a)) {
            o.mo14918M(-667575399);
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f7961a;
            C37475b bVar = C37475b.f94185a;
            l = textFieldDefaults.mo10637l(0, 0, bVar.mo114231a0(), 0, 0, bVar.mo114218O(), m151396x(dVar2, bVar.mo114239g()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, o, 0, 0, 48, 2097051);
            o.mo15002m0();
        } else if (Intrinsics.areEqual((Object) cVar2, (Object) C36971c.C36973b.f92360a)) {
            o.mo14918M(-667575040);
            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f7961a;
            C37475b bVar2 = C37475b.f94185a;
            l = textFieldDefaults2.mo10637l(0, 0, bVar2.mo114231a0(), 0, 0, 0, bVar2.mo114206C(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, o, 0, 0, 48, 2097083);
            o.mo15002m0();
        } else if (cVar2 instanceof C36971c.C36974c) {
            o.mo14918M(-667574793);
            TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f7961a;
            C37475b bVar3 = C37475b.f94185a;
            l = textFieldDefaults3.mo10637l(0, 0, bVar3.mo114234c(), 0, 0, bVar3.mo114218O(), m151396x(dVar2, bVar3.mo114239g()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, o, 0, 0, 48, 2097051);
            o.mo15002m0();
        } else {
            o.mo14918M(-667589871);
            o.mo15002m0();
            throw new NoWhenBranchMatchedException();
        }
        C7930s1 s1Var = l;
        CodeDigitsFieldComponentKt$CodeInputTextField$4 codeDigitsFieldComponentKt$CodeInputTextField$4 = r10;
        CodeDigitsFieldComponentKt$CodeInputTextField$4 codeDigitsFieldComponentKt$CodeInputTextField$42 = new CodeDigitsFieldComponentKt$CodeInputTextField$4(hVar2, lVar);
        OutlinedTextFieldKt.m13660c(str, codeDigitsFieldComponentKt$CodeInputTextField$4, a, z2, false, c3, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, false, a1Var2, mVar, (C2776k) null, true, 1, 0, (C2243g) null, h, s1Var, o, i2 & 14, 221568, 206800);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CodeDigitsFieldComponentKt$CodeInputTextField$5(str, lVar, lVar2, hVar, c, z, cVar, dVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m151382j(String str, long j, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        String str2 = str;
        long j2 = j;
        int i5 = i;
        C8592o o = oVar.mo15009o(1201465591);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14980g(j2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1201465591, i6, -1, "com.carrefour.fid.android.design.components.compose.InformationText (CodeDigitsFieldComponent.kt:432)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C37474a aVar2 = C37474a.f94133a;
            int i7 = i6;
            oVar2 = o;
            String str3 = str2;
            int i8 = i5;
            TextKt.m14196c(str, PaddingKt.m10028o(aVar, aVar2.mo114176B(), aVar2.mo114176B(), 0.0f, 0.0f, 12, (Object) null), j, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153906r(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), oVar2, (i7 & 14) | ((i7 << 3) & 896), 0, 65528);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CodeDigitsFieldComponentKt$InformationText$1(str, j, i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m151383k(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(664189911);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(664189911, i, -1, "com.carrefour.fid.android.design.components.compose.PreviewCodeInput (CodeDigitsFieldComponent.kt:538)");
            }
            List L = CollectionsKt__CollectionsKt.m40448L("", "", "", "");
            Boolean bool = Boolean.FALSE;
            List L2 = CollectionsKt__CollectionsKt.m40448L(bool, bool, bool, bool);
            ArrayList arrayList = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList.add(new FocusRequester());
            }
            ThemeKt.m153788a(C8553b.m31048b(o, 541149146, true, new CodeDigitsFieldComponentKt$PreviewCodeInput$1(L2, L, arrayList)), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CodeDigitsFieldComponentKt$PreviewCodeInput$2(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m151384l(String str, @C0375v int i, C16361p0 p0Var, C11289a<C11079d2> aVar, float f, C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        C8592o o = oVar.mo15009o(899239201);
        if ((i10 & 14) == 0) {
            if (o.mo15006n0(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i10;
        } else {
            String str2 = str;
            i3 = i10;
        }
        if ((i10 & 112) == 0) {
            if (o.mo14976f(i9)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i10 & 896) == 0) {
            if (o.mo15006n0(p0Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        } else {
            C16361p0 p0Var2 = p0Var;
        }
        C11289a<C11079d2> aVar2 = aVar;
        if ((i10 & 7168) == 0) {
            if (o.mo14927P(aVar2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((57344 & i10) == 0) {
            if (o.mo14968d(f)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        } else {
            float f2 = f;
        }
        if ((46811 & i3) != 9362 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(899239201, i3, -1, "com.carrefour.fid.android.design.components.compose.TextWithAction (CodeDigitsFieldComponent.kt:401)");
            }
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C8767m e = ClickableKt.m8878e(PaddingKt.m10028o(aVar3, 0.0f, f, 0.0f, 0.0f, 13, (Object) null), false, (String) null, (C16031g) null, aVar, 7, (Object) null);
            o.mo14918M(693286680);
            Arrangement.C2269d p = Arrangement.f6010a.mo7630p();
            C8734c.C8735a aVar4 = C8734c.f23406a;
            C15560f0 d = RowKt.m10071d(p, aVar4.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(e);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
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
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            C8767m f4 = RowScopeInstance.f6147a.mo7845f(SizeKt.m10092H(SizeKt.m10115o(PaddingKt.m10028o(aVar3, 0.0f, 0.0f, C37474a.f94133a.mo114175A(), 0.0f, 11, (Object) null), C16483g.m74435M((float) 15)), C16483g.m74435M((float) 20)), aVar4.mo17070q());
            Painter d2 = C16015f.m71849d(i9, o, (i3 >> 3) & 14);
            C37475b bVar = C37475b.f94185a;
            IconKt.m13539b(d2, "", f4, bVar.mo114218O(), o, 56, 0);
            TextKt.m14196c(str, (C8767m) null, bVar.mo114218O(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, p0Var, o, i3 & 14, (i3 << 12) & 3670016, 65530);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CodeDigitsFieldComponentKt$TextWithAction$2(str, i, p0Var, aVar, f, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m151385m(boolean z, boolean z2, C11289a<C11079d2> aVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean z4 = z;
        boolean z5 = z2;
        C11289a<C11079d2> aVar2 = aVar;
        int i6 = i;
        C8592o o = oVar.mo15009o(355189904);
        if ((i6 & 14) == 0) {
            if (o.mo14961b(z4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14961b(z5)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(aVar2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(355189904, i6, -1, "com.carrefour.fid.android.design.components.compose.ValidateButton (CodeDigitsFieldComponent.kt:445)");
            }
            C15068j jVar = (C15068j) o.mo15032w(CompositionLocalsKt.m71012j());
            C8767m C = SizeKt.m10087C(PaddingKt.m10028o(C8767m.f23478j, C37474a.f94133a.mo114176B(), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M((float) 56));
            if (!z4 || z5) {
                z3 = false;
            } else {
                z3 = true;
            }
            C3049i iVar = C3049i.f8133a;
            C37475b bVar = C37475b.f94185a;
            C8592o oVar3 = o;
            boolean z6 = z3;
            oVar2 = oVar3;
            ButtonKt.m13343a(new CodeDigitsFieldComponentKt$ValidateButton$1(jVar, aVar2), C, z6, (C2243g) null, (C7870j) null, (C15218g4) null, (C2223i) null, iVar.mo10775a(0, 0, C15240j2.m66080w(bVar.mo114218O(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), bVar.mo114231a0(), o, C3049i.f8145m << 12, 3), PaddingKt.m10014a(C16483g.m74435M((float) 0)), C8553b.m31048b(oVar3, 2063981216, true, new CodeDigitsFieldComponentKt$ValidateButton$2(z5)), oVar3, 905969664, 120);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CodeDigitsFieldComponentKt$ValidateButton$3(z4, z5, aVar2, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    public static final void m151386n(boolean z, boolean z2, C11289a<C11079d2> aVar, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean z4 = z;
        boolean z5 = z2;
        C11289a<C11079d2> aVar2 = aVar;
        int i6 = i;
        C8592o o = oVar.mo15009o(-1997676701);
        if ((i6 & 14) == 0) {
            if (o.mo14961b(z4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14961b(z5)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(aVar2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1997676701, i6, -1, "com.carrefour.fid.android.design.components.compose.ValidateLargeButton (CodeDigitsFieldComponent.kt:485)");
            }
            C15068j jVar = (C15068j) o.mo15032w(CompositionLocalsKt.m71012j());
            C8767m H = SizeKt.m10092H(PaddingKt.m10028o(C8767m.f23478j, C37474a.f94133a.mo114176B(), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M((float) 248));
            C2693n c = C2694o.m12161c(50);
            if (!z4 || z5) {
                z3 = false;
            } else {
                z3 = true;
            }
            C3049i iVar = C3049i.f8133a;
            C37475b bVar = C37475b.f94185a;
            C8592o oVar3 = o;
            C2693n nVar = c;
            oVar2 = oVar3;
            ButtonKt.m13343a(new CodeDigitsFieldComponentKt$ValidateLargeButton$1(jVar, aVar2), H, z3, (C2243g) null, (C7870j) null, nVar, (C2223i) null, iVar.mo10775a(0, 0, C15240j2.m66080w(bVar.mo114218O(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), bVar.mo114231a0(), o, C3049i.f8145m << 12, 3), PaddingKt.m10014a(C16483g.m74435M((float) 0)), C8553b.m31048b(oVar3, 1631523667, true, new CodeDigitsFieldComponentKt$ValidateLargeButton$2(z5)), oVar3, 905969664, 88);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new CodeDigitsFieldComponentKt$ValidateLargeButton$3(z4, z5, aVar2, i6));
        }
    }

    /* renamed from: x */
    public static final long m151396x(C36975d dVar, long j) {
        boolean z;
        boolean z2 = true;
        if (dVar instanceof C36975d.C36980e) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) dVar, (Object) C36975d.C36981f.f92374a);
        }
        if (!z) {
            z2 = dVar instanceof C36975d.C36982g;
        }
        if (z2) {
            return C37475b.f94185a.mo114224U();
        }
        if (dVar instanceof C36975d.C36978c) {
            return C37475b.f94185a.mo114245m();
        }
        return j;
    }
}
