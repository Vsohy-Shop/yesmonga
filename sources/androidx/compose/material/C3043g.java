package androidx.compose.material;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C3044g0
/* renamed from: androidx.compose.material.g */
public final class C3043g {

    /* renamed from: d */
    public static final int f8118d = 0;
    @C12579k

    /* renamed from: a */
    public final DrawerState f8119a;
    @C12579k

    /* renamed from: b */
    public final BottomSheetState f8120b;
    @C12579k

    /* renamed from: c */
    public final SnackbarHostState f8121c;

    public C3043g(@C12579k DrawerState drawerState, @C12579k BottomSheetState bottomSheetState, @C12579k SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(drawerState, "drawerState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.f8119a = drawerState;
        this.f8120b = bottomSheetState;
        this.f8121c = snackbarHostState;
    }

    @C12579k
    /* renamed from: a */
    public final BottomSheetState mo10762a() {
        return this.f8120b;
    }

    @C12579k
    /* renamed from: b */
    public final DrawerState mo10763b() {
        return this.f8119a;
    }

    @C12579k
    /* renamed from: c */
    public final SnackbarHostState mo10764c() {
        return this.f8121c;
    }
}
