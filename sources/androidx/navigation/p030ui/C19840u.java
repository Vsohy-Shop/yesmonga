package androidx.navigation.p030ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.C0324b1;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.C20629k0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.navigation.ui.u */
public final class C19840u extends C19809a {
    @C12579k

    /* renamed from: f */
    public final WeakReference<Toolbar> f50704f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19840u(@org.jetbrains.annotations.C12579k androidx.appcompat.widget.Toolbar r3, @org.jetbrains.annotations.C12579k androidx.navigation.p030ui.C19812d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "toolbar.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.f50704f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p030ui.C19840u.<init>(androidx.appcompat.widget.Toolbar, androidx.navigation.ui.d):void");
    }

    /* renamed from: a */
    public void mo58177a(@C12579k NavController navController, @C12579k NavDestination navDestination, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(navController, "controller");
        Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
        if (this.f50704f.get() == null) {
            navController.mo58100G0(this);
        } else {
            super.mo58177a(navController, navDestination, bundle);
        }
    }

    /* renamed from: c */
    public void mo58599c(@C12580l Drawable drawable, @C0324b1 int i) {
        boolean z;
        Toolbar toolbar = this.f50704f.get();
        if (toolbar != null) {
            if (drawable != null || toolbar.getNavigationIcon() == null) {
                z = false;
            } else {
                z = true;
            }
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i);
            if (z) {
                C20629k0.m95931a(toolbar);
            }
        }
    }

    /* renamed from: d */
    public void mo58600d(@C12580l CharSequence charSequence) {
        Toolbar toolbar = this.f50704f.get();
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }
}
