package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.text.input.C16275a1;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBarInputField$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class SearchBarKt$SearchBarInputField$5 extends Lambda implements C11305q<C11304p<? super C8592o, ? super Integer, ? extends C11079d2>, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C8189d3 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBarInputField$5(String str, boolean z, C2243g gVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C8189d3 d3Var, int i, int i2) {
        super(3);
        this.$query = str;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$placeholder = pVar;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$colors = d3Var;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public final void mo11835a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8552a aVar;
        C8552a aVar2;
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
                ComposerKt.m29845w0(584727264, i2, -1, "androidx.compose.material3.SearchBarInputField.<anonymous> (SearchBar.kt:468)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f19839a;
            String str = this.$query;
            boolean z = this.$enabled;
            C16275a1 a = C16275a1.f40457a.mo47161a();
            C2243g gVar = this.$interactionSource;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$placeholder;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$leadingIcon;
            if (pVar4 != null) {
                aVar = C8553b.m31048b(oVar2, -967380630, true, new SearchBarKt$SearchBarInputField$5$1$1(pVar4));
            } else {
                aVar = null;
            }
            C11304p<C8592o, Integer, C11079d2> pVar5 = this.$trailingIcon;
            if (pVar5 != null) {
                aVar2 = C8553b.m31048b(oVar2, -2117865162, true, new SearchBarKt$SearchBarInputField$5$2$1(pVar5));
            } else {
                aVar2 = null;
            }
            C15218g4 f = C8211h2.f20155a.mo12633f(oVar2, 6);
            C8189d3 d3Var = this.$colors;
            C2366i0 m = TextFieldDefaults.m26597m(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null);
            C11304p<C8592o, Integer, C11079d2> a2 = ComposableSingletons$SearchBarKt.f19279a.mo11318a();
            int i4 = this.$$dirty;
            int i5 = this.$$dirty1;
            textFieldDefaults.mo12181b(str, pVar, z, true, a, gVar, false, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, pVar3, aVar, aVar2, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, f, d3Var, m, a2, oVar, ((i2 << 3) & 112) | (i4 & 14) | 27648 | ((i4 >> 12) & 896) | ((i5 << 12) & 458752) | ((i4 << 3) & 234881024), ((i5 << 15) & 458752) | 113246208, 14528);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11835a((C11304p) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
