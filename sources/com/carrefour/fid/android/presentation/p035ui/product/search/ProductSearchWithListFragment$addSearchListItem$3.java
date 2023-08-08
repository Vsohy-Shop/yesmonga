package com.carrefour.fid.android.presentation.p035ui.product.search;

import com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "hasFocus", "Lkotlin/d2;", "a", "(Z)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchWithListFragment$addSearchListItem$3 */
public final class ProductSearchWithListFragment$addSearchListItem$3 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ SearchWithListItemComponent $item;
    final /* synthetic */ ProductSearchWithListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSearchWithListFragment$addSearchListItem$3(SearchWithListItemComponent searchWithListItemComponent, ProductSearchWithListFragment productSearchWithListFragment) {
        super(1);
        this.$item = searchWithListItemComponent;
        this.this$0 = productSearchWithListFragment;
    }

    /* renamed from: a */
    public final void mo74388a(boolean z) {
        if (!z && Intrinsics.areEqual((Object) this.$item.getText(), (Object) "") && this.this$0.mo74368l1() - this.this$0.mo74367k1() > 2) {
            this.this$0.mo74379z1(this.$item);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74388a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
