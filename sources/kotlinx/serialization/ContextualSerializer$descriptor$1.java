package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.C12201a;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "T", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/d2;", "a", "(Lkotlinx/serialization/descriptors/a;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class ContextualSerializer$descriptor$1 extends Lambda implements C11300l<C12201a, C11079d2> {
    final /* synthetic */ ContextualSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextualSerializer$descriptor$1(ContextualSerializer<T> contextualSerializer) {
        super(1);
        this.this$0 = contextualSerializer;
    }

    /* renamed from: a */
    public final void mo24805a(@C12579k C12201a aVar) {
        C12217f descriptor;
        Intrinsics.checkNotNullParameter(aVar, "$this$buildSerialDescriptor");
        C12248g a = this.this$0.f29950b;
        List<Annotation> list = null;
        if (!(a == null || (descriptor = a.getDescriptor()) == null)) {
            list = descriptor.getAnnotations();
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        aVar.mo24847l(list);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24805a((C12201a) obj);
        return C11079d2.f28267a;
    }
}
