package kotlinx.serialization.internal;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.descriptors.C12227i;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "Lkotlinx/serialization/descriptors/f;", "a", "()[Lkotlinx/serialization/descriptors/f;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class EnumDescriptor$elementDescriptors$2 extends Lambda implements C11289a<C12217f[]> {
    final /* synthetic */ int $elementsCount;
    final /* synthetic */ String $name;
    final /* synthetic */ EnumDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumDescriptor$elementDescriptors$2(int i, String str, EnumDescriptor enumDescriptor) {
        super(0);
        this.$elementsCount = i;
        this.$name = str;
        this.this$0 = enumDescriptor;
    }

    @C12579k
    /* renamed from: a */
    public final C12217f[] invoke() {
        int i = this.$elementsCount;
        C12217f[] fVarArr = new C12217f[i];
        for (int i2 = 0; i2 < i; i2++) {
            fVarArr[i2] = SerialDescriptorsKt.m48846f(this.$name + '.' + this.this$0.mo24824e(i2), C12227i.C12231d.f30014a, new C12217f[0], (C11300l) null, 8, (Object) null);
        }
        return fVarArr;
    }
}
