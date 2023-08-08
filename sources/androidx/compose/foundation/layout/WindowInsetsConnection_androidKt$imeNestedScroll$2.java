package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {

    /* renamed from: f */
    public static final WindowInsetsConnection_androidKt$imeNestedScroll$2 f6179f = new WindowInsetsConnection_androidKt$imeNestedScroll$2();

    public WindowInsetsConnection_androidKt$imeNestedScroll$2() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7885a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-369978792);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-369978792, i, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:78)");
        }
        C8767m b = NestedScrollModifierKt.m68305b(mVar, WindowInsetsConnection_androidKt.m10173e(WindowInsetsHolder.f6181x.mo7913c(oVar, 8).mo7894h(), C2401q1.f6318b.mo8144e(), oVar, 48), (NestedScrollDispatcher) null, 2, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7885a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
