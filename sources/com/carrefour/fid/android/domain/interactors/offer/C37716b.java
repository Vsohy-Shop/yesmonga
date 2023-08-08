package com.carrefour.fid.android.domain.interactors.offer;

import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.AvailableType;
import com.carrefour.fid.android.domain.models.offer.UnavailableType;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.utils.C22719n;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.coroutines.C11045c;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "This is a TEMPORARY solution, the time that we migrate the screens with the use of inter module use cases.")
/* renamed from: com.carrefour.fid.android.domain.interactors.offer.b */
public interface C37716b {

    /* renamed from: com.carrefour.fid.android.domain.interactors.offer.b$a */
    public static final class C37717a {
        /* renamed from: a */
        public static /* synthetic */ Object m154589a(C37716b bVar, OfferModel offerModel, boolean z, Integer num, boolean z2, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                boolean z3 = (i & 2) != 0 ? false : z;
                if ((i & 4) != 0) {
                    num = null;
                }
                return bVar.mo114801j(offerModel, z3, num, (i & 8) != 0 ? false : z2, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addProductToBasket");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m154590b(C37716b bVar, List list, RequestType requestType, AvailableType availableType, UnavailableType unavailableType, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    requestType = RequestType.NONE;
                }
                RequestType requestType2 = requestType;
                if ((i & 4) != 0) {
                    availableType = AvailableType.WITH_DEPARTMENTS;
                }
                AvailableType availableType2 = availableType;
                if ((i & 8) != 0) {
                    unavailableType = UnavailableType.BOTTOM_AS_DEPARTMENT;
                }
                return bVar.mo114803l(list, requestType2, availableType2, unavailableType, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOfferListDetail");
        }

        /* renamed from: c */
        public static /* synthetic */ Object m154591c(C37716b bVar, OfferModel offerModel, Integer num, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    num = null;
                }
                return bVar.mo114796d(offerModel, num, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeProductFromBasket");
        }

        /* renamed from: d */
        public static /* synthetic */ void m154592d(C37716b bVar, RequestType requestType, RequestType requestType2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestType = RequestType.OFFLINE;
                }
                if ((i & 2) != 0) {
                    requestType2 = RequestType.OFFLINE;
                }
                bVar.mo114800i(requestType, requestType2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: synchronizeOfferList");
        }
    }

    @C12580l
    /* renamed from: a */
    Object mo114793a(@C12579k List<? extends OfferModel> list, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: b */
    Object mo114794b(@C12579k C11045c<? super Boolean> cVar);

    @C12580l
    /* renamed from: c */
    Object mo114795c(@C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: d */
    Object mo114796d(@C12579k OfferModel offerModel, @C12580l Integer num, @C12579k C11045c<? super Boolean> cVar);

    @C12580l
    /* renamed from: e */
    Object mo114797e(@C12579k OfferModel offerModel, @C12579k C11045c<? super Boolean> cVar);

    @C12579k
    /* renamed from: f */
    C11944n<Throwable> mo114798f();

    @C12580l
    /* renamed from: h */
    Object mo114799h(@C12579k C11045c<? super C11079d2> cVar);

    /* renamed from: i */
    void mo114800i(@C12580l RequestType requestType, @C12580l RequestType requestType2);

    @C12580l
    /* renamed from: j */
    Object mo114801j(@C12579k OfferModel offerModel, boolean z, @C12580l Integer num, boolean z2, @C12579k C11045c<? super Boolean> cVar);

    @C12580l
    /* renamed from: k */
    Object mo114802k(@C12579k OfferModel offerModel, @C12579k C11045c<? super Boolean> cVar);

    @C12580l
    /* renamed from: l */
    Object mo114803l(@C12579k List<String> list, @C12579k RequestType requestType, @C12579k AvailableType availableType, @C12579k UnavailableType unavailableType, @C12579k C11045c<? super C11079d2> cVar);

    @C12579k
    /* renamed from: m */
    C11944n<OfferModel> mo114804m();

    @C12580l
    /* renamed from: n */
    Object mo114805n(@C12579k C11045c<? super C11079d2> cVar);

    @C12579k
    /* renamed from: o */
    C11952u<C22719n<List<OfferModel>>> mo114806o();

    /* renamed from: p */
    void mo114807p(@C12579k OfferModel offerModel);

    @C12580l
    /* renamed from: q */
    Object mo114808q(@C12580l OfferModel offerModel, @C12579k C11045c<? super C11079d2> cVar);

    @C12579k
    /* renamed from: r */
    C11952u<C22719n<Basket>> mo114809r();
}
