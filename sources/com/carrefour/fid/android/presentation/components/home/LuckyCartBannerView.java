package com.carrefour.fid.android.presentation.components.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.request.target.C22568e;
import com.bumptech.glide.request.transition.C22598f;
import com.carrefour.fid.android.databinding.C36805q6;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/home/LuckyCartBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/presentation/models/LuckyCartBannerModel;", "banner", "Lkotlin/Function0;", "Lkotlin/d2;", "clickCallback", "w", "Lcom/carrefour/fid/android/databinding/q6;", "a", "Lcom/carrefour/fid/android/databinding/q6;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class LuckyCartBannerView extends ConstraintLayout {

    /* renamed from: b */
    public static final int f97159b = 8;
    @C12579k

    /* renamed from: a */
    public final C36805q6 f97160a;

    /* renamed from: com.carrefour.fid.android.presentation.components.home.LuckyCartBannerView$a */
    public static final class C38369a extends C22568e<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ LuckyCartBannerView f97161d;

        public C38369a(LuckyCartBannerView luckyCartBannerView) {
            this.f97161d = luckyCartBannerView;
        }

        /* renamed from: e */
        public void mo65592l(@C12579k Drawable drawable, @C12580l C22598f<? super Drawable> fVar) {
            Intrinsics.checkNotNullParameter(drawable, "resource");
            this.f97161d.f97160a.f91544b.setImageDrawable(drawable);
            this.f97161d.setVisibility(0);
        }

        /* renamed from: k */
        public void mo65591k(@C12580l Drawable drawable) {
        }

        /* renamed from: o */
        public void mo65594o(@C12580l Drawable drawable) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LuckyCartBannerView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: x */
    public static final void m158873x(LuckyCartBannerModel luckyCartBannerModel, C11289a aVar, View view) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "$clickCallback");
        if (luckyCartBannerModel != null) {
            str = luckyCartBannerModel.getQuery();
        } else {
            str = null;
        }
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            aVar.invoke();
        }
    }

    /* renamed from: w */
    public final void mo121233w(@C12580l LuckyCartBannerModel luckyCartBannerModel, @C12579k C11289a<C11079d2> aVar) {
        String str;
        Intrinsics.checkNotNullParameter(aVar, "clickCallback");
        C22092j E = C22038b.m100350E(getContext());
        if (luckyCartBannerModel != null) {
            str = luckyCartBannerModel.getImageUrl();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        ((C22090i) E.mo65605u(str).mo66732A(C22234h.f57123a)).mo65672H1(new C38369a(this));
        this.f97160a.f91544b.setOnClickListener(new C38372c(luckyCartBannerModel, aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LuckyCartBannerView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LuckyCartBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public LuckyCartBannerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36805q6 b = C36805q6.m150946b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f97160a = b;
    }
}
