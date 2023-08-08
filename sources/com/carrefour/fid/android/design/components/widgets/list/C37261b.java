package com.carrefour.fid.android.design.components.widgets.list;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemButtonComponent;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemLinkComponent;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMemoCheckboxComponent;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMessageComponent;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemQuantityComponent;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.b */
public final class C37261b extends RecyclerView.Adapter<C37262a> {

    /* renamed from: b */
    public static final int f93450b = 8;
    @C12579k

    /* renamed from: a */
    public List<? extends C37269i> f93451a = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: com.carrefour.fid.android.design.components.widgets.list.b$a */
    public final class C37262a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final ListItemComponent<?> f93452a;

        /* renamed from: b */
        public final /* synthetic */ C37261b f93453b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37262a(@C12579k C37261b bVar, ListItemComponent<?> listItemComponent) {
            super(listItemComponent);
            Intrinsics.checkNotNullParameter(listItemComponent, "itemCustomView");
            this.f93453b = bVar;
            this.f93452a = listItemComponent;
        }

        @C12579k
        /* renamed from: c */
        public final ListItemComponent<?> mo113444c() {
            return this.f93452a;
        }
    }

    public int getItemCount() {
        return this.f93451a.size();
    }

    public int getItemViewType(int i) {
        return C11342l0.m43547d(this.f93451a.get(i).getClass()).hashCode();
    }

    @C12579k
    public final List<C37269i> getList() {
        return this.f93451a;
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C37262a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        ListItemComponent<?> c = aVar.mo113444c();
        if (c instanceof ListItemLinkComponent) {
            Object obj = this.f93451a.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemLinkUI");
            ((ListItemLinkComponent) aVar.mo113444c()).mo113429u((C37266f) obj);
        } else if (c instanceof ListItemIconComponent) {
            Object obj2 = this.f93451a.get(i);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemIconUI");
            ((ListItemIconComponent) aVar.mo113444c()).mo113429u((C37265e) obj2);
        } else if (c instanceof ListItemMemoCheckboxComponent) {
            Object obj3 = this.f93451a.get(i);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemCheckboxWithDeleteUI");
            ((ListItemMemoCheckboxComponent) aVar.mo113444c()).mo113429u((C37264d) obj3);
        } else if (c instanceof ListItemButtonComponent) {
            Object obj4 = this.f93451a.get(i);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemButtonUI");
            ((ListItemButtonComponent) aVar.mo113444c()).mo113429u((C37263c) obj4);
        } else if (c instanceof ListItemQuantityComponent) {
            Object obj5 = this.f93451a.get(i);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemQuantityUI");
            ((ListItemQuantityComponent) aVar.mo113444c()).mo113429u((C37268h) obj5);
        } else if (c instanceof ListItemMessageComponent) {
            Object obj6 = this.f93451a.get(i);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemMessageUI");
            ((ListItemMessageComponent) aVar.mo113444c()).mo113429u((C37267g) obj6);
        } else {
            String p = C11342l0.m43547d(aVar.mo113444c().getClass()).mo22845p();
            throw new IllegalStateException("Unknown Component view type: " + p);
        }
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [android.view.View, com.carrefour.fid.android.design.components.widgets.list.ListItemComponent] */
    /* JADX WARNING: type inference failed for: r2v6, types: [com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemQuantityComponent] */
    /* JADX WARNING: type inference failed for: r2v7, types: [com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMessageComponent] */
    /* JADX WARNING: type inference failed for: r2v8, types: [com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemButtonComponent] */
    /* JADX WARNING: type inference failed for: r2v9, types: [com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMemoCheckboxComponent] */
    /* JADX WARNING: type inference failed for: r2v10, types: [com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemLinkComponent] */
    /* JADX WARNING: type inference failed for: r2v11, types: [com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.design.components.widgets.list.C37261b.C37262a onCreateViewHolder(@org.jetbrains.annotations.C12579k android.view.ViewGroup r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.list.e> r0 = com.carrefour.fid.android.design.components.widgets.list.C37265e.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            java.lang.String r1 = "parent.context"
            if (r11 != r0) goto L_0x0028
            com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent r11 = new com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent
            android.content.Context r3 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00c8
        L_0x0028:
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.list.f> r0 = com.carrefour.fid.android.design.components.widgets.list.C37266f.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            if (r11 != r0) goto L_0x0049
            com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemLinkComponent r11 = new com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemLinkComponent
            android.content.Context r3 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00c8
        L_0x0049:
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.list.d> r0 = com.carrefour.fid.android.design.components.widgets.list.C37264d.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            if (r11 != r0) goto L_0x0069
            com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMemoCheckboxComponent r11 = new com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMemoCheckboxComponent
            android.content.Context r3 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00c8
        L_0x0069:
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.list.c> r0 = com.carrefour.fid.android.design.components.widgets.list.C37263c.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            if (r11 != r0) goto L_0x0089
            com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemButtonComponent r11 = new com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemButtonComponent
            android.content.Context r3 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00c8
        L_0x0089:
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.list.g> r0 = com.carrefour.fid.android.design.components.widgets.list.C37267g.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            if (r11 != r0) goto L_0x00a9
            com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMessageComponent r11 = new com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemMessageComponent
            android.content.Context r3 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00c8
        L_0x00a9:
            java.lang.Class<com.carrefour.fid.android.design.components.widgets.list.h> r0 = com.carrefour.fid.android.design.components.widgets.list.C37268h.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r0)
            int r0 = r0.hashCode()
            if (r11 != r0) goto L_0x00d8
            com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemQuantityComponent r11 = new com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemQuantityComponent
            android.content.Context r3 = r10.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 14
            r8 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x00c8:
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r1 = -2
            r10.<init>(r0, r1)
            r11.setLayoutParams(r10)
            com.carrefour.fid.android.design.components.widgets.list.b$a r10 = new com.carrefour.fid.android.design.components.widgets.list.b$a
            r10.<init>(r9, r11)
            return r10
        L_0x00d8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown view type: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.list.C37261b.onCreateViewHolder(android.view.ViewGroup, int):com.carrefour.fid.android.design.components.widgets.list.b$a");
    }

    public final void setList(@C12579k List<? extends C37269i> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f93451a = list;
        notifyDataSetChanged();
    }
}
