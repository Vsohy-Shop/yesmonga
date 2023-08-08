package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TabKt$TabBaselineLayout$2$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ Integer $firstBaseline;
    final /* synthetic */ C15611w0 $iconPlaceable;
    final /* synthetic */ Integer $lastBaseline;
    final /* synthetic */ int $tabHeight;
    final /* synthetic */ int $tabWidth;
    final /* synthetic */ C15611w0 $textPlaceable;
    final /* synthetic */ C15568h0 $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$2$measure$1(C15611w0 w0Var, C15611w0 w0Var2, C15568h0 h0Var, int i, int i2, Integer num, Integer num2) {
        super(1);
        this.$textPlaceable = w0Var;
        this.$iconPlaceable = w0Var2;
        this.$this_Layout = h0Var;
        this.$tabWidth = i;
        this.$tabHeight = i2;
        this.$firstBaseline = num;
        this.$lastBaseline = num2;
    }

    /* renamed from: a */
    public final void mo12148a(@C12579k C15611w0.C15612a aVar) {
        C15611w0 w0Var;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        C15611w0 w0Var2 = this.$textPlaceable;
        if (w0Var2 != null && (w0Var = this.$iconPlaceable) != null) {
            C15568h0 h0Var = this.$this_Layout;
            int i = this.$tabWidth;
            int i2 = this.$tabHeight;
            Integer num = this.$firstBaseline;
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Integer num2 = this.$lastBaseline;
            Intrinsics.checkNotNull(num2);
            TabKt.m26566p(aVar, h0Var, w0Var2, w0Var, i, i2, intValue, num2.intValue());
        } else if (w0Var2 != null) {
            TabKt.m26567q(aVar, w0Var2, this.$tabHeight);
        } else {
            C15611w0 w0Var3 = this.$iconPlaceable;
            if (w0Var3 != null) {
                TabKt.m26567q(aVar, w0Var3, this.$tabHeight);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12148a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
