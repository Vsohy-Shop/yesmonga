package com.carrefour.fid.android.product.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/models/Advice;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/product/presentation/models/ProductAdviceType;", "a", "", "b", "typeProduct", "value", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/product/presentation/models/ProductAdviceType;", "e", "()Lcom/carrefour/fid/android/product/presentation/models/ProductAdviceType;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/product/presentation/models/ProductAdviceType;Ljava/lang/String;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class Advice implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Advice> CREATOR = new C27643a();

    /* renamed from: c */
    public static final int f67144c = 0;
    @C12579k

    /* renamed from: a */
    public final ProductAdviceType f67145a;
    @C12579k

    /* renamed from: b */
    public final String f67146b;

    /* renamed from: com.carrefour.fid.android.product.presentation.models.Advice$a */
    public static final class C27643a implements Parcelable.Creator<Advice> {
        @C12579k
        /* renamed from: a */
        public final Advice createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Advice(ProductAdviceType.valueOf(parcel.readString()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final Advice[] newArray(int i) {
            return new Advice[i];
        }
    }

    public Advice(@C12579k ProductAdviceType productAdviceType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(productAdviceType, "typeProduct");
        Intrinsics.checkNotNullParameter(str, "value");
        this.f67145a = productAdviceType;
        this.f67146b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ Advice m116300d(Advice advice, ProductAdviceType productAdviceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productAdviceType = advice.f67145a;
        }
        if ((i & 2) != 0) {
            str = advice.f67146b;
        }
        return advice.mo80287c(productAdviceType, str);
    }

    @C12579k
    /* renamed from: a */
    public final ProductAdviceType mo80285a() {
        return this.f67145a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo80286b() {
        return this.f67146b;
    }

    @C12579k
    /* renamed from: c */
    public final Advice mo80287c(@C12579k ProductAdviceType productAdviceType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(productAdviceType, "typeProduct");
        Intrinsics.checkNotNullParameter(str, "value");
        return new Advice(productAdviceType, str);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final ProductAdviceType mo80289e() {
        return this.f67145a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Advice)) {
            return false;
        }
        Advice advice = (Advice) obj;
        return this.f67145a == advice.f67145a && Intrinsics.areEqual((Object) this.f67146b, (Object) advice.f67146b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo80291f() {
        return this.f67146b;
    }

    public int hashCode() {
        return (this.f67145a.hashCode() * 31) + this.f67146b.hashCode();
    }

    @C12579k
    public String toString() {
        ProductAdviceType productAdviceType = this.f67145a;
        String str = this.f67146b;
        return "Advice(typeProduct=" + productAdviceType + ", value=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f67145a.name());
        parcel.writeString(this.f67146b);
    }
}
