package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27101a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$7$1 */
public final class PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$7$1 extends Lambda implements C11304p<String, String, C11079d2> {
    final /* synthetic */ C11300l<C27101a, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreScreen$1$1$1$4$7$1(C11300l<? super C27101a, C11079d2> lVar) {
        super(2);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo73827a(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "stickersTitle");
        Intrinsics.checkNotNullParameter(str2, "stickersUrl");
        this.$actioner.invoke(new C27101a.C27102a.C27107e(str, str2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo73827a((String) obj, (String) obj2);
        return C11079d2.f28267a;
    }
}
