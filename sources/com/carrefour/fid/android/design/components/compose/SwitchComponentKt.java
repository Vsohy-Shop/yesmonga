package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSwitchComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchComponent.kt\ncom/carrefour/fid/android/design/components/compose/SwitchComponentKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,109:1\n25#2:110\n460#2,13:147\n50#2:161\n49#2:162\n83#2,3:169\n473#2,3:179\n1114#3,6:111\n1114#3,6:163\n1114#3,6:172\n154#4:117\n154#4:118\n154#4:119\n154#4:178\n75#5:120\n58#5:121\n58#5:124\n51#5:126\n76#6:122\n76#6:125\n76#6:135\n1#7:123\n74#8,7:127\n81#8:160\n85#8:183\n75#9:134\n76#9,11:136\n89#9:182\n*S KotlinDebug\n*F\n+ 1 SwitchComponent.kt\ncom/carrefour/fid/android/design/components/compose/SwitchComponentKt\n*L\n36#1:110\n53#1:147,13\n60#1:161\n60#1:162\n68#1:169,3\n53#1:179,3\n36#1:111,6\n60#1:163,6\n68#1:172,6\n39#1:117\n40#1:118\n41#1:119\n82#1:178\n42#1:120\n42#1:121\n45#1:124\n47#1:126\n45#1:122\n47#1:125\n53#1:135\n53#1:127,7\n53#1:160\n53#1:183\n53#1:134\n53#1:136,11\n53#1:182\n*E\n"})
public final class SwitchComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$1$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$1$2$1} */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0268, code lost:
        if (r1 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x026a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151651a(boolean r30, @org.jetbrains.annotations.C12579k java.lang.String r31, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r32, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r33, int r34, int r35) {
        /*
            r0 = r31
            r15 = r32
            r13 = r34
            java.lang.String r1 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "onSwitch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            r1 = -32965234(0xfffffffffe08fd8e, float:-4.5522885E37)
            r2 = r33
            androidx.compose.runtime.o r14 = r2.mo15009o(r1)
            r2 = r35 & 1
            r11 = 2
            if (r2 == 0) goto L_0x0024
            r3 = r13 | 6
            r4 = r3
            r3 = r30
            goto L_0x0038
        L_0x0024:
            r3 = r13 & 14
            if (r3 != 0) goto L_0x0035
            r3 = r30
            boolean r4 = r14.mo14961b(r3)
            if (r4 == 0) goto L_0x0032
            r4 = 4
            goto L_0x0033
        L_0x0032:
            r4 = r11
        L_0x0033:
            r4 = r4 | r13
            goto L_0x0038
        L_0x0035:
            r3 = r30
            r4 = r13
        L_0x0038:
            r5 = r35 & 2
            if (r5 == 0) goto L_0x003f
            r4 = r4 | 48
            goto L_0x004f
        L_0x003f:
            r5 = r13 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004f
            boolean r5 = r14.mo15006n0(r0)
            if (r5 == 0) goto L_0x004c
            r5 = 32
            goto L_0x004e
        L_0x004c:
            r5 = 16
        L_0x004e:
            r4 = r4 | r5
        L_0x004f:
            r5 = r35 & 4
            if (r5 == 0) goto L_0x0056
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            boolean r5 = r14.mo14927P(r15)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r4 = r4 | r5
        L_0x0066:
            r12 = r4
            r4 = r12 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x007c
            boolean r4 = r14.mo15011p()
            if (r4 != 0) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            r14.mo14958a0()
            r1 = r3
            r26 = r14
            goto L_0x02e1
        L_0x007c:
            r9 = 0
            if (r2 == 0) goto L_0x0082
            r25 = r9
            goto L_0x0084
        L_0x0082:
            r25 = r3
        L_0x0084:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0090
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.design.components.compose.SwitchComponent (SwitchComponent.kt:30)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r12, r2, r3)
        L_0x0090:
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r1)
            java.lang.Object r1 = r14.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r16.mo16277a()
            r8 = 0
            if (r1 != r2) goto L_0x00ae
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r1, r8, r11, r8)
            r14.mo14893C(r1)
        L_0x00ae:
            r14.mo15002m0()
            androidx.compose.runtime.z0 r1 = (androidx.compose.runtime.C8700z0) r1
            r2 = 40
            float r2 = (float) r2
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r2 = 20
            float r2 = (float) r2
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            r5 = 1
            float r2 = (float) r5
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            float r3 = (float) r11
            float r3 = r6 / r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            float r3 = r3 - r2
            float r22 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            java.lang.Object r3 = r1.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0102
            r3 = -1965624448(0xffffffff8ad6f380, float:-2.0699045E-32)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            float r4 = r7 - r22
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r4 = r4 - r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r4)
            float r2 = r3.mo7425g5(r2)
            r14.mo15002m0()
            goto L_0x011f
        L_0x0102:
            r3 = -1965624333(0xffffffff8ad6f3f3, float:-2.0699214E-32)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            float r2 = r22 + r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            float r2 = r3.mo7425g5(r2)
            r14.mo15002m0()
        L_0x011f:
            r3 = 0
            r4 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 30
            r21 = r5
            r5 = r17
            r11 = r6
            r6 = r18
            r10 = r7
            r7 = r14
            r8 = r19
            r0 = r9
            r9 = r20
            androidx.compose.runtime.k2 r23 = androidx.compose.animation.core.AnimateAsStateKt.m7971e(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_brand_white
            long r2 = androidx.compose.p004ui.res.C16009b.m71825a(r2, r14, r0)
            java.lang.Object r4 = r1.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0150
            int r4 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_primary
            goto L_0x0152
        L_0x0150:
            int r4 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_60
        L_0x0152:
            long r18 = androidx.compose.p004ui.res.C16009b.m71825a(r4, r14, r0)
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r4 = r4.mo17070q()
            r5 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r5)
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r6 = r6.mo7630p()
            r7 = 48
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.RowKt.m10071d(r6, r4, r14, r7)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r14.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r14.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r14.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r0 = r9.mo44585a()
            kotlin.jvm.functions.q r13 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            r27 = r2
            androidx.compose.runtime.d r2 = r14.mo15017r()
            boolean r2 = r2 instanceof androidx.compose.runtime.C8428d
            if (r2 != 0) goto L_0x01ab
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01ab:
            r14.mo14938T()
            boolean r2 = r14.mo14997l()
            if (r2 == 0) goto L_0x01b8
            r14.mo14947W(r0)
            goto L_0x01bb
        L_0x01b8:
            r14.mo14888A()
        L_0x01bb:
            r14.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r2 = r9.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r4, r2)
            kotlin.jvm.functions.p r2 = r9.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r6, r2)
            kotlin.jvm.functions.p r2 = r9.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r7, r2)
            kotlin.jvm.functions.p r2 = r9.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r8, r2)
            r14.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r13.invoke(r0, r14, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10089E(r5, r10, r11)
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            r3 = 3
            int r29 = r12 >> 3
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r4)
            boolean r4 = r14.mo15006n0(r1)
            boolean r5 = r14.mo15006n0(r15)
            r4 = r4 | r5
            java.lang.Object r5 = r14.mo14921N()
            if (r4 != 0) goto L_0x021d
            java.lang.Object r4 = r16.mo16277a()
            if (r5 != r4) goto L_0x0226
        L_0x021d:
            com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$1$1$1 r5 = new com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$1$1$1
            r4 = 0
            r5.<init>(r1, r15, r4)
            r14.mo14893C(r5)
        L_0x0226:
            r14.mo15002m0()
            kotlin.jvm.functions.p r5 = (kotlin.jvm.functions.C11304p) r5
            androidx.compose.ui.m r0 = androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt.m68437c(r0, r2, r5)
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r18)
            r5 = 0
            r2[r5] = r4
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r27)
            r2[r21] = r4
            androidx.compose.ui.unit.g r4 = androidx.compose.p004ui.unit.C16483g.m74451w(r22)
            r5 = 2
            r2[r5] = r4
            r2[r3] = r23
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.mo14918M(r3)
            r3 = 0
            r9 = 0
        L_0x0250:
            if (r9 >= r1) goto L_0x025c
            r4 = r2[r9]
            boolean r4 = r14.mo15006n0(r4)
            r3 = r3 | r4
            int r9 = r9 + 1
            goto L_0x0250
        L_0x025c:
            java.lang.Object r1 = r14.mo14921N()
            if (r3 != 0) goto L_0x026a
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r1 != r2) goto L_0x0276
        L_0x026a:
            com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$1$2$1 r1 = new com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$1$2$1
            r17 = r1
            r20 = r27
            r17.<init>(r18, r20, r22, r23)
            r14.mo14893C(r1)
        L_0x0276:
            r14.mo15002m0()
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.C11300l) r1
            r2 = 0
            androidx.compose.foundation.CanvasKt.m8873b(r0, r1, r14, r2)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 5
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10092H(r0, r1)
            r1 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r14, r1)
            androidx.compose.material.t0 r0 = androidx.compose.material.C7933t0.f19075a
            int r1 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r0 = r0.mo11077c(r14, r1)
            androidx.compose.ui.text.p0 r20 = r0.mo11088c()
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_5
            r1 = 0
            long r2 = androidx.compose.p004ui.res.C16009b.m71825a(r0, r14, r1)
            r1 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r26 = r14
            r13 = r16
            r0 = 0
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = r29 & 14
            r23 = 0
            r24 = 65530(0xfffa, float:9.1827E-41)
            r0 = r31
            r21 = r26
            androidx.compose.material.TextKt.m14196c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r26.mo15002m0()
            r26.mo14896D()
            r26.mo15002m0()
            r26.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02df
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02df:
            r1 = r25
        L_0x02e1:
            androidx.compose.runtime.t1 r6 = r26.mo15020s()
            if (r6 != 0) goto L_0x02e8
            goto L_0x02f9
        L_0x02e8:
            com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$2 r7 = new com.carrefour.fid.android.design.components.compose.SwitchComponentKt$SwitchComponent$2
            r0 = r7
            r2 = r31
            r3 = r32
            r4 = r34
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo15202a(r7)
        L_0x02f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.SwitchComponentKt.m151651a(boolean, java.lang.String, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151652b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1180211134);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1180211134, i, -1, "com.carrefour.fid.android.design.components.compose.SwitchComponentPreview (SwitchComponent.kt:92)");
            }
            ThemeKt.m153788a(ComposableSingletons$SwitchComponentKt.f92288a.mo112149a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SwitchComponentKt$SwitchComponentPreview$1(i));
        }
    }
}
