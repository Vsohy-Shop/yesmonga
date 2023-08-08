package com.carrefour.fid.android.domain.interactors.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.detail.C38107b;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28547h2;
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

public interface GetProductDetailUseCase extends C11304p<Param, C11045c<? super C11907e<? extends C36371a<? extends C38107b>>>, Object>, C11074j {

    @C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000b\u0010\b\u001a\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u0005J/\u0010\n\u001a\u00020\u00002\r\b\u0002\u0010\b\u001a\u00070\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R%\u0010\b\u001a\u00070\u0002¢\u0006\u0002\b\u00038\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0005R \u0010\t\u001a\u00020\u00068\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u0005\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/interactors/product/GetProductDetailUseCase$Param;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/service/models/FacilityServiceId;", "Lkotlinx/parcelize/e;", "a", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "b", "facilityServiceId", "gtin", "c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/interactors/product/GetProductDetailUseCase$Param;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Param implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Param> CREATOR = new C37745a();
        @C12579k

        /* renamed from: a */
        public final String f94745a;
        @C12579k

        /* renamed from: b */
        public final String f94746b;

        /* renamed from: com.carrefour.fid.android.domain.interactors.product.GetProductDetailUseCase$Param$a */
        public static final class C37745a implements Parcelable.Creator<Param> {
            @C12579k
            /* renamed from: a */
            public final Param createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Param(FacilityServiceId.CREATOR.createFromParcel(parcel).mo119111j(), Gtin.CREATOR.createFromParcel(parcel).mo118380i(), (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: b */
            public final Param[] newArray(int i) {
                return new Param[i];
            }
        }

        public /* synthetic */ Param(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ Param m154731d(Param param, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.f94745a;
            }
            if ((i & 2) != 0) {
                str2 = param.f94746b;
            }
            return param.mo114957c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114955a() {
            return this.f94745a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114956b() {
            return this.f94746b;
        }

        @C12579k
        /* renamed from: c */
        public final Param mo114957c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "gtin");
            return new Param(str, str2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final String mo114959e() {
            return this.f94745a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return FacilityServiceId.m157962f(this.f94745a, param.f94745a) && Gtin.m157311e(this.f94746b, param.f94746b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114961f() {
            return this.f94746b;
        }

        public int hashCode() {
            return (FacilityServiceId.m157963h(this.f94745a) * 31) + Gtin.m157312g(this.f94746b);
        }

        @C12579k
        public String toString() {
            String i = FacilityServiceId.m157964i(this.f94745a);
            String h = Gtin.m157313h(this.f94746b);
            return "Param(facilityServiceId=" + i + ", gtin=" + h + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            FacilityServiceId.m157965k(this.f94745a, parcel, i);
            Gtin.m157314j(this.f94746b, parcel, i);
        }

        public Param(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(str2, "gtin");
            this.f94745a = str;
            this.f94746b = str2;
        }
    }
}
