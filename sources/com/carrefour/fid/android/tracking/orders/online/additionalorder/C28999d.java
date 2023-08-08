package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import com.carrefour.fid.android.presentation.models.OfferProductModel;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.d */
public interface C28999d {

    /* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.d$a */
    public static final class C29000a {
        /* renamed from: a */
        public static /* synthetic */ void m119978a(C28999d dVar, String str, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                }
                dVar.mo77645E(str, list);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackScreenResult");
        }
    }

    /* renamed from: E */
    void mo77645E(@C12580l String str, @C12579k List<? extends OfferProductModel> list);

    /* renamed from: J */
    void mo77647J(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i, int i2);

    /* renamed from: b */
    void mo77652b(@C12580l String str);

    /* renamed from: q */
    void mo77656q(@C12580l String str);
}
