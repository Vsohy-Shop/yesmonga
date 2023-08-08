package androidx.navigation.compose;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import androidx.navigation.C19695c0;
import androidx.navigation.C19754h0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class NavHostKt$NavHost$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<C19695c0, C11079d2> $builder;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C19754h0 $navController;
    final /* synthetic */ String $route;
    final /* synthetic */ String $startDestination;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$2(C19754h0 h0Var, String str, C8767m mVar, String str2, C11300l<? super C19695c0, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$navController = h0Var;
        this.$startDestination = str;
        this.$modifier = mVar;
        this.$route = str2;
        this.$builder = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NavHostKt.m91714b(this.$navController, this.$startDestination, this.$modifier, this.$route, this.$builder, oVar, this.$$changed | 1, this.$$default);
    }
}
