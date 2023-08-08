package androidx.datastore.preferences.core;

import androidx.datastore.core.C18570d;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PreferenceDataStore implements C18570d<C18602a> {
    @C12579k

    /* renamed from: a */
    public final C18570d<C18602a> f47460a;

    public PreferenceDataStore(@C12579k C18570d<C18602a> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "delegate");
        this.f47460a = dVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo53543a(@C12579k C11304p<? super C18602a, ? super C11045c<? super C18602a>, ? extends Object> pVar, @C12579k C11045c<? super C18602a> cVar) {
        return this.f47460a.mo53543a(new PreferenceDataStore$updateData$2(pVar, (C11045c<? super PreferenceDataStore$updateData$2>) null), cVar);
    }

    @C12579k
    public C11907e<C18602a> getData() {
        return this.f47460a.getData();
    }
}
