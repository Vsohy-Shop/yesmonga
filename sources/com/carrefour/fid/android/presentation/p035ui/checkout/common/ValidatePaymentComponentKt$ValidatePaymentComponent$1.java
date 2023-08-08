package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nValidatePaymentComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ValidatePaymentComponentKt$ValidatePaymentComponent$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n154#2:121\n154#2:176\n74#3,6:122\n80#3:154\n84#3:181\n75#4:128\n76#4,11:130\n89#4:180\n76#5:129\n460#6,13:141\n50#6:168\n49#6:169\n473#6,3:177\n1098#7:155\n927#7,6:156\n927#7,6:162\n1114#8,6:170\n*S KotlinDebug\n*F\n+ 1 ValidatePaymentComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ValidatePaymentComponentKt$ValidatePaymentComponent$1\n*L\n46#1:121\n91#1:176\n43#1:122,6\n43#1:154\n43#1:181\n43#1:128\n43#1:130,11\n43#1:180\n43#1:129\n43#1:141,13\n81#1:168\n81#1:169\n43#1:177,3\n53#1:155\n54#1:156,6\n62#1:162,6\n81#1:170,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$1 */
public final class ValidatePaymentComponentKt$ValidatePaymentComponent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;
    final /* synthetic */ C11289a<C11079d2> $onValidate;
    final /* synthetic */ String $text;
    final /* synthetic */ double $totalAmount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidatePaymentComponentKt$ValidatePaymentComponent$1(C8767m mVar, C11289a<C11079d2> aVar, int i, double d, boolean z, String str, boolean z2, C11289a<C11079d2> aVar2) {
        super(2);
        this.$modifier = mVar;
        this.$onCgvClicked = aVar;
        this.$$dirty = i;
        this.$totalAmount = d;
        this.$isLoading = z;
        this.$text = str;
        this.$isEnabled = z2;
        this.$onValidate = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r40, int r41) {
        /*
            r39 = this;
            r1 = r39
            r0 = r40
            r2 = r41
            r3 = r2 & 11
            r4 = 2
            if (r3 != r4) goto L_0x0017
            boolean r3 = r40.mo15011p()
            if (r3 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r40.mo14958a0()
            goto L_0x0259
        L_0x0017:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0026
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponent.<anonymous> (ValidatePaymentComponent.kt:41)"
            r5 = 708909304(0x2a4118f8, float:1.7150506E-13)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
        L_0x0026:
            androidx.compose.ui.m r6 = r1.$modifier
            com.carrefour.fid.android.design.theme.b r13 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r13.mo114231a0()
            r9 = 0
            r10 = 2
            r11 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.BackgroundKt.m8825d(r6, r7, r9, r10, r11)
            r3 = 16
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10024k(r2, r3)
            r14 = 0
            r3 = 3
            androidx.compose.ui.m r2 = androidx.compose.animation.AnimationModifierKt.m7766b(r2, r14, r14, r3, r14)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r3.mo17068m()
            kotlin.jvm.functions.a<kotlin.d2> r4 = r1.$onCgvClicked
            int r15 = r1.$$dirty
            double r11 = r1.$totalAmount
            boolean r10 = r1.$isLoading
            java.lang.String r9 = r1.$text
            boolean r8 = r1.$isEnabled
            kotlin.jvm.functions.a<kotlin.d2> r7 = r1.$onValidate
            r5 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r0.mo14918M(r5)
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r5 = r5.mo7631r()
            r6 = 48
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r5, r3, r0, r6)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo14918M(r5)
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r5 = r0.mo15032w(r5)
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r6 = r0.mo15032w(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r14 = r0.mo15032w(r14)
            androidx.compose.ui.platform.c4 r14 = (androidx.compose.p004ui.platform.C15863c4) r14
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r1 = r16.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            r17 = r7
            androidx.compose.runtime.d r7 = r40.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x00a7
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00a7:
            r40.mo14938T()
            boolean r7 = r40.mo14997l()
            if (r7 == 0) goto L_0x00b4
            r0.mo14947W(r1)
            goto L_0x00b7
        L_0x00b4:
            r40.mo14888A()
        L_0x00b7:
            r40.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r40)
            kotlin.jvm.functions.p r7 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r3, r7)
            kotlin.jvm.functions.p r3 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r5, r3)
            kotlin.jvm.functions.p r3 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r6, r3)
            kotlin.jvm.functions.p r3 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r14, r3)
            r40.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r40)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.invoke(r1, r0, r5)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r1 = 2131952115(0x7f1301f3, float:1.9540664E38)
            java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r0, r3)
            r2 = -687652933(0xffffffffd7033fbb, float:-1.44309744E14)
            r0.mo14918M(r2)
            androidx.compose.ui.text.d$a r2 = new androidx.compose.ui.text.d$a
            r14 = 1
            r5 = 0
            r2.<init>(r3, r14, r5)
            androidx.compose.ui.text.c0 r5 = new androidx.compose.ui.text.c0
            r18 = r5
            long r19 = r13.mo114205B()
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 16382(0x3ffe, float:2.2956E-41)
            r38 = 0
            r18.<init>((long) r19, (long) r21, (androidx.compose.p004ui.text.font.C16209i0) r23, (androidx.compose.p004ui.text.font.C16190e0) r24, (androidx.compose.p004ui.text.font.C16194f0) r25, (androidx.compose.p004ui.text.font.C16242u) r26, (java.lang.String) r27, (long) r28, (androidx.compose.p004ui.text.style.C16410a) r30, (androidx.compose.p004ui.text.style.C16439m) r31, (androidx.compose.p004ui.text.intl.C16342f) r32, (long) r33, (androidx.compose.p004ui.text.style.C16434j) r35, (androidx.compose.p004ui.graphics.C15205e4) r36, (int) r37, (kotlin.jvm.internal.DefaultConstructorMarker) r38)
            int r5 = r2.mo46713r(r5)
            r2.mo46707l(r1)     // Catch:{ all -> 0x025f }
            java.lang.String r6 = " "
            r2.mo46707l(r6)     // Catch:{ all -> 0x025f }
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x025f }
            r2.mo46710o(r5)
            androidx.compose.ui.text.c0 r5 = new androidx.compose.ui.text.c0
            r18 = r5
            long r19 = r13.mo114218O()
            r21 = 0
            androidx.compose.ui.text.font.i0$a r6 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r23 = r6.mo46947c()
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 16378(0x3ffa, float:2.295E-41)
            r38 = 0
            r18.<init>((long) r19, (long) r21, (androidx.compose.p004ui.text.font.C16209i0) r23, (androidx.compose.p004ui.text.font.C16190e0) r24, (androidx.compose.p004ui.text.font.C16194f0) r25, (androidx.compose.p004ui.text.font.C16242u) r26, (java.lang.String) r27, (long) r28, (androidx.compose.p004ui.text.style.C16410a) r30, (androidx.compose.p004ui.text.style.C16439m) r31, (androidx.compose.p004ui.text.intl.C16342f) r32, (long) r33, (androidx.compose.p004ui.text.style.C16434j) r35, (androidx.compose.p004ui.graphics.C15205e4) r36, (int) r37, (kotlin.jvm.internal.DefaultConstructorMarker) r38)
            int r5 = r2.mo46713r(r5)
            r6 = 2131952113(0x7f1301f1, float:1.954066E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r6, r0, r3)     // Catch:{ all -> 0x025a }
            r2.mo46707l(r3)     // Catch:{ all -> 0x025a }
            java.lang.String r3 = "."
            r2.mo46707l(r3)     // Catch:{ all -> 0x025a }
            r2.mo46710o(r5)
            int r1 = r1.length()
            int r3 = r2.mo46708m()
            int r3 = r3 - r14
            java.lang.String r5 = "CGV"
            java.lang.String r6 = ""
            r2.mo46693a(r5, r6, r1, r3)
            androidx.compose.ui.text.d r2 = r2.mo46716u()
            r40.mo15002m0()
            r3 = 0
            androidx.compose.material.t0 r1 = androidx.compose.material.C7933t0.f19075a
            int r5 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r1 = r1.mo11077c(r0, r5)
            androidx.compose.ui.text.p0 r1 = com.carrefour.fid.android.design.theme.C37477d.m153893e(r1)
            r5 = 0
            r6 = 0
            r16 = 0
            r14 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo14918M(r14)
            boolean r14 = r0.mo15006n0(r2)
            boolean r19 = r0.mo15006n0(r4)
            r14 = r14 | r19
            java.lang.Object r7 = r40.mo14921N()
            if (r14 != 0) goto L_0x01cc
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r14 = r14.mo16277a()
            if (r7 != r14) goto L_0x01d4
        L_0x01cc:
            com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$1$1$1$1 r7 = new com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$1$1$1$1
            r7.<init>(r2, r4)
            r0.mo14893C(r7)
        L_0x01d4:
            r40.mo15002m0()
            r14 = r7
            kotlin.jvm.functions.l r14 = (kotlin.jvm.functions.C11300l) r14
            r20 = 0
            r21 = 122(0x7a, float:1.71E-43)
            r4 = r1
            r1 = r17
            r7 = 0
            r17 = r8
            r8 = r16
            r16 = r9
            r9 = r14
            r14 = r10
            r10 = r40
            r22 = r11
            r11 = r20
            r12 = r21
            androidx.compose.foundation.text.ClickableTextKt.m12220b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 8
            float r3 = (float) r3
            float r3 = androidx.compose.p004ui.unit.C16483g.m74435M(r3)
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10115o(r2, r3)
            r4 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r3, r0, r4)
            r3 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r3, r5, r6)
            long r6 = r13.mo114220Q()
            long r8 = r13.mo114218O()
            java.lang.Double r3 = java.lang.Double.valueOf(r22)
            java.lang.String r10 = com.carrefour.fid.android.shared.extension.C28782t.m119105b(r3)
            int r3 = r15 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            int r5 = r15 << 3
            r11 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r11
            r3 = r3 | r5
            int r5 = r15 << 9
            r11 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r11
            r3 = r3 | r5
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            int r4 = r15 << 6
            r4 = r4 & r5
            r13 = r3 | r4
            r15 = 0
            r3 = r14
            r4 = r8
            r8 = r10
            r9 = r16
            r10 = r17
            r11 = r1
            r12 = r40
            r14 = r15
            com.carrefour.fid.android.design.components.compose.AddToCartComponentKt.m151307c(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            r40.mo15002m0()
            r40.mo14896D()
            r40.mo15002m0()
            r40.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0259
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0259:
            return
        L_0x025a:
            r0 = move-exception
            r2.mo46710o(r5)
            throw r0
        L_0x025f:
            r0 = move-exception
            r2.mo46710o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
