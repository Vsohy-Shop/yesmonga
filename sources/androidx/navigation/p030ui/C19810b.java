package androidx.navigation.p030ui;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0324b1;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0441a;
import androidx.appcompat.app.C0455b;
import androidx.appcompat.app.C0475e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.navigation.ui.b */
public final class C19810b extends C19809a {
    @C12579k

    /* renamed from: f */
    public final C0475e f50674f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19810b(@org.jetbrains.annotations.C12579k androidx.appcompat.app.C0475e r3, @org.jetbrains.annotations.C12579k androidx.navigation.p030ui.C19812d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.appcompat.app.b$b r0 = r3.mo1365b()
            if (r0 == 0) goto L_0x001f
            android.content.Context r0 = r0.mo1203d()
            java.lang.String r1 = "checkNotNull(activity.dr… }.actionBarThemedContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0, r4)
            r2.f50674f = r3
            return
        L_0x001f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Activity "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " does not have an DrawerToggleDelegate set"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p030ui.C19810b.<init>(androidx.appcompat.app.e, androidx.navigation.ui.d):void");
    }

    /* renamed from: c */
    public void mo58599c(@C12580l Drawable drawable, @C0324b1 int i) {
        boolean z;
        C0441a B0 = this.f50674f.mo1473B0();
        if (B0 != null) {
            if (drawable != null) {
                z = true;
            } else {
                z = false;
            }
            B0.mo1268Y(z);
            C0455b.C0457b b = this.f50674f.mo1365b();
            if (b != null) {
                b.mo1200a(drawable, i);
                return;
            }
            throw new IllegalStateException(("Activity " + this.f50674f + " does not have an DrawerToggleDelegate set").toString());
        }
        throw new IllegalStateException(("Activity " + this.f50674f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }

    /* renamed from: d */
    public void mo58600d(@C12580l CharSequence charSequence) {
        C0441a B0 = this.f50674f.mo1473B0();
        if (B0 != null) {
            B0.mo1241A0(charSequence);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f50674f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
