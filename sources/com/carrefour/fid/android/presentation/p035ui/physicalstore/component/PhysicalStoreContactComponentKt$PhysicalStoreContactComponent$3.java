package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import androidx.compose.p004ui.platform.C16007z3;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPhysicalStoreContactComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreContactComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,112:1\n74#2,6:113\n80#2:145\n84#2:255\n75#3:119\n76#3,11:121\n75#3:160\n76#3,11:162\n89#3:192\n75#3:217\n76#3,11:219\n89#3:249\n89#3:254\n76#4:120\n76#4:161\n76#4:218\n460#5,13:132\n25#5:146\n460#5,13:173\n473#5,3:189\n25#5:195\n50#5:202\n49#5:203\n460#5,13:230\n473#5,3:246\n473#5,3:251\n1114#6,6:147\n1114#6,6:196\n1114#6,6:204\n154#7:153\n154#7:187\n154#7:188\n154#7:194\n154#7:210\n154#7:244\n154#7:245\n75#8,6:154\n81#8:186\n85#8:193\n75#8,6:211\n81#8:243\n85#8:250\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreContactComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3\n*L\n45#1:113,6\n45#1:145\n45#1:255\n45#1:119\n45#1:121,11\n49#1:160\n49#1:162,11\n49#1:192\n75#1:217\n75#1:219,11\n75#1:249\n45#1:254\n45#1:120\n49#1:161\n75#1:218\n45#1:132,13\n52#1:146\n49#1:173,13\n49#1:189,3\n78#1:195\n80#1:202\n80#1:203\n75#1:230,13\n75#1:246,3\n45#1:251,3\n52#1:147,6\n78#1:196,6\n80#1:204,6\n59#1:153\n67#1:187\n68#1:188\n73#1:194\n84#1:210\n92#1:244\n93#1:245\n49#1:154,6\n49#1:186\n49#1:193\n75#1:211,6\n75#1:243\n75#1:250\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3 */
public final class PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $directionText;
    final /* synthetic */ String $directionUri;
    final /* synthetic */ C11289a<C11079d2> $onDirectionClicked;
    final /* synthetic */ C11300l<String, C11079d2> $onPhoneClicked;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ C16007z3 $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3(C11300l<? super String, C11079d2> lVar, String str, int i, C11289a<C11079d2> aVar, C16007z3 z3Var, String str2, String str3) {
        super(2);
        this.$onPhoneClicked = lVar;
        this.$phoneNumber = str;
        this.$$dirty = i;
        this.$onDirectionClicked = aVar;
        this.$uriHandler = z3Var;
        this.$directionUri = str2;
        this.$directionText = str3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r38, int r39) {
        /*
            r37 = this;
            r0 = r37
            r14 = r38
            r1 = r39
            r2 = r1 & 11
            r15 = 2
            if (r2 != r15) goto L_0x0017
            boolean r2 = r38.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r38.mo14958a0()
            goto L_0x042c
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponent.<anonymous> (PhysicalStoreContactComponent.kt:43)"
            r4 = -1402010852(0xffffffffac6f031c, float:-3.3965669E-12)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 1
            r12 = 0
            r11 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10114n(r13, r12, r1, r11)
            kotlin.jvm.functions.l<java.lang.String, kotlin.d2> r10 = r0.$onPhoneClicked
            java.lang.String r9 = r0.$phoneNumber
            int r8 = r0.$$dirty
            kotlin.jvm.functions.a<kotlin.d2> r7 = r0.$onDirectionClicked
            androidx.compose.ui.platform.z3 r6 = r0.$uriHandler
            java.lang.String r5 = r0.$directionUri
            java.lang.String r3 = r0.$directionText
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r14.mo14918M(r2)
            androidx.compose.foundation.layout.Arrangement r26 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r2 = r26.mo7631r()
            androidx.compose.ui.c$a r27 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r4 = r27.mo17072u()
            r15 = 0
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r4, r14, r15)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r14.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r14.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r28 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r15 = r28.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r0 = r38.mo15017r()
            boolean r0 = r0 instanceof androidx.compose.runtime.C8428d
            if (r0 != 0) goto L_0x008d
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x008d:
            r38.mo14938T()
            boolean r0 = r38.mo14997l()
            if (r0 == 0) goto L_0x009a
            r14.mo14947W(r15)
            goto L_0x009d
        L_0x009a:
            r38.mo14888A()
        L_0x009d:
            r38.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r38)
            kotlin.jvm.functions.p r15 = r28.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r2, r15)
            kotlin.jvm.functions.p r2 = r28.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r4, r2)
            kotlin.jvm.functions.p r2 = r28.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r11, r2)
            kotlin.jvm.functions.p r2 = r28.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r12, r2)
            r38.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r38)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.invoke(r0, r14, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.c$c r15 = r27.mo17070q()
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r12)
            java.lang.Object r1 = r38.mo14921N()
            androidx.compose.runtime.o$a r29 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r29.mo16277a()
            if (r1 != r2) goto L_0x00f8
            androidx.compose.foundation.interaction.g r1 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r14.mo14893C(r1)
        L_0x00f8:
            r38.mo15002m0()
            r11 = r1
            androidx.compose.foundation.interaction.g r11 = (androidx.compose.foundation.interaction.C2243g) r11
            r1 = 1
            r2 = 0
            com.carrefour.fid.android.design.theme.b r30 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r20 = r30.mo114218O()
            r22 = 6
            r23 = 2
            r31 = r3
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3 = r20
            r12 = r5
            r5 = r38
            r0 = r6
            r6 = r22
            r21 = r8
            r8 = r7
            r7 = r23
            androidx.compose.foundation.a0 r7 = androidx.compose.material.ripple.C7922j.m25285e(r1, r2, r3, r5, r6, r7)
            r1 = 0
            r2 = 0
            r3 = 0
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3$1$2 r4 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3$1$2
            r4.<init>(r8, r0, r12)
            r12 = 28
            r0 = 0
            r5 = r13
            r6 = r11
            r32 = r21
            r8 = r1
            r1 = r9
            r9 = r2
            r2 = r10
            r10 = r3
            r3 = 0
            r11 = r4
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r33 = r13
            r13 = r0
            androidx.compose.ui.m r0 = androidx.compose.foundation.ClickableKt.m8876c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r5 = 16
            float r13 = (float) r5
            float r5 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r5)
            r12 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r12)
            androidx.compose.foundation.layout.Arrangement$d r5 = r26.mo7630p()
            r11 = 48
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r15, r14, r11)
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
            kotlin.jvm.functions.a r9 = r28.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r10 = r38.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0192
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0192:
            r38.mo14938T()
            boolean r10 = r38.mo14997l()
            if (r10 == 0) goto L_0x019f
            r14.mo14947W(r9)
            goto L_0x01a2
        L_0x019f:
            r38.mo14888A()
        L_0x01a2:
            r38.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r38)
            kotlin.jvm.functions.p r10 = r28.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r5, r10)
            kotlin.jvm.functions.p r5 = r28.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r5)
            kotlin.jvm.functions.p r5 = r28.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r5)
            kotlin.jvm.functions.p r5 = r28.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r5)
            r38.mo14972e()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.C8684u1.m31906b(r38)
            androidx.compose.runtime.u1 r5 = androidx.compose.runtime.C8684u1.m31905a(r5)
            r15 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r0.invoke(r5, r14, r6)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 2
            r10 = 0
            r5 = r0
            r6 = r33
            androidx.compose.ui.m r5 = androidx.compose.foundation.layout.C2411u0.m10660e(r5, r6, r7, r8, r9, r10)
            r10 = r2
            r2 = r5
            r5 = 0
            r8 = r3
            r9 = r4
            r3 = r5
            r34 = 14
            long r5 = androidx.compose.p004ui.unit.C16506u.m74712m(r34)
            r7 = 0
            r17 = 0
            r8 = r17
            r9 = r17
            r17 = 0
            r35 = r10
            r10 = r17
            r17 = 0
            r12 = r17
            r36 = r13
            r13 = r17
            r17 = 0
            r14 = r17
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            int r22 = r32 >> 3
            r3 = r22 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r23 = r3
            r24 = 0
            r25 = 131060(0x1fff4, float:1.83654E-40)
            r3 = r1
            r1 = r31
            r22 = r38
            r31 = r0
            r0 = r3
            r3 = 0
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 2131231508(0x7f080314, float:1.80791E38)
            r14 = r38
            r15 = 0
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.p004ui.res.C16015f.m71849d(r1, r14, r15)
            r2 = 0
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            r5 = r33
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            r4 = 24
            float r13 = (float) r4
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r13)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r4)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 440(0x1b8, float:6.17E-43)
            r10 = 120(0x78, float:1.68E-43)
            r8 = r38
            androidx.compose.foundation.ImageKt.m8967b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r38.mo15002m0()
            r38.mo14896D()
            r38.mo15002m0()
            r38.mo15002m0()
            long r2 = r30.mo114239g()
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            r12 = r33
            r4 = 0
            r5 = 0
            r6 = 2
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10026m(r12, r1, r5, r6, r4)
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 12
            r6 = r38
            androidx.compose.material.DividerKt.m13428a(r1, r2, r4, r5, r6, r7, r8)
            androidx.compose.ui.c$c r11 = r27.mo17070q()
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo14918M(r1)
            java.lang.Object r1 = r38.mo14921N()
            java.lang.Object r2 = r29.mo16277a()
            if (r1 != r2) goto L_0x02ad
            androidx.compose.foundation.interaction.g r1 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r14.mo14893C(r1)
        L_0x02ad:
            r38.mo15002m0()
            r8 = r1
            androidx.compose.foundation.interaction.g r8 = (androidx.compose.foundation.interaction.C2243g) r8
            r1 = 1
            r2 = 0
            long r3 = r30.mo114218O()
            r6 = 6
            r7 = 2
            r5 = r38
            androidx.compose.foundation.a0 r7 = androidx.compose.material.ripple.C7922j.m25285e(r1, r2, r3, r5, r6, r7)
            r1 = 0
            r9 = 0
            r10 = 0
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r2)
            r2 = r35
            boolean r3 = r14.mo15006n0(r2)
            boolean r4 = r14.mo15006n0(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r38.mo14921N()
            if (r3 != 0) goto L_0x02e1
            java.lang.Object r3 = r29.mo16277a()
            if (r4 != r3) goto L_0x02e9
        L_0x02e1:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3$1$5$1 r4 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3$1$5$1
            r4.<init>(r2, r0)
            r14.mo14893C(r4)
        L_0x02e9:
            r38.mo15002m0()
            r2 = r4
            kotlin.jvm.functions.a r2 = (kotlin.jvm.functions.C11289a) r2
            r3 = 28
            r4 = 0
            r5 = r12
            r6 = r8
            r8 = r1
            r1 = r11
            r11 = r2
            r27 = r12
            r12 = r3
            r29 = r13
            r13 = r4
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8876c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10024k(r2, r3)
            r3 = 693286680(0x2952b718, float:4.6788176E-14)
            r14.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement$d r3 = r26.mo7630p()
            r4 = 48
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.RowKt.m10071d(r3, r1, r14, r4)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r3)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r14.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            kotlin.jvm.functions.a r6 = r28.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r7 = r38.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x0350
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0350:
            r38.mo14938T()
            boolean r7 = r38.mo14997l()
            if (r7 == 0) goto L_0x035d
            r14.mo14947W(r6)
            goto L_0x0360
        L_0x035d:
            r38.mo14888A()
        L_0x0360:
            r38.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r38)
            kotlin.jvm.functions.p r7 = r28.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r7)
            kotlin.jvm.functions.p r1 = r28.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r28.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            kotlin.jvm.functions.p r1 = r28.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r1)
            r38.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r38)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r2.invoke(r1, r14, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r1)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 2
            r10 = 0
            r5 = r31
            r6 = r27
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.C2411u0.m10660e(r5, r6, r7, r8, r9, r10)
            r3 = 0
            long r5 = androidx.compose.p004ui.unit.C16506u.m74712m(r34)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r1 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            int r22 = r32 >> 9
            r3 = r22 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r23 = r3
            r24 = 0
            r25 = 131060(0x1fff4, float:1.83654E-40)
            r3 = r1
            r1 = r0
            r22 = r38
            r0 = r3
            r3 = 0
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 2131231618(0x7f080382, float:1.8079322E38)
            r2 = 0
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.p004ui.res.C16015f.m71849d(r1, r0, r2)
            r2 = 0
            float r6 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            r5 = r27
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
            float r4 = androidx.compose.p004ui.unit.C16483g.m74435M(r29)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10087C(r3, r4)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 440(0x1b8, float:6.17E-43)
            r10 = 120(0x78, float:1.68E-43)
            r8 = r38
            androidx.compose.foundation.ImageKt.m8967b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r38.mo15002m0()
            r38.mo14896D()
            r38.mo15002m0()
            r38.mo15002m0()
            r38.mo15002m0()
            r38.mo14896D()
            r38.mo15002m0()
            r38.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x042c
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x042c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3.invoke(androidx.compose.runtime.o, int):void");
    }
}
