package kotlinx.serialization.internal;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.C12201a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "T", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/d2;", "a", "(Lkotlinx/serialization/descriptors/a;)V"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class EnumSerializer$descriptor$1 extends Lambda implements C11300l<C12201a, C11079d2> {
    final /* synthetic */ String $serialName;
    final /* synthetic */ EnumSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumSerializer$descriptor$1(EnumSerializer<T> enumSerializer, String str) {
        super(1);
        this.this$0 = enumSerializer;
        this.$serialName = str;
    }

    /* renamed from: a */
    public final void mo24943a(@C12579k C12201a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$this$buildSerialDescriptor");
        Enum[] a = this.this$0.f30026a;
        String str = this.$serialName;
        for (Enum enumR : a) {
            C12201a.m48861b(aVar, enumR.name(), SerialDescriptorsKt.m48846f(str + '.' + enumR.name(), C12227i.C12231d.f30014a, new C12217f[0], (C11300l) null, 8, (Object) null), (List) null, false, 12, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24943a((C12201a) obj);
        return C11079d2.f28267a;
    }
}
