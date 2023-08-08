package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÂ\u0003R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/d2;", "writeToParcel", "describeContents", "index", "b", "", "toString", "hashCode", "", "other", "", "equals", "a", "I", "<init>", "(I)V", "foundation_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
final class DefaultLazyKey implements Parcelable {
    @C12579k
    @C11287e
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new C2518a();
    @C12579k

    /* renamed from: b */
    public static final C2519b f6682b = new C2519b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f6683a;

    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$a */
    public static final class C2518a implements Parcelable.Creator<DefaultLazyKey> {
        @C12579k
        /* renamed from: a */
        public DefaultLazyKey createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public DefaultLazyKey[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$b */
    public static final class C2519b {
        public /* synthetic */ C2519b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m11311a() {
        }

        public C2519b() {
        }
    }

    public DefaultLazyKey(int i) {
        this.f6683a = i;
    }

    /* renamed from: c */
    public static /* synthetic */ DefaultLazyKey m11306c(DefaultLazyKey defaultLazyKey, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = defaultLazyKey.f6683a;
        }
        return defaultLazyKey.mo8656b(i);
    }

    /* renamed from: a */
    public final int mo8655a() {
        return this.f6683a;
    }

    @C12579k
    /* renamed from: b */
    public final DefaultLazyKey mo8656b(int i) {
        return new DefaultLazyKey(i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f6683a == ((DefaultLazyKey) obj).f6683a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f6683a);
    }

    @C12579k
    public String toString() {
        return "DefaultLazyKey(index=" + this.f6683a + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f6683a);
    }
}
