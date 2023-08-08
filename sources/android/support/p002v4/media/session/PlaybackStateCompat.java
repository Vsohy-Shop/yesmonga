package android.support.p002v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p002v4.media.session.C0177k;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {

    /* renamed from: A1 */
    public static final int f456A1 = 7;

    /* renamed from: B1 */
    public static final int f457B1 = 8;

    /* renamed from: C1 */
    public static final int f458C1 = 9;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0142a();

    /* renamed from: D1 */
    public static final int f459D1 = 10;

    /* renamed from: E0 */
    public static final long f460E0 = 8;

    /* renamed from: E1 */
    public static final int f461E1 = 11;

    /* renamed from: F0 */
    public static final long f462F0 = 16;

    /* renamed from: F1 */
    public static final int f463F1 = 127;

    /* renamed from: G0 */
    public static final long f464G0 = 32;

    /* renamed from: G1 */
    public static final int f465G1 = 126;

    /* renamed from: H0 */
    public static final long f466H0 = 64;

    /* renamed from: I0 */
    public static final long f467I0 = 128;

    /* renamed from: J0 */
    public static final long f468J0 = 256;

    /* renamed from: K0 */
    public static final long f469K0 = 512;

    /* renamed from: L0 */
    public static final long f470L0 = 1024;

    /* renamed from: M0 */
    public static final long f471M0 = 2048;

    /* renamed from: N0 */
    public static final long f472N0 = 4096;

    /* renamed from: O0 */
    public static final long f473O0 = 8192;

    /* renamed from: P0 */
    public static final long f474P0 = 16384;

    /* renamed from: Q0 */
    public static final long f475Q0 = 32768;

    /* renamed from: R0 */
    public static final long f476R0 = 65536;

    /* renamed from: S0 */
    public static final long f477S0 = 131072;

    /* renamed from: T0 */
    public static final long f478T0 = 262144;
    @Deprecated

    /* renamed from: U0 */
    public static final long f479U0 = 524288;

    /* renamed from: V0 */
    public static final long f480V0 = 1048576;

    /* renamed from: W0 */
    public static final long f481W0 = 2097152;

    /* renamed from: X */
    public static final long f482X = 1;

    /* renamed from: X0 */
    public static final int f483X0 = 0;

    /* renamed from: Y */
    public static final long f484Y = 2;

    /* renamed from: Y0 */
    public static final int f485Y0 = 1;

    /* renamed from: Z */
    public static final long f486Z = 4;

    /* renamed from: Z0 */
    public static final int f487Z0 = 2;

    /* renamed from: a1 */
    public static final int f488a1 = 3;

    /* renamed from: b1 */
    public static final int f489b1 = 4;

    /* renamed from: c1 */
    public static final int f490c1 = 5;

    /* renamed from: d1 */
    public static final int f491d1 = 6;

    /* renamed from: e1 */
    public static final int f492e1 = 7;

    /* renamed from: f1 */
    public static final int f493f1 = 8;

    /* renamed from: g1 */
    public static final int f494g1 = 9;

    /* renamed from: h1 */
    public static final int f495h1 = 10;

    /* renamed from: i1 */
    public static final int f496i1 = 11;

    /* renamed from: j1 */
    public static final long f497j1 = -1;

    /* renamed from: k1 */
    public static final int f498k1 = -1;

    /* renamed from: l1 */
    public static final int f499l1 = 0;

    /* renamed from: m1 */
    public static final int f500m1 = 1;

    /* renamed from: n1 */
    public static final int f501n1 = 2;

    /* renamed from: o1 */
    public static final int f502o1 = 3;

    /* renamed from: p1 */
    public static final int f503p1 = -1;

    /* renamed from: q1 */
    public static final int f504q1 = 0;

    /* renamed from: r1 */
    public static final int f505r1 = 1;

    /* renamed from: s1 */
    public static final int f506s1 = 2;

    /* renamed from: t1 */
    public static final int f507t1 = 0;

    /* renamed from: u1 */
    public static final int f508u1 = 1;

    /* renamed from: v1 */
    public static final int f509v1 = 2;

    /* renamed from: w1 */
    public static final int f510w1 = 3;

    /* renamed from: x1 */
    public static final int f511x1 = 4;

    /* renamed from: y1 */
    public static final int f512y1 = 5;

    /* renamed from: z1 */
    public static final int f513z1 = 6;

    /* renamed from: a */
    public final int f514a;

    /* renamed from: b */
    public final long f515b;

    /* renamed from: c */
    public final long f516c;

    /* renamed from: d */
    public final float f517d;

    /* renamed from: e */
    public final long f518e;

    /* renamed from: f */
    public final int f519f;

    /* renamed from: g */
    public final CharSequence f520g;

    /* renamed from: v */
    public final long f521v;

    /* renamed from: w */
    public List<CustomAction> f522w;

    /* renamed from: x */
    public final long f523x;

    /* renamed from: y */
    public final Bundle f524y;

    /* renamed from: z */
    public Object f525z;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static class C0142a implements Parcelable.Creator<PlaybackStateCompat> {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public @interface C0143b {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$d */
    public @interface C0145d {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$e */
    public @interface C0146e {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$f */
    public @interface C0147f {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$g */
    public @interface C0148g {
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$h */
    public @interface C0149h {
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f514a = i;
        this.f515b = j;
        this.f516c = j2;
        this.f517d = f;
        this.f518e = j3;
        this.f519f = i2;
        this.f520g = charSequence;
        this.f521v = j4;
        this.f522w = new ArrayList(list);
        this.f523x = j5;
        this.f524y = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m892a(Object obj) {
        Object obj2 = obj;
        ArrayList arrayList = null;
        if (obj2 == null) {
            return null;
        }
        List<Object> d = C0177k.m1154d(obj);
        if (d != null) {
            arrayList = new ArrayList(d.size());
            for (Object a : d) {
                arrayList.add(CustomAction.m907a(a));
            }
        }
        Bundle a2 = C0179l.m1166a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0177k.m1159i(obj), C0177k.m1158h(obj), C0177k.m1153c(obj), C0177k.m1157g(obj), C0177k.m1151a(obj), 0, C0177k.m1155e(obj), C0177k.m1156f(obj), arrayList, C0177k.m1152b(obj), a2);
        playbackStateCompat.f525z = obj2;
        return playbackStateCompat;
    }

    /* renamed from: o */
    public static int m893o(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    /* renamed from: b */
    public long mo594b() {
        return this.f518e;
    }

    /* renamed from: c */
    public long mo595c() {
        return this.f523x;
    }

    /* renamed from: d */
    public long mo596d() {
        return this.f516c;
    }

    public int describeContents() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.f843b})
    /* renamed from: e */
    public long mo598e(Long l) {
        long j;
        long j2 = this.f515b;
        float f = this.f517d;
        if (l != null) {
            j = l.longValue();
        } else {
            j = SystemClock.elapsedRealtime() - this.f521v;
        }
        return Math.max(0, j2 + ((long) (f * ((float) j))));
    }

    /* renamed from: f */
    public List<CustomAction> mo599f() {
        return this.f522w;
    }

    /* renamed from: g */
    public int mo600g() {
        return this.f519f;
    }

    /* renamed from: h */
    public CharSequence mo601h() {
        return this.f520g;
    }

    @C0363p0
    /* renamed from: i */
    public Bundle mo602i() {
        return this.f524y;
    }

    /* renamed from: j */
    public long mo603j() {
        return this.f521v;
    }

    /* renamed from: k */
    public float mo604k() {
        return this.f517d;
    }

    /* renamed from: l */
    public Object mo605l() {
        ArrayList arrayList;
        if (this.f525z == null) {
            if (this.f522w != null) {
                arrayList = new ArrayList(this.f522w.size());
                for (CustomAction c : this.f522w) {
                    arrayList.add(c.mo611c());
                }
            } else {
                arrayList = null;
            }
            this.f525z = C0179l.m1167b(this.f514a, this.f515b, this.f516c, this.f517d, this.f518e, this.f520g, this.f521v, arrayList, this.f523x, this.f524y);
        }
        return this.f525z;
    }

    /* renamed from: m */
    public long mo606m() {
        return this.f515b;
    }

    /* renamed from: n */
    public int mo607n() {
        return this.f514a;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f514a + ", position=" + this.f515b + ", buffered position=" + this.f516c + ", speed=" + this.f517d + ", updated=" + this.f521v + ", actions=" + this.f518e + ", error code=" + this.f519f + ", error message=" + this.f520g + ", custom actions=" + this.f522w + ", active item id=" + this.f523x + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f514a);
        parcel.writeLong(this.f515b);
        parcel.writeFloat(this.f517d);
        parcel.writeLong(this.f521v);
        parcel.writeLong(this.f516c);
        parcel.writeLong(this.f518e);
        TextUtils.writeToParcel(this.f520g, parcel, i);
        parcel.writeTypedList(this.f522w);
        parcel.writeLong(this.f523x);
        parcel.writeBundle(this.f524y);
        parcel.writeInt(this.f519f);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static final class C0144c {

        /* renamed from: a */
        public final List<CustomAction> f535a;

        /* renamed from: b */
        public int f536b;

        /* renamed from: c */
        public long f537c;

        /* renamed from: d */
        public long f538d;

        /* renamed from: e */
        public float f539e;

        /* renamed from: f */
        public long f540f;

        /* renamed from: g */
        public int f541g;

        /* renamed from: h */
        public CharSequence f542h;

        /* renamed from: i */
        public long f543i;

        /* renamed from: j */
        public long f544j;

        /* renamed from: k */
        public Bundle f545k;

        public C0144c() {
            this.f535a = new ArrayList();
            this.f544j = -1;
        }

        /* renamed from: a */
        public C0144c mo628a(CustomAction customAction) {
            if (customAction != null) {
                this.f535a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        /* renamed from: b */
        public C0144c mo629b(String str, String str2, int i) {
            return mo628a(new CustomAction(str, str2, i, (Bundle) null));
        }

        /* renamed from: c */
        public PlaybackStateCompat mo630c() {
            return new PlaybackStateCompat(this.f536b, this.f537c, this.f538d, this.f539e, this.f540f, this.f541g, this.f542h, this.f543i, this.f535a, this.f544j, this.f545k);
        }

        /* renamed from: d */
        public C0144c mo631d(long j) {
            this.f540f = j;
            return this;
        }

        /* renamed from: e */
        public C0144c mo632e(long j) {
            this.f544j = j;
            return this;
        }

        /* renamed from: f */
        public C0144c mo633f(long j) {
            this.f538d = j;
            return this;
        }

        /* renamed from: g */
        public C0144c mo634g(int i, CharSequence charSequence) {
            this.f541g = i;
            this.f542h = charSequence;
            return this;
        }

        /* renamed from: h */
        public C0144c mo635h(CharSequence charSequence) {
            this.f542h = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0144c mo636i(Bundle bundle) {
            this.f545k = bundle;
            return this;
        }

        /* renamed from: j */
        public C0144c mo637j(int i, long j, float f) {
            return mo638k(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: k */
        public C0144c mo638k(int i, long j, float f, long j2) {
            this.f536b = i;
            this.f537c = j;
            this.f543i = j2;
            this.f539e = f;
            return this;
        }

        public C0144c(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f535a = arrayList;
            this.f544j = -1;
            this.f536b = playbackStateCompat.f514a;
            this.f537c = playbackStateCompat.f515b;
            this.f539e = playbackStateCompat.f517d;
            this.f543i = playbackStateCompat.f521v;
            this.f538d = playbackStateCompat.f516c;
            this.f540f = playbackStateCompat.f518e;
            this.f541g = playbackStateCompat.f519f;
            this.f542h = playbackStateCompat.f520g;
            List<CustomAction> list = playbackStateCompat.f522w;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f544j = playbackStateCompat.f523x;
            this.f545k = playbackStateCompat.f524y;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0140a();

        /* renamed from: a */
        public final String f526a;

        /* renamed from: b */
        public final CharSequence f527b;

        /* renamed from: c */
        public final int f528c;

        /* renamed from: d */
        public final Bundle f529d;

        /* renamed from: e */
        public Object f530e;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public static class C0140a implements Parcelable.Creator<CustomAction> {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$b */
        public static final class C0141b {

            /* renamed from: a */
            public final String f531a;

            /* renamed from: b */
            public final CharSequence f532b;

            /* renamed from: c */
            public final int f533c;

            /* renamed from: d */
            public Bundle f534d;

            public C0141b(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                } else if (i != 0) {
                    this.f531a = str;
                    this.f532b = charSequence;
                    this.f533c = i;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                }
            }

            /* renamed from: a */
            public CustomAction mo622a() {
                return new CustomAction(this.f531a, this.f532b, this.f533c, this.f534d);
            }

            /* renamed from: b */
            public C0141b mo623b(Bundle bundle) {
                this.f534d = bundle;
                return this;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f526a = str;
            this.f527b = charSequence;
            this.f528c = i;
            this.f529d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m907a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0177k.C0178a.m1161a(obj), C0177k.C0178a.m1164d(obj), C0177k.C0178a.m1163c(obj), C0177k.C0178a.m1162b(obj));
            customAction.f530e = obj;
            return customAction;
        }

        /* renamed from: b */
        public String mo610b() {
            return this.f526a;
        }

        /* renamed from: c */
        public Object mo611c() {
            Object obj = this.f530e;
            if (obj != null) {
                return obj;
            }
            Object e = C0177k.C0178a.m1165e(this.f526a, this.f527b, this.f528c, this.f529d);
            this.f530e = e;
            return e;
        }

        /* renamed from: d */
        public Bundle mo612d() {
            return this.f529d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public int mo614e() {
            return this.f528c;
        }

        /* renamed from: f */
        public CharSequence mo615f() {
            return this.f527b;
        }

        public String toString() {
            return "Action:mName='" + this.f527b + ", mIcon=" + this.f528c + ", mExtras=" + this.f529d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f526a);
            TextUtils.writeToParcel(this.f527b, parcel, i);
            parcel.writeInt(this.f528c);
            parcel.writeBundle(this.f529d);
        }

        public CustomAction(Parcel parcel) {
            this.f526a = parcel.readString();
            this.f527b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f528c = parcel.readInt();
            this.f529d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f514a = parcel.readInt();
        this.f515b = parcel.readLong();
        this.f517d = parcel.readFloat();
        this.f521v = parcel.readLong();
        this.f516c = parcel.readLong();
        this.f518e = parcel.readLong();
        this.f520g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f522w = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f523x = parcel.readLong();
        this.f524y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f519f = parcel.readInt();
    }
}
