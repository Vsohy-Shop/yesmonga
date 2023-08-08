package com.carrefour.fid.android.domain.models.criteo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b9\u0010:J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0019\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0007R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010\u0007R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010\u0007R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b1\u0010\u0007R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b2\u0010\u0007R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/criteo/CriteoFormatRendering;", "Landroid/os/Parcelable;", "", "a", "c", "", "d", "()Ljava/lang/Integer;", "e", "f", "g", "h", "i", "Lcom/carrefour/fid/android/domain/models/criteo/OptionalFooterType;", "j", "b", "logoImageUrl", "backgroundImageUrl", "backgroundColor", "borderColor", "buttonColor", "selectedButtonColor", "buttonTextColor", "selectedButtonTextColor", "optionalFooterType", "optionalFooterUrl", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/criteo/OptionalFooterType;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/models/criteo/CriteoFormatRendering;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "n", "Ljava/lang/Integer;", "m", "o", "p", "u", "q", "v", "w", "Lcom/carrefour/fid/android/domain/models/criteo/OptionalFooterType;", "s", "()Lcom/carrefour/fid/android/domain/models/criteo/OptionalFooterType;", "x", "t", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/criteo/OptionalFooterType;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CriteoFormatRendering implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CriteoFormatRendering> CREATOR = new C37998a();
    @C12580l

    /* renamed from: a */
    public final String f95667a;
    @C12580l

    /* renamed from: b */
    public final String f95668b;
    @C12580l

    /* renamed from: c */
    public final Integer f95669c;
    @C12580l

    /* renamed from: d */
    public final Integer f95670d;
    @C12580l

    /* renamed from: e */
    public final Integer f95671e;
    @C12580l

    /* renamed from: f */
    public final Integer f95672f;
    @C12580l

    /* renamed from: g */
    public final Integer f95673g;
    @C12580l

    /* renamed from: v */
    public final Integer f95674v;
    @C12579k

    /* renamed from: w */
    public final OptionalFooterType f95675w;
    @C12580l

    /* renamed from: x */
    public final String f95676x;

    /* renamed from: com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering$a */
    public static final class C37998a implements Parcelable.Creator<CriteoFormatRendering> {
        @C12579k
        /* renamed from: a */
        public final CriteoFormatRendering createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CriteoFormatRendering(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), OptionalFooterType.valueOf(parcel.readString()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CriteoFormatRendering[] newArray(int i) {
            return new CriteoFormatRendering[i];
        }
    }

    public CriteoFormatRendering(@C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4, @C12580l Integer num5, @C12580l Integer num6, @C12579k OptionalFooterType optionalFooterType, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(optionalFooterType, "optionalFooterType");
        this.f95667a = str;
        this.f95668b = str2;
        this.f95669c = num;
        this.f95670d = num2;
        this.f95671e = num3;
        this.f95672f = num4;
        this.f95673g = num5;
        this.f95674v = num6;
        this.f95675w = optionalFooterType;
        this.f95676x = str3;
    }

    /* renamed from: l */
    public static /* synthetic */ CriteoFormatRendering m156427l(CriteoFormatRendering criteoFormatRendering, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, OptionalFooterType optionalFooterType, String str3, int i, Object obj) {
        CriteoFormatRendering criteoFormatRendering2 = criteoFormatRendering;
        int i2 = i;
        return criteoFormatRendering.mo117349k((i2 & 1) != 0 ? criteoFormatRendering2.f95667a : str, (i2 & 2) != 0 ? criteoFormatRendering2.f95668b : str2, (i2 & 4) != 0 ? criteoFormatRendering2.f95669c : num, (i2 & 8) != 0 ? criteoFormatRendering2.f95670d : num2, (i2 & 16) != 0 ? criteoFormatRendering2.f95671e : num3, (i2 & 32) != 0 ? criteoFormatRendering2.f95672f : num4, (i2 & 64) != 0 ? criteoFormatRendering2.f95673g : num5, (i2 & 128) != 0 ? criteoFormatRendering2.f95674v : num6, (i2 & 256) != 0 ? criteoFormatRendering2.f95675w : optionalFooterType, (i2 & 512) != 0 ? criteoFormatRendering2.f95676x : str3);
    }

    @C12580l
    /* renamed from: a */
    public final String mo117336a() {
        return this.f95667a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo117337b() {
        return this.f95676x;
    }

    @C12580l
    /* renamed from: c */
    public final String mo117338c() {
        return this.f95668b;
    }

    @C12580l
    /* renamed from: d */
    public final Integer mo117339d() {
        return this.f95669c;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo117341e() {
        return this.f95670d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteoFormatRendering)) {
            return false;
        }
        CriteoFormatRendering criteoFormatRendering = (CriteoFormatRendering) obj;
        return Intrinsics.areEqual((Object) this.f95667a, (Object) criteoFormatRendering.f95667a) && Intrinsics.areEqual((Object) this.f95668b, (Object) criteoFormatRendering.f95668b) && Intrinsics.areEqual((Object) this.f95669c, (Object) criteoFormatRendering.f95669c) && Intrinsics.areEqual((Object) this.f95670d, (Object) criteoFormatRendering.f95670d) && Intrinsics.areEqual((Object) this.f95671e, (Object) criteoFormatRendering.f95671e) && Intrinsics.areEqual((Object) this.f95672f, (Object) criteoFormatRendering.f95672f) && Intrinsics.areEqual((Object) this.f95673g, (Object) criteoFormatRendering.f95673g) && Intrinsics.areEqual((Object) this.f95674v, (Object) criteoFormatRendering.f95674v) && this.f95675w == criteoFormatRendering.f95675w && Intrinsics.areEqual((Object) this.f95676x, (Object) criteoFormatRendering.f95676x);
    }

    @C12580l
    /* renamed from: f */
    public final Integer mo117343f() {
        return this.f95671e;
    }

    @C12580l
    /* renamed from: g */
    public final Integer mo117344g() {
        return this.f95672f;
    }

    @C12580l
    /* renamed from: h */
    public final Integer mo117345h() {
        return this.f95673g;
    }

    public int hashCode() {
        String str = this.f95667a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95668b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f95669c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f95670d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f95671e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f95672f;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f95673g;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f95674v;
        int hashCode8 = (((hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31) + this.f95675w.hashCode()) * 31;
        String str3 = this.f95676x;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode8 + i;
    }

    @C12580l
    /* renamed from: i */
    public final Integer mo117347i() {
        return this.f95674v;
    }

    @C12579k
    /* renamed from: j */
    public final OptionalFooterType mo117348j() {
        return this.f95675w;
    }

    @C12579k
    /* renamed from: k */
    public final CriteoFormatRendering mo117349k(@C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4, @C12580l Integer num5, @C12580l Integer num6, @C12579k OptionalFooterType optionalFooterType, @C12580l String str3) {
        OptionalFooterType optionalFooterType2 = optionalFooterType;
        Intrinsics.checkNotNullParameter(optionalFooterType2, "optionalFooterType");
        return new CriteoFormatRendering(str, str2, num, num2, num3, num4, num5, num6, optionalFooterType2, str3);
    }

    @C12580l
    /* renamed from: m */
    public final Integer mo117350m() {
        return this.f95669c;
    }

    @C12580l
    /* renamed from: n */
    public final String mo117351n() {
        return this.f95668b;
    }

    @C12580l
    /* renamed from: o */
    public final Integer mo117352o() {
        return this.f95670d;
    }

    @C12580l
    /* renamed from: p */
    public final Integer mo117353p() {
        return this.f95671e;
    }

    @C12580l
    /* renamed from: q */
    public final Integer mo117354q() {
        return this.f95673g;
    }

    @C12580l
    /* renamed from: r */
    public final String mo117355r() {
        return this.f95667a;
    }

    @C12579k
    /* renamed from: s */
    public final OptionalFooterType mo117356s() {
        return this.f95675w;
    }

    @C12580l
    /* renamed from: t */
    public final String mo117357t() {
        return this.f95676x;
    }

    @C12579k
    public String toString() {
        String str = this.f95667a;
        String str2 = this.f95668b;
        Integer num = this.f95669c;
        Integer num2 = this.f95670d;
        Integer num3 = this.f95671e;
        Integer num4 = this.f95672f;
        Integer num5 = this.f95673g;
        Integer num6 = this.f95674v;
        OptionalFooterType optionalFooterType = this.f95675w;
        String str3 = this.f95676x;
        return "CriteoFormatRendering(logoImageUrl=" + str + ", backgroundImageUrl=" + str2 + ", backgroundColor=" + num + ", borderColor=" + num2 + ", buttonColor=" + num3 + ", selectedButtonColor=" + num4 + ", buttonTextColor=" + num5 + ", selectedButtonTextColor=" + num6 + ", optionalFooterType=" + optionalFooterType + ", optionalFooterUrl=" + str3 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final Integer mo117359u() {
        return this.f95672f;
    }

    @C12580l
    /* renamed from: v */
    public final Integer mo117360v() {
        return this.f95674v;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95667a);
        parcel.writeString(this.f95668b);
        Integer num = this.f95669c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f95670d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f95671e;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.f95672f;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.f95673g;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.f95674v;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.f95675w.name());
        parcel.writeString(this.f95676x);
    }
}
