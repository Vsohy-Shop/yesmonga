package com.carrefour.fid.android.presentation.components.home;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.load.resource.bitmap.C22393a0;
import com.bumptech.glide.request.target.C22568e;
import com.bumptech.glide.request.transition.C22598f;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36798q;
import com.carrefour.fid.android.presentation.models.C38456d;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJH\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000228\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/components/home/CriteoMiniBannerView;", "Landroid/widget/LinearLayout;", "Lcom/carrefour/fid/android/presentation/models/d;", "criteoBannerModel", "Lkotlin/Function2;", "", "Lkotlin/n0;", "name", "redirectUrl", "onClickBeacon", "Lkotlin/d2;", "clickCallback", "c", "Landroid/graphics/Rect;", "scrollBounds", "", "e", "Lcom/carrefour/fid/android/databinding/q;", "a", "Lcom/carrefour/fid/android/databinding/q;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CriteoMiniBannerView extends LinearLayout {

    /* renamed from: b */
    public static final int f97155b = 8;
    @C12579k

    /* renamed from: a */
    public final C36798q f97156a;

    /* renamed from: com.carrefour.fid.android.presentation.components.home.CriteoMiniBannerView$a */
    public static final class C38368a extends C22568e<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ CriteoMiniBannerView f97157d;

        /* renamed from: e */
        public final /* synthetic */ C38456d f97158e;

        public C38368a(CriteoMiniBannerView criteoMiniBannerView, C38456d dVar) {
            this.f97157d = criteoMiniBannerView;
            this.f97158e = dVar;
        }

        /* renamed from: e */
        public void mo65592l(@C12579k Drawable drawable, @C12580l C22598f<? super Drawable> fVar) {
            Intrinsics.checkNotNullParameter(drawable, "resource");
            this.f97157d.f97156a.f91514b.setImageDrawable(drawable);
            this.f97157d.f97156a.f91515c.setText(this.f97158e.mo122027l());
            this.f97157d.setVisibility(0);
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
    public CriteoMiniBannerView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: d */
    public static final void m158864d(C38456d dVar, C11304p pVar, View view) {
        Intrinsics.checkNotNullParameter(dVar, "$criteoBannerModel");
        Intrinsics.checkNotNullParameter(pVar, "$clickCallback");
        String q = dVar.mo122032q();
        if (q != null) {
            pVar.invoke(q, dVar.mo122029n());
        }
    }

    /* renamed from: c */
    public final void mo121230c(@C12579k C38456d dVar, @C12579k C11304p<? super String, ? super String, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(dVar, "criteoBannerModel");
        Intrinsics.checkNotNullParameter(pVar, "clickCallback");
        float dimension = getContext().getResources().getDimension(R.dimen.ds_radius_l);
        ((C22090i) ((C22090i) C22038b.m100350E(getContext()).mo65605u(dVar.mo122026k()).mo66787f1(new C22393a0(dimension, dimension, 0.0f, 0.0f))).mo66732A(C22234h.f57124b)).mo65672H1(new C38368a(this, dVar));
        setOnClickListener(new C38371b(dVar, pVar));
    }

    /* renamed from: e */
    public final boolean mo121231e(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "scrollBounds");
        if (!getLocalVisibleRect(rect) || rect.height() < getHeight()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CriteoMiniBannerView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CriteoMiniBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CriteoMiniBannerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36798q b = C36798q.m150920b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f97156a = b;
        setOrientation(1);
        setBackgroundResource(R.drawable.background_criteo_banner);
    }
}
