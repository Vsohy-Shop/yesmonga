package com.carrefour.fid.android.cms.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JE\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/presentation/models/SlideOfferCellModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "urlImage", "alt", "title", "dates", "query", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getUrlImage", "()Ljava/lang/String;", "getAlt", "getTitle", "getDates", "getQuery", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class SlideOfferCellModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlideOfferCellModel> CREATOR = new C40033a();
    @C12580l
    private final String alt;
    @C12580l
    private final String dates;
    @C12580l
    private final String query;
    @C12580l
    private final String title;
    @C12580l
    private final String urlImage;

    /* renamed from: com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel$a */
    public static final class C40033a implements Parcelable.Creator<SlideOfferCellModel> {
        @C12579k
        /* renamed from: a */
        public final SlideOfferCellModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlideOfferCellModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final SlideOfferCellModel[] newArray(int i) {
            return new SlideOfferCellModel[i];
        }
    }

    public SlideOfferCellModel(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.urlImage = str;
        this.alt = str2;
        this.title = str3;
        this.dates = str4;
        this.query = str5;
    }

    public static /* synthetic */ SlideOfferCellModel copy$default(SlideOfferCellModel slideOfferCellModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slideOfferCellModel.urlImage;
        }
        if ((i & 2) != 0) {
            str2 = slideOfferCellModel.alt;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = slideOfferCellModel.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = slideOfferCellModel.dates;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = slideOfferCellModel.query;
        }
        return slideOfferCellModel.copy(str, str6, str7, str8, str5);
    }

    @C12580l
    public final String component1() {
        return this.urlImage;
    }

    @C12580l
    public final String component2() {
        return this.alt;
    }

    @C12580l
    public final String component3() {
        return this.title;
    }

    @C12580l
    public final String component4() {
        return this.dates;
    }

    @C12580l
    public final String component5() {
        return this.query;
    }

    @C12579k
    public final SlideOfferCellModel copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new SlideOfferCellModel(str, str2, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlideOfferCellModel)) {
            return false;
        }
        SlideOfferCellModel slideOfferCellModel = (SlideOfferCellModel) obj;
        return Intrinsics.areEqual((Object) this.urlImage, (Object) slideOfferCellModel.urlImage) && Intrinsics.areEqual((Object) this.alt, (Object) slideOfferCellModel.alt) && Intrinsics.areEqual((Object) this.title, (Object) slideOfferCellModel.title) && Intrinsics.areEqual((Object) this.dates, (Object) slideOfferCellModel.dates) && Intrinsics.areEqual((Object) this.query, (Object) slideOfferCellModel.query);
    }

    @C12580l
    public final String getAlt() {
        return this.alt;
    }

    @C12580l
    public final String getDates() {
        return this.dates;
    }

    @C12580l
    public final String getQuery() {
        return this.query;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final String getUrlImage() {
        return this.urlImage;
    }

    public int hashCode() {
        String str = this.urlImage;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dates;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.query;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.urlImage;
        String str2 = this.alt;
        String str3 = this.title;
        String str4 = this.dates;
        String str5 = this.query;
        return "SlideOfferCellModel(urlImage=" + str + ", alt=" + str2 + ", title=" + str3 + ", dates=" + str4 + ", query=" + str5 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.urlImage);
        parcel.writeString(this.alt);
        parcel.writeString(this.title);
        parcel.writeString(this.dates);
        parcel.writeString(this.query);
    }
}
