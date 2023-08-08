package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwitchKt$Switch$valueToOffset$1$1 extends Lambda implements C11300l<Boolean, Float> {
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$valueToOffset$1$1(float f, float f2) {
        super(1);
        this.$maxBound = f;
        this.$minBound = f2;
    }

    @C12579k
    /* renamed from: a */
    public final Float mo12138a(boolean z) {
        return Float.valueOf(z ? this.$maxBound : this.$minBound);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo12138a(((Boolean) obj).booleanValue());
    }
}
