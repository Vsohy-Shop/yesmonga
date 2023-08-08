package kotlin.sequences;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$1 extends FunctionReferenceImpl implements C11300l<Iterable<? extends R>, Iterator<? extends R>> {

    /* renamed from: a */
    public static final SequencesKt___SequencesKt$flatMapIndexed$1 f28681a = new SequencesKt___SequencesKt$flatMapIndexed$1();

    public SequencesKt___SequencesKt$flatMapIndexed$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @C12579k
    /* renamed from: d */
    public final Iterator<R> invoke(@C12579k Iterable<? extends R> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "p0");
        return iterable.iterator();
    }
}
