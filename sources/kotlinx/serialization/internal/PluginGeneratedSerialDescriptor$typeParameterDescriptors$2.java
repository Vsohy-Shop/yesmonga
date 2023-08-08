package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "Lkotlinx/serialization/descriptors/f;", "a", "()[Lkotlinx/serialization/descriptors/f;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class PluginGeneratedSerialDescriptor$typeParameterDescriptors$2 extends Lambda implements C11289a<C12217f[]> {
    final /* synthetic */ PluginGeneratedSerialDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.this$0 = pluginGeneratedSerialDescriptor;
    }

    @C12579k
    /* renamed from: a */
    public final C12217f[] invoke() {
        C12248g[] typeParametersSerializers;
        C12327y j = this.this$0.f30036b;
        ArrayList arrayList = null;
        if (!(j == null || (typeParametersSerializers = j.typeParametersSerializers()) == null)) {
            arrayList = new ArrayList(typeParametersSerializers.length);
            int length = typeParametersSerializers.length;
            int i = 0;
            while (i < length) {
                C12248g gVar = typeParametersSerializers[i];
                i++;
                arrayList.add(gVar.getDescriptor());
            }
        }
        return C12258b1.m49232e(arrayList);
    }
}
