package com.carrefour.fid.android.presentation.components.home;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36844u5;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.util.C28932h;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.urbanairship.iam.events.C9175a;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/home/CagnotteCardView;", "Landroid/widget/LinearLayout;", "", "solde", "", "isCardSecured", "isError", "Lkotlin/d2;", "a", "isGrey", "setBackground", "e", "isVisible", "setVisibilityErrorCagnotteRetry", "g", "f", "c", "d", "Lcom/carrefour/fid/android/databinding/u5;", "Lcom/carrefour/fid/android/databinding/u5;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCagnotteCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CagnotteCardView.kt\ncom/carrefour/fid/android/presentation/components/home/CagnotteCardView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,127:1\n283#2,2:128\n*S KotlinDebug\n*F\n+ 1 CagnotteCardView.kt\ncom/carrefour/fid/android/presentation/components/home/CagnotteCardView\n*L\n109#1:128,2\n*E\n"})
public final class CagnotteCardView extends LinearLayout {

    /* renamed from: b */
    public static final int f97151b = 8;
    @C12579k

    /* renamed from: a */
    public final C36844u5 f97152a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CagnotteCardView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: b */
    public static /* synthetic */ void m158850b(CagnotteCardView cagnotteCardView, double d, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        cagnotteCardView.mo121216a(d, z, z2);
    }

    /* renamed from: a */
    public final void mo121216a(double d, boolean z, boolean z2) {
        if (z2) {
            mo121221g(z);
            return;
        }
        mo121220f();
        String b = C28782t.m119105b(Double.valueOf(d));
        List split$default = StringsKt__StringsKt.split$default((CharSequence) b, new String[]{","}, false, 0, 6, (Object) null);
        SpannableString spannableString = new SpannableString(getContext().getString(R.string.home_solde, new Object[]{b}));
        if (((String) split$default.get(0)).length() >= 3) {
            spannableString.setSpan(new RelativeSizeSpan(1.2f), 0, ((String) split$default.get(0)).length(), 0);
            spannableString.setSpan(new RelativeSizeSpan(0.5f), ((String) split$default.get(0)).length(), b.length(), 0);
        } else {
            spannableString.setSpan(new RelativeSizeSpan(1.722f), 0, ((String) split$default.get(0)).length(), 0);
        }
        this.f97152a.f91765g.setText(spannableString);
        mo121218d();
    }

    /* renamed from: c */
    public final void mo121217c() {
        ShimmerFrameLayout shimmerFrameLayout = this.f97152a.f91760b;
        shimmerFrameLayout.setVisibility(8);
        shimmerFrameLayout.mo36997h();
    }

    /* renamed from: d */
    public final void mo121218d() {
        CharSequence text = this.f97152a.f91765g.getText();
        String string = getContext().getString(R.string.accessibility_loyalty_open_solde_page);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_loyalty_open_solde_page)");
        TextView textView = this.f97152a.f91765g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.soldeTextView");
        ViewKt.m152121c(textView, text + ". " + string, false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo121219e() {
        this.f97152a.f91764f.setVisibility(8);
        this.f97152a.f91765g.setVisibility(8);
        this.f97152a.f91761c.setVisibility(4);
        this.f97152a.f91762d.setVisibility(8);
        setVisibilityErrorCagnotteRetry(false);
        ShimmerFrameLayout shimmerFrameLayout = this.f97152a.f91760b;
        shimmerFrameLayout.setVisibility(0);
        shimmerFrameLayout.mo36996g();
    }

    /* renamed from: f */
    public final void mo121220f() {
        this.f97152a.f91764f.setVisibility(0);
        this.f97152a.f91765g.setVisibility(0);
        this.f97152a.f91761c.setVisibility(0);
        this.f97152a.f91762d.setVisibility(8);
        setVisibilityErrorCagnotteRetry(false);
        this.f97152a.f91764f.setBackgroundResource(R.drawable.background_light_blue_circle);
        mo121217c();
    }

    /* renamed from: g */
    public final void mo121221g(boolean z) {
        this.f97152a.f91764f.setVisibility(0);
        TextView textView = this.f97152a.f91762d;
        textView.setVisibility(0);
        if (!z) {
            textView.setText(textView.getContext().getString(R.string.empty_amount));
        }
        setVisibilityErrorCagnotteRetry(true);
        this.f97152a.f91765g.setVisibility(8);
        this.f97152a.f91761c.setVisibility(4);
        this.f97152a.f91764f.setBackgroundResource(R.drawable.background_light_gray_circle);
        mo121217c();
    }

    public final void setBackground(boolean z) {
        setBackgroundResource(z ? R.drawable.background_grey_card : R.drawable.background_white_card);
    }

    public final void setVisibilityErrorCagnotteRetry(boolean z) {
        int i;
        TextView textView = this.f97152a.f91763e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.errorCagnotteRetry");
        if (!z) {
            i = 4;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CagnotteCardView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CagnotteCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CagnotteCardView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36844u5 b = C36844u5.m151098b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f97152a = b;
        setOrientation(1);
        setGravity(1);
        setBackgroundResource(R.drawable.background_white_card);
        TextView textView = b.f91761c;
        C28932h.C28933a aVar = C28932h.f70914a;
        Date time = Calendar.getInstance().getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getInstance().time");
        textView.setText(context.getString(R.string.home_solde_date, new Object[]{aVar.mo84229T(time)}));
    }
}
