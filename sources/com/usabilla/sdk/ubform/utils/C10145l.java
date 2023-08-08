package com.usabilla.sdk.ubform.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.widget.ImageView;
import com.android.volley.C21764n;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C21827r;
import com.usabilla.sdk.ubform.Logger;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.utils.l */
public final class C10145l implements Html.ImageGetter {
    @C12580l

    /* renamed from: a */
    public final C21764n f27907a;
    @C12579k

    /* renamed from: b */
    public final C11304p<C10146a, Bitmap, C11079d2> f27908b;

    /* renamed from: com.usabilla.sdk.ubform.utils.l$a */
    public static final class C10146a extends Drawable {
        @C12580l

        /* renamed from: a */
        public Drawable f27909a;

        @C12580l
        /* renamed from: a */
        public final Drawable mo21596a() {
            return this.f27909a;
        }

        /* renamed from: b */
        public final void mo21597b(@C12580l Drawable drawable) {
            int i;
            int i2;
            this.f27909a = drawable;
            if (drawable == null) {
                i = 0;
            } else {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable == null) {
                i2 = 0;
            } else {
                i2 = drawable.getIntrinsicHeight();
            }
            setBounds(0, 0, i, i2);
        }

        public void draw(@C12579k Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Drawable drawable = this.f27909a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }

        public int getOpacity() {
            return -1;
        }

        public void setAlpha(int i) {
            Drawable drawable = this.f27909a;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }

        public void setColorFilter(@C12580l ColorFilter colorFilter) {
            Drawable drawable = this.f27909a;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public C10145l(@C12580l C21764n nVar, @C12579k C11304p<? super C10146a, ? super Bitmap, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "onImageLoadedCallback");
        this.f27907a = nVar;
        this.f27908b = pVar;
    }

    /* renamed from: f */
    public static /* synthetic */ C10145l m38381f(C10145l lVar, C21764n nVar, C11304p<C10146a, Bitmap, C11079d2> pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            nVar = lVar.f27907a;
        }
        if ((i & 2) != 0) {
            pVar = lVar.f27908b;
        }
        return lVar.mo21591e(nVar, pVar);
    }

    /* renamed from: g */
    public static final void m38382g(C10145l lVar, C10146a aVar, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(lVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$drawable");
        C11304p<C10146a, Bitmap, C11079d2> pVar = lVar.f27908b;
        Intrinsics.checkNotNullExpressionValue(bitmap, "it");
        pVar.invoke(aVar, bitmap);
    }

    /* renamed from: h */
    public static final void m38383h(VolleyError volleyError) {
        Logger.f26647a.logError(Intrinsics.stringPlus("error loading image ", volleyError.getLocalizedMessage()));
    }

    /* renamed from: c */
    public final C21764n mo21589c() {
        return this.f27907a;
    }

    /* renamed from: d */
    public final C11304p<C10146a, Bitmap, C11079d2> mo21590d() {
        return this.f27908b;
    }

    @C12579k
    /* renamed from: e */
    public final C10145l mo21591e(@C12580l C21764n nVar, @C12579k C11304p<? super C10146a, ? super Bitmap, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "onImageLoadedCallback");
        return new C10145l(nVar, pVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10145l)) {
            return false;
        }
        C10145l lVar = (C10145l) obj;
        return Intrinsics.areEqual((Object) this.f27907a, (Object) lVar.f27907a) && Intrinsics.areEqual((Object) this.f27908b, (Object) lVar.f27908b);
    }

    @C12579k
    public Drawable getDrawable(@C12580l String str) {
        C21764n nVar;
        C10146a aVar = new C10146a();
        if (!(str == null || (nVar = this.f27907a) == null)) {
            nVar.mo64944a(new C21827r(str, new C10143j(this, aVar), 0, 0, ImageView.ScaleType.CENTER_CROP, Bitmap.Config.ARGB_8888, new C10144k()));
        }
        return aVar;
    }

    public int hashCode() {
        C21764n nVar = this.f27907a;
        return ((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f27908b.hashCode();
    }

    @C12579k
    public String toString() {
        return "UbImageGetter(requestQueue=" + this.f27907a + ", onImageLoadedCallback=" + this.f27908b + ')';
    }
}
