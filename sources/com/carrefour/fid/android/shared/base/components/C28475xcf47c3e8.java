package com.carrefour.fid.android.shared.base.components;

import android.view.ViewGroup;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\f\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004\"\b\b\u0003\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\f\u0010\r"}, mo22516d2 = {"", "ExpandedType", "Lcom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerView$b;", "ExpandableType", "Lcom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerView$c;", "PVH", "Lcom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerView$d;", "CVH", "Landroid/view/ViewGroup;", "viewGroup", "", "<anonymous parameter 1>", "a", "(Landroid/view/ViewGroup;I)Lcom/carrefour/fid/android/shared/base/components/BaseExpandableRecyclerView$d;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.shared.base.components.BaseExpandableRecyclerView$setupChildRecyclerView$childListAdapter$1 */
public final class C28475xcf47c3e8 extends Lambda implements C11304p<ViewGroup, Integer, CVH> {
    final /* synthetic */ int $position;
    final /* synthetic */ BaseExpandableRecyclerView<ExpandedType, ExpandableType, PVH, CVH> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28475xcf47c3e8(BaseExpandableRecyclerView<ExpandedType, ExpandableType, PVH, CVH> baseExpandableRecyclerView, int i) {
        super(2);
        this.this$0 = baseExpandableRecyclerView;
        this.$position = i;
    }

    @C12579k
    /* renamed from: a */
    public final CVH mo83382a(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        BaseExpandableRecyclerView<ExpandedType, ExpandableType, PVH, CVH> baseExpandableRecyclerView = this.this$0;
        return baseExpandableRecyclerView.mo80703w(viewGroup, baseExpandableRecyclerView.getItemViewType(this.$position));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo83382a((ViewGroup) obj, ((Number) obj2).intValue());
    }
}
