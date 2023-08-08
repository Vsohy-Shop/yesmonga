package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/ServiceInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "Lkotlin/d2;", "onBindViewHolder", "getItemCount", "", "Lcom/carrefour/fid/android/design/components/widgets/ServiceInfoComponent$UiModel;", "value", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.ServiceInfoAdapter */
public final class ServiceInfoAdapter extends RecyclerView.Adapter<RecyclerView.C20061e0> {
    @C12579k
    private List<ServiceInfoComponent.UiModel> list = CollectionsKt__CollectionsKt.m40441E();

    public int getItemCount() {
        return this.list.size();
    }

    @C12579k
    public final List<ServiceInfoComponent.UiModel> getList() {
        return this.list;
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        View view = e0Var.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.ServiceInfoComponent");
        ((ServiceInfoComponent) view).mo113078v(this.list.get(i));
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        ServiceInfoComponent serviceInfoComponent = new ServiceInfoComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        serviceInfoComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ServiceInfoAdapter$onCreateViewHolder$1(serviceInfoComponent);
    }

    public final void setList(@C12579k List<ServiceInfoComponent.UiModel> list2) {
        Intrinsics.checkNotNullParameter(list2, "value");
        this.list = list2;
        notifyDataSetChanged();
    }
}
