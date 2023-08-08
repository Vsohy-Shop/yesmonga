package androidx.compose.foundation.lazy.layout;

import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LazyLayoutKt$LazyLayout$1$2$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ LazyLayoutItemContentFactory $itemContentFactory;
    final /* synthetic */ C11304p<C2552k, C16476b, C15564g0> $measurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, C11304p<? super C2552k, ? super C16476b, ? extends C15564g0> pVar) {
        super(2);
        this.$itemContentFactory = lazyLayoutItemContentFactory;
        this.$measurePolicy = pVar;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo8691a(@C12579k C15562f1 f1Var, long j) {
        Intrinsics.checkNotNullParameter(f1Var, "$this$null");
        return this.$measurePolicy.invoke(new C2553l(this.$itemContentFactory, f1Var), C16476b.m74348b(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo8691a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}
