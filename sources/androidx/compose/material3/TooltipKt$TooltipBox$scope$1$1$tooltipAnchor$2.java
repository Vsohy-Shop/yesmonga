package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ String $longPressLabel;
    final /* synthetic */ C11289a<C11723c2> $onLongPress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2(String str, C11289a<? extends C11723c2> aVar) {
        super(1);
        this.$longPressLabel = str;
        this.$onLongPress = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        String str = this.$longPressLabel;
        final C11289a<C11723c2> aVar = this.$onLongPress;
        SemanticsPropertiesKt.m72019i0(qVar, str, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        });
    }
}
