package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27499l0;
import com.carrefour.fid.android.product.presentation.models.extensions.C27659c;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/views/QuantityView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/product/databinding/l0;", "getViewBinding", "Lcom/carrefour/fid/android/domain/models/offer/Offer;", "offer", "", "isLoading", "Lkotlin/d2;", "x", "v", "enabled", "setEnabled", "a", "Lcom/carrefour/fid/android/product/databinding/l0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nQuantityView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuantityView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/QuantityView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,106:1\n283#2,2:107\n262#2,2:109\n262#2,2:111\n*S KotlinDebug\n*F\n+ 1 QuantityView.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/QuantityView\n*L\n28#1:107,2\n29#1:109,2\n87#1:111,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.QuantityView */
public final class QuantityView extends ConstraintLayout {

    /* renamed from: b */
    public static final int f67734b = 8;
    @C12579k

    /* renamed from: a */
    public final C27499l0 f67735a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public QuantityView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: w */
    public static final void m117254w(QuantityView quantityView, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(quantityView, "this$0");
        ProgressBar progressBar = quantityView.f67735a.f66717d;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressProductQuantity");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: y */
    public static /* synthetic */ void m117255y(QuantityView quantityView, Offer offer, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        quantityView.mo81308x(offer, z);
    }

    @C12579k
    public final C27499l0 getViewBinding() {
        return this.f67735a;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f67735a.f66715b.setEnabled(z);
        this.f67735a.f66716c.setEnabled(z);
        this.f67735a.f66720g.setEnabled(z);
        if (z) {
            CharSequence text = this.f67735a.f66718e.getText();
            Intrinsics.checkNotNullExpressionValue(text, "binding.textProductQuantityDiscount.text");
            if (!C11622t.isBlank(text)) {
                TextView textView = this.f67735a.f66718e;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.textProductQuantityDiscount");
                ViewKt.m152123e(textView, Integer.valueOf(C27609f.C27610a.fade_in_scaled), false, (C11289a) null, 6, (Object) null);
                return;
            }
        }
        this.f67735a.f66718e.setVisibility(4);
    }

    /* renamed from: v */
    public final boolean mo81307v(boolean z) {
        return post(new C27933h(this, z));
    }

    /* renamed from: x */
    public final void mo81308x(@C12580l Offer offer, boolean z) {
        boolean z2;
        if (offer == null || !offer.mo118019a0()) {
            setVisibility(8);
            setEnabled(false);
            mo81307v(false);
        } else if (offer.mo118012U() > 0 || z) {
            int U = offer.mo118012U();
            int M = offer.mo118004M();
            if (M < 0 || M > U) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                this.f67735a.f66715b.setVisibility(8);
                this.f67735a.f66719f.setVisibility(0);
                TextView textView = this.f67735a.f66718e;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                textView.setText(C27659c.m116369g(offer, context));
                this.f67735a.f66720g.setText(String.valueOf(offer.mo118004M()));
                setVisibility(0);
                setEnabled(true);
                mo81307v(z);
            } else if (z) {
                mo81307v(true);
                this.f67735a.f66715b.setEnabled(false);
                this.f67735a.f66716c.setEnabled(false);
                this.f67735a.f66720g.setText("");
            } else {
                this.f67735a.f66715b.setVisibility(0);
                this.f67735a.f66719f.setVisibility(8);
                TextView textView2 = this.f67735a.f66718e;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
                textView2.setText(C27659c.m116369g(offer, context2));
                this.f67735a.f66720g.setText(String.valueOf(offer.mo118012U()));
                setVisibility(0);
                setEnabled(true);
                mo81307v(z);
            }
        } else {
            setVisibility(4);
            setEnabled(false);
            mo81307v(false);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public QuantityView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuantityView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public QuantityView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C27499l0 b = C27499l0.m115718b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.f67735a = b;
        int i2 = 0;
        setVisibility(isInEditMode() ^ true ? 4 : 0);
        ProgressBar progressBar = b.f66717d;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressProductQuantity");
        progressBar.setVisibility(!isInEditMode() ? 8 : i2);
    }
}
