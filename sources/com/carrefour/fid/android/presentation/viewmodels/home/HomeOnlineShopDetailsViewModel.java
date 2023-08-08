package com.carrefour.fid.android.presentation.viewmodels.home;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.offer.AvailableType;
import com.carrefour.fid.android.domain.models.offer.UnavailableType;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26630a;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26631b;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26636c;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.utils.C22719n;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeOnlineShopDetailsViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/offer/state/c;", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeOnlineShopDetailsViewModel$a;", "intent", "Lkotlin/d2;", "g0", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeOnlineShopDetailsViewModel$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basketDomain", "f0", "(Lcom/carrefour/fid/android/domain/models/BasketDomain;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/offer/b;", "a", "Lcom/carrefour/fid/android/domain/interactors/offer/b;", "offerListAndBasketController", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/offer/b;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nHomeOnlineShopDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeOnlineShopDetailsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomeOnlineShopDetailsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1603#2,9:58\n1855#2:67\n1856#2:69\n1612#2:70\n1#3:68\n*S KotlinDebug\n*F\n+ 1 HomeOnlineShopDetailsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/home/HomeOnlineShopDetailsViewModel\n*L\n50#1:58,9\n50#1:67\n50#1:69\n50#1:70\n50#1:68\n*E\n"})
public final class HomeOnlineShopDetailsViewModel extends BaseMVIViewModel<C26636c, C26373a> {

    /* renamed from: b */
    public static final int f64406b = 8;
    @C12579k

    /* renamed from: a */
    public final C37716b f64407a;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomeOnlineShopDetailsViewModel$1", mo22502f = "HomeOnlineShopDetailsViewModel.kt", mo22503i = {}, mo22504l = {34}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.HomeOnlineShopDetailsViewModel$1 */
    public static final class C263711 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ HomeOnlineShopDetailsViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C263711(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11952u<C22719n<List<OfferModel>>> o = this.this$0.f64407a.mo114806o();
                final HomeOnlineShopDetailsViewModel homeOnlineShopDetailsViewModel = this.this$0;
                C263721 r1 = new C11304p<List<? extends OfferModel>, C11045c<? super C11079d2>, Object>((C11045c<? super C263721>) null) {
                    /* synthetic */ Object L$0;
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        C263721 r0 = 

                        @C8567o(parameters = 0)
                        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.HomeOnlineShopDetailsViewModel$a */
                        public static abstract class C26373a implements C28505u.C28507b {

                            /* renamed from: a */
                            public static final int f64408a = 0;

                            @C8567o(parameters = 0)
                            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.HomeOnlineShopDetailsViewModel$a$a */
                            public static final class C26374a extends C26373a {

                                /* renamed from: c */
                                public static final int f64409c = 8;
                                @C12579k

                                /* renamed from: b */
                                public final BasketDomain f64410b;

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                public C26374a(@C12579k BasketDomain basketDomain) {
                                    super((DefaultConstructorMarker) null);
                                    Intrinsics.checkNotNullParameter(basketDomain, "basketDomain");
                                    this.f64410b = basketDomain;
                                }

                                /* renamed from: c */
                                public static /* synthetic */ C26374a m112569c(C26374a aVar, BasketDomain basketDomain, int i, Object obj) {
                                    if ((i & 1) != 0) {
                                        basketDomain = aVar.f64410b;
                                    }
                                    return aVar.mo76725b(basketDomain);
                                }

                                @C12579k
                                /* renamed from: a */
                                public final BasketDomain mo76724a() {
                                    return this.f64410b;
                                }

                                @C12579k
                                /* renamed from: b */
                                public final C26374a mo76725b(@C12579k BasketDomain basketDomain) {
                                    Intrinsics.checkNotNullParameter(basketDomain, "basketDomain");
                                    return new C26374a(basketDomain);
                                }

                                @C12579k
                                /* renamed from: d */
                                public final BasketDomain mo76726d() {
                                    return this.f64410b;
                                }

                                public boolean equals(@C12580l Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C26374a) && Intrinsics.areEqual((Object) this.f64410b, (Object) ((C26374a) obj).f64410b);
                                }

                                public int hashCode() {
                                    return this.f64410b.hashCode();
                                }

                                @C12579k
                                public String toString() {
                                    BasketDomain basketDomain = this.f64410b;
                                    return "Load(basketDomain=" + basketDomain + ")";
                                }
                            }

                            public /* synthetic */ C26373a(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public C26373a() {
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        @Inject
                        public HomeOnlineShopDetailsViewModel(@C12579k C37716b bVar) {
                            super(C26636c.f65043e.mo77402a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
                            Intrinsics.checkNotNullParameter(bVar, "offerListAndBasketController");
                            this.f64407a = bVar;
                            C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C263711(this, (C11045c<? super C263711>) null), 3, (Object) null);
                        }

                        /* renamed from: f0 */
                        public final Object mo76720f0(BasketDomain basketDomain, C11045c<? super C11079d2> cVar) {
                            ArrayList arrayList;
                            String str;
                            C26630a.m113214a(this, C26631b.C26634c.f65039c);
                            C37716b bVar = this.f64407a;
                            List<BasketOfferDomain> B = basketDomain.mo115459B();
                            if (B != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (BasketOfferDomain A : B) {
                                    ProductDomain A2 = A.mo115540A();
                                    if (A2 != null) {
                                        str = A2.mo116544s();
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        arrayList2.add(str);
                                    }
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = CollectionsKt__CollectionsKt.m40441E();
                            }
                            Object l = bVar.mo114803l(arrayList, RequestType.OFFLINE, AvailableType.DEFAULT, UnavailableType.DEFAULT, cVar);
                            if (l == C11063b.m42612h()) {
                                return l;
                            }
                            return C11079d2.f28267a;
                        }

                        @C12580l
                        /* renamed from: g0 */
                        public Object processIntent(@C12579k C26373a aVar, @C12579k C11045c<? super C11079d2> cVar) {
                            if (!(aVar instanceof C26373a.C26374a)) {
                                return C11079d2.f28267a;
                            }
                            Object f0 = mo76720f0(((C26373a.C26374a) aVar).mo76726d(), cVar);
                            if (f0 == C11063b.m42612h()) {
                                return f0;
                            }
                            return C11079d2.f28267a;
                        }
                    }
