package com.carrefour.fid.android.domain.interactors.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.product.search.C38116a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface SearchProductSuggestions extends C37679f<SearchParams, C38116a> {

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/interactors/product/SearchProductSuggestions$SearchParams;", "Landroid/os/Parcelable;", "", "a", "b", "c", "text", "storeService", "store", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "g", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class SearchParams implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<SearchParams> CREATOR = new C37747a();
        @C12579k

        /* renamed from: a */
        public final String f94748a;
        @C12579k

        /* renamed from: b */
        public final String f94749b;
        @C12579k

        /* renamed from: c */
        public final String f94750c;

        /* renamed from: com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions$SearchParams$a */
        public static final class C37747a implements Parcelable.Creator<SearchParams> {
            @C12579k
            /* renamed from: a */
            public final SearchParams createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SearchParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final SearchParams[] newArray(int i) {
                return new SearchParams[i];
            }
        }

        public SearchParams(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "text");
            Intrinsics.checkNotNullParameter(str2, "storeService");
            Intrinsics.checkNotNullParameter(str3, "store");
            this.f94748a = str;
            this.f94749b = str2;
            this.f94750c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ SearchParams m154745e(SearchParams searchParams, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchParams.f94748a;
            }
            if ((i & 2) != 0) {
                str2 = searchParams.f94749b;
            }
            if ((i & 4) != 0) {
                str3 = searchParams.f94750c;
            }
            return searchParams.mo114984d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114981a() {
            return this.f94748a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114982b() {
            return this.f94749b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo114983c() {
            return this.f94750c;
        }

        @C12579k
        /* renamed from: d */
        public final SearchParams mo114984d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "text");
            Intrinsics.checkNotNullParameter(str2, "storeService");
            Intrinsics.checkNotNullParameter(str3, "store");
            return new SearchParams(str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchParams)) {
                return false;
            }
            SearchParams searchParams = (SearchParams) obj;
            return Intrinsics.areEqual((Object) this.f94748a, (Object) searchParams.f94748a) && Intrinsics.areEqual((Object) this.f94749b, (Object) searchParams.f94749b) && Intrinsics.areEqual((Object) this.f94750c, (Object) searchParams.f94750c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114987f() {
            return this.f94750c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo114988g() {
            return this.f94749b;
        }

        @C12579k
        /* renamed from: h */
        public final String mo114989h() {
            return this.f94748a;
        }

        public int hashCode() {
            return (((this.f94748a.hashCode() * 31) + this.f94749b.hashCode()) * 31) + this.f94750c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94748a;
            String str2 = this.f94749b;
            String str3 = this.f94750c;
            return "SearchParams(text=" + str + ", storeService=" + str2 + ", store=" + str3 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f94748a);
            parcel.writeString(this.f94749b);
            parcel.writeString(this.f94750c);
        }
    }
}
