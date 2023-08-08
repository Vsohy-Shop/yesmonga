package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1983k;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwitchKt$Switch$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ float $minBound;
    final /* synthetic */ Animatable<Float, C1983k> $offset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2(Animatable<Float, C1983k> animatable, float f) {
        super(0);
        this.$offset = animatable;
        this.$minBound = f;
    }

    public final void invoke() {
        Animatable.m7935E(this.$offset, Float.valueOf(this.$minBound), (Object) null, 2, (Object) null);
    }
}
