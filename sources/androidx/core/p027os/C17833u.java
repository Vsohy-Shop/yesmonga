package androidx.core.p027os;

import android.os.OutcomeReceiver;
import androidx.annotation.C0376v0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(31)
/* renamed from: androidx.core.os.u */
public final class C17833u {
    @C0376v0(31)
    @C12579k
    /* renamed from: a */
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> m81276a(@C12579k C11045c<? super R> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return C17831t.m81274a(new ContinuationOutcomeReceiver(cVar));
    }
}
