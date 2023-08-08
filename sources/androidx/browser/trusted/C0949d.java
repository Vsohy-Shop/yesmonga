package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.browser.trusted.d */
public class C0949d {
    @C0359n0
    @C0376v0(23)
    /* renamed from: a */
    public static Parcelable[] m4291a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
