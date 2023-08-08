package com.carrefour.fid.android.presentation.viewmodels.product.search;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000b\u0010\u0011B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListResultViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListResultViewModel$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListResultViewModel$c;", "intent", "Lkotlin/d2;", "f0", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListResultViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "e0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListRemoteConfigUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListRemoteConfigUseCase;", "searchWithListRemoteConfigUseCase", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListRemoteConfigUseCase;)V", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ProductSearchWithListResultViewModel extends BaseMVIViewModel<C27260b, C27261c> {

    /* renamed from: b */
    public static final int f66226b = 8;
    @C12579k

    /* renamed from: a */
    public final SearchWithListRemoteConfigUseCase f66227a;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$a */
    public interface C27258a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$a$a */
        public static final class C27259a implements C27258a {

            /* renamed from: b */
            public static final int f66228b = 0;

            /* renamed from: a */
            public final boolean f66229a;

            public C27259a(boolean z) {
                this.f66229a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C27259a m115045c(C27259a aVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aVar.f66229a;
                }
                return aVar.mo79278b(z);
            }

            /* renamed from: a */
            public final boolean mo79277a() {
                return this.f66229a;
            }

            @C12579k
            /* renamed from: b */
            public final C27259a mo79278b(boolean z) {
                return new C27259a(z);
            }

            /* renamed from: d */
            public final boolean mo79279d() {
                return this.f66229a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27259a) && this.f66229a == ((C27259a) obj).f66229a;
            }

            public int hashCode() {
                boolean z = this.f66229a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f66229a;
                return "InitUiWithSearchWithListAvailability(isSearchWithListAvailable=" + z + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$b */
    public static final class C27260b implements C28505u.C28509d {

        /* renamed from: c */
        public static final int f66230c = 0;

        /* renamed from: b */
        public final boolean f66231b;

        public C27260b(boolean z) {
            this.f66231b = z;
        }

        /* renamed from: g */
        public static /* synthetic */ C27260b m115049g(C27260b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f66231b;
            }
            return bVar.mo79285f(z);
        }

        /* renamed from: e */
        public final boolean mo79283e() {
            return this.f66231b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27260b) && this.f66231b == ((C27260b) obj).f66231b;
        }

        @C12579k
        /* renamed from: f */
        public final C27260b mo79285f(boolean z) {
            return new C27260b(z);
        }

        public int hashCode() {
            boolean z = this.f66231b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isLoading() {
            return this.f66231b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f66231b;
            return "UiState(isLoading=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$c */
    public static abstract class C27261c implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f66232a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$c$a */
        public static final class C27262a extends C27261c {
            @C12579k

            /* renamed from: b */
            public static final C27262a f66233b = new C27262a();

            /* renamed from: c */
            public static final int f66234c = 0;

            public C27262a() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27261c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27261c() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ProductSearchWithListResultViewModel(@C12579k SearchWithListRemoteConfigUseCase searchWithListRemoteConfigUseCase) {
        super(new C27260b(false), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(searchWithListRemoteConfigUseCase, "searchWithListRemoteConfigUseCase");
        this.f66227a = searchWithListRemoteConfigUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79275e0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.product.search.C27263x9e651c84
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$checkSearchWithListAvailability$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.C27263x9e651c84) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$checkSearchWithListAvailability$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$checkSearchWithListAvailability$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase r5 = r4.f66227a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m173000invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x0061
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$a$a r2 = new com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$a$a
            r2.<init>(r1)
            r0.emitEvent(r2)
        L_0x0061:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r5)
            if (r5 == 0) goto L_0x0070
            com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$a$a r5 = new com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel$a$a
            r1 = 0
            r5.<init>(r1)
            r0.emitEvent(r5)
        L_0x0070:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel.mo79275e0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C27261c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (!Intrinsics.areEqual((Object) cVar, (Object) C27261c.C27262a.f66233b)) {
            return C11079d2.f28267a;
        }
        Object e0 = mo79275e0(cVar2);
        if (e0 == C11063b.m42612h()) {
            return e0;
        }
        return C11079d2.f28267a;
    }
}
