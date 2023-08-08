package com.usabilla.sdk.ubform.sdk;

import android.content.Context;
import android.widget.Toast;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.c */
public final class C9927c {
    @C12579k

    /* renamed from: a */
    public static final C9927c f27338a = new C9927c();
    @C12580l

    /* renamed from: b */
    public static Toast f27339b;

    /* renamed from: c */
    public static /* synthetic */ void m37434c(C9927c cVar, Context context, CharSequence charSequence, int i, BannerPosition bannerPosition, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            bannerPosition = BannerPosition.BOTTOM;
        }
        cVar.mo20738b(context, charSequence, i, bannerPosition);
    }

    /* renamed from: a */
    public final void mo20737a() {
        Toast toast = f27339b;
        if (toast != null) {
            toast.cancel();
        }
        f27339b = null;
    }

    /* renamed from: b */
    public final void mo20738b(@C12579k Context context, @C12579k CharSequence charSequence, int i, @C12580l BannerPosition bannerPosition) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Toast makeText = Toast.makeText(context, charSequence, i);
        if (BannerPosition.TOP == bannerPosition) {
            makeText.setGravity(48, 0, context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_toast_vertical_offset));
        }
        f27339b = makeText;
        if (makeText != null) {
            makeText.show();
        }
    }
}
