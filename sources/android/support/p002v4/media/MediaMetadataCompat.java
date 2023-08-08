package android.support.p002v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.media.MediaDescriptionCompat;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.collection.C1866a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0069a();

    /* renamed from: E0 */
    public static final String f192E0 = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: F0 */
    public static final String f193F0 = "android.media.metadata.NUM_TRACKS";

    /* renamed from: G0 */
    public static final String f194G0 = "android.media.metadata.DISC_NUMBER";

    /* renamed from: H0 */
    public static final String f195H0 = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: I0 */
    public static final String f196I0 = "android.media.metadata.ART";

    /* renamed from: J0 */
    public static final String f197J0 = "android.media.metadata.ART_URI";

    /* renamed from: K0 */
    public static final String f198K0 = "android.media.metadata.ALBUM_ART";

    /* renamed from: L0 */
    public static final String f199L0 = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: M0 */
    public static final String f200M0 = "android.media.metadata.USER_RATING";

    /* renamed from: N0 */
    public static final String f201N0 = "android.media.metadata.RATING";

    /* renamed from: O0 */
    public static final String f202O0 = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: P0 */
    public static final String f203P0 = "android.media.metadata.DISPLAY_SUBTITLE";

    /* renamed from: Q0 */
    public static final String f204Q0 = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* renamed from: R0 */
    public static final String f205R0 = "android.media.metadata.DISPLAY_ICON";

    /* renamed from: S0 */
    public static final String f206S0 = "android.media.metadata.DISPLAY_ICON_URI";

    /* renamed from: T0 */
    public static final String f207T0 = "android.media.metadata.MEDIA_ID";

    /* renamed from: U0 */
    public static final String f208U0 = "android.media.metadata.MEDIA_URI";

    /* renamed from: V0 */
    public static final String f209V0 = "android.media.metadata.BT_FOLDER_TYPE";

    /* renamed from: W0 */
    public static final String f210W0 = "android.media.metadata.ADVERTISEMENT";

    /* renamed from: X */
    public static final String f211X = "android.media.metadata.DATE";

    /* renamed from: X0 */
    public static final String f212X0 = "android.media.metadata.DOWNLOAD_STATUS";

    /* renamed from: Y */
    public static final String f213Y = "android.media.metadata.YEAR";

    /* renamed from: Y0 */
    public static final int f214Y0 = 0;

    /* renamed from: Z */
    public static final String f215Z = "android.media.metadata.GENRE";

    /* renamed from: Z0 */
    public static final int f216Z0 = 1;

    /* renamed from: a1 */
    public static final int f217a1 = 2;

    /* renamed from: b1 */
    public static final int f218b1 = 3;

    /* renamed from: c1 */
    public static final C1866a<String, Integer> f219c1;

    /* renamed from: d */
    public static final String f220d = "MediaMetadata";

    /* renamed from: d1 */
    public static final String[] f221d1 = {f222e, f224f, f227v, f195H0, f229x, f228w, f230y};

    /* renamed from: e */
    public static final String f222e = "android.media.metadata.TITLE";

    /* renamed from: e1 */
    public static final String[] f223e1 = {f205R0, f196I0, f198K0};

    /* renamed from: f */
    public static final String f224f = "android.media.metadata.ARTIST";

    /* renamed from: f1 */
    public static final String[] f225f1 = {f206S0, f197J0, f199L0};

    /* renamed from: g */
    public static final String f226g = "android.media.metadata.DURATION";

    /* renamed from: v */
    public static final String f227v = "android.media.metadata.ALBUM";

    /* renamed from: w */
    public static final String f228w = "android.media.metadata.AUTHOR";

    /* renamed from: x */
    public static final String f229x = "android.media.metadata.WRITER";

    /* renamed from: y */
    public static final String f230y = "android.media.metadata.COMPOSER";

    /* renamed from: z */
    public static final String f231z = "android.media.metadata.COMPILATION";

    /* renamed from: a */
    public final Bundle f232a;

    /* renamed from: b */
    public Object f233b;

    /* renamed from: c */
    public MediaDescriptionCompat f234c;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public static class C0069a implements Parcelable.Creator<MediaMetadataCompat> {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public @interface C0070b {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$d */
    public @interface C0072d {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$e */
    public @interface C0073e {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaMetadataCompat$f */
    public @interface C0074f {
    }

    static {
        C1866a<String, Integer> aVar = new C1866a<>();
        f219c1 = aVar;
        aVar.put(f222e, 1);
        aVar.put(f224f, 1);
        aVar.put(f226g, 0);
        aVar.put(f227v, 1);
        aVar.put(f228w, 1);
        aVar.put(f229x, 1);
        aVar.put(f230y, 1);
        aVar.put(f231z, 1);
        aVar.put(f211X, 1);
        aVar.put(f213Y, 0);
        aVar.put(f215Z, 1);
        aVar.put(f192E0, 0);
        aVar.put(f193F0, 0);
        aVar.put(f194G0, 0);
        aVar.put(f195H0, 1);
        aVar.put(f196I0, 2);
        aVar.put(f197J0, 1);
        aVar.put(f198K0, 2);
        aVar.put(f199L0, 1);
        aVar.put(f200M0, 3);
        aVar.put(f201N0, 3);
        aVar.put(f202O0, 1);
        aVar.put(f203P0, 1);
        aVar.put(f204Q0, 1);
        aVar.put(f205R0, 2);
        aVar.put(f206S0, 1);
        aVar.put(f207T0, 1);
        aVar.put(f209V0, 0);
        aVar.put(f208U0, 1);
        aVar.put(f210W0, 0);
        aVar.put(f212X0, 0);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f232a = bundle2;
        MediaSessionCompat.m591b(bundle2);
    }

    /* renamed from: b */
    public static MediaMetadataCompat m268b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0094f.m358g(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f233b = obj;
        return createFromParcel;
    }

    /* renamed from: a */
    public boolean mo200a(String str) {
        return this.f232a.containsKey(str);
    }

    /* renamed from: c */
    public Bitmap mo201c(String str) {
        try {
            return (Bitmap) this.f232a.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public Bundle mo202d() {
        return new Bundle(this.f232a);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public MediaDescriptionCompat mo204e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f234c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String i = mo208i(f207T0);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence j = mo209j(f202O0);
        if (TextUtils.isEmpty(j)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = f221d1;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence j2 = mo209j(strArr[i3]);
                if (!TextUtils.isEmpty(j2)) {
                    charSequenceArr[i2] = j2;
                    i2++;
                }
                i3 = i4;
            }
        } else {
            charSequenceArr[0] = j;
            charSequenceArr[1] = mo209j(f203P0);
            charSequenceArr[2] = mo209j(f204Q0);
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = f223e1;
            uri = null;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = mo201c(strArr2[i5]);
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            String[] strArr3 = f225f1;
            if (i6 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String i7 = mo208i(strArr3[i6]);
            if (!TextUtils.isEmpty(i7)) {
                uri2 = Uri.parse(i7);
                break;
            }
            i6++;
        }
        String i8 = mo208i(f208U0);
        if (!TextUtils.isEmpty(i8)) {
            uri = Uri.parse(i8);
        }
        MediaDescriptionCompat.C0068b bVar = new MediaDescriptionCompat.C0068b();
        bVar.mo196f(i);
        bVar.mo199i(charSequenceArr[0]);
        bVar.mo198h(charSequenceArr[1]);
        bVar.mo192b(charSequenceArr[2]);
        bVar.mo194d(bitmap);
        bVar.mo195e(uri2);
        bVar.mo197g(uri);
        Bundle bundle = new Bundle();
        if (this.f232a.containsKey(f209V0)) {
            bundle.putLong(MediaDescriptionCompat.f172x, mo205f(f209V0));
        }
        if (this.f232a.containsKey(f212X0)) {
            bundle.putLong(MediaDescriptionCompat.f163G0, mo205f(f212X0));
        }
        if (!bundle.isEmpty()) {
            bVar.mo193c(bundle);
        }
        MediaDescriptionCompat a = bVar.mo191a();
        this.f234c = a;
        return a;
    }

    /* renamed from: f */
    public long mo205f(String str) {
        return this.f232a.getLong(str, 0);
    }

    /* renamed from: g */
    public Object mo206g() {
        if (this.f233b == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f233b = C0094f.m352a(obtain);
            obtain.recycle();
        }
        return this.f233b;
    }

    /* renamed from: h */
    public RatingCompat mo207h(String str) {
        try {
            return RatingCompat.m289a(this.f232a.getParcelable(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public String mo208i(String str) {
        CharSequence charSequence = this.f232a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: j */
    public CharSequence mo209j(String str) {
        return this.f232a.getCharSequence(str);
    }

    /* renamed from: k */
    public Set<String> mo210k() {
        return this.f232a.keySet();
    }

    /* renamed from: l */
    public int mo211l() {
        return this.f232a.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f232a);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$c */
    public static final class C0071c {

        /* renamed from: a */
        public final Bundle f235a;

        public C0071c() {
            this.f235a = new Bundle();
        }

        /* renamed from: a */
        public MediaMetadataCompat mo217a() {
            return new MediaMetadataCompat(this.f235a);
        }

        /* renamed from: b */
        public C0071c mo218b(String str, Bitmap bitmap) {
            C1866a<String, Integer> aVar = MediaMetadataCompat.f219c1;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f235a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: c */
        public C0071c mo219c(String str, long j) {
            C1866a<String, Integer> aVar = MediaMetadataCompat.f219c1;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f235a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: d */
        public C0071c mo220d(String str, RatingCompat ratingCompat) {
            C1866a<String, Integer> aVar = MediaMetadataCompat.f219c1;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 3) {
                this.f235a.putParcelable(str, (Parcelable) ratingCompat.mo225c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        /* renamed from: e */
        public C0071c mo221e(String str, String str2) {
            C1866a<String, Integer> aVar = MediaMetadataCompat.f219c1;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f235a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        /* renamed from: f */
        public C0071c mo222f(String str, CharSequence charSequence) {
            C1866a<String, Integer> aVar = MediaMetadataCompat.f219c1;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f235a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }

        /* renamed from: g */
        public final Bitmap mo223g(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        public C0071c(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f232a);
            this.f235a = bundle;
            MediaSessionCompat.m591b(bundle);
        }

        @RestrictTo({RestrictTo.Scope.f843b})
        public C0071c(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String next : this.f235a.keySet()) {
                Object obj = this.f235a.get(next);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo218b(next, mo223g(bitmap, i));
                    }
                }
            }
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f232a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
