package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"BanParcelableUsage"})
@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0011B\u001d\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, mo22516d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/d2;", "writeToParcel", "describeContents", "value", "Landroidx/compose/runtime/b2;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/b2;)V", "c", "b", "runtime_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    @C12579k
    @C11287e
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C8389a();
    @C12579k

    /* renamed from: c */
    public static final C8390b f22687c = new C8390b((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f22688d = 0;

    /* renamed from: e */
    public static final int f22689e = 1;

    /* renamed from: f */
    public static final int f22690f = 2;

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    public static final class C8389a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        @C12579k
        /* renamed from: a */
        public ParcelableSnapshotMutableState<Object> createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return createFromParcel(parcel, (ClassLoader) null);
        }

        @C12579k
        /* renamed from: b */
        public ParcelableSnapshotMutableState<Object> createFromParcel(@C12579k Parcel parcel, @C12580l ClassLoader classLoader) {
            C8410b2 b2Var;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (classLoader == null) {
                classLoader = C8389a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                b2Var = C8415c2.m30243l();
            } else if (readInt == 1) {
                b2Var = C8415c2.m30254w();
            } else if (readInt == 2) {
                b2Var = C8415c2.m30250s();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(readValue, b2Var);
        }

        @C12579k
        /* renamed from: c */
        public ParcelableSnapshotMutableState<Object>[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$b */
    public static final class C8390b {
        public /* synthetic */ C8390b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m29953a() {
        }

        public C8390b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, @C12579k C8410b2<T> b2Var) {
        super(t, b2Var);
        Intrinsics.checkNotNullParameter(b2Var, "policy");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(getValue());
        C8410b2 a = mo15298a();
        if (Intrinsics.areEqual((Object) a, (Object) C8415c2.m30243l())) {
            i2 = 0;
        } else if (Intrinsics.areEqual((Object) a, (Object) C8415c2.m30254w())) {
            i2 = 1;
        } else if (Intrinsics.areEqual((Object) a, (Object) C8415c2.m30250s())) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
