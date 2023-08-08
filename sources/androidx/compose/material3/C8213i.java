package androidx.compose.material3;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C8251n0
/* renamed from: androidx.compose.material3.i */
public final class C8213i {

    /* renamed from: c */
    public static final int f20174c = 0;
    @C12579k

    /* renamed from: a */
    public final SheetState f20175a;
    @C12579k

    /* renamed from: b */
    public final SnackbarHostState f20176b;

    public C8213i(@C12579k SheetState sheetState, @C12579k SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(sheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.f20175a = sheetState;
        this.f20176b = snackbarHostState;
    }

    @C12579k
    /* renamed from: a */
    public final SheetState mo12648a() {
        return this.f20175a;
    }

    @C12579k
    /* renamed from: b */
    public final SnackbarHostState mo12649b() {
        return this.f20176b;
    }
}
