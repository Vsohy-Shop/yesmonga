package com.carrefour.fid.android.design.components.widgets;

import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.extension.C37114f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "position", "Lkotlin/d2;", "a", "(I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ServiceSlotDateListComponent$initAdapter$1$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C11300l<Integer, C11079d2> $onDateSelectedCallback;
    final /* synthetic */ ServiceSlotDateListComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotDateListComponent$initAdapter$1$1(ServiceSlotDateListComponent serviceSlotDateListComponent, C11300l<? super Integer, C11079d2> lVar) {
        super(1);
        this.this$0 = serviceSlotDateListComponent;
        this.$onDateSelectedCallback = lVar;
    }

    /* renamed from: a */
    public final void mo113157a(int i) {
        RecyclerView recyclerView = this.this$0.f93215b.f92836b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.slotDateList");
        C37114f.m152159d(recyclerView, i, 0, 2, (Object) null);
        this.$onDateSelectedCallback.invoke(Integer.valueOf(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo113157a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
