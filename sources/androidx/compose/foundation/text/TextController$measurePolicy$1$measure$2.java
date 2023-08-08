package androidx.compose.foundation.text;

import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/layout/w0$a;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/layout/w0$a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1$measure$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n33#2,6:703\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1$measure$2\n*L\n378#1:703,6\n*E\n"})
public final class TextController$measurePolicy$1$measure$2 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<Pair<C15611w0, C16494m>> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$measurePolicy$1$measure$2(List<? extends Pair<? extends C15611w0, C16494m>> list) {
        super(1);
        this.$placeables = list;
    }

    /* renamed from: a */
    public final void mo9356a(@C12579k C15611w0.C15612a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        List<Pair<C15611w0, C16494m>> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = list.get(i);
            C15611w0.C15612a.m69413r(aVar, (C15611w0) pair.mo21846a(), ((C16494m) pair.mo21847b()).mo47856w(), 0.0f, 2, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9356a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
