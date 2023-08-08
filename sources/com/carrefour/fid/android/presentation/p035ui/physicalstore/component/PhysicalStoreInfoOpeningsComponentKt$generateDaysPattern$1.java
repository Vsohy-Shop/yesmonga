package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.shared.util.C28932h;
import com.urbanairship.automation.C8970v;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt$generateDaysPattern$1 */
public final class PhysicalStoreInfoOpeningsComponentKt$generateDaysPattern$1 extends Lambda implements C11300l<C38147b, CharSequence> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoOpeningsComponentKt$generateDaysPattern$1(Context context) {
        super(1);
        this.$context = context;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k C38147b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C8970v.f24100k);
        Context context = this.$context;
        C28932h.C28933a aVar = C28932h.f70914a;
        String string = context.getString(R.string.store_hour_concat, new Object[]{aVar.mo84221L(bVar.mo119254e()), aVar.mo84221L(bVar.mo119256f())});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …ndTime)\n                )");
        return string;
    }
}
