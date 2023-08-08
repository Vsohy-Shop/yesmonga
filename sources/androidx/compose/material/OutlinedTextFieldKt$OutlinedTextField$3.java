package androidx.compose.material;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OutlinedTextFieldKt$OutlinedTextField$3 extends Lambda implements C11305q<C11304p<? super C8592o, ? super Integer, ? extends C11079d2>, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C7930s1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ C16275a1 $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$3(String str, boolean z, boolean z2, C16275a1 a1Var, C2243g gVar, boolean z3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C7930s1 s1Var, int i, int i2, C15218g4 g4Var) {
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
        this.$shape = g4Var;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public final void mo10317a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(pVar2, "innerTextField");
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
                ComposerKt.m29845w0(1710364390, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:190)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f7961a;
            String str = this.$value;
            boolean z = this.$enabled;
            boolean z2 = z;
            boolean z3 = this.$singleLine;
            C16275a1 a1Var = this.$visualTransformation;
            C2243g gVar = this.$interactionSource;
            C2243g gVar2 = gVar;
            boolean z4 = this.$isError;
            boolean z5 = z4;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$label;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$placeholder;
            final boolean z6 = z4;
            C11304p<C8592o, Integer, C11079d2> pVar5 = this.$leadingIcon;
            final C2243g gVar3 = gVar;
            C11304p<C8592o, Integer, C11079d2> pVar6 = this.$trailingIcon;
            C7930s1 s1Var = this.$colors;
            final boolean z7 = z;
            C7930s1 s1Var2 = s1Var;
            TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
            C15218g4 g4Var = this.$shape;
            String str2 = str;
            final C7930s1 s1Var3 = s1Var;
            final C15218g4 g4Var2 = g4Var;
            final int i4 = this.$$dirty;
            final int i5 = this.$$dirty1;
            C8552a b = C8553b.m31048b(oVar2, -1823843281, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1823843281, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:204)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f7961a;
                        boolean z = z7;
                        boolean z2 = z6;
                        C2243g gVar = gVar3;
                        C7930s1 s1Var = s1Var3;
                        C15218g4 g4Var = g4Var2;
                        int i3 = i5;
                        textFieldDefaults.mo10627a(z, z2, gVar, s1Var, g4Var, 0.0f, 0.0f, oVar, ((i4 >> 9) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 15) & 896) | ((i3 >> 18) & 7168) | ((i3 >> 12) & 57344), 96);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            });
            int i6 = this.$$dirty;
            int i7 = this.$$dirty1;
            int i8 = (i6 & 14) | ((i2 << 3) & 112) | ((i6 >> 3) & 896) | ((i7 >> 3) & 7168) | ((i7 << 9) & 57344) | ((i7 >> 6) & 458752) | ((i7 << 18) & 3670016) | ((i6 << 3) & 29360128) | ((i6 << 3) & 234881024) | ((i6 << 3) & 1879048192);
            int i9 = ((i6 >> 27) & 14) | 27648 | ((i7 >> 24) & 112);
            textFieldDefaults2.mo10628b(str2, pVar, z2, z3, a1Var, gVar2, z5, pVar3, pVar4, pVar5, pVar6, s1Var2, (C2366i0) null, b, oVar, i8, i9, 4096);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10317a((C11304p) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
