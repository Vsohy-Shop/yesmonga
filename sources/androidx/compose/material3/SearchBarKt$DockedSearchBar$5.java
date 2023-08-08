package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarKt$DockedSearchBar$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $active;
    final /* synthetic */ C8205g2 $colors;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onActiveChange;
    final /* synthetic */ C11300l<String, C11079d2> $onQueryChange;
    final /* synthetic */ C11300l<String, C11079d2> $onSearch;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $placeholder;
    final /* synthetic */ String $query;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$DockedSearchBar$5(String str, C11300l<? super String, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, boolean z, C11300l<? super Boolean, C11079d2> lVar3, C8767m mVar, boolean z2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C15218g4 g4Var, C8205g2 g2Var, float f, C2243g gVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2, int i3) {
        super(2);
        this.$query = str;
        this.$onQueryChange = lVar;
        this.$onSearch = lVar2;
        this.$active = z;
        this.$onActiveChange = lVar3;
        this.$modifier = mVar;
        this.$enabled = z2;
        this.$placeholder = pVar;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$shape = g4Var;
        this.$colors = g2Var;
        this.$tonalElevation = f;
        this.$interactionSource = gVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        String str = this.$query;
        String str2 = str;
        SearchBarKt.m26089a(str2, this.$onQueryChange, this.$onSearch, this.$active, this.$onActiveChange, this.$modifier, this.$enabled, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, this.$tonalElevation, this.$interactionSource, this.$content, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
