package com.usabilla.sdk.ubform;

import android.app.Activity;
import android.graphics.Bitmap;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import com.usabilla.sdk.ubform.telemetry.ScreenshotOrigin;
import com.usabilla.sdk.ubform.utils.C10141h;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "Landroid/graphics/Bitmap;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$takeScreenshot$1 extends Lambda implements C11300l<C10110e, Bitmap> {
    final /* synthetic */ Activity $activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaInternal$takeScreenshot$1(Activity activity) {
        super(1);
        this.$activity = activity;
    }

    @C12580l
    /* renamed from: a */
    public final Bitmap invoke(@C12579k C10110e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "recorder");
        eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27793R, ScreenshotOrigin.ACTIVITY.mo21521q()));
        return C10141h.m38375a(this.$activity);
    }
}
