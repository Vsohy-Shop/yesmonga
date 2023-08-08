package com.carrefour.fid.android.domain.interactors.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface GetFavoriteProductsFlowUseCase extends C11304p<Param, C11045c<? super C11907e<? extends List<? extends C38115c>>>, Object>, C11074j {

    @C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B&\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003ø\u0001\u0000J,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001ø\u0001\u0000J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/interactors/product/GetFavoriteProductsFlowUseCase$Param;", "Landroid/os/Parcelable;", "", "", "a", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "b", "storeServiceIdList", "gtinList", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Param implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Param> CREATOR = new C37741a();
        @C12579k

        /* renamed from: a */
        public final List<String> f94736a;
        @C12579k

        /* renamed from: b */
        public final List<Gtin> f94737b;

        /* renamed from: com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase$Param$a */
        public static final class C37741a implements Parcelable.Creator<Param> {
            @C12579k
            /* renamed from: a */
            public final Param createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Gtin.CREATOR.createFromParcel(parcel));
                }
                return new Param(createStringArrayList, arrayList);
            }

            @C12579k
            /* renamed from: b */
            public final Param[] newArray(int i) {
                return new Param[i];
            }
        }

        public Param(@C12579k List<String> list, @C12579k List<Gtin> list2) {
            Intrinsics.checkNotNullParameter(list, "storeServiceIdList");
            Intrinsics.checkNotNullParameter(list2, "gtinList");
            this.f94736a = list;
            this.f94737b = list2;
        }

        /* renamed from: d */
        public static /* synthetic */ Param m154697d(Param param, List<String> list, List<Gtin> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = param.f94736a;
            }
            if ((i & 2) != 0) {
                list2 = param.f94737b;
            }
            return param.mo114899c(list, list2);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo114897a() {
            return this.f94736a;
        }

        @C12579k
        /* renamed from: b */
        public final List<Gtin> mo114898b() {
            return this.f94737b;
        }

        @C12579k
        /* renamed from: c */
        public final Param mo114899c(@C12579k List<String> list, @C12579k List<Gtin> list2) {
            Intrinsics.checkNotNullParameter(list, "storeServiceIdList");
            Intrinsics.checkNotNullParameter(list2, "gtinList");
            return new Param(list, list2);
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final List<Gtin> mo114901e() {
            return this.f94737b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Intrinsics.areEqual((Object) this.f94736a, (Object) param.f94736a) && Intrinsics.areEqual((Object) this.f94737b, (Object) param.f94737b);
        }

        @C12579k
        /* renamed from: f */
        public final List<String> mo114903f() {
            return this.f94736a;
        }

        public int hashCode() {
            return (this.f94736a.hashCode() * 31) + this.f94737b.hashCode();
        }

        @C12579k
        public String toString() {
            List<String> list = this.f94736a;
            List<Gtin> list2 = this.f94737b;
            return "Param(storeServiceIdList=" + list + ", gtinList=" + list2 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeStringList(this.f94736a);
            List<Gtin> list = this.f94737b;
            parcel.writeInt(list.size());
            for (Gtin i2 : list) {
                Gtin.m157314j(i2.mo118380i(), parcel, i);
            }
        }
    }
}
