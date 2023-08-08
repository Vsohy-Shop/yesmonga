package com.carrefour.fid.android.design.components.widgets.productcard;

import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.C37382a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/lozenge/a;", "it", "", "a", "(Lcom/carrefour/fid/android/design/components/widgets/productcard/lozenge/a;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductCardSComponent$bind$lozengesContentDescription$1 extends Lambda implements C11300l<C37382a, CharSequence> {
    final /* synthetic */ ProductCardSComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductCardSComponent$bind$lozengesContentDescription$1(ProductCardSComponent productCardSComponent) {
        super(1);
        this.this$0 = productCardSComponent;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k C37382a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (aVar instanceof C37382a.C37384b) {
            C37382a.C37384b bVar = (C37382a.C37384b) aVar;
            if (bVar.mo113968b() != 0) {
                String string = this.this$0.getContext().getString(C36896b.C36912p.accessibility_product_flag_prefix);
                String string2 = this.this$0.getContext().getString(bVar.mo113968b());
                return string + string2;
            }
        }
        return "";
    }
}
