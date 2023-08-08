package com.usabilla.sdk.ubform.sdk.field.view.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.view.common.a */
public interface C10038a {

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.common.a$a */
    public static final class C10039a {
        @C12579k
        /* renamed from: a */
        public static Drawable m37930a(@C12579k C10038a aVar, @C12579k UbInternalTheme ubInternalTheme, @C12579k Context context) {
            Intrinsics.checkNotNullParameter(aVar, "this");
            Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_border_stroke), ubInternalTheme.getColors().getHint());
            gradientDrawable.setCornerRadius((float) context.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_border_radius));
            gradientDrawable.setColor(0);
            return gradientDrawable;
        }
    }

    @C12579k
    /* renamed from: f */
    Drawable mo21058f(@C12579k UbInternalTheme ubInternalTheme, @C12579k Context context);
}
