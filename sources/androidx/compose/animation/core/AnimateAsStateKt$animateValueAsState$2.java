package androidx.compose.animation.core;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C11744g;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AnimateAsStateKt$animateValueAsState$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11744g<T> $channel;
    final /* synthetic */ T $targetValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(C11744g<T> gVar, T t) {
        super(0);
        this.$channel = gVar;
        this.$targetValue = t;
    }

    public final void invoke() {
        this.$channel.mo23751L(this.$targetValue);
    }
}
