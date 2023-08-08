package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.C2776k;
import androidx.compose.foundation.text.C2779m;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.input.C16273a0;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import java.util.Locale;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,358:1\n36#2:359\n50#2:366\n49#2:367\n36#2:374\n36#2:382\n1114#3,6:360\n1114#3,6:368\n1114#3,6:375\n1114#3,6:383\n154#4:381\n154#4:392\n154#4:393\n154#4:394\n154#4:395\n76#5:389\n102#5,2:390\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n56#1:359\n62#1:366\n62#1:367\n88#1:374\n167#1:382\n56#1:360,6\n62#1:368,6\n88#1:375,6\n167#1:383,6\n162#1:381\n350#1:392\n351#1:393\n352#1:394\n357#1:395\n111#1:389\n111#1:390,2\n*E\n"})
public final class DateInputKt {
    @C12579k

    /* renamed from: a */
    public static final C2366i0 f19300a;

    /* renamed from: b */
    public static final float f19301b = C16483g.m74435M((float) 16);

    static {
        float f = (float) 24;
        f19300a = PaddingKt.m10018e(C16483g.m74435M(f), C16483g.m74435M((float) 10), C16483g.m74435M(f), 0.0f, 8, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.material3.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25560a(@org.jetbrains.annotations.C12579k androidx.compose.material3.StateData r20, @org.jetbrains.annotations.C12579k androidx.compose.material3.C8186d0 r21, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Long, java.lang.Boolean> r22, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r23, int r24) {
        /*
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r24
            java.lang.String r0 = "stateData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "dateFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "dateValidator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 814303288(0x30894838, float:9.988588E-10)
            r1 = r23
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
            goto L_0x0191
        L_0x0064:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0070
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DateInputContent (DateInput.kt:48)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r1, r2)
        L_0x0070:
            r0 = 0
            java.util.Locale r10 = androidx.compose.material3.C8260p.m27433b(r11, r0)
            r8 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r8)
            boolean r0 = r11.mo15006n0(r10)
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x008d
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0098
        L_0x008d:
            androidx.compose.material3.m r0 = r20.mo11987a()
            androidx.compose.material3.a0 r1 = r0.mo12496p(r10)
            r11.mo14893C(r1)
        L_0x0098:
            r11.mo15002m0()
            r7 = r1
            androidx.compose.material3.a0 r7 = (androidx.compose.material3.C8169a0) r7
            androidx.compose.material3.t2$a r16 = androidx.compose.material3.C8284t2.f20507b
            int r0 = r16.mo13058j()
            r6 = 6
            java.lang.String r5 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r6)
            int r0 = r16.mo13062l()
            java.lang.String r17 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r6)
            int r0 = r16.mo13060k()
            java.lang.String r18 = androidx.compose.material3.C8357u2.m29348a(r0, r11, r6)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo14918M(r0)
            boolean r0 = r11.mo15006n0(r7)
            boolean r1 = r11.mo15006n0(r13)
            r0 = r0 | r1
            java.lang.Object r1 = r11.mo14921N()
            if (r0 != 0) goto L_0x00db
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00d7
            goto L_0x00db
        L_0x00d7:
            r14 = r6
            r17 = r7
            goto L_0x00f8
        L_0x00db:
            androidx.compose.material3.b0 r4 = new androidx.compose.material3.b0
            java.lang.String r19 = ""
            r0 = r4
            r1 = r20
            r2 = r7
            r3 = r21
            r13 = r4
            r4 = r22
            r14 = r6
            r6 = r17
            r17 = r7
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.mo14893C(r13)
            r1 = r13
        L_0x00f8:
            r11.mo15002m0()
            r7 = r1
            androidx.compose.material3.b0 r7 = (androidx.compose.material3.C8174b0) r7
            java.lang.String r0 = r17.mo12437f()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r16.mo13064m()
            java.lang.String r1 = androidx.compose.material3.C8357u2.m29348a(r1, r11, r14)
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r3 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r3, r5, r4)
            androidx.compose.foundation.layout.i0 r3 = f19300a
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10023j(r2, r3)
            androidx.compose.material3.DateInputKt$DateInputContent$1 r3 = new androidx.compose.material3.DateInputKt$DateInputContent$1
            r3.<init>(r1, r0)
            r1 = -438341159(0xffffffffe5df71d9, float:-1.3189848E23)
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r1, r5, r3)
            androidx.compose.material3.DateInputKt$DateInputContent$2 r3 = new androidx.compose.material3.DateInputKt$DateInputContent$2
            r3.<init>(r0)
            r0 = 1914447672(0x721c2738, float:3.0929327E30)
            androidx.compose.runtime.internal.a r3 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r0, r5, r3)
            androidx.compose.runtime.z0 r0 = r20.mo11993g()
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            androidx.compose.material3.l r4 = (androidx.compose.material3.C8238l) r4
            r0 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r0)
            boolean r0 = r11.mo15006n0(r12)
            java.lang.Object r5 = r11.mo14921N()
            if (r0 != 0) goto L_0x015f
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r5 != r0) goto L_0x0167
        L_0x015f:
            androidx.compose.material3.DateInputKt$DateInputContent$3$1 r5 = new androidx.compose.material3.DateInputKt$DateInputContent$3$1
            r5.<init>(r12)
            r11.mo14893C(r5)
        L_0x0167:
            r11.mo15002m0()
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5
            androidx.compose.material3.b1$a r0 = androidx.compose.material3.C8175b1.f20002b
            int r6 = r0.mo12463b()
            int r0 = r9 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r8 = 1075315126(0x401801b6, float:2.3751044)
            r13 = r0 | r8
            r0 = r2
            r2 = r3
            r3 = r20
            r8 = r17
            r9 = r10
            r10 = r11
            r14 = r11
            r11 = r13
            m25561b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0191:
            androidx.compose.runtime.t1 r0 = r14.mo15020s()
            if (r0 != 0) goto L_0x0198
            goto L_0x01a4
        L_0x0198:
            androidx.compose.material3.DateInputKt$DateInputContent$4 r1 = new androidx.compose.material3.DateInputKt$DateInputContent$4
            r2 = r21
            r3 = r22
            r1.<init>(r12, r2, r3, r15)
            r0.mo15202a(r1)
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt.m25560a(androidx.compose.material3.StateData, androidx.compose.material3.d0, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_]]")
    /* renamed from: b */
    public static final void m25561b(@C12579k C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12579k StateData stateData, @C12580l C8238l lVar, @C12579k C11300l<? super C8238l, C11079d2> lVar2, int i, @C12579k C8174b0 b0Var, @C12579k C8169a0 a0Var, @C12579k Locale locale, @C12580l C8592o oVar, int i2) {
        float f;
        StateData stateData2 = stateData;
        C8169a0 a0Var2 = a0Var;
        Locale locale2 = locale;
        int i3 = i2;
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        Intrinsics.checkNotNullParameter(stateData2, "stateData");
        Intrinsics.checkNotNullParameter(lVar2, "onDateChanged");
        Intrinsics.checkNotNullParameter(b0Var, "dateInputValidator");
        Intrinsics.checkNotNullParameter(a0Var2, "dateInputFormat");
        Intrinsics.checkNotNullParameter(locale2, "locale");
        C8592o o = oVar.mo15009o(626552973);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(626552973, i3, -1, "androidx.compose.material3.DateInputTextField (DateInput.kt:97)");
        }
        C8592o oVar2 = o;
        C8700z0 z0Var = (C8700z0) RememberSaveableKt.m31343d(new Object[0], (C8628e) null, (String) null, DateInputKt$DateInputTextField$errorText$1.f19303f, oVar2, 3080, 6);
        C8700z0<T> c = RememberSaveableKt.m31342c(new Object[0], TextFieldValue.f40411d.mo47117a(), (String) null, new DateInputKt$DateInputTextField$text$2(stateData2, lVar, a0Var2, locale2), oVar2, 72, 4);
        TextFieldValue c2 = m25562c(c);
        C8592o oVar3 = o;
        DateInputKt$DateInputTextField$1 dateInputKt$DateInputTextField$1 = new DateInputKt$DateInputTextField$1(a0Var, z0Var, lVar2, stateData, b0Var, i, locale, c);
        if (!C11622t.isBlank((CharSequence) z0Var.getValue())) {
            f = C16483g.m74435M((float) 0);
        } else {
            f = f19301b;
        }
        C8767m o2 = PaddingKt.m10028o(mVar, 0.0f, 0.0f, 0.0f, f, 7, (Object) null);
        C8592o oVar4 = oVar3;
        oVar4.mo14918M(1157296644);
        C8700z0 z0Var2 = z0Var;
        boolean n0 = oVar4.mo15006n0(z0Var2);
        Object N = oVar4.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new DateInputKt$DateInputTextField$2$1(z0Var2);
            oVar4.mo14893C(N);
        }
        oVar4.mo15002m0();
        C8767m c3 = SemanticsModifierKt.m71868c(o2, false, (C11300l) N, 1, (Object) null);
        C8552a b = C8553b.m31048b(oVar4, 785795078, true, new DateInputKt$DateInputTextField$3(z0Var2));
        boolean z = !C11622t.isBlank((CharSequence) z0Var2.getValue());
        C8191e0 e0Var = r1;
        C8191e0 e0Var2 = new C8191e0(a0Var2);
        C2779m mVar2 = r3;
        C2779m mVar3 = new C2779m(0, false, C16273a0.f40446b.mo47155g(), C16310p.f40516b.mo47280c(), 1, (DefaultConstructorMarker) null);
        int i4 = i3 << 15;
        OutlinedTextFieldKt.m25993a(c2, dateInputKt$DateInputTextField$1, c3, false, false, (C16361p0) null, pVar, pVar2, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, b, z, e0Var, mVar2, (C2776k) null, true, 0, 0, (C2243g) null, (C15218g4) null, (C8189d3) null, oVar4, (3670016 & i4) | (i4 & 29360128), 12779904, 0, 8195896);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = oVar4.mo15020s();
        if (s != null) {
            DateInputKt$DateInputTextField$4 dateInputKt$DateInputTextField$4 = r0;
            DateInputKt$DateInputTextField$4 dateInputKt$DateInputTextField$42 = new DateInputKt$DateInputTextField$4(mVar, pVar, pVar2, stateData, lVar, lVar2, i, b0Var, a0Var, locale, i2);
            s.mo15202a(dateInputKt$DateInputTextField$4);
        }
    }

    /* renamed from: c */
    public static final TextFieldValue m25562c(C8700z0<TextFieldValue> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: d */
    public static final void m25563d(C8700z0<TextFieldValue> z0Var, TextFieldValue textFieldValue) {
        z0Var.setValue(textFieldValue);
    }

    @C12579k
    /* renamed from: f */
    public static final C2366i0 m25565f() {
        return f19300a;
    }
}
