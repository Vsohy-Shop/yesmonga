package androidx.compose.material;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldKt$TextField$2 extends Lambda implements C11305q<C11304p<? super C8592o, ? super Integer, ? extends C11079d2>, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C7930s1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ C16275a1 $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$2(String str, boolean z, boolean z2, C16275a1 a1Var, C2243g gVar, boolean z3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C7930s1 s1Var, int i, int i2) {
        super(3);
        this.$value = str;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = a1Var;
        this.$interactionSource = gVar;
        this.$isError = z3;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$colors = s1Var;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public final void mo10663a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
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
                ComposerKt.m29845w0(989834338, i2, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:209)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f7961a;
            String str = this.$value;
            boolean z = this.$enabled;
            boolean z2 = this.$singleLine;
            C16275a1 a1Var = this.$visualTransformation;
            C2243g gVar = this.$interactionSource;
            boolean z3 = this.$isError;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$label;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$placeholder;
            C11304p<C8592o, Integer, C11079d2> pVar5 = this.$leadingIcon;
            C11304p<C8592o, Integer, C11079d2> pVar6 = this.$trailingIcon;
            C7930s1 s1Var = this.$colors;
            int i4 = i2;
            int i5 = this.$$dirty;
            int i6 = this.$$dirty1;
            textFieldDefaults.mo10629c(str, pVar, z, z2, a1Var, gVar, z3, pVar3, pVar4, pVar5, pVar6, s1Var, (C2366i0) null, oVar, ((i6 >> 3) & 7168) | (i5 & 14) | ((i4 << 3) & 112) | ((i5 >> 3) & 896) | ((i6 << 9) & 57344) | ((i6 >> 6) & 458752) | ((i6 << 18) & 3670016) | ((i5 << 3) & 29360128) | ((i5 << 3) & 234881024) | ((i5 << 3) & 1879048192), ((i5 >> 27) & 14) | 3072 | ((i6 >> 24) & 112), 4096);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10663a((C11304p) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
