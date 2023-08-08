package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C8665r;
import com.google.zxing.client.android.C34651e;
import kotlin.C10864b0;
import kotlin.C11395k;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ActualAndroid_androidKt {

    /* renamed from: a */
    public static final boolean f22548a = false;
    @C12579k

    /* renamed from: b */
    public static final C11677z f22549b = C10864b0.m38748c(ActualAndroid_androidKt$DefaultMonotonicFrameClock$2.f22551f);
    @C12579k

    /* renamed from: c */
    public static final String f22550c = "ComposeInternal";

    @C12579k
    /* renamed from: a */
    public static final <T> C8665r<T> m29480a(T t, @C12579k C8410b2<T> b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "policy");
        return new ParcelableSnapshotMutableState(t, b2Var);
    }

    @C12579k
    /* renamed from: b */
    public static final C8686v0 m29481b() {
        return (C8686v0) f22549b.getValue();
    }

    @C11395k(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    /* renamed from: c */
    public static /* synthetic */ void m29482c() {
    }

    /* renamed from: d */
    public static final void m29483d(@C12579k String str, @C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(th, C34651e.f83829d);
    }
}
