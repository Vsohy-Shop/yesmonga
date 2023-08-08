package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BackdropScaffoldKt$Scrim$1$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<Float> $alpha$delegate;
    final /* synthetic */ long $color;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$Scrim$1$1(long j, C8578k2<Float> k2Var) {
        super(1);
        this.$color = j;
        this.$alpha$delegate = k2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        C15187e.m65710e5(eVar, this.$color, 0, 0, BackdropScaffoldKt.m13225f(this.$alpha$delegate), (C15192h) null, (C15249k2) null, 0, 118, (Object) null);
    }
}
