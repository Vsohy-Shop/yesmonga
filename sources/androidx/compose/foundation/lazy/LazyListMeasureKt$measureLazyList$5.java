package androidx.compose.foundation.lazy;

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
@C11363r0({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,515:1\n33#2,6:516\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n*L\n320#1:516,6\n*E\n"})
public final class LazyListMeasureKt$measureLazyList$5 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ C2574r $headerItem;
    final /* synthetic */ List<C2574r> $positionedItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$5(List<C2574r> list, C2574r rVar) {
        super(1);
        this.$positionedItems = list;
        this.$headerItem = rVar;
    }

    /* renamed from: a */
    public final void mo8305a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$invoke");
        List<C2574r> list = this.$positionedItems;
        C2574r rVar = this.$headerItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2574r rVar2 = list.get(i);
            if (rVar2 != rVar) {
                rVar2.mo8830h(aVar);
            }
        }
        C2574r rVar3 = this.$headerItem;
        if (rVar3 != null) {
            rVar3.mo8830h(aVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo8305a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
