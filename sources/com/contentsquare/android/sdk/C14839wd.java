package com.contentsquare.android.sdk;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.wd */
public final class C14839wd {

    /* renamed from: a */
    public final C14453jf f36818a = new C14453jf("CanDrawOverlaysWorkAround");

    /* renamed from: b */
    public final C14840a f36819b = new C14840a();

    /* renamed from: com.contentsquare.android.sdk.wd$a */
    public static final class C14840a {
        /* renamed from: a */
        public final boolean mo36771a(Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return Settings.canDrawOverlays(context);
        }
    }

    /* renamed from: a */
    public final boolean mo36770a(Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27) {
            return this.f36819b.mo36771a(context);
        }
        if (this.f36819b.mo36771a(context)) {
            return true;
        }
        try {
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                WindowManager windowManager = (WindowManager) systemService;
                View view = new View(context);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, 2038, 16, -2);
                view.setLayoutParams(layoutParams);
                windowManager.addView(view, layoutParams);
                windowManager.removeView(view);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        } catch (WindowManager.BadTokenException e) {
            this.f36818a.mo35678g(e, "Failed to draw overlay", new Object[0]);
            return false;
        } catch (WindowManager.InvalidDisplayException e2) {
            this.f36818a.mo35678g(e2, "Failed to draw overlay", new Object[0]);
            return false;
        }
    }
}
