package com.carrefour.fid.android.domain.interactors.product.list;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.BasketOfferPriceDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nUpdateOfferListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateOfferListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/list/UpdateOfferListUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n800#2,11:94\n1855#2,2:105\n800#2,11:107\n1855#2:118\n800#2,11:119\n1855#2,2:130\n1856#2:132\n1#3:133\n*S KotlinDebug\n*F\n+ 1 UpdateOfferListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/list/UpdateOfferListUseCase\n*L\n34#1:94,11\n34#1:105,2\n37#1:107,11\n37#1:118\n38#1:119,11\n38#1:130,2\n37#1:132\n*E\n"})
public final class UpdateOfferListUseCase implements C37679f<C37768a, List<? extends OfferModel>> {

    /* renamed from: c */
    public static final int f94794c = 8;
    @C12579k

    /* renamed from: a */
    public final C37681b f94795a;
    @C12579k

    /* renamed from: b */
    public final C37566e0 f94796b;

    @Inject
    public UpdateOfferListUseCase(@C12579k C37681b bVar, @C12579k C37566e0 e0Var) {
        Intrinsics.checkNotNullParameter(bVar, "getShoppingListUseCase");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        this.f94795a = bVar;
        this.f94796b = e0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115088b(com.carrefour.fid.android.core.types.RequestType r6, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$getShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$getShoppingList$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$getShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$getShoppingList$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$getShoppingList$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0048
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.C11661u0.m45747n(r7)
            if (r6 == 0) goto L_0x0052
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.b r7 = r5.f94795a
            r0.label = r4
            java.lang.Object r6 = r7.m172966invokegIAlus(r6, r0)
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            boolean r7 = kotlin.Result.m38709i(r6)
            if (r7 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r3 = r6
        L_0x0050:
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r3 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r3
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase.mo115088b(com.carrefour.fid.android.core.types.RequestType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1 A[LOOP:1: B:41:0x00cb->B:43:0x00d1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172991invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase.C37768a r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.presentation.models.OfferModel>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            java.lang.Object r9 = r0.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase r0 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x009a
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0047:
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0075
        L_0x0053:
            kotlin.C11661u0.m45747n(r10)
            java.util.List r10 = r9.mo115094e()
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.List r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r10)
            com.carrefour.fid.android.core.types.RequestType r9 = r9.mo115096f()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r9 = r8.mo115088b(r9, r0)
            if (r9 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r2 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0075:
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r10 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r10
            if (r10 == 0) goto L_0x007e
            java.util.List r10 = r10.mo117697e()
            goto L_0x007f
        L_0x007e:
            r10 = r5
        L_0x007f:
            if (r10 != 0) goto L_0x0085
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0085:
            com.carrefour.fid.android.domain.interactors.basket.e0 r4 = r2.f94796b
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r3
            java.lang.Object r0 = r4.m172965invokeIoAF18A(r0)
            if (r0 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r2
        L_0x009a:
            boolean r2 = kotlin.Result.m38709i(r10)
            if (r2 == 0) goto L_0x00a1
            r10 = r5
        L_0x00a1:
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10
            if (r10 == 0) goto L_0x00a9
            com.carrefour.fid.android.domain.models.BasketDomain r5 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r10)
        L_0x00a9:
            r10 = r1
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r10.iterator()
        L_0x00b5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c7
            java.lang.Object r4 = r3.next()
            boolean r6 = r4 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r6 == 0) goto L_0x00b5
            r2.add(r4)
            goto L_0x00b5
        L_0x00c7:
            java.util.Iterator r2 = r2.iterator()
        L_0x00cb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r2.next()
            com.carrefour.fid.android.presentation.models.OfferProductModel r3 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r3
            r0.mo115090d(r3, r5, r9)
            goto L_0x00cb
        L_0x00db:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e4:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r3 = r10.next()
            boolean r4 = r3 instanceof com.carrefour.fid.android.presentation.models.OfferUnavailableModel
            if (r4 == 0) goto L_0x00e4
            r2.add(r3)
            goto L_0x00e4
        L_0x00f6:
            java.util.Iterator r10 = r2.iterator()
        L_0x00fa:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x013b
            java.lang.Object r2 = r10.next()
            com.carrefour.fid.android.presentation.models.OfferUnavailableModel r2 = (com.carrefour.fid.android.presentation.models.OfferUnavailableModel) r2
            java.util.List r2 = r2.mo121760e()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0115:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0127
            java.lang.Object r4 = r2.next()
            boolean r6 = r4 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r6 == 0) goto L_0x0115
            r3.add(r4)
            goto L_0x0115
        L_0x0127:
            java.util.Iterator r2 = r3.iterator()
        L_0x012b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r3 = r2.next()
            com.carrefour.fid.android.presentation.models.OfferProductModel r3 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r3
            r0.mo115090d(r3, r5, r9)
            goto L_0x012b
        L_0x013b:
            com.carrefour.fid.android.presentation.models.extension.C38476l.m159640c(r1)
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.Result.m38702b(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase.m172991invokegIAlus(com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final OfferProductModel mo115090d(OfferProductModel offerProductModel, BasketDomain basketDomain, List<? extends C38033d> list) {
        BasketOfferDomain basketOfferDomain;
        Double d;
        List<BasketOfferDomain> B;
        Object obj;
        String str;
        String str2;
        offerProductModel.mo121500N1(OfferProductModelKt.m159552A(offerProductModel, list));
        Double d2 = null;
        if (basketDomain == null || (B = basketDomain.mo115459B()) == null) {
            basketOfferDomain = null;
        } else {
            Iterator it = B.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                OfferIdentifierDomain s = ((BasketOfferDomain) obj).mo115567s();
                if (s != null) {
                    str = s.mo115986f();
                } else {
                    str = null;
                }
                ProductModel o0 = offerProductModel.mo121517o0();
                if (o0 != null) {
                    str2 = o0.mo121889s();
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual((Object) str, (Object) str2)) {
                    break;
                }
            }
            basketOfferDomain = (BasketOfferDomain) obj;
        }
        if (basketOfferDomain != null) {
            offerProductModel.mo121513j2(basketOfferDomain.mo115541B());
            offerProductModel.mo121501Q1(basketOfferDomain.mo115568t());
            offerProductModel.mo121504Y1(basketOfferDomain.mo115570u());
            offerProductModel.mo121506a2(basketOfferDomain.mo115572w());
            offerProductModel.mo121512i2(basketOfferDomain.mo115576z());
            offerProductModel.mo121740e2(basketOfferDomain.mo115574x());
            OfferPriceDomain m0 = offerProductModel.mo121514m0();
            if (m0 != null) {
                BasketOfferPriceDomain y = basketOfferDomain.mo115575y();
                if (y != null) {
                    d = y.mo115605i();
                } else {
                    d = null;
                }
                m0.mo116008m(d);
                BasketOfferPriceDomain y2 = basketOfferDomain.mo115575y();
                if (y2 != null) {
                    d2 = y2.mo115606j();
                }
                m0.mo116009n(d2);
            }
        } else {
            offerProductModel.mo121513j2(0);
            offerProductModel.mo121501Q1(offerProductModel.mo121503X());
            offerProductModel.mo121504Y1(offerProductModel.mo121508f0());
            offerProductModel.mo121506a2(offerProductModel.mo121510h0());
            offerProductModel.mo121512i2((Double) null);
            OfferPriceDomain m02 = offerProductModel.mo121514m0();
            if (m02 != null) {
                m02.mo116008m((Double) null);
                m02.mo116009n((Double) null);
            }
        }
        return offerProductModel;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.list.UpdateOfferListUseCase$a */
    public static final class C37768a {

        /* renamed from: c */
        public static final int f94797c = 8;
        @C12579k

        /* renamed from: a */
        public final List<OfferModel> f94798a;
        @C12580l

        /* renamed from: b */
        public final RequestType f94799b;

        public C37768a(@C12579k List<? extends OfferModel> list, @C12580l RequestType requestType) {
            Intrinsics.checkNotNullParameter(list, "offerList");
            this.f94798a = list;
            this.f94799b = requestType;
        }

        /* renamed from: d */
        public static /* synthetic */ C37768a m154838d(C37768a aVar, List<OfferModel> list, RequestType requestType, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f94798a;
            }
            if ((i & 2) != 0) {
                requestType = aVar.f94799b;
            }
            return aVar.mo115093c(list, requestType);
        }

        @C12579k
        /* renamed from: a */
        public final List<OfferModel> mo115091a() {
            return this.f94798a;
        }

        @C12580l
        /* renamed from: b */
        public final RequestType mo115092b() {
            return this.f94799b;
        }

        @C12579k
        /* renamed from: c */
        public final C37768a mo115093c(@C12579k List<? extends OfferModel> list, @C12580l RequestType requestType) {
            Intrinsics.checkNotNullParameter(list, "offerList");
            return new C37768a(list, requestType);
        }

        @C12579k
        /* renamed from: e */
        public final List<OfferModel> mo115094e() {
            return this.f94798a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37768a)) {
                return false;
            }
            C37768a aVar = (C37768a) obj;
            return Intrinsics.areEqual((Object) this.f94798a, (Object) aVar.f94798a) && this.f94799b == aVar.f94799b;
        }

        @C12580l
        /* renamed from: f */
        public final RequestType mo115096f() {
            return this.f94799b;
        }

        public int hashCode() {
            int hashCode = this.f94798a.hashCode() * 31;
            RequestType requestType = this.f94799b;
            return hashCode + (requestType == null ? 0 : requestType.hashCode());
        }

        @C12579k
        public String toString() {
            List<OfferModel> list = this.f94798a;
            RequestType requestType = this.f94799b;
            return "Params(offerList=" + list + ", shoppingListRequestType=" + requestType + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37768a(List list, RequestType requestType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? RequestType.NONE : requestType);
        }
    }
}
