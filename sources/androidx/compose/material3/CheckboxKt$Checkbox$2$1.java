package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckboxKt$Checkbox$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onCheckedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$2$1(C11300l<? super Boolean, C11079d2> lVar, boolean z) {
        super(0);
        this.$onCheckedChange = lVar;
        this.$checked = z;
    }

    public final void invoke() {
        this.$onCheckedChange.invoke(Boolean.valueOf(!this.$checked));
    }
}
