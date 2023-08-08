package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8418c;
import androidx.compose.runtime.snapshots.C8635a0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "it", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DerivedSnapshotState$currentRecord$result$1$result$1 extends Lambda implements C11300l<Object, C11079d2> {
    final /* synthetic */ int $nestedCalculationLevel;
    final /* synthetic */ C8418c<C8635a0, Integer> $newDependencies;
    final /* synthetic */ DerivedSnapshotState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, C8418c<C8635a0, Integer> cVar, int i) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$newDependencies = cVar;
        this.$nestedCalculationLevel = i;
    }

    /* renamed from: a */
    public final void mo15135a(@C12579k Object obj) {
        int i;
        Intrinsics.checkNotNullParameter(obj, "it");
        if (obj == this.this$0) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        } else if (obj instanceof C8635a0) {
            Object a = C8432d2.f22795a.mo16131a();
            Intrinsics.checkNotNull(a);
            int intValue = ((Number) a).intValue();
            C8418c<C8635a0, Integer> cVar = this.$newDependencies;
            int i2 = intValue - this.$nestedCalculationLevel;
            Integer f = cVar.mo15362f(obj);
            if (f != null) {
                i = f.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            cVar.mo15371o(obj, Integer.valueOf(Math.min(i2, i)));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo15135a(obj);
        return C11079d2.f28267a;
    }
}
