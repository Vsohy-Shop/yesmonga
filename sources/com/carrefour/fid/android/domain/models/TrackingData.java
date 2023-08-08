package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/TrackingData;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "orderService", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "airshipData", "c", "e", "pageVariablesData", "appsFlyerData", "orderCount", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class TrackingData implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<TrackingData> CREATOR = new C37938a();

    /* renamed from: f */
    public static final int f95381f = 8;
    @C12580l

    /* renamed from: a */
    public final String f95382a;
    @C12580l

    /* renamed from: b */
    public final Map<String, String> f95383b;
    @C12580l

    /* renamed from: c */
    public final Map<String, String> f95384c;
    @C12580l

    /* renamed from: d */
    public final Map<String, String> f95385d;
    @C12580l

    /* renamed from: e */
    public final String f95386e;

    /* renamed from: com.carrefour.fid.android.domain.models.TrackingData$a */
    public static final class C37938a implements Parcelable.Creator<TrackingData> {
        @C12579k
        /* renamed from: a */
        public final TrackingData createFromParcel(@C12579k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            LinkedHashMap linkedHashMap3 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                }
            }
            return new TrackingData(readString, linkedHashMap, linkedHashMap2, linkedHashMap3, parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final TrackingData[] newArray(int i) {
            return new TrackingData[i];
        }
    }

    public TrackingData(@C12580l String str, @C12580l Map<String, String> map, @C12580l Map<String, String> map2, @C12580l Map<String, String> map3, @C12580l String str2) {
        this.f95382a = str;
        this.f95383b = map;
        this.f95384c = map2;
        this.f95385d = map3;
        this.f95386e = str2;
    }

    @C12580l
    /* renamed from: a */
    public final Map<String, String> mo116605a() {
        return this.f95383b;
    }

    @C12580l
    /* renamed from: b */
    public final Map<String, String> mo116606b() {
        return this.f95385d;
    }

    @C12580l
    /* renamed from: c */
    public final String mo116607c() {
        return this.f95386e;
    }

    @C12580l
    /* renamed from: d */
    public final String mo116608d() {
        return this.f95382a;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Map<String, String> mo116610e() {
        return this.f95384c;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95382a);
        Map<String, String> map = this.f95383b;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }
        Map<String, String> map2 = this.f95384c;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry next2 : map2.entrySet()) {
                parcel.writeString((String) next2.getKey());
                parcel.writeString((String) next2.getValue());
            }
        }
        Map<String, String> map3 = this.f95385d;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map3.size());
            for (Map.Entry next3 : map3.entrySet()) {
                parcel.writeString((String) next3.getKey());
                parcel.writeString((String) next3.getValue());
            }
        }
        parcel.writeString(this.f95386e);
    }
}
