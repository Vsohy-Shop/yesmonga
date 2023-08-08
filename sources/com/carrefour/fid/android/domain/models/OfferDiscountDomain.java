package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010 \u001a\u00020\u000f\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011HÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0004J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011HÆ\u0003Jª\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010 \u001a\u00020\u000f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0002HÖ\u0001J\u0013\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010,\u001a\u00020\u0002HÖ\u0001J\u0019\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0004R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010\nR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b:\u0010\nR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b;\u00106R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bB\u0010\u0015R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bF\u0010\u0004R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b=\u0010C\u001a\u0004\bH\u0010E¨\u0006K"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "Landroid/os/Parcelable;", "", "a", "()Ljava/lang/Integer;", "", "e", "f", "", "g", "()Ljava/lang/Double;", "h", "i", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;", "j", "", "k", "", "l", "", "b", "()Ljava/lang/Long;", "c", "Lcom/carrefour/fid/android/domain/models/OfferDiscountArticle;", "d", "bundle", "dateBegin", "dateEnd", "discountAmount", "forcedPrice", "label", "type", "hasFidCard", "gtins", "mandateId", "quantityOfTriggeredDiscount", "triggerArticles", "m", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;)Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Integer;", "o", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "q", "Ljava/lang/Double;", "r", "s", "v", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;", "z", "()Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;", "Z", "u", "()Z", "w", "Ljava/util/List;", "t", "()Ljava/util/List;", "x", "Ljava/lang/Long;", "y", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountType;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferDiscountDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OfferDiscountDomain> CREATOR = new C37917a();

    /* renamed from: X */
    public static final int f95174X = 8;
    @C12580l

    /* renamed from: a */
    public final Integer f95175a;
    @C12580l

    /* renamed from: b */
    public final String f95176b;
    @C12580l

    /* renamed from: c */
    public final String f95177c;
    @C12580l

    /* renamed from: d */
    public final Double f95178d;
    @C12580l

    /* renamed from: e */
    public final Double f95179e;
    @C12580l

    /* renamed from: f */
    public final String f95180f;
    @C12580l

    /* renamed from: g */
    public final OfferDiscountType f95181g;

    /* renamed from: v */
    public final boolean f95182v;
    @C12580l

    /* renamed from: w */
    public final List<String> f95183w;
    @C12580l

    /* renamed from: x */
    public final Long f95184x;
    @C12580l

    /* renamed from: y */
    public final Integer f95185y;
    @C12580l

    /* renamed from: z */
    public final List<OfferDiscountArticle> f95186z;

    /* renamed from: com.carrefour.fid.android.domain.models.OfferDiscountDomain$a */
    public static final class C37917a implements Parcelable.Creator<OfferDiscountDomain> {
        @C12579k
        /* renamed from: a */
        public final OfferDiscountDomain createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString3 = parcel.readString();
            OfferDiscountType valueOf4 = parcel.readInt() == 0 ? null : OfferDiscountType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(OfferDiscountArticle.CREATOR.createFromParcel(parcel2));
                }
            }
            return new OfferDiscountDomain(valueOf, readString, readString2, valueOf2, valueOf3, readString3, valueOf4, z, createStringArrayList, valueOf5, valueOf6, arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final OfferDiscountDomain[] newArray(int i) {
            return new OfferDiscountDomain[i];
        }
    }

    public OfferDiscountDomain(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l Double d, @C12580l Double d2, @C12580l String str3, @C12580l OfferDiscountType offerDiscountType, boolean z, @C12580l List<String> list, @C12580l Long l, @C12580l Integer num2, @C12580l List<OfferDiscountArticle> list2) {
        this.f95175a = num;
        this.f95176b = str;
        this.f95177c = str2;
        this.f95178d = d;
        this.f95179e = d2;
        this.f95180f = str3;
        this.f95181g = offerDiscountType;
        this.f95182v = z;
        this.f95183w = list;
        this.f95184x = l;
        this.f95185y = num2;
        this.f95186z = list2;
    }

    /* renamed from: n */
    public static /* synthetic */ OfferDiscountDomain m155475n(OfferDiscountDomain offerDiscountDomain, Integer num, String str, String str2, Double d, Double d2, String str3, OfferDiscountType offerDiscountType, boolean z, List list, Long l, Integer num2, List list2, int i, Object obj) {
        OfferDiscountDomain offerDiscountDomain2 = offerDiscountDomain;
        int i2 = i;
        return offerDiscountDomain.mo115947m((i2 & 1) != 0 ? offerDiscountDomain2.f95175a : num, (i2 & 2) != 0 ? offerDiscountDomain2.f95176b : str, (i2 & 4) != 0 ? offerDiscountDomain2.f95177c : str2, (i2 & 8) != 0 ? offerDiscountDomain2.f95178d : d, (i2 & 16) != 0 ? offerDiscountDomain2.f95179e : d2, (i2 & 32) != 0 ? offerDiscountDomain2.f95180f : str3, (i2 & 64) != 0 ? offerDiscountDomain2.f95181g : offerDiscountType, (i2 & 128) != 0 ? offerDiscountDomain2.f95182v : z, (i2 & 256) != 0 ? offerDiscountDomain2.f95183w : list, (i2 & 512) != 0 ? offerDiscountDomain2.f95184x : l, (i2 & 1024) != 0 ? offerDiscountDomain2.f95185y : num2, (i2 & 2048) != 0 ? offerDiscountDomain2.f95186z : list2);
    }

    @C12580l
    /* renamed from: a */
    public final Integer mo115932a() {
        return this.f95175a;
    }

    @C12580l
    /* renamed from: b */
    public final Long mo115933b() {
        return this.f95184x;
    }

    @C12580l
    /* renamed from: c */
    public final Integer mo115934c() {
        return this.f95185y;
    }

    @C12580l
    /* renamed from: d */
    public final List<OfferDiscountArticle> mo115935d() {
        return this.f95186z;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo115937e() {
        return this.f95176b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDiscountDomain)) {
            return false;
        }
        OfferDiscountDomain offerDiscountDomain = (OfferDiscountDomain) obj;
        return Intrinsics.areEqual((Object) this.f95175a, (Object) offerDiscountDomain.f95175a) && Intrinsics.areEqual((Object) this.f95176b, (Object) offerDiscountDomain.f95176b) && Intrinsics.areEqual((Object) this.f95177c, (Object) offerDiscountDomain.f95177c) && Intrinsics.areEqual((Object) this.f95178d, (Object) offerDiscountDomain.f95178d) && Intrinsics.areEqual((Object) this.f95179e, (Object) offerDiscountDomain.f95179e) && Intrinsics.areEqual((Object) this.f95180f, (Object) offerDiscountDomain.f95180f) && this.f95181g == offerDiscountDomain.f95181g && this.f95182v == offerDiscountDomain.f95182v && Intrinsics.areEqual((Object) this.f95183w, (Object) offerDiscountDomain.f95183w) && Intrinsics.areEqual((Object) this.f95184x, (Object) offerDiscountDomain.f95184x) && Intrinsics.areEqual((Object) this.f95185y, (Object) offerDiscountDomain.f95185y) && Intrinsics.areEqual((Object) this.f95186z, (Object) offerDiscountDomain.f95186z);
    }

    @C12580l
    /* renamed from: f */
    public final String mo115939f() {
        return this.f95177c;
    }

    @C12580l
    /* renamed from: g */
    public final Double mo115940g() {
        return this.f95178d;
    }

    @C12580l
    /* renamed from: h */
    public final Double mo115941h() {
        return this.f95179e;
    }

    public int hashCode() {
        Integer num = this.f95175a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f95176b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95177c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f95178d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f95179e;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.f95180f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OfferDiscountType offerDiscountType = this.f95181g;
        int hashCode7 = (hashCode6 + (offerDiscountType == null ? 0 : offerDiscountType.hashCode())) * 31;
        boolean z = this.f95182v;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        List<String> list = this.f95183w;
        int hashCode8 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.f95184x;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.f95185y;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<OfferDiscountArticle> list2 = this.f95186z;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode10 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo115943i() {
        return this.f95180f;
    }

    @C12580l
    /* renamed from: j */
    public final OfferDiscountType mo115944j() {
        return this.f95181g;
    }

    /* renamed from: k */
    public final boolean mo115945k() {
        return this.f95182v;
    }

    @C12580l
    /* renamed from: l */
    public final List<String> mo115946l() {
        return this.f95183w;
    }

    @C12579k
    /* renamed from: m */
    public final OfferDiscountDomain mo115947m(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l Double d, @C12580l Double d2, @C12580l String str3, @C12580l OfferDiscountType offerDiscountType, boolean z, @C12580l List<String> list, @C12580l Long l, @C12580l Integer num2, @C12580l List<OfferDiscountArticle> list2) {
        return new OfferDiscountDomain(num, str, str2, d, d2, str3, offerDiscountType, z, list, l, num2, list2);
    }

    @C12580l
    /* renamed from: o */
    public final Integer mo115948o() {
        return this.f95175a;
    }

    @C12580l
    /* renamed from: p */
    public final String mo115949p() {
        return this.f95176b;
    }

    @C12580l
    /* renamed from: q */
    public final String mo115950q() {
        return this.f95177c;
    }

    @C12580l
    /* renamed from: r */
    public final Double mo115951r() {
        return this.f95178d;
    }

    @C12580l
    /* renamed from: s */
    public final Double mo115952s() {
        return this.f95179e;
    }

    @C12580l
    /* renamed from: t */
    public final List<String> mo115953t() {
        return this.f95183w;
    }

    @C12579k
    public String toString() {
        Integer num = this.f95175a;
        String str = this.f95176b;
        String str2 = this.f95177c;
        Double d = this.f95178d;
        Double d2 = this.f95179e;
        String str3 = this.f95180f;
        OfferDiscountType offerDiscountType = this.f95181g;
        boolean z = this.f95182v;
        List<String> list = this.f95183w;
        Long l = this.f95184x;
        Integer num2 = this.f95185y;
        List<OfferDiscountArticle> list2 = this.f95186z;
        return "OfferDiscountDomain(bundle=" + num + ", dateBegin=" + str + ", dateEnd=" + str2 + ", discountAmount=" + d + ", forcedPrice=" + d2 + ", label=" + str3 + ", type=" + offerDiscountType + ", hasFidCard=" + z + ", gtins=" + list + ", mandateId=" + l + ", quantityOfTriggeredDiscount=" + num2 + ", triggerArticles=" + list2 + ")";
    }

    /* renamed from: u */
    public final boolean mo115955u() {
        return this.f95182v;
    }

    @C12580l
    /* renamed from: v */
    public final String mo115956v() {
        return this.f95180f;
    }

    @C12580l
    /* renamed from: w */
    public final Long mo115957w() {
        return this.f95184x;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Integer num = this.f95175a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f95176b);
        parcel.writeString(this.f95177c);
        Double d = this.f95178d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95179e;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.f95180f);
        OfferDiscountType offerDiscountType = this.f95181g;
        if (offerDiscountType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(offerDiscountType.name());
        }
        parcel.writeInt(this.f95182v ? 1 : 0);
        parcel.writeStringList(this.f95183w);
        Long l = this.f95184x;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.f95185y;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<OfferDiscountArticle> list = this.f95186z;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (OfferDiscountArticle writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    @C12580l
    /* renamed from: x */
    public final Integer mo115959x() {
        return this.f95185y;
    }

    @C12580l
    /* renamed from: y */
    public final List<OfferDiscountArticle> mo115960y() {
        return this.f95186z;
    }

    @C12580l
    /* renamed from: z */
    public final OfferDiscountType mo115961z() {
        return this.f95181g;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferDiscountDomain(java.lang.Integer r16, java.lang.String r17, java.lang.String r18, java.lang.Double r19, java.lang.Double r20, java.lang.String r21, com.carrefour.fid.android.domain.models.offer.OfferDiscountType r22, boolean r23, java.util.List r24, java.lang.Long r25, java.lang.Integer r26, java.util.List r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r10 = r1
            goto L_0x000b
        L_0x0009:
            r10 = r23
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r11 = r2
            goto L_0x0014
        L_0x0012:
            r11 = r24
        L_0x0014:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x001a
            r12 = r2
            goto L_0x001c
        L_0x001a:
            r12 = r25
        L_0x001c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0022
            r13 = r2
            goto L_0x0024
        L_0x0022:
            r13 = r26
        L_0x0024:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x002a
            r14 = r2
            goto L_0x002c
        L_0x002a:
            r14 = r27
        L_0x002c:
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.OfferDiscountDomain.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, com.carrefour.fid.android.domain.models.offer.OfferDiscountType, boolean, java.util.List, java.lang.Long, java.lang.Integer, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
