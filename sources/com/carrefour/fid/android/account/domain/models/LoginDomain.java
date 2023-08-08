package com.carrefour.fid.android.account.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\t\u0010\f\u001a\u00020\u0002HÆ\u0003Jd\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0018HÖ\u0001J\u0019\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b*\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\nR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b-\u0010\nR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&¨\u00062"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/domain/models/LoginDomain;", "Landroid/os/Parcelable;", "", "a", "b", "c", "d", "e", "", "f", "()Ljava/lang/Long;", "g", "h", "accessToken", "refreshToken", "scope", "idToken", "uidIam", "accessTokenExpirationTime", "lastModification", "expiresIn", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/carrefour/fid/android/account/domain/models/LoginDomain;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "p", "q", "n", "r", "Ljava/lang/Long;", "l", "o", "v", "m", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class LoginDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoginDomain> CREATOR = new C13284a();
    @C12579k

    /* renamed from: a */
    public final String f32668a;
    @C12579k

    /* renamed from: b */
    public final String f32669b;
    @C12579k

    /* renamed from: c */
    public final String f32670c;
    @C12579k

    /* renamed from: d */
    public final String f32671d;
    @C12579k

    /* renamed from: e */
    public final String f32672e;
    @C12580l

    /* renamed from: f */
    public final Long f32673f;
    @C12580l

    /* renamed from: g */
    public final Long f32674g;
    @C12579k

    /* renamed from: v */
    public final String f32675v;

    /* renamed from: com.carrefour.fid.android.account.domain.models.LoginDomain$a */
    public static final class C13284a implements Parcelable.Creator<LoginDomain> {
        @C12579k
        /* renamed from: a */
        public final LoginDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoginDomain(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final LoginDomain[] newArray(int i) {
            return new LoginDomain[i];
        }
    }

    public LoginDomain() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* renamed from: j */
    public static /* synthetic */ LoginDomain m57528j(LoginDomain loginDomain, String str, String str2, String str3, String str4, String str5, Long l, Long l2, String str6, int i, Object obj) {
        LoginDomain loginDomain2 = loginDomain;
        int i2 = i;
        return loginDomain.mo31562i((i2 & 1) != 0 ? loginDomain2.f32668a : str, (i2 & 2) != 0 ? loginDomain2.f32669b : str2, (i2 & 4) != 0 ? loginDomain2.f32670c : str3, (i2 & 8) != 0 ? loginDomain2.f32671d : str4, (i2 & 16) != 0 ? loginDomain2.f32672e : str5, (i2 & 32) != 0 ? loginDomain2.f32673f : l, (i2 & 64) != 0 ? loginDomain2.f32674g : l2, (i2 & 128) != 0 ? loginDomain2.f32675v : str6);
    }

    @C12579k
    /* renamed from: a */
    public final String mo31551a() {
        return this.f32668a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo31552b() {
        return this.f32669b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo31553c() {
        return this.f32670c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo31554d() {
        return this.f32671d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo31556e() {
        return this.f32672e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginDomain)) {
            return false;
        }
        LoginDomain loginDomain = (LoginDomain) obj;
        return Intrinsics.areEqual((Object) this.f32668a, (Object) loginDomain.f32668a) && Intrinsics.areEqual((Object) this.f32669b, (Object) loginDomain.f32669b) && Intrinsics.areEqual((Object) this.f32670c, (Object) loginDomain.f32670c) && Intrinsics.areEqual((Object) this.f32671d, (Object) loginDomain.f32671d) && Intrinsics.areEqual((Object) this.f32672e, (Object) loginDomain.f32672e) && Intrinsics.areEqual((Object) this.f32673f, (Object) loginDomain.f32673f) && Intrinsics.areEqual((Object) this.f32674g, (Object) loginDomain.f32674g) && Intrinsics.areEqual((Object) this.f32675v, (Object) loginDomain.f32675v);
    }

    @C12580l
    /* renamed from: f */
    public final Long mo31558f() {
        return this.f32673f;
    }

    @C12580l
    /* renamed from: g */
    public final Long mo31559g() {
        return this.f32674g;
    }

    @C12579k
    /* renamed from: h */
    public final String mo31560h() {
        return this.f32675v;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f32668a.hashCode() * 31) + this.f32669b.hashCode()) * 31) + this.f32670c.hashCode()) * 31) + this.f32671d.hashCode()) * 31) + this.f32672e.hashCode()) * 31;
        Long l = this.f32673f;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f32674g;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f32675v.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final LoginDomain mo31562i(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12580l Long l, @C12580l Long l2, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "refreshToken");
        Intrinsics.checkNotNullParameter(str3, "scope");
        Intrinsics.checkNotNullParameter(str4, "idToken");
        Intrinsics.checkNotNullParameter(str5, "uidIam");
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, "expiresIn");
        return new LoginDomain(str, str2, str3, str4, str5, l, l2, str7);
    }

    @C12579k
    /* renamed from: k */
    public final String mo31563k() {
        return this.f32668a;
    }

    @C12580l
    /* renamed from: l */
    public final Long mo31564l() {
        return this.f32673f;
    }

    @C12579k
    /* renamed from: m */
    public final String mo31565m() {
        return this.f32675v;
    }

    @C12579k
    /* renamed from: n */
    public final String mo31566n() {
        return this.f32671d;
    }

    @C12580l
    /* renamed from: o */
    public final Long mo31567o() {
        return this.f32674g;
    }

    @C12579k
    /* renamed from: p */
    public final String mo31568p() {
        return this.f32669b;
    }

    @C12579k
    /* renamed from: q */
    public final String mo31569q() {
        return this.f32670c;
    }

    @C12579k
    /* renamed from: r */
    public final String mo31570r() {
        return this.f32672e;
    }

    @C12579k
    public String toString() {
        String str = this.f32668a;
        String str2 = this.f32669b;
        String str3 = this.f32670c;
        String str4 = this.f32671d;
        String str5 = this.f32672e;
        Long l = this.f32673f;
        Long l2 = this.f32674g;
        String str6 = this.f32675v;
        return "LoginDomain(accessToken=" + str + ", refreshToken=" + str2 + ", scope=" + str3 + ", idToken=" + str4 + ", uidIam=" + str5 + ", accessTokenExpirationTime=" + l + ", lastModification=" + l2 + ", expiresIn=" + str6 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f32668a);
        parcel.writeString(this.f32669b);
        parcel.writeString(this.f32670c);
        parcel.writeString(this.f32671d);
        parcel.writeString(this.f32672e);
        Long l = this.f32673f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f32674g;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f32675v);
    }

    public LoginDomain(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12580l Long l, @C12580l Long l2, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "refreshToken");
        Intrinsics.checkNotNullParameter(str3, "scope");
        Intrinsics.checkNotNullParameter(str4, "idToken");
        Intrinsics.checkNotNullParameter(str5, "uidIam");
        Intrinsics.checkNotNullParameter(str6, "expiresIn");
        this.f32668a = str;
        this.f32669b = str2;
        this.f32670c = str3;
        this.f32671d = str4;
        this.f32672e = str5;
        this.f32673f = l;
        this.f32674g = l2;
        this.f32675v = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LoginDomain(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Long r16, java.lang.Long r17, java.lang.String r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r11
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r12
        L_0x0018:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0023
        L_0x0022:
            r3 = r13
        L_0x0023:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x002e
        L_0x002d:
            r4 = r14
        L_0x002e:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0038
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x0039
        L_0x0038:
            r5 = r15
        L_0x0039:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0044
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto L_0x0046
        L_0x0044:
            r6 = r16
        L_0x0046:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x004f
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x0051
        L_0x004f:
            r7 = r17
        L_0x0051:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x005d
        L_0x005b:
            r0 = r18
        L_0x005d:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.models.LoginDomain.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
