package com.carrefour.fid.android.design.components.widgets.filter.filterlistItems;

import com.carrefour.fid.android.design.components.widgets.filter.C37228d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FilterItemGroupComponent$bindList$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C37228d $itemViewUIModel;
    final /* synthetic */ FilterItemGroupComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterItemGroupComponent$bindList$3(FilterItemGroupComponent filterItemGroupComponent, C37228d dVar) {
        super(0);
        this.this$0 = filterItemGroupComponent;
        this.$itemViewUIModel = dVar;
    }

    public final void invoke() {
        FilterItemGroupComponent filterItemGroupComponent = this.this$0;
        filterItemGroupComponent.f93384d = !filterItemGroupComponent.f93384d;
        this.this$0.mo113391B(this.$itemViewUIModel);
    }
}
