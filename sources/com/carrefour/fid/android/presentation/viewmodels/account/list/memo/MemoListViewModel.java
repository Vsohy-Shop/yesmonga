package com.carrefour.fid.android.presentation.viewmodels.account.list.memo;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.DeleteMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.presentation.models.C38495l;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u001f#'+/BA\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206¢\u0006\u0004\b>\u0010?J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJ\u0013\u0010\u0014\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\tJ!\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$c;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$e;", "intent", "Lkotlin/d2;", "q0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "o0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/presentation/models/l;", "memo", "l0", "(Lcom/carrefour/fid/android/presentation/models/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "onlyChecked", "m0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "s0", "u0", "p0", "", "", "searchList", "t0", "(Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "n0", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$b;", "partialState", "r0", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/AddMemoListUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/AddMemoListUseCase;", "addMemoListUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/ClearMemoListUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/ClearMemoListUseCase;", "clearMemoListUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/DeleteMemoListUseCase;", "c", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/DeleteMemoListUseCase;", "deleteMemoListUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/GetMemoListUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/GetMemoListUseCase;", "getMemoListUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/UpdateMemoListUseCase;", "e", "Lcom/carrefour/fid/android/domain/interactors/account/store/memo/UpdateMemoListUseCase;", "updateMemoListUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListUseCase;", "f", "Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListUseCase;", "searchWithListUseCase", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "g", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "clearAppManager", "Lcom/carrefour/fid/android/shared/base/u$c;", "h", "Lcom/carrefour/fid/android/shared/base/u$c;", "reducer", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/account/store/memo/AddMemoListUseCase;Lcom/carrefour/fid/android/domain/interactors/account/store/memo/ClearMemoListUseCase;Lcom/carrefour/fid/android/domain/interactors/account/store/memo/DeleteMemoListUseCase;Lcom/carrefour/fid/android/domain/interactors/account/store/memo/GetMemoListUseCase;Lcom/carrefour/fid/android/domain/interactors/account/store/memo/UpdateMemoListUseCase;Lcom/carrefour/fid/android/domain/interactors/product/search/SearchWithListUseCase;Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nMemoListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n766#2:208\n857#2,2:209\n1549#2:211\n1620#2,3:212\n*S KotlinDebug\n*F\n+ 1 MemoListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel\n*L\n178#1:208\n178#1:209,2\n178#1:211\n178#1:212,3\n*E\n"})
public final class MemoListViewModel extends BaseMVIViewModel<C25823c, C25826e> {

    /* renamed from: i */
    public static final int f63218i = 8;
    @C12579k

    /* renamed from: a */
    public final AddMemoListUseCase f63219a;
    @C12579k

    /* renamed from: b */
    public final ClearMemoListUseCase f63220b;
    @C12579k

    /* renamed from: c */
    public final DeleteMemoListUseCase f63221c;
    @C12579k

    /* renamed from: d */
    public final GetMemoListUseCase f63222d;
    @C12579k

    /* renamed from: e */
    public final UpdateMemoListUseCase f63223e;
    @C12579k

    /* renamed from: f */
    public final SearchWithListUseCase f63224f;
    @C12579k

    /* renamed from: g */
    public final ClearAppManager f63225g;
    @C12579k

    /* renamed from: h */
    public final C28505u.C28508c<C25823c, C25816b> f63226h = C25834f.f63265a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$a */
    public static final class C25815a implements C25825d {

        /* renamed from: b */
        public static final int f63227b = 8;
        @C12579k

        /* renamed from: a */
        public final HashMap<String, List<String>> f63228a;

        public C25815a(@C12579k HashMap<String, List<String>> hashMap) {
            Intrinsics.checkNotNullParameter(hashMap, "offers");
            this.f63228a = hashMap;
        }

        /* renamed from: c */
        public static /* synthetic */ C25815a m110716c(C25815a aVar, HashMap<String, List<String>> hashMap, int i, Object obj) {
            if ((i & 1) != 0) {
                hashMap = aVar.f63228a;
            }
            return aVar.mo74928b(hashMap);
        }

        @C12579k
        /* renamed from: a */
        public final HashMap<String, List<String>> mo74927a() {
            return this.f63228a;
        }

        @C12579k
        /* renamed from: b */
        public final C25815a mo74928b(@C12579k HashMap<String, List<String>> hashMap) {
            Intrinsics.checkNotNullParameter(hashMap, "offers");
            return new C25815a(hashMap);
        }

        @C12579k
        /* renamed from: d */
        public final HashMap<String, List<String>> mo74929d() {
            return this.f63228a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25815a) && Intrinsics.areEqual((Object) this.f63228a, (Object) ((C25815a) obj).f63228a);
        }

        public int hashCode() {
            return this.f63228a.hashCode();
        }

        @C12579k
        public String toString() {
            HashMap<String, List<String>> hashMap = this.f63228a;
            return "NavigateToSearchWithListResult(offers=" + hashMap + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b */
    public static abstract class C25816b implements C28505u.C28509d {

        /* renamed from: b */
        public static final int f63229b = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a */
        public static final class C25817a extends C25816b {

            /* renamed from: d */
            public static final int f63230d = 8;
            @C12579k

            /* renamed from: c */
            public final Throwable f63231c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25817a(@C12579k Throwable th) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f63231c = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C25817a m110720g(C25817a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f63231c;
                }
                return aVar.mo74935f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo74933e() {
                return this.f63231c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25817a) && Intrinsics.areEqual((Object) this.f63231c, (Object) ((C25817a) obj).f63231c);
            }

            @C12579k
            /* renamed from: f */
            public final C25817a mo74935f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C25817a(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo74936h() {
                return this.f63231c;
            }

            public int hashCode() {
                return this.f63231c.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f63231c;
                return "ErrorEvent(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b */
        public static final class C25818b extends C25816b {

            /* renamed from: d */
            public static final int f63232d = 0;

            /* renamed from: c */
            public final boolean f63233c;

            public C25818b(boolean z) {
                super((DefaultConstructorMarker) null);
                this.f63233c = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C25818b m110724g(C25818b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f63233c;
                }
                return bVar.mo74941f(z);
            }

            /* renamed from: e */
            public final boolean mo74939e() {
                return this.f63233c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25818b) && this.f63233c == ((C25818b) obj).f63233c;
            }

            @C12579k
            /* renamed from: f */
            public final C25818b mo74941f(boolean z) {
                return new C25818b(z);
            }

            /* renamed from: h */
            public final boolean mo74942h() {
                return this.f63233c;
            }

            public int hashCode() {
                boolean z = this.f63233c;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f63233c;
                return "Loading(showing=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$c */
        public static final class C25819c extends C25816b {
            @C12579k

            /* renamed from: c */
            public static final C25819c f63234c = new C25819c();

            /* renamed from: d */
            public static final int f63235d = 0;

            public C25819c() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$d */
        public static final class C25820d extends C25816b {

            /* renamed from: d */
            public static final int f63236d = 8;
            @C12579k

            /* renamed from: c */
            public final List<C38495l> f63237c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25820d(@C12579k List<C38495l> list) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(list, "list");
                this.f63237c = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C25820d m110728g(C25820d dVar, List<C38495l> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f63237c;
                }
                return dVar.mo74947f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<C38495l> mo74945e() {
                return this.f63237c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25820d) && Intrinsics.areEqual((Object) this.f63237c, (Object) ((C25820d) obj).f63237c);
            }

            @C12579k
            /* renamed from: f */
            public final C25820d mo74947f(@C12579k List<C38495l> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                return new C25820d(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<C38495l> mo74948h() {
                return this.f63237c;
            }

            public int hashCode() {
                return this.f63237c.hashCode();
            }

            @C12579k
            public String toString() {
                List<C38495l> list = this.f63237c;
                return "MemoList(list=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$e */
        public static final class C25821e extends C25816b {

            /* renamed from: d */
            public static final int f63238d = 0;
            @C12579k

            /* renamed from: c */
            public final C38495l f63239c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25821e(@C12579k C38495l lVar) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(lVar, "memo");
                this.f63239c = lVar;
            }

            /* renamed from: g */
            public static /* synthetic */ C25821e m110732g(C25821e eVar, C38495l lVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    lVar = eVar.f63239c;
                }
                return eVar.mo74953f(lVar);
            }

            @C12579k
            /* renamed from: e */
            public final C38495l mo74951e() {
                return this.f63239c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25821e) && Intrinsics.areEqual((Object) this.f63239c, (Object) ((C25821e) obj).f63239c);
            }

            @C12579k
            /* renamed from: f */
            public final C25821e mo74953f(@C12579k C38495l lVar) {
                Intrinsics.checkNotNullParameter(lVar, "memo");
                return new C25821e(lVar);
            }

            @C12579k
            /* renamed from: h */
            public final C38495l mo74954h() {
                return this.f63239c;
            }

            public int hashCode() {
                return this.f63239c.hashCode();
            }

            @C12579k
            public String toString() {
                C38495l lVar = this.f63239c;
                return "RemovedMemo(memo=" + lVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$f */
        public static final class C25822f extends C25816b {

            /* renamed from: d */
            public static final int f63240d = 0;
            @C12579k

            /* renamed from: c */
            public final C38495l f63241c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25822f(@C12579k C38495l lVar) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(lVar, "memo");
                this.f63241c = lVar;
            }

            /* renamed from: g */
            public static /* synthetic */ C25822f m110736g(C25822f fVar, C38495l lVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    lVar = fVar.f63241c;
                }
                return fVar.mo74959f(lVar);
            }

            @C12579k
            /* renamed from: e */
            public final C38495l mo74957e() {
                return this.f63241c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25822f) && Intrinsics.areEqual((Object) this.f63241c, (Object) ((C25822f) obj).f63241c);
            }

            @C12579k
            /* renamed from: f */
            public final C25822f mo74959f(@C12579k C38495l lVar) {
                Intrinsics.checkNotNullParameter(lVar, "memo");
                return new C25822f(lVar);
            }

            @C12579k
            /* renamed from: h */
            public final C38495l mo74960h() {
                return this.f63241c;
            }

            public int hashCode() {
                return this.f63241c.hashCode();
            }

            @C12579k
            public String toString() {
                C38495l lVar = this.f63241c;
                return "UpdatedMemo(memo=" + lVar + ")";
            }
        }

        public /* synthetic */ C25816b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        public C25816b() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$c */
    public static final class C25823c implements C28505u.C28509d {
        @C12579k

        /* renamed from: g */
        public static final C25824a f63242g = new C25824a((DefaultConstructorMarker) null);

        /* renamed from: h */
        public static final int f63243h = 8;
        @C12579k

        /* renamed from: i */
        public static final C25823c f63244i = new C25823c(false, (List<C38495l>) null, (List<OfferProductDomain>) null, (Throwable) null, (MemoListViewSpecialEvent) null);

        /* renamed from: b */
        public final boolean f63245b;
        @C12580l

        /* renamed from: c */
        public final List<C38495l> f63246c;
        @C12580l

        /* renamed from: d */
        public final List<OfferProductDomain> f63247d;
        @C12580l

        /* renamed from: e */
        public final Throwable f63248e;
        @C12580l

        /* renamed from: f */
        public final MemoListViewSpecialEvent f63249f;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$c$a */
        public static final class C25824a {
            public /* synthetic */ C25824a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C25823c mo74977a() {
                return C25823c.f63244i;
            }

            public C25824a() {
            }
        }

        public C25823c(boolean z, @C12580l List<C38495l> list, @C12580l List<OfferProductDomain> list2, @C12580l Throwable th, @C12580l MemoListViewSpecialEvent memoListViewSpecialEvent) {
            this.f63245b = z;
            this.f63246c = list;
            this.f63247d = list2;
            this.f63248e = th;
            this.f63249f = memoListViewSpecialEvent;
        }

        /* renamed from: l */
        public static /* synthetic */ C25823c m110741l(C25823c cVar, boolean z, List<C38495l> list, List<OfferProductDomain> list2, Throwable th, MemoListViewSpecialEvent memoListViewSpecialEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f63245b;
            }
            if ((i & 2) != 0) {
                list = cVar.f63246c;
            }
            List<C38495l> list3 = list;
            if ((i & 4) != 0) {
                list2 = cVar.f63247d;
            }
            List<OfferProductDomain> list4 = list2;
            if ((i & 8) != 0) {
                th = cVar.f63248e;
            }
            Throwable th2 = th;
            if ((i & 16) != 0) {
                memoListViewSpecialEvent = cVar.f63249f;
            }
            return cVar.mo74971k(z, list3, list4, th2, memoListViewSpecialEvent);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25823c)) {
                return false;
            }
            C25823c cVar = (C25823c) obj;
            return this.f63245b == cVar.f63245b && Intrinsics.areEqual((Object) this.f63246c, (Object) cVar.f63246c) && Intrinsics.areEqual((Object) this.f63247d, (Object) cVar.f63247d) && Intrinsics.areEqual((Object) this.f63248e, (Object) cVar.f63248e) && this.f63249f == cVar.f63249f;
        }

        /* renamed from: f */
        public final boolean mo74964f() {
            return this.f63245b;
        }

        @C12580l
        /* renamed from: g */
        public final List<C38495l> mo74965g() {
            return this.f63246c;
        }

        @C12580l
        /* renamed from: h */
        public final List<OfferProductDomain> mo74966h() {
            return this.f63247d;
        }

        public int hashCode() {
            boolean z = this.f63245b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<C38495l> list = this.f63246c;
            int i2 = 0;
            int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            List<OfferProductDomain> list2 = this.f63247d;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            Throwable th = this.f63248e;
            int hashCode3 = (hashCode2 + (th == null ? 0 : th.hashCode())) * 31;
            MemoListViewSpecialEvent memoListViewSpecialEvent = this.f63249f;
            if (memoListViewSpecialEvent != null) {
                i2 = memoListViewSpecialEvent.hashCode();
            }
            return hashCode3 + i2;
        }

        @C12580l
        /* renamed from: i */
        public final Throwable mo74968i() {
            return this.f63248e;
        }

        public final boolean isLoading() {
            return this.f63245b;
        }

        @C12580l
        /* renamed from: j */
        public final MemoListViewSpecialEvent mo74970j() {
            return this.f63249f;
        }

        @C12579k
        /* renamed from: k */
        public final C25823c mo74971k(boolean z, @C12580l List<C38495l> list, @C12580l List<OfferProductDomain> list2, @C12580l Throwable th, @C12580l MemoListViewSpecialEvent memoListViewSpecialEvent) {
            return new C25823c(z, list, list2, th, memoListViewSpecialEvent);
        }

        @C12580l
        /* renamed from: m */
        public final Throwable mo74972m() {
            return this.f63248e;
        }

        @C12580l
        /* renamed from: n */
        public final List<C38495l> mo74973n() {
            return this.f63246c;
        }

        @C12580l
        /* renamed from: o */
        public final List<OfferProductDomain> mo74974o() {
            return this.f63247d;
        }

        @C12580l
        /* renamed from: p */
        public final MemoListViewSpecialEvent mo74975p() {
            return this.f63249f;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f63245b;
            List<C38495l> list = this.f63246c;
            List<OfferProductDomain> list2 = this.f63247d;
            Throwable th = this.f63248e;
            MemoListViewSpecialEvent memoListViewSpecialEvent = this.f63249f;
            return "UIState(isLoading=" + z + ", memoList=" + list + ", productList=" + list2 + ", errorEvent=" + th + ", specialEvent=" + memoListViewSpecialEvent + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$d */
    public interface C25825d extends C28505u.C28506a {
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e */
    public static abstract class C25826e implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f63250a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e$a */
        public static final class C25827a extends C25826e {

            /* renamed from: c */
            public static final int f63251c = 0;
            @C12579k

            /* renamed from: b */
            public final C38495l f63252b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25827a(@C12579k C38495l lVar) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(lVar, "memo");
                this.f63252b = lVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C25827a m110753c(C25827a aVar, C38495l lVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    lVar = aVar.f63252b;
                }
                return aVar.mo74979b(lVar);
            }

            @C12579k
            /* renamed from: a */
            public final C38495l mo74978a() {
                return this.f63252b;
            }

            @C12579k
            /* renamed from: b */
            public final C25827a mo74979b(@C12579k C38495l lVar) {
                Intrinsics.checkNotNullParameter(lVar, "memo");
                return new C25827a(lVar);
            }

            @C12579k
            /* renamed from: d */
            public final C38495l mo74980d() {
                return this.f63252b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25827a) && Intrinsics.areEqual((Object) this.f63252b, (Object) ((C25827a) obj).f63252b);
            }

            public int hashCode() {
                return this.f63252b.hashCode();
            }

            @C12579k
            public String toString() {
                C38495l lVar = this.f63252b;
                return "AddMemo(memo=" + lVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e$b */
        public static final class C25828b extends C25826e {

            /* renamed from: c */
            public static final int f63253c = 0;

            /* renamed from: b */
            public final boolean f63254b;

            public C25828b(boolean z) {
                super((DefaultConstructorMarker) null);
                this.f63254b = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C25828b m110757c(C25828b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f63254b;
                }
                return bVar.mo74985b(z);
            }

            /* renamed from: a */
            public final boolean mo74984a() {
                return this.f63254b;
            }

            @C12579k
            /* renamed from: b */
            public final C25828b mo74985b(boolean z) {
                return new C25828b(z);
            }

            /* renamed from: d */
            public final boolean mo74986d() {
                return this.f63254b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25828b) && this.f63254b == ((C25828b) obj).f63254b;
            }

            public int hashCode() {
                boolean z = this.f63254b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f63254b;
                return "ClearMemoList(onlyChecked=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e$c */
        public static final class C25829c extends C25826e {
            @C12579k

            /* renamed from: b */
            public static final C25829c f63255b = new C25829c();

            /* renamed from: c */
            public static final int f63256c = 0;

            public C25829c() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e$d */
        public static final class C25830d extends C25826e {
            @C12579k

            /* renamed from: b */
            public static final C25830d f63257b = new C25830d();

            /* renamed from: c */
            public static final int f63258c = 0;

            public C25830d() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e$e */
        public static final class C25831e extends C25826e {
            @C12579k

            /* renamed from: b */
            public static final C25831e f63259b = new C25831e();

            /* renamed from: c */
            public static final int f63260c = 0;

            public C25831e() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e$f */
        public static final class C25832f extends C25826e {

            /* renamed from: c */
            public static final int f63261c = 0;
            @C12579k

            /* renamed from: b */
            public final C38495l f63262b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25832f(@C12579k C38495l lVar) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(lVar, "memo");
                this.f63262b = lVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C25832f m110761c(C25832f fVar, C38495l lVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    lVar = fVar.f63262b;
                }
                return fVar.mo74991b(lVar);
            }

            @C12579k
            /* renamed from: a */
            public final C38495l mo74990a() {
                return this.f63262b;
            }

            @C12579k
            /* renamed from: b */
            public final C25832f mo74991b(@C12579k C38495l lVar) {
                Intrinsics.checkNotNullParameter(lVar, "memo");
                return new C25832f(lVar);
            }

            @C12579k
            /* renamed from: d */
            public final C38495l mo74992d() {
                return this.f63262b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25832f) && Intrinsics.areEqual((Object) this.f63262b, (Object) ((C25832f) obj).f63262b);
            }

            public int hashCode() {
                return this.f63262b.hashCode();
            }

            @C12579k
            public String toString() {
                C38495l lVar = this.f63262b;
                return "RemoveMemo(memo=" + lVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$e$g */
        public static final class C25833g extends C25826e {

            /* renamed from: c */
            public static final int f63263c = 0;
            @C12579k

            /* renamed from: b */
            public final C38495l f63264b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25833g(@C12579k C38495l lVar) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(lVar, "memo");
                this.f63264b = lVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C25833g m110765c(C25833g gVar, C38495l lVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    lVar = gVar.f63264b;
                }
                return gVar.mo74997b(lVar);
            }

            @C12579k
            /* renamed from: a */
            public final C38495l mo74996a() {
                return this.f63264b;
            }

            @C12579k
            /* renamed from: b */
            public final C25833g mo74997b(@C12579k C38495l lVar) {
                Intrinsics.checkNotNullParameter(lVar, "memo");
                return new C25833g(lVar);
            }

            @C12579k
            /* renamed from: d */
            public final C38495l mo74998d() {
                return this.f63264b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25833g) && Intrinsics.areEqual((Object) this.f63264b, (Object) ((C25833g) obj).f63264b);
            }

            public int hashCode() {
                return this.f63264b.hashCode();
            }

            @C12579k
            public String toString() {
                C38495l lVar = this.f63264b;
                return "UpdateMemo(memo=" + lVar + ")";
            }
        }

        public /* synthetic */ C25826e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25826e() {
        }
    }

    @C11363r0({"SMAP\nMemoListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$reducer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1549#2:208\n1620#2,3:209\n766#2:212\n857#2,2:213\n*S KotlinDebug\n*F\n+ 1 MemoListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$reducer$1\n*L\n84#1:208\n84#1:209,3\n87#1:212\n87#1:213,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$f */
    public static final class C25834f implements C28505u.C28508c<C25823c, C25816b> {

        /* renamed from: a */
        public static final C25834f f63265a = new C25834f();

        @C12579k
        /* renamed from: b */
        public final C25823c mo32307a(@C12579k C25823c cVar, @C12579k C25816b bVar) {
            C25816b bVar2 = bVar;
            Intrinsics.checkNotNullParameter(cVar, "previousState");
            Intrinsics.checkNotNullParameter(bVar2, "partial");
            C25823c l = C25823c.m110741l(cVar, false, (List) null, (List) null, (Throwable) null, (MemoListViewSpecialEvent) null, 2, (Object) null);
            if (bVar2 instanceof C25816b.C25818b) {
                return C25823c.m110741l(l, ((C25816b.C25818b) bVar2).mo74942h(), (List) null, (List) null, (Throwable) null, (MemoListViewSpecialEvent) null, 30, (Object) null);
            } else if (bVar2 instanceof C25816b.C25817a) {
                return C25823c.m110741l(l, false, (List) null, (List) null, ((C25816b.C25817a) bVar2).mo74936h(), (MemoListViewSpecialEvent) null, 23, (Object) null);
            } else if (bVar2 instanceof C25816b.C25820d) {
                return C25823c.m110741l(l, false, ((C25816b.C25820d) bVar2).mo74948h(), (List) null, (Throwable) null, (MemoListViewSpecialEvent) null, 29, (Object) null);
            } else if (Intrinsics.areEqual((Object) bVar2, (Object) C25816b.C25819c.f63234c)) {
                return C25823c.m110741l(l, false, (List) null, (List) null, (Throwable) null, MemoListViewSpecialEvent.MemoAdded, 15, (Object) null);
            } else {
                ArrayList arrayList = null;
                if (bVar2 instanceof C25816b.C25822f) {
                    List<C38495l> n = cVar.mo74973n();
                    if (n != null) {
                        Iterable<C38495l> iterable = n;
                        arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
                        for (C38495l lVar : iterable) {
                            C25816b.C25822f fVar = (C25816b.C25822f) bVar2;
                            if (Intrinsics.areEqual((Object) lVar.mo122100W(), (Object) fVar.mo74960h().mo122100W())) {
                                lVar = fVar.mo74960h();
                            }
                            arrayList.add(lVar);
                        }
                    }
                    return C25823c.m110741l(l, false, arrayList, (List) null, (Throwable) null, (MemoListViewSpecialEvent) null, 29, (Object) null);
                } else if (bVar2 instanceof C25816b.C25821e) {
                    List<C38495l> n2 = cVar.mo74973n();
                    if (n2 != null) {
                        arrayList = new ArrayList();
                        for (Object next : n2) {
                            if (!Intrinsics.areEqual((Object) ((C38495l) next).mo122100W(), (Object) ((C25816b.C25821e) bVar2).mo74954h().mo122100W())) {
                                arrayList.add(next);
                            }
                        }
                    }
                    return C25823c.m110741l(l, false, arrayList, (List) null, (Throwable) null, (MemoListViewSpecialEvent) null, 29, (Object) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public MemoListViewModel(@C12579k AddMemoListUseCase addMemoListUseCase, @C12579k ClearMemoListUseCase clearMemoListUseCase, @C12579k DeleteMemoListUseCase deleteMemoListUseCase, @C12579k GetMemoListUseCase getMemoListUseCase, @C12579k UpdateMemoListUseCase updateMemoListUseCase, @C12579k SearchWithListUseCase searchWithListUseCase, @C12579k ClearAppManager clearAppManager) {
        super(C25823c.f63242g.mo74977a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(addMemoListUseCase, "addMemoListUseCase");
        Intrinsics.checkNotNullParameter(clearMemoListUseCase, "clearMemoListUseCase");
        Intrinsics.checkNotNullParameter(deleteMemoListUseCase, "deleteMemoListUseCase");
        Intrinsics.checkNotNullParameter(getMemoListUseCase, "getMemoListUseCase");
        Intrinsics.checkNotNullParameter(updateMemoListUseCase, "updateMemoListUseCase");
        Intrinsics.checkNotNullParameter(searchWithListUseCase, "searchWithListUseCase");
        Intrinsics.checkNotNullParameter(clearAppManager, "clearAppManager");
        this.f63219a = addMemoListUseCase;
        this.f63220b = clearMemoListUseCase;
        this.f63221c = deleteMemoListUseCase;
        this.f63222d = getMemoListUseCase;
        this.f63223e = updateMemoListUseCase;
        this.f63224f = searchWithListUseCase;
        this.f63225g = clearAppManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74917l0(com.carrefour.fid.android.presentation.models.C38495l r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$addMemo$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$addMemo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$addMemo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$addMemo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$addMemo$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0084
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x006d
        L_0x004b:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b r8 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b
            r8.<init>(r4)
            r6.mo74923r0(r8)
            com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase r8 = r6.f63219a
            com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$a
            java.lang.String r7 = r7.mo122102Z()
            r2.<init>(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r8.m172933invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r8 = r6
        L_0x006d:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x008a
            r2 = r7
            kotlin.d2 r2 = (kotlin.C11079d2) r2
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r8.mo74920o0(r0)
            if (r0 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r0 = r8
        L_0x0084:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$c r8 = com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.C25816b.C25819c.f63234c
            r0.mo74923r0(r8)
            r8 = r0
        L_0x008a:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x0098
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a
            r0.<init>(r7)
            r8.mo74923r0(r0)
        L_0x0098:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.mo74917l0(com.carrefour.fid.android.presentation.models.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74918m0(boolean r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$clearMemoList$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$clearMemoList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$clearMemoList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$clearMemoList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$clearMemoList$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0081
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x006a
        L_0x004b:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b r8 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b
            r8.<init>(r4)
            r6.mo74923r0(r8)
            com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase r8 = r6.f63220b
            if (r7 == 0) goto L_0x005d
            com.carrefour.fid.android.core.type.a$a r7 = com.carrefour.fid.android.core.type.C36368a.C36369a.f89966c
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r8.m172934invokegIAlus(r7, r0)
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r8 = r6
        L_0x006a:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x0082
            r2 = r7
            kotlin.d2 r2 = (kotlin.C11079d2) r2
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r8.mo74920o0(r0)
            if (r0 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r0 = r8
        L_0x0081:
            r8 = r0
        L_0x0082:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x0090
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a
            r0.<init>(r7)
            r8.mo74923r0(r0)
        L_0x0090:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.mo74918m0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n0 */
    public final Object mo74919n0(C11045c<? super C11079d2> cVar) {
        Object a = this.f63225g.mo111416a(cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74920o0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$fetchMemoList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$fetchMemoList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$fetchMemoList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$fetchMemoList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$fetchMemoList$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b r5 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b
            r5.<init>(r3)
            r4.mo74923r0(r5)
            com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase r5 = r4.f63222d
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172936invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r4
        L_0x0054:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x0065
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$d r2 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$d
            r2.<init>(r1)
            r0.mo74923r0(r2)
        L_0x0065:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r5)
            if (r5 == 0) goto L_0x0073
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a r1 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a
            r1.<init>(r5)
            r0.mo74923r0(r1)
        L_0x0073:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.mo74920o0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74921p0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$loadProductOfferList$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$loadProductOfferList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$loadProductOfferList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$loadProductOfferList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$loadProductOfferList$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00c1
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0062
        L_0x0049:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b r9 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$b
            r9.<init>(r4)
            r8.mo74923r0(r9)
            com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase r9 = r8.f63222d
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172936invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r2 = r8
        L_0x0062:
            boolean r4 = kotlin.Result.m38710j(r9)
            if (r4 == 0) goto L_0x00c3
            r4 = r9
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0076:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x008f
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.carrefour.fid.android.presentation.models.l r7 = (com.carrefour.fid.android.presentation.models.C38495l) r7
            com.carrefour.fid.android.core.type.a r7 = r7.mo122101X()
            boolean r7 = r7 instanceof com.carrefour.fid.android.core.type.C36368a.C36370b
            if (r7 == 0) goto L_0x0076
            r5.add(r6)
            goto L_0x0076
        L_0x008f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x009e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r6 = r5.next()
            com.carrefour.fid.android.presentation.models.l r6 = (com.carrefour.fid.android.presentation.models.C38495l) r6
            java.lang.String r6 = r6.mo122102Z()
            r4.add(r6)
            goto L_0x009e
        L_0x00b2:
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r2.mo74925t0(r4, r0)
            if (r0 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            r1 = r9
            r0 = r2
        L_0x00c1:
            r2 = r0
            r9 = r1
        L_0x00c3:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)
            if (r9 == 0) goto L_0x00d1
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a
            r0.<init>(r9)
            r2.mo74923r0(r0)
        L_0x00d1:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.mo74921p0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: q0 */
    public Object processIntent(@C12579k C25826e eVar, @C12579k C11045c<? super C11079d2> cVar) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new MemoListViewModel$processIntent$2(eVar, this, (C11045c<? super MemoListViewModel$processIntent$2>) null), 3, (Object) null);
        return C11079d2.f28267a;
    }

    /* renamed from: r0 */
    public final void mo74923r0(C25816b bVar) {
        reduceAndPublishState(this.f63226h, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74924s0(com.carrefour.fid.android.presentation.models.C38495l r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$removeMemo$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$removeMemo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$removeMemo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$removeMemo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$removeMemo$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0081
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.presentation.models.l r7 = (com.carrefour.fid.android.presentation.models.C38495l) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x005f
        L_0x004c:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.account.store.memo.DeleteMemoListUseCase r8 = r6.f63221c
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172935invokegIAlus(r7, r0)
            if (r8 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r6
        L_0x005f:
            r5 = r8
            r8 = r7
            r7 = r5
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$e r4 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$e
            r4.<init>(r8)
            r2.mo74923r0(r4)
            boolean r8 = kotlin.Result.m38710j(r7)
            if (r8 == 0) goto L_0x0082
            r8 = r7
            kotlin.d2 r8 = (kotlin.C11079d2) r8
            r0.L$0 = r2
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r2.mo74920o0(r0)
            if (r8 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r0 = r2
        L_0x0081:
            r2 = r0
        L_0x0082:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x0090
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a r8 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a
            r8.<init>(r7)
            r2.mo74923r0(r8)
        L_0x0090:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.mo74924s0(com.carrefour.fid.android.presentation.models.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74925t0(java.util.List<java.lang.String> r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$searchWithList$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$searchWithList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$searchWithList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$searchWithList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$searchWithList$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase r6 = r4.f63224f
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m173001invokegIAlus(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r5 = r4
        L_0x004c:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            if (r0 == 0) goto L_0x0063
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a r1 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a
            com.carrefour.fid.android.shared.io.SearchWithListResultThrowable r2 = new com.carrefour.fid.android.shared.io.SearchWithListResultThrowable
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r0)
            r1.<init>(r2)
            r5.mo74923r0(r1)
        L_0x0063:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x0091
            com.carrefour.fid.android.data.entities.APIMRecommendedNeeds r6 = (com.carrefour.fid.android.data.entities.APIMRecommendedNeeds) r6
            java.util.HashMap r6 = com.carrefour.fid.android.data.entities.extension.C36446e.m149515a(r6)
            if (r6 == 0) goto L_0x0079
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            if (r3 == 0) goto L_0x0089
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$a r6 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.<init>(r0)
            r5.emitEvent(r6)
            goto L_0x0091
        L_0x0089:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$a r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$a
            r0.<init>(r6)
            r5.emitEvent(r0)
        L_0x0091:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.mo74925t0(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74926u0(com.carrefour.fid.android.presentation.models.C38495l r14, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$updateMemo$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$updateMemo$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$updateMemo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$updateMemo$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$updateMemo$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r14 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r0
            kotlin.C11661u0.m45747n(r15)
            goto L_0x009f
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003b:
            java.lang.Object r14 = r0.L$1
            com.carrefour.fid.android.presentation.models.l r14 = (com.carrefour.fid.android.presentation.models.C38495l) r14
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel) r2
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
        L_0x004c:
            r12 = r15
            r15 = r14
            r14 = r12
            goto L_0x0080
        L_0x0050:
            kotlin.C11661u0.m45747n(r15)
            r6 = 0
            r7 = 0
            com.carrefour.fid.android.core.type.a r15 = r14.mo122101X()
            com.carrefour.fid.android.core.type.a$a r2 = com.carrefour.fid.android.core.type.C36368a.C36369a.f89966c
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r2)
            if (r15 == 0) goto L_0x0065
            com.carrefour.fid.android.core.type.a$b r15 = com.carrefour.fid.android.core.type.C36368a.C36370b.f89968c
            r8 = r15
            goto L_0x0066
        L_0x0065:
            r8 = r2
        L_0x0066:
            r9 = 0
            r10 = 11
            r11 = 0
            r5 = r14
            com.carrefour.fid.android.presentation.models.l r14 = com.carrefour.fid.android.presentation.models.C38495l.m159707M(r5, r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase r15 = r13.f63223e
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r15 = r15.m172937invokegIAlus(r14, r0)
            if (r15 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r2 = r13
            goto L_0x004c
        L_0x0080:
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$f r4 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$f
            r4.<init>(r15)
            r2.mo74923r0(r4)
            boolean r15 = kotlin.Result.m38710j(r14)
            if (r15 == 0) goto L_0x00a0
            r15 = r14
            kotlin.d2 r15 = (kotlin.C11079d2) r15
            r0.L$0 = r2
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r15 = r2.mo74920o0(r0)
            if (r15 != r1) goto L_0x009e
            return r1
        L_0x009e:
            r0 = r2
        L_0x009f:
            r2 = r0
        L_0x00a0:
            java.lang.Throwable r14 = kotlin.Result.m38705e(r14)
            if (r14 == 0) goto L_0x00ae
            com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a r15 = new com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$b$a
            r15.<init>(r14)
            r2.mo74923r0(r15)
        L_0x00ae:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel.mo74926u0(com.carrefour.fid.android.presentation.models.l, kotlin.coroutines.c):java.lang.Object");
    }
}
