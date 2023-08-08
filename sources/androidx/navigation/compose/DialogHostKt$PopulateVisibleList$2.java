package androidx.navigation.compose;

import androidx.compose.runtime.C8592o;
import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class DialogHostKt$PopulateVisibleList$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;
    final /* synthetic */ Collection<NavBackStackEntry> $transitionsInProgress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$2(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, int i) {
        super(2);
        this.$this_PopulateVisibleList = list;
        this.$transitionsInProgress = collection;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DialogHostKt.m91694c(this.$this_PopulateVisibleList, this.$transitionsInProgress, oVar, this.$$changed | 1);
    }
}
