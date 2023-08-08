package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.C0696c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.activity.g */
public final class C0239g {
    @C12579k

    /* renamed from: a */
    public static final C0239g f734a = new C0239g();

    /* renamed from: a */
    public final void mo830a(@C12579k Activity activity, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(rect, "hint");
        C0238f.m1331a();
        activity.setPictureInPictureParams(C0237e.m1330a().setSourceRectHint(rect).build());
    }
}
