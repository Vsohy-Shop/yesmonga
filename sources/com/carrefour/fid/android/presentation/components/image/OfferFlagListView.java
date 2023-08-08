package com.carrefour.fid.android.presentation.components.image;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0364q;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0007¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/image/OfferFlagListView;", "Landroid/widget/LinearLayout;", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "flags", "Lcom/carrefour/fid/android/presentation/components/image/OfferFlagListView$a;", "flagClickedListener", "", "dimensionResId", "marginResId", "Lkotlin/d2;", "b", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOfferFlagListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferFlagListView.kt\ncom/carrefour/fid/android/presentation/components/image/OfferFlagListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1855#2,2:76\n*S KotlinDebug\n*F\n+ 1 OfferFlagListView.kt\ncom/carrefour/fid/android/presentation/components/image/OfferFlagListView\n*L\n38#1:76,2\n*E\n"})
public final class OfferFlagListView extends LinearLayout {

    /* renamed from: a */
    public static final int f97171a = 0;

    /* renamed from: com.carrefour.fid.android.presentation.components.image.OfferFlagListView$a */
    public interface C38373a {
        /* renamed from: a */
        void mo121238a(@C12579k OfferFlag offerFlag);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OfferFlagListView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: c */
    public static /* synthetic */ void m158880c(OfferFlagListView offerFlagListView, List list, C38373a aVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            aVar = null;
        }
        if ((i3 & 4) != 0) {
            i = R.dimen.ds_spacing_m;
        }
        if ((i3 & 8) != 0) {
            i2 = R.dimen.ds_spacing_xxxs;
        }
        offerFlagListView.mo121237b(list, aVar, i, i2);
    }

    /* renamed from: d */
    public static final void m158881d(C38373a aVar, OfferFlag offerFlag, View view) {
        Intrinsics.checkNotNullParameter(offerFlag, "$flag");
        if (aVar != null) {
            aVar.mo121238a(offerFlag);
        }
    }

    /* renamed from: b */
    public final void mo121237b(@C12580l List<? extends OfferFlag> list, @C12580l C38373a aVar, @C0364q int i, @C0364q int i2) {
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
                    imageView.setOnClickListener(new C38374a(aVar, offerFlag));
                    if (offerFlag.mo118128y() != 0) {
                        String string = imageView.getContext().getString(R.string.accessibility_product_flag_prefix);
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
    public OfferFlagListView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferFlagListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public OfferFlagListView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setVisibility(8);
        setOrientation(0);
        setDividerPadding(getResources().getDimensionPixelSize(R.dimen.ds_spacing_xxs));
        setShowDividers(2);
    }
}
