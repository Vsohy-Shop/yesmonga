package com.carrefour.fid.android.domain.interactors.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.detail.C38107b;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface GetMixedProductsDetailUseCase extends C11304p<Param, C11045c<? super C11907e<? extends C36371a<? extends List<? extends C38107b>>>>, Object>, C11074j {

    @C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u000b\u0010\u000b\u001a\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0006\u0010\f\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u001e\u0010\u0006\u001a\u00070\u0004¢\u0006\u0002\b\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0007J9\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\r\b\u0002\u0010\u000b\u001a\u00070\u0004¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R%\u0010\u000b\u001a\u00070\u0004¢\u0006\u0002\b\u00058\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0007R \u0010\f\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u0007\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/interactors/product/GetMixedProductsDetailUseCase$Param;", "Landroid/os/Parcelable;", "", "a", "Lcom/carrefour/fid/android/domain/models/service/models/FacilityServiceId;", "Lkotlinx/parcelize/e;", "b", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "c", "storeId", "facilityServiceId", "gtin", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/interactors/product/GetMixedProductsDetailUseCase$Param;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "h", "f", "g", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Param implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Param> CREATOR = new C37742a();
        @C12579k

        /* renamed from: a */
        public final String f94738a;
        @C12579k

        /* renamed from: b */
        public final String f94739b;
        @C12579k

        /* renamed from: c */
        public final String f94740c;

        /* renamed from: com.carrefour.fid.android.domain.interactors.product.GetMixedProductsDetailUseCase$Param$a */
        public static final class C37742a implements Parcelable.Creator<Param> {
            @C12579k
            /* renamed from: a */
            public final Param createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Param(parcel.readString(), FacilityServiceId.CREATOR.createFromParcel(parcel).mo119111j(), Gtin.CREATOR.createFromParcel(parcel).mo118380i(), (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: b */
            public final Param[] newArray(int i) {
                return new Param[i];
            }
        }

        public /* synthetic */ Param(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }

        /* renamed from: e */
        public static /* synthetic */ Param m154705e(Param param, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.f94738a;
            }
            if ((i & 2) != 0) {
                str2 = param.f94739b;
            }
            if ((i & 4) != 0) {
                str3 = param.f94740c;
            }
            return param.mo114914d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114911a() {
            return this.f94738a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114912b() {
            return this.f94739b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo114913c() {
            return this.f94740c;
        }

        @C12579k
        /* renamed from: d */
        public final Param mo114914d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "storeId");
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str3, "gtin");
            return new Param(str, str2, str3, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Intrinsics.areEqual((Object) this.f94738a, (Object) param.f94738a) && FacilityServiceId.m157962f(this.f94739b, param.f94739b) && Gtin.m157311e(this.f94740c, param.f94740c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114917f() {
            return this.f94739b;
        }

        @C12579k
        /* renamed from: g */
        public final String mo114918g() {
            return this.f94740c;
        }

        @C12579k
        /* renamed from: h */
        public final String mo114919h() {
            return this.f94738a;
        }

        public int hashCode() {
            return (((this.f94738a.hashCode() * 31) + FacilityServiceId.m157963h(this.f94739b)) * 31) + Gtin.m157312g(this.f94740c);
        }

        @C12579k
        public String toString() {
            String str = this.f94738a;
            String i = FacilityServiceId.m157964i(this.f94739b);
            String h = Gtin.m157313h(this.f94740c);
            return "Param(storeId=" + str + ", facilityServiceId=" + i + ", gtin=" + h + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f94738a);
            FacilityServiceId.m157965k(this.f94739b, parcel, i);
            Gtin.m157314j(this.f94740c, parcel, i);
        }

        public Param(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "storeId");
            Intrinsics.checkNotNullParameter(str2, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str3, "gtin");
            this.f94738a = str;
            this.f94739b = str2;
            this.f94740c = str3;
        }
    }
}
