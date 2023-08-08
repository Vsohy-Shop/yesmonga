package androidx.compose.material;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
/* renamed from: androidx.compose.material.d1 */
public final class C3036d1 {

    /* renamed from: c */
    public static final int f8101c = 0;
    @C12579k

    /* renamed from: a */
    public final DrawerState f8102a;
    @C12579k

    /* renamed from: b */
    public final SnackbarHostState f8103b;

    public C3036d1(@C12579k DrawerState drawerState, @C12579k SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(drawerState, "drawerState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.f8102a = drawerState;
        this.f8103b = snackbarHostState;
    }

    @C12579k
    /* renamed from: a */
    public final DrawerState mo10746a() {
        return this.f8102a;
    }

    @C12579k
    /* renamed from: b */
    public final SnackbarHostState mo10747b() {
        return this.f8103b;
    }
}
