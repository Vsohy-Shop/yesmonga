package com.carrefour.fid.android.domain.models.offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.product.Gtin;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\b\u0018\u00002\u00020\u0001B¤\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\r\u0010\"\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f\u0012\r\u0010#\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f\u0012\u000b\u0010$\u001a\u00070\u000e¢\u0006\u0002\b\u000f\u0012\r\u0010%\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f\u0012\r\u0010&\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f\u0012\r\u0010'\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f\u0012\u0006\u0010(\u001a\u00020\u0018\u0012\u0006\u0010)\u001a\u00020\u0018\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cø\u0001\u0002¢\u0006\u0004\bT\u0010UJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001e\u0010\u0013\u001a\u00070\u000e¢\u0006\u0002\b\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0011J \u0010\u0016\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u0017\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0002HÆ\u0003J\u0014\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003ø\u0001\u0002JÊ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\u000f\b\u0002\u0010\"\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u000f\b\u0002\u0010#\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\r\b\u0002\u0010$\u001a\u00070\u000e¢\u0006\u0002\b\u000f2\u000f\b\u0002\u0010%\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u000f\b\u0002\u0010&\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u000f\b\u0002\u0010'\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00022\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010-J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\u000bHÖ\u0001J\u0013\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00103\u001a\u00020\u000bHÖ\u0001J\u0019\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010;R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010?\u001a\u0004\b@\u0010\rR'\u0010\"\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010\u0011R'\u0010#\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010A\u001a\u0004\bC\u0010\u0011R%\u0010$\u001a\u00070\u000e¢\u0006\u0002\b\u000f8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010\u0014R'\u0010%\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bF\u0010\u0011R'\u0010&\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010\u0011R'\u0010'\u001a\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bI\u0010\u0011R\u0017\u0010(\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b=\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010)\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bK\u0010J\u001a\u0004\bM\u0010LR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010N\u001a\u0004\bO\u0010PR\"\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006ø\u0001\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bH\u0010S\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006V"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/Discount;", "Landroid/os/Parcelable;", "", "B", "E", "C", "D", "Lcom/carrefour/fid/android/domain/models/offer/PromoType;", "a", "", "f", "", "g", "()Ljava/lang/Integer;", "Lcom/carrefour/fid/android/domain/models/offer/d;", "Lkotlinx/parcelize/e;", "h", "()Lcom/carrefour/fid/android/domain/models/offer/d;", "i", "j", "()I", "k", "l", "m", "Lorg/joda/time/DateTime;", "b", "c", "d", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "e", "type", "label", "bundle", "discountAmount", "startingPrice", "displayPrice", "forcedPrice", "bundleSalePrice", "bundleBasePrice", "startDate", "endDate", "isMixed", "gtins", "n", "(Lcom/carrefour/fid/android/domain/models/offer/PromoType;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/offer/d;Lcom/carrefour/fid/android/domain/models/offer/d;ILcom/carrefour/fid/android/domain/models/offer/d;Lcom/carrefour/fid/android/domain/models/offer/d;Lcom/carrefour/fid/android/domain/models/offer/d;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/util/List;)Lcom/carrefour/fid/android/domain/models/offer/Discount;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/offer/PromoType;", "A", "()Lcom/carrefour/fid/android/domain/models/offer/PromoType;", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "Ljava/lang/Integer;", "p", "Lcom/carrefour/fid/android/domain/models/offer/d;", "s", "z", "I", "t", "v", "r", "w", "q", "Lorg/joda/time/DateTime;", "y", "()Lorg/joda/time/DateTime;", "u", "Z", "F", "()Z", "X", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Lcom/carrefour/fid/android/domain/models/offer/PromoType;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/domain/models/offer/d;Lcom/carrefour/fid/android/domain/models/offer/d;ILcom/carrefour/fid/android/domain/models/offer/d;Lcom/carrefour/fid/android/domain/models/offer/d;Lcom/carrefour/fid/android/domain/models/offer/d;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Discount implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Discount> CREATOR = new C38053a();
    @C12580l

    /* renamed from: X */
    public final List<Gtin> f95946X;
    @C12579k

    /* renamed from: a */
    public final PromoType f95947a;
    @C12579k

    /* renamed from: b */
    public final String f95948b;
    @C12580l

    /* renamed from: c */
    public final Integer f95949c;
    @C12580l

    /* renamed from: d */
    public final C38067d f95950d;
    @C12580l

    /* renamed from: e */
    public final C38067d f95951e;

    /* renamed from: f */
    public final int f95952f;
    @C12580l

    /* renamed from: g */
    public final C38067d f95953g;
    @C12580l

    /* renamed from: v */
    public final C38067d f95954v;
    @C12580l

    /* renamed from: w */
    public final C38067d f95955w;
    @C12579k

    /* renamed from: x */
    public final DateTime f95956x;
    @C12579k

    /* renamed from: y */
    public final DateTime f95957y;

    /* renamed from: z */
    public final boolean f95958z;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.Discount$a */
    public static final class C38053a implements Parcelable.Creator<Discount> {
        @C12579k
        /* renamed from: a */
        public final Discount createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            PromoType valueOf = PromoType.valueOf(parcel.readString());
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Class<Discount> cls = Discount.class;
            C38067d dVar = (C38067d) parcel2.readValue(cls.getClassLoader());
            C38067d dVar2 = (C38067d) parcel2.readValue(cls.getClassLoader());
            int h = ((C38067d) parcel2.readValue(cls.getClassLoader())).mo118204h();
            C38067d dVar3 = (C38067d) parcel2.readValue(cls.getClassLoader());
            C38067d dVar4 = (C38067d) parcel2.readValue(cls.getClassLoader());
            C38067d dVar5 = (C38067d) parcel2.readValue(cls.getClassLoader());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    arrayList.add(Gtin.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt = readInt;
                }
            }
            return new Discount(valueOf, readString, valueOf2, dVar, dVar2, h, dVar3, dVar4, dVar5, dateTime, dateTime2, z, arrayList, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final Discount[] newArray(int i) {
            return new Discount[i];
        }
    }

    public /* synthetic */ Discount(PromoType promoType, String str, Integer num, C38067d dVar, C38067d dVar2, int i, C38067d dVar3, C38067d dVar4, C38067d dVar5, DateTime dateTime, DateTime dateTime2, boolean z, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(promoType, str, num, dVar, dVar2, i, dVar3, dVar4, dVar5, dateTime, dateTime2, z, list);
    }

    /* renamed from: o */
    public static /* synthetic */ Discount m156965o(Discount discount, PromoType promoType, String str, Integer num, C38067d dVar, C38067d dVar2, int i, C38067d dVar3, C38067d dVar4, C38067d dVar5, DateTime dateTime, DateTime dateTime2, boolean z, List list, int i2, Object obj) {
        Discount discount2 = discount;
        int i3 = i2;
        return discount.mo117975n((i3 & 1) != 0 ? discount2.f95947a : promoType, (i3 & 2) != 0 ? discount2.f95948b : str, (i3 & 4) != 0 ? discount2.f95949c : num, (i3 & 8) != 0 ? discount2.f95950d : dVar, (i3 & 16) != 0 ? discount2.f95951e : dVar2, (i3 & 32) != 0 ? discount2.f95952f : i, (i3 & 64) != 0 ? discount2.f95953g : dVar3, (i3 & 128) != 0 ? discount2.f95954v : dVar4, (i3 & 256) != 0 ? discount2.f95955w : dVar5, (i3 & 512) != 0 ? discount2.f95956x : dateTime, (i3 & 1024) != 0 ? discount2.f95957y : dateTime2, (i3 & 2048) != 0 ? discount2.f95958z : z, (i3 & 4096) != 0 ? discount2.f95946X : list);
    }

    @C12579k
    /* renamed from: A */
    public final PromoType mo117953A() {
        return this.f95947a;
    }

    /* renamed from: B */
    public final boolean mo117954B() {
        return (this.f95954v == null || this.f95955w == null) ? false : true;
    }

    /* renamed from: C */
    public final boolean mo117955C() {
        C38067d dVar = this.f95950d;
        return dVar != null && dVar.mo118204h() > 0;
    }

    /* renamed from: D */
    public final boolean mo117956D() {
        return this.f95957y.getYear() != 9999;
    }

    /* renamed from: E */
    public final boolean mo117957E() {
        return this.f95954v == null && this.f95955w == null;
    }

    /* renamed from: F */
    public final boolean mo117958F() {
        return this.f95958z;
    }

    @C12579k
    /* renamed from: a */
    public final PromoType mo117959a() {
        return this.f95947a;
    }

    @C12579k
    /* renamed from: b */
    public final DateTime mo117960b() {
        return this.f95956x;
    }

    @C12579k
    /* renamed from: c */
    public final DateTime mo117961c() {
        return this.f95957y;
    }

    /* renamed from: d */
    public final boolean mo117962d() {
        return this.f95958z;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final List<Gtin> mo117964e() {
        return this.f95946X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) obj;
        return this.f95947a == discount.f95947a && Intrinsics.areEqual((Object) this.f95948b, (Object) discount.f95948b) && Intrinsics.areEqual((Object) this.f95949c, (Object) discount.f95949c) && Intrinsics.areEqual((Object) this.f95950d, (Object) discount.f95950d) && Intrinsics.areEqual((Object) this.f95951e, (Object) discount.f95951e) && C38067d.m157177d(this.f95952f, discount.f95952f) && Intrinsics.areEqual((Object) this.f95953g, (Object) discount.f95953g) && Intrinsics.areEqual((Object) this.f95954v, (Object) discount.f95954v) && Intrinsics.areEqual((Object) this.f95955w, (Object) discount.f95955w) && Intrinsics.areEqual((Object) this.f95956x, (Object) discount.f95956x) && Intrinsics.areEqual((Object) this.f95957y, (Object) discount.f95957y) && this.f95958z == discount.f95958z && Intrinsics.areEqual((Object) this.f95946X, (Object) discount.f95946X);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117966f() {
        return this.f95948b;
    }

    @C12580l
    /* renamed from: g */
    public final Integer mo117967g() {
        return this.f95949c;
    }

    @C12580l
    /* renamed from: h */
    public final C38067d mo117968h() {
        return this.f95950d;
    }

    public int hashCode() {
        int hashCode = ((this.f95947a.hashCode() * 31) + this.f95948b.hashCode()) * 31;
        Integer num = this.f95949c;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        C38067d dVar = this.f95950d;
        int f = (hashCode2 + (dVar == null ? 0 : C38067d.m157178f(dVar.mo118204h()))) * 31;
        C38067d dVar2 = this.f95951e;
        int f2 = (((f + (dVar2 == null ? 0 : C38067d.m157178f(dVar2.mo118204h()))) * 31) + C38067d.m157178f(this.f95952f)) * 31;
        C38067d dVar3 = this.f95953g;
        int f3 = (f2 + (dVar3 == null ? 0 : C38067d.m157178f(dVar3.mo118204h()))) * 31;
        C38067d dVar4 = this.f95954v;
        int f4 = (f3 + (dVar4 == null ? 0 : C38067d.m157178f(dVar4.mo118204h()))) * 31;
        C38067d dVar5 = this.f95955w;
        int f5 = (((((f4 + (dVar5 == null ? 0 : C38067d.m157178f(dVar5.mo118204h()))) * 31) + this.f95956x.hashCode()) * 31) + this.f95957y.hashCode()) * 31;
        boolean z = this.f95958z;
        if (z) {
            z = true;
        }
        int i2 = (f5 + (z ? 1 : 0)) * 31;
        List<Gtin> list = this.f95946X;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final C38067d mo117970i() {
        return this.f95951e;
    }

    /* renamed from: j */
    public final int mo117971j() {
        return this.f95952f;
    }

    @C12580l
    /* renamed from: k */
    public final C38067d mo117972k() {
        return this.f95953g;
    }

    @C12580l
    /* renamed from: l */
    public final C38067d mo117973l() {
        return this.f95954v;
    }

    @C12580l
    /* renamed from: m */
    public final C38067d mo117974m() {
        return this.f95955w;
    }

    @C12579k
    /* renamed from: n */
    public final Discount mo117975n(@C12579k PromoType promoType, @C12579k String str, @C12580l Integer num, @C12580l C38067d dVar, @C12580l C38067d dVar2, int i, @C12580l C38067d dVar3, @C12580l C38067d dVar4, @C12580l C38067d dVar5, @C12579k DateTime dateTime, @C12579k DateTime dateTime2, boolean z, @C12580l List<Gtin> list) {
        PromoType promoType2 = promoType;
        Intrinsics.checkNotNullParameter(promoType2, "type");
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "label");
        DateTime dateTime3 = dateTime;
        Intrinsics.checkNotNullParameter(dateTime3, "startDate");
        DateTime dateTime4 = dateTime2;
        Intrinsics.checkNotNullParameter(dateTime4, "endDate");
        return new Discount(promoType2, str2, num, dVar, dVar2, i, dVar3, dVar4, dVar5, dateTime3, dateTime4, z, list, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: p */
    public final Integer mo117976p() {
        return this.f95949c;
    }

    @C12580l
    /* renamed from: q */
    public final C38067d mo117977q() {
        return this.f95955w;
    }

    @C12580l
    /* renamed from: r */
    public final C38067d mo117978r() {
        return this.f95954v;
    }

    @C12580l
    /* renamed from: s */
    public final C38067d mo117979s() {
        return this.f95950d;
    }

    /* renamed from: t */
    public final int mo117980t() {
        return this.f95952f;
    }

    @C12579k
    public String toString() {
        PromoType promoType = this.f95947a;
        String str = this.f95948b;
        Integer num = this.f95949c;
        C38067d dVar = this.f95950d;
        C38067d dVar2 = this.f95951e;
        String g = C38067d.m157179g(this.f95952f);
        C38067d dVar3 = this.f95953g;
        C38067d dVar4 = this.f95954v;
        C38067d dVar5 = this.f95955w;
        DateTime dateTime = this.f95956x;
        DateTime dateTime2 = this.f95957y;
        boolean z = this.f95958z;
        List<Gtin> list = this.f95946X;
        return "Discount(type=" + promoType + ", label=" + str + ", bundle=" + num + ", discountAmount=" + dVar + ", startingPrice=" + dVar2 + ", displayPrice=" + g + ", forcedPrice=" + dVar3 + ", bundleSalePrice=" + dVar4 + ", bundleBasePrice=" + dVar5 + ", startDate=" + dateTime + ", endDate=" + dateTime2 + ", isMixed=" + z + ", gtins=" + list + ")";
    }

    @C12579k
    /* renamed from: u */
    public final DateTime mo117982u() {
        return this.f95957y;
    }

    @C12580l
    /* renamed from: v */
    public final C38067d mo117983v() {
        return this.f95953g;
    }

    @C12580l
    /* renamed from: w */
    public final List<Gtin> mo117984w() {
        return this.f95946X;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95947a.name());
        parcel.writeString(this.f95948b);
        Integer num = this.f95949c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeValue(this.f95950d);
        parcel.writeValue(this.f95951e);
        parcel.writeValue(C38067d.m157174a(this.f95952f));
        parcel.writeValue(this.f95953g);
        parcel.writeValue(this.f95954v);
        parcel.writeValue(this.f95955w);
        parcel.writeSerializable(this.f95956x);
        parcel.writeSerializable(this.f95957y);
        parcel.writeInt(this.f95958z ? 1 : 0);
        List<Gtin> list = this.f95946X;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (Gtin i2 : list) {
            Gtin.m157314j(i2.mo118380i(), parcel, i);
        }
    }

    @C12579k
    /* renamed from: x */
    public final String mo117986x() {
        return this.f95948b;
    }

    @C12579k
    /* renamed from: y */
    public final DateTime mo117987y() {
        return this.f95956x;
    }

    @C12580l
    /* renamed from: z */
    public final C38067d mo117988z() {
        return this.f95951e;
    }

    public Discount(PromoType promoType, String str, Integer num, C38067d dVar, C38067d dVar2, int i, C38067d dVar3, C38067d dVar4, C38067d dVar5, DateTime dateTime, DateTime dateTime2, boolean z, List<Gtin> list) {
        Intrinsics.checkNotNullParameter(promoType, "type");
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(dateTime, "startDate");
        Intrinsics.checkNotNullParameter(dateTime2, "endDate");
        this.f95947a = promoType;
        this.f95948b = str;
        this.f95949c = num;
        this.f95950d = dVar;
        this.f95951e = dVar2;
        this.f95952f = i;
        this.f95953g = dVar3;
        this.f95954v = dVar4;
        this.f95955w = dVar5;
        this.f95956x = dateTime;
        this.f95957y = dateTime2;
        this.f95958z = z;
        this.f95946X = list;
    }
}
