package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapshotStateList$retainAll$1 extends Lambda implements C11300l<List<T>, Boolean> {
    final /* synthetic */ Collection<T> $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateList$retainAll$1(Collection<? extends T> collection) {
        super(1);
        this.$elements = collection;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return Boolean.valueOf(list.retainAll(this.$elements));
    }
}
