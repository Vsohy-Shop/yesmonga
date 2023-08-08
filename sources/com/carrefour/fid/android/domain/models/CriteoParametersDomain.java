package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.criteo.CriteoEventType;
import com.carrefour.fid.android.domain.models.criteo.CriteoPageType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B­\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bG\u0010HJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bHÆ\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jº\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\u000fHÖ\u0001J\u0013\u0010*\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001J\u0019\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010<R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010<R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b?\u0010<R\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<R\u0019\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u0010B\u001a\u0004\bC\u0010\u0012R\u0019\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\b@\u0010\u0012R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bA\u0010D\u001a\u0004\bE\u0010\u0016R\u0019\u0010#\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bF\u00109¨\u0006I"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/CriteoParametersDomain;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;", "a", "Lcom/carrefour/fid/android/domain/models/criteo/CriteoEventType;", "e", "", "f", "", "g", "", "h", "", "i", "j", "", "k", "l", "()Ljava/lang/Integer;", "b", "", "c", "()Ljava/lang/Boolean;", "d", "pageType", "eventType", "keyWords", "items", "categories", "prices", "listPrices", "quantities", "listSize", "pageNumber", "availability", "transactionId", "m", "(Lcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;Lcom/carrefour/fid/android/domain/models/criteo/CriteoEventType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/models/CriteoParametersDomain;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;", "w", "()Lcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;", "Lcom/carrefour/fid/android/domain/models/criteo/CriteoEventType;", "q", "()Lcom/carrefour/fid/android/domain/models/criteo/CriteoEventType;", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "Ljava/util/List;", "r", "()Ljava/util/List;", "p", "x", "t", "v", "y", "Ljava/lang/Integer;", "u", "Ljava/lang/Boolean;", "o", "z", "<init>", "(Lcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;Lcom/carrefour/fid/android/domain/models/criteo/CriteoEventType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CriteoParametersDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CriteoParametersDomain> CREATOR = new C37908a();

    /* renamed from: X */
    public static final int f95119X = 8;
    @C12579k

    /* renamed from: a */
    public final CriteoPageType f95120a;
    @C12579k

    /* renamed from: b */
    public final CriteoEventType f95121b;
    @C12580l

    /* renamed from: c */
    public final String f95122c;
    @C12580l

    /* renamed from: d */
    public final List<String> f95123d;
    @C12580l

    /* renamed from: e */
    public final List<Long> f95124e;
    @C12580l

    /* renamed from: f */
    public final List<Double> f95125f;
    @C12580l

    /* renamed from: g */
    public final List<Double> f95126g;
    @C12580l

    /* renamed from: v */
    public final List<Integer> f95127v;
    @C12580l

    /* renamed from: w */
    public final Integer f95128w;
    @C12580l

    /* renamed from: x */
    public final Integer f95129x;
    @C12580l

    /* renamed from: y */
    public final Boolean f95130y;
    @C12580l

    /* renamed from: z */
    public final String f95131z;

    /* renamed from: com.carrefour.fid.android.domain.models.CriteoParametersDomain$a */
    public static final class C37908a implements Parcelable.Creator<CriteoParametersDomain> {
        @C12579k
        /* renamed from: a */
        public final CriteoParametersDomain createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean bool;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CriteoPageType valueOf = CriteoPageType.valueOf(parcel.readString());
            CriteoEventType valueOf2 = CriteoEventType.valueOf(parcel.readString());
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(Double.valueOf(parcel.readDouble()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(Double.valueOf(parcel.readDouble()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return new CriteoParametersDomain(valueOf, valueOf2, readString, createStringArrayList, arrayList, arrayList2, arrayList3, arrayList4, valueOf3, valueOf4, bool, parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CriteoParametersDomain[] newArray(int i) {
            return new CriteoParametersDomain[i];
        }
    }

    public CriteoParametersDomain(@C12579k CriteoPageType criteoPageType, @C12579k CriteoEventType criteoEventType, @C12580l String str, @C12580l List<String> list, @C12580l List<Long> list2, @C12580l List<Double> list3, @C12580l List<Double> list4, @C12580l List<Integer> list5, @C12580l Integer num, @C12580l Integer num2, @C12580l Boolean bool, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
        Intrinsics.checkNotNullParameter(criteoEventType, "eventType");
        this.f95120a = criteoPageType;
        this.f95121b = criteoEventType;
        this.f95122c = str;
        this.f95123d = list;
        this.f95124e = list2;
        this.f95125f = list3;
        this.f95126g = list4;
        this.f95127v = list5;
        this.f95128w = num;
        this.f95129x = num2;
        this.f95130y = bool;
        this.f95131z = str2;
    }

    /* renamed from: n */
    public static /* synthetic */ CriteoParametersDomain m155390n(CriteoParametersDomain criteoParametersDomain, CriteoPageType criteoPageType, CriteoEventType criteoEventType, String str, List list, List list2, List list3, List list4, List list5, Integer num, Integer num2, Boolean bool, String str2, int i, Object obj) {
        CriteoParametersDomain criteoParametersDomain2 = criteoParametersDomain;
        int i2 = i;
        return criteoParametersDomain.mo115754m((i2 & 1) != 0 ? criteoParametersDomain2.f95120a : criteoPageType, (i2 & 2) != 0 ? criteoParametersDomain2.f95121b : criteoEventType, (i2 & 4) != 0 ? criteoParametersDomain2.f95122c : str, (i2 & 8) != 0 ? criteoParametersDomain2.f95123d : list, (i2 & 16) != 0 ? criteoParametersDomain2.f95124e : list2, (i2 & 32) != 0 ? criteoParametersDomain2.f95125f : list3, (i2 & 64) != 0 ? criteoParametersDomain2.f95126g : list4, (i2 & 128) != 0 ? criteoParametersDomain2.f95127v : list5, (i2 & 256) != 0 ? criteoParametersDomain2.f95128w : num, (i2 & 512) != 0 ? criteoParametersDomain2.f95129x : num2, (i2 & 1024) != 0 ? criteoParametersDomain2.f95130y : bool, (i2 & 2048) != 0 ? criteoParametersDomain2.f95131z : str2);
    }

    @C12579k
    /* renamed from: a */
    public final CriteoPageType mo115739a() {
        return this.f95120a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo115740b() {
        return this.f95129x;
    }

    @C12580l
    /* renamed from: c */
    public final Boolean mo115741c() {
        return this.f95130y;
    }

    @C12580l
    /* renamed from: d */
    public final String mo115742d() {
        return this.f95131z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final CriteoEventType mo115744e() {
        return this.f95121b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteoParametersDomain)) {
            return false;
        }
        CriteoParametersDomain criteoParametersDomain = (CriteoParametersDomain) obj;
        return this.f95120a == criteoParametersDomain.f95120a && this.f95121b == criteoParametersDomain.f95121b && Intrinsics.areEqual((Object) this.f95122c, (Object) criteoParametersDomain.f95122c) && Intrinsics.areEqual((Object) this.f95123d, (Object) criteoParametersDomain.f95123d) && Intrinsics.areEqual((Object) this.f95124e, (Object) criteoParametersDomain.f95124e) && Intrinsics.areEqual((Object) this.f95125f, (Object) criteoParametersDomain.f95125f) && Intrinsics.areEqual((Object) this.f95126g, (Object) criteoParametersDomain.f95126g) && Intrinsics.areEqual((Object) this.f95127v, (Object) criteoParametersDomain.f95127v) && Intrinsics.areEqual((Object) this.f95128w, (Object) criteoParametersDomain.f95128w) && Intrinsics.areEqual((Object) this.f95129x, (Object) criteoParametersDomain.f95129x) && Intrinsics.areEqual((Object) this.f95130y, (Object) criteoParametersDomain.f95130y) && Intrinsics.areEqual((Object) this.f95131z, (Object) criteoParametersDomain.f95131z);
    }

    @C12580l
    /* renamed from: f */
    public final String mo115746f() {
        return this.f95122c;
    }

    @C12580l
    /* renamed from: g */
    public final List<String> mo115747g() {
        return this.f95123d;
    }

    @C12580l
    /* renamed from: h */
    public final List<Long> mo115748h() {
        return this.f95124e;
    }

    public int hashCode() {
        int hashCode = ((this.f95120a.hashCode() * 31) + this.f95121b.hashCode()) * 31;
        String str = this.f95122c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f95123d;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.f95124e;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.f95125f;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Double> list4 = this.f95126g;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Integer> list5 = this.f95127v;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num = this.f95128w;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f95129x;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f95130y;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f95131z;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode10 + i;
    }

    @C12580l
    /* renamed from: i */
    public final List<Double> mo115750i() {
        return this.f95125f;
    }

    @C12580l
    /* renamed from: j */
    public final List<Double> mo115751j() {
        return this.f95126g;
    }

    @C12580l
    /* renamed from: k */
    public final List<Integer> mo115752k() {
        return this.f95127v;
    }

    @C12580l
    /* renamed from: l */
    public final Integer mo115753l() {
        return this.f95128w;
    }

    @C12579k
    /* renamed from: m */
    public final CriteoParametersDomain mo115754m(@C12579k CriteoPageType criteoPageType, @C12579k CriteoEventType criteoEventType, @C12580l String str, @C12580l List<String> list, @C12580l List<Long> list2, @C12580l List<Double> list3, @C12580l List<Double> list4, @C12580l List<Integer> list5, @C12580l Integer num, @C12580l Integer num2, @C12580l Boolean bool, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
        CriteoEventType criteoEventType2 = criteoEventType;
        Intrinsics.checkNotNullParameter(criteoEventType2, "eventType");
        return new CriteoParametersDomain(criteoPageType, criteoEventType2, str, list, list2, list3, list4, list5, num, num2, bool, str2);
    }

    @C12580l
    /* renamed from: o */
    public final Boolean mo115755o() {
        return this.f95130y;
    }

    @C12580l
    /* renamed from: p */
    public final List<Long> mo115756p() {
        return this.f95124e;
    }

    @C12579k
    /* renamed from: q */
    public final CriteoEventType mo115757q() {
        return this.f95121b;
    }

    @C12580l
    /* renamed from: r */
    public final List<String> mo115758r() {
        return this.f95123d;
    }

    @C12580l
    /* renamed from: s */
    public final String mo115759s() {
        return this.f95122c;
    }

    @C12580l
    /* renamed from: t */
    public final List<Double> mo115760t() {
        return this.f95126g;
    }

    @C12579k
    public String toString() {
        CriteoPageType criteoPageType = this.f95120a;
        CriteoEventType criteoEventType = this.f95121b;
        String str = this.f95122c;
        List<String> list = this.f95123d;
        List<Long> list2 = this.f95124e;
        List<Double> list3 = this.f95125f;
        List<Double> list4 = this.f95126g;
        List<Integer> list5 = this.f95127v;
        Integer num = this.f95128w;
        Integer num2 = this.f95129x;
        Boolean bool = this.f95130y;
        String str2 = this.f95131z;
        return "CriteoParametersDomain(pageType=" + criteoPageType + ", eventType=" + criteoEventType + ", keyWords=" + str + ", items=" + list + ", categories=" + list2 + ", prices=" + list3 + ", listPrices=" + list4 + ", quantities=" + list5 + ", listSize=" + num + ", pageNumber=" + num2 + ", availability=" + bool + ", transactionId=" + str2 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final Integer mo115762u() {
        return this.f95128w;
    }

    @C12580l
    /* renamed from: v */
    public final Integer mo115763v() {
        return this.f95129x;
    }

    @C12579k
    /* renamed from: w */
    public final CriteoPageType mo115764w() {
        return this.f95120a;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95120a.name());
        parcel.writeString(this.f95121b.name());
        parcel.writeString(this.f95122c);
        parcel.writeStringList(this.f95123d);
        List<Long> list = this.f95124e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Long longValue : list) {
                parcel.writeLong(longValue.longValue());
            }
        }
        List<Double> list2 = this.f95125f;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Double doubleValue : list2) {
                parcel.writeDouble(doubleValue.doubleValue());
            }
        }
        List<Double> list3 = this.f95126g;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Double doubleValue2 : list3) {
                parcel.writeDouble(doubleValue2.doubleValue());
            }
        }
        List<Integer> list4 = this.f95127v;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (Integer intValue : list4) {
                parcel.writeInt(intValue.intValue());
            }
        }
        Integer num = this.f95128w;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f95129x;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.f95130y;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f95131z);
    }

    @C12580l
    /* renamed from: x */
    public final List<Double> mo115766x() {
        return this.f95125f;
    }

    @C12580l
    /* renamed from: y */
    public final List<Integer> mo115767y() {
        return this.f95127v;
    }

    @C12580l
    /* renamed from: z */
    public final String mo115768z() {
        return this.f95131z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CriteoParametersDomain(com.carrefour.fid.android.domain.models.criteo.CriteoPageType r16, com.carrefour.fid.android.domain.models.criteo.CriteoEventType r17, java.lang.String r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22, java.util.List r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.Boolean r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            r5 = r1
            goto L_0x000f
        L_0x000d:
            r5 = r18
        L_0x000f:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r6 = r2
            goto L_0x0018
        L_0x0016:
            r6 = r19
        L_0x0018:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0022
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r7 = r1
            goto L_0x0024
        L_0x0022:
            r7 = r20
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002e
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r8 = r1
            goto L_0x0030
        L_0x002e:
            r8 = r21
        L_0x0030:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003a
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r9 = r1
            goto L_0x003c
        L_0x003a:
            r9 = r22
        L_0x003c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0046
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r10 = r1
            goto L_0x0048
        L_0x0046:
            r10 = r23
        L_0x0048:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r24
        L_0x0050:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0056
            r12 = r2
            goto L_0x0058
        L_0x0056:
            r12 = r25
        L_0x0058:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005e
            r13 = r2
            goto L_0x0060
        L_0x005e:
            r13 = r26
        L_0x0060:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r27
        L_0x0068:
            r2 = r15
            r3 = r16
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.CriteoParametersDomain.<init>(com.carrefour.fid.android.domain.models.criteo.CriteoPageType, com.carrefour.fid.android.domain.models.criteo.CriteoEventType, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
