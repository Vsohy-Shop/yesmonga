package com.carrefour.fid.android.domain.models.slot;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u0000 @2\u00020\u0001:\u0001-B~\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\nø\u0001\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\nHÆ\u0003J\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\u0019\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\"HÖ\u0001R \u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b0\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b1\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b2\u0010\u0004R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b3\u0010\u0004R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\fR\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b6\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u0010\u0004R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010\u0011R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b7\u0010\u0004R\u0017\u0010\u001e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/Slot;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/slot/SlotId;", "b", "()Ljava/lang/String;", "", "e", "f", "g", "h", "", "i", "()Ljava/lang/Boolean;", "j", "k", "", "l", "()Ljava/lang/Double;", "c", "d", "slotId", "maximalCapacity", "capacityUsed", "dateBegin", "dateEnd", "isAvailable", "status", "slice", "totalPrice", "tokenPrice", "isGreenSlot", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Z)Lcom/carrefour/fid/android/domain/models/slot/Slot;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "a", "Ljava/lang/String;", "t", "r", "o", "p", "q", "Ljava/lang/Boolean;", "x", "u", "v", "s", "w", "Ljava/lang/Double;", "y", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "z", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Slot implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Slot> CREATOR = new C38177b();
    @C12579k

    /* renamed from: X */
    public static final Slot f96705X = new Slot(SlotId.m158308b("-1"), (String) null, (String) null, "", "", Boolean.FALSE, "", "", (Double) null, (String) null, false, 6, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: z */
    public static final C38176a f96706z = new C38176a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final String f96707a;
    @C12579k

    /* renamed from: b */
    public final String f96708b;
    @C12579k

    /* renamed from: c */
    public final String f96709c;
    @C12579k

    /* renamed from: d */
    public final String f96710d;
    @C12579k

    /* renamed from: e */
    public final String f96711e;
    @C12580l

    /* renamed from: f */
    public final Boolean f96712f;
    @C12579k

    /* renamed from: g */
    public final String f96713g;
    @C12579k

    /* renamed from: v */
    public final String f96714v;
    @C12580l

    /* renamed from: w */
    public final Double f96715w;
    @C12580l

    /* renamed from: x */
    public final String f96716x;

    /* renamed from: y */
    public final boolean f96717y;

    /* renamed from: com.carrefour.fid.android.domain.models.slot.Slot$a */
    public static final class C38176a {
        public /* synthetic */ C38176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final Slot mo119516a() {
            return Slot.f96705X;
        }

        public C38176a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.slot.Slot$b */
    public static final class C38177b implements Parcelable.Creator<Slot> {
        @C12579k
        /* renamed from: a */
        public final Slot createFromParcel(@C12579k Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String j = SlotId.CREATOR.createFromParcel(parcel2).mo119541j();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Slot(j, readString, readString2, readString3, readString4, bool, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final Slot[] newArray(int i) {
            return new Slot[i];
        }
    }

    public /* synthetic */ Slot(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, Double d, String str8, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, bool, str6, str7, d, str8, z);
    }

    /* renamed from: n */
    public static /* synthetic */ Slot m158270n(Slot slot, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, Double d, String str8, boolean z, int i, Object obj) {
        Slot slot2 = slot;
        int i2 = i;
        return slot.mo119502m((i2 & 1) != 0 ? slot2.f96707a : str, (i2 & 2) != 0 ? slot2.f96708b : str2, (i2 & 4) != 0 ? slot2.f96709c : str3, (i2 & 8) != 0 ? slot2.f96710d : str4, (i2 & 16) != 0 ? slot2.f96711e : str5, (i2 & 32) != 0 ? slot2.f96712f : bool, (i2 & 64) != 0 ? slot2.f96713g : str6, (i2 & 128) != 0 ? slot2.f96714v : str7, (i2 & 256) != 0 ? slot2.f96715w : d, (i2 & 512) != 0 ? slot2.f96716x : str8, (i2 & 1024) != 0 ? slot2.f96717y : z);
    }

    @C12579k
    /* renamed from: b */
    public final String mo119488b() {
        return this.f96707a;
    }

    @C12580l
    /* renamed from: c */
    public final String mo119489c() {
        return this.f96716x;
    }

    /* renamed from: d */
    public final boolean mo119490d() {
        return this.f96717y;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo119492e() {
        return this.f96708b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slot)) {
            return false;
        }
        Slot slot = (Slot) obj;
        return SlotId.m158312f(this.f96707a, slot.f96707a) && Intrinsics.areEqual((Object) this.f96708b, (Object) slot.f96708b) && Intrinsics.areEqual((Object) this.f96709c, (Object) slot.f96709c) && Intrinsics.areEqual((Object) this.f96710d, (Object) slot.f96710d) && Intrinsics.areEqual((Object) this.f96711e, (Object) slot.f96711e) && Intrinsics.areEqual((Object) this.f96712f, (Object) slot.f96712f) && Intrinsics.areEqual((Object) this.f96713g, (Object) slot.f96713g) && Intrinsics.areEqual((Object) this.f96714v, (Object) slot.f96714v) && Intrinsics.areEqual((Object) this.f96715w, (Object) slot.f96715w) && Intrinsics.areEqual((Object) this.f96716x, (Object) slot.f96716x) && this.f96717y == slot.f96717y;
    }

    @C12579k
    /* renamed from: f */
    public final String mo119494f() {
        return this.f96709c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo119495g() {
        return this.f96710d;
    }

    @C12579k
    /* renamed from: h */
    public final String mo119496h() {
        return this.f96711e;
    }

    public int hashCode() {
        int h = ((((((((SlotId.m158313h(this.f96707a) * 31) + this.f96708b.hashCode()) * 31) + this.f96709c.hashCode()) * 31) + this.f96710d.hashCode()) * 31) + this.f96711e.hashCode()) * 31;
        Boolean bool = this.f96712f;
        int i = 0;
        int hashCode = (((((h + (bool == null ? 0 : bool.hashCode())) * 31) + this.f96713g.hashCode()) * 31) + this.f96714v.hashCode()) * 31;
        Double d = this.f96715w;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f96716x;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f96717y;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final Boolean mo119498i() {
        return this.f96712f;
    }

    @C12579k
    /* renamed from: j */
    public final String mo119499j() {
        return this.f96713g;
    }

    @C12579k
    /* renamed from: k */
    public final String mo119500k() {
        return this.f96714v;
    }

    @C12580l
    /* renamed from: l */
    public final Double mo119501l() {
        return this.f96715w;
    }

    @C12579k
    /* renamed from: m */
    public final Slot mo119502m(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12580l Boolean bool, @C12579k String str6, @C12579k String str7, @C12580l Double d, @C12580l String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "maximalCapacity");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "capacityUsed");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "dateBegin");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "dateEnd");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "status");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, "slice");
        return new Slot(str, str9, str10, str11, str12, bool, str13, str14, d, str8, z, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: o */
    public final String mo119503o() {
        return this.f96709c;
    }

    @C12579k
    /* renamed from: p */
    public final String mo119504p() {
        return this.f96710d;
    }

    @C12579k
    /* renamed from: q */
    public final String mo119505q() {
        return this.f96711e;
    }

    @C12579k
    /* renamed from: r */
    public final String mo119506r() {
        return this.f96708b;
    }

    @C12579k
    /* renamed from: s */
    public final String mo119507s() {
        return this.f96714v;
    }

    @C12579k
    /* renamed from: t */
    public final String mo119508t() {
        return this.f96707a;
    }

    @C12579k
    public String toString() {
        String i = SlotId.m158314i(this.f96707a);
        String str = this.f96708b;
        String str2 = this.f96709c;
        String str3 = this.f96710d;
        String str4 = this.f96711e;
        Boolean bool = this.f96712f;
        String str5 = this.f96713g;
        String str6 = this.f96714v;
        Double d = this.f96715w;
        String str7 = this.f96716x;
        boolean z = this.f96717y;
        return "Slot(slotId=" + i + ", maximalCapacity=" + str + ", capacityUsed=" + str2 + ", dateBegin=" + str3 + ", dateEnd=" + str4 + ", isAvailable=" + bool + ", status=" + str5 + ", slice=" + str6 + ", totalPrice=" + d + ", tokenPrice=" + str7 + ", isGreenSlot=" + z + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo119510u() {
        return this.f96713g;
    }

    @C12580l
    /* renamed from: v */
    public final String mo119511v() {
        return this.f96716x;
    }

    @C12580l
    /* renamed from: w */
    public final Double mo119512w() {
        return this.f96715w;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        SlotId.m158315k(this.f96707a, parcel, i);
        parcel.writeString(this.f96708b);
        parcel.writeString(this.f96709c);
        parcel.writeString(this.f96710d);
        parcel.writeString(this.f96711e);
        Boolean bool = this.f96712f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f96713g);
        parcel.writeString(this.f96714v);
        Double d = this.f96715w;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f96716x);
        parcel.writeInt(this.f96717y ? 1 : 0);
    }

    @C12580l
    /* renamed from: x */
    public final Boolean mo119514x() {
        return this.f96712f;
    }

    /* renamed from: y */
    public final boolean mo119515y() {
        return this.f96717y;
    }

    public Slot(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, Double d, String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str2, "maximalCapacity");
        Intrinsics.checkNotNullParameter(str3, "capacityUsed");
        Intrinsics.checkNotNullParameter(str4, "dateBegin");
        Intrinsics.checkNotNullParameter(str5, "dateEnd");
        Intrinsics.checkNotNullParameter(str6, "status");
        Intrinsics.checkNotNullParameter(str7, "slice");
        this.f96707a = str;
        this.f96708b = str2;
        this.f96709c = str3;
        this.f96710d = str4;
        this.f96711e = str5;
        this.f96712f = bool;
        this.f96713g = str6;
        this.f96714v = str7;
        this.f96715w = d;
        this.f96716x = str8;
        this.f96717y = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Slot(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, java.lang.String r19, java.lang.String r20, java.lang.Double r21, java.lang.String r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = 1
            java.lang.String r1 = com.carrefour.fid.android.domain.models.slot.SlotId.m158309c(r2, r1, r2)
            goto L_0x000e
        L_0x000d:
            r1 = r13
        L_0x000e:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0019
        L_0x0018:
            r3 = r14
        L_0x0019:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x0024
        L_0x0023:
            r4 = r15
        L_0x0024:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x002e
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x0030
        L_0x002e:
            r5 = r16
        L_0x0030:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x003a
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x003c
        L_0x003a:
            r6 = r17
        L_0x003c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0042
            r7 = r2
            goto L_0x0044
        L_0x0042:
            r7 = r18
        L_0x0044:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x004e
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x0050
        L_0x004e:
            r8 = r19
        L_0x0050:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x005a
            java.lang.String r9 = new java.lang.String
            r9.<init>()
            goto L_0x005c
        L_0x005a:
            r9 = r20
        L_0x005c:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0062
            r10 = r2
            goto L_0x0064
        L_0x0062:
            r10 = r21
        L_0x0064:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r2 = r22
        L_0x006b:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            goto L_0x0073
        L_0x0071:
            r0 = r23
        L_0x0073:
            r11 = 0
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r2
            r24 = r0
            r25 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.slot.Slot.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Double, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
