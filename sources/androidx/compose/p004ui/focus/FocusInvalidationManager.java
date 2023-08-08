package androidx.compose.p004ui.focus;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.FocusInvalidationManager */
public final class FocusInvalidationManager {
    @C12579k

    /* renamed from: a */
    public final C11300l<C11289a<C11079d2>, C11079d2> f37174a;
    @C12579k

    /* renamed from: b */
    public Set<FocusTargetModifierNode> f37175b = new LinkedHashSet();
    @C12579k

    /* renamed from: c */
    public Set<C15064g> f37176c = new LinkedHashSet();
    @C12579k

    /* renamed from: d */
    public Set<C15078r> f37177d = new LinkedHashSet();
    @C12579k

    /* renamed from: e */
    public final C11289a<C11079d2> f37178e = new FocusInvalidationManager$invalidateNodes$1(this);

    public FocusInvalidationManager(@C12579k C11300l<? super C11289a<C11079d2>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onRequestApplyChangesListener");
        this.f37174a = lVar;
    }

    /* renamed from: d */
    public final void mo42067d(@C12579k C15064g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "node");
        mo42070g(this.f37176c, gVar);
    }

    /* renamed from: e */
    public final void mo42068e(@C12579k C15078r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "node");
        mo42070g(this.f37177d, rVar);
    }

    /* renamed from: f */
    public final void mo42069f(@C12579k FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "node");
        mo42070g(this.f37175b, focusTargetModifierNode);
    }

    /* renamed from: g */
    public final <T> void mo42070g(Set<T> set, T t) {
        if (!set.contains(t)) {
            set.add(t);
            if (this.f37175b.size() + this.f37176c.size() + this.f37177d.size() == 1) {
                this.f37174a.invoke(this.f37178e);
            }
        }
    }
}
