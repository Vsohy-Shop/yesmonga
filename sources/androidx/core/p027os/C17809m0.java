package androidx.core.p027os;

import android.os.PersistableBundle;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(22)
/* renamed from: androidx.core.os.m0 */
public final class C17809m0 {
    @C12579k

    /* renamed from: a */
    public static final C17809m0 f46189a = new C17809m0();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m81203a(@C12579k PersistableBundle persistableBundle, @C12580l String str, boolean z) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @C0373u
    @C11384m
    /* renamed from: b */
    public static final void m81204b(@C12579k PersistableBundle persistableBundle, @C12580l String str, @C12579k boolean[] zArr) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        Intrinsics.checkNotNullParameter(zArr, "value");
        persistableBundle.putBooleanArray(str, zArr);
    }
}
