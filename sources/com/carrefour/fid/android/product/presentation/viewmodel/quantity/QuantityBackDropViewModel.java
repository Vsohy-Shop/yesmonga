package com.carrefour.fid.android.product.presentation.viewmodel.quantity;

import android.net.Uri;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.product.C37761i;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.extension.C37972a;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\"&*.B,\b\u0007\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u001b\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u000eH\u0002J \u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010 \u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020%8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$c;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$d;", "intent", "Lkotlin/d2;", "p0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "gtin", "s0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "m0", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$d$b;", "o0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$d$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel$a;", "t0", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "id", "", "quantity", "n0", "", "trackingUrl", "q0", "r0", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "a", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/i;", "b", "Lcom/carrefour/fid/android/domain/interactors/product/i;", "getConsolidatedProductFlowUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "c", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "updateBasketContentUseCase", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "d", "Lcom/carrefour/fid/android/domain/interactors/criteo/j;", "criteoTrackingUseCase", "e", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "data", "f", "I", "userSelectedQuantity", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/product/i;Lcom/carrefour/fid/android/domain/interactors/basket/n0;Lcom/carrefour/fid/android/domain/interactors/criteo/j;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nQuantityBackDropViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuantityBackDropViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1549#2:181\n1620#2,3:182\n1855#2,2:185\n*S KotlinDebug\n*F\n+ 1 QuantityBackDropViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/quantity/QuantityBackDropViewModel\n*L\n139#1:181\n139#1:182,3\n153#1:185,2\n*E\n"})
public final class QuantityBackDropViewModel extends BaseMVIViewModel<C28212c, C28218d> {
    @C12579k

    /* renamed from: a */
    public final C37823k f68315a;
    @C12579k

    /* renamed from: b */
    public final C37761i f68316b;
    @C12579k

    /* renamed from: c */
    public final C37588n0 f68317c;
    @C12579k

    /* renamed from: d */
    public final C37672j f68318d;
    @C12580l

    /* renamed from: e */
    public C38114b f68319e;

    /* renamed from: f */
    public int f68320f = -1;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$a */
    public static final class C28208a {

        /* renamed from: d */
        public static final int f68321d = 0;

        /* renamed from: a */
        public final int f68322a;

        /* renamed from: b */
        public final boolean f68323b;

        /* renamed from: c */
        public final boolean f68324c;

        public C28208a(int i, boolean z, boolean z2) {
            this.f68322a = i;
            this.f68323b = z;
            this.f68324c = z2;
        }

        /* renamed from: e */
        public static /* synthetic */ C28208a m118110e(C28208a aVar, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f68322a;
            }
            if ((i2 & 2) != 0) {
                z = aVar.f68323b;
            }
            if ((i2 & 4) != 0) {
                z2 = aVar.f68324c;
            }
            return aVar.mo82134d(i, z, z2);
        }

        /* renamed from: a */
        public final int mo82131a() {
            return this.f68322a;
        }

        /* renamed from: b */
        public final boolean mo82132b() {
            return this.f68323b;
        }

        /* renamed from: c */
        public final boolean mo82133c() {
            return this.f68324c;
        }

        @C12579k
        /* renamed from: d */
        public final C28208a mo82134d(int i, boolean z, boolean z2) {
            return new C28208a(i, z, z2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28208a)) {
                return false;
            }
            C28208a aVar = (C28208a) obj;
            return this.f68322a == aVar.f68322a && this.f68323b == aVar.f68323b && this.f68324c == aVar.f68324c;
        }

        /* renamed from: f */
        public final int mo82136f() {
            return this.f68322a;
        }

        /* renamed from: g */
        public final boolean mo82137g() {
            return this.f68324c;
        }

        /* renamed from: h */
        public final boolean mo82138h() {
            return this.f68323b;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f68322a) * 31;
            boolean z = this.f68323b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f68324c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        @C12579k
        public String toString() {
            int i = this.f68322a;
            boolean z = this.f68323b;
            boolean z2 = this.f68324c;
            return "QuantityItem(quantity=" + i + ", isSelected=" + z + ", isLoading=" + z2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$b */
    public interface C28209b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$b$a */
        public static final class C28210a implements C28209b {

            /* renamed from: b */
            public static final int f68325b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f68326a;

            public C28210a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f68326a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C28210a m118118c(C28210a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f68326a;
                }
                return aVar.mo82142b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo82141a() {
                return this.f68326a;
            }

            @C12579k
            /* renamed from: b */
            public final C28210a mo82142b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C28210a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo82143d() {
                return this.f68326a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28210a) && Intrinsics.areEqual((Object) this.f68326a, (Object) ((C28210a) obj).f68326a);
            }

            public int hashCode() {
                return this.f68326a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f68326a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$b$b */
        public static final class C28211b implements C28209b {

            /* renamed from: c */
            public static final int f68327c = 8;
            @C12579k

            /* renamed from: a */
            public final C38114b f68328a;

            /* renamed from: b */
            public final int f68329b;

            public C28211b(@C12579k C38114b bVar, int i) {
                Intrinsics.checkNotNullParameter(bVar, "data");
                this.f68328a = bVar;
                this.f68329b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C28211b m118122d(C28211b bVar, C38114b bVar2, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    bVar2 = bVar.f68328a;
                }
                if ((i2 & 2) != 0) {
                    i = bVar.f68329b;
                }
                return bVar.mo82149c(bVar2, i);
            }

            @C12579k
            /* renamed from: a */
            public final C38114b mo82147a() {
                return this.f68328a;
            }

            /* renamed from: b */
            public final int mo82148b() {
                return this.f68329b;
            }

            @C12579k
            /* renamed from: c */
            public final C28211b mo82149c(@C12579k C38114b bVar, int i) {
                Intrinsics.checkNotNullParameter(bVar, "data");
                return new C28211b(bVar, i);
            }

            @C12579k
            /* renamed from: e */
            public final C38114b mo82150e() {
                return this.f68328a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28211b)) {
                    return false;
                }
                C28211b bVar = (C28211b) obj;
                return Intrinsics.areEqual((Object) this.f68328a, (Object) bVar.f68328a) && this.f68329b == bVar.f68329b;
            }

            /* renamed from: f */
            public final int mo82152f() {
                return this.f68329b;
            }

            public int hashCode() {
                return (this.f68328a.hashCode() * 31) + Integer.hashCode(this.f68329b);
            }

            @C12579k
            public String toString() {
                C38114b bVar = this.f68328a;
                int i = this.f68329b;
                return "ProductQuantityChanged(data=" + bVar + ", selectedQuantity=" + i + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$c */
    public interface C28212c extends C28505u.C28509d {
        @C12579k

        /* renamed from: a */
        public static final C28213a f68330a = C28213a.f68331a;

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$c$a */
        public static final class C28213a {

            /* renamed from: a */
            public static final /* synthetic */ C28213a f68331a = new C28213a();
            @C12579k

            /* renamed from: b */
            public static final C28216d f68332b = C28216d.f68335b;

            @C12579k
            /* renamed from: a */
            public final C28216d mo82155a() {
                return f68332b;
            }
        }

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$c$b */
        public static final class C28214b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m118129a(@C12579k C28212c cVar) {
                return C28505u.C28509d.C28510a.m118428a(cVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$c$c */
        public static final class C28215c implements C28212c {
            @C12579k

            /* renamed from: b */
            public static final C28215c f68333b = new C28215c();

            /* renamed from: c */
            public static final int f68334c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28214b.m118129a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$c$d */
        public static final class C28216d implements C28212c {
            @C12579k

            /* renamed from: b */
            public static final C28216d f68335b = new C28216d();

            /* renamed from: c */
            public static final int f68336c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28214b.m118129a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$c$e */
        public static final class C28217e implements C28212c {

            /* renamed from: c */
            public static final int f68337c = 8;
            @C12579k

            /* renamed from: b */
            public final List<C28208a> f68338b;

            public C28217e(@C12579k List<C28208a> list) {
                Intrinsics.checkNotNullParameter(list, "items");
                this.f68338b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C28217e m118130g(C28217e eVar, List<C28208a> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = eVar.f68338b;
                }
                return eVar.mo82158f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<C28208a> mo82156e() {
                return this.f68338b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28217e) && Intrinsics.areEqual((Object) this.f68338b, (Object) ((C28217e) obj).f68338b);
            }

            @C12579k
            /* renamed from: f */
            public final C28217e mo82158f(@C12579k List<C28208a> list) {
                Intrinsics.checkNotNullParameter(list, "items");
                return new C28217e(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<C28208a> mo82159h() {
                return this.f68338b;
            }

            public int hashCode() {
                return this.f68338b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28214b.m118129a(this);
            }

            @C12579k
            public String toString() {
                List<C28208a> list = this.f68338b;
                return "QuantityList(items=" + list + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$e */
    public static final class C28221e implements C11908f<Result<? extends C38114b>> {

        /* renamed from: a */
        public final /* synthetic */ QuantityBackDropViewModel f68344a;

        public C28221e(QuantityBackDropViewModel quantityBackDropViewModel) {
            this.f68344a = quantityBackDropViewModel;
        }

        @C12580l
        public final Object emit(@C12579k Object obj, @C12579k C11045c<? super C11079d2> cVar) {
            Result result = (Result) obj;
            String k = Result.m38711k(result.mo21858l());
            StringBuilder sb = new StringBuilder();
            sb.append("collect(): ");
            sb.append(k);
            Object l = result.mo21858l();
            QuantityBackDropViewModel quantityBackDropViewModel = this.f68344a;
            Throwable e = Result.m38705e(l);
            if (e == null) {
                C38114b bVar = (C38114b) l;
                if (quantityBackDropViewModel.f68319e == null) {
                    quantityBackDropViewModel.f68319e = bVar;
                }
                quantityBackDropViewModel.publishState(new C28212c.C28217e(quantityBackDropViewModel.mo82130t0(bVar)));
            } else {
                quantityBackDropViewModel.emitEvent(new C28209b.C28210a(e));
                quantityBackDropViewModel.publishState(C28212c.C28215c.f68333b);
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public QuantityBackDropViewModel(@C12579k C37823k kVar, @C12579k C37761i iVar, @C12579k C37588n0 n0Var, @C12579k C37672j jVar) {
        super(C28212c.f68330a.mo82155a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(iVar, "getConsolidatedProductFlowUseCase");
        Intrinsics.checkNotNullParameter(n0Var, "updateBasketContentUseCase");
        Intrinsics.checkNotNullParameter(jVar, "criteoTrackingUseCase");
        this.f68315a = kVar;
        this.f68316b = iVar;
        this.f68317c = n0Var;
        this.f68318d = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo82123m0(java.lang.String r7, kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<kotlin.Result<com.carrefour.fid.android.domain.models.product.plp.C38114b>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$getProductFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$getProductFlow$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$getProductFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$getProductFlow$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$getProductFlow$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r8)
            goto L_0x007a
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel r2 = (com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0059
        L_0x0046:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.service.k r8 = r6.f68315a
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r6
        L_0x0059:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r8)
            if (r4 != 0) goto L_0x007d
            com.carrefour.fid.android.domain.models.service.models.k r8 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r8
            com.carrefour.fid.android.domain.interactors.product.r$a r4 = new com.carrefour.fid.android.domain.interactors.product.r$a
            java.lang.String r8 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r8)
            r5 = 0
            r4.<init>(r8, r7, r5)
            com.carrefour.fid.android.domain.interactors.product.i r7 = r2.f68316b
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r7.invoke(r4, r0)
            if (r8 != r1) goto L_0x007a
            return r1
        L_0x007a:
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            return r8
        L_0x007d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel.mo82123m0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n0 */
    public final void mo82124n0(Basket basket, OfferIdentifier offerIdentifier, int i) {
        List<Throwable> b = C37972a.m156171b(basket, offerIdentifier, i);
        if (b != null) {
            for (Throwable aVar : b) {
                emitEvent(new C28209b.C28210a(aVar));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo82125o0(com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel.C28218d.C28220b r12, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$onSetProductQuantity$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$onSetProductQuantity$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$onSetProductQuantity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$onSetProductQuantity$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$onSetProductQuantity$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r12 = r0.L$2
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r12 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r12
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$d$b r1 = (com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel.C28218d.C28220b) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel r0 = (com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel) r0
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0082
        L_0x003b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0043:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.domain.models.product.plp.b r13 = r11.f68319e
            if (r13 == 0) goto L_0x00c3
            com.carrefour.fid.android.domain.models.product.plp.c r13 = r13.mo118842j()
            if (r13 == 0) goto L_0x00c3
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r13 = com.carrefour.fid.android.product.presentation.models.extensions.C27662e.m116389i(r13)
            if (r13 == 0) goto L_0x00c3
            int r2 = r12.mo82173f()
            r11.f68320f = r2
            com.carrefour.fid.android.domain.interactors.basket.n0 r2 = r11.f68317c
            com.carrefour.fid.android.domain.interactors.basket.n0$a r10 = new com.carrefour.fid.android.domain.interactors.basket.n0$a
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r5 = r13.mo118819v()
            int r6 = r12.mo82173f()
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.label = r3
            java.lang.Object r0 = r2.m172966invokegIAlus(r10, r0)
            if (r0 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r1 = r12
            r12 = r13
            r13 = r0
            r0 = r11
        L_0x0082:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r13)
            if (r2 != 0) goto L_0x0096
            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r12 = r12.mo118819v()
            int r2 = r1.mo82173f()
            r0.mo82124n0(r13, r12, r2)
            goto L_0x009e
        L_0x0096:
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$b$a r12 = new com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$b$a
            r12.<init>(r2)
            r0.emitEvent(r12)
        L_0x009e:
            com.carrefour.fid.android.domain.models.product.plp.b r12 = r0.f68319e
            if (r12 == 0) goto L_0x00c0
            java.lang.String r13 = r1.mo82171e()
            if (r13 == 0) goto L_0x00b4
            int r2 = r1.mo82173f()
            int r3 = r12.mo118843k()
            int r2 = r2 - r3
            r0.mo82127q0(r13, r2)
        L_0x00b4:
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$b$b r13 = new com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$b$b
            int r1 = r1.mo82173f()
            r13.<init>(r12, r1)
            r0.emitEvent(r13)
        L_0x00c0:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x00c3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Offer should have been set at this point. Has Fetch Action been sent?"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel.mo82125o0(com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$d$b, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: p0 */
    public Object processIntent(@C12579k C28218d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (dVar instanceof C28218d.C28219a) {
            Object s0 = mo82129s0(((C28218d.C28219a) dVar).mo82164d(), cVar);
            if (s0 == C11063b.m42612h()) {
                return s0;
            }
            return C11079d2.f28267a;
        } else if (!(dVar instanceof C28218d.C28220b)) {
            return C11079d2.f28267a;
        } else {
            Object o0 = mo82125o0((C28218d.C28220b) dVar, cVar);
            if (o0 == C11063b.m42612h()) {
                return o0;
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: q0 */
    public final void mo82127q0(String str, int i) {
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("quantity", String.valueOf(i)).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "parse(trackingUrl)\n     …)\n            .toString()");
        mo82128r0(uri);
    }

    /* renamed from: r0 */
    public final void mo82128r0(String str) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new QuantityBackDropViewModel$sendCriteoTracking$1(str, this, (C11045c<? super QuantityBackDropViewModel$sendCriteoTracking$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo82129s0(java.lang.String r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$subscribeToProductFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$subscribeToProductFlow$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$subscribeToProductFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$subscribeToProductFlow$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$subscribeToProductFlow$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005e
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel r6 = (com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel) r6
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004b
        L_0x003c:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r5.mo82123m0(r6, r0)
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r6 = r5
        L_0x004b:
            kotlinx.coroutines.flow.e r7 = (kotlinx.coroutines.flow.C11907e) r7
            com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$e r2 = new com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$e
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L_0x005e
            return r1
        L_0x005e:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel.mo82129s0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: t0 */
    public final List<C28208a> mo82130t0(C38114b bVar) {
        boolean z;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        if (i == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        int k = bVar.mo118843k();
        Iterable<Number> y4 = CollectionsKt___CollectionsKt.m40718y4(C10976s.m41419k(0), CollectionsKt___CollectionsKt.m40557Q5(C11479u.m44315B1(new C11466l(i.mo118791B(), i.mo118823z()), i.mo118791B())));
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(y4, 10));
        for (Number intValue : y4) {
            int intValue2 = intValue.intValue();
            int i2 = this.f68320f;
            boolean z2 = true;
            if (i2 <= 0 ? intValue2 != k : intValue2 != i2) {
                z = false;
            } else {
                z = true;
            }
            if (intValue2 != i2 || !bVar.mo118847o()) {
                z2 = false;
            }
            arrayList.add(new C28208a(intValue2, z, z2));
        }
        return arrayList;
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$d */
    public interface C28218d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$d$a */
        public static final class C28219a implements C28218d {

            /* renamed from: b */
            public static final int f68339b = 0;
            @C12579k

            /* renamed from: a */
            public final String f68340a;

            public /* synthetic */ C28219a(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            /* renamed from: c */
            public static /* synthetic */ C28219a m118134c(C28219a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f68340a;
                }
                return aVar.mo82163b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo82162a() {
                return this.f68340a;
            }

            @C12579k
            /* renamed from: b */
            public final C28219a mo82163b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "gtin");
                return new C28219a(str, (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: d */
            public final String mo82164d() {
                return this.f68340a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28219a) && Gtin.m157311e(this.f68340a, ((C28219a) obj).f68340a);
            }

            public int hashCode() {
                return Gtin.m157312g(this.f68340a);
            }

            @C12579k
            public String toString() {
                String h = Gtin.m157313h(this.f68340a);
                return "Fetch(gtin=" + h + ")";
            }

            public C28219a(String str) {
                Intrinsics.checkNotNullParameter(str, "gtin");
                this.f68340a = str;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.quantity.QuantityBackDropViewModel$d$b */
        public static final class C28220b implements C28218d {

            /* renamed from: c */
            public static final int f68341c = 0;

            /* renamed from: a */
            public final int f68342a;
            @C12580l

            /* renamed from: b */
            public final String f68343b;

            public C28220b(int i, @C12580l String str) {
                this.f68342a = i;
                this.f68343b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C28220b m118138d(C28220b bVar, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f68342a;
                }
                if ((i2 & 2) != 0) {
                    str = bVar.f68343b;
                }
                return bVar.mo82170c(i, str);
            }

            /* renamed from: a */
            public final int mo82168a() {
                return this.f68342a;
            }

            @C12580l
            /* renamed from: b */
            public final String mo82169b() {
                return this.f68343b;
            }

            @C12579k
            /* renamed from: c */
            public final C28220b mo82170c(int i, @C12580l String str) {
                return new C28220b(i, str);
            }

            @C12580l
            /* renamed from: e */
            public final String mo82171e() {
                return this.f68343b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28220b)) {
                    return false;
                }
                C28220b bVar = (C28220b) obj;
                return this.f68342a == bVar.f68342a && Intrinsics.areEqual((Object) this.f68343b, (Object) bVar.f68343b);
            }

            /* renamed from: f */
            public final int mo82173f() {
                return this.f68342a;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f68342a) * 31;
                String str = this.f68343b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @C12579k
            public String toString() {
                int i = this.f68342a;
                String str = this.f68343b;
                return "SetProductQuantity(selectedQuantity=" + i + ", criteoBeaconBasketChangeUrl=" + str + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28220b(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : str);
            }
        }
    }
}
