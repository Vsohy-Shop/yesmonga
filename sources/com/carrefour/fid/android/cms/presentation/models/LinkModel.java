package com.carrefour.fid.android.cms.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "Landroid/os/Parcelable;", "()V", "ExternalLinkModel", "InternalLinkModel", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$ExternalLinkModel;", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$InternalLinkModel;", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public abstract class LinkModel implements Parcelable {

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$ExternalLinkModel;", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "", "a", "b", "c", "title", "uri", "contentId", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "h", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class ExternalLinkModel extends LinkModel {
        @C12579k
        public static final Parcelable.Creator<ExternalLinkModel> CREATOR = new C40029a();
        @C12579k

        /* renamed from: a */
        public final String f102047a;
        @C12580l

        /* renamed from: b */
        public final String f102048b;
        @C12580l

        /* renamed from: c */
        public final String f102049c;

        /* renamed from: com.carrefour.fid.android.cms.presentation.models.LinkModel$ExternalLinkModel$a */
        public static final class C40029a implements Parcelable.Creator<ExternalLinkModel> {
            @C12579k
            /* renamed from: a */
            public final ExternalLinkModel createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalLinkModel(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final ExternalLinkModel[] newArray(int i) {
                return new ExternalLinkModel[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ExternalLinkModel(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "title");
            this.f102047a = str;
            this.f102048b = str2;
            this.f102049c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ ExternalLinkModel m163013e(ExternalLinkModel externalLinkModel, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = externalLinkModel.f102047a;
            }
            if ((i & 2) != 0) {
                str2 = externalLinkModel.f102048b;
            }
            if ((i & 4) != 0) {
                str3 = externalLinkModel.f102049c;
            }
            return externalLinkModel.mo132454d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo132451a() {
            return this.f102047a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo132452b() {
            return this.f102048b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo132453c() {
            return this.f102049c;
        }

        @C12579k
        /* renamed from: d */
        public final ExternalLinkModel mo132454d(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "title");
            return new ExternalLinkModel(str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExternalLinkModel)) {
                return false;
            }
            ExternalLinkModel externalLinkModel = (ExternalLinkModel) obj;
            return Intrinsics.areEqual((Object) this.f102047a, (Object) externalLinkModel.f102047a) && Intrinsics.areEqual((Object) this.f102048b, (Object) externalLinkModel.f102048b) && Intrinsics.areEqual((Object) this.f102049c, (Object) externalLinkModel.f102049c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo132457f() {
            return this.f102049c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo132458g() {
            return this.f102047a;
        }

        @C12580l
        /* renamed from: h */
        public final String mo132459h() {
            return this.f102048b;
        }

        public int hashCode() {
            int hashCode = this.f102047a.hashCode() * 31;
            String str = this.f102048b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f102049c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f102047a;
            String str2 = this.f102048b;
            String str3 = this.f102049c;
            return "ExternalLinkModel(title=" + str + ", uri=" + str2 + ", contentId=" + str3 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f102047a);
            parcel.writeString(this.f102048b);
            parcel.writeString(this.f102049c);
        }
    }

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/presentation/models/LinkModel$InternalLinkModel;", "Lcom/carrefour/fid/android/cms/presentation/models/LinkModel;", "", "a", "b", "c", "title", "deepLink", "contentId", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "g", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class InternalLinkModel extends LinkModel {
        @C12579k
        public static final Parcelable.Creator<InternalLinkModel> CREATOR = new C40030a();
        @C12579k

        /* renamed from: a */
        public final String f102050a;
        @C12580l

        /* renamed from: b */
        public final String f102051b;
        @C12580l

        /* renamed from: c */
        public final String f102052c;

        /* renamed from: com.carrefour.fid.android.cms.presentation.models.LinkModel$InternalLinkModel$a */
        public static final class C40030a implements Parcelable.Creator<InternalLinkModel> {
            @C12579k
            /* renamed from: a */
            public final InternalLinkModel createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternalLinkModel(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final InternalLinkModel[] newArray(int i) {
                return new InternalLinkModel[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InternalLinkModel(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "title");
            this.f102050a = str;
            this.f102051b = str2;
            this.f102052c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ InternalLinkModel m163023e(InternalLinkModel internalLinkModel, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internalLinkModel.f102050a;
            }
            if ((i & 2) != 0) {
                str2 = internalLinkModel.f102051b;
            }
            if ((i & 4) != 0) {
                str3 = internalLinkModel.f102052c;
            }
            return internalLinkModel.mo132470d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo132467a() {
            return this.f102050a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo132468b() {
            return this.f102051b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo132469c() {
            return this.f102052c;
        }

        @C12579k
        /* renamed from: d */
        public final InternalLinkModel mo132470d(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "title");
            return new InternalLinkModel(str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalLinkModel)) {
                return false;
            }
            InternalLinkModel internalLinkModel = (InternalLinkModel) obj;
            return Intrinsics.areEqual((Object) this.f102050a, (Object) internalLinkModel.f102050a) && Intrinsics.areEqual((Object) this.f102051b, (Object) internalLinkModel.f102051b) && Intrinsics.areEqual((Object) this.f102052c, (Object) internalLinkModel.f102052c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo132473f() {
            return this.f102052c;
        }

        @C12580l
        /* renamed from: g */
        public final String mo132474g() {
            return this.f102051b;
        }

        @C12579k
        /* renamed from: h */
        public final String mo132475h() {
            return this.f102050a;
        }

        public int hashCode() {
            int hashCode = this.f102050a.hashCode() * 31;
            String str = this.f102051b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f102052c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f102050a;
            String str2 = this.f102051b;
            String str3 = this.f102052c;
            return "InternalLinkModel(title=" + str + ", deepLink=" + str2 + ", contentId=" + str3 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f102050a);
            parcel.writeString(this.f102051b);
            parcel.writeString(this.f102052c);
        }
    }

    public /* synthetic */ LinkModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public LinkModel() {
    }
}
