package kotlinx.serialization.json.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "Lkotlinx/serialization/json/k;", "it", "Lkotlin/d2;", "a", "(Lkotlinx/serialization/json/k;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class TreeJsonEncoderKt$writeJson$encoder$1 extends Lambda implements C11300l<C12403k, C11079d2> {
    final /* synthetic */ Ref.ObjectRef<C12403k> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TreeJsonEncoderKt$writeJson$encoder$1(Ref.ObjectRef<C12403k> objectRef) {
        super(1);
        this.$result = objectRef;
    }

    /* renamed from: a */
    public final void mo25413a(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "it");
        this.$result.element = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo25413a((C12403k) obj);
        return C11079d2.f28267a;
    }
}
