package androidx.compose.material3;

import androidx.compose.foundation.layout.C2358f1;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,746:1\n51#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n*L\n214#1:747\n*E\n"})
public final class SearchBarKt$SearchBar$topPadding$1$1 extends Lambda implements C11289a<C16483g> {
    final /* synthetic */ C16479d $density;
    final /* synthetic */ C8240l1 $unconsumedInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$topPadding$1$1(C8240l1 l1Var, C16479d dVar) {
        super(0);
        this.$unconsumedInsets = l1Var;
        this.$density = dVar;
    }

    /* renamed from: a */
    public final float mo11831a() {
        return C16483g.m74435M(SearchBarKt.m26103o() + C2358f1.m10395h(this.$unconsumedInsets, this.$density).mo8093d());
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C16483g.m74451w(mo11831a());
    }
}
