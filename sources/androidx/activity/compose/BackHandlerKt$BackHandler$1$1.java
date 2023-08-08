package androidx.activity.compose;

import androidx.activity.compose.BackHandlerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BackHandlerKt$BackHandler$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ BackHandlerKt.C0220a $backCallback;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt.C0220a aVar, boolean z) {
        super(0);
        this.$backCallback = aVar;
        this.$enabled = z;
    }

    public final void invoke() {
        this.$backCallback.mo970j(this.$enabled);
    }
}
