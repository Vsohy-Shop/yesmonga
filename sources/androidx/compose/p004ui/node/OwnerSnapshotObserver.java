package androidx.compose.p004ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver */
public final class OwnerSnapshotObserver {
    @C12579k

    /* renamed from: a */
    public final SnapshotStateObserver f38971a;
    @C12579k

    /* renamed from: b */
    public final C11300l<LayoutNode, C11079d2> f38972b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.f38983f;
    @C12579k

    /* renamed from: c */
    public final C11300l<LayoutNode, C11079d2> f38973c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.f38984f;
    @C12579k

    /* renamed from: d */
    public final C11300l<LayoutNode, C11079d2> f38974d = OwnerSnapshotObserver$onCommitAffectingLayout$1.f38979f;
    @C12579k

    /* renamed from: e */
    public final C11300l<LayoutNode, C11079d2> f38975e = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.f38980f;
    @C12579k

    /* renamed from: f */
    public final C11300l<LayoutNode, C11079d2> f38976f = C15664x82674389.f38981f;
    @C12579k

    /* renamed from: g */
    public final C11300l<LayoutNode, C11079d2> f38977g = OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1.f38982f;

    public OwnerSnapshotObserver(@C12579k C11300l<? super C11289a<C11079d2>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onChangedExecutor");
        this.f38971a = new SnapshotStateObserver(lVar);
    }

    /* renamed from: d */
    public static /* synthetic */ void m70087d(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.mo44915c(layoutNode, z, aVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m70088f(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.mo44916e(layoutNode, z, aVar);
    }

    /* renamed from: h */
    public static /* synthetic */ void m70089h(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, C11289a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.mo44917g(layoutNode, z, aVar);
    }

    /* renamed from: a */
    public final void mo44913a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "target");
        this.f38971a.mo16499l(obj);
    }

    /* renamed from: b */
    public final void mo44914b() {
        this.f38971a.mo16500m(OwnerSnapshotObserver$clearInvalidObservations$1.f38978f);
    }

    /* renamed from: c */
    public final void mo44915c(@C12579k LayoutNode layoutNode, boolean z, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (!z || layoutNode.mo44701r0() == null) {
            mo44918i(layoutNode, this.f38975e, aVar);
        } else {
            mo44918i(layoutNode, this.f38976f, aVar);
        }
    }

    /* renamed from: e */
    public final void mo44916e(@C12579k LayoutNode layoutNode, boolean z, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (!z || layoutNode.mo44701r0() == null) {
            mo44918i(layoutNode, this.f38974d, aVar);
        } else {
            mo44918i(layoutNode, this.f38977g, aVar);
        }
    }

    /* renamed from: g */
    public final void mo44917g(@C12579k LayoutNode layoutNode, boolean z, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "node");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (!z || layoutNode.mo44701r0() == null) {
            mo44918i(layoutNode, this.f38973c, aVar);
        } else {
            mo44918i(layoutNode, this.f38972b, aVar);
        }
    }

    /* renamed from: i */
    public final <T extends C15680d1> void mo44918i(@C12579k T t, @C12579k C11300l<? super T, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(t, "target");
        Intrinsics.checkNotNullParameter(lVar, "onChanged");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        this.f38971a.mo16505r(t, lVar, aVar);
    }

    /* renamed from: j */
    public final void mo44919j() {
        this.f38971a.mo16509v();
    }

    /* renamed from: k */
    public final void mo44920k() {
        this.f38971a.mo16510w();
        this.f38971a.mo16498k();
    }
}
