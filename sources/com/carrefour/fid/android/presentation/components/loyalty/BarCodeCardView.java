package com.carrefour.fid.android.presentation.components.loyalty;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.databinding.C36688f;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.utils.C22711j;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/loyalty/BarCodeCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "cardNumber", "", "isLandscape", "Lkotlin/d2;", "v", "x", "Lcom/carrefour/fid/android/databinding/f;", "a", "Lcom/carrefour/fid/android/databinding/f;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBarCodeCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarCodeCardView.kt\ncom/carrefour/fid/android/presentation/components/loyalty/BarCodeCardView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,88:1\n262#2,2:89\n*S KotlinDebug\n*F\n+ 1 BarCodeCardView.kt\ncom/carrefour/fid/android/presentation/components/loyalty/BarCodeCardView\n*L\n54#1:89,2\n*E\n"})
public final class BarCodeCardView extends ConstraintLayout {

    /* renamed from: b */
    public static final int f97174b = 8;
    @C12579k

    /* renamed from: a */
    public final C36688f f97175a;

    /* renamed from: com.carrefour.fid.android.presentation.components.loyalty.BarCodeCardView$a */
    public /* synthetic */ class C38375a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.core.type.LoyaltyCardType[] r0 = com.carrefour.fid.android.core.type.LoyaltyCardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.FID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.PASS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.core.type.LoyaltyCardType r1 = com.carrefour.fid.android.core.type.LoyaltyCardType.NOT_EXIST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.components.loyalty.BarCodeCardView.C38375a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.components.loyalty.BarCodeCardView$b */
    public static final class C38376b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ BarCodeCardView f97176a;

        /* renamed from: b */
        public final /* synthetic */ String f97177b;

        /* renamed from: c */
        public final /* synthetic */ boolean f97178c;

        public C38376b(BarCodeCardView barCodeCardView, String str, boolean z) {
            this.f97176a = barCodeCardView;
            this.f97177b = str;
            this.f97178c = z;
        }

        public void onGlobalLayout() {
            boolean z;
            this.f97176a.f97175a.f90777c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f97177b.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Bitmap c = C22711j.m102880c(this.f97177b, 160, 78, 170, 77, LoyaltyConstantsKt.LOYALTY_MAX_WIDTH);
                if (!this.f97178c) {
                    LinearLayout linearLayout = this.f97176a.f97175a.f90776b;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.barcodeContainer");
                    ViewKt.m118983H(linearLayout, 50, 100, 50, 20);
                }
                if (c != null) {
                    this.f97176a.f97175a.f90777c.setImageBitmap(c);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BarCodeCardView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: w */
    public static /* synthetic */ void m158885w(BarCodeCardView barCodeCardView, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        barCodeCardView.mo121240v(str, z);
    }

    /* renamed from: v */
    public final void mo121240v(@C12579k String str, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        LoyaltyCardType.C36362a aVar = LoyaltyCardType.f89888a;
        LoyaltyUtils loyaltyUtils = LoyaltyUtils.INSTANCE;
        int i2 = C38375a.$EnumSwitchMapping$0[aVar.mo108568a(loyaltyUtils.getTypeCard(str)).ordinal()];
        if (i2 == 1 || i2 == 2) {
            C36688f fVar = this.f97175a;
            ImageView imageView = fVar.f90778d;
            LoyaltyCardType a = aVar.mo108568a(loyaltyUtils.getTypeCard(str));
            LoyaltyCardType loyaltyCardType = LoyaltyCardType.FID;
            if (a == loyaltyCardType) {
                i = loyaltyCardType.mo108565q();
            } else {
                i = LoyaltyCardType.PASS.mo108565q();
            }
            imageView.setImageResource(i);
            TextView textView = fVar.f90779e;
            textView.setText(str);
            Intrinsics.checkNotNullExpressionValue(textView, "buildViewWithCardNumber$lambda$1$lambda$0");
            C22757a.m102928b(textView);
            mo121241x(str, z);
        }
    }

    /* renamed from: x */
    public final void mo121241x(String str, boolean z) {
        LinearLayout linearLayout = this.f97175a.f90776b;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.barcodeContainer");
        linearLayout.setVisibility(0);
        this.f97175a.f90777c.getViewTreeObserver().addOnGlobalLayoutListener(new C38376b(this, str, z));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BarCodeCardView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BarCodeCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public BarCodeCardView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36688f b = C36688f.m150482b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f97175a = b;
    }
}
