package com.carrefour.fid.android.design.components.widgets.list.itemcomponents;

import android.content.Context;
import android.view.LayoutInflater;
import com.carrefour.fid.android.design.components.databinding.C37085x;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/databinding/x;", "a", "()Lcom/carrefour/fid/android/design/components/databinding/x;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ListItemMemoCheckboxComponent$binding$2 extends Lambda implements C11289a<C37085x> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ListItemMemoCheckboxComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemMemoCheckboxComponent$binding$2(Context context, ListItemMemoCheckboxComponent listItemMemoCheckboxComponent) {
        super(0);
        this.$context = context;
        this.this$0 = listItemMemoCheckboxComponent;
    }

    @C12579k
    /* renamed from: a */
    public final C37085x invoke() {
        C37085x b = C37085x.m152080b(LayoutInflater.from(this.$context), this.this$0);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…          this,\n        )");
        return b;
    }
}
