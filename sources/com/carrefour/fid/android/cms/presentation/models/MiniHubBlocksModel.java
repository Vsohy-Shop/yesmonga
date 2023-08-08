package com.carrefour.fid.android.cms.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/presentation/models/MiniHubBlocksModel;", "Landroid/os/Parcelable;", "", "component1", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "component2", "component3", "urlImage", "linkModel", "alt", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getUrlImage", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "getLinkModel", "()Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "getAlt", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class MiniHubBlocksModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<MiniHubBlocksModel> CREATOR = new C40031a();
    @C12580l
    private final String alt;
    @C12580l
    private final LinkModel linkModel;
    @C12580l
    private final String urlImage;

    /* renamed from: com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel$a */
    public static final class C40031a implements Parcelable.Creator<MiniHubBlocksModel> {
        @C12579k
        /* renamed from: a */
        public final MiniHubBlocksModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MiniHubBlocksModel(parcel.readString(), (LinkModel) parcel.readParcelable(MiniHubBlocksModel.class.getClassLoader()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final MiniHubBlocksModel[] newArray(int i) {
            return new MiniHubBlocksModel[i];
        }
    }

    public MiniHubBlocksModel(@C12580l String str, @C12580l LinkModel linkModel2, @C12580l String str2) {
        this.urlImage = str;
        this.linkModel = linkModel2;
        this.alt = str2;
    }

    public static /* synthetic */ MiniHubBlocksModel copy$default(MiniHubBlocksModel miniHubBlocksModel, String str, LinkModel linkModel2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = miniHubBlocksModel.urlImage;
        }
        if ((i & 2) != 0) {
            linkModel2 = miniHubBlocksModel.linkModel;
        }
        if ((i & 4) != 0) {
            str2 = miniHubBlocksModel.alt;
        }
        return miniHubBlocksModel.copy(str, linkModel2, str2);
    }

    @C12580l
    public final String component1() {
        return this.urlImage;
    }

    @C12580l
    public final LinkModel component2() {
        return this.linkModel;
    }

    @C12580l
    public final String component3() {
        return this.alt;
    }

    @C12579k
    public final MiniHubBlocksModel copy(@C12580l String str, @C12580l LinkModel linkModel2, @C12580l String str2) {
        return new MiniHubBlocksModel(str, linkModel2, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniHubBlocksModel)) {
            return false;
        }
        MiniHubBlocksModel miniHubBlocksModel = (MiniHubBlocksModel) obj;
        return Intrinsics.areEqual((Object) this.urlImage, (Object) miniHubBlocksModel.urlImage) && Intrinsics.areEqual((Object) this.linkModel, (Object) miniHubBlocksModel.linkModel) && Intrinsics.areEqual((Object) this.alt, (Object) miniHubBlocksModel.alt);
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
    public final String getUrlImage() {
        return this.urlImage;
    }

    public int hashCode() {
        String str = this.urlImage;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LinkModel linkModel2 = this.linkModel;
        int hashCode2 = (hashCode + (linkModel2 == null ? 0 : linkModel2.hashCode())) * 31;
        String str2 = this.alt;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.urlImage;
        LinkModel linkModel2 = this.linkModel;
        String str2 = this.alt;
        return "MiniHubBlocksModel(urlImage=" + str + ", linkModel=" + linkModel2 + ", alt=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.urlImage);
        parcel.writeParcelable(this.linkModel, i);
        parcel.writeString(this.alt);
    }
}
