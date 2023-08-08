package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyBenefitsModel;
import com.carrefour.fid.android.presentation.models.C38489h;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a */
public final class C26024a {
    @C12579k

    /* renamed from: a */
    public static final C26024a f63614a = new C26024a();

    /* renamed from: b */
    public static final int f63615b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$a */
    public interface C26025a extends C26048d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$a$a */
        public static final class C26026a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m111366a(@C12579k C26025a aVar) {
                return C26048d.C26050b.m111436a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$a$b */
        public static final class C26027b implements C26025a {

            /* renamed from: c */
            public static final int f63616c = 8;
            @C12579k

            /* renamed from: b */
            public final List<DataPrimeCmsResponse> f63617b;

            public C26027b(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "listPrimes");
                this.f63617b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C26027b m111367g(C26027b bVar, List<DataPrimeCmsResponse> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = bVar.f63617b;
                }
                return bVar.mo75522f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<DataPrimeCmsResponse> mo75520e() {
                return this.f63617b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26027b) && Intrinsics.areEqual((Object) this.f63617b, (Object) ((C26027b) obj).f63617b);
            }

            @C12579k
            /* renamed from: f */
            public final C26027b mo75522f(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "listPrimes");
                return new C26027b(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<DataPrimeCmsResponse> mo75523h() {
                return this.f63617b;
            }

            public int hashCode() {
                return this.f63617b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26026a.m111366a(this);
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f63617b;
                return "ListPrimeFidUi(listPrimes=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$a$c */
        public static final class C26028c implements C26025a {

            /* renamed from: c */
            public static final int f63618c = 0;

            /* renamed from: b */
            public final boolean f63619b;

            public C26028c() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26028c m111371g(C26028c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f63619b;
                }
                return cVar.mo75528f(z);
            }

            /* renamed from: e */
            public final boolean mo75526e() {
                return this.f63619b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26028c) && this.f63619b == ((C26028c) obj).f63619b;
            }

            @C12579k
            /* renamed from: f */
            public final C26028c mo75528f(boolean z) {
                return new C26028c(z);
            }

            public int hashCode() {
                boolean z = this.f63619b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f63619b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26026a.m111366a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f63619b;
                return "LoadingInValidateUi(isLoading=" + z + ")";
            }

            public C26028c(boolean z) {
                this.f63619b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26028c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$a$d */
        public static final class C26029d implements C26025a {

            /* renamed from: d */
            public static final int f63620d = 8;
            @C12579k

            /* renamed from: b */
            public final Pair<LoyaltyBenefitsModel, Boolean> f63621b;
            @C12580l

            /* renamed from: c */
            public final Integer f63622c;

            public C26029d(@C12579k Pair<? extends LoyaltyBenefitsModel, Boolean> pair, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(pair, "benefits");
                this.f63621b = pair;
                this.f63622c = num;
            }

            /* renamed from: h */
            public static /* synthetic */ C26029d m111374h(C26029d dVar, Pair<LoyaltyBenefitsModel, Boolean> pair, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    pair = dVar.f63621b;
                }
                if ((i & 2) != 0) {
                    num = dVar.f63622c;
                }
                return dVar.mo75535g(pair, num);
            }

            @C12579k
            /* renamed from: e */
            public final Pair<LoyaltyBenefitsModel, Boolean> mo75532e() {
                return this.f63621b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26029d)) {
                    return false;
                }
                C26029d dVar = (C26029d) obj;
                return Intrinsics.areEqual((Object) this.f63621b, (Object) dVar.f63621b) && Intrinsics.areEqual((Object) this.f63622c, (Object) dVar.f63622c);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo75534f() {
                return this.f63622c;
            }

            @C12579k
            /* renamed from: g */
            public final C26029d mo75535g(@C12579k Pair<? extends LoyaltyBenefitsModel, Boolean> pair, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(pair, "benefits");
                return new C26029d(pair, num);
            }

            public int hashCode() {
                int hashCode = this.f63621b.hashCode() * 31;
                Integer num = this.f63622c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            /* renamed from: i */
            public final Pair<LoyaltyBenefitsModel, Boolean> mo75537i() {
                return this.f63621b;
            }

            @C12580l
            /* renamed from: j */
            public final Integer mo75538j() {
                return this.f63622c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26026a.m111366a(this);
            }

            @C12579k
            public String toString() {
                Pair<LoyaltyBenefitsModel, Boolean> pair = this.f63621b;
                Integer num = this.f63622c;
                return "LoyaltyBenefitsUi(benefits=" + pair + ", stampsCount=" + num + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b */
    public interface C26030b extends C26048d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$a */
        public static final class C26031a implements C26030b {
            @C12579k

            /* renamed from: b */
            public static final C26031a f63623b = new C26031a();

            /* renamed from: c */
            public static final int f63624c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$b */
        public static final class C26032b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m111380a(@C12579k C26030b bVar) {
                return C26048d.C26050b.m111436a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$c */
        public static final class C26033c implements C26030b {

            /* renamed from: c */
            public static final int f63625c = 0;
            @C12579k

            /* renamed from: b */
            public final C38489h f63626b;

            public C26033c(@C12579k C38489h hVar) {
                Intrinsics.checkNotNullParameter(hVar, "deliveryThreshold");
                this.f63626b = hVar;
            }

            /* renamed from: g */
            public static /* synthetic */ C26033c m111381g(C26033c cVar, C38489h hVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    hVar = cVar.f63626b;
                }
                return cVar.mo75542f(hVar);
            }

            @C12579k
            /* renamed from: e */
            public final C38489h mo75540e() {
                return this.f63626b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26033c) && Intrinsics.areEqual((Object) this.f63626b, (Object) ((C26033c) obj).f63626b);
            }

            @C12579k
            /* renamed from: f */
            public final C26033c mo75542f(@C12579k C38489h hVar) {
                Intrinsics.checkNotNullParameter(hVar, "deliveryThreshold");
                return new C26033c(hVar);
            }

            @C12579k
            /* renamed from: h */
            public final C38489h mo75543h() {
                return this.f63626b;
            }

            public int hashCode() {
                return this.f63626b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }

            @C12579k
            public String toString() {
                C38489h hVar = this.f63626b;
                return "DeliveryThresholdUi(deliveryThreshold=" + hVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$d */
        public static final class C26034d implements C26030b {
            @C12579k

            /* renamed from: b */
            public static final C26034d f63627b = new C26034d();

            /* renamed from: c */
            public static final int f63628c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$e */
        public static final class C26035e implements C26030b {

            /* renamed from: c */
            public static final int f63629c = 8;
            @C12579k

            /* renamed from: b */
            public final Throwable f63630b;

            public C26035e(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f63630b = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C26035e m111385g(C26035e eVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = eVar.f63630b;
                }
                return eVar.mo75548f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo75546e() {
                return this.f63630b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26035e) && Intrinsics.areEqual((Object) this.f63630b, (Object) ((C26035e) obj).f63630b);
            }

            @C12579k
            /* renamed from: f */
            public final C26035e mo75548f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26035e(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo75549h() {
                return this.f63630b;
            }

            public int hashCode() {
                return this.f63630b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }

            @C12579k
            public String toString() {
                Throwable th = this.f63630b;
                return "ErrorBasket(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$f */
        public static final class C26036f implements C26030b {

            /* renamed from: c */
            public static final int f63631c = 8;
            @C12580l

            /* renamed from: b */
            public final List<OfferProductModel> f63632b;

            public C26036f(@C12580l List<? extends OfferProductModel> list) {
                this.f63632b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C26036f m111389g(C26036f fVar, List<OfferProductModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = fVar.f63632b;
                }
                return fVar.mo75554f(list);
            }

            @C12580l
            /* renamed from: e */
            public final List<OfferProductModel> mo75552e() {
                return this.f63632b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26036f) && Intrinsics.areEqual((Object) this.f63632b, (Object) ((C26036f) obj).f63632b);
            }

            @C12579k
            /* renamed from: f */
            public final C26036f mo75554f(@C12580l List<? extends OfferProductModel> list) {
                return new C26036f(list);
            }

            @C12580l
            /* renamed from: h */
            public final List<OfferProductModel> mo75555h() {
                return this.f63632b;
            }

            public int hashCode() {
                List<OfferProductModel> list = this.f63632b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }

            @C12579k
            public String toString() {
                List<OfferProductModel> list = this.f63632b;
                return "MostRelevantProductsUi(mostRelevantProducts=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$g */
        public static final class C26037g implements C26030b {

            /* renamed from: c */
            public static final int f63633c = 0;

            /* renamed from: b */
            public final int f63634b;

            public C26037g(int i) {
                this.f63634b = i;
            }

            /* renamed from: g */
            public static /* synthetic */ C26037g m111393g(C26037g gVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = gVar.f63634b;
                }
                return gVar.mo75560f(i);
            }

            /* renamed from: e */
            public final int mo75558e() {
                return this.f63634b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26037g) && this.f63634b == ((C26037g) obj).f63634b;
            }

            @C12579k
            /* renamed from: f */
            public final C26037g mo75560f(int i) {
                return new C26037g(i);
            }

            /* renamed from: h */
            public final int mo75561h() {
                return this.f63634b;
            }

            public int hashCode() {
                return Integer.hashCode(this.f63634b);
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }

            @C12579k
            public String toString() {
                int i = this.f63634b;
                return "NumberOfBaskets(numberOfBaskets=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$h */
        public static final class C26038h implements C26030b {

            /* renamed from: c */
            public static final int f63635c = 8;
            @C12579k

            /* renamed from: b */
            public final Throwable f63636b;

            public C26038h(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f63636b = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C26038h m111397g(C26038h hVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = hVar.f63636b;
                }
                return hVar.mo75566f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo75564e() {
                return this.f63636b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26038h) && Intrinsics.areEqual((Object) this.f63636b, (Object) ((C26038h) obj).f63636b);
            }

            @C12579k
            /* renamed from: f */
            public final C26038h mo75566f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26038h(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo75567h() {
                return this.f63636b;
            }

            public int hashCode() {
                return this.f63636b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }

            @C12579k
            public String toString() {
                Throwable th = this.f63636b;
                return "RecommendedProductsErrorUi(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$b$i */
        public static final class C26039i implements C26030b {

            /* renamed from: c */
            public static final int f63637c = 0;

            /* renamed from: b */
            public final boolean f63638b;

            public C26039i() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26039i m111401g(C26039i iVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = iVar.f63638b;
                }
                return iVar.mo75572f(z);
            }

            /* renamed from: e */
            public final boolean mo75570e() {
                return this.f63638b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26039i) && this.f63638b == ((C26039i) obj).f63638b;
            }

            @C12579k
            /* renamed from: f */
            public final C26039i mo75572f(boolean z) {
                return new C26039i(z);
            }

            public int hashCode() {
                boolean z = this.f63638b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f63638b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26032b.m111380a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f63638b;
                return "RecommendedProductsLoadingUi(isLoading=" + z + ")";
            }

            public C26039i(boolean z) {
                this.f63638b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26039i(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c */
    public interface C26040c extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$a */
        public static final class C26041a implements C26040c {

            /* renamed from: b */
            public static final int f63639b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63640a;

            public C26041a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63640a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26041a m111404c(C26041a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f63640a;
                }
                return aVar.mo75577b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75576a() {
                return this.f63640a;
            }

            @C12579k
            /* renamed from: b */
            public final C26041a mo75577b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26041a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo75578d() {
                return this.f63640a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26041a) && Intrinsics.areEqual((Object) this.f63640a, (Object) ((C26041a) obj).f63640a);
            }

            public int hashCode() {
                return this.f63640a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63640a;
                return "AnnounceAccessibility(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$b */
        public static final class C26042b implements C26040c {

            /* renamed from: b */
            public static final int f63641b = 0;

            /* renamed from: a */
            public final int f63642a;

            public C26042b(int i) {
                this.f63642a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C26042b m111408c(C26042b bVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f63642a;
                }
                return bVar.mo75583b(i);
            }

            /* renamed from: a */
            public final int mo75582a() {
                return this.f63642a;
            }

            @C12579k
            /* renamed from: b */
            public final C26042b mo75583b(int i) {
                return new C26042b(i);
            }

            /* renamed from: d */
            public final int mo75584d() {
                return this.f63642a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26042b) && this.f63642a == ((C26042b) obj).f63642a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f63642a);
            }

            @C12579k
            public String toString() {
                int i = this.f63642a;
                return "BasketContainAlcoholCheckboxNotChecked(basketContainAlcoholCheckboxIndex=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$c */
        public static final class C26043c implements C26040c {

            /* renamed from: b */
            public static final int f63643b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f63644a;

            public C26043c(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f63644a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26043c m111412c(C26043c cVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = cVar.f63644a;
                }
                return cVar.mo75589b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo75588a() {
                return this.f63644a;
            }

            @C12579k
            /* renamed from: b */
            public final C26043c mo75589b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26043c(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo75590d() {
                return this.f63644a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26043c) && Intrinsics.areEqual((Object) this.f63644a, (Object) ((C26043c) obj).f63644a);
            }

            public int hashCode() {
                return this.f63644a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f63644a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$d */
        public static final class C26044d implements C26040c {
            @C12579k

            /* renamed from: a */
            public static final C26044d f63645a = new C26044d();

            /* renamed from: b */
            public static final int f63646b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$e */
        public static final class C26045e implements C26040c {
            @C12579k

            /* renamed from: a */
            public static final C26045e f63647a = new C26045e();

            /* renamed from: b */
            public static final int f63648b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$f */
        public static final class C26046f implements C26040c {

            /* renamed from: d */
            public static final int f63649d = 8;
            @C12579k

            /* renamed from: a */
            public final BasketSlot f63650a;

            /* renamed from: b */
            public final float f63651b;
            @C12580l

            /* renamed from: c */
            public final String f63652c;

            public C26046f(@C12579k BasketSlot basketSlot, float f, @C12580l String str) {
                Intrinsics.checkNotNullParameter(basketSlot, "basketSlot");
                this.f63650a = basketSlot;
                this.f63651b = f;
                this.f63652c = str;
            }

            /* renamed from: e */
            public static /* synthetic */ C26046f m111416e(C26046f fVar, BasketSlot basketSlot, float f, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    basketSlot = fVar.f63650a;
                }
                if ((i & 2) != 0) {
                    f = fVar.f63651b;
                }
                if ((i & 4) != 0) {
                    str = fVar.f63652c;
                }
                return fVar.mo75597d(basketSlot, f, str);
            }

            @C12579k
            /* renamed from: a */
            public final BasketSlot mo75594a() {
                return this.f63650a;
            }

            /* renamed from: b */
            public final float mo75595b() {
                return this.f63651b;
            }

            @C12580l
            /* renamed from: c */
            public final String mo75596c() {
                return this.f63652c;
            }

            @C12579k
            /* renamed from: d */
            public final C26046f mo75597d(@C12579k BasketSlot basketSlot, float f, @C12580l String str) {
                Intrinsics.checkNotNullParameter(basketSlot, "basketSlot");
                return new C26046f(basketSlot, f, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26046f)) {
                    return false;
                }
                C26046f fVar = (C26046f) obj;
                return Intrinsics.areEqual((Object) this.f63650a, (Object) fVar.f63650a) && Float.compare(this.f63651b, fVar.f63651b) == 0 && Intrinsics.areEqual((Object) this.f63652c, (Object) fVar.f63652c);
            }

            @C12579k
            /* renamed from: f */
            public final BasketSlot mo75599f() {
                return this.f63650a;
            }

            @C12580l
            /* renamed from: g */
            public final String mo75600g() {
                return this.f63652c;
            }

            /* renamed from: h */
            public final float mo75601h() {
                return this.f63651b;
            }

            public int hashCode() {
                int hashCode = ((this.f63650a.hashCode() * 31) + Float.hashCode(this.f63651b)) * 31;
                String str = this.f63652c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @C12579k
            public String toString() {
                BasketSlot basketSlot = this.f63650a;
                float f = this.f63651b;
                String str = this.f63652c;
                return "NavigateToSelectSlot(basketSlot=" + basketSlot + ", totalAmount=" + f + ", facilityServiceId=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$g */
        public static final class C26047g implements C26040c {

            /* renamed from: b */
            public static final int f63653b = 8;
            @C12579k

            /* renamed from: a */
            public final SlotExpress f63654a;

            public C26047g(@C12579k SlotExpress slotExpress) {
                Intrinsics.checkNotNullParameter(slotExpress, "slotExpress");
                this.f63654a = slotExpress;
            }

            /* renamed from: c */
            public static /* synthetic */ C26047g m111424c(C26047g gVar, SlotExpress slotExpress, int i, Object obj) {
                if ((i & 1) != 0) {
                    slotExpress = gVar.f63654a;
                }
                return gVar.mo75605b(slotExpress);
            }

            @C12579k
            /* renamed from: a */
            public final SlotExpress mo75604a() {
                return this.f63654a;
            }

            @C12579k
            /* renamed from: b */
            public final C26047g mo75605b(@C12579k SlotExpress slotExpress) {
                Intrinsics.checkNotNullParameter(slotExpress, "slotExpress");
                return new C26047g(slotExpress);
            }

            @C12579k
            /* renamed from: d */
            public final SlotExpress mo75606d() {
                return this.f63654a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26047g) && Intrinsics.areEqual((Object) this.f63654a, (Object) ((C26047g) obj).f63654a);
            }

            public int hashCode() {
                return this.f63654a.hashCode();
            }

            @C12579k
            public String toString() {
                SlotExpress slotExpress = this.f63654a;
                return "UpdateSlotExpress(slotExpress=" + slotExpress + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$d */
    public interface C26048d extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$d$a */
        public static final class C26049a implements C26025a {

            /* renamed from: e */
            public static final int f63655e = 8;
            @C12579k

            /* renamed from: b */
            public final BasketDomain f63656b;
            @C12580l

            /* renamed from: c */
            public final C38162k f63657c;

            /* renamed from: d */
            public final boolean f63658d;

            public C26049a(@C12579k BasketDomain basketDomain, @C12580l C38162k kVar, boolean z) {
                Intrinsics.checkNotNullParameter(basketDomain, "basket");
                this.f63656b = basketDomain;
                this.f63657c = kVar;
                this.f63658d = z;
            }

            /* renamed from: i */
            public static /* synthetic */ C26049a m111428i(C26049a aVar, BasketDomain basketDomain, C38162k kVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    basketDomain = aVar.f63656b;
                }
                if ((i & 2) != 0) {
                    kVar = aVar.f63657c;
                }
                if ((i & 4) != 0) {
                    z = aVar.f63658d;
                }
                return aVar.mo75614h(basketDomain, kVar, z);
            }

            @C12579k
            /* renamed from: e */
            public final BasketDomain mo75610e() {
                return this.f63656b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26049a)) {
                    return false;
                }
                C26049a aVar = (C26049a) obj;
                return Intrinsics.areEqual((Object) this.f63656b, (Object) aVar.f63656b) && Intrinsics.areEqual((Object) this.f63657c, (Object) aVar.f63657c) && this.f63658d == aVar.f63658d;
            }

            @C12580l
            /* renamed from: f */
            public final C38162k mo75612f() {
                return this.f63657c;
            }

            /* renamed from: g */
            public final boolean mo75613g() {
                return this.f63658d;
            }

            @C12579k
            /* renamed from: h */
            public final C26049a mo75614h(@C12579k BasketDomain basketDomain, @C12580l C38162k kVar, boolean z) {
                Intrinsics.checkNotNullParameter(basketDomain, "basket");
                return new C26049a(basketDomain, kVar, z);
            }

            public int hashCode() {
                int hashCode = this.f63656b.hashCode() * 31;
                C38162k kVar = this.f63657c;
                int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
                boolean z = this.f63658d;
                if (z) {
                    z = true;
                }
                return hashCode2 + (z ? 1 : 0);
            }

            @C12579k
            /* renamed from: j */
            public final BasketDomain mo75616j() {
                return this.f63656b;
            }

            @C12580l
            /* renamed from: k */
            public final C38162k mo75617k() {
                return this.f63657c;
            }

            /* renamed from: l */
            public final boolean mo75618l() {
                return this.f63658d;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26025a.C26026a.m111366a(this);
            }

            @C12579k
            public String toString() {
                BasketDomain basketDomain = this.f63656b;
                C38162k kVar = this.f63657c;
                boolean z = this.f63658d;
                return "BasketUi(basket=" + basketDomain + ", serviceSelection=" + kVar + ", showPreparationFees=" + z + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$d$b */
        public static final class C26050b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m111436a(@C12579k C26048d dVar) {
                return C28505u.C28509d.C28510a.m118428a(dVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$d$c */
        public static final class C26051c implements C26030b {
            @C12579k

            /* renamed from: b */
            public static final C26051c f63659b = new C26051c();

            /* renamed from: c */
            public static final int f63660c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26030b.C26032b.m111380a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$d$d */
        public static final class C26052d implements C26048d {

            /* renamed from: d */
            public static final int f63661d = 8;
            @C12579k

            /* renamed from: b */
            public final List<OfferModel> f63662b;

            /* renamed from: c */
            public final boolean f63663c;

            public C26052d(@C12579k List<? extends OfferModel> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "listOffers");
                this.f63662b = list;
                this.f63663c = z;
            }

            /* renamed from: h */
            public static /* synthetic */ C26052d m111437h(C26052d dVar, List<OfferModel> list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f63662b;
                }
                if ((i & 2) != 0) {
                    z = dVar.f63663c;
                }
                return dVar.mo75623g(list, z);
            }

            @C12579k
            /* renamed from: e */
            public final List<OfferModel> mo75620e() {
                return this.f63662b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26052d)) {
                    return false;
                }
                C26052d dVar = (C26052d) obj;
                return Intrinsics.areEqual((Object) this.f63662b, (Object) dVar.f63662b) && this.f63663c == dVar.f63663c;
            }

            /* renamed from: f */
            public final boolean mo75622f() {
                return this.f63663c;
            }

            @C12579k
            /* renamed from: g */
            public final C26052d mo75623g(@C12579k List<? extends OfferModel> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "listOffers");
                return new C26052d(list, z);
            }

            public int hashCode() {
                int hashCode = this.f63662b.hashCode() * 31;
                boolean z = this.f63663c;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            /* renamed from: i */
            public final List<OfferModel> mo75625i() {
                return this.f63662b;
            }

            /* renamed from: j */
            public final boolean mo75626j() {
                return this.f63663c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26050b.m111436a(this);
            }

            @C12579k
            public String toString() {
                List<OfferModel> list = this.f63662b;
                boolean z = this.f63663c;
                return "OfferListUi(listOffers=" + list + ", isAntiInflationEnabled=" + z + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26052d(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$d$e */
        public static final class C26053e implements C26048d {

            /* renamed from: d */
            public static final int f63664d = 8;
            @C12579k

            /* renamed from: b */
            public final List<OfferModel> f63665b;
            @C12579k

            /* renamed from: c */
            public final BasketDomain f63666c;

            public C26053e(@C12579k List<? extends OfferModel> list, @C12579k BasketDomain basketDomain) {
                Intrinsics.checkNotNullParameter(list, "listOffers");
                Intrinsics.checkNotNullParameter(basketDomain, "basket");
                this.f63665b = list;
                this.f63666c = basketDomain;
            }

            /* renamed from: h */
            public static /* synthetic */ C26053e m111443h(C26053e eVar, List<OfferModel> list, BasketDomain basketDomain, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = eVar.f63665b;
                }
                if ((i & 2) != 0) {
                    basketDomain = eVar.f63666c;
                }
                return eVar.mo75631g(list, basketDomain);
            }

            @C12579k
            /* renamed from: e */
            public final List<OfferModel> mo75628e() {
                return this.f63665b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26053e)) {
                    return false;
                }
                C26053e eVar = (C26053e) obj;
                return Intrinsics.areEqual((Object) this.f63665b, (Object) eVar.f63665b) && Intrinsics.areEqual((Object) this.f63666c, (Object) eVar.f63666c);
            }

            @C12579k
            /* renamed from: f */
            public final BasketDomain mo75630f() {
                return this.f63666c;
            }

            @C12579k
            /* renamed from: g */
            public final C26053e mo75631g(@C12579k List<? extends OfferModel> list, @C12579k BasketDomain basketDomain) {
                Intrinsics.checkNotNullParameter(list, "listOffers");
                Intrinsics.checkNotNullParameter(basketDomain, "basket");
                return new C26053e(list, basketDomain);
            }

            public int hashCode() {
                return (this.f63665b.hashCode() * 31) + this.f63666c.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final BasketDomain mo75633i() {
                return this.f63666c;
            }

            @C12579k
            /* renamed from: j */
            public final List<OfferModel> mo75634j() {
                return this.f63665b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26050b.m111436a(this);
            }

            @C12579k
            public String toString() {
                List<OfferModel> list = this.f63665b;
                BasketDomain basketDomain = this.f63666c;
                return "OfferListUiWithBasket(listOffers=" + list + ", basket=" + basketDomain + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e */
    public interface C26054e extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$a */
        public static final class C26055a implements C26054e {

            /* renamed from: b */
            public static final int f63667b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63668a;

            public C26055a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63668a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26055a m111449c(C26055a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f63668a;
                }
                return aVar.mo75637b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75636a() {
                return this.f63668a;
            }

            @C12579k
            /* renamed from: b */
            public final C26055a mo75637b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26055a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo75638d() {
                return this.f63668a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26055a) && Intrinsics.areEqual((Object) this.f63668a, (Object) ((C26055a) obj).f63668a);
            }

            public int hashCode() {
                return this.f63668a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63668a;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$b */
        public static final class C26056b implements C26054e {

            /* renamed from: b */
            public static final int f63669b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63670a;

            public C26056b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63670a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26056b m111453c(C26056b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f63670a;
                }
                return bVar.mo75643b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75642a() {
                return this.f63670a;
            }

            @C12579k
            /* renamed from: b */
            public final C26056b mo75643b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26056b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo75644d() {
                return this.f63670a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26056b) && Intrinsics.areEqual((Object) this.f63670a, (Object) ((C26056b) obj).f63670a);
            }

            public int hashCode() {
                return this.f63670a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63670a;
                return "AddProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$c */
        public static final class C26057c implements C26054e {

            /* renamed from: b */
            public static final int f63671b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63672a;

            public C26057c(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63672a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26057c m111457c(C26057c cVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f63672a;
                }
                return cVar.mo75649b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75648a() {
                return this.f63672a;
            }

            @C12579k
            /* renamed from: b */
            public final C26057c mo75649b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26057c(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo75650d() {
                return this.f63672a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26057c) && Intrinsics.areEqual((Object) this.f63672a, (Object) ((C26057c) obj).f63672a);
            }

            public int hashCode() {
                return this.f63672a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63672a;
                return "AddRecommendedProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$d */
        public static final class C26058d implements C26054e {

            /* renamed from: b */
            public static final int f63673b = 0;

            /* renamed from: a */
            public final boolean f63674a;

            public C26058d(boolean z) {
                this.f63674a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26058d m111461c(C26058d dVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f63674a;
                }
                return dVar.mo75655b(z);
            }

            /* renamed from: a */
            public final boolean mo75654a() {
                return this.f63674a;
            }

            @C12579k
            /* renamed from: b */
            public final C26058d mo75655b(boolean z) {
                return new C26058d(z);
            }

            /* renamed from: d */
            public final boolean mo75656d() {
                return this.f63674a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26058d) && this.f63674a == ((C26058d) obj).f63674a;
            }

            public int hashCode() {
                boolean z = this.f63674a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f63674a;
                return "BasketContainAlcoholCheckedChange(isChecked=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$e */
        public static final class C26059e implements C26054e {

            /* renamed from: b */
            public static final int f63675b = 0;
            @C12579k

            /* renamed from: a */
            public final C11289a<C11079d2> f63676a;

            public C26059e(@C12579k C11289a<C11079d2> aVar) {
                Intrinsics.checkNotNullParameter(aVar, "onCheckDone");
                this.f63676a = aVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C26059e m111465c(C26059e eVar, C11289a<C11079d2> aVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar = eVar.f63676a;
                }
                return eVar.mo75661b(aVar);
            }

            @C12579k
            /* renamed from: a */
            public final C11289a<C11079d2> mo75660a() {
                return this.f63676a;
            }

            @C12579k
            /* renamed from: b */
            public final C26059e mo75661b(@C12579k C11289a<C11079d2> aVar) {
                Intrinsics.checkNotNullParameter(aVar, "onCheckDone");
                return new C26059e(aVar);
            }

            @C12579k
            /* renamed from: d */
            public final C11289a<C11079d2> mo75662d() {
                return this.f63676a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26059e) && Intrinsics.areEqual((Object) this.f63676a, (Object) ((C26059e) obj).f63676a);
            }

            public int hashCode() {
                return this.f63676a.hashCode();
            }

            @C12579k
            public String toString() {
                C11289a<C11079d2> aVar = this.f63676a;
                return "CheckDeliveryFacilityService(onCheckDone=" + aVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$f */
        public static final class C26060f implements C26054e {
            @C12579k

            /* renamed from: a */
            public static final C26060f f63677a = new C26060f();

            /* renamed from: b */
            public static final int f63678b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$g */
        public static final class C26061g implements C26054e {
            @C12579k

            /* renamed from: a */
            public static final C26061g f63679a = new C26061g();

            /* renamed from: b */
            public static final int f63680b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$h */
        public static final class C26062h implements C26054e {

            /* renamed from: b */
            public static final int f63681b = 0;

            /* renamed from: a */
            public final boolean f63682a;

            public C26062h(boolean z) {
                this.f63682a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26062h m111469c(C26062h hVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = hVar.f63682a;
                }
                return hVar.mo75667b(z);
            }

            /* renamed from: a */
            public final boolean mo75666a() {
                return this.f63682a;
            }

            @C12579k
            /* renamed from: b */
            public final C26062h mo75667b(boolean z) {
                return new C26062h(z);
            }

            /* renamed from: d */
            public final boolean mo75668d() {
                return this.f63682a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26062h) && this.f63682a == ((C26062h) obj).f63682a;
            }

            public int hashCode() {
                boolean z = this.f63682a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f63682a;
                return "ExpandUnavailableProducts(isExpanded=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$i */
        public static final class C26063i implements C26054e {
            @C12579k

            /* renamed from: a */
            public static final C26063i f63683a = new C26063i();

            /* renamed from: b */
            public static final int f63684b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$j */
        public static final class C26064j implements C26054e {

            /* renamed from: b */
            public static final int f63685b = 8;
            @C12580l

            /* renamed from: a */
            public final OfferProductModel f63686a;

            public C26064j() {
                this((OfferProductModel) null, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C26064j m111473c(C26064j jVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = jVar.f63686a;
                }
                return jVar.mo75673b(offerProductModel);
            }

            @C12580l
            /* renamed from: a */
            public final OfferProductModel mo75672a() {
                return this.f63686a;
            }

            @C12579k
            /* renamed from: b */
            public final C26064j mo75673b(@C12580l OfferProductModel offerProductModel) {
                return new C26064j(offerProductModel);
            }

            @C12580l
            /* renamed from: d */
            public final OfferProductModel mo75674d() {
                return this.f63686a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26064j) && Intrinsics.areEqual((Object) this.f63686a, (Object) ((C26064j) obj).f63686a);
            }

            public int hashCode() {
                OfferProductModel offerProductModel = this.f63686a;
                if (offerProductModel == null) {
                    return 0;
                }
                return offerProductModel.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63686a;
                return "RefreshBasketFromCache(offerForAccessibility=" + offerProductModel + ")";
            }

            public C26064j(@C12580l OfferProductModel offerProductModel) {
                this.f63686a = offerProductModel;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26064j(OfferProductModel offerProductModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : offerProductModel);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$k */
        public static final class C26065k implements C26054e {

            /* renamed from: c */
            public static final int f63687c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63688a;
            @C12580l

            /* renamed from: b */
            public final Integer f63689b;

            public C26065k(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63688a = offerProductModel;
                this.f63689b = num;
            }

            /* renamed from: d */
            public static /* synthetic */ C26065k m111477d(C26065k kVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = kVar.f63688a;
                }
                if ((i & 2) != 0) {
                    num = kVar.f63689b;
                }
                return kVar.mo75680c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75678a() {
                return this.f63688a;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo75679b() {
                return this.f63689b;
            }

            @C12579k
            /* renamed from: c */
            public final C26065k mo75680c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26065k(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo75681e() {
                return this.f63688a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26065k)) {
                    return false;
                }
                C26065k kVar = (C26065k) obj;
                return Intrinsics.areEqual((Object) this.f63688a, (Object) kVar.f63688a) && Intrinsics.areEqual((Object) this.f63689b, (Object) kVar.f63689b);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo75683f() {
                return this.f63689b;
            }

            public int hashCode() {
                int hashCode = this.f63688a.hashCode() * 31;
                Integer num = this.f63689b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63688a;
                Integer num = this.f63689b;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26065k(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$l */
        public static final class C26066l implements C26054e {

            /* renamed from: b */
            public static final int f63690b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63691a;

            public C26066l(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63691a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26066l m111483c(C26066l lVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = lVar.f63691a;
                }
                return lVar.mo75687b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75686a() {
                return this.f63691a;
            }

            @C12579k
            /* renamed from: b */
            public final C26066l mo75687b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26066l(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo75688d() {
                return this.f63691a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26066l) && Intrinsics.areEqual((Object) this.f63691a, (Object) ((C26066l) obj).f63691a);
            }

            public int hashCode() {
                return this.f63691a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63691a;
                return "RemoveProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$m */
        public static final class C26067m implements C26054e {

            /* renamed from: b */
            public static final int f63692b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63693a;

            public C26067m(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63693a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26067m m111487c(C26067m mVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = mVar.f63693a;
                }
                return mVar.mo75693b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75692a() {
                return this.f63693a;
            }

            @C12579k
            /* renamed from: b */
            public final C26067m mo75693b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26067m(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo75694d() {
                return this.f63693a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26067m) && Intrinsics.areEqual((Object) this.f63693a, (Object) ((C26067m) obj).f63693a);
            }

            public int hashCode() {
                return this.f63693a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63693a;
                return "RemoveRecommendedProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$n */
        public static final class C26068n implements C26054e {
            @C12579k

            /* renamed from: a */
            public static final C26068n f63694a = new C26068n();

            /* renamed from: b */
            public static final int f63695b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$o */
        public static final class C26069o implements C26054e {
            @C12579k

            /* renamed from: a */
            public static final C26069o f63696a = new C26069o();

            /* renamed from: b */
            public static final int f63697b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$p */
        public static final class C26070p implements C26054e {

            /* renamed from: c */
            public static final int f63698c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63699a;

            /* renamed from: b */
            public final int f63700b;

            public C26070p(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63699a = offerProductModel;
                this.f63700b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C26070p m111491d(C26070p pVar, OfferProductModel offerProductModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = pVar.f63699a;
                }
                if ((i2 & 2) != 0) {
                    i = pVar.f63700b;
                }
                return pVar.mo75700c(offerProductModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75698a() {
                return this.f63699a;
            }

            /* renamed from: b */
            public final int mo75699b() {
                return this.f63700b;
            }

            @C12579k
            /* renamed from: c */
            public final C26070p mo75700c(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26070p(offerProductModel, i);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo75701e() {
                return this.f63699a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26070p)) {
                    return false;
                }
                C26070p pVar = (C26070p) obj;
                return Intrinsics.areEqual((Object) this.f63699a, (Object) pVar.f63699a) && this.f63700b == pVar.f63700b;
            }

            /* renamed from: f */
            public final int mo75703f() {
                return this.f63700b;
            }

            public int hashCode() {
                return (this.f63699a.hashCode() * 31) + Integer.hashCode(this.f63700b);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63699a;
                int i = this.f63700b;
                return "SendBasketChangedCriteoEvent(offerProductModel=" + offerProductModel + ", quantity=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$q */
        public static final class C26071q implements C26054e {

            /* renamed from: b */
            public static final int f63701b = 0;
            @C12580l

            /* renamed from: a */
            public final String f63702a;

            public C26071q(@C12580l String str) {
                this.f63702a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26071q m111497c(C26071q qVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = qVar.f63702a;
                }
                return qVar.mo75707b(str);
            }

            @C12580l
            /* renamed from: a */
            public final String mo75706a() {
                return this.f63702a;
            }

            @C12579k
            /* renamed from: b */
            public final C26071q mo75707b(@C12580l String str) {
                return new C26071q(str);
            }

            @C12580l
            /* renamed from: d */
            public final String mo75708d() {
                return this.f63702a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26071q) && Intrinsics.areEqual((Object) this.f63702a, (Object) ((C26071q) obj).f63702a);
            }

            public int hashCode() {
                String str = this.f63702a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f63702a;
                return "SendCriteoTracking(url=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$r */
        public static final class C26072r implements C26054e {
            @C12579k

            /* renamed from: a */
            public static final C26072r f63703a = new C26072r();

            /* renamed from: b */
            public static final int f63704b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$s */
        public static final class C26073s implements C26054e {
            @C12579k

            /* renamed from: a */
            public static final C26073s f63705a = new C26073s();

            /* renamed from: b */
            public static final int f63706b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$e$t */
        public static final class C26074t implements C26054e {

            /* renamed from: b */
            public static final int f63707b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f63708a;

            public C26074t(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f63708a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26074t m111501c(C26074t tVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = tVar.f63708a;
                }
                return tVar.mo75713b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo75712a() {
                return this.f63708a;
            }

            @C12579k
            /* renamed from: b */
            public final C26074t mo75713b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26074t(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo75714d() {
                return this.f63708a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26074t) && Intrinsics.areEqual((Object) this.f63708a, (Object) ((C26074t) obj).f63708a);
            }

            public int hashCode() {
                return this.f63708a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f63708a;
                return "TrackProductClick(offerProductModel=" + offerProductModel + ")";
            }
        }
    }
}
