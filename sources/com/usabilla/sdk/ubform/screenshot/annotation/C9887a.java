package com.usabilla.sdk.ubform.screenshot.annotation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.screenshot.annotation.view.UbAnnotationCanvasView;
import com.usabilla.sdk.ubform.screenshot.annotation.view.UbDraftView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.a */
public interface C9887a {

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.a$a */
    public static final class C9888a {
        /* renamed from: a */
        public static void m37124a(@C12579k C9887a aVar, @C12579k Context context) {
            View view;
            UbDraft d;
            C9898h hVar;
            Intrinsics.checkNotNullParameter(aVar, "this");
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            C9893d<?> currentAnnotationPlugin = aVar.getCurrentAnnotationPlugin();
            if (currentAnnotationPlugin != null) {
                currentAnnotationPlugin.mo20464k();
            }
            C9893d<?> currentAnnotationPlugin2 = aVar.getCurrentAnnotationPlugin();
            if (!(currentAnnotationPlugin2 == null || (d = currentAnnotationPlugin2.mo20457d()) == null)) {
                Rect imagePreviewBounds = aVar.getImagePreviewBounds();
                UbDraftView ubDraftView = new UbDraftView(context, d);
                ubDraftView.setLayoutParams(new UbAnnotationCanvasView.C9904a(0, 0, ((int) d.mo20438j()) + imagePreviewBounds.left, imagePreviewBounds.top + ((int) d.mo20440l()), 3, (DefaultConstructorMarker) null));
                C9893d<?> currentAnnotationPlugin3 = aVar.getCurrentAnnotationPlugin();
                if (currentAnnotationPlugin3 instanceof C9898h) {
                    hVar = (C9898h) currentAnnotationPlugin3;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    ubDraftView.setTag(hVar.mo20473j());
                }
                aVar.getMainDrawingView().addView(ubDraftView);
            }
            UbAnnotationCanvasView mainDrawingView = aVar.getMainDrawingView();
            C9893d<?> currentAnnotationPlugin4 = aVar.getCurrentAnnotationPlugin();
            if (currentAnnotationPlugin4 == null) {
                view = null;
            } else {
                view = currentAnnotationPlugin4.getView();
            }
            mainDrawingView.removeView(view);
            C9893d<?> currentAnnotationPlugin5 = aVar.getCurrentAnnotationPlugin();
            if (currentAnnotationPlugin5 != null) {
                currentAnnotationPlugin5.mo20458f();
            }
            aVar.setCurrentAnnotationPlugin((C9893d<?>) null);
            aVar.mo20394a();
        }

        @C12579k
        /* renamed from: b */
        public static Rect m37125b(@C12579k C9887a aVar) {
            Rect rect;
            Intrinsics.checkNotNullParameter(aVar, "this");
            Drawable drawable = aVar.getImagePreview().getDrawable();
            if (drawable == null) {
                rect = null;
            } else {
                rect = drawable.getBounds();
            }
            if (rect == null) {
                rect = new Rect();
            }
            RectF rectF = new RectF(rect);
            aVar.getImagePreview().getImageMatrix().mapRect(rectF);
            rectF.round(rect);
            return rect;
        }

        /* renamed from: c */
        public static void m37126c(@C12579k C9887a aVar, @C12579k View view, @C12579k Rect rect) {
            Intrinsics.checkNotNullParameter(aVar, "this");
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(rect, "bounds");
            view.setLayoutParams(new UbAnnotationCanvasView.C9904a(rect.width(), rect.height(), rect.left, rect.top));
            aVar.getMainDrawingView().addView(view);
        }

        /* renamed from: d */
        public static void m37127d(@C12579k C9887a aVar, @C12579k Context context, @C12579k C9893d<?> dVar) {
            Intrinsics.checkNotNullParameter(aVar, "this");
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(dVar, "annotationPlugin");
            aVar.setCurrentAnnotationPlugin(dVar);
            aVar.mo20397d(dVar.mo20459g(context), aVar.getImagePreviewBounds());
            aVar.mo20398e(dVar.mo20454a());
            aVar.mo20399f(dVar.mo20455b());
        }
    }

    /* renamed from: a */
    void mo20394a();

    /* renamed from: b */
    void mo20395b(@C12579k Context context, @C12579k C9893d<?> dVar);

    /* renamed from: c */
    void mo20396c(@C12579k Context context);

    /* renamed from: d */
    void mo20397d(@C12579k View view, @C12579k Rect rect);

    /* renamed from: e */
    void mo20398e(@C12579k UbAnnotationMenu<?> ubAnnotationMenu);

    /* renamed from: f */
    void mo20399f(@C12579k UbAnnotationFlowCommand ubAnnotationFlowCommand);

    @C12579k
    List<C9893d<?>> getAnnotationPlugins();

    @C12580l
    C9893d<?> getCurrentAnnotationPlugin();

    @C12579k
    ImageView getImagePreview();

    @C12579k
    Rect getImagePreviewBounds();

    @C12579k
    UbAnnotationCanvasView getMainDrawingView();

    void setCurrentAnnotationPlugin(@C12580l C9893d<?> dVar);
}
