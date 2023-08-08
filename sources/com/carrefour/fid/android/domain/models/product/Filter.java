package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\tR\u001d\u0010\u0005\u001a\u00020\u00028&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0001\n\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Filter;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/a;", "Q3", "()Ljava/lang/String;", "field", "", "isSelected", "()Z", "CheckboxFilter", "Lcom/carrefour/fid/android/domain/models/product/Filter$CheckboxFilter;", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface Filter extends Parcelable {

    @C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u000b\u0010\u000f\u001a\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0013\u001a\u00020\tø\u0001\u0002¢\u0006\u0004\b+\u0010,J\u001e\u0010\u0005\u001a\u00070\u0003¢\u0006\u0002\b\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003JS\u0010\u0014\u001a\u00020\u00002\r\b\u0002\u0010\u000f\u001a\u00070\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0017HÖ\u0001R(\u0010\u000f\u001a\u00070\u0003¢\u0006\u0002\b\u00048\u0016X\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\u0011\u0010&R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b*\u0010&\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Filter$CheckboxFilter;", "Lcom/carrefour/fid/android/domain/models/product/Filter;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/a;", "Lkotlinx/parcelize/e;", "a", "()Ljava/lang/String;", "", "b", "", "c", "", "Lcom/carrefour/fid/android/domain/models/product/Term;", "d", "e", "field", "name", "isSelected", "terms", "isAllergoBox", "f", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)Lcom/carrefour/fid/android/domain/models/product/Filter$CheckboxFilter;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "Q3", "h", "Z", "()Z", "Ljava/util/List;", "i", "()Ljava/util/List;", "j", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class CheckboxFilter implements Filter, Parcelable {
        @C12579k
        public static final Parcelable.Creator<CheckboxFilter> CREATOR = new C38086a();
        @C12579k

        /* renamed from: a */
        public final String f96249a;
        @C12579k

        /* renamed from: b */
        public final String f96250b;

        /* renamed from: c */
        public final boolean f96251c;
        @C12579k

        /* renamed from: d */
        public final List<Term> f96252d;

        /* renamed from: e */
        public final boolean f96253e;

        /* renamed from: com.carrefour.fid.android.domain.models.product.Filter$CheckboxFilter$a */
        public static final class C38086a implements Parcelable.Creator<CheckboxFilter> {
            @C12579k
            /* renamed from: a */
            public final CheckboxFilter createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String h = ((C38102a) parcel.readValue(CheckboxFilter.class.getClassLoader())).mo118656h();
                String readString = parcel.readString();
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Term.CREATOR.createFromParcel(parcel));
                }
                return new CheckboxFilter(h, readString, z, arrayList, parcel.readInt() != 0, (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: b */
            public final CheckboxFilter[] newArray(int i) {
                return new CheckboxFilter[i];
            }
        }

        public /* synthetic */ CheckboxFilter(String str, String str2, boolean z, List list, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, list, z2);
        }

        /* renamed from: g */
        public static /* synthetic */ CheckboxFilter m157294g(CheckboxFilter checkboxFilter, String str, String str2, boolean z, List<Term> list, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkboxFilter.f96249a;
            }
            if ((i & 2) != 0) {
                str2 = checkboxFilter.f96250b;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                z = checkboxFilter.f96251c;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                list = checkboxFilter.f96252d;
            }
            List<Term> list2 = list;
            if ((i & 16) != 0) {
                z2 = checkboxFilter.f96253e;
            }
            return checkboxFilter.mo118365f(str, str3, z3, list2, z2);
        }

        @C12579k
        /* renamed from: Q3 */
        public String mo118356Q3() {
            return this.f96249a;
        }

        @C12579k
        /* renamed from: a */
        public final String mo118358a() {
            return this.f96249a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo118359b() {
            return this.f96250b;
        }

        /* renamed from: c */
        public final boolean mo118360c() {
            return this.f96251c;
        }

        @C12579k
        /* renamed from: d */
        public final List<Term> mo118361d() {
            return this.f96252d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final boolean mo118363e() {
            return this.f96253e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckboxFilter)) {
                return false;
            }
            CheckboxFilter checkboxFilter = (CheckboxFilter) obj;
            return C38102a.m157523d(this.f96249a, checkboxFilter.f96249a) && Intrinsics.areEqual((Object) this.f96250b, (Object) checkboxFilter.f96250b) && this.f96251c == checkboxFilter.f96251c && Intrinsics.areEqual((Object) this.f96252d, (Object) checkboxFilter.f96252d) && this.f96253e == checkboxFilter.f96253e;
        }

        @C12579k
        /* renamed from: f */
        public final CheckboxFilter mo118365f(@C12579k String str, @C12579k String str2, boolean z, @C12579k List<Term> list, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "field");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(list, "terms");
            return new CheckboxFilter(str, str2, z, list, z2, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: h */
        public final String mo118366h() {
            return this.f96250b;
        }

        public int hashCode() {
            int f = ((C38102a.m157524f(this.f96249a) * 31) + this.f96250b.hashCode()) * 31;
            boolean z = this.f96251c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((f + (z ? 1 : 0)) * 31) + this.f96252d.hashCode()) * 31;
            boolean z3 = this.f96253e;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final List<Term> mo118368i() {
            return this.f96252d;
        }

        public boolean isSelected() {
            return this.f96251c;
        }

        /* renamed from: j */
        public final boolean mo118369j() {
            return this.f96253e;
        }

        @C12579k
        public String toString() {
            String g = C38102a.m157525g(this.f96249a);
            String str = this.f96250b;
            boolean z = this.f96251c;
            List<Term> list = this.f96252d;
            boolean z2 = this.f96253e;
            return "CheckboxFilter(field=" + g + ", name=" + str + ", isSelected=" + z + ", terms=" + list + ", isAllergoBox=" + z2 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeValue(C38102a.m157520a(this.f96249a));
            parcel.writeString(this.f96250b);
            parcel.writeInt(this.f96251c ? 1 : 0);
            List<Term> list = this.f96252d;
            parcel.writeInt(list.size());
            for (Term writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.f96253e ? 1 : 0);
        }

        public CheckboxFilter(String str, String str2, boolean z, List<Term> list, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "field");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(list, "terms");
            this.f96249a = str;
            this.f96250b = str2;
            this.f96251c = z;
            this.f96252d = list;
            this.f96253e = z2;
        }
    }

    @C12579k
    /* renamed from: Q3 */
    String mo118356Q3();

    boolean isSelected();
}
