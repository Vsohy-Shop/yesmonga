package com.carrefour.fid.android.design.components.widgets.filter;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemButtonComponent;
import com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemCheckboxComponent;
import com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.filter.b */
public final class C37225b extends RecyclerView.Adapter<C37226a> {

    /* renamed from: b */
    public static final int f93362b = 8;
    @C12579k

    /* renamed from: a */
    public List<? extends C37229e> f93363a = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: com.carrefour.fid.android.design.components.widgets.filter.b$a */
    public final class C37226a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final FilterItemComponent<?> f93364a;

        /* renamed from: b */
        public final /* synthetic */ C37225b f93365b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37226a(@C12579k C37225b bVar, FilterItemComponent<?> filterItemComponent) {
            super(filterItemComponent);
            Intrinsics.checkNotNullParameter(filterItemComponent, "itemCustomView");
            this.f93365b = bVar;
            this.f93364a = filterItemComponent;
        }

        @C12579k
        /* renamed from: c */
        public final FilterItemComponent<?> mo113363c() {
            return this.f93364a;
        }
    }

    public int getItemCount() {
        return this.f93363a.size();
    }

    public int getItemViewType(int i) {
        return C11342l0.m43547d(this.f93363a.get(i).getClass()).hashCode();
    }

    @C12579k
    public final List<C37229e> getList() {
        return this.f93363a;
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C37226a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        FilterItemComponent<?> c = aVar.mo113363c();
        if (c instanceof FilterItemGroupComponent) {
            Object obj = this.f93363a.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.filter.FilterItemGroupUI");
            ((FilterItemGroupComponent) aVar.mo113363c()).mo113348u((C37228d) obj);
        } else if (c instanceof FilterItemCheckboxComponent) {
            Object obj2 = this.f93363a.get(i);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.filter.FilterItemCheckboxUI");
            ((FilterItemCheckboxComponent) aVar.mo113363c()).mo113348u((C37227c) obj2);
        } else if (c instanceof FilterItemButtonComponent) {
            Object obj3 = this.f93363a.get(i);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.filter.FilterButtonItemLinkUI");
            ((FilterItemButtonComponent) aVar.mo113363c()).mo113348u((C37224a) obj3);
        } else {
            String p = C11342l0.m43547d(aVar.mo113363c().getClass()).mo22845p();
            throw new IllegalStateException("Unknown Component view type: " + p);
        }
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [com.carrefour.fid.android.design.components.widgets.filter.FilterItemComponent, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemButtonComponent] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemCheckboxComponent] */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.design.components.widgets.filter.C37225b.C37226a onCreateViewHolder(@org.jetbrains.annotations.C12579k android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.filter.d> r0 = com.carrefour.fid.android.design.components.widgets.filter.C37228d.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            java.lang.String r1 = "parent.context"
            if (r10 != r0) goto L_0x0025
            com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent r10 = new com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent
            android.content.Context r3 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0060
        L_0x0025:
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.filter.c> r0 = com.carrefour.fid.android.design.components.widgets.filter.C37227c.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            if (r10 != r0) goto L_0x0043
            com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemCheckboxComponent r10 = new com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemCheckboxComponent
            android.content.Context r3 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0060
        L_0x0043:
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.filter.a> r0 = com.carrefour.fid.android.design.components.widgets.filter.C37224a.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            if (r10 != r0) goto L_0x0070
            com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemButtonComponent r10 = new com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemButtonComponent
            android.content.Context r3 = r9.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0060:
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r1 = -2
            r9.<init>(r0, r1)
            r10.setLayoutParams(r9)
            com.carrefour.fid.android.design.components.widgets.filter.b$a r9 = new com.carrefour.fid.android.design.components.widgets.filter.b$a
            r9.<init>(r8, r10)
            return r9
        L_0x0070:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown view type: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.filter.C37225b.onCreateViewHolder(android.view.ViewGroup, int):com.carrefour.fid.android.design.components.widgets.filter.b$a");
    }

    public final void setList(@C12579k List<? extends C37229e> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f93363a = list;
        notifyDataSetChanged();
    }
}
