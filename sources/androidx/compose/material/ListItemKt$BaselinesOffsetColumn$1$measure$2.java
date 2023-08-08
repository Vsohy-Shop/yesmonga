package androidx.compose.material;

import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$measure$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,429:1\n69#2,6:430\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$measure$2\n*L\n375#1:430,6\n*E\n"})
public final class ListItemKt$BaselinesOffsetColumn$1$measure$2 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<C15611w0> $placeables;

    /* renamed from: $y */
    final /* synthetic */ Integer[] f7691$y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$BaselinesOffsetColumn$1$measure$2(List<? extends C15611w0> list, Integer[] numArr) {
        super(1);
        this.$placeables = list;
        this.f7691$y = numArr;
    }

    /* renamed from: a */
    public final void mo10231a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        List<C15611w0> list = this.$placeables;
        Integer[] numArr = this.f7691$y;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C15611w0.C15612a.m69414v(aVar, list.get(i), 0, numArr[i].intValue(), 0.0f, 4, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10231a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
