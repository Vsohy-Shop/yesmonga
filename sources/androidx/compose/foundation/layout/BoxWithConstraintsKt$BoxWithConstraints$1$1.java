package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
public final class BoxWithConstraintsKt$BoxWithConstraints$1$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2365i, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C15560f0 $measurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1(C15560f0 f0Var, C11305q<? super C2365i, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$measurePolicy = f0Var;
        this.$content = qVar;
        this.$$dirty = i;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo7705a(@C12579k C15562f1 f1Var, long j) {
        Intrinsics.checkNotNullParameter(f1Var, "$this$SubcomposeLayout");
        return this.$measurePolicy.mo6397a(f1Var, f1Var.mo44296k0(C11079d2.f28267a, C8553b.m31049c(-1945019079, true, new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.$content, new C2370j(f1Var, j, (DefaultConstructorMarker) null), this.$$dirty))), j);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo7705a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}
