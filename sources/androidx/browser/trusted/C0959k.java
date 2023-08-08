package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.browser.trusted.k */
public class C0959k {
    @C0363p0
    @C0376v0(26)
    /* renamed from: a */
    public static Notification m4307a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        C0958j.m4306a();
        notificationManager.createNotificationChannel(C0957i.m4305a(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        Notification.Builder unused = recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }

    @C0376v0(26)
    /* renamed from: b */
    public static boolean m4308b(NotificationManager notificationManager, String str) {
        NotificationChannel a = notificationManager.getNotificationChannel(str);
        if (a == null || a.getImportance() != 0) {
            return true;
        }
        return false;
    }
}
