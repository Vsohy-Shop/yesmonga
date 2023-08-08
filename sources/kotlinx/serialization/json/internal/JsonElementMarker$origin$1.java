package kotlinx.serialization.json.internal;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements C11304p<C12217f, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    @C12579k
    /* renamed from: d */
    public final Boolean mo25397d(@C12579k C12217f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).mo25396e(fVar, i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo25397d((C12217f) obj, ((Number) obj2).intValue());
    }
}
