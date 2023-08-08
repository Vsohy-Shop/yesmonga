package kotlinx.serialization.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.C12201a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "T", "Lkotlinx/serialization/descriptors/f;", "a", "()Lkotlinx/serialization/descriptors/f;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class ObjectSerializer$descriptor$2 extends Lambda implements C11289a<C12217f> {
    final /* synthetic */ String $serialName;
    final /* synthetic */ ObjectSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObjectSerializer$descriptor$2(String str, ObjectSerializer<T> objectSerializer) {
        super(0);
        this.$serialName = str;
        this.this$0 = objectSerializer;
    }

    @C12579k
    /* renamed from: a */
    public final C12217f invoke() {
        final ObjectSerializer<T> objectSerializer = this.this$0;
        return SerialDescriptorsKt.m48845e(this.$serialName, C12227i.C12231d.f30014a, new C12217f[0], new C11300l<C12201a, C11079d2>() {
            /* renamed from: a */
            public final void mo24961a(@C12579k C12201a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$buildSerialDescriptor");
                aVar.mo24847l(objectSerializer.f30032b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo24961a((C12201a) obj);
                return C11079d2.f28267a;
            }
        });
    }
}
