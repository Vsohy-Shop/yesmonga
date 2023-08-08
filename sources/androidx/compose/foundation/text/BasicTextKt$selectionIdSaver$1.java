package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2837n;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "", "it", "a", "(Landroidx/compose/runtime/saveable/f;J)Ljava/lang/Long;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BasicTextKt$selectionIdSaver$1 extends Lambda implements C11304p<C8629f, Long, Long> {
    final /* synthetic */ C2837n $selectionRegistrar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(C2837n nVar) {
        super(2);
        this.$selectionRegistrar = nVar;
    }

    @C12580l
    /* renamed from: a */
    public final Long mo9240a(@C12579k C8629f fVar, long j) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        if (SelectionRegistrarKt.m12854b(this.$selectionRegistrar, j)) {
            return Long.valueOf(j);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo9240a((C8629f) obj, ((Number) obj2).longValue());
    }
}
