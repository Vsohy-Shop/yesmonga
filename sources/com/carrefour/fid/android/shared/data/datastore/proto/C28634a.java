package com.carrefour.fid.android.shared.data.datastore.proto;

import androidx.datastore.core.C18570d;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.data.datastore.proto.a */
public interface C28634a<Host, Child> {
    @C12579k
    /* renamed from: a */
    C18570d<Host> mo83527a();

    @C12580l
    /* renamed from: b */
    Object mo83528b(@C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: c */
    Object mo83529c(@C12579k C11045c<? super C11907e<? extends List<? extends Child>>> cVar);

    @C12580l
    /* renamed from: d */
    Object mo83530d(Child child, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: e */
    Object mo83531e(Child child, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: f */
    Object mo83532f(Child child, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: g */
    Object mo83533g(@C12579k List<? extends Child> list, @C12579k C11045c<? super C11079d2> cVar);
}
