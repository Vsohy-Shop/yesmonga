package androidx.navigation.compose;

import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.saveable.C8623b;
import androidx.navigation.NavBackStackEntry;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class NavBackStackEntryProviderKt$LocalOwnersProvider$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8623b $saveableStateHolder;
    final /* synthetic */ NavBackStackEntry $this_LocalOwnersProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavBackStackEntryProviderKt$LocalOwnersProvider$2(NavBackStackEntry navBackStackEntry, C8623b bVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$this_LocalOwnersProvider = navBackStackEntry;
        this.$saveableStateHolder = bVar;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NavBackStackEntryProviderKt.m91702a(this.$this_LocalOwnersProvider, this.$saveableStateHolder, this.$content, oVar, this.$$changed | 1);
    }
}
