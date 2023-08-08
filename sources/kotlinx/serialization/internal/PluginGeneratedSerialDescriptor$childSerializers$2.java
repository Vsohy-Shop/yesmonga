package kotlinx.serialization.internal;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.C12248g;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "Lkotlinx/serialization/g;", "a", "()[Lkotlinx/serialization/g;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class PluginGeneratedSerialDescriptor$childSerializers$2 extends Lambda implements C11289a<C12248g<?>[]> {
    final /* synthetic */ PluginGeneratedSerialDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$childSerializers$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.this$0 = pluginGeneratedSerialDescriptor;
    }

    @C12579k
    /* renamed from: a */
    public final C12248g<?>[] invoke() {
        C12327y j = this.this$0.f30036b;
        C12248g<?>[] childSerializers = j == null ? null : j.childSerializers();
        return childSerializers == null ? C12268e1.f30058a : childSerializers;
    }
}
