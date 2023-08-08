package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f44948a = (IconCompat) versionedParcel.mo62211h0(remoteActionCompat.f44948a, 1);
        remoteActionCompat.f44949b = versionedParcel.mo62247w(remoteActionCompat.f44949b, 2);
        remoteActionCompat.f44950c = versionedParcel.mo62247w(remoteActionCompat.f44950c, 3);
        remoteActionCompat.f44951d = (PendingIntent) versionedParcel.mo62182W(remoteActionCompat.f44951d, 4);
        remoteActionCompat.f44952e = versionedParcel.mo62225m(remoteActionCompat.f44952e, 5);
        remoteActionCompat.f44953f = versionedParcel.mo62225m(remoteActionCompat.f44953f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo62217j0(false, false);
        versionedParcel.mo62227m1(remoteActionCompat.f44948a, 1);
        versionedParcel.mo62254z0(remoteActionCompat.f44949b, 2);
        versionedParcel.mo62254z0(remoteActionCompat.f44950c, 3);
        versionedParcel.mo62185X0(remoteActionCompat.f44951d, 4);
        versionedParcel.mo62229n0(remoteActionCompat.f44952e, 5);
        versionedParcel.mo62229n0(remoteActionCompat.f44953f, 6);
    }
}
