package com.carrefour.fid.android.service.presentation.model;

import androidx.autofill.C0861a;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.C33763b;
import com.urbanairship.util.C9650g;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003Js\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004HÆ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b1\u0010+R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b5\u0010+R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b7\u0010+R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b8\u0010+¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "Lcom/google/maps/android/clustering/b;", "Lcom/google/android/gms/maps/model/LatLng;", "getPosition", "", "getTitle", "getSnippet", "", "getZIndex", "()Ljava/lang/Float;", "component1", "", "component2", "component3", "component4", "component5", "", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "component6", "component7", "component8", "component9", "component10", "name", "latitude", "longitude", "storeId", "format", "serviceTypes", "address1", "address2", "postalCode", "city", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "D", "getLatitude", "()D", "getLongitude", "getStoreId", "getFormat", "Ljava/util/Set;", "getServiceTypes", "()Ljava/util/Set;", "getAddress1", "getAddress2", "getPostalCode", "getCity", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class DrivePoint implements C33763b {
    @C12579k
    private final String address1;
    @C12579k
    private final String address2;
    @C12579k
    private final String city;
    @C12579k
    private final String format;
    private final double latitude;
    private final double longitude;
    @C12579k
    private final String name;
    @C12579k
    private final String postalCode;
    @C12579k
    private final Set<DriveType> serviceTypes;
    @C12579k
    private final String storeId;

    public DrivePoint(@C12579k String str, double d, double d2, @C12579k String str2, @C12579k String str3, @C12579k Set<? extends DriveType> set, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "storeId");
        Intrinsics.checkNotNullParameter(str3, "format");
        Intrinsics.checkNotNullParameter(set, "serviceTypes");
        Intrinsics.checkNotNullParameter(str4, "address1");
        Intrinsics.checkNotNullParameter(str5, "address2");
        Intrinsics.checkNotNullParameter(str6, C0861a.f2707g);
        Intrinsics.checkNotNullParameter(str7, C9650g.f26444g);
        this.name = str;
        this.latitude = d;
        this.longitude = d2;
        this.storeId = str2;
        this.format = str3;
        this.serviceTypes = set;
        this.address1 = str4;
        this.address2 = str5;
        this.postalCode = str6;
        this.city = str7;
    }

    public static /* synthetic */ DrivePoint copy$default(DrivePoint drivePoint, String str, double d, double d2, String str2, String str3, Set set, String str4, String str5, String str6, String str7, int i, Object obj) {
        DrivePoint drivePoint2 = drivePoint;
        int i2 = i;
        return drivePoint.copy((i2 & 1) != 0 ? drivePoint2.name : str, (i2 & 2) != 0 ? drivePoint2.latitude : d, (i2 & 4) != 0 ? drivePoint2.longitude : d2, (i2 & 8) != 0 ? drivePoint2.storeId : str2, (i2 & 16) != 0 ? drivePoint2.format : str3, (i2 & 32) != 0 ? drivePoint2.serviceTypes : set, (i2 & 64) != 0 ? drivePoint2.address1 : str4, (i2 & 128) != 0 ? drivePoint2.address2 : str5, (i2 & 256) != 0 ? drivePoint2.postalCode : str6, (i2 & 512) != 0 ? drivePoint2.city : str7);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component10() {
        return this.city;
    }

    public final double component2() {
        return this.latitude;
    }

    public final double component3() {
        return this.longitude;
    }

    @C12579k
    public final String component4() {
        return this.storeId;
    }

    @C12579k
    public final String component5() {
        return this.format;
    }

    @C12579k
    public final Set<DriveType> component6() {
        return this.serviceTypes;
    }

    @C12579k
    public final String component7() {
        return this.address1;
    }

    @C12579k
    public final String component8() {
        return this.address2;
    }

    @C12579k
    public final String component9() {
        return this.postalCode;
    }

    @C12579k
    public final DrivePoint copy(@C12579k String str, double d, double d2, @C12579k String str2, @C12579k String str3, @C12579k Set<? extends DriveType> set, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "name");
        String str8 = str2;
        Intrinsics.checkNotNullParameter(str8, "storeId");
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "format");
        Set<? extends DriveType> set2 = set;
        Intrinsics.checkNotNullParameter(set2, "serviceTypes");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "address1");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "address2");
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str12, C0861a.f2707g);
        String str13 = str7;
        Intrinsics.checkNotNullParameter(str13, C9650g.f26444g);
        return new DrivePoint(str, d, d2, str8, str9, set2, str10, str11, str12, str13);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivePoint)) {
            return false;
        }
        DrivePoint drivePoint = (DrivePoint) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) drivePoint.name) && Double.compare(this.latitude, drivePoint.latitude) == 0 && Double.compare(this.longitude, drivePoint.longitude) == 0 && Intrinsics.areEqual((Object) this.storeId, (Object) drivePoint.storeId) && Intrinsics.areEqual((Object) this.format, (Object) drivePoint.format) && Intrinsics.areEqual((Object) this.serviceTypes, (Object) drivePoint.serviceTypes) && Intrinsics.areEqual((Object) this.address1, (Object) drivePoint.address1) && Intrinsics.areEqual((Object) this.address2, (Object) drivePoint.address2) && Intrinsics.areEqual((Object) this.postalCode, (Object) drivePoint.postalCode) && Intrinsics.areEqual((Object) this.city, (Object) drivePoint.city);
    }

    @C12579k
    public final String getAddress1() {
        return this.address1;
    }

    @C12579k
    public final String getAddress2() {
        return this.address2;
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12579k
    public final String getFormat() {
        return this.format;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public LatLng getPosition() {
        return new LatLng(this.latitude, this.longitude);
    }

    @C12579k
    public final String getPostalCode() {
        return this.postalCode;
    }

    @C12579k
    public final Set<DriveType> getServiceTypes() {
        return this.serviceTypes;
    }

    @C12580l
    public String getSnippet() {
        return null;
    }

    @C12579k
    public final String getStoreId() {
        return this.storeId;
    }

    @C12579k
    public String getTitle() {
        return this.name;
    }

    @C12579k
    public Float getZIndex() {
        return Float.valueOf(0.0f);
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + this.storeId.hashCode()) * 31) + this.format.hashCode()) * 31) + this.serviceTypes.hashCode()) * 31) + this.address1.hashCode()) * 31) + this.address2.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.city.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.name;
        double d = this.latitude;
        double d2 = this.longitude;
        String str2 = this.storeId;
        String str3 = this.format;
        Set<DriveType> set = this.serviceTypes;
        String str4 = this.address1;
        String str5 = this.address2;
        String str6 = this.postalCode;
        String str7 = this.city;
        return "DrivePoint(name=" + str + ", latitude=" + d + ", longitude=" + d2 + ", storeId=" + str2 + ", format=" + str3 + ", serviceTypes=" + set + ", address1=" + str4 + ", address2=" + str5 + ", postalCode=" + str6 + ", city=" + str7 + ")";
    }
}
