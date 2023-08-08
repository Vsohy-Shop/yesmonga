package android.support.p002v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Parcel;
import androidx.annotation.C0376v0;
import java.util.Set;

@C0376v0(21)
/* renamed from: android.support.v4.media.f */
public class C0094f {

    /* renamed from: android.support.v4.media.f$a */
    public static class C0095a {
        /* renamed from: a */
        public static Object m359a(Object obj) {
            return ((MediaMetadata.Builder) obj).build();
        }

        /* renamed from: b */
        public static Object m360b() {
            return new MediaMetadata.Builder();
        }

        /* renamed from: c */
        public static void m361c(Object obj, String str, Bitmap bitmap) {
            ((MediaMetadata.Builder) obj).putBitmap(str, bitmap);
        }

        /* renamed from: d */
        public static void m362d(Object obj, String str, long j) {
            ((MediaMetadata.Builder) obj).putLong(str, j);
        }

        /* renamed from: e */
        public static void m363e(Object obj, String str, Object obj2) {
            ((MediaMetadata.Builder) obj).putRating(str, (Rating) obj2);
        }

        /* renamed from: f */
        public static void m364f(Object obj, String str, String str2) {
            ((MediaMetadata.Builder) obj).putString(str, str2);
        }

        /* renamed from: g */
        public static void m365g(Object obj, String str, CharSequence charSequence) {
            ((MediaMetadata.Builder) obj).putText(str, charSequence);
        }
    }

    /* renamed from: a */
    public static Object m352a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static Bitmap m353b(Object obj, String str) {
        return ((MediaMetadata) obj).getBitmap(str);
    }

    /* renamed from: c */
    public static long m354c(Object obj, String str) {
        return ((MediaMetadata) obj).getLong(str);
    }

    /* renamed from: d */
    public static Object m355d(Object obj, String str) {
        return ((MediaMetadata) obj).getRating(str);
    }

    /* renamed from: e */
    public static CharSequence m356e(Object obj, String str) {
        return ((MediaMetadata) obj).getText(str);
    }

    /* renamed from: f */
    public static Set<String> m357f(Object obj) {
        return ((MediaMetadata) obj).keySet();
    }

    /* renamed from: g */
    public static void m358g(Object obj, Parcel parcel, int i) {
        ((MediaMetadata) obj).writeToParcel(parcel, i);
    }
}
