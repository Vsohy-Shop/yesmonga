package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.data.entities.ArsenalGameContentResponse;
import com.carrefour.fid.android.data.entities.ArsenalJOContentResponse;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.repositories.c */
public interface C38194c {
    @C12580l
    /* renamed from: a */
    Object mo111481a(@C12579k String str, @C12579k C11045c<? super Result<ArsenalJOContentResponse>> cVar);

    @C12580l
    /* renamed from: b */
    Object mo111482b(@C12579k C11045c<? super Result<? extends List<ArsenalGameContentResponse>>> cVar);

    @C12580l
    /* renamed from: c */
    Object mo111483c(@C12579k C11045c<? super Result<? extends List<ArsenalGameContentResponse>>> cVar);
}
