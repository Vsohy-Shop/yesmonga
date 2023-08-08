package com.carrefour.fid.android.shared.extension;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.design.components.widgets.C37248j0;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.C28444b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.extension.l */
public final class C28765l {
    /* renamed from: a */
    public static final void m119073a(@C12579k C37185a<?> aVar, @C12579k NotificationComponent.Variant variant, @C12579k String str) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(str, "message");
        Context context = aVar.getContext();
        if (context != null) {
            NotificationComponent.C37156a aVar2 = new NotificationComponent.C37156a(str, (String) null, (String) null, false);
            NotificationComponent notificationComponent = new NotificationComponent(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            notificationComponent.mo112945y(variant);
            notificationComponent.mo112943w(aVar2);
            View view = aVar.getView();
            if (view != null && (frameLayout = (FrameLayout) view.findViewById(C28444b.C28454j.backdrop_fragment_container)) != null) {
                Intrinsics.checkNotNullExpressionValue(frameLayout, "snackbarContainer");
                C37248j0.f93415K.mo113416b(frameLayout, notificationComponent, 0).mo91151g0();
            }
        }
    }
}
