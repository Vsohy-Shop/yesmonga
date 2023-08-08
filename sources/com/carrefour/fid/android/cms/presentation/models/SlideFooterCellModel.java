package com.carrefour.fid.android.cms.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b!\u0010\u001c¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/presentation/models/SlideFooterCellModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "component3", "component4", "urlImage", "title", "linkModel", "alt", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getUrlImage", "()Ljava/lang/String;", "getTitle", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "getLinkModel", "()Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "getAlt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class SlideFooterCellModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlideFooterCellModel> CREATOR = new C40032a();
    @C12580l
    private final String alt;
    @C12580l
    private final LinkModel linkModel;
    @C12580l
    private final String title;
    @C12580l
    private final String urlImage;

    /* renamed from: com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel$a */
    public static final class C40032a implements Parcelable.Creator<SlideFooterCellModel> {
        @C12579k
        /* renamed from: a */
        public final SlideFooterCellModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlideFooterCellModel(parcel.readString(), parcel.readString(), (LinkModel) parcel.readParcelable(SlideFooterCellModel.class.getClassLoader()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final SlideFooterCellModel[] newArray(int i) {
            return new SlideFooterCellModel[i];
        }
    }

    public SlideFooterCellModel(@C12580l String str, @C12580l String str2, @C12580l LinkModel linkModel2, @C12580l String str3) {
        this.urlImage = str;
        this.title = str2;
        this.linkModel = linkModel2;
        this.alt = str3;
    }

    public static /* synthetic */ SlideFooterCellModel copy$default(SlideFooterCellModel slideFooterCellModel, String str, String str2, LinkModel linkModel2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slideFooterCellModel.urlImage;
        }
        if ((i & 2) != 0) {
            str2 = slideFooterCellModel.title;
        }
        if ((i & 4) != 0) {
            linkModel2 = slideFooterCellModel.linkModel;
        }
        if ((i & 8) != 0) {
            str3 = slideFooterCellModel.alt;
        }
        return slideFooterCellModel.copy(str, str2, linkModel2, str3);
    }

    @C12580l
    public final String component1() {
        return this.urlImage;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final LinkModel component3() {
        return this.linkModel;
    }

    @C12580l
    public final String component4() {
        return this.alt;
    }

    @C12579k
    public final SlideFooterCellModel copy(@C12580l String str, @C12580l String str2, @C12580l LinkModel linkModel2, @C12580l String str3) {
        return new SlideFooterCellModel(str, str2, linkModel2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlideFooterCellModel)) {
            return false;
        }
        SlideFooterCellModel slideFooterCellModel = (SlideFooterCellModel) obj;
        return Intrinsics.areEqual((Object) this.urlImage, (Object) slideFooterCellModel.urlImage) && Intrinsics.areEqual((Object) this.title, (Object) slideFooterCellModel.title) && Intrinsics.areEqual((Object) this.linkModel, (Object) slideFooterCellModel.linkModel) && Intrinsics.areEqual((Object) this.alt, (Object) slideFooterCellModel.alt);
    }

    @C12580l
    public final String getAlt() {
        return this.alt;
    }

    @C12580l
    public final LinkModel getLinkModel() {
        return this.linkModel;
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
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkModel linkModel2 = this.linkModel;
        int hashCode3 = (hashCode2 + (linkModel2 == null ? 0 : linkModel2.hashCode())) * 31;
        String str3 = this.alt;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.urlImage;
        String str2 = this.title;
        LinkModel linkModel2 = this.linkModel;
        String str3 = this.alt;
        return "SlideFooterCellModel(urlImage=" + str + ", title=" + str2 + ", linkModel=" + linkModel2 + ", alt=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.urlImage);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.linkModel, i);
        parcel.writeString(this.alt);
    }
}
