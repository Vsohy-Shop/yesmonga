package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.appcompat.widget.C0696c;
import androidx.window.core.C20992b;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C21052l;
import androidx.window.layout.C21059m;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.urbanairship.analytics.C35567m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.window.layout.k */
public final class C21051k {
    @C12579k

    /* renamed from: a */
    public static final C21051k f54284a = new C21051k();

    @C12580l
    /* renamed from: a */
    public final C21052l mo62979a(@C12579k Activity activity, @C12579k FoldingFeature foldingFeature) {
        C21059m.C21061b bVar;
        C21052l.C21057c cVar;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = C21059m.C21061b.f54301b.mo62995a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = C21059m.C21061b.f54301b.mo62996b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            cVar = C21052l.C21057c.f54294c;
        } else if (state != 2) {
            return null;
        } else {
            cVar = C21052l.C21057c.f54295d;
        }
        Rect bounds = foldingFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        if (!mo62981c(activity, new C20992b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
        return new C21059m(new C20992b(bounds2), bVar, cVar);
    }

    @C12579k
    /* renamed from: b */
    public final C21073t mo62980b(@C12579k Activity activity, @C12579k WindowLayoutInfo windowLayoutInfo) {
        C21052l lVar;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(windowLayoutInfo, C28531e0.f69094x);
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C21051k kVar = f54284a;
                Intrinsics.checkNotNullExpressionValue(foldingFeature, C35567m.f87870w);
                lVar = kVar.mo62979a(activity, foldingFeature);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return new C21073t(arrayList);
    }

    /* renamed from: c */
    public final boolean mo62981c(Activity activity, C20992b bVar) {
        Rect a = C21077x.f54327b.mo62954c(activity).mo63020a();
        if (bVar.mo62772h()) {
            return false;
        }
        if (bVar.mo62770f() != a.width() && bVar.mo62765b() != a.height()) {
            return false;
        }
        if (bVar.mo62770f() < a.width() && bVar.mo62765b() < a.height()) {
            return false;
        }
        if (bVar.mo62770f() == a.width() && bVar.mo62765b() == a.height()) {
            return false;
        }
        return true;
    }
}
