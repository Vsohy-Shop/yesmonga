package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2837n;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasicTextKt$BasicText$selectableId$1 extends Lambda implements C11289a<Long> {
    final /* synthetic */ C2837n $selectionRegistrar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$selectableId$1(C2837n nVar) {
        super(0);
        this.$selectionRegistrar = nVar;
    }

    @C12579k
    /* renamed from: a */
    public final Long invoke() {
        return Long.valueOf(this.$selectionRegistrar.mo9700a());
    }
}
