package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo22516d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroidx/compose/runtime/snapshots/f;", "snapshot", "Landroidx/compose/runtime/snapshots/f;", "a", "()Landroidx/compose/runtime/snapshots/f;", "<init>", "(Landroidx/compose/runtime/snapshots/f;)V", "runtime_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class SnapshotApplyConflictException extends Exception {

    /* renamed from: a */
    public static final int f23118a = 8;
    @C12579k
    private final C8646f snapshot;

    public SnapshotApplyConflictException(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        this.snapshot = fVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8646f mo16436a() {
        return this.snapshot;
    }
}
