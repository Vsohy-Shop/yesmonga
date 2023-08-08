package com.carrefour.fid.android.shared.util.cache;

import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"", "", "Lcom/carrefour/fid/android/shared/util/cache/a;", "it", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MemCache$removeExpired$1 extends Lambda implements C11300l<Map.Entry<String, C28907a<?>>, Boolean> {

    /* renamed from: f */
    public static final MemCache$removeExpired$1 f70816f = new MemCache$removeExpired$1();

    public MemCache$removeExpired$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k Map.Entry<String, C28907a<?>> entry) {
        Intrinsics.checkNotNullParameter(entry, "it");
        return Boolean.valueOf(entry.getValue().mo84148b());
    }
}
