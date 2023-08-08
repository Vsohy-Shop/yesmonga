package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.C0696c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(24)
/* renamed from: androidx.window.layout.a */
public final class C21039a {
    @C12579k

    /* renamed from: a */
    public static final C21039a f54271a = new C21039a();

    /* renamed from: a */
    public final boolean mo62962a(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        return activity.isInMultiWindowMode();
    }
}
