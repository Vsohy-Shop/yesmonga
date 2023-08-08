package com.carrefour.fid.android.presentation.components.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36864w5;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/home/CouponCardView;", "Landroid/widget/LinearLayout;", "", "couponNumber", "Lkotlin/d2;", "b", "a", "", "isGrey", "setBackground", "e", "c", "d", "Lcom/carrefour/fid/android/databinding/w5;", "Lcom/carrefour/fid/android/databinding/w5;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CouponCardView extends LinearLayout {

    /* renamed from: b */
    public static final int f97153b = 8;
    @C12579k

    /* renamed from: a */
    public final C36864w5 f97154a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CouponCardView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo121224a() {
        this.f97154a.f91858c.setVisibility(0);
        this.f97154a.f91859d.setVisibility(4);
        this.f97154a.f91861f.setVisibility(0);
        this.f97154a.f91860e.setVisibility(0);
        this.f97154a.f91862g.setVisibility(8);
        this.f97154a.f91858c.setBackgroundResource(R.drawable.background_light_gray_circle);
    }

    /* renamed from: b */
    public final void mo121225b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "couponNumber");
        this.f97154a.f91858c.setVisibility(0);
        this.f97154a.f91862g.setText(str);
        this.f97154a.f91859d.setVisibility(0);
        this.f97154a.f91861f.setVisibility(4);
        this.f97154a.f91860e.setVisibility(8);
        this.f97154a.f91862g.setVisibility(0);
        this.f97154a.f91858c.setBackgroundResource(R.drawable.background_yellow_circle);
        mo121227d();
    }

    /* renamed from: c */
    public final void mo121226c() {
        ShimmerFrameLayout shimmerFrameLayout = this.f97154a.f91857b;
        shimmerFrameLayout.setVisibility(8);
        shimmerFrameLayout.mo36997h();
    }

    /* renamed from: d */
    public final void mo121227d() {
        CharSequence text = this.f97154a.f91862g.getText();
        String string = getContext().getString(R.string.accessibility_loyalty_open_coupons_page);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…oyalty_open_coupons_page)");
        TextView textView = this.f97154a.f91862g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.numberOfCoupon");
        ViewKt.m152121c(textView, text + ". " + string, false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo121228e() {
        this.f97154a.f91858c.setVisibility(8);
        this.f97154a.f91859d.setVisibility(4);
        this.f97154a.f91861f.setVisibility(4);
        this.f97154a.f91860e.setVisibility(8);
        this.f97154a.f91861f.setVisibility(4);
        ShimmerFrameLayout shimmerFrameLayout = this.f97154a.f91857b;
        shimmerFrameLayout.setVisibility(0);
        shimmerFrameLayout.mo36996g();
    }

    public final void setBackground(boolean z) {
        setBackgroundResource(z ? R.drawable.background_grey_card : R.drawable.background_white_card);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CouponCardView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CouponCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CouponCardView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36864w5 b = C36864w5.m151174b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f97154a = b;
        setOrientation(1);
        setGravity(1);
        setBackgroundResource(R.drawable.background_white_card);
    }
}
