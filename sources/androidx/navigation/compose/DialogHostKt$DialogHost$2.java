package androidx.navigation.compose;

import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class DialogHostKt$DialogHost$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C19714d $dialogNavigator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$2(C19714d dVar, int i) {
        super(2);
        this.$dialogNavigator = dVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        DialogHostKt.m91692a(this.$dialogNavigator, oVar, this.$$changed | 1);
    }
}
