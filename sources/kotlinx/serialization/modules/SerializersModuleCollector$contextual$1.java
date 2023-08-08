package kotlinx.serialization.modules;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.C12248g;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"", "T", "", "Lkotlinx/serialization/g;", "it", "a", "(Ljava/util/List;)Lkotlinx/serialization/g;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SerializersModuleCollector$contextual$1 extends Lambda implements C11300l<List<? extends C12248g<?>>, C12248g<?>> {
    final /* synthetic */ C12248g<T> $serializer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerializersModuleCollector$contextual$1(C12248g<T> gVar) {
        super(1);
        this.$serializer = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final C12248g<?> invoke(@C12579k List<? extends C12248g<?>> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return this.$serializer;
    }
}
