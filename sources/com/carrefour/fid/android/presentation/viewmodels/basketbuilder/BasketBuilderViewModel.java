package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.data.extension.C13195a;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.presentation.models.BasketBuilderType;
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
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\t\u0012B!\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel$b;", "intent", "Lkotlin/d2;", "d0", "(Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "a", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "clearAppManager", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Landroidx/lifecycle/p0;", "savedStateHandle", "<init>", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/data/managers/ClearAppManager;Landroidx/lifecycle/p0;)V", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketBuilderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel\n+ 2 NavArguments.kt\ncom/carrefour/fid/android/presentation/viewmodels/basketbuilder/NavArgumentsKt\n*L\n1#1,60:1\n8#2:61\n*S KotlinDebug\n*F\n+ 1 BasketBuilderViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderViewModel\n*L\n40#1:61\n*E\n"})
public final class BasketBuilderViewModel extends BaseMVIViewModel<C25943a, C25945b> {

    /* renamed from: b */
    public static final int f63466b = 8;
    @C12579k

    /* renamed from: a */
    public final ClearAppManager f63467a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel$a */
    public static final class C25943a implements C28505u.C28509d {
        @C12579k

        /* renamed from: d */
        public static final C25944a f63468d = new C25944a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final int f63469e = 0;
        @C12579k

        /* renamed from: f */
        public static final C25943a f63470f = new C25943a(false, BasketBuilderType.FREQUENT_PURCHASES);

        /* renamed from: b */
        public final boolean f63471b;
        @C12579k

        /* renamed from: c */
        public final BasketBuilderType f63472c;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel$a$a */
        public static final class C25944a {
            public /* synthetic */ C25944a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C25943a mo75357a() {
                return C25943a.f63470f;
            }

            public C25944a() {
            }
        }

        public C25943a(boolean z, @C12579k BasketBuilderType basketBuilderType) {
            Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
            this.f63471b = z;
            this.f63472c = basketBuilderType;
        }

        /* renamed from: i */
        public static /* synthetic */ C25943a m111092i(C25943a aVar, boolean z, BasketBuilderType basketBuilderType, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f63471b;
            }
            if ((i & 2) != 0) {
                basketBuilderType = aVar.f63472c;
            }
            return aVar.mo75352h(z, basketBuilderType);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25943a)) {
                return false;
            }
            C25943a aVar = (C25943a) obj;
            return this.f63471b == aVar.f63471b && this.f63472c == aVar.f63472c;
        }

        /* renamed from: f */
        public final boolean mo75350f() {
            return this.f63471b;
        }

        @C12579k
        /* renamed from: g */
        public final BasketBuilderType mo75351g() {
            return this.f63472c;
        }

        @C12579k
        /* renamed from: h */
        public final C25943a mo75352h(boolean z, @C12579k BasketBuilderType basketBuilderType) {
            Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
            return new C25943a(z, basketBuilderType);
        }

        public int hashCode() {
            boolean z = this.f63471b;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f63472c.hashCode();
        }

        @C12579k
        /* renamed from: j */
        public final BasketBuilderType mo75354j() {
            return this.f63472c;
        }

        /* renamed from: k */
        public final boolean mo75355k() {
            return this.f63471b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f63471b;
            BasketBuilderType basketBuilderType = this.f63472c;
            return "UIState(isUserConnected=" + z + ", basketBuilderType=" + basketBuilderType + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel$b */
    public static abstract class C25945b implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f63473a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel$b$a */
        public static final class C25946a extends C25945b {
            @C12579k

            /* renamed from: b */
            public static final C25946a f63474b = new C25946a();

            /* renamed from: c */
            public static final int f63475c = 0;

            public C25946a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel$b$b */
        public static final class C25947b extends C25945b {

            /* renamed from: c */
            public static final int f63476c = 0;
            @C12579k

            /* renamed from: b */
            public final BasketBuilderType f63477b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25947b(@C12579k BasketBuilderType basketBuilderType) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
                this.f63477b = basketBuilderType;
            }

            /* renamed from: c */
            public static /* synthetic */ C25947b m111099c(C25947b bVar, BasketBuilderType basketBuilderType, int i, Object obj) {
                if ((i & 1) != 0) {
                    basketBuilderType = bVar.f63477b;
                }
                return bVar.mo75359b(basketBuilderType);
            }

            @C12579k
            /* renamed from: a */
            public final BasketBuilderType mo75358a() {
                return this.f63477b;
            }

            @C12579k
            /* renamed from: b */
            public final C25947b mo75359b(@C12579k BasketBuilderType basketBuilderType) {
                Intrinsics.checkNotNullParameter(basketBuilderType, C25980u.f63504a);
                return new C25947b(basketBuilderType);
            }

            @C12579k
            /* renamed from: d */
            public final BasketBuilderType mo75360d() {
                return this.f63477b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25947b) && this.f63477b == ((C25947b) obj).f63477b;
            }

            public int hashCode() {
                return this.f63477b.hashCode();
            }

            @C12579k
            public String toString() {
                BasketBuilderType basketBuilderType = this.f63477b;
                return "SwitchContentPage(basketBuilderType=" + basketBuilderType + ")";
            }
        }

        public /* synthetic */ C25945b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25945b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BasketBuilderViewModel(@C12579k LoginRepository loginRepository, @C12579k ClearAppManager clearAppManager, @C12579k C19456p0 p0Var) {
        super(C25943a.f63468d.mo75357a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(clearAppManager, "clearAppManager");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.f63467a = clearAppManager;
        boolean a = C13195a.m57177a(loginRepository);
        Object h = p0Var.mo57648h(C25980u.f63504a);
        Intrinsics.checkNotNull(h);
        publishState(((C25943a) getCurrentState()).mo75352h(a, (BasketBuilderType) h));
    }

    @C12580l
    /* renamed from: d0 */
    public Object processIntent(@C12579k C25945b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (bVar instanceof C25945b.C25947b) {
            publishState(C25943a.m111092i((C25943a) getCurrentState(), false, ((C25945b.C25947b) bVar).mo75360d(), 1, (Object) null));
        } else if (bVar instanceof C25945b.C25946a) {
            Object a = this.f63467a.mo111416a(cVar);
            if (a == C11063b.m42612h()) {
                return a;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }
}
