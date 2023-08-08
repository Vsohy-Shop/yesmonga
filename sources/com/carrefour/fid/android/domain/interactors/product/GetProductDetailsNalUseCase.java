package com.carrefour.fid.android.domain.interactors.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.detail.C38106a;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface GetProductDetailsNalUseCase extends C37679f<Param, C38106a> {

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/interactors/product/GetProductDetailsNalUseCase$Param;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "a", "()Ljava/lang/String;", "gtin", "b", "(Ljava/lang/String;)Lcom/carrefour/fid/android/domain/interactors/product/GetProductDetailsNalUseCase$Param;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "d", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Param implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Param> CREATOR = new C37746a();
        @C12579k

        /* renamed from: a */
        public final String f94747a;

        /* renamed from: com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase$Param$a */
        public static final class C37746a implements Parcelable.Creator<Param> {
            @C12579k
            /* renamed from: a */
            public final Param createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Param(Gtin.CREATOR.createFromParcel(parcel).mo118380i(), (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: b */
            public final Param[] newArray(int i) {
                return new Param[i];
            }
        }

        public /* synthetic */ Param(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: c */
        public static /* synthetic */ Param m154739c(Param param, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.f94747a;
            }
            return param.mo114970b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114969a() {
            return this.f94747a;
        }

        @C12579k
        /* renamed from: b */
        public final Param mo114970b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            return new Param(str, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114971d() {
            return this.f94747a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Param) && Gtin.m157311e(this.f94747a, ((Param) obj).f94747a);
        }

        public int hashCode() {
            return Gtin.m157312g(this.f94747a);
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f94747a);
            return "Param(gtin=" + h + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Gtin.m157314j(this.f94747a, parcel, i);
        }

        public Param(String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            this.f94747a = str;
        }
    }
}
