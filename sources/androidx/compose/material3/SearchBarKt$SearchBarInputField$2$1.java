package androidx.compose.material3;

import androidx.compose.p004ui.focus.C15087z;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SearchBarKt$SearchBarInputField$2$1 extends Lambda implements C11300l<C15087z, C11079d2> {
    final /* synthetic */ C11300l<Boolean, C11079d2> $onActiveChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBarInputField$2$1(C11300l<? super Boolean, C11079d2> lVar) {
        super(1);
        this.$onActiveChange = lVar;
    }

    /* renamed from: a */
    public final void mo11832a(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "it");
        if (zVar.mo42156g()) {
            this.$onActiveChange.invoke(Boolean.TRUE);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11832a((C15087z) obj);
        return C11079d2.f28267a;
    }
}
