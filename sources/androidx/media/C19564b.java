package androidx.media;

import android.os.Bundle;
import android.support.p002v4.media.MediaBrowserCompat;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.media.b */
public class C19564b {
    /* renamed from: a */
    public static boolean m91104a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt(MediaBrowserCompat.f50d, -1) == -1 && bundle2.getInt(MediaBrowserCompat.f51e, -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle2 == null) {
            if (bundle.getInt(MediaBrowserCompat.f50d, -1) == -1 && bundle.getInt(MediaBrowserCompat.f51e, -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle.getInt(MediaBrowserCompat.f50d, -1) == bundle2.getInt(MediaBrowserCompat.f50d, -1) && bundle.getInt(MediaBrowserCompat.f51e, -1) == bundle2.getInt(MediaBrowserCompat.f51e, -1)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m91105b(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (bundle == null) {
            i = -1;
        } else {
            i = bundle.getInt(MediaBrowserCompat.f50d, -1);
        }
        if (bundle2 == null) {
            i2 = -1;
        } else {
            i2 = bundle2.getInt(MediaBrowserCompat.f50d, -1);
        }
        if (bundle == null) {
            i3 = -1;
        } else {
            i3 = bundle.getInt(MediaBrowserCompat.f51e, -1);
        }
        if (bundle2 == null) {
            i4 = -1;
        } else {
            i4 = bundle2.getInt(MediaBrowserCompat.f51e, -1);
        }
        int i8 = Integer.MAX_VALUE;
        if (i == -1 || i3 == -1) {
            i5 = Integer.MAX_VALUE;
            i6 = 0;
        } else {
            i6 = i * i3;
            i5 = (i3 + i6) - 1;
        }
        if (i2 == -1 || i4 == -1) {
            i7 = 0;
        } else {
            i7 = i2 * i4;
            i8 = (i4 + i7) - 1;
        }
        if (i5 < i7 || i8 < i6) {
            return false;
        }
        return true;
    }
}
