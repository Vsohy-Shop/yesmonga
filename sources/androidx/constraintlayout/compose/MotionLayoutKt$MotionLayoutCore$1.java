package androidx.constraintlayout.compose;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C11744g;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class MotionLayoutKt$MotionLayoutCore$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11744g<C16602j> $channel;
    final /* synthetic */ C16602j $targetConstraintSet;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$1(C11744g<C16602j> gVar, C16602j jVar) {
        super(0);
        this.$channel = gVar;
        this.$targetConstraintSet = jVar;
    }

    public final void invoke() {
        this.$channel.mo23751L(this.$targetConstraintSet);
    }
}
