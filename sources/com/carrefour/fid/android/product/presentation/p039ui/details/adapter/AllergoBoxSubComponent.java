package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\r\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/AllergoBoxSubComponent;", "Landroid/os/Parcelable;", "", "a", "isAllergoBox", "b", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "d", "()Z", "<init>", "(Z)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.AllergoBoxSubComponent */
public final class AllergoBoxSubComponent implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<AllergoBoxSubComponent> CREATOR = new C27762a();

    /* renamed from: a */
    public final boolean f67325a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.AllergoBoxSubComponent$a */
    public static final class C27762a implements Parcelable.Creator<AllergoBoxSubComponent> {
        @C12579k
        /* renamed from: a */
        public final AllergoBoxSubComponent createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllergoBoxSubComponent(parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final AllergoBoxSubComponent[] newArray(int i) {
            return new AllergoBoxSubComponent[i];
        }
    }

    public AllergoBoxSubComponent() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ AllergoBoxSubComponent m116667c(AllergoBoxSubComponent allergoBoxSubComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = allergoBoxSubComponent.f67325a;
        }
        return allergoBoxSubComponent.mo80628b(z);
    }

    /* renamed from: a */
    public final boolean mo80627a() {
        return this.f67325a;
    }

    @C12579k
    /* renamed from: b */
    public final AllergoBoxSubComponent mo80628b(boolean z) {
        return new AllergoBoxSubComponent(z);
    }

    /* renamed from: d */
    public final boolean mo80629d() {
        return this.f67325a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllergoBoxSubComponent) && this.f67325a == ((AllergoBoxSubComponent) obj).f67325a;
    }

    public int hashCode() {
        boolean z = this.f67325a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f67325a;
        return "AllergoBoxSubComponent(isAllergoBox=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f67325a ? 1 : 0);
    }

    public AllergoBoxSubComponent(boolean z) {
        this.f67325a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AllergoBoxSubComponent(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
