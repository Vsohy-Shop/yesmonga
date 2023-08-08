package com.usabilla.sdk.ubform;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.C33585u;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0012\u0012\b\b\u0002\u0010%\u001a\u00020\u0012\u0012\b\b\u0002\u0010&\u001a\u00020\u0012\u0012\b\b\u0002\u0010'\u001a\u00020\u0012¢\u0006\u0004\bP\u0010QJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÆ\u0003Jµ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0012HÆ\u0001J\t\u0010)\u001a\u00020\u0002HÖ\u0001J\t\u0010+\u001a\u00020*HÖ\u0001J\u0013\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\u0019\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020*HÖ\u0001R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b8\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b=\u00107R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b>\u00107R\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\b?\u0010@R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\bA\u00107R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\bB\u00107R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\bC\u00107R\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bD\u0010<R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bE\u00107R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u00107R\u0017\u0010$\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010%\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010I\u001a\u0004\bL\u0010KR\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010KR\u0017\u0010'\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bI\u0010K¨\u0006R"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/AppInfo;", "Landroid/os/Parcelable;", "", "a", "j", "k", "", "l", "m", "n", "", "o", "p", "q", "b", "c", "d", "e", "", "f", "g", "h", "i", "appName", "appVersion", "appId", "appInDebug", "osVersion", "sdkVersion", "batterLevel", "device", "connectivity", "orientation", "rooted", "system", "screenSize", "freeMemory", "totalMemory", "freeSpace", "totalSpace", "r", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "w", "t", "Z", "u", "()Z", "D", "G", "x", "()D", "z", "y", "C", "E", "H", "X", "F", "Y", "J", "A", "()J", "I", "E0", "B", "F0", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJJJ)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class AppInfo implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<AppInfo> CREATOR = new C9717a();

    /* renamed from: E0 */
    public final long f26630E0;

    /* renamed from: F0 */
    public final long f26631F0;
    @C12579k

    /* renamed from: X */
    public final String f26632X;

    /* renamed from: Y */
    public final long f26633Y;

    /* renamed from: Z */
    public final long f26634Z;
    @C12579k

    /* renamed from: a */
    public final String f26635a;
    @C12579k

    /* renamed from: b */
    public final String f26636b;
    @C12580l

    /* renamed from: c */
    public final String f26637c;

    /* renamed from: d */
    public final boolean f26638d;
    @C12579k

    /* renamed from: e */
    public final String f26639e;
    @C12579k

    /* renamed from: f */
    public final String f26640f;

    /* renamed from: g */
    public final double f26641g;
    @C12579k

    /* renamed from: v */
    public final String f26642v;
    @C12579k

    /* renamed from: w */
    public final String f26643w;
    @C12579k

    /* renamed from: x */
    public final String f26644x;

    /* renamed from: y */
    public final boolean f26645y;
    @C12579k

    /* renamed from: z */
    public final String f26646z;

    /* renamed from: com.usabilla.sdk.ubform.AppInfo$a */
    public static final class C9717a implements Parcelable.Creator<AppInfo> {
        @C12579k
        /* renamed from: a */
        public final AppInfo createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @C12579k
        /* renamed from: b */
        public final AppInfo[] newArray(int i) {
            return new AppInfo[i];
        }
    }

    public AppInfo() {
        this((String) null, (String) null, (String) null, false, (String) null, (String) null, 0.0d, (String) null, (String) null, (String) null, false, (String) null, (String) null, 0, 0, 0, 0, 131071, (DefaultConstructorMarker) null);
    }

    /* renamed from: s */
    public static /* synthetic */ AppInfo m36369s(AppInfo appInfo, String str, String str2, String str3, boolean z, String str4, String str5, double d, String str6, String str7, String str8, boolean z2, String str9, String str10, long j, long j2, long j3, long j4, int i, Object obj) {
        AppInfo appInfo2 = appInfo;
        int i2 = i;
        return appInfo.mo19773r((i2 & 1) != 0 ? appInfo2.f26635a : str, (i2 & 2) != 0 ? appInfo2.f26636b : str2, (i2 & 4) != 0 ? appInfo2.f26637c : str3, (i2 & 8) != 0 ? appInfo2.f26638d : z, (i2 & 16) != 0 ? appInfo2.f26639e : str4, (i2 & 32) != 0 ? appInfo2.f26640f : str5, (i2 & 64) != 0 ? appInfo2.f26641g : d, (i2 & 128) != 0 ? appInfo2.f26642v : str6, (i2 & 256) != 0 ? appInfo2.f26643w : str7, (i2 & 512) != 0 ? appInfo2.f26644x : str8, (i2 & 1024) != 0 ? appInfo2.f26645y : z2, (i2 & 2048) != 0 ? appInfo2.f26646z : str9, (i2 & 4096) != 0 ? appInfo2.f26632X : str10, (i2 & 8192) != 0 ? appInfo2.f26633Y : j, (i2 & 16384) != 0 ? appInfo2.f26634Z : j2, (i2 & 32768) != 0 ? appInfo2.f26630E0 : j3, (i2 & 65536) != 0 ? appInfo2.f26631F0 : j4);
    }

    /* renamed from: A */
    public final long mo19743A() {
        return this.f26633Y;
    }

    /* renamed from: B */
    public final long mo19744B() {
        return this.f26630E0;
    }

    @C12579k
    /* renamed from: C */
    public final String mo19745C() {
        return this.f26644x;
    }

    @C12579k
    /* renamed from: D */
    public final String mo19746D() {
        return this.f26639e;
    }

    /* renamed from: E */
    public final boolean mo19747E() {
        return this.f26645y;
    }

    @C12579k
    /* renamed from: F */
    public final String mo19748F() {
        return this.f26632X;
    }

    @C12579k
    /* renamed from: G */
    public final String mo19749G() {
        return this.f26640f;
    }

    @C12579k
    /* renamed from: H */
    public final String mo19750H() {
        return this.f26646z;
    }

    /* renamed from: I */
    public final long mo19751I() {
        return this.f26634Z;
    }

    /* renamed from: J */
    public final long mo19752J() {
        return this.f26631F0;
    }

    @C12579k
    /* renamed from: a */
    public final String mo19753a() {
        return this.f26635a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo19754b() {
        return this.f26644x;
    }

    /* renamed from: c */
    public final boolean mo19755c() {
        return this.f26645y;
    }

    @C12579k
    /* renamed from: d */
    public final String mo19756d() {
        return this.f26646z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo19758e() {
        return this.f26632X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return Intrinsics.areEqual((Object) this.f26635a, (Object) appInfo.f26635a) && Intrinsics.areEqual((Object) this.f26636b, (Object) appInfo.f26636b) && Intrinsics.areEqual((Object) this.f26637c, (Object) appInfo.f26637c) && this.f26638d == appInfo.f26638d && Intrinsics.areEqual((Object) this.f26639e, (Object) appInfo.f26639e) && Intrinsics.areEqual((Object) this.f26640f, (Object) appInfo.f26640f) && Intrinsics.areEqual((Object) Double.valueOf(this.f26641g), (Object) Double.valueOf(appInfo.f26641g)) && Intrinsics.areEqual((Object) this.f26642v, (Object) appInfo.f26642v) && Intrinsics.areEqual((Object) this.f26643w, (Object) appInfo.f26643w) && Intrinsics.areEqual((Object) this.f26644x, (Object) appInfo.f26644x) && this.f26645y == appInfo.f26645y && Intrinsics.areEqual((Object) this.f26646z, (Object) appInfo.f26646z) && Intrinsics.areEqual((Object) this.f26632X, (Object) appInfo.f26632X) && this.f26633Y == appInfo.f26633Y && this.f26634Z == appInfo.f26634Z && this.f26630E0 == appInfo.f26630E0 && this.f26631F0 == appInfo.f26631F0;
    }

    /* renamed from: f */
    public final long mo19760f() {
        return this.f26633Y;
    }

    /* renamed from: g */
    public final long mo19761g() {
        return this.f26634Z;
    }

    /* renamed from: h */
    public final long mo19762h() {
        return this.f26630E0;
    }

    public int hashCode() {
        int hashCode = ((this.f26635a.hashCode() * 31) + this.f26636b.hashCode()) * 31;
        String str = this.f26637c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f26638d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode3 = (((((((((((((hashCode2 + (z ? 1 : 0)) * 31) + this.f26639e.hashCode()) * 31) + this.f26640f.hashCode()) * 31) + Double.hashCode(this.f26641g)) * 31) + this.f26642v.hashCode()) * 31) + this.f26643w.hashCode()) * 31) + this.f26644x.hashCode()) * 31;
        boolean z3 = this.f26645y;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((((((hashCode3 + (z2 ? 1 : 0)) * 31) + this.f26646z.hashCode()) * 31) + this.f26632X.hashCode()) * 31) + Long.hashCode(this.f26633Y)) * 31) + Long.hashCode(this.f26634Z)) * 31) + Long.hashCode(this.f26630E0)) * 31) + Long.hashCode(this.f26631F0);
    }

    /* renamed from: i */
    public final long mo19764i() {
        return this.f26631F0;
    }

    @C12579k
    /* renamed from: j */
    public final String mo19765j() {
        return this.f26636b;
    }

    @C12580l
    /* renamed from: k */
    public final String mo19766k() {
        return this.f26637c;
    }

    /* renamed from: l */
    public final boolean mo19767l() {
        return this.f26638d;
    }

    @C12579k
    /* renamed from: m */
    public final String mo19768m() {
        return this.f26639e;
    }

    @C12579k
    /* renamed from: n */
    public final String mo19769n() {
        return this.f26640f;
    }

    /* renamed from: o */
    public final double mo19770o() {
        return this.f26641g;
    }

    @C12579k
    /* renamed from: p */
    public final String mo19771p() {
        return this.f26642v;
    }

    @C12579k
    /* renamed from: q */
    public final String mo19772q() {
        return this.f26643w;
    }

    @C12579k
    /* renamed from: r */
    public final AppInfo mo19773r(@C12579k String str, @C12579k String str2, @C12580l String str3, boolean z, @C12579k String str4, @C12579k String str5, double d, @C12579k String str6, @C12579k String str7, @C12579k String str8, boolean z2, @C12579k String str9, @C12579k String str10, long j, long j2, long j3, long j4) {
        String str11 = str;
        Intrinsics.checkNotNullParameter(str11, "appName");
        Intrinsics.checkNotNullParameter(str2, "appVersion");
        Intrinsics.checkNotNullParameter(str4, "osVersion");
        Intrinsics.checkNotNullParameter(str5, C33585u.C33587b.f81741w3);
        Intrinsics.checkNotNullParameter(str6, "device");
        Intrinsics.checkNotNullParameter(str7, "connectivity");
        Intrinsics.checkNotNullParameter(str8, "orientation");
        Intrinsics.checkNotNullParameter(str9, C10108c.f27822y);
        Intrinsics.checkNotNullParameter(str10, "screenSize");
        return new AppInfo(str11, str2, str3, z, str4, str5, d, str6, str7, str8, z2, str9, str10, j, j2, j3, j4);
    }

    @C12580l
    /* renamed from: t */
    public final String mo19774t() {
        return this.f26637c;
    }

    @C12579k
    public String toString() {
        return "AppInfo(appName=" + this.f26635a + ", appVersion=" + this.f26636b + ", appId=" + this.f26637c + ", appInDebug=" + this.f26638d + ", osVersion=" + this.f26639e + ", sdkVersion=" + this.f26640f + ", batterLevel=" + this.f26641g + ", device=" + this.f26642v + ", connectivity=" + this.f26643w + ", orientation=" + this.f26644x + ", rooted=" + this.f26645y + ", system=" + this.f26646z + ", screenSize=" + this.f26632X + ", freeMemory=" + this.f26633Y + ", totalMemory=" + this.f26634Z + ", freeSpace=" + this.f26630E0 + ", totalSpace=" + this.f26631F0 + ')';
    }

    /* renamed from: u */
    public final boolean mo19776u() {
        return this.f26638d;
    }

    @C12579k
    /* renamed from: v */
    public final String mo19777v() {
        return this.f26635a;
    }

    @C12579k
    /* renamed from: w */
    public final String mo19778w() {
        return this.f26636b;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f26635a);
        parcel.writeString(this.f26636b);
        parcel.writeString(this.f26637c);
        parcel.writeInt(this.f26638d ? 1 : 0);
        parcel.writeString(this.f26639e);
        parcel.writeString(this.f26640f);
        parcel.writeDouble(this.f26641g);
        parcel.writeString(this.f26642v);
        parcel.writeString(this.f26643w);
        parcel.writeString(this.f26644x);
        parcel.writeInt(this.f26645y ? 1 : 0);
        parcel.writeString(this.f26646z);
        parcel.writeString(this.f26632X);
        parcel.writeLong(this.f26633Y);
        parcel.writeLong(this.f26634Z);
        parcel.writeLong(this.f26630E0);
        parcel.writeLong(this.f26631F0);
    }

    /* renamed from: x */
    public final double mo19780x() {
        return this.f26641g;
    }

    @C12579k
    /* renamed from: y */
    public final String mo19781y() {
        return this.f26643w;
    }

    @C12579k
    /* renamed from: z */
    public final String mo19782z() {
        return this.f26642v;
    }

    public AppInfo(@C12579k String str, @C12579k String str2, @C12580l String str3, boolean z, @C12579k String str4, @C12579k String str5, double d, @C12579k String str6, @C12579k String str7, @C12579k String str8, boolean z2, @C12579k String str9, @C12579k String str10, long j, long j2, long j3, long j4) {
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        String str16 = str9;
        String str17 = str10;
        Intrinsics.checkNotNullParameter(str, "appName");
        Intrinsics.checkNotNullParameter(str2, "appVersion");
        Intrinsics.checkNotNullParameter(str11, "osVersion");
        Intrinsics.checkNotNullParameter(str12, C33585u.C33587b.f81741w3);
        Intrinsics.checkNotNullParameter(str13, "device");
        Intrinsics.checkNotNullParameter(str14, "connectivity");
        Intrinsics.checkNotNullParameter(str15, "orientation");
        Intrinsics.checkNotNullParameter(str16, C10108c.f27822y);
        Intrinsics.checkNotNullParameter(str17, "screenSize");
        this.f26635a = str;
        this.f26636b = str2;
        this.f26637c = str3;
        this.f26638d = z;
        this.f26639e = str11;
        this.f26640f = str12;
        this.f26641g = d;
        this.f26642v = str13;
        this.f26643w = str14;
        this.f26644x = str15;
        this.f26645y = z2;
        this.f26646z = str16;
        this.f26632X = str17;
        this.f26633Y = j;
        this.f26634Z = j2;
        this.f26630E0 = j3;
        this.f26631F0 = j4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppInfo(java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, java.lang.String r29, java.lang.String r30, double r31, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, java.lang.String r37, java.lang.String r38, long r39, long r41, long r43, long r45, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r24 = this;
            r0 = r47
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r25
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r26
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = 0
            goto L_0x001c
        L_0x001a:
            r4 = r27
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r28
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0030
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            java.lang.String r7 = "RELEASE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            goto L_0x0032
        L_0x0030:
            r6 = r29
        L_0x0032:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0039
            java.lang.String r7 = "7.4.0"
            goto L_0x003b
        L_0x0039:
            r7 = r30
        L_0x003b:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0042
            r8 = 0
            goto L_0x0044
        L_0x0042:
            r8 = r31
        L_0x0044:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0050
            java.lang.String r10 = android.os.Build.MODEL
            java.lang.String r11 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            goto L_0x0052
        L_0x0050:
            r10 = r33
        L_0x0052:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0058
            r11 = r2
            goto L_0x005a
        L_0x0058:
            r11 = r34
        L_0x005a:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0060
            r12 = r2
            goto L_0x0062
        L_0x0060:
            r12 = r35
        L_0x0062:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006b
            boolean r13 = com.usabilla.sdk.ubform.utils.DeviceInfoUtilsKt.m38273d()
            goto L_0x006d
        L_0x006b:
            r13 = r36
        L_0x006d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0074
            java.lang.String r14 = "android"
            goto L_0x0076
        L_0x0074:
            r14 = r37
        L_0x0076:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r2 = r38
        L_0x007d:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            r16 = 0
            if (r15 == 0) goto L_0x0086
            r18 = r16
            goto L_0x0088
        L_0x0086:
            r18 = r39
        L_0x0088:
            r15 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r16 = r41
        L_0x008f:
            r15 = 32768(0x8000, float:4.5918E-41)
            r15 = r15 & r0
            if (r15 == 0) goto L_0x00a9
            android.os.StatFs r15 = new android.os.StatFs
            java.io.File r20 = android.os.Environment.getDataDirectory()
            r48 = r2
            java.lang.String r2 = r20.getAbsolutePath()
            r15.<init>(r2)
            long r20 = kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, "fileSystemStats")
            goto L_0x00ad
        L_0x00a9:
            r48 = r2
            r20 = r43
        L_0x00ad:
            r2 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00c4
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r2 = android.os.Environment.getDataDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            r0.<init>(r2)
            long r22 = kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "fileSystemStats")
            goto L_0x00c6
        L_0x00c4:
            r22 = r45
        L_0x00c6:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r48
            r40 = r18
            r42 = r16
            r44 = r20
            r46 = r22
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r40, r42, r44, r46)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.AppInfo.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
