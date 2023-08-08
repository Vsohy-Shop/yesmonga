package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36773n4;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.presentation.models.OfferMixingModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.product.list.adapter.C25469h;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/adapter/OfferBasketMixingViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1549#2:219\n1620#2,3:220\n*S KotlinDebug\n*F\n+ 1 CheckoutViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/adapter/OfferBasketMixingViewHolder\n*L\n66#1:219\n66#1:220,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.a */
public final class C23341a extends C25469h {
    @C12579k

    /* renamed from: c */
    public static final C23342a f59096c = new C23342a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f59097d = 8;

    /* renamed from: e */
    public static final int f59098e = 14;
    @C12579k

    /* renamed from: b */
    public final C36773n4 f59099b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.a$a */
    public static final class C23342a {
        public /* synthetic */ C23342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23342a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23341a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.databinding.C36773n4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f59099b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.C23341a.<init>(com.carrefour.fid.android.databinding.n4):void");
    }

    /* renamed from: c */
    public final void mo68363c(@C12579k OfferMixingModel offerMixingModel) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(offerMixingModel, "offerMixing");
        OfferDiscountDomain a = offerMixingModel.mo121718a();
        Integer x = a.mo115959x();
        int i2 = 0;
        if (x != null) {
            i = x.intValue();
        } else {
            i = 0;
        }
        TextView textView = this.f59099b.f91367c;
        Resources resources = this.itemView.getContext().getResources();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        Double r = a.mo115951r();
        if (r != null) {
            str = C28782t.m119105b(r);
        } else {
            str = null;
        }
        objArr[1] = str;
        textView.setText(resources.getQuantityString(R.plurals.basket_mixing_discount_message, i, objArr));
        TextView textView2 = this.f59099b.f91366b;
        Iterable<OfferProductModel> b = offerMixingModel.mo121719b();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(b, 10));
        for (OfferProductModel p0 : b) {
            arrayList.add(Integer.valueOf(p0.mo121519p0()));
        }
        textView2.setText(String.valueOf(CollectionsKt___CollectionsKt.m40714x5(arrayList)));
        View view = this.f59099b.f91368d;
        if (getBindingAdapterPosition() == 0) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    @C12579k
    /* renamed from: d */
    public final C36773n4 mo68364d() {
        return this.f59099b;
    }
}
