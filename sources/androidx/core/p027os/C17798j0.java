package androidx.core.p027os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: androidx.core.os.j0 */
public final class C17798j0 {

    /* renamed from: androidx.core.os.j0$a */
    public static class C17799a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a */
        public final C17803k0<T> f46184a;

        public C17799a(C17803k0<T> k0Var) {
            this.f46184a = k0Var;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f46184a.createFromParcel(parcel, (ClassLoader) null);
        }

        public T[] newArray(int i) {
            return this.f46184a.newArray(i);
        }

        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f46184a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m81187a(C17803k0<T> k0Var) {
        return new C17799a(k0Var);
    }
}
