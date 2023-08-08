package com.carrefour.fid.android.storelocator.p048ui.customview;

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

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/b;", "range", "", "a", "(Lcom/carrefour/fid/android/domain/models/service/models/b;)Ljava/lang/CharSequence;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.storelocator.ui.customview.StoreHourDayCell$updateCell$1 */
public final class StoreHourDayCell$updateCell$1 extends Lambda implements C11300l<C38147b, CharSequence> {
    final /* synthetic */ StoreHourDayCell this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreHourDayCell$updateCell$1(StoreHourDayCell storeHourDayCell) {
        super(1);
        this.this$0 = storeHourDayCell;
    }

    @C12579k
    /* renamed from: a */
    public final CharSequence invoke(@C12579k C38147b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C8970v.f24100k);
        Context context = this.this$0.getContext();
        C28932h.C28933a aVar = C28932h.f70914a;
        String string = context.getString(R.string.store_hour_concat, new Object[]{aVar.mo84221L(bVar.mo119254e()), aVar.mo84221L(bVar.mo119256f())});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …me)\n                    )");
        return string;
    }
}
