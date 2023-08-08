package com.carrefour.fid.android.design.components.widgets.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.picker.a */
public final class C37301a extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: b */
    public static final int f93570b = 8;
    @C12579k

    /* renamed from: a */
    public List<StandardPickerComponent.C37292a> f93571a = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.a$a */
    public static final class C37302a extends RecyclerView.C20061e0 {
        public C37302a(StandardPickerComponent standardPickerComponent) {
            super(standardPickerComponent);
        }
    }

    public int getItemCount() {
        return this.f93571a.size();
    }

    @C12579k
    public final List<StandardPickerComponent.C37292a> getList() {
        return this.f93571a;
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        View view = e0Var.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent");
        ((StandardPickerComponent) view).mo113592v(this.f93571a.get(i));
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        StandardPickerComponent standardPickerComponent = new StandardPickerComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        standardPickerComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C37302a(standardPickerComponent);
    }

    public final void setList(@C12579k List<StandardPickerComponent.C37292a> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f93571a = list;
        notifyDataSetChanged();
    }
}
