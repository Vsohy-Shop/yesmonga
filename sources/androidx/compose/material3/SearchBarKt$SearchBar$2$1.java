package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2358f1;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarKt$SearchBar$2$1 extends Lambda implements C11300l<C2354e1, C11079d2> {
    final /* synthetic */ C8240l1 $unconsumedInsets;
    final /* synthetic */ C2354e1 $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$2$1(C8240l1 l1Var, C2354e1 e1Var) {
        super(1);
        this.$unconsumedInsets = l1Var;
        this.$windowInsets = e1Var;
    }

    /* renamed from: a */
    public final void mo11823a(@C12579k C2354e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "consumedInsets");
        this.$unconsumedInsets.mo12778f(C2358f1.m10396i(this.$windowInsets, e1Var));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11823a((C2354e1) obj);
        return C11079d2.f28267a;
    }
}
