package androidx.core.p027os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(21)
/* renamed from: androidx.core.os.c */
public final class C17777c {
    @C12579k

    /* renamed from: a */
    public static final C17777c f46176a = new C17777c();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m81160a(@C12579k Bundle bundle, @C12579k String str, @C12580l Size size) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(str, "key");
        bundle.putSize(str, size);
    }

    @C0373u
    @C11384m
    /* renamed from: b */
    public static final void m81161b(@C12579k Bundle bundle, @C12579k String str, @C12580l SizeF sizeF) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
