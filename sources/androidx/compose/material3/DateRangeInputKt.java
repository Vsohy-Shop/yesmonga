package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n460#2,13:137\n36#2:151\n36#2:158\n473#2,3:165\n1114#3,6:105\n1114#3,6:113\n1114#3,6:152\n1114#3,6:159\n76#4,5:119\n81#4:150\n85#4:169\n75#5:124\n76#5,11:126\n89#5:168\n76#6:125\n154#7:170\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n39#1:104\n46#1:111\n46#1:112\n58#1:137,13\n75#1:151\n93#1:158\n58#1:165,3\n39#1:105,6\n46#1:113,6\n75#1:152,6\n93#1:159,6\n58#1:119,5\n58#1:150\n58#1:169\n58#1:124\n58#1:126,11\n58#1:168\n58#1:125\n102#1:170\n*E\n"})
public final class DateRangeInputKt {

    /* renamed from: a */
    public static final float f19343a = C16483g.m74435M((float) 8);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.compose.material3.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25647a(@org.jetbrains.annotations.C12579k androidx.compose.material3.StateData r25, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8186d0 r26, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r27, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r28, int r29) {
        /*
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r29
            java.lang.String r0 = "stateData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "dateValidator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1163802470(0xffffffffbaa1c89a, float:-0.0012343109)
            r1 = r28
            androidx.compose.runtime.o r11 = r1.mo15009o(r0)
            r1 = r15 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r11.mo15006n0(r12)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r15
            goto L_0x0030
        L_0x002f:
            r1 = r15
        L_0x0030:
            r2 = r15 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0040
            boolean r2 = r11.mo15006n0(r13)
            if (r2 == 0) goto L_0x003d
            r2 = 32
            goto L_0x003f
        L_0x003d:
            r2 = 16
        L_0x003f:
            r1 = r1 | r2
        L_0x0040:
            r2 = r15 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r11.mo14927P(r14)
            if (r2 == 0) goto L_0x004d
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x004f
        L_0x004d:
            r2 = 128(0x80, float:1.794E-43)
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r9 = r1
            r1 = r9 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0064
            boolean r1 = r11.mo15011p()
            if (r1 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r11.mo14958a0()
            r14 = r11
            goto L_0x02cc
        L_0x0064:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0070
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:31)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r1, r2)
        L_0x0070:
            r10 = 0
            java.util.Locale r8 = androidx.compose.material3.C8260p.m27433b(r11, r10)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r7)
            boolean r0 = r11.mo15006n0(r8)
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x008d
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0098
        L_0x008d:
            androidx.compose.material3.m r0 = r25.mo11987a()
            androidx.compose.material3.a0 r1 = r0.mo12496p(r8)
            r11.mo14893C(r1)
        L_0x0098:
            r11.mo15002m0()
            r6 = r1
            androidx.compose.material3.a0 r6 = (androidx.compose.material3.C8169a0) r6
            androidx.compose.material3.t2$a r16 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r16.mo13058j()
            r5 = 6
            java.lang.String r17 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r5)
            int r0 = r16.mo13062l()
            java.lang.String r18 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r5)
            int r0 = r16.mo13060k()
            java.lang.String r19 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r5)
            int r0 = r16.mo13019E()
            java.lang.String r20 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r5)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo14918M(r0)
            boolean r0 = r11.mo15006n0(r6)
            boolean r1 = r11.mo15006n0(r13)
            r0 = r0 | r1
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x00e5
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00df
            goto L_0x00e5
        L_0x00df:
            r13 = r5
            r17 = r6
            r18 = r8
            goto L_0x0104
        L_0x00e5:
            androidx.compose.material3.b0 r4 = new androidx.compose.material3.b0
            r0 = r4
            r1 = r25
            r2 = r6
            r3 = r26
            r10 = r4
            r4 = r27
            r13 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            r7 = r19
            r18 = r8
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.mo14893C(r10)
            r1 = r10
        L_0x0104:
            r11.mo15002m0()
            r19 = r1
            androidx.compose.material3.b0 r19 = (androidx.compose.material3.C8174b0) r19
            androidx.compose.ui.m$a r10 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.i0 r0 = androidx.compose.material3.DateInputKt.m25565f()
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10023j(r10, r0)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.f6010a
            float r2 = f19343a
            androidx.compose.foundation.layout.Arrangement$e r1 = r1.mo7638z(r2)
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r11.mo14918M(r2)
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r2 = r2.mo17073w()
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r1, r2, r11, r13)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r11.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r11.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r11.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r5.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r7 = r11.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x0166
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0166:
            r11.mo14938T()
            boolean r7 = r11.mo14997l()
            if (r7 == 0) goto L_0x0173
            r11.mo14947W(r6)
            goto L_0x0176
        L_0x0173:
            r11.mo14888A()
        L_0x0176:
            r11.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r11)
            kotlin.jvm.functions.p r7 = r5.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r7)
            kotlin.jvm.functions.p r1 = r5.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r1)
            kotlin.jvm.functions.p r1 = r5.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r5.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            r11.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r11)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r11, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r20 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            java.lang.String r0 = r17.mo12437f()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r8 = r0.toUpperCase(r1)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            int r0 = r16.mo13025K()
            java.lang.String r6 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r13)
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r4 = 2
            r5 = 0
            r0 = r20
            r1 = r10
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.C2411u0.m10660e(r0, r1, r2, r3, r4, r5)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$1 r1 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$1
            r1.<init>(r6, r8)
            r2 = 576559191(0x225d9857, float:3.0031733E-18)
            r7 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r2, r7, r1)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$2 r2 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$2
            r2.<init>(r8)
            r3 = 1726391478(0x66e6a4b6, float:5.4459134E23)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r3, r7, r2)
            androidx.compose.runtime.z0 r3 = r25.mo11993g()
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            androidx.compose.material3.l r4 = (androidx.compose.material3.C8238l) r4
            r6 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r6)
            boolean r3 = r11.mo15006n0(r12)
            java.lang.Object r5 = r11.mo14921N()
            if (r3 != 0) goto L_0x0213
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r5 != r3) goto L_0x021b
        L_0x0213:
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$3$1 r5 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$3$1
            r5.<init>(r12)
            r11.mo14893C(r5)
        L_0x021b:
            r11.mo15002m0()
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            androidx.compose.material3.b1$a r21 = androidx.compose.material3.C8175b1.f20002b
            int r22 = r21.mo12464c()
            int r3 = r9 << 9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = 1075315120(0x401801b0, float:2.375103)
            r23 = r3 | r9
            r3 = r25
            r9 = r6
            r6 = r22
            r7 = r19
            r24 = r8
            r8 = r17
            r9 = r18
            r22 = r10
            r10 = r11
            r14 = r11
            r11 = r23
            androidx.compose.material3.DateInputKt.m25561b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r0 = r16.mo13022H()
            java.lang.String r6 = androidx.compose.material3.C8357u2.m29348a(r0, r14, r13)
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r4 = 2
            r5 = 0
            r0 = r20
            r1 = r22
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.C2411u0.m10660e(r0, r1, r2, r3, r4, r5)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$4 r1 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$4
            r2 = r24
            r1.<init>(r6, r2)
            r3 = -663502784(0xffffffffd873c040, float:-1.07202813E15)
            r4 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r3, r4, r1)
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$5 r3 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$5
            r3.<init>(r2)
            r2 = 518729951(0x1eeb30df, float:2.4901805E-20)
            androidx.compose.runtime.internal.a r2 = androidx.compose.runtime.internal.C8553b.m31048b(r14, r2, r4, r3)
            androidx.compose.runtime.z0 r3 = r25.mo11992f()
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            androidx.compose.material3.l r4 = (androidx.compose.material3.C8238l) r4
            r3 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r3)
            boolean r3 = r14.mo15006n0(r12)
            java.lang.Object r5 = r14.mo14921N()
            if (r3 != 0) goto L_0x0298
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r5 != r3) goto L_0x02a0
        L_0x0298:
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$6$1 r5 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$1$6$1
            r5.<init>(r12)
            r14.mo14893C(r5)
        L_0x02a0:
            r14.mo15002m0()
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            int r6 = r21.mo12462a()
            r3 = r25
            r7 = r19
            r8 = r17
            r9 = r18
            r10 = r14
            r11 = r23
            androidx.compose.material3.DateInputKt.m25561b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.mo15002m0()
            r14.mo14896D()
            r14.mo15002m0()
            r14.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02cc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02cc:
            androidx.compose.runtime.t1 r0 = r14.mo15020s()
            if (r0 != 0) goto L_0x02d3
            goto L_0x02df
        L_0x02d3:
            androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2 r1 = new androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2
            r2 = r26
            r3 = r27
            r1.<init>(r12, r2, r3, r15)
            r0.mo15202a(r1)
        L_0x02df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangeInputKt.m25647a(androidx.compose.material3.StateData, androidx.compose.material3.d0, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }
}
