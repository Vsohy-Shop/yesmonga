package androidx.core.p027os;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(18)
/* renamed from: androidx.core.os.b */
public final class C17775b {
    @C12579k

    /* renamed from: a */
    public static final C17775b f46175a = new C17775b();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m81158a(@C12579k Bundle bundle, @C12579k String str, @C12580l IBinder iBinder) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
