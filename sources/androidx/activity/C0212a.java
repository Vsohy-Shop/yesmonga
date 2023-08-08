package androidx.activity;

import android.view.View;
import androidx.annotation.C0376v0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(19)
/* renamed from: androidx.activity.a */
public final class C0212a {
    @C12579k

    /* renamed from: a */
    public static final C0212a f697a = new C0212a();

    /* renamed from: a */
    public final boolean mo786a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        return view.isAttachedToWindow();
    }
}
