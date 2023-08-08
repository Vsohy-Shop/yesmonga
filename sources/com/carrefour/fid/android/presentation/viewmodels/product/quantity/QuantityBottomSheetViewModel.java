package com.carrefour.fid.android.presentation.viewmodels.product.quantity;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\t\u000e\u000fB\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/product/quantity/QuantityBottomSheetViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/product/quantity/QuantityBottomSheetViewModel$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/product/quantity/QuantityBottomSheetViewModel$c;", "intent", "Lkotlin/d2;", "d0", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/quantity/QuantityBottomSheetViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/offer/b;", "a", "Lcom/carrefour/fid/android/domain/interactors/offer/b;", "offerListAndBasketController", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/offer/b;)V", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class QuantityBottomSheetViewModel extends BaseMVIViewModel<C27233a, C27238c> {

    /* renamed from: b */
    public static final int f66185b = 8;
    @C12579k

    /* renamed from: a */
    public final C37716b f66186a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$a */
    public static final class C27233a implements C28505u.C28509d {
        @C12579k

        /* renamed from: c */
        public static final C27234a f66187c = new C27234a((DefaultConstructorMarker) null);

        /* renamed from: d */
        public static final int f66188d = 0;
        @C12579k

        /* renamed from: e */
        public static final C27233a f66189e = new C27233a(0);

        /* renamed from: b */
        public final int f66190b;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$a$a */
        public static final class C27234a {
            public /* synthetic */ C27234a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C27233a mo79223a() {
                return C27233a.f66189e;
            }

            public C27234a() {
            }
        }

        public C27233a(int i) {
            this.f66190b = i;
        }

        /* renamed from: h */
        public static /* synthetic */ C27233a m114964h(C27233a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f66190b;
            }
            return aVar.mo79219g(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27233a) && this.f66190b == ((C27233a) obj).f66190b;
        }

        /* renamed from: f */
        public final int mo79218f() {
            return this.f66190b;
        }

        @C12579k
        /* renamed from: g */
        public final C27233a mo79219g(int i) {
            return new C27233a(i);
        }

        public int hashCode() {
            return Integer.hashCode(this.f66190b);
        }

        /* renamed from: i */
        public final int mo79221i() {
            return this.f66190b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            int i = this.f66190b;
            return "UIState(basketCount=" + i + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$b */
    public interface C27235b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$b$a */
        public static final class C27236a implements C27235b {
            @C12579k

            /* renamed from: a */
            public static final C27236a f66191a = new C27236a();

            /* renamed from: b */
            public static final int f66192b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$b$b */
        public static final class C27237b implements C27235b {
            @C12579k

            /* renamed from: a */
            public static final C27237b f66193a = new C27237b();

            /* renamed from: b */
            public static final int f66194b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$c */
    public interface C27238c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$c$a */
        public static final class C27239a implements C27238c {

            /* renamed from: d */
            public static final int f66195d = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66196a;

            /* renamed from: b */
            public final int f66197b;
            @C12579k

            /* renamed from: c */
            public final BasketType f66198c;

            public C27239a(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                this.f66196a = offerProductModel;
                this.f66197b = i;
                this.f66198c = basketType;
            }

            /* renamed from: e */
            public static /* synthetic */ C27239a m114969e(C27239a aVar, OfferProductModel offerProductModel, int i, BasketType basketType, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = aVar.f66196a;
                }
                if ((i2 & 2) != 0) {
                    i = aVar.f66197b;
                }
                if ((i2 & 4) != 0) {
                    basketType = aVar.f66198c;
                }
                return aVar.mo79227d(offerProductModel, i, basketType);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79224a() {
                return this.f66196a;
            }

            /* renamed from: b */
            public final int mo79225b() {
                return this.f66197b;
            }

            @C12579k
            /* renamed from: c */
            public final BasketType mo79226c() {
                return this.f66198c;
            }

            @C12579k
            /* renamed from: d */
            public final C27239a mo79227d(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                return new C27239a(offerProductModel, i, basketType);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27239a)) {
                    return false;
                }
                C27239a aVar = (C27239a) obj;
                return Intrinsics.areEqual((Object) this.f66196a, (Object) aVar.f66196a) && this.f66197b == aVar.f66197b && this.f66198c == aVar.f66198c;
            }

            @C12579k
            /* renamed from: f */
            public final BasketType mo79229f() {
                return this.f66198c;
            }

            @C12579k
            /* renamed from: g */
            public final OfferProductModel mo79230g() {
                return this.f66196a;
            }

            /* renamed from: h */
            public final int mo79231h() {
                return this.f66197b;
            }

            public int hashCode() {
                return (((this.f66196a.hashCode() * 31) + Integer.hashCode(this.f66197b)) * 31) + this.f66198c.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66196a;
                int i = this.f66197b;
                BasketType basketType = this.f66198c;
                return "SetProductQuantity(offerProductModel=" + offerProductModel + ", quantity=" + i + ", basketType=" + basketType + ")";
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public QuantityBottomSheetViewModel(@C12579k C37716b bVar) {
        super(C27233a.f66187c.mo79223a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(bVar, "offerListAndBasketController");
        this.f66186a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel.C27238c r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$processIntent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$processIntent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$processIntent$1
            r0.<init>(r9, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r10 = r6.L$0
            com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x005f
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            kotlin.C11661u0.m45747n(r11)
            boolean r11 = r10 instanceof com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel.C27238c.C27239a
            if (r11 == 0) goto L_0x0072
            com.carrefour.fid.android.domain.interactors.offer.b r1 = r9.f66186a
            com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$c$a r10 = (com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel.C27238c.C27239a) r10
            com.carrefour.fid.android.presentation.models.OfferProductModel r11 = r10.mo79230g()
            r3 = 0
            int r10 = r10.mo79231h()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r10)
            r5 = 0
            r7 = 10
            r8 = 0
            r6.L$0 = r9
            r6.label = r2
            r2 = r11
            java.lang.Object r11 = com.carrefour.fid.android.domain.interactors.offer.C37716b.C37717a.m154589a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r10 = r9
        L_0x005f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x006d
            com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$b$b r11 = com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel.C27235b.C27237b.f66193a
            r10.emitEvent(r11)
            goto L_0x0072
        L_0x006d:
            com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$b$a r11 = com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel.C27235b.C27236a.f66191a
            r10.emitEvent(r11)
        L_0x0072:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel.processIntent(com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel$c, kotlin.coroutines.c):java.lang.Object");
    }
}
