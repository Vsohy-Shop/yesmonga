package com.carrefour.fid.android.domain.interactors.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.product.Gtin;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "Use GetProductDetailUseCase")
public interface GetOldProductFlowUseCase extends C11304p<Param, C11045c<? super C11907e<? extends C36371a<? extends Offer>>>, Object>, C11074j {

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0005\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006R \u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\u0006\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/interactors/product/GetOldProductFlowUseCase$Param;", "Landroid/os/Parcelable;", "", "a", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "b", "()Ljava/lang/String;", "storeService", "gtin", "c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/domain/interactors/product/GetOldProductFlowUseCase$Param;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Param implements Parcelable {
        @C12579k
        public static final Parcelable.Creator<Param> CREATOR = new C37744a();
        @C12579k

        /* renamed from: a */
        public final String f94743a;
        @C12579k

        /* renamed from: b */
        public final String f94744b;

        /* renamed from: com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase$Param$a */
        public static final class C37744a implements Parcelable.Creator<Param> {
            @C12579k
            /* renamed from: a */
            public final Param createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Param(parcel.readString(), Gtin.CREATOR.createFromParcel(parcel).mo118380i(), (DefaultConstructorMarker) null);
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
        public static /* synthetic */ Param m154723d(Param param, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.f94743a;
            }
            if ((i & 2) != 0) {
                str2 = param.f94744b;
            }
            return param.mo114943c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114941a() {
            return this.f94743a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114942b() {
            return this.f94744b;
        }

        @C12579k
        /* renamed from: c */
        public final Param mo114943c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "storeService");
            Intrinsics.checkNotNullParameter(str2, "gtin");
            return new Param(str, str2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final String mo114945e() {
            return this.f94744b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Intrinsics.areEqual((Object) this.f94743a, (Object) param.f94743a) && Gtin.m157311e(this.f94744b, param.f94744b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114947f() {
            return this.f94743a;
        }

        public int hashCode() {
            return (this.f94743a.hashCode() * 31) + Gtin.m157312g(this.f94744b);
        }

        @C12579k
        public String toString() {
            String str = this.f94743a;
            String h = Gtin.m157313h(this.f94744b);
            return "Param(storeService=" + str + ", gtin=" + h + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f94743a);
            Gtin.m157314j(this.f94744b, parcel, i);
        }

        public Param(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "storeService");
            Intrinsics.checkNotNullParameter(str2, "gtin");
            this.f94743a = str;
            this.f94744b = str2;
        }
    }
}
