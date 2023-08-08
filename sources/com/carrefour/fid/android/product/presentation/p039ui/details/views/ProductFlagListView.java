package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0364q;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.product.C27609f;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0007¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/views/ProductFlagListView;", "Landroid/widget/LinearLayout;", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "flags", "Lcom/carrefour/fid/android/product/presentation/ui/details/views/ProductFlagListView$a;", "flagClickedListener", "", "dimensionResId", "marginResId", "Lkotlin/d2;", "b", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nProductFlagListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductFlagListView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductFlagListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1855#2,2:75\n*S KotlinDebug\n*F\n+ 1 ProductFlagListView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/ProductFlagListView\n*L\n37#1:75,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductFlagListView */
public final class ProductFlagListView extends LinearLayout {

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductFlagListView$a */
    public interface C27921a {
        /* renamed from: a */
        void mo80597a(@C12579k OfferFlag offerFlag);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductFlagListView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: c */
    public static /* synthetic */ void m117232c(ProductFlagListView productFlagListView, List list, C27921a aVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            aVar = null;
        }
        if ((i3 & 4) != 0) {
            i = C27609f.C27616g.ds_spacing_m;
        }
        if ((i3 & 8) != 0) {
            i2 = C27609f.C27616g.ds_spacing_xxxs;
        }
        productFlagListView.mo81293b(list, aVar, i, i2);
    }

    /* renamed from: d */
    public static final void m117233d(C27921a aVar, OfferFlag offerFlag, View view) {
        Intrinsics.checkNotNullParameter(offerFlag, "$flag");
        if (aVar != null) {
            aVar.mo80597a(offerFlag);
        }
    }

    /* renamed from: b */
    public final void mo81293b(@C12580l List<? extends OfferFlag> list, @C12580l C27921a aVar, @C0364q int i, @C0364q int i2) {
        removeAllViews();
        if (isShown()) {
            setVisibility(8);
        }
        if (list != null) {
            for (OfferFlag offerFlag : list) {
                if (offerFlag.mo118127w() != 0) {
                    ImageView imageView = new ImageView(getContext());
                    imageView.setImageResource(offerFlag.mo118127w());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(imageView.getContext().getResources().getDimensionPixelOffset(i), imageView.getContext().getResources().getDimensionPixelOffset(i));
                    layoutParams.setMarginEnd(imageView.getContext().getResources().getDimensionPixelOffset(i2));
                    imageView.setLayoutParams(layoutParams);
                    imageView.setOnClickListener(new C27930e(aVar, offerFlag));
                    if (offerFlag.mo118128y() != 0) {
                        String string = imageView.getContext().getString(C36896b.C36912p.accessibility_product_flag_prefix);
                        String string2 = imageView.getContext().getString(offerFlag.mo118128y());
                        imageView.setContentDescription(string + string2);
                    } else {
                        imageView.setImportantForAccessibility(2);
                    }
                    addView(imageView);
                }
            }
        }
        if (getChildCount() > 0) {
            setVisibility(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductFlagListView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductFlagListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductFlagListView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setVisibility(8);
        setOrientation(0);
        setDividerPadding(getResources().getDimensionPixelSize(C27609f.C27616g.ds_spacing_xxs));
        setShowDividers(2);
    }
}
