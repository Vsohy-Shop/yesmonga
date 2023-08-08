package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "Landroidx/room/AmbiguousColumnResolver$a;", "it", "Lkotlin/d2;", "a", "(Ljava/util/List;)V"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class AmbiguousColumnResolver$resolve$4 extends Lambda implements C11300l<List<? extends AmbiguousColumnResolver.C20232a>, C11079d2> {
    final /* synthetic */ Ref.ObjectRef<AmbiguousColumnResolver.C20234c> $bestSolution;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmbiguousColumnResolver$resolve$4(Ref.ObjectRef<AmbiguousColumnResolver.C20234c> objectRef) {
        super(1);
        this.$bestSolution = objectRef;
    }

    /* renamed from: a */
    public final void mo60746a(@C12579k List<AmbiguousColumnResolver.C20232a> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        T a = AmbiguousColumnResolver.C20234c.f52221d.mo60742a(list);
        if (a.compareTo((AmbiguousColumnResolver.C20234c) this.$bestSolution.element) < 0) {
            this.$bestSolution.element = a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo60746a((List) obj);
        return C11079d2.f28267a;
    }
}
