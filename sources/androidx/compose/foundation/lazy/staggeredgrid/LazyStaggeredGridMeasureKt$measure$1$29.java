package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1097:1\n33#2,6:1098\n33#2,6:1104\n33#2,6:1110\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29\n*L\n781#1:1098,6\n785#1:1104,6\n789#1:1110,6\n*E\n"})
public final class LazyStaggeredGridMeasureKt$measure$1$29 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<C2606n> $extraItemsAfter;
    final /* synthetic */ List<C2606n> $extraItemsBefore;
    final /* synthetic */ List<C2606n> $positionedItems;
    final /* synthetic */ C2601j $this_measure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureKt$measure$1$29(List<C2606n> list, List<C2606n> list2, List<C2606n> list3, C2601j jVar) {
        super(1);
        this.$extraItemsBefore = list;
        this.$positionedItems = list2;
        this.$extraItemsAfter = list3;
        this.$this_measure = jVar;
    }

    /* renamed from: a */
    public final void mo8887a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        List<C2606n> list = this.$extraItemsBefore;
        C2601j jVar = this.$this_measure;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo9002f(aVar, jVar);
        }
        List<C2606n> list2 = this.$positionedItems;
        C2601j jVar2 = this.$this_measure;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            list2.get(i2).mo9002f(aVar, jVar2);
        }
        List<C2606n> list3 = this.$extraItemsAfter;
        C2601j jVar3 = this.$this_measure;
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            list3.get(i3).mo9002f(aVar, jVar3);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo8887a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
