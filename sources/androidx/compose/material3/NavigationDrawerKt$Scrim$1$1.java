package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NavigationDrawerKt$Scrim$1$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ long $color;
    final /* synthetic */ C11289a<Float> $fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$1$1(long j, C11289a<Float> aVar) {
        super(1);
        this.$color = j;
        this.$fraction = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        C15187e.m65710e5(eVar, this.$color, 0, 0, this.$fraction.invoke().floatValue(), (C15192h) null, (C15249k2) null, 0, 118, (Object) null);
    }
}
