package androidx.compose.p004ui.tooling.preview.datasource;

import androidx.compose.p004ui.tooling.preview.C16469e;
import androidx.compose.runtime.internal.C8567o;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.tooling.preview.datasource.a */
public class C16467a<T> implements C16469e<T> {

    /* renamed from: b */
    public static final int f40837b = 8;
    @C12579k

    /* renamed from: a */
    public final Collection<T> f40838a;

    public C16467a(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f40838a = collection;
    }

    @C12579k
    public C11559m<T> getValues() {
        return CollectionsKt___CollectionsKt.m40700v1(this.f40838a);
    }
}
