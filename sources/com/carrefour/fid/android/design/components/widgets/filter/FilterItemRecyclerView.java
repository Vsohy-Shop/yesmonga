package com.carrefour.fid.android.design.components.widgets.filter;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/filter/FilterItemRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Lcom/carrefour/fid/android/design/components/widgets/filter/e;", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class FilterItemRecyclerView extends RecyclerView {

    /* renamed from: B2 */
    public static final int f93358B2 = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemRecyclerView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12579k
    public final List<C37229e> getList() {
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.filter.FilterItemAdapter");
        return ((C37225b) adapter).getList();
    }

    public final void setList(@C12579k List<? extends C37229e> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.filter.FilterItemAdapter");
        ((C37225b) adapter).setList(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemRecyclerView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterItemRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemRecyclerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setAdapter(new C37225b());
        setLayoutManager(new LinearLayoutManager(context));
    }
}
