package kotlinx.serialization.descriptors;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "", "a", "(I)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SerialDescriptorImpl$toString$1 extends Lambda implements C11300l<Integer, CharSequence> {
    final /* synthetic */ SerialDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$toString$1(SerialDescriptorImpl serialDescriptorImpl) {
        super(1);
        this.this$0 = serialDescriptorImpl;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence mo24836a(int i) {
        return this.this$0.mo24824e(i) + ": " + this.this$0.mo24827g(i).mo24830h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo24836a(((Number) obj).intValue());
    }
}
