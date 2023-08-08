package com.carrefour.fid.android.presentation.components.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36835t6;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.product.adapter.C25415d;
import com.urbanairship.iam.events.C9175a;
import java.util.Timer;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u001c\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001e\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/overlay/OverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/d2;", "onDetachedFromWindow", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "Lcom/carrefour/fid/android/presentation/ui/product/adapter/d;", "overlayActionCallback", "", "F", "B", "z", "H", "a", "Lcom/carrefour/fid/android/presentation/ui/product/adapter/d;", "b", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "Ljava/util/Timer;", "c", "Ljava/util/Timer;", "timer", "Lcom/carrefour/fid/android/databinding/t6;", "d", "Lcom/carrefour/fid/android/databinding/t6;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "e", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayView.kt\ncom/carrefour/fid/android/presentation/components/overlay/OverlayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class OverlayView extends ConstraintLayout {
    @C12579k

    /* renamed from: e */
    public static final C38386a f97201e = new C38386a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f97202f = 8;

    /* renamed from: g */
    public static final long f97203g = 7000;
    @C12580l

    /* renamed from: a */
    public C25415d f97204a;
    @C12580l

    /* renamed from: b */
    public OfferProductModel f97205b;
    @C12580l

    /* renamed from: c */
    public Timer f97206c;
    @C12579k

    /* renamed from: d */
    public final C36835t6 f97207d;

    /* renamed from: com.carrefour.fid.android.presentation.components.overlay.OverlayView$a */
    public static final class C38386a {
        public /* synthetic */ C38386a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C38386a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OverlayView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static final void m158911A(OverlayView overlayView) {
        C25415d dVar;
        Intrinsics.checkNotNullParameter(overlayView, "this$0");
        OfferProductModel offerProductModel = overlayView.f97205b;
        if (!(offerProductModel == null || (dVar = overlayView.f97204a) == null)) {
            dVar.mo68189c(offerProductModel);
        }
        ViewKt.m152126h(overlayView, (Integer) null, 0, false, (C11289a) null, 15, (Object) null);
    }

    /* renamed from: C */
    public static /* synthetic */ void m158912C(OverlayView overlayView, OfferProductModel offerProductModel, C25415d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            offerProductModel = null;
        }
        overlayView.mo121263B(offerProductModel, dVar);
    }

    /* renamed from: D */
    public static final void m158913D(OverlayView overlayView, OfferProductModel offerProductModel, C25415d dVar, View view) {
        Intrinsics.checkNotNullParameter(overlayView, "this$0");
        Timer timer = overlayView.f97206c;
        if (timer != null) {
            timer.cancel();
        }
        overlayView.mo121267z();
        if (offerProductModel != null && dVar != null) {
            dVar.mo68188b(offerProductModel);
        }
    }

    /* renamed from: E */
    public static final void m158914E(OverlayView overlayView, OfferProductModel offerProductModel, C25415d dVar, View view) {
        Intrinsics.checkNotNullParameter(overlayView, "this$0");
        Timer timer = overlayView.f97206c;
        if (timer != null) {
            timer.cancel();
        }
        overlayView.mo121267z();
        if (offerProductModel != null && dVar != null) {
            dVar.mo68189c(offerProductModel);
        }
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m158915G(OverlayView overlayView, OfferProductModel offerProductModel, C25415d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            offerProductModel = null;
        }
        return overlayView.mo121264F(offerProductModel, dVar);
    }

    /* renamed from: B */
    public final void mo121263B(OfferProductModel offerProductModel, C25415d dVar) {
        if (offerProductModel != null) {
            OfferProductModelKt.m159564M(offerProductModel, this.f97207d.f91707d);
        }
        this.f97207d.f91707d.setTextColor(C17318d.m79723f(getContext(), R.color.ds_grey_white));
        this.f97207d.f91706c.setOnClickListener(new C38389b(this, offerProductModel, dVar));
        this.f97207d.f91705b.setOnClickListener(new C38390c(this, offerProductModel, dVar));
    }

    /* renamed from: F */
    public final boolean mo121264F(@C12580l OfferProductModel offerProductModel, @C12580l C25415d dVar) {
        this.f97204a = dVar;
        this.f97205b = offerProductModel;
        clearAnimation();
        mo121263B(offerProductModel, dVar);
        mo121265H();
        return true;
    }

    /* renamed from: H */
    public final void mo121265H() {
        ViewKt.m152123e(this, (Integer) null, false, new OverlayView$show$1(this), 3, (Object) null);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Timer timer = this.f97206c;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* renamed from: z */
    public final boolean mo121267z() {
        return post(new C38388a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OverlayView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public OverlayView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36835t6 d = C36835t6.m151063d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f97207d = d;
        setVisibility(8);
    }
}
