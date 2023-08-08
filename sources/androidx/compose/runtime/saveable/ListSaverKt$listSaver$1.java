package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Original", "Saveable", "Landroidx/compose/runtime/saveable/f;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;Ljava/lang/Object;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ListSaverKt$listSaver$1 extends Lambda implements C11304p<C8629f, Original, Object> {
    final /* synthetic */ C11304p<C8629f, Original, List<Saveable>> $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListSaverKt$listSaver$1(C11304p<? super C8629f, ? super Original, ? extends List<? extends Saveable>> pVar) {
        super(2);
        this.$save = pVar;
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12579k C8629f fVar, Original original) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        List invoke = this.$save.invoke(fVar, original);
        int size = invoke.size();
        int i = 0;
        while (i < size) {
            Object obj = invoke.get(i);
            if (obj == null || fVar.mo16389a(obj)) {
                i++;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        Collection collection = invoke;
        if (!collection.isEmpty()) {
            return new ArrayList(collection);
        }
        return null;
    }
}
