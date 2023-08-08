package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "state", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2191:1\n33#2,6:2192\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n*L\n1303#1:2192,6\n*E\n"})
public final class GlobalSnapshot$1$1$1 extends Lambda implements C11300l<Object, C11079d2> {
    final /* synthetic */ List<C11300l<Object, C11079d2>> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$1$1$1(List<C11300l<Object, C11079d2>> list) {
        super(1);
        this.$it = list;
    }

    /* renamed from: a */
    public final void mo16419a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "state");
        List<C11300l<Object, C11079d2>> list = this.$it;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).invoke(obj);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16419a(obj);
        return C11079d2.f28267a;
    }
}
