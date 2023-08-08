package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.adapters;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39424o;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.views.C39539a;
import com.carrefour.fid.android.catalogs.utils.C39708a;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogArea;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogHeaderDetails;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogPage;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23948c;
import com.ortiz.touchview.TouchImageView;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCatalogPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogPageAdapter.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/pager/adapters/CatalogPageAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.adapters.CatalogPageAdapter */
public final class CatalogPageAdapter extends RecyclerView.Adapter<C39535a> {
    @C12579k

    /* renamed from: a */
    public final CatalogFullDetails f101064a;
    @C12579k

    /* renamed from: b */
    public final C11300l<CatalogProduct, C11079d2> f101065b;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.adapters.CatalogPageAdapter$a */
    public final class C39535a extends RecyclerView.C20061e0 {
        @C12579k

        /* renamed from: a */
        public final C39424o f101066a;

        /* renamed from: b */
        public final /* synthetic */ CatalogPageAdapter f101067b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39535a(@C12579k CatalogPageAdapter catalogPageAdapter, C39424o oVar) {
            super(oVar.getRoot());
            Intrinsics.checkNotNullParameter(oVar, "binding");
            this.f101067b = catalogPageAdapter;
            this.f101066a = oVar;
        }

        /* renamed from: c */
        public final void mo130714c(int i) {
            String str;
            CatalogPage a = C39708a.m162160a(this.f101067b.f101064a.mo117138i(), String.valueOf(i + 1));
            if (a != null) {
                str = a.mo117194h();
            } else {
                str = null;
            }
            C22038b.m100351F(this.f101066a.f100891b).mo65605u(str).mo65688b(new C22561h().mo66763S0(C39364b.C39372h.ic_placeholder_cata)).mo65675K1(this.f101066a.f100891b);
        }

        @C12579k
        /* renamed from: d */
        public final C39424o mo130715d() {
            return this.f101066a;
        }
    }

    public CatalogPageAdapter(@C12579k CatalogFullDetails catalogFullDetails, @C12579k C11300l<? super CatalogProduct, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(catalogFullDetails, C23948c.f60118a);
        Intrinsics.checkNotNullParameter(lVar, C10108c.f27778C);
        this.f101064a = catalogFullDetails;
        this.f101065b = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r5 != 2) goto L_0x0036;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m161842p(com.ortiz.touchview.TouchImageView r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            java.lang.String r0 = "$this_apply"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r5.getPointerCount()
            r1 = 1
            r2 = 2
            if (r0 >= r2) goto L_0x001a
            boolean r0 = r3.canScrollHorizontally(r1)
            if (r0 == 0) goto L_0x0036
            r0 = -1
            boolean r0 = r3.canScrollHorizontally(r0)
            if (r0 == 0) goto L_0x0036
        L_0x001a:
            int r5 = r5.getAction()
            r0 = 0
            if (r5 == 0) goto L_0x002e
            if (r5 == r1) goto L_0x0026
            if (r5 == r2) goto L_0x002e
            goto L_0x0036
        L_0x0026:
            android.view.ViewParent r3 = r3.getParent()
            r3.requestDisallowInterceptTouchEvent(r0)
            goto L_0x0036
        L_0x002e:
            android.view.ViewParent r3 = r3.getParent()
            r3.requestDisallowInterceptTouchEvent(r1)
            r1 = r0
        L_0x0036:
            r4.performClick()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.adapters.CatalogPageAdapter.m161842p(com.ortiz.touchview.TouchImageView, android.view.View, android.view.MotionEvent):boolean");
    }

    public int getItemCount() {
        String x;
        CatalogHeaderDetails g = this.f101064a.mo117135g();
        if (g == null || (x = g.mo117179x()) == null) {
            return 0;
        }
        return Integer.parseInt(x);
    }

    /* renamed from: n */
    public final CatalogArea mo130709n(CatalogPage catalogPage, float f, float f2, int i, int i2) {
        for (CatalogArea next : catalogPage.mo117192f()) {
            if (new Rect(C11409d.m43851L0(((float) (next.mo117106i() * i)) / 100.0f), C11409d.m43851L0(((float) (next.mo117107j() * i2)) / 100.0f), C11409d.m43851L0(((float) ((next.mo117106i() + next.getWidth()) * i)) / 100.0f), C11409d.m43851L0(((float) ((next.mo117107j() + next.getHeight()) * i2)) / 100.0f)).contains(C11409d.m43851L0(f), C11409d.m43851L0(f2))) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final void mo130710o(TouchImageView touchImageView) {
        touchImageView.setOnTouchListener(new C39536a(touchImageView));
    }

    /* renamed from: q */
    public void onBindViewHolder(@C12579k C39535a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        CatalogPage a = C39708a.m162160a(this.f101064a.mo117138i(), String.valueOf(i + 1));
        aVar.mo130714c(i);
        TouchImageView touchImageView = aVar.mo130715d().f100891b;
        Intrinsics.checkNotNullExpressionValue(touchImageView, "onBindViewHolder$lambda$1");
        C39539a.m161853a(touchImageView, new CatalogPageAdapter$onBindViewHolder$1$1(this, a, touchImageView));
    }

    @C12579k
    /* renamed from: r */
    public C39535a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C39424o d = C39424o.m161587d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        C39535a aVar = new C39535a(this, d);
        TouchImageView touchImageView = aVar.mo130715d().f100891b;
        Intrinsics.checkNotNullExpressionValue(touchImageView, "binding.pageImageView");
        mo130710o(touchImageView);
        return aVar;
    }

    /* renamed from: s */
    public final void mo130713s(CatalogPage catalogPage, TouchImageView touchImageView, MotionEvent motionEvent) {
        int i;
        int i2;
        CatalogProduct h;
        Matrix imageMatrix = touchImageView.getImageMatrix();
        if (imageMatrix != null) {
            float[] fArr = new float[9];
            imageMatrix.getValues(fArr);
            float currentZoom = touchImageView.getCurrentZoom();
            float f = fArr[2];
            float f2 = fArr[5];
            float x = (motionEvent.getX() - f) / currentZoom;
            float y = (motionEvent.getY() - f2) / currentZoom;
            if (catalogPage != null) {
                Drawable drawable = touchImageView.getDrawable();
                if (drawable != null) {
                    i = drawable.getIntrinsicWidth();
                } else {
                    i = 0;
                }
                Drawable drawable2 = touchImageView.getDrawable();
                if (drawable2 != null) {
                    i2 = drawable2.getIntrinsicHeight();
                } else {
                    i2 = 0;
                }
                CatalogArea n = mo130709n(catalogPage, x, y, i, i2);
                if (n != null && (h = n.mo117104h()) != null) {
                    this.f101065b.invoke(h);
                }
            }
        }
    }
}
