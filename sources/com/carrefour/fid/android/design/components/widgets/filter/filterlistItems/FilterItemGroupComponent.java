package com.carrefour.fid.android.design.components.widgets.filter.filterlistItems;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.databinding.C37069p;
import com.carrefour.fid.android.design.components.widgets.filter.C37228d;
import com.carrefour.fid.android.design.components.widgets.filter.FilterItemComponent;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/filter/filterlistItems/FilterItemGroupComponent;", "Lcom/carrefour/fid/android/design/components/widgets/filter/FilterItemComponent;", "Lcom/carrefour/fid/android/design/components/widgets/filter/d;", "itemViewUIModel", "Lkotlin/d2;", "z", "B", "Lcom/carrefour/fid/android/design/components/databinding/p;", "b", "Lcom/carrefour/fid/android/design/components/databinding/p;", "binding", "", "c", "Z", "isExpanded", "d", "displayAll", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nFilterItemGroupComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterItemGroupComponent.kt\ncom/carrefour/fid/android/design/components/widgets/filter/filterlistItems/FilterItemGroupComponent\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n125#2:100\n152#2,3:101\n1549#3:104\n1620#3,3:105\n*S KotlinDebug\n*F\n+ 1 FilterItemGroupComponent.kt\ncom/carrefour/fid/android/design/components/widgets/filter/filterlistItems/FilterItemGroupComponent\n*L\n54#1:100\n54#1:101,3\n68#1:104\n68#1:105,3\n*E\n"})
public final class FilterItemGroupComponent extends FilterItemComponent<C37228d> {

    /* renamed from: e */
    public static final int f93381e = 8;
    @C12579k

    /* renamed from: b */
    public final C37069p f93382b;

    /* renamed from: c */
    public boolean f93383c;

    /* renamed from: d */
    public boolean f93384d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemGroupComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static final void m152848A(FilterItemGroupComponent filterItemGroupComponent, C37228d dVar, View view) {
        Intrinsics.checkNotNullParameter(filterItemGroupComponent, "this$0");
        filterItemGroupComponent.f93383c = !filterItemGroupComponent.f93383c;
        filterItemGroupComponent.mo113391B(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d2, code lost:
        if (r1 != null) goto L_0x013b;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113391B(com.carrefour.fid.android.design.components.widgets.filter.C37228d r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.f93383c
            java.lang.String r3 = "binding.groupItems"
            if (r2 == 0) goto L_0x0159
            com.carrefour.fid.android.design.components.databinding.p r2 = r0.f93382b
            android.widget.ImageView r2 = r2.f92763b
            android.content.res.Resources r4 = r17.getResources()
            int r5 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_chevron_up
            android.content.Context r6 = r17.getContext()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            android.graphics.drawable.Drawable r4 = androidx.core.content.res.C17465i.m80175g(r4, r5, r6)
            r2.setImageDrawable(r4)
            boolean r2 = r0.f93384d
            r4 = 0
            if (r2 != 0) goto L_0x00da
            if (r1 == 0) goto L_0x003b
            java.util.Map r2 = r18.mo113383k()
            if (r2 == 0) goto L_0x003b
            java.util.Set r2 = r2.keySet()
            if (r2 == 0) goto L_0x003b
            int r2 = r2.size()
            goto L_0x003c
        L_0x003b:
            r2 = r4
        L_0x003c:
            if (r1 == 0) goto L_0x0043
            int r5 = r18.mo113384l()
            goto L_0x0044
        L_0x0043:
            r5 = r4
        L_0x0044:
            if (r2 > r5) goto L_0x0048
            goto L_0x00da
        L_0x0048:
            if (r1 == 0) goto L_0x00d5
            java.util.Map r2 = r18.mo113383k()
            if (r2 == 0) goto L_0x00d5
            java.util.Set r2 = r2.keySet()
            if (r2 == 0) goto L_0x00d5
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r5 = r18.mo113384l()
            java.util.List r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r2, r5)
            if (r2 == 0) goto L_0x00d5
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r2, r6)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0073:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            com.carrefour.fid.android.design.components.widgets.filter.c r7 = new com.carrefour.fid.android.design.components.widgets.filter.c
            java.util.Map r8 = r18.mo113383k()
            java.lang.Object r8 = r8.get(r6)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            java.util.List r8 = r18.mo113382j()
            boolean r8 = r8.contains(r6)
            if (r8 == 0) goto L_0x0099
            com.carrefour.fid.android.design.components.type.CheckboxState r8 = com.carrefour.fid.android.design.components.type.CheckboxState.CHECKED
            goto L_0x009b
        L_0x0099:
            com.carrefour.fid.android.design.components.type.CheckboxState r8 = com.carrefour.fid.android.design.components.type.CheckboxState.UNCHECKED
        L_0x009b:
            r11 = r8
            com.carrefour.fid.android.design.components.widgets.CheckboxComponent$a r8 = new com.carrefour.fid.android.design.components.widgets.CheckboxComponent$a
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 25
            r16 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent$bindList$2$1 r9 = new com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent$bindList$2$1
            r9.<init>(r1, r6)
            r7.<init>(r8, r9)
            r5.add(r7)
            goto L_0x0073
        L_0x00b5:
            com.carrefour.fid.android.design.components.widgets.filter.a r2 = new com.carrefour.fid.android.design.components.widgets.filter.a
            android.content.res.Resources r6 = r17.getResources()
            int r7 = com.carrefour.fid.android.design.components.C36896b.C36912p.see_more
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "resources.getString(R.string.see_more)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent$bindList$3 r7 = new com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent$bindList$3
            r7.<init>(r0, r1)
            r2.<init>(r6, r7)
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40723z4(r5, r2)
            if (r1 == 0) goto L_0x00d5
            goto L_0x013b
        L_0x00d5:
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x013b
        L_0x00da:
            if (r1 == 0) goto L_0x0137
            java.util.Map r2 = r18.mo113383k()
            if (r2 == 0) goto L_0x0137
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r2.size()
            r5.<init>(r6)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00f3:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0135
            java.lang.Object r6 = r2.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            com.carrefour.fid.android.design.components.widgets.filter.c r7 = new com.carrefour.fid.android.design.components.widgets.filter.c
            java.lang.Object r8 = r6.getValue()
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            java.util.List r8 = r18.mo113382j()
            java.lang.Object r9 = r6.getKey()
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x0119
            com.carrefour.fid.android.design.components.type.CheckboxState r8 = com.carrefour.fid.android.design.components.type.CheckboxState.CHECKED
            goto L_0x011b
        L_0x0119:
            com.carrefour.fid.android.design.components.type.CheckboxState r8 = com.carrefour.fid.android.design.components.type.CheckboxState.UNCHECKED
        L_0x011b:
            r11 = r8
            com.carrefour.fid.android.design.components.widgets.CheckboxComponent$a r8 = new com.carrefour.fid.android.design.components.widgets.CheckboxComponent$a
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 25
            r16 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent$bindList$1$1 r9 = new com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent$bindList$1$1
            r9.<init>(r1, r6)
            r7.<init>(r8, r9)
            r5.add(r7)
            goto L_0x00f3
        L_0x0135:
            r1 = r5
            goto L_0x013b
        L_0x0137:
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x013b:
            com.carrefour.fid.android.design.components.databinding.p r2 = r0.f93382b
            com.carrefour.fid.android.design.components.widgets.filter.FilterItemRecyclerView r2 = r2.f92765d
            r2.setNestedScrollingEnabled(r4)
            com.carrefour.fid.android.design.components.databinding.p r2 = r0.f93382b
            com.carrefour.fid.android.design.components.widgets.filter.FilterItemRecyclerView r2 = r2.f92765d
            r2.setList(r1)
            com.carrefour.fid.android.design.components.databinding.p r1 = r0.f93382b
            com.carrefour.fid.android.design.components.widgets.filter.FilterItemRecyclerView r4 = r1.f92765d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 7
            r9 = 0
            com.carrefour.fid.android.design.components.extension.ViewKt.m152123e(r4, r5, r6, r7, r8, r9)
            goto L_0x0183
        L_0x0159:
            com.carrefour.fid.android.design.components.databinding.p r1 = r0.f93382b
            android.widget.ImageView r1 = r1.f92763b
            android.content.res.Resources r2 = r17.getResources()
            int r4 = com.carrefour.fid.android.design.components.C36896b.C36904h.ds_ic_chevron_down
            android.content.Context r5 = r17.getContext()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            android.graphics.drawable.Drawable r2 = androidx.core.content.res.C17465i.m80175g(r2, r4, r5)
            r1.setImageDrawable(r2)
            com.carrefour.fid.android.design.components.databinding.p r1 = r0.f93382b
            com.carrefour.fid.android.design.components.widgets.filter.FilterItemRecyclerView r4 = r1.f92765d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            com.carrefour.fid.android.design.components.extension.ViewKt.m152126h(r4, r5, r6, r7, r8, r9, r10)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent.mo113391B(com.carrefour.fid.android.design.components.widgets.filter.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r4.mo113381i() == true) goto L_0x001b;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113348u(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.design.components.widgets.filter.C37228d r4) {
        /*
            r3 = this;
            com.carrefour.fid.android.design.components.databinding.p r0 = r3.f93382b
            android.widget.TextView r0 = r0.f92766e
            if (r4 == 0) goto L_0x000b
            java.lang.String r1 = r4.mo113386n()
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r0.setText(r1)
            r0 = 0
            if (r4 == 0) goto L_0x001a
            boolean r1 = r4.mo113381i()
            r2 = 1
            if (r1 != r2) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = r0
        L_0x001b:
            if (r2 == 0) goto L_0x0031
            com.carrefour.fid.android.design.components.databinding.p r1 = r3.f93382b
            android.widget.ImageView r1 = r1.f92763b
            r1.setVisibility(r0)
            com.carrefour.fid.android.design.components.databinding.p r0 = r3.f93382b
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f92767f
            com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.b r1 = new com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.b
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            goto L_0x003a
        L_0x0031:
            com.carrefour.fid.android.design.components.databinding.p r0 = r3.f93382b
            android.widget.ImageView r0 = r0.f92763b
            r1 = 8
            r0.setVisibility(r1)
        L_0x003a:
            r3.mo113391B(r4)
            r3.invalidate()
            r3.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.filter.filterlistItems.FilterItemGroupComponent.mo113348u(com.carrefour.fid.android.design.components.widgets.filter.d):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemGroupComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterItemGroupComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemGroupComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37069p b = C37069p.m152036b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f93382b = b;
        this.f93383c = true;
    }
}
