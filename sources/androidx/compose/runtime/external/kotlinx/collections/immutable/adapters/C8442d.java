package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8447e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.d */
public final class C8442d<E> extends C8439a<E> implements C8447e<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8442d(@C12579k Set<? extends E> set) {
        super(set);
        Intrinsics.checkNotNullParameter(set, "impl");
    }
}
