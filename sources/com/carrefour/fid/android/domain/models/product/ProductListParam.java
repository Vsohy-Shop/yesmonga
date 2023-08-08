package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductListParam;", "Landroid/os/Parcelable;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "facilityServiceId", "<init>", "(Ljava/lang/String;)V", "Department", "Gtins", "Promo", "Query", "Search", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Department;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Gtins;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Promo;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Query;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Search;", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public abstract class ProductListParam implements Parcelable {
    @C12579k

    /* renamed from: a */
    public final String f96285a;

    @C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b)\u0010*J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010!¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Department;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam;", "Landroid/os/Parcelable;", "", "b", "c", "", "d", "e", "f", "g", "facilityServiceId", "departmentId", "categoryPath", "searchParam", "metiRef", "storeFormat", "h", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "k", "Ljava/util/List;", "j", "()Ljava/util/List;", "m", "l", "n", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Department extends ProductListParam implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Department> CREATOR = new C38090a();
        @C12579k

        /* renamed from: b */
        public final String f96286b;
        @C12579k

        /* renamed from: c */
        public final String f96287c;
        @C12579k

        /* renamed from: d */
        public final List<String> f96288d;
        @C12579k

        /* renamed from: e */
        public final List<String> f96289e;
        @C12580l

        /* renamed from: f */
        public final String f96290f;
        @C12580l

        /* renamed from: g */
        public final String f96291g;

        /* renamed from: com.carrefour.fid.android.domain.models.product.ProductListParam$Department$a */
        public static final class C38090a implements Parcelable.Creator<Department> {
            @C12579k
            /* renamed from: a */
            public final Department createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Department(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final Department[] newArray(int i) {
                return new Department[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Department(@C12579k String str, @C12579k String str2, @C12579k List<String> list, @C12579k List<String> list2, @C12580l String str3, @C12580l String str4) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "departmentId");
            Intrinsics.checkNotNullParameter(list, "categoryPath");
            Intrinsics.checkNotNullParameter(list2, "searchParam");
            this.f96286b = str;
            this.f96287c = str2;
            this.f96288d = list;
            this.f96289e = list2;
            this.f96290f = str3;
            this.f96291g = str4;
        }

        /* renamed from: i */
        public static /* synthetic */ Department m157388i(Department department, String str, String str2, List<String> list, List<String> list2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = department.f96286b;
            }
            if ((i & 2) != 0) {
                str2 = department.f96287c;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                list = department.f96288d;
            }
            List<String> list3 = list;
            if ((i & 8) != 0) {
                list2 = department.f96289e;
            }
            List<String> list4 = list2;
            if ((i & 16) != 0) {
                str3 = department.f96290f;
            }
            String str6 = str3;
            if ((i & 32) != 0) {
                str4 = department.f96291g;
            }
            return department.mo118476h(str, str5, list3, list4, str6, str4);
        }

        @C12579k
        /* renamed from: a */
        public String mo118467a() {
            return this.f96286b;
        }

        @C12579k
        /* renamed from: b */
        public final String mo118468b() {
            return this.f96286b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo118469c() {
            return this.f96287c;
        }

        @C12579k
        /* renamed from: d */
        public final List<String> mo118470d() {
            return this.f96288d;
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final List<String> mo118472e() {
            return this.f96289e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Department)) {
                return false;
            }
            Department department = (Department) obj;
            return Intrinsics.areEqual((Object) this.f96286b, (Object) department.f96286b) && Intrinsics.areEqual((Object) this.f96287c, (Object) department.f96287c) && Intrinsics.areEqual((Object) this.f96288d, (Object) department.f96288d) && Intrinsics.areEqual((Object) this.f96289e, (Object) department.f96289e) && Intrinsics.areEqual((Object) this.f96290f, (Object) department.f96290f) && Intrinsics.areEqual((Object) this.f96291g, (Object) department.f96291g);
        }

        @C12580l
        /* renamed from: f */
        public final String mo118474f() {
            return this.f96290f;
        }

        @C12580l
        /* renamed from: g */
        public final String mo118475g() {
            return this.f96291g;
        }

        @C12579k
        /* renamed from: h */
        public final Department mo118476h(@C12579k String str, @C12579k String str2, @C12579k List<String> list, @C12579k List<String> list2, @C12580l String str3, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "departmentId");
            Intrinsics.checkNotNullParameter(list, "categoryPath");
            Intrinsics.checkNotNullParameter(list2, "searchParam");
            return new Department(str, str2, list, list2, str3, str4);
        }

        public int hashCode() {
            int hashCode = ((((((this.f96286b.hashCode() * 31) + this.f96287c.hashCode()) * 31) + this.f96288d.hashCode()) * 31) + this.f96289e.hashCode()) * 31;
            String str = this.f96290f;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f96291g;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: j */
        public final List<String> mo118478j() {
            return this.f96288d;
        }

        @C12579k
        /* renamed from: k */
        public final String mo118479k() {
            return this.f96287c;
        }

        @C12580l
        /* renamed from: l */
        public final String mo118480l() {
            return this.f96290f;
        }

        @C12579k
        /* renamed from: m */
        public final List<String> mo118481m() {
            return this.f96289e;
        }

        @C12580l
        /* renamed from: n */
        public final String mo118482n() {
            return this.f96291g;
        }

        @C12579k
        public String toString() {
            String str = this.f96286b;
            String str2 = this.f96287c;
            List<String> list = this.f96288d;
            List<String> list2 = this.f96289e;
            String str3 = this.f96290f;
            String str4 = this.f96291g;
            return "Department(facilityServiceId=" + str + ", departmentId=" + str2 + ", categoryPath=" + list + ", searchParam=" + list2 + ", metiRef=" + str3 + ", storeFormat=" + str4 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f96286b);
            parcel.writeString(this.f96287c);
            parcel.writeStringList(this.f96288d);
            parcel.writeStringList(this.f96289e);
            parcel.writeString(this.f96290f);
            parcel.writeString(this.f96291g);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u00012\u00020\u0002B*\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003ø\u0001\u0000J\t\u0010\t\u001a\u00020\bHÆ\u0003J0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001ø\u0001\u0000J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Gtins;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam;", "Landroid/os/Parcelable;", "", "b", "", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "c", "", "d", "facilityServiceId", "gtins", "isHomeDelivery", "e", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "g", "()Ljava/util/List;", "Z", "h", "()Z", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Gtins extends ProductListParam implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Gtins> CREATOR = new C38091a();
        @C12579k

        /* renamed from: b */
        public final String f96292b;
        @C12579k

        /* renamed from: c */
        public final List<Gtin> f96293c;

        /* renamed from: d */
        public final boolean f96294d;

        /* renamed from: com.carrefour.fid.android.domain.models.product.ProductListParam$Gtins$a */
        public static final class C38091a implements Parcelable.Creator<Gtins> {
            @C12579k
            /* renamed from: a */
            public final Gtins createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                boolean z = false;
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Gtin.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new Gtins(readString, arrayList, z);
            }

            @C12579k
            /* renamed from: b */
            public final Gtins[] newArray(int i) {
                return new Gtins[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Gtins(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i & 4) != 0 ? false : z);
        }

        /* renamed from: f */
        public static /* synthetic */ Gtins m157404f(Gtins gtins, String str, List<Gtin> list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gtins.f96292b;
            }
            if ((i & 2) != 0) {
                list = gtins.f96293c;
            }
            if ((i & 4) != 0) {
                z = gtins.f96294d;
            }
            return gtins.mo118493e(str, list, z);
        }

        @C12579k
        /* renamed from: a */
        public String mo118467a() {
            return this.f96292b;
        }

        @C12579k
        /* renamed from: b */
        public final String mo118489b() {
            return this.f96292b;
        }

        @C12579k
        /* renamed from: c */
        public final List<Gtin> mo118490c() {
            return this.f96293c;
        }

        /* renamed from: d */
        public final boolean mo118491d() {
            return this.f96294d;
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final Gtins mo118493e(@C12579k String str, @C12579k List<Gtin> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(list, "gtins");
            return new Gtins(str, list, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gtins)) {
                return false;
            }
            Gtins gtins = (Gtins) obj;
            return Intrinsics.areEqual((Object) this.f96292b, (Object) gtins.f96292b) && Intrinsics.areEqual((Object) this.f96293c, (Object) gtins.f96293c) && this.f96294d == gtins.f96294d;
        }

        @C12579k
        /* renamed from: g */
        public final List<Gtin> mo118495g() {
            return this.f96293c;
        }

        /* renamed from: h */
        public final boolean mo118496h() {
            return this.f96294d;
        }

        public int hashCode() {
            int hashCode = ((this.f96292b.hashCode() * 31) + this.f96293c.hashCode()) * 31;
            boolean z = this.f96294d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            String str = this.f96292b;
            List<Gtin> list = this.f96293c;
            boolean z = this.f96294d;
            return "Gtins(facilityServiceId=" + str + ", gtins=" + list + ", isHomeDelivery=" + z + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f96292b);
            List<Gtin> list = this.f96293c;
            parcel.writeInt(list.size());
            for (Gtin i2 : list) {
                Gtin.m157314j(i2.mo118380i(), parcel, i);
            }
            parcel.writeInt(this.f96294d ? 1 : 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Gtins(@C12579k String str, @C12579k List<Gtin> list, boolean z) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(list, "gtins");
            this.f96292b = str;
            this.f96293c = list;
            this.f96294d = z;
        }
    }

    @C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Promo;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam;", "Landroid/os/Parcelable;", "", "b", "c", "d", "facilityServiceId", "metiRef", "storeFormat", "e", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "g", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Promo extends ProductListParam implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Promo> CREATOR = new C38092a();
        @C12579k

        /* renamed from: b */
        public final String f96295b;
        @C12580l

        /* renamed from: c */
        public final String f96296c;
        @C12580l

        /* renamed from: d */
        public final String f96297d;

        /* renamed from: com.carrefour.fid.android.domain.models.product.ProductListParam$Promo$a */
        public static final class C38092a implements Parcelable.Creator<Promo> {
            @C12579k
            /* renamed from: a */
            public final Promo createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Promo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final Promo[] newArray(int i) {
                return new Promo[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Promo(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            this.f96295b = str;
            this.f96296c = str2;
            this.f96297d = str3;
        }

        /* renamed from: f */
        public static /* synthetic */ Promo m157414f(Promo promo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promo.f96295b;
            }
            if ((i & 2) != 0) {
                str2 = promo.f96296c;
            }
            if ((i & 4) != 0) {
                str3 = promo.f96297d;
            }
            return promo.mo118508e(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public String mo118467a() {
            return this.f96295b;
        }

        @C12579k
        /* renamed from: b */
        public final String mo118504b() {
            return this.f96295b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo118505c() {
            return this.f96296c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo118506d() {
            return this.f96297d;
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final Promo mo118508e(@C12579k String str, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            return new Promo(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Promo)) {
                return false;
            }
            Promo promo = (Promo) obj;
            return Intrinsics.areEqual((Object) this.f96295b, (Object) promo.f96295b) && Intrinsics.areEqual((Object) this.f96296c, (Object) promo.f96296c) && Intrinsics.areEqual((Object) this.f96297d, (Object) promo.f96297d);
        }

        @C12580l
        /* renamed from: g */
        public final String mo118510g() {
            return this.f96296c;
        }

        @C12580l
        /* renamed from: h */
        public final String mo118511h() {
            return this.f96297d;
        }

        public int hashCode() {
            int hashCode = this.f96295b.hashCode() * 31;
            String str = this.f96296c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f96297d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        public String toString() {
            String str = this.f96295b;
            String str2 = this.f96296c;
            String str3 = this.f96297d;
            return "Promo(facilityServiceId=" + str + ", metiRef=" + str2 + ", storeFormat=" + str3 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f96295b);
            parcel.writeString(this.f96296c);
            parcel.writeString(this.f96297d);
        }
    }

    @C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Query;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam;", "Landroid/os/Parcelable;", "", "b", "c", "facilityServiceId", "query", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Query extends ProductListParam implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Query> CREATOR = new C38093a();
        @C12579k

        /* renamed from: b */
        public final String f96298b;
        @C12579k

        /* renamed from: c */
        public final String f96299c;

        /* renamed from: com.carrefour.fid.android.domain.models.product.ProductListParam$Query$a */
        public static final class C38093a implements Parcelable.Creator<Query> {
            @C12579k
            /* renamed from: a */
            public final Query createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Query(parcel.readString(), parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final Query[] newArray(int i) {
                return new Query[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Query(@C12579k String str, @C12579k String str2) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "query");
            this.f96298b = str;
            this.f96299c = str2;
        }

        /* renamed from: e */
        public static /* synthetic */ Query m157424e(Query query, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = query.f96298b;
            }
            if ((i & 2) != 0) {
                str2 = query.f96299c;
            }
            return query.mo118521d(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public String mo118467a() {
            return this.f96298b;
        }

        @C12579k
        /* renamed from: b */
        public final String mo118519b() {
            return this.f96298b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo118520c() {
            return this.f96299c;
        }

        @C12579k
        /* renamed from: d */
        public final Query mo118521d(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "query");
            return new Query(str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Query)) {
                return false;
            }
            Query query = (Query) obj;
            return Intrinsics.areEqual((Object) this.f96298b, (Object) query.f96298b) && Intrinsics.areEqual((Object) this.f96299c, (Object) query.f96299c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo118524f() {
            return this.f96299c;
        }

        public int hashCode() {
            return (this.f96298b.hashCode() * 31) + this.f96299c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f96298b;
            String str2 = this.f96299c;
            return "Query(facilityServiceId=" + str + ", query=" + str2 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f96298b);
            parcel.writeString(this.f96299c);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003ø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003JB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R \u0010\u000b\u001a\u00020\u00058\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b!\u0010\u0007\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Search;", "Lcom/carrefour/fid/android/domain/models/product/ProductListParam;", "Landroid/os/Parcelable;", "", "b", "Lcom/carrefour/fid/android/domain/models/product/SearchParam;", "c", "()Ljava/lang/String;", "d", "e", "facilityServiceId", "searchParam", "metiRef", "storeFormat", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/models/product/ProductListParam$Search;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "a", "i", "h", "j", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Search extends ProductListParam implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Search> CREATOR = new C38094a();
        @C12579k

        /* renamed from: b */
        public final String f96300b;
        @C12579k

        /* renamed from: c */
        public final String f96301c;
        @C12580l

        /* renamed from: d */
        public final String f96302d;
        @C12580l

        /* renamed from: e */
        public final String f96303e;

        /* renamed from: com.carrefour.fid.android.domain.models.product.ProductListParam$Search$a */
        public static final class C38094a implements Parcelable.Creator<Search> {
            @C12579k
            /* renamed from: a */
            public final Search createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Search(parcel.readString(), SearchParam.CREATOR.createFromParcel(parcel).mo118598i(), parcel.readString(), parcel.readString(), (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: b */
            public final Search[] newArray(int i) {
                return new Search[i];
            }
        }

        public /* synthetic */ Search(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4);
        }

        /* renamed from: g */
        public static /* synthetic */ Search m157432g(Search search, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = search.f96300b;
            }
            if ((i & 2) != 0) {
                str2 = search.f96301c;
            }
            if ((i & 4) != 0) {
                str3 = search.f96302d;
            }
            if ((i & 8) != 0) {
                str4 = search.f96303e;
            }
            return search.mo118538f(str, str2, str3, str4);
        }

        @C12579k
        /* renamed from: a */
        public String mo118467a() {
            return this.f96300b;
        }

        @C12579k
        /* renamed from: b */
        public final String mo118532b() {
            return this.f96300b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo118533c() {
            return this.f96301c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo118534d() {
            return this.f96302d;
        }

        public int describeContents() {
            return 0;
        }

        @C12580l
        /* renamed from: e */
        public final String mo118536e() {
            return this.f96303e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Search)) {
                return false;
            }
            Search search = (Search) obj;
            return Intrinsics.areEqual((Object) this.f96300b, (Object) search.f96300b) && SearchParam.m157481e(this.f96301c, search.f96301c) && Intrinsics.areEqual((Object) this.f96302d, (Object) search.f96302d) && Intrinsics.areEqual((Object) this.f96303e, (Object) search.f96303e);
        }

        @C12579k
        /* renamed from: f */
        public final Search mo118538f(@C12579k String str, @C12579k String str2, @C12580l String str3, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "searchParam");
            return new Search(str, str2, str3, str4, (DefaultConstructorMarker) null);
        }

        @C12580l
        /* renamed from: h */
        public final String mo118539h() {
            return this.f96302d;
        }

        public int hashCode() {
            int hashCode = ((this.f96300b.hashCode() * 31) + SearchParam.m157482g(this.f96301c)) * 31;
            String str = this.f96302d;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f96303e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final String mo118541i() {
            return this.f96301c;
        }

        @C12580l
        /* renamed from: j */
        public final String mo118542j() {
            return this.f96303e;
        }

        @C12579k
        public String toString() {
            String str = this.f96300b;
            String h = SearchParam.m157483h(this.f96301c);
            String str2 = this.f96302d;
            String str3 = this.f96303e;
            return "Search(facilityServiceId=" + str + ", searchParam=" + h + ", metiRef=" + str2 + ", storeFormat=" + str3 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f96300b);
            SearchParam.m157484j(this.f96301c, parcel, i);
            parcel.writeString(this.f96302d);
            parcel.writeString(this.f96303e);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Search(String str, String str2, String str3, String str4) {
            super(str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "searchParam");
            this.f96300b = str;
            this.f96301c = str2;
            this.f96302d = str3;
            this.f96303e = str4;
        }
    }

    public /* synthetic */ ProductListParam(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @C12579k
    /* renamed from: a */
    public String mo118467a() {
        return this.f96285a;
    }

    public ProductListParam(String str) {
        this.f96285a = str;
    }
}
