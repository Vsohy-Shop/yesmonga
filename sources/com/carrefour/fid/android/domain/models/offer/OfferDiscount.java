package com.carrefour.fid.android.domain.models.offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u0001Bz\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003ø\u0001\u0000J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fHÆ\u0003J\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\r2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fHÆ\u0001ø\u0001\u0000J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010)\u001a\u00020\u0004HÖ\u0001J\u0019\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b8\u00107R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b9\u00101R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u00107R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u001e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010 \u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bA\u0010GR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bE\u00104R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\bH\u0010D\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/OfferDiscount;", "Landroid/os/Parcelable;", "", "a", "", "e", "", "f", "g", "h", "i", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;", "j", "", "k", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "l", "", "b", "c", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountArticle;", "d", "amount", "bundle", "dateBegin", "dateEnd", "forcedPrice", "label", "type", "hasLoyaltyCard", "gtins", "mandateId", "quantityOfTriggeredDiscount", "triggerArticles", "m", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "D", "o", "()D", "I", "p", "()I", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "r", "s", "v", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;", "z", "()Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;", "Z", "u", "()Z", "w", "Ljava/util/List;", "t", "()Ljava/util/List;", "x", "J", "()J", "y", "<init>", "(DILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;ZLjava/util/List;JILjava/util/List;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class OfferDiscount implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OfferDiscount> CREATOR = new C38055a();

    /* renamed from: a */
    public final double f95993a;

    /* renamed from: b */
    public final int f95994b;
    @C12579k

    /* renamed from: c */
    public final String f95995c;
    @C12579k

    /* renamed from: d */
    public final String f95996d;

    /* renamed from: e */
    public final double f95997e;
    @C12579k

    /* renamed from: f */
    public final String f95998f;
    @C12579k

    /* renamed from: g */
    public final OfferDiscountType f95999g;

    /* renamed from: v */
    public final boolean f96000v;
    @C12579k

    /* renamed from: w */
    public final List<Gtin> f96001w;

    /* renamed from: x */
    public final long f96002x;

    /* renamed from: y */
    public final int f96003y;
    @C12579k

    /* renamed from: z */
    public final List<OfferDiscountArticle> f96004z;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.OfferDiscount$a */
    public static final class C38055a implements Parcelable.Creator<OfferDiscount> {
        @C12579k
        /* renamed from: a */
        public final OfferDiscount createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            double readDouble = parcel.readDouble();
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            double readDouble2 = parcel.readDouble();
            String readString3 = parcel.readString();
            OfferDiscountType valueOf = OfferDiscountType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(Gtin.CREATOR.createFromParcel(parcel2));
            }
            long readLong = parcel.readLong();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            long j = readLong;
            ArrayList arrayList2 = new ArrayList(readInt4);
            for (int i2 = 0; i2 != readInt4; i2++) {
                arrayList2.add(OfferDiscountArticle.CREATOR.createFromParcel(parcel2));
            }
            return new OfferDiscount(readDouble, readInt, readString, readString2, readDouble2, readString3, valueOf, z, arrayList, j, readInt3, arrayList2);
        }

        @C12579k
        /* renamed from: b */
        public final OfferDiscount[] newArray(int i) {
            return new OfferDiscount[i];
        }
    }

    public OfferDiscount(double d, int i, @C12579k String str, @C12579k String str2, double d2, @C12579k String str3, @C12579k OfferDiscountType offerDiscountType, boolean z, @C12579k List<Gtin> list, long j, int i2, @C12579k List<OfferDiscountArticle> list2) {
        String str4 = str3;
        OfferDiscountType offerDiscountType2 = offerDiscountType;
        List<Gtin> list3 = list;
        List<OfferDiscountArticle> list4 = list2;
        Intrinsics.checkNotNullParameter(str, "dateBegin");
        Intrinsics.checkNotNullParameter(str2, "dateEnd");
        Intrinsics.checkNotNullParameter(str4, "label");
        Intrinsics.checkNotNullParameter(offerDiscountType2, "type");
        Intrinsics.checkNotNullParameter(list3, "gtins");
        Intrinsics.checkNotNullParameter(list4, "triggerArticles");
        this.f95993a = d;
        this.f95994b = i;
        this.f95995c = str;
        this.f95996d = str2;
        this.f95997e = d2;
        this.f95998f = str4;
        this.f95999g = offerDiscountType2;
        this.f96000v = z;
        this.f96001w = list3;
        this.f96002x = j;
        this.f96003y = i2;
        this.f96004z = list4;
    }

    /* renamed from: n */
    public static /* synthetic */ OfferDiscount m157060n(OfferDiscount offerDiscount, double d, int i, String str, String str2, double d2, String str3, OfferDiscountType offerDiscountType, boolean z, List list, long j, int i2, List list2, int i3, Object obj) {
        OfferDiscount offerDiscount2 = offerDiscount;
        int i4 = i3;
        return offerDiscount.mo118073m((i4 & 1) != 0 ? offerDiscount2.f95993a : d, (i4 & 2) != 0 ? offerDiscount2.f95994b : i, (i4 & 4) != 0 ? offerDiscount2.f95995c : str, (i4 & 8) != 0 ? offerDiscount2.f95996d : str2, (i4 & 16) != 0 ? offerDiscount2.f95997e : d2, (i4 & 32) != 0 ? offerDiscount2.f95998f : str3, (i4 & 64) != 0 ? offerDiscount2.f95999g : offerDiscountType, (i4 & 128) != 0 ? offerDiscount2.f96000v : z, (i4 & 256) != 0 ? offerDiscount2.f96001w : list, (i4 & 512) != 0 ? offerDiscount2.f96002x : j, (i4 & 1024) != 0 ? offerDiscount2.f96003y : i2, (i4 & 2048) != 0 ? offerDiscount2.f96004z : list2);
    }

    /* renamed from: a */
    public final double mo118058a() {
        return this.f95993a;
    }

    /* renamed from: b */
    public final long mo118059b() {
        return this.f96002x;
    }

    /* renamed from: c */
    public final int mo118060c() {
        return this.f96003y;
    }

    @C12579k
    /* renamed from: d */
    public final List<OfferDiscountArticle> mo118061d() {
        return this.f96004z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo118063e() {
        return this.f95994b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDiscount)) {
            return false;
        }
        OfferDiscount offerDiscount = (OfferDiscount) obj;
        return Double.compare(this.f95993a, offerDiscount.f95993a) == 0 && this.f95994b == offerDiscount.f95994b && Intrinsics.areEqual((Object) this.f95995c, (Object) offerDiscount.f95995c) && Intrinsics.areEqual((Object) this.f95996d, (Object) offerDiscount.f95996d) && Double.compare(this.f95997e, offerDiscount.f95997e) == 0 && Intrinsics.areEqual((Object) this.f95998f, (Object) offerDiscount.f95998f) && this.f95999g == offerDiscount.f95999g && this.f96000v == offerDiscount.f96000v && Intrinsics.areEqual((Object) this.f96001w, (Object) offerDiscount.f96001w) && this.f96002x == offerDiscount.f96002x && this.f96003y == offerDiscount.f96003y && Intrinsics.areEqual((Object) this.f96004z, (Object) offerDiscount.f96004z);
    }

    @C12579k
    /* renamed from: f */
    public final String mo118065f() {
        return this.f95995c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo118066g() {
        return this.f95996d;
    }

    /* renamed from: h */
    public final double mo118067h() {
        return this.f95997e;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Double.hashCode(this.f95993a) * 31) + Integer.hashCode(this.f95994b)) * 31) + this.f95995c.hashCode()) * 31) + this.f95996d.hashCode()) * 31) + Double.hashCode(this.f95997e)) * 31) + this.f95998f.hashCode()) * 31) + this.f95999g.hashCode()) * 31;
        boolean z = this.f96000v;
        if (z) {
            z = true;
        }
        return ((((((((hashCode + (z ? 1 : 0)) * 31) + this.f96001w.hashCode()) * 31) + Long.hashCode(this.f96002x)) * 31) + Integer.hashCode(this.f96003y)) * 31) + this.f96004z.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo118069i() {
        return this.f95998f;
    }

    @C12579k
    /* renamed from: j */
    public final OfferDiscountType mo118070j() {
        return this.f95999g;
    }

    /* renamed from: k */
    public final boolean mo118071k() {
        return this.f96000v;
    }

    @C12579k
    /* renamed from: l */
    public final List<Gtin> mo118072l() {
        return this.f96001w;
    }

    @C12579k
    /* renamed from: m */
    public final OfferDiscount mo118073m(double d, int i, @C12579k String str, @C12579k String str2, double d2, @C12579k String str3, @C12579k OfferDiscountType offerDiscountType, boolean z, @C12579k List<Gtin> list, long j, int i2, @C12579k List<OfferDiscountArticle> list2) {
        String str4 = str;
        Intrinsics.checkNotNullParameter(str4, "dateBegin");
        String str5 = str2;
        Intrinsics.checkNotNullParameter(str5, "dateEnd");
        String str6 = str3;
        Intrinsics.checkNotNullParameter(str6, "label");
        OfferDiscountType offerDiscountType2 = offerDiscountType;
        Intrinsics.checkNotNullParameter(offerDiscountType2, "type");
        List<Gtin> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "gtins");
        Intrinsics.checkNotNullParameter(list2, "triggerArticles");
        return new OfferDiscount(d, i, str4, str5, d2, str6, offerDiscountType2, z, list3, j, i2, list2);
    }

    /* renamed from: o */
    public final double mo118074o() {
        return this.f95993a;
    }

    /* renamed from: p */
    public final int mo118075p() {
        return this.f95994b;
    }

    @C12579k
    /* renamed from: q */
    public final String mo118076q() {
        return this.f95995c;
    }

    @C12579k
    /* renamed from: r */
    public final String mo118077r() {
        return this.f95996d;
    }

    /* renamed from: s */
    public final double mo118078s() {
        return this.f95997e;
    }

    @C12579k
    /* renamed from: t */
    public final List<Gtin> mo118079t() {
        return this.f96001w;
    }

    @C12579k
    public String toString() {
        double d = this.f95993a;
        int i = this.f95994b;
        String str = this.f95995c;
        String str2 = this.f95996d;
        double d2 = this.f95997e;
        String str3 = this.f95998f;
        OfferDiscountType offerDiscountType = this.f95999g;
        boolean z = this.f96000v;
        List<Gtin> list = this.f96001w;
        long j = this.f96002x;
        int i2 = this.f96003y;
        List<OfferDiscountArticle> list2 = this.f96004z;
        return "OfferDiscount(amount=" + d + ", bundle=" + i + ", dateBegin=" + str + ", dateEnd=" + str2 + ", forcedPrice=" + d2 + ", label=" + str3 + ", type=" + offerDiscountType + ", hasLoyaltyCard=" + z + ", gtins=" + list + ", mandateId=" + j + ", quantityOfTriggeredDiscount=" + i2 + ", triggerArticles=" + list2 + ")";
    }

    /* renamed from: u */
    public final boolean mo118081u() {
        return this.f96000v;
    }

    @C12579k
    /* renamed from: v */
    public final String mo118082v() {
        return this.f95998f;
    }

    /* renamed from: w */
    public final long mo118083w() {
        return this.f96002x;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.f95993a);
        parcel.writeInt(this.f95994b);
        parcel.writeString(this.f95995c);
        parcel.writeString(this.f95996d);
        parcel.writeDouble(this.f95997e);
        parcel.writeString(this.f95998f);
        parcel.writeString(this.f95999g.name());
        parcel.writeInt(this.f96000v ? 1 : 0);
        List<Gtin> list = this.f96001w;
        parcel.writeInt(list.size());
        for (Gtin i2 : list) {
            Gtin.m157314j(i2.mo118380i(), parcel, i);
        }
        parcel.writeLong(this.f96002x);
        parcel.writeInt(this.f96003y);
        List<OfferDiscountArticle> list2 = this.f96004z;
        parcel.writeInt(list2.size());
        for (OfferDiscountArticle writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    /* renamed from: x */
    public final int mo118085x() {
        return this.f96003y;
    }

    @C12579k
    /* renamed from: y */
    public final List<OfferDiscountArticle> mo118086y() {
        return this.f96004z;
    }

    @C12579k
    /* renamed from: z */
    public final OfferDiscountType mo118087z() {
        return this.f95999g;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferDiscount(double r19, int r21, java.lang.String r22, java.lang.String r23, double r24, java.lang.String r26, com.carrefour.fid.android.domain.models.offer.OfferDiscountType r27, boolean r28, java.util.List r29, long r30, int r32, java.util.List r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r12 = r1
            goto L_0x000b
        L_0x0009:
            r12 = r28
        L_0x000b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r13 = r0
            goto L_0x0017
        L_0x0015:
            r13 = r29
        L_0x0017:
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r10 = r26
            r11 = r27
            r14 = r30
            r16 = r32
            r17 = r33
            r2.<init>(r3, r5, r6, r7, r8, r10, r11, r12, r13, r14, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.offer.OfferDiscount.<init>(double, int, java.lang.String, java.lang.String, double, java.lang.String, com.carrefour.fid.android.domain.models.offer.OfferDiscountType, boolean, java.util.List, long, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
