package androidx.compose.material;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15598s;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.C16334z0;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.urbanairship.util.C9647e0;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11363r0({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,374:1\n50#2:375\n49#2:376\n1114#3,6:377\n658#4:383\n646#4:384\n658#4:385\n646#4:386\n154#5:387\n154#5:388\n154#5:389\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:375\n81#1:376\n81#1:377,6\n112#1:383\n112#1:384\n115#1:385\n115#1:386\n371#1:387\n372#1:388\n374#1:389\n*E\n"})
public final class TextFieldImplKt {
    @C12579k

    /* renamed from: a */
    public static final String f7970a = "TextField";
    @C12579k

    /* renamed from: b */
    public static final String f7971b = "Hint";
    @C12579k

    /* renamed from: c */
    public static final String f7972c = "Label";
    @C12579k

    /* renamed from: d */
    public static final String f7973d = "Leading";
    @C12579k

    /* renamed from: e */
    public static final String f7974e = "Trailing";

    /* renamed from: f */
    public static final long f7975f = C16478c.m74376a(0, 0, 0, 0);

    /* renamed from: g */
    public static final int f7976g = 150;

    /* renamed from: h */
    public static final int f7977h = 83;

    /* renamed from: i */
    public static final int f7978i = 67;

    /* renamed from: j */
    public static final float f7979j = C16483g.m74435M((float) 16);

    /* renamed from: k */
    public static final float f7980k = C16483g.m74435M((float) 12);
    @C12579k

    /* renamed from: l */
    public static final C8767m f7981l;

    static {
        float f = (float) 48;
        f7981l = SizeKt.m10107g(C8767m.f23478j, C16483g.m74435M(f), C16483g.m74435M(f));
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m14135a(@C12579k TextFieldType textFieldType, @C12579k String str, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12579k C16275a1 a1Var, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, boolean z, boolean z2, boolean z3, @C12579k C2241e eVar, @C12579k C2366i0 i0Var, @C12579k C7930s1 s1Var, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar6, @C12580l C8592o oVar, int i, int i2, int i3) {
        int i4;
        int i5;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar7;
        C8592o oVar2;
        boolean z4;
        boolean z5;
        boolean z6;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar8;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar9;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar10;
        InputPhase inputPhase;
        TextFieldType textFieldType2 = textFieldType;
        String str2 = str;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar11 = pVar;
        C16275a1 a1Var2 = a1Var;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar12 = pVar2;
        C2241e eVar2 = eVar;
        C2366i0 i0Var2 = i0Var;
        C7930s1 s1Var2 = s1Var;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        Intrinsics.checkNotNullParameter(textFieldType2, "type");
        Intrinsics.checkNotNullParameter(str2, "value");
        Intrinsics.checkNotNullParameter(pVar11, "innerTextField");
        Intrinsics.checkNotNullParameter(a1Var2, "visualTransformation");
        Intrinsics.checkNotNullParameter(eVar2, "interactionSource");
        Intrinsics.checkNotNullParameter(i0Var2, "contentPadding");
        Intrinsics.checkNotNullParameter(s1Var2, C9874a.f27063h);
        C8592o o = oVar.mo15009o(-712568069);
        if ((i8 & 1) != 0) {
            i4 = i6 | 6;
        } else if ((i6 & 14) == 0) {
            i4 = (o.mo15006n0(textFieldType2) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        int i9 = 32;
        if ((i8 & 2) != 0) {
            i4 |= 48;
        } else if ((i6 & 112) == 0) {
            i4 |= o.mo15006n0(str2) ? 32 : 16;
        }
        int i10 = 256;
        if ((i8 & 4) != 0) {
            i4 |= C22132b.f56831b;
        } else if ((i6 & 896) == 0) {
            i4 |= o.mo14927P(pVar11) ? 256 : 128;
        }
        int i11 = 2048;
        if ((i8 & 8) != 0) {
            i4 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i4 |= o.mo15006n0(a1Var2) ? 2048 : 1024;
        }
        int i12 = 16384;
        if ((i8 & 16) != 0) {
            i4 |= C12888a.f31808q;
        } else if ((57344 & i6) == 0) {
            i4 |= o.mo14927P(pVar12) ? 16384 : 8192;
        }
        int i13 = i8 & 32;
        if (i13 != 0) {
            i4 |= C20022q.C20025c.f51280k;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar13 = pVar3;
        } else {
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar14 = pVar3;
            if ((i6 & 458752) == 0) {
                i4 |= o.mo14927P(pVar14) ? 131072 : 65536;
            }
        }
        int i14 = i8 & 64;
        if (i14 != 0) {
            i4 |= 1572864;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar15 = pVar4;
        } else {
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar16 = pVar4;
            if ((i6 & 3670016) == 0) {
                i4 |= o.mo14927P(pVar16) ? 1048576 : 524288;
            }
        }
        int i15 = i8 & 128;
        if (i15 != 0) {
            i4 |= 12582912;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar17 = pVar5;
        } else {
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar18 = pVar5;
            if ((i6 & 29360128) == 0) {
                i4 |= o.mo14927P(pVar18) ? 8388608 : 4194304;
            }
        }
        int i16 = i8 & 256;
        if (i16 != 0) {
            i4 |= 100663296;
            boolean z7 = z;
        } else {
            boolean z8 = z;
            if ((i6 & 234881024) == 0) {
                i4 |= o.mo14961b(z8) ? C8698y1.f23302n : C9647e0.f26435a;
            }
        }
        int i17 = i8 & 512;
        if (i17 != 0) {
            i4 |= 805306368;
            boolean z9 = z2;
        } else {
            int i18 = i6 & 1879048192;
            boolean z10 = z2;
            if (i18 == 0) {
                i4 |= o.mo14961b(z10) ? 536870912 : 268435456;
            }
        }
        int i19 = i8 & 1024;
        if (i19 != 0) {
            i5 = i7 | 6;
            boolean z11 = z3;
        } else {
            boolean z12 = z3;
            if ((i7 & 14) == 0) {
                i5 = i7 | (o.mo14961b(z12) ? 4 : 2);
            } else {
                i5 = i7;
            }
        }
        if ((i8 & 2048) != 0) {
            i5 |= 48;
        } else if ((i7 & 112) == 0) {
            if (!o.mo15006n0(eVar2)) {
                i9 = 16;
            }
            i5 |= i9;
        }
        int i20 = i5;
        if ((i8 & 4096) != 0) {
            i20 |= C22132b.f56831b;
        } else if ((i7 & 896) == 0) {
            if (!o.mo15006n0(i0Var2)) {
                i10 = 128;
            }
            i20 |= i10;
        }
        if ((i8 & 8192) != 0) {
            i20 |= 3072;
        } else if ((i7 & 7168) == 0) {
            if (!o.mo15006n0(s1Var2)) {
                i11 = 1024;
            }
            i20 |= i11;
        }
        int i21 = i8 & 16384;
        if (i21 != 0) {
            i20 |= C12888a.f31808q;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar19 = pVar6;
        } else {
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar20 = pVar6;
            if ((i7 & 57344) == 0) {
                if (!o.mo14927P(pVar20)) {
                    i12 = 8192;
                }
                i20 |= i12;
            }
        }
        if ((i4 & 1533916891) == 306783378 && (46811 & i20) == 9362 && o.mo15011p()) {
            o.mo14958a0();
            pVar10 = pVar3;
            pVar9 = pVar4;
            pVar8 = pVar5;
            z6 = z;
            z5 = z2;
            z4 = z3;
            pVar7 = pVar6;
            oVar2 = o;
        } else {
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar21 = i13 != 0 ? null : pVar3;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar22 = i14 != 0 ? null : pVar4;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar23 = i15 != 0 ? null : pVar5;
            boolean z13 = i16 != 0 ? false : z;
            boolean z14 = i17 != 0 ? true : z2;
            boolean z15 = i19 != 0 ? false : z3;
            C11304p<? super C8592o, ? super Integer, C11079d2> pVar24 = i21 != 0 ? null : pVar6;
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-712568069, i4, i20, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(str2) | o.mo15006n0(a1Var2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = a1Var2.mo12556a(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                o.mo14893C(N);
            }
            o.mo15002m0();
            String j = ((C16334z0) N).mo47343b().mo46683j();
            if (FocusInteractionKt.m9673a(eVar2, o, (i20 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                if (j.length() == 0) {
                    inputPhase = InputPhase.UnfocusedEmpty;
                } else {
                    inputPhase = InputPhase.UnfocusedNotEmpty;
                }
            }
            InputPhase inputPhase2 = inputPhase;
            int i22 = i4;
            C8592o oVar3 = o;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(s1Var, z14, z15, eVar, i22, i20);
            C7933t0 t0Var = C7933t0.f19075a;
            C7944w1 c = t0Var.mo11077c(oVar3, 6);
            C16361p0 n = c.mo11101n();
            C16361p0 f = c.mo11092f();
            long r = n.mo47510r();
            C15240j2.C15241a aVar = C15240j2.f37547b;
            C16361p0 p0Var = f;
            boolean z16 = (C15240j2.m66082y(r, aVar.mo42851u()) && !C15240j2.m66082y(p0Var.mo47510r(), aVar.mo42851u())) || (!C15240j2.m66082y(n.mo47510r(), aVar.mo42851u()) && C15240j2.m66082y(p0Var.mo47510r(), aVar.mo42851u()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.f7992a;
            oVar3.mo14918M(2129141006);
            long r2 = t0Var.mo11077c(oVar3, 6).mo11092f().mo47510r();
            if (z16) {
                if (!(r2 != aVar.mo42851u())) {
                    r2 = ((C15240j2) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, oVar3, 0)).mo42833M();
                }
            }
            long j2 = r2;
            oVar3.mo15002m0();
            oVar3.mo14918M(2129141197);
            long r3 = t0Var.mo11077c(oVar3, 6).mo11101n().mo47510r();
            if (z16) {
                if (!(r3 != aVar.mo42851u())) {
                    r3 = ((C15240j2) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, oVar3, 0)).mo42833M();
                }
            }
            long j3 = r3;
            oVar3.mo15002m0();
            boolean z17 = pVar2 != null;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$12 = textFieldImplKt$CommonDecorationBox$labelColor$1;
            TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$3 = r0;
            TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$32 = new TextFieldImplKt$CommonDecorationBox$3(pVar2, pVar21, j, z15, i20, s1Var, z14, eVar, i22, pVar22, pVar23, textFieldType, pVar, z13, i0Var, z16, pVar24);
            oVar2 = oVar3;
            textFieldTransitionScope.mo10677a(inputPhase2, j2, j3, textFieldImplKt$CommonDecorationBox$labelColor$12, z17, C8553b.m31048b(oVar2, 341865432, true, textFieldImplKt$CommonDecorationBox$3), oVar2, 1769472);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            pVar10 = pVar21;
            pVar9 = pVar22;
            pVar8 = pVar23;
            z6 = z13;
            z5 = z14;
            z4 = z15;
            pVar7 = pVar24;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            TextFieldImplKt$CommonDecorationBox$4 textFieldImplKt$CommonDecorationBox$4 = r0;
            TextFieldImplKt$CommonDecorationBox$4 textFieldImplKt$CommonDecorationBox$42 = new TextFieldImplKt$CommonDecorationBox$4(textFieldType, str, pVar, a1Var, pVar2, pVar10, pVar9, pVar8, z6, z5, z4, eVar, i0Var, s1Var, pVar7, i, i2, i3);
            s.mo15202a(textFieldImplKt$CommonDecorationBox$4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8548i(index = 0)
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14136b(long r15, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.text.C16361p0 r17, @org.jetbrains.annotations.C12580l java.lang.Float r18, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21, int r22) {
        /*
            r6 = r19
            r7 = r21
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = -399493340(0xffffffffe8303724, float:-3.3286147E24)
            r1 = r20
            androidx.compose.runtime.o r8 = r1.mo15009o(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r7 | 6
            r9 = r15
            goto L_0x002b
        L_0x001a:
            r1 = r7 & 14
            r9 = r15
            if (r1 != 0) goto L_0x002a
            boolean r1 = r8.mo14980g(r9)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r7
            goto L_0x002b
        L_0x002a:
            r1 = r7
        L_0x002b:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0045
        L_0x0032:
            r3 = r7 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0045
            r3 = r17
            boolean r4 = r8.mo15006n0(r3)
            if (r4 == 0) goto L_0x0041
            r4 = 32
            goto L_0x0043
        L_0x0041:
            r4 = 16
        L_0x0043:
            r1 = r1 | r4
            goto L_0x0047
        L_0x0045:
            r3 = r17
        L_0x0047:
            r4 = r22 & 4
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r5 = r7 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0061
            r5 = r18
            boolean r11 = r8.mo15006n0(r5)
            if (r11 == 0) goto L_0x005d
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r11
            goto L_0x0063
        L_0x0061:
            r5 = r18
        L_0x0063:
            r11 = r22 & 8
            if (r11 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007a
            boolean r11 = r8.mo14927P(r6)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r11
        L_0x007a:
            r11 = r1
            r1 = r11 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r1 != r12) goto L_0x008d
            boolean r1 = r8.mo15011p()
            if (r1 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r8.mo14958a0()
            r4 = r5
            goto L_0x00e5
        L_0x008d:
            r1 = 0
            if (r2 == 0) goto L_0x0092
            r12 = r1
            goto L_0x0093
        L_0x0092:
            r12 = r3
        L_0x0093:
            if (r4 == 0) goto L_0x0097
            r13 = r1
            goto L_0x0098
        L_0x0097:
            r13 = r5
        L_0x0098:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00a4
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Decoration (TextFieldImpl.kt:231)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r11, r1, r2)
        L_0x00a4:
            androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1 r14 = new androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
            r0 = r14
            r1 = r15
            r3 = r13
            r4 = r19
            r5 = r11
            r0.<init>(r1, r3, r4, r5)
            r0 = 494684590(0x1d7c49ae, float:3.3390014E-21)
            r1 = 1
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r8, r0, r1, r14)
            if (r12 == 0) goto L_0x00c9
            r1 = -2009952864(0xffffffff88328da0, float:-5.3731406E-34)
            r8.mo14918M(r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            r1 = r1 | 48
            androidx.compose.material.TextKt.m14194a(r12, r0, r8, r1)
            goto L_0x00d7
        L_0x00c9:
            r1 = -2009952812(0xffffffff88328dd4, float:-5.3731645E-34)
            r8.mo14918M(r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r8, r1)
        L_0x00d7:
            r8.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00e3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e3:
            r3 = r12
            r4 = r13
        L_0x00e5:
            androidx.compose.runtime.t1 r8 = r8.mo15020s()
            if (r8 != 0) goto L_0x00ec
            goto L_0x00fc
        L_0x00ec:
            androidx.compose.material.TextFieldImplKt$Decoration$1 r11 = new androidx.compose.material.TextFieldImplKt$Decoration$1
            r0 = r11
            r1 = r15
            r5 = r19
            r6 = r21
            r7 = r22
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.mo15202a(r11)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m14136b(long, androidx.compose.ui.text.p0, java.lang.Float, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public static final float m14137c() {
        return f7980k;
    }

    @C12579k
    /* renamed from: d */
    public static final C8767m m14138d() {
        return f7981l;
    }

    @C12580l
    /* renamed from: e */
    public static final Object m14139e(@C12579k C15580l lVar) {
        C15598s sVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Object c = lVar.mo44319c();
        if (c instanceof C15598s) {
            sVar = (C15598s) c;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            return sVar.mo44449u();
        }
        return null;
    }

    /* renamed from: f */
    public static final float m14140f() {
        return f7979j;
    }

    /* renamed from: g */
    public static final long m14141g() {
        return f7975f;
    }

    /* renamed from: h */
    public static final int m14142h(@C12580l C15611w0 w0Var) {
        if (w0Var != null) {
            return w0Var.mo44468G0();
        }
        return 0;
    }

    /* renamed from: i */
    public static final int m14143i(@C12580l C15611w0 w0Var) {
        if (w0Var != null) {
            return w0Var.mo44471K0();
        }
        return 0;
    }
}
