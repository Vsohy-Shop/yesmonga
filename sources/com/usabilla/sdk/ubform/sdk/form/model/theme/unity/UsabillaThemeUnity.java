package com.usabilla.sdk.ubform.sdk.form.model.theme.unity;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UsabillaThemeUnity;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbFontsUnity;", "fontsUnity", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbFontsUnity;", "getFontsUnity", "()Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbFontsUnity;", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbImagesUnity;", "imagesUnity", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbImagesUnity;", "getImagesUnity", "()Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbImagesUnity;", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "bannerConfiguration", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "getBannerConfiguration", "()Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "<init>", "(Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbFontsUnity;Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbImagesUnity;Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class UsabillaThemeUnity implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UsabillaThemeUnity> CREATOR = new Creator();
    @C12580l
    private final BannerConfiguration bannerConfiguration;
    @C12580l
    private final UbFontsUnity fontsUnity;
    @C12580l
    private final UbImagesUnity imagesUnity;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<UsabillaThemeUnity> {
        @C12579k
        public final UsabillaThemeUnity createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BannerConfiguration bannerConfiguration = null;
            UbFontsUnity createFromParcel = parcel.readInt() == 0 ? null : UbFontsUnity.CREATOR.createFromParcel(parcel);
            UbImagesUnity createFromParcel2 = parcel.readInt() == 0 ? null : UbImagesUnity.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bannerConfiguration = BannerConfiguration.CREATOR.createFromParcel(parcel);
            }
            return new UsabillaThemeUnity(createFromParcel, createFromParcel2, bannerConfiguration);
        }

        @C12579k
        public final UsabillaThemeUnity[] newArray(int i) {
            return new UsabillaThemeUnity[i];
        }
    }

    @C11315i
    public UsabillaThemeUnity() {
        this((UbFontsUnity) null, (UbImagesUnity) null, (BannerConfiguration) null, 7, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    public final BannerConfiguration getBannerConfiguration() {
        return this.bannerConfiguration;
    }

    @C12580l
    public final UbFontsUnity getFontsUnity() {
        return this.fontsUnity;
    }

    @C12580l
    public final UbImagesUnity getImagesUnity() {
        return this.imagesUnity;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        UbFontsUnity ubFontsUnity = this.fontsUnity;
        if (ubFontsUnity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ubFontsUnity.writeToParcel(parcel, i);
        }
        UbImagesUnity ubImagesUnity = this.imagesUnity;
        if (ubImagesUnity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ubImagesUnity.writeToParcel(parcel, i);
        }
        BannerConfiguration bannerConfiguration2 = this.bannerConfiguration;
        if (bannerConfiguration2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        bannerConfiguration2.writeToParcel(parcel, i);
    }

    @C11315i
    public UsabillaThemeUnity(@C12580l UbFontsUnity ubFontsUnity) {
        this(ubFontsUnity, (UbImagesUnity) null, (BannerConfiguration) null, 6, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UsabillaThemeUnity(@C12580l UbFontsUnity ubFontsUnity, @C12580l UbImagesUnity ubImagesUnity) {
        this(ubFontsUnity, ubImagesUnity, (BannerConfiguration) null, 4, (DefaultConstructorMarker) null);
    }

    @C11315i
    public UsabillaThemeUnity(@C12580l UbFontsUnity ubFontsUnity, @C12580l UbImagesUnity ubImagesUnity, @C12580l BannerConfiguration bannerConfiguration2) {
        this.fontsUnity = ubFontsUnity;
        this.imagesUnity = ubImagesUnity;
        this.bannerConfiguration = bannerConfiguration2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UsabillaThemeUnity(UbFontsUnity ubFontsUnity, UbImagesUnity ubImagesUnity, BannerConfiguration bannerConfiguration2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ubFontsUnity, (i & 2) != 0 ? null : ubImagesUnity, (i & 4) != 0 ? null : bannerConfiguration2);
    }
}
