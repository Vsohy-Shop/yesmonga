package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000b\u0010\b\u001a\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010\u0004\u001a\u00070\u0002¢\u0006\u0002\b\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J/\u0010\n\u001a\u00020\u00002\r\b\u0002\u0010\b\u001a\u00070\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eHÖ\u0001R%\u0010\b\u001a\u00070\u0002¢\u0006\u0002\b\u00038\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0005R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\t\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Term;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/product/f;", "Lkotlinx/parcelize/e;", "a", "()Ljava/lang/String;", "", "b", "term", "isSelected", "c", "(Ljava/lang/String;Z)Lcom/carrefour/fid/android/domain/models/product/Term;", "", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "e", "Z", "()Z", "f", "(Z)V", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Term implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Term> CREATOR = new C38100a();
    @C12579k

    /* renamed from: a */
    public final String f96316a;

    /* renamed from: b */
    public boolean f96317b;

    /* renamed from: com.carrefour.fid.android.domain.models.product.Term$a */
    public static final class C38100a implements Parcelable.Creator<Term> {
        @C12579k
        /* renamed from: a */
        public final Term createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Term(((C38112f) parcel.readValue(Term.class.getClassLoader())).mo118787h(), parcel.readInt() != 0, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final Term[] newArray(int i) {
            return new Term[i];
        }
    }

    public /* synthetic */ Term(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    /* renamed from: d */
    public static /* synthetic */ Term m157499d(Term term, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = term.f96316a;
        }
        if ((i & 2) != 0) {
            z = term.f96317b;
        }
        return term.mo118624c(str, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118622a() {
        return this.f96316a;
    }

    /* renamed from: b */
    public final boolean mo118623b() {
        return this.f96317b;
    }

    @C12579k
    /* renamed from: c */
    public final Term mo118624c(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        return new Term(str, z, (DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo118626e() {
        return this.f96316a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Term)) {
            return false;
        }
        Term term = (Term) obj;
        return C38112f.m157660d(this.f96316a, term.f96316a) && this.f96317b == term.f96317b;
    }

    /* renamed from: f */
    public final void mo118628f(boolean z) {
        this.f96317b = z;
    }

    public int hashCode() {
        int f = C38112f.m157661f(this.f96316a) * 31;
        boolean z = this.f96317b;
        if (z) {
            z = true;
        }
        return f + (z ? 1 : 0);
    }

    public final boolean isSelected() {
        return this.f96317b;
    }

    @C12579k
    public String toString() {
        String g = C38112f.m157662g(this.f96316a);
        boolean z = this.f96317b;
        return "Term(term=" + g + ", isSelected=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeValue(C38112f.m157657a(this.f96316a));
        parcel.writeInt(this.f96317b ? 1 : 0);
    }

    public Term(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        this.f96316a = str;
        this.f96317b = z;
    }
}
