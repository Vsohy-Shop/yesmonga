package com.carrefour.fid.android.presentation.viewmodels.luckycart;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.presentation.p035ui.confirmation.LuckyCartBottomSheetDialogFragment;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\t\u000eB\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/LuckyCartViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/LuckyCartViewModel$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/LuckyCartViewModel$b;", "intent", "Lkotlin/d2;", "f0", "(Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/LuckyCartViewModel$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/luckycart/GetLuckyCartTicketUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/luckycart/GetLuckyCartTicketUseCase;", "getLuckyCartTicketUseCase", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/luckycart/GetLuckyCartTicketUseCase;)V", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class LuckyCartViewModel extends BaseMVIViewModel<C26613a, C26617b> {

    /* renamed from: b */
    public static final int f65011b = 8;
    @C12579k

    /* renamed from: a */
    public final GetLuckyCartTicketUseCase f65012a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$a */
    public static abstract class C26613a implements C28505u.C28509d {

        /* renamed from: b */
        public static final int f65013b = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$a$a */
        public static final class C26614a extends C26613a {
            @C12579k

            /* renamed from: c */
            public static final C26614a f65014c = new C26614a();

            /* renamed from: d */
            public static final int f65015d = 0;

            public C26614a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$a$b */
        public static final class C26615b extends C26613a {
            @C12579k

            /* renamed from: c */
            public static final C26615b f65016c = new C26615b();

            /* renamed from: d */
            public static final int f65017d = 0;

            public C26615b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$a$c */
        public static final class C26616c extends C26613a {

            /* renamed from: d */
            public static final int f65018d = 0;
            @C12579k

            /* renamed from: c */
            public final LuckyCartTicketDomain f65019c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26616c(@C12579k LuckyCartTicketDomain luckyCartTicketDomain) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(luckyCartTicketDomain, LuckyCartBottomSheetDialogFragment.f59815x);
                this.f65019c = luckyCartTicketDomain;
            }

            /* renamed from: g */
            public static /* synthetic */ C26616c m113184g(C26616c cVar, LuckyCartTicketDomain luckyCartTicketDomain, int i, Object obj) {
                if ((i & 1) != 0) {
                    luckyCartTicketDomain = cVar.f65019c;
                }
                return cVar.mo77355f(luckyCartTicketDomain);
            }

            @C12579k
            /* renamed from: e */
            public final LuckyCartTicketDomain mo77353e() {
                return this.f65019c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26616c) && Intrinsics.areEqual((Object) this.f65019c, (Object) ((C26616c) obj).f65019c);
            }

            @C12579k
            /* renamed from: f */
            public final C26616c mo77355f(@C12579k LuckyCartTicketDomain luckyCartTicketDomain) {
                Intrinsics.checkNotNullParameter(luckyCartTicketDomain, LuckyCartBottomSheetDialogFragment.f59815x);
                return new C26616c(luckyCartTicketDomain);
            }

            @C12579k
            /* renamed from: h */
            public final LuckyCartTicketDomain mo77356h() {
                return this.f65019c;
            }

            public int hashCode() {
                return this.f65019c.hashCode();
            }

            @C12579k
            public String toString() {
                LuckyCartTicketDomain luckyCartTicketDomain = this.f65019c;
                return "LuckyCartTicket(luckyCartTicket=" + luckyCartTicketDomain + ")";
            }
        }

        public /* synthetic */ C26613a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        public C26613a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$b */
    public static abstract class C26617b implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f65020a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$b$a */
        public static final class C26618a extends C26617b {
            @C12579k

            /* renamed from: b */
            public static final C26618a f65021b = new C26618a();

            /* renamed from: c */
            public static final int f65022c = 0;

            public C26618a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$b$b */
        public static final class C26619b extends C26617b {

            /* renamed from: d */
            public static final int f65023d = 8;
            @C12580l

            /* renamed from: b */
            public final OrderConfirmationModel f65024b;
            @C12579k

            /* renamed from: c */
            public final HashMap<String, CategoryModel> f65025c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26619b(@C12580l OrderConfirmationModel orderConfirmationModel, @C12579k HashMap<String, CategoryModel> hashMap) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(hashMap, "categoryListByGtin");
                this.f65024b = orderConfirmationModel;
                this.f65025c = hashMap;
            }

            /* renamed from: d */
            public static /* synthetic */ C26619b m113188d(C26619b bVar, OrderConfirmationModel orderConfirmationModel, HashMap<String, CategoryModel> hashMap, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderConfirmationModel = bVar.f65024b;
                }
                if ((i & 2) != 0) {
                    hashMap = bVar.f65025c;
                }
                return bVar.mo77361c(orderConfirmationModel, hashMap);
            }

            @C12580l
            /* renamed from: a */
            public final OrderConfirmationModel mo77359a() {
                return this.f65024b;
            }

            @C12579k
            /* renamed from: b */
            public final HashMap<String, CategoryModel> mo77360b() {
                return this.f65025c;
            }

            @C12579k
            /* renamed from: c */
            public final C26619b mo77361c(@C12580l OrderConfirmationModel orderConfirmationModel, @C12579k HashMap<String, CategoryModel> hashMap) {
                Intrinsics.checkNotNullParameter(hashMap, "categoryListByGtin");
                return new C26619b(orderConfirmationModel, hashMap);
            }

            @C12579k
            /* renamed from: e */
            public final HashMap<String, CategoryModel> mo77362e() {
                return this.f65025c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26619b)) {
                    return false;
                }
                C26619b bVar = (C26619b) obj;
                return Intrinsics.areEqual((Object) this.f65024b, (Object) bVar.f65024b) && Intrinsics.areEqual((Object) this.f65025c, (Object) bVar.f65025c);
            }

            @C12580l
            /* renamed from: f */
            public final OrderConfirmationModel mo77364f() {
                return this.f65024b;
            }

            public int hashCode() {
                OrderConfirmationModel orderConfirmationModel = this.f65024b;
                return ((orderConfirmationModel == null ? 0 : orderConfirmationModel.hashCode()) * 31) + this.f65025c.hashCode();
            }

            @C12579k
            public String toString() {
                OrderConfirmationModel orderConfirmationModel = this.f65024b;
                HashMap<String, CategoryModel> hashMap = this.f65025c;
                return "GetLuckyCartTicket(orderConfirmationModel=" + orderConfirmationModel + ", categoryListByGtin=" + hashMap + ")";
            }
        }

        public /* synthetic */ C26617b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C26617b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public LuckyCartViewModel(@C12579k GetLuckyCartTicketUseCase getLuckyCartTicketUseCase) {
        super(C26613a.C26614a.f65014c, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getLuckyCartTicketUseCase, "getLuckyCartTicketUseCase");
        this.f65012a = getLuckyCartTicketUseCase;
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C26617b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (bVar instanceof C26617b.C26619b) {
            C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new LuckyCartViewModel$processIntent$2(this, bVar, (C11045c<? super LuckyCartViewModel$processIntent$2>) null), 3, (Object) null);
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C26617b.C26618a.f65021b)) {
            publishState(C26613a.C26614a.f65014c);
        }
        return C11079d2.f28267a;
    }
}
