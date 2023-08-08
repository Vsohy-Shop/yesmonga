package kotlin.sequences;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2 extends FunctionReferenceImpl implements C11300l<C11559m<? extends R>, Iterator<? extends R>> {

    /* renamed from: a */
    public static final SequencesKt___SequencesKt$flatMapIndexed$2 f28682a = new SequencesKt___SequencesKt$flatMapIndexed$2();

    public SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, C11559m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @C12579k
    /* renamed from: d */
    public final Iterator<R> invoke(@C12579k C11559m<? extends R> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "p0");
        return mVar.iterator();
    }
}
