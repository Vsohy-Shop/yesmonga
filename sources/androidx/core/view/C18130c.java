package androidx.core.view;

import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(16)
/* renamed from: androidx.core.view.c */
public final class C18130c {
    @C12579k

    /* renamed from: a */
    public static final C18130c f46747a = new C18130c();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m82297a(@C12579k View view, @C12579k Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(runnable, "action");
        view.postOnAnimationDelayed(runnable, j);
    }
}
