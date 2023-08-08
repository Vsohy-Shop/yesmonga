package androidx.compose.foundation;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MagnifierKt$magnifier$4$isMagnifierShown$2$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8578k2<C15094f> $sourceCenterInRoot$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$isMagnifierShown$2$1(C8578k2<C15094f> k2Var) {
        super(0);
        this.$sourceCenterInRoot$delegate = k2Var;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(C15096g.m64901d(MagnifierKt$magnifier$4.m9000q(this.$sourceCenterInRoot$delegate)));
    }
}
