package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nObserverNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverNode.kt\nandroidx/compose/ui/node/ObserverNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* renamed from: androidx.compose.ui.node.z0 */
public final class C15751z0 {
    @C8761g
    /* renamed from: a */
    public static final <T extends C8767m.C8772d & C15749y0> void m70687a(@C12579k T t, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        ModifierNodeOwnerScope L = t.mo17233L();
        if (L == null) {
            L = new ModifierNodeOwnerScope((C15749y0) t);
            t.mo17247d0(L);
        }
        C15681e.m70236q(t).getSnapshotObserver().mo44918i(L, ModifierNodeOwnerScope.f38922b.mo44816a(), aVar);
    }
}
