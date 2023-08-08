package androidx.compose.material;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TabRowKt$TabRow$1 extends Lambda implements C11305q<List<? extends C7906r1>, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$1(int i) {
        super(3);
        this.$selectedTabIndex = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo10621a(@C12579k List<C7906r1> list, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(list, "tabPositions");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-553782708, i, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:134)");
        }
        TabRowDefaults tabRowDefaults = TabRowDefaults.f7949a;
        tabRowDefaults.mo10606b(tabRowDefaults.mo10610f(C8767m.f23478j, list.get(this.$selectedTabIndex)), 0.0f, 0, oVar, 3072, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10621a((List) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
