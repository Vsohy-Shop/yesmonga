package com.usabilla.sdk.ubform.p008di;

import androidx.exifinterface.media.C19135a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n"}, mo22516d2 = {"T", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.di.ComponentKt$injectNullable$1 */
public final class ComponentKt$injectNullable$1 extends Lambda implements C11289a<T> {
    final /* synthetic */ C9819b $this_injectNullable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentKt$injectNullable$1(C9819b bVar) {
        super(0);
        this.$this_injectNullable = bVar;
    }

    @C12580l
    public final T invoke() {
        C9818a a = this.$this_injectNullable.mo19845a();
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return a.mo20110d(Object.class);
    }
}
