package androidx.compose.material3;

import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1673:1\n50#2:1674\n49#2:1675\n50#2:1682\n49#2:1683\n36#2:1690\n50#2:1697\n49#2:1698\n50#2:1705\n49#2:1706\n36#2:1713\n1114#3,6:1676\n1114#3,6:1684\n1114#3,6:1691\n1114#3,6:1699\n1114#3,6:1707\n1114#3,6:1714\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n*L\n720#1:1674\n720#1:1675\n732#1:1682\n732#1:1683\n747#1:1690\n753#1:1697\n753#1:1698\n766#1:1705\n766#1:1706\n781#1:1713\n720#1:1676,6\n732#1:1684,6\n747#1:1691,6\n753#1:1699,6\n766#1:1707,6\n781#1:1714,6\n*E\n"})
public final class TimePickerKt$TimeInputImpl$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ C8700z0<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ C8700z0<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1(C8700z0<TextFieldValue> z0Var, TimePickerState timePickerState, int i, C8212h3 h3Var, C8700z0<TextFieldValue> z0Var2) {
        super(2);
        this.$hourValue$delegate = z0Var;
        this.$state = timePickerState;
        this.$$dirty = i;
        this.$colors = h3Var;
        this.$minuteValue$delegate = z0Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r44, int r45) {
        /*
            r43 = this;
            r0 = r43
            r12 = r44
            r1 = r45
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r44.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r44.mo14958a0()
            goto L_0x01f3
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:715)"
            r4 = 1306700887(0x4de2ac57, float:4.7536816E8)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.runtime.z0<androidx.compose.ui.text.input.TextFieldValue> r1 = r0.$hourValue$delegate
            androidx.compose.material3.TimePickerState r2 = r0.$state
            r14 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.mo14918M(r14)
            boolean r3 = r12.mo15006n0(r1)
            boolean r4 = r12.mo15006n0(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r44.mo14921N()
            if (r3 != 0) goto L_0x0049
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0051
        L_0x0049:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1 r4 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1
            r4.<init>(r2, r1)
            r12.mo14893C(r4)
        L_0x0051:
            r44.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.ui.m r1 = androidx.compose.p004ui.input.key.C15441f.m68286a(r13, r4)
            androidx.compose.runtime.z0<androidx.compose.ui.text.input.TextFieldValue> r2 = r0.$hourValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r2 = androidx.compose.material3.TimePickerKt.m26761n(r2)
            androidx.compose.material3.TimePickerState r3 = r0.$state
            androidx.compose.runtime.z0<androidx.compose.ui.text.input.TextFieldValue> r4 = r0.$hourValue$delegate
            r12.mo14918M(r14)
            boolean r5 = r12.mo15006n0(r3)
            boolean r6 = r12.mo15006n0(r4)
            r5 = r5 | r6
            java.lang.Object r6 = r44.mo14921N()
            if (r5 != 0) goto L_0x007e
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x0086
        L_0x007e:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1 r6 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$2$1
            r6.<init>(r3, r4)
            r12.mo14893C(r6)
        L_0x0086:
            r44.mo15002m0()
            r3 = r6
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.material3.TimePickerState r4 = r0.$state
            androidx.compose.material3.l2$a r15 = androidx.compose.material3.C8241l2.f20286b
            int r5 = r15.mo12784a()
            androidx.compose.ui.text.input.p$a r16 = androidx.compose.p004ui.text.input.C16310p.f40516b
            int r21 = r16.mo47282g()
            androidx.compose.ui.text.input.a0$a r24 = androidx.compose.p004ui.text.input.C16273a0.f40446b
            int r20 = r24.mo47155g()
            androidx.compose.foundation.text.m r6 = new androidx.compose.foundation.text.m
            r18 = 0
            r19 = 0
            r22 = 3
            r23 = 0
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r26 = 0
            r27 = 0
            androidx.compose.material3.TimePickerState r7 = r0.$state
            r11 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r11)
            boolean r8 = r12.mo15006n0(r7)
            java.lang.Object r9 = r44.mo14921N()
            if (r8 != 0) goto L_0x00cd
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x00d5
        L_0x00cd:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$3$1 r9 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$3$1
            r9.<init>(r7)
            r12.mo14893C(r9)
        L_0x00d5:
            r44.mo15002m0()
            r28 = r9
            kotlin.jvm.functions.l r28 = (kotlin.jvm.functions.C11300l) r28
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 59
            r33 = 0
            androidx.compose.foundation.text.k r7 = new androidx.compose.foundation.text.k
            r25 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            androidx.compose.material3.h3 r8 = r0.$colors
            int r9 = r0.$$dirty
            int r10 = r9 << 3
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            int r9 = r9 << 18
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r17
            r10 = r10 | r9
            r18 = 0
            r9 = r44
            r11 = r18
            androidx.compose.material3.TimePickerKt.m26769s(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            float r1 = androidx.compose.material3.TimePickerKt.f19900j
            androidx.compose.material3.tokens.f1 r2 = androidx.compose.material3.tokens.C8303f1.f21117a
            float r2 = r2.mo13542f()
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10089E(r13, r1, r2)
            r2 = 6
            androidx.compose.material3.TimePickerKt.m26747g(r1, r12, r2)
            androidx.compose.runtime.z0<androidx.compose.ui.text.input.TextFieldValue> r1 = r0.$minuteValue$delegate
            androidx.compose.material3.TimePickerState r2 = r0.$state
            r12.mo14918M(r14)
            boolean r3 = r12.mo15006n0(r1)
            boolean r4 = r12.mo15006n0(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r44.mo14921N()
            if (r3 != 0) goto L_0x0137
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x013f
        L_0x0137:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1 r4 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$4$1
            r4.<init>(r2, r1)
            r12.mo14893C(r4)
        L_0x013f:
            r44.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.ui.m r1 = androidx.compose.p004ui.input.key.C15441f.m68287b(r13, r4)
            androidx.compose.runtime.z0<androidx.compose.ui.text.input.TextFieldValue> r2 = r0.$minuteValue$delegate
            androidx.compose.ui.text.input.TextFieldValue r2 = androidx.compose.material3.TimePickerKt.m26765p(r2)
            androidx.compose.material3.TimePickerState r3 = r0.$state
            androidx.compose.runtime.z0<androidx.compose.ui.text.input.TextFieldValue> r4 = r0.$minuteValue$delegate
            r12.mo14918M(r14)
            boolean r5 = r12.mo15006n0(r3)
            boolean r6 = r12.mo15006n0(r4)
            r5 = r5 | r6
            java.lang.Object r6 = r44.mo14921N()
            if (r5 != 0) goto L_0x016c
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x0174
        L_0x016c:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1 r6 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$5$1
            r6.<init>(r3, r4)
            r12.mo14893C(r6)
        L_0x0174:
            r44.mo15002m0()
            r3 = r6
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.material3.TimePickerState r4 = r0.$state
            int r5 = r15.mo12785b()
            int r29 = r16.mo47280c()
            int r28 = r24.mo47155g()
            androidx.compose.foundation.text.m r6 = new androidx.compose.foundation.text.m
            r26 = 0
            r27 = 0
            r30 = 3
            r31 = 0
            r25 = r6
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r35 = 0
            r36 = 0
            androidx.compose.material3.TimePickerState r7 = r0.$state
            r8 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r8)
            boolean r8 = r12.mo15006n0(r7)
            java.lang.Object r9 = r44.mo14921N()
            if (r8 != 0) goto L_0x01b5
            androidx.compose.runtime.o$a r8 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r8.mo16277a()
            if (r9 != r8) goto L_0x01bd
        L_0x01b5:
            androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$6$1 r9 = new androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$6$1
            r9.<init>(r7)
            r12.mo14893C(r9)
        L_0x01bd:
            r44.mo15002m0()
            r37 = r9
            kotlin.jvm.functions.l r37 = (kotlin.jvm.functions.C11300l) r37
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 59
            r42 = 0
            androidx.compose.foundation.text.k r7 = new androidx.compose.foundation.text.k
            r34 = r7
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42)
            androidx.compose.material3.h3 r8 = r0.$colors
            int r9 = r0.$$dirty
            int r10 = r9 << 3
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            int r9 = r9 << 18
            r9 = r9 & r17
            r10 = r10 | r9
            r11 = 0
            r9 = r44
            androidx.compose.material3.TimePickerKt.m26769s(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01f3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
