package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27495j0;
import com.google.android.material.badge.C31132a;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0002R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/views/MixingProductDetailsView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "products", "Lkotlin/d2;", "F", "G", "Lkotlin/Function0;", "T0", "Lkotlin/jvm/functions/a;", "getOnMoreFlavorsClickListener", "()Lkotlin/jvm/functions/a;", "setOnMoreFlavorsClickListener", "(Lkotlin/jvm/functions/a;)V", "onMoreFlavorsClickListener", "Lcom/carrefour/fid/android/product/databinding/j0;", "U0", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/product/databinding/j0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.MixingProductDetailsView */
public final class MixingProductDetailsView extends LinearLayoutCompat {

    /* renamed from: V0 */
    public static final int f67717V0 = 8;
    @C12580l

    /* renamed from: T0 */
    public C11289a<C11079d2> f67718T0;
    @C12579k

    /* renamed from: U0 */
    public final C11677z f67719U0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public MixingProductDetailsView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: H */
    public static final void m117214H(MixingProductDetailsView mixingProductDetailsView, View view) {
        Intrinsics.checkNotNullParameter(mixingProductDetailsView, "this$0");
        C11289a<C11079d2> aVar = mixingProductDetailsView.f67718T0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final C27495j0 getBinding() {
        return (C27495j0) this.f67719U0.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: F */
    public final void mo81283F(@C12579k List<C38115c> list) {
        ProductPicture productPicture;
        String str;
        ProductPicture productPicture2;
        Intrinsics.checkNotNullParameter(list, "products");
        setVisibility(0);
        C38115c cVar = (C38115c) CollectionsKt___CollectionsKt.m40479B2(list);
        String str2 = "";
        String str3 = null;
        if (cVar != null) {
            C22092j E = C22038b.m100350E(getContext());
            List list2 = cVar.mo118857H().get(PictureSize.Small);
            if (list2 == null || (productPicture2 = (ProductPicture) CollectionsKt___CollectionsKt.m40706w2(list2)) == null) {
                str = null;
            } else {
                str = productPicture2.mo118573e();
            }
            if (str == null) {
                str = str2;
            }
            E.mo65605u(str).mo65688b(new C22561h().mo66763S0(C27609f.C27617h.ic_product_placeholder)).mo65675K1(getBinding().f66701b);
        }
        if (list.size() >= 2) {
            getBinding().f66704e.setVisibility(0);
            C22092j E2 = C22038b.m100350E(getContext());
            List list3 = list.get(1).mo118857H().get(PictureSize.Small);
            if (!(list3 == null || (productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40706w2(list3)) == null)) {
                str3 = productPicture.mo118573e();
            }
            if (str3 != null) {
                str2 = str3;
            }
            E2.mo65605u(str2).mo65688b(new C22561h().mo66763S0(C27609f.C27617h.ic_product_placeholder)).mo65675K1(getBinding().f66704e);
        }
        if (list.size() > 2) {
            getBinding().f66702c.setVisibility(0);
            getBinding().f66702c.setText(C31132a.f74628J0 + (list.size() - 2));
        }
    }

    /* renamed from: G */
    public final void mo81284G() {
        getBinding().f66703d.setOnClickListener(new C27928c(this));
    }

    @C12580l
    public final C11289a<C11079d2> getOnMoreFlavorsClickListener() {
        return this.f67718T0;
    }

    public final void setOnMoreFlavorsClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f67718T0 = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public MixingProductDetailsView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MixingProductDetailsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public MixingProductDetailsView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f67719U0 = C10864b0.m38748c(new MixingProductDetailsView$binding$2(context, this));
        setVisibility(8);
        mo81284G();
    }
}
