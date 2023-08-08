package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.databinding.C37082v0;
import com.carrefour.fid.android.design.components.extension.C37114f;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.utils.C37141h;
import com.carrefour.fid.android.design.components.utils.C37145l;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent;
import com.carrefour.fid.android.design.components.widgets.adapter.C37198h;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import java.util.Collection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u001a\u0010\f\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tJ\u0006\u0010\r\u001a\u00020\nJ\u0014\u0010\u0011\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u00020\u00188\u0016@\u0016X\u000f¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDateListComponent;", "Landroid/widget/FrameLayout;", "Lcom/carrefour/fid/android/design/components/utils/h;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/d2;", "setLoadingDebouncedClickListener", "setTimeoutDebouncedClickListener", "Lkotlin/Function1;", "", "onDateSelectedCallback", "c", "getSelectedPosition", "", "Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDateComponent$b;", "list", "d", "dateId", "e", "Lcom/carrefour/fid/android/design/components/databinding/v0;", "b", "Lcom/carrefour/fid/android/design/components/databinding/v0;", "binding", "Lcom/carrefour/fid/android/design/components/utils/a;", "getDebouncerState", "()Lcom/carrefour/fid/android/design/components/utils/a;", "setDebouncerState", "(Lcom/carrefour/fid/android/design/components/utils/a;)V", "debouncerState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceSlotDateListComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceSlotDateListComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ServiceSlotDateListComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,71:1\n262#2,2:72\n*S KotlinDebug\n*F\n+ 1 ServiceSlotDateListComponent.kt\ncom/carrefour/fid/android/design/components/widgets/ServiceSlotDateListComponent\n*L\n50#1:72,2\n*E\n"})
public final class ServiceSlotDateListComponent extends FrameLayout implements C37141h {

    /* renamed from: c */
    public static final int f93213c = 8;

    /* renamed from: a */
    public final /* synthetic */ C37145l f93214a;
    @C12579k

    /* renamed from: b */
    public final C37082v0 f93215b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDateListComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: f */
    public static final void m152601f(RecyclerView recyclerView, C37198h hVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "$this_apply");
        Intrinsics.checkNotNullParameter(hVar, "$this_apply$1");
        C37114f.m152159d(recyclerView, hVar.mo113284l(), 0, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo113153c(@C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onDateSelectedCallback");
        this.f93215b.f92836b.removeAllViews();
        RecyclerView recyclerView = this.f93215b.f92836b;
        recyclerView.setAdapter(new C37198h(new ServiceSlotDateListComponent$initAdapter$1$1(this, lVar), (List) null, 2, (DefaultConstructorMarker) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
    }

    /* renamed from: d */
    public final void mo113154d(@C12579k List<ServiceSlotDateComponent.C37173b> list) {
        int i;
        C37198h hVar;
        Intrinsics.checkNotNullParameter(list, "list");
        RecyclerView recyclerView = this.f93215b.f92836b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.slotDateList");
        Collection collection = list;
        if (!collection.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        RecyclerView.Adapter adapter = this.f93215b.f92836b.getAdapter();
        if (adapter instanceof C37198h) {
            hVar = (C37198h) adapter;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            hVar.mo113290s(CollectionsKt___CollectionsKt.m40572T5(collection));
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113155e(int r6) {
        /*
            r5 = this;
            com.carrefour.fid.android.design.components.databinding.v0 r0 = r5.f93215b
            androidx.recyclerview.widget.RecyclerView r0 = r0.f92836b
            androidx.recyclerview.widget.RecyclerView$o r1 = r0.getLayoutManager()
            boolean r2 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r3 = 0
            if (r2 == 0) goto L_0x0010
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            goto L_0x0011
        L_0x0010:
            r1 = r3
        L_0x0011:
            if (r1 == 0) goto L_0x001c
            int r1 = r1.mo59426t2()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r0.getAdapter()
            boolean r4 = r2 instanceof com.carrefour.fid.android.design.components.widgets.adapter.C37198h
            if (r4 == 0) goto L_0x0028
            r3 = r2
            com.carrefour.fid.android.design.components.widgets.adapter.h r3 = (com.carrefour.fid.android.design.components.widgets.adapter.C37198h) r3
        L_0x0028:
            if (r3 == 0) goto L_0x0044
            r3.mo113289r(r6)
            int r6 = r3.mo113284l()
            if (r1 != 0) goto L_0x0034
            goto L_0x003a
        L_0x0034:
            int r1 = r1.intValue()
            if (r1 == r6) goto L_0x0044
        L_0x003a:
            com.carrefour.fid.android.design.components.widgets.l1 r6 = new com.carrefour.fid.android.design.components.widgets.l1
            r6.<init>(r0, r3)
            r1 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r6, r1)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.ServiceSlotDateListComponent.mo113155e(int):void");
    }

    @C12579k
    public C37133a getDebouncerState() {
        return this.f93214a.getDebouncerState();
    }

    public final int getSelectedPosition() {
        C37198h hVar;
        RecyclerView.Adapter adapter = this.f93215b.f92836b.getAdapter();
        if (adapter instanceof C37198h) {
            hVar = (C37198h) adapter;
        } else {
            hVar = null;
        }
        if (hVar == null || hVar.mo113284l() < 0) {
            return 0;
        }
        return hVar.mo113284l();
    }

    public void setDebouncerState(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f93214a.setDebouncerState(aVar);
    }

    public void setLoadingDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93214a.setLoadingDebouncedClickListener(view, onClickListener);
    }

    public void setTimeoutDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93214a.setTimeoutDebouncedClickListener(view, onClickListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDateListComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceSlotDateListComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ServiceSlotDateListComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93214a = new C37145l();
        C37082v0 b = C37082v0.m152072b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…          this,\n        )");
        this.f93215b = b;
    }
}
