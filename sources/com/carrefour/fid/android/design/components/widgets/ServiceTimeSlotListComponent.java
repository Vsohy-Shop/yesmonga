package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.databinding.C37090z0;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.utils.C37141h;
import com.carrefour.fid.android.design.components.utils.C37145l;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent;
import com.carrefour.fid.android.design.components.widgets.adapter.C37194d;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J*\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fJ\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178\u0016@\u0016X\u000f¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceTimeSlotListComponent;", "Landroid/widget/FrameLayout;", "Lcom/carrefour/fid/android/design/components/utils/h;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/d2;", "setLoadingDebouncedClickListener", "setTimeoutDebouncedClickListener", "", "isYieldEligible", "isFromHome", "Lkotlin/Function1;", "", "onSlotSelectedCallback", "a", "", "Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotComponent$b;", "list", "b", "Lcom/carrefour/fid/android/design/components/databinding/z0;", "Lcom/carrefour/fid/android/design/components/databinding/z0;", "binding", "Lcom/carrefour/fid/android/design/components/utils/a;", "getDebouncerState", "()Lcom/carrefour/fid/android/design/components/utils/a;", "setDebouncerState", "(Lcom/carrefour/fid/android/design/components/utils/a;)V", "debouncerState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceTimeSlotListComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceTimeSlotListComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ServiceTimeSlotListComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,44:1\n262#2,2:45\n*S KotlinDebug\n*F\n+ 1 ServiceTimeSlotListComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ServiceTimeSlotListComponent\n*L\n38#1:45,2\n*E\n"})
public final class ServiceTimeSlotListComponent extends FrameLayout implements C37141h {

    /* renamed from: c */
    public static final int f93227c = 8;

    /* renamed from: a */
    public final /* synthetic */ C37145l f93228a;
    @C12579k

    /* renamed from: b */
    public final C37090z0 f93229b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceTimeSlotListComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo113176a(boolean z, boolean z2, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onSlotSelectedCallback");
        this.f93229b.f92864b.setAdapter(new C37194d((List) null, z, z2, lVar, 1, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public final void mo113177b(@C12579k List<ServiceSlotComponent.C37171b> list) {
        int i;
        C37194d dVar;
        Intrinsics.checkNotNullParameter(list, "list");
        RecyclerView recyclerView = this.f93229b.f92864b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.slotList");
        if (!list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        RecyclerView.Adapter adapter = this.f93229b.f92864b.getAdapter();
        if (adapter instanceof C37194d) {
            dVar = (C37194d) adapter;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.mo113279o(list);
        }
    }

    @C12579k
    public C37133a getDebouncerState() {
        return this.f93228a.getDebouncerState();
    }

    public void setDebouncerState(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f93228a.setDebouncerState(aVar);
    }

    public void setLoadingDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93228a.setLoadingDebouncedClickListener(view, onClickListener);
    }

    public void setTimeoutDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93228a.setTimeoutDebouncedClickListener(view, onClickListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceTimeSlotListComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceTimeSlotListComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceTimeSlotListComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93228a = new C37145l();
        setClickable(true);
        C37090z0 b = C37090z0.m152090b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…          this,\n        )");
        this.f93229b = b;
    }
}
