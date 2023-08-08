package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.C2776k;
import androidx.compose.foundation.text.C2779m;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import androidx.profileinstaller.C20022q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldKt$TextField$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $$dirty2;
    final /* synthetic */ C8189d3 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C2776k $keyboardActions;
    final /* synthetic */ C2779m $keyboardOptions;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ C16361p0 $mergedTextStyle;
    final /* synthetic */ int $minLines;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<TextFieldValue, C11079d2> $onValueChange;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $prefix;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $suffix;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $supportingText;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ C16275a1 $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$5(C8767m mVar, C8189d3 d3Var, boolean z, int i, int i2, TextFieldValue textFieldValue, C11300l<? super TextFieldValue, C11079d2> lVar, boolean z2, boolean z3, C16361p0 p0Var, C2779m mVar2, C2776k kVar, boolean z4, int i3, int i4, C16275a1 a1Var, C2243g gVar, int i5, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar5, C11304p<? super C8592o, ? super Integer, C11079d2> pVar6, C11304p<? super C8592o, ? super Integer, C11079d2> pVar7, C15218g4 g4Var) {
        super(2);
        this.$modifier = mVar;
        this.$colors = d3Var;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$$dirty2 = i2;
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$mergedTextStyle = p0Var;
        this.$keyboardOptions = mVar2;
        this.$keyboardActions = kVar;
        this.$singleLine = z4;
        this.$maxLines = i3;
        this.$minLines = i4;
        this.$visualTransformation = a1Var;
        this.$interactionSource = gVar;
        this.$$dirty = i5;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$prefix = pVar5;
        this.$suffix = pVar6;
        this.$supportingText = pVar7;
        this.$shape = g4Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1163788208, i2, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:341)");
            }
            C8767m mVar = this.$modifier;
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f19839a;
            C8767m g = SizeKt.m10107g(mVar, textFieldDefaults.mo12195t(), textFieldDefaults.mo12194s());
            C15225h4 h4Var = r1;
            C15225h4 h4Var2 = new C15225h4(this.$colors.mo12539c(this.$isError, oVar2, ((this.$$dirty1 >> 9) & 14) | ((this.$$dirty2 >> 3) & 112)).getValue().mo42833M(), (DefaultConstructorMarker) null);
            TextFieldValue textFieldValue = this.$value;
            TextFieldValue textFieldValue2 = textFieldValue;
            final TextFieldValue textFieldValue3 = textFieldValue;
            C11300l<TextFieldValue, C11079d2> lVar = this.$onValueChange;
            boolean z = this.$enabled;
            boolean z2 = z;
            final boolean z3 = z;
            boolean z4 = this.$readOnly;
            C16361p0 p0Var = this.$mergedTextStyle;
            C2779m mVar2 = this.$keyboardOptions;
            C2776k kVar = this.$keyboardActions;
            boolean z5 = this.$singleLine;
            boolean z6 = z5;
            final boolean z7 = z5;
            int i3 = this.$maxLines;
            int i4 = this.$minLines;
            C16275a1 a1Var = this.$visualTransformation;
            C16275a1 a1Var2 = a1Var;
            final C16275a1 a1Var3 = a1Var;
            C2243g gVar = this.$interactionSource;
            TextFieldValue textFieldValue4 = textFieldValue2;
            C8592o oVar3 = oVar2;
            final C2243g gVar2 = gVar;
            C11300l<TextFieldValue, C11079d2> lVar2 = lVar;
            final boolean z8 = this.$isError;
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$label;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$placeholder;
            final C11304p<C8592o, Integer, C11079d2> pVar3 = this.$leadingIcon;
            final C11304p<C8592o, Integer, C11079d2> pVar4 = this.$trailingIcon;
            final C11304p<C8592o, Integer, C11079d2> pVar5 = this.$prefix;
            final C11304p<C8592o, Integer, C11079d2> pVar6 = this.$suffix;
            final C11304p<C8592o, Integer, C11079d2> pVar7 = this.$supportingText;
            final C15218g4 g4Var = this.$shape;
            final C8189d3 d3Var = this.$colors;
            final int i5 = this.$$dirty;
            final int i6 = this.$$dirty1;
            final int i7 = this.$$dirty2;
            C81381 r16 = new C11305q<C11304p<? super C8592o, ? super Integer, ? extends C11079d2>, C8592o, Integer, C11079d2>() {
                @C8540g
                @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                /* renamed from: a */
                public final void mo12237a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
                    int i2;
                    int i3;
                    C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
                    Intrinsics.checkNotNullParameter(pVar2, "innerTextField");
                    C8592o oVar2 = oVar;
                    if ((i & 14) == 0) {
                        if (oVar2.mo14927P(pVar2)) {
                            i3 = 4;
                        } else {
                            i3 = 2;
                        }
                        i2 = i | i3;
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 91) != 18 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1751957978, i2, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:361)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f19839a;
                        String i4 = textFieldValue3.mo47115i();
                        boolean z = z3;
                        boolean z2 = z7;
                        C16275a1 a1Var = a1Var3;
                        C2243g gVar = gVar2;
                        boolean z3 = z8;
                        C11304p<C8592o, Integer, C11079d2> pVar3 = pVar;
                        C11304p<C8592o, Integer, C11079d2> pVar4 = pVar2;
                        C11304p<C8592o, Integer, C11079d2> pVar5 = pVar3;
                        C11304p<C8592o, Integer, C11079d2> pVar6 = pVar4;
                        C11304p<C8592o, Integer, C11079d2> pVar7 = pVar5;
                        int i5 = i2;
                        C11304p<C8592o, Integer, C11079d2> pVar8 = pVar6;
                        C11304p<C8592o, Integer, C11079d2> pVar9 = pVar7;
                        C15218g4 g4Var = g4Var;
                        C8189d3 d3Var = d3Var;
                        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
                        int i6 = i5;
                        String str = i4;
                        int i7 = i6;
                        boolean z4 = z;
                        int i8 = i7;
                        int i9 = ((i6 >> 3) & 896) | ((i5 << 3) & 112) | ((i7 >> 12) & 7168) | (i7 & 57344) | ((i8 << 15) & 458752) | ((i7 << 9) & 3670016) | ((i6 << 3) & 29360128) | ((i6 << 3) & 234881024) | ((i6 << 3) & 1879048192);
                        int i10 = ((i6 >> 27) & 14) | 100663296 | ((i7 << 3) & 112) | ((i7 << 3) & 896) | ((i7 << 3) & 7168) | ((i8 << 9) & 57344) | ((i8 << 9) & 458752);
                        textFieldDefaults2.mo12181b(str, pVar, z4, z2, a1Var, gVar, z3, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, g4Var, d3Var, (C2366i0) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, oVar, i9, i10, C20022q.C20025c.f51280k);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo12237a((C11304p) obj, (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }
            };
            C8767m mVar3 = g;
            C8552a b = C8553b.m31048b(oVar3, 1751957978, true, r16);
            int i8 = this.$$dirty;
            int i9 = this.$$dirty1;
            int i10 = (i8 & 57344) | (i8 & 14) | (i8 & 112) | (i8 & 7168) | ((i9 << 3) & 3670016) | ((i9 << 3) & 29360128) | ((i9 << 3) & 234881024) | ((i9 << 3) & 1879048192);
            int i11 = ((i9 >> 27) & 14) | C20022q.C20025c.f51280k | ((i9 >> 9) & 112) | ((this.$$dirty2 << 9) & 7168);
            C8767m mVar4 = mVar3;
            TextFieldValue textFieldValue5 = textFieldValue4;
            C11300l<TextFieldValue, C11079d2> lVar3 = lVar2;
            BasicTextFieldKt.m12188a(textFieldValue5, lVar3, mVar4, z2, z4, p0Var, mVar2, kVar, z6, i3, i4, a1Var2, (C11300l<? super C16260h0, C11079d2>) null, gVar, h4Var, b, oVar, i10, i11, 4096);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
