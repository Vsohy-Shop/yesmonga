package kotlin.sequences;

import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "Lkotlin/sequences/m;", "it", "", "a", "(Lkotlin/sequences/m;)Ljava/util/Iterator;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements C11300l<C11559m<? extends T>, Iterator<? extends T>> {

    /* renamed from: f */
    public static final SequencesKt__SequencesKt$flatten$1 f28666f = new SequencesKt__SequencesKt$flatten$1();

    public SequencesKt__SequencesKt$flatten$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Iterator<T> invoke(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "it");
        return mVar.iterator();
    }
}
