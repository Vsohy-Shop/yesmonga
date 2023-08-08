package android.support.p002v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.media.C0090d;
import android.support.p002v4.media.C0092e;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0067a();

    /* renamed from: E0 */
    public static final long f161E0 = 5;

    /* renamed from: F0 */
    public static final long f162F0 = 6;

    /* renamed from: G0 */
    public static final String f163G0 = "android.media.extra.DOWNLOAD_STATUS";

    /* renamed from: H0 */
    public static final long f164H0 = 0;

    /* renamed from: I0 */
    public static final long f165I0 = 1;

    /* renamed from: J0 */
    public static final long f166J0 = 2;
    @RestrictTo({RestrictTo.Scope.f843b})

    /* renamed from: K0 */
    public static final String f167K0 = "android.support.v4.media.description.MEDIA_URI";
    @RestrictTo({RestrictTo.Scope.f843b})

    /* renamed from: L0 */
    public static final String f168L0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    /* renamed from: X */
    public static final long f169X = 2;

    /* renamed from: Y */
    public static final long f170Y = 3;

    /* renamed from: Z */
    public static final long f171Z = 4;

    /* renamed from: x */
    public static final String f172x = "android.media.extra.BT_FOLDER_TYPE";

    /* renamed from: y */
    public static final long f173y = 0;

    /* renamed from: z */
    public static final long f174z = 1;

    /* renamed from: a */
    public final String f175a;

    /* renamed from: b */
    public final CharSequence f176b;

    /* renamed from: c */
    public final CharSequence f177c;

    /* renamed from: d */
    public final CharSequence f178d;

    /* renamed from: e */
    public final Bitmap f179e;

    /* renamed from: f */
    public final Uri f180f;

    /* renamed from: g */
    public final Bundle f181g;

    /* renamed from: v */
    public final Uri f182v;

    /* renamed from: w */
    public Object f183w;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static class C0067a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m247a(C0090d.m332a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0068b {

        /* renamed from: a */
        public String f184a;

        /* renamed from: b */
        public CharSequence f185b;

        /* renamed from: c */
        public CharSequence f186c;

        /* renamed from: d */
        public CharSequence f187d;

        /* renamed from: e */
        public Bitmap f188e;

        /* renamed from: f */
        public Uri f189f;

        /* renamed from: g */
        public Bundle f190g;

        /* renamed from: h */
        public Uri f191h;

        /* renamed from: a */
        public MediaDescriptionCompat mo191a() {
            return new MediaDescriptionCompat(this.f184a, this.f185b, this.f186c, this.f187d, this.f188e, this.f189f, this.f190g, this.f191h);
        }

        /* renamed from: b */
        public C0068b mo192b(@C0363p0 CharSequence charSequence) {
            this.f187d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0068b mo193c(@C0363p0 Bundle bundle) {
            this.f190g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0068b mo194d(@C0363p0 Bitmap bitmap) {
            this.f188e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0068b mo195e(@C0363p0 Uri uri) {
            this.f189f = uri;
            return this;
        }

        /* renamed from: f */
        public C0068b mo196f(@C0363p0 String str) {
            this.f184a = str;
            return this;
        }

        /* renamed from: g */
        public C0068b mo197g(@C0363p0 Uri uri) {
            this.f191h = uri;
            return this;
        }

        /* renamed from: h */
        public C0068b mo198h(@C0363p0 CharSequence charSequence) {
            this.f186c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0068b mo199i(@C0363p0 CharSequence charSequence) {
            this.f185b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f175a = str;
        this.f176b = charSequence;
        this.f177c = charSequence2;
        this.f178d = charSequence3;
        this.f179e = bitmap;
        this.f180f = uri;
        this.f181g = bundle;
        this.f182v = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p002v4.media.MediaDescriptionCompat m247a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0074
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p002v4.media.C0090d.m337f(r8)
            r1.mo196f(r2)
            java.lang.CharSequence r2 = android.support.p002v4.media.C0090d.m339h(r8)
            r1.mo199i(r2)
            java.lang.CharSequence r2 = android.support.p002v4.media.C0090d.m338g(r8)
            r1.mo198h(r2)
            java.lang.CharSequence r2 = android.support.p002v4.media.C0090d.m333b(r8)
            r1.mo192b(r2)
            android.graphics.Bitmap r2 = android.support.p002v4.media.C0090d.m335d(r8)
            r1.mo194d(r2)
            android.net.Uri r2 = android.support.p002v4.media.C0090d.m336e(r8)
            r1.mo195e(r2)
            android.os.Bundle r2 = android.support.p002v4.media.C0090d.m334c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0044
            android.support.p002v4.media.session.MediaSessionCompat.m591b(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x005d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0057
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005d:
            r0 = r2
        L_0x005e:
            r1.mo193c(r0)
            if (r4 == 0) goto L_0x0067
            r1.mo197g(r4)
            goto L_0x006e
        L_0x0067:
            android.net.Uri r0 = android.support.p002v4.media.C0092e.m350a(r8)
            r1.mo197g(r0)
        L_0x006e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo191a()
            r0.f183w = r8
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p002v4.media.MediaDescriptionCompat.m247a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @C0363p0
    /* renamed from: b */
    public CharSequence mo175b() {
        return this.f178d;
    }

    @C0363p0
    /* renamed from: c */
    public Bundle mo176c() {
        return this.f181g;
    }

    @C0363p0
    /* renamed from: d */
    public Bitmap mo177d() {
        return this.f179e;
    }

    public int describeContents() {
        return 0;
    }

    @C0363p0
    /* renamed from: e */
    public Uri mo179e() {
        return this.f180f;
    }

    /* renamed from: f */
    public Object mo180f() {
        Object obj = this.f183w;
        if (obj != null) {
            return obj;
        }
        Object b = C0090d.C0091a.m342b();
        C0090d.C0091a.m347g(b, this.f175a);
        C0090d.C0091a.m349i(b, this.f176b);
        C0090d.C0091a.m348h(b, this.f177c);
        C0090d.C0091a.m343c(b, this.f178d);
        C0090d.C0091a.m345e(b, this.f179e);
        C0090d.C0091a.m346f(b, this.f180f);
        C0090d.C0091a.m344d(b, this.f181g);
        C0092e.C0093a.m351a(b, this.f182v);
        Object a = C0090d.C0091a.m341a(b);
        this.f183w = a;
        return a;
    }

    @C0363p0
    /* renamed from: g */
    public String mo181g() {
        return this.f175a;
    }

    @C0363p0
    /* renamed from: h */
    public Uri mo182h() {
        return this.f182v;
    }

    @C0363p0
    /* renamed from: i */
    public CharSequence mo183i() {
        return this.f177c;
    }

    @C0363p0
    /* renamed from: j */
    public CharSequence mo184j() {
        return this.f176b;
    }

    public String toString() {
        return this.f176b + ", " + this.f177c + ", " + this.f178d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0090d.m340i(mo180f(), parcel, i);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f175a = parcel.readString();
        this.f176b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f177c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f178d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f179e = (Bitmap) parcel.readParcelable(classLoader);
        this.f180f = (Uri) parcel.readParcelable(classLoader);
        this.f181g = parcel.readBundle(classLoader);
        this.f182v = (Uri) parcel.readParcelable(classLoader);
    }
}
