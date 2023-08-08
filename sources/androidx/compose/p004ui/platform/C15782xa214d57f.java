package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Lkotlin/Pair;", "Landroidx/compose/ui/geometry/i;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "it", "", "a", "(Lkotlin/Pair;)Ljava/lang/Comparable;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$1 */
public final class C15782xa214d57f extends Lambda implements C11300l<Pair<? extends C15098i, ? extends List<SemanticsNode>>, Comparable<?>> {

    /* renamed from: f */
    public static final C15782xa214d57f f39264f = new C15782xa214d57f();

    public C15782xa214d57f() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final Comparable<?> invoke(@C12579k Pair<C15098i, ? extends List<SemanticsNode>> pair) {
        Intrinsics.checkNotNullParameter(pair, "it");
        return Float.valueOf(pair.mo21849e().mo42249B());
    }
}
