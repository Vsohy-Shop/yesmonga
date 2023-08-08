package kotlinx.serialization.json;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.C12201a;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/d2;", "a", "(Lkotlinx/serialization/descriptors/a;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class JsonElementSerializer$descriptor$1 extends Lambda implements C11300l<C12201a, C11079d2> {

    /* renamed from: f */
    public static final JsonElementSerializer$descriptor$1 f30163f = new JsonElementSerializer$descriptor$1();

    public JsonElementSerializer$descriptor$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo25225a(@C12579k C12201a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$buildSerialDescriptor");
        C12201a aVar2 = aVar;
        C12201a.m48861b(aVar2, "JsonPrimitive", C12407n.m50191f(C123351.f30164f), (List) null, false, 12, (Object) null);
        C12201a.m48861b(aVar2, "JsonNull", C12407n.m50191f(C123362.f30165f), (List) null, false, 12, (Object) null);
        C12201a.m48861b(aVar2, "JsonLiteral", C12407n.m50191f(C123373.f30166f), (List) null, false, 12, (Object) null);
        C12201a.m48861b(aVar2, "JsonObject", C12407n.m50191f(C123384.f30167f), (List) null, false, 12, (Object) null);
        C12201a.m48861b(aVar2, "JsonArray", C12407n.m50191f(C123395.f30168f), (List) null, false, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo25225a((C12201a) obj);
        return C11079d2.f28267a;
    }
}
