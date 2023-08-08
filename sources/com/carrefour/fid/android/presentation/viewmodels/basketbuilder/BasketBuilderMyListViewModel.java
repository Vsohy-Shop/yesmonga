package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.data.extension.C13195a;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000fB\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderMyListViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderMyListViewModel$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderMyListViewModel$b;", "intent", "Lkotlin/d2;", "e0", "(Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderMyListViewModel$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "d0", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "a", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "<init>", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class BasketBuilderMyListViewModel extends BaseMVIViewModel<C25912a, C25914b> {

    /* renamed from: b */
    public static final int f63404b = LoginRepository.f32381c;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f63405a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderMyListViewModel$a */
    public static final class C25912a implements C28505u.C28509d {
        @C12579k

        /* renamed from: c */
        public static final C25913a f63406c = new C25913a((DefaultConstructorMarker) null);

        /* renamed from: d */
        public static final int f63407d = 0;
        @C12579k

        /* renamed from: e */
        public static final C25912a f63408e = new C25912a(false);

        /* renamed from: b */
        public final boolean f63409b;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderMyListViewModel$a$a */
        public static final class C25913a {
            public /* synthetic */ C25913a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C25912a mo75243a() {
                return C25912a.f63408e;
            }

            public C25913a() {
            }
        }

        public C25912a(boolean z) {
            this.f63409b = z;
        }

        /* renamed from: h */
        public static /* synthetic */ C25912a m111003h(C25912a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f63409b;
            }
            return aVar.mo75239g(z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25912a) && this.f63409b == ((C25912a) obj).f63409b;
        }

        /* renamed from: f */
        public final boolean mo75238f() {
            return this.f63409b;
        }

        @C12579k
        /* renamed from: g */
        public final C25912a mo75239g(boolean z) {
            return new C25912a(z);
        }

        public int hashCode() {
            boolean z = this.f63409b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        /* renamed from: i */
        public final boolean mo75241i() {
            return this.f63409b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f63409b;
            return "UIState(showSignIn=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderMyListViewModel$b */
    public static abstract class C25914b implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f63410a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderMyListViewModel$b$a */
        public static final class C25915a extends C25914b {
            @C12579k

            /* renamed from: b */
            public static final C25915a f63411b = new C25915a();

            /* renamed from: c */
            public static final int f63412c = 0;

            public C25915a() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C25914b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25914b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BasketBuilderMyListViewModel(@C12579k LoginRepository loginRepository) {
        super(C25912a.f63406c.mo75243a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f63405a = loginRepository;
    }

    /* renamed from: d0 */
    public final void mo75235d0() {
        publishState(((C25912a) getCurrentState()).mo75239g(!C13195a.m57177a(this.f63405a)));
    }

    @C12580l
    /* renamed from: e0 */
    public Object processIntent(@C12579k C25914b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (bVar instanceof C25914b.C25915a) {
            mo75235d0();
        }
        return C11079d2.f28267a;
    }
}
