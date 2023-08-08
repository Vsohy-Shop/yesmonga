package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.datasource.ShoppingListDataSource;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38031b;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.ShoppingListSyncState;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import com.carrefour.fid.android.shared.extension.C28748c0;
import com.carrefour.fid.android.shared.p045di.annotation.C28674r;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11636e;
import kotlin.time.C11639g;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.Instant;

@Singleton
@C11363r0({"SMAP\nShoppingListRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListRepository.kt\ncom/carrefour/fid/android/domain/repositories/ShoppingListRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1#2:177\n4#3:178\n4#3:181\n4#3:182\n288#4,2:179\n288#4,2:183\n*S KotlinDebug\n*F\n+ 1 ShoppingListRepository.kt\ncom/carrefour/fid/android/domain/repositories/ShoppingListRepository\n*L\n61#1:178\n121#1:181\n133#1:182\n62#1:179,2\n147#1:183,2\n*E\n"})
public final class ShoppingListRepository {
    @C12579k

    /* renamed from: h */
    public static final C38191a f96760h = new C38191a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final long f96761i = C11636e.m45480k1(C11639g.m45638m0(1, DurationUnit.HOURS));
    @C12579k

    /* renamed from: a */
    public final ShoppingListDataSource f96762a;
    @C12579k

    /* renamed from: b */
    public final LoginRepository f96763b;
    @C12579k

    /* renamed from: c */
    public final PlpProductListDataSource f96764c;
    @C12579k

    /* renamed from: d */
    public final C12074o0 f96765d;
    @C12579k

    /* renamed from: e */
    public final C11940j<Pair<Long, C38030a>> f96766e = C11953v.m47628a(null);
    @C12579k

    /* renamed from: f */
    public final C11940j<List<C38115c>> f96767f;
    @C12579k

    /* renamed from: g */
    public final C11952u<List<C38115c>> f96768g;

    @C11067d(mo22501c = "com.carrefour.fid.android.domain.repositories.ShoppingListRepository$1", mo22502f = "ShoppingListRepository.kt", mo22503i = {}, mo22504l = {56}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.domain.repositories.ShoppingListRepository$1 */
    public static final class C381891 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ ShoppingListRepository this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C381891(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11940j a = this.this$0.f96766e;
                final ShoppingListRepository shoppingListRepository = this.this$0;
                C11944n n1 = C11909g.m47475n1(a, new C11304p<C11908f<? super Pair<? extends Long, ? extends C38030a>>, C11045c<? super C11079d2>, Object>((C11045c<? super C381901>) null) {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return 

                        /* renamed from: com.carrefour.fid.android.domain.repositories.ShoppingListRepository$a */
                        public static final class C38191a {
                            public /* synthetic */ C38191a(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public C38191a() {
                            }
                        }

                        static {
                            C11636e.C11637a aVar = C11636e.f28954b;
                        }

                        @Inject
                        public ShoppingListRepository(@C12579k ShoppingListDataSource shoppingListDataSource, @C12579k LoginRepository loginRepository, @C12579k PlpProductListDataSource plpProductListDataSource, @C28674r @C12579k C12074o0 o0Var) {
                            Intrinsics.checkNotNullParameter(shoppingListDataSource, "dataSource");
                            Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
                            Intrinsics.checkNotNullParameter(plpProductListDataSource, "apiSource");
                            Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
                            this.f96762a = shoppingListDataSource;
                            this.f96763b = loginRepository;
                            this.f96764c = plpProductListDataSource;
                            this.f96765d = o0Var;
                            C11940j<List<C38115c>> a = C11953v.m47628a(new ArrayList());
                            this.f96767f = a;
                            this.f96768g = C11909g.m47470m(a);
                            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C381891(this, (C11045c<? super C381891>) null), 3, (Object) null);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
                        /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
                        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed A[RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
                        /* JADX WARNING: Removed duplicated region for block: B:43:0x0102  */
                        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
                        @org.jetbrains.annotations.C12580l
                        /* renamed from: c */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo119611c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r14) {
                            /*
                                r12 = this;
                                boolean r0 = r14 instanceof com.carrefour.fid.android.domain.repositories.ShoppingListRepository$addProductToShoppingList$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r14
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$addProductToShoppingList$1 r0 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository$addProductToShoppingList$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$addProductToShoppingList$1 r0 = new com.carrefour.fid.android.domain.repositories.ShoppingListRepository$addProductToShoppingList$1
                                r0.<init>(r12, r14)
                            L_0x0018:
                                java.lang.Object r14 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 4
                                r4 = 3
                                r5 = 2
                                r6 = 1
                                r7 = 0
                                if (r2 == 0) goto L_0x0079
                                if (r2 == r6) goto L_0x0067
                                if (r2 == r5) goto L_0x0054
                                if (r2 == r4) goto L_0x003e
                                if (r2 != r3) goto L_0x0036
                                java.lang.Object r13 = r0.L$0
                                kotlin.C11661u0.m45747n(r14)
                                goto L_0x0101
                            L_0x0036:
                                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                                r13.<init>(r14)
                                throw r13
                            L_0x003e:
                                java.lang.Object r13 = r0.L$1
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r13 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r13
                                java.lang.Object r2 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r2 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r2
                                kotlin.C11661u0.m45747n(r14)
                                kotlin.Result r14 = (kotlin.Result) r14
                                java.lang.Object r14 = r14.mo21858l()
                            L_0x004f:
                                r11 = r14
                                r14 = r13
                                r13 = r11
                                goto L_0x00ee
                            L_0x0054:
                                java.lang.Object r13 = r0.L$2
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r13 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r13
                                java.lang.Object r2 = r0.L$1
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r2 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c) r2
                                java.lang.Object r5 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r5 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r5
                                kotlin.C11661u0.m45747n(r14)
                                r14 = r2
                                r2 = r5
                                goto L_0x00d1
                            L_0x0067:
                                java.lang.Object r13 = r0.L$1
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r13 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c) r13
                                java.lang.Object r2 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r2 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r2
                                kotlin.C11661u0.m45747n(r14)
                                kotlin.Result r14 = (kotlin.Result) r14
                                java.lang.Object r14 = r14.mo21858l()
                                goto L_0x008a
                            L_0x0079:
                                kotlin.C11661u0.m45747n(r14)
                                r0.L$0 = r12
                                r0.L$1 = r13
                                r0.label = r6
                                java.lang.Object r14 = r12.mo119615g(r0)
                                if (r14 != r1) goto L_0x0089
                                return r1
                            L_0x0089:
                                r2 = r12
                            L_0x008a:
                                java.lang.Throwable r6 = kotlin.Result.m38705e(r14)
                                if (r6 != 0) goto L_0x0102
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r14 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r14
                                java.util.List r6 = r14.mo117697e()
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                java.util.Iterator r6 = r6.iterator()
                            L_0x009c:
                                boolean r8 = r6.hasNext()
                                if (r8 == 0) goto L_0x00b8
                                java.lang.Object r8 = r6.next()
                                r9 = r8
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r9 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r9
                                java.lang.String r9 = r9.mo117724a()
                                java.lang.String r10 = r13.mo117719f()
                                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
                                if (r9 == 0) goto L_0x009c
                                goto L_0x00b9
                            L_0x00b8:
                                r8 = r7
                            L_0x00b9:
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r8 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r8
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r6 = r2.mo119617i(r8, r14, r13)
                                r0.L$0 = r2
                                r0.L$1 = r13
                                r0.L$2 = r14
                                r0.label = r5
                                java.lang.Object r5 = r2.mo119620l(r6, r0)
                                if (r5 != r1) goto L_0x00ce
                                return r1
                            L_0x00ce:
                                r11 = r14
                                r14 = r13
                                r13 = r11
                            L_0x00d1:
                                com.carrefour.fid.android.data.datasource.ShoppingListDataSource r5 = r2.f96762a
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.b r6 = r13.mo117699f()
                                java.lang.String r6 = r6.mo117708g()
                                com.carrefour.fid.android.data.entities.ShoppingListItemToAddRequest r14 = com.carrefour.fid.android.data.entities.C36420c.m149380a(r14)
                                r0.L$0 = r2
                                r0.L$1 = r13
                                r0.L$2 = r7
                                r0.label = r4
                                java.lang.Object r14 = r5.mo108683e(r6, r14, r0)
                                if (r14 != r1) goto L_0x004f
                                return r1
                            L_0x00ee:
                                java.lang.Throwable r4 = kotlin.Result.m38705e(r13)
                                if (r4 == 0) goto L_0x0101
                                r0.L$0 = r13
                                r0.L$1 = r7
                                r0.label = r3
                                java.lang.Object r14 = r2.mo119620l(r14, r0)
                                if (r14 != r1) goto L_0x0101
                                return r1
                            L_0x0101:
                                return r13
                            L_0x0102:
                                kotlin.Result$a r13 = kotlin.Result.f28060a
                                java.lang.Object r13 = kotlin.C11661u0.m45734a(r6)
                                java.lang.Object r13 = kotlin.Result.m38702b(r13)
                                return r13
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.repositories.ShoppingListRepository.mo119611c(com.carrefour.fid.android.domain.models.favorites.shoppinglist.c, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
                        /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
                        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                        @org.jetbrains.annotations.C12580l
                        /* renamed from: d */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo119612d(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a>> r6) {
                            /*
                                r5 = this;
                                boolean r0 = r6 instanceof com.carrefour.fid.android.domain.repositories.ShoppingListRepository$fetchShoppingList$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r6
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$fetchShoppingList$1 r0 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository$fetchShoppingList$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$fetchShoppingList$1 r0 = new com.carrefour.fid.android.domain.repositories.ShoppingListRepository$fetchShoppingList$1
                                r0.<init>(r5, r6)
                            L_0x0018:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 2
                                r4 = 1
                                if (r2 == 0) goto L_0x0044
                                if (r2 == r4) goto L_0x0036
                                if (r2 != r3) goto L_0x002e
                                java.lang.Object r0 = r0.L$0
                                kotlin.C11661u0.m45747n(r6)
                                goto L_0x0072
                            L_0x002e:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r0)
                                throw r6
                            L_0x0036:
                                java.lang.Object r2 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r2 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r2
                                kotlin.C11661u0.m45747n(r6)
                                kotlin.Result r6 = (kotlin.Result) r6
                                java.lang.Object r6 = r6.mo21858l()
                                goto L_0x005d
                            L_0x0044:
                                kotlin.C11661u0.m45747n(r6)
                                com.carrefour.fid.android.account.data.repositories.LoginRepository r6 = r5.f96763b
                                boolean r6 = com.carrefour.fid.android.account.data.extension.C13195a.m57177a(r6)
                                if (r6 == 0) goto L_0x0074
                                com.carrefour.fid.android.data.datasource.ShoppingListDataSource r6 = r5.f96762a
                                r0.L$0 = r5
                                r0.label = r4
                                java.lang.Object r6 = r6.mo108685g(r0)
                                if (r6 != r1) goto L_0x005c
                                return r1
                            L_0x005c:
                                r2 = r5
                            L_0x005d:
                                boolean r4 = kotlin.Result.m38710j(r6)
                                if (r4 == 0) goto L_0x0073
                                r4 = r6
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r4 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r4
                                r0.L$0 = r6
                                r0.label = r3
                                java.lang.Object r0 = r2.mo119620l(r4, r0)
                                if (r0 != r1) goto L_0x0071
                                return r1
                            L_0x0071:
                                r0 = r6
                            L_0x0072:
                                r6 = r0
                            L_0x0073:
                                return r6
                            L_0x0074:
                                kotlin.Result$a r6 = kotlin.Result.f28060a
                                java.lang.Exception r6 = new java.lang.Exception
                                java.lang.String r0 = "user not connected"
                                r6.<init>(r0)
                                java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
                                java.lang.Object r6 = kotlin.Result.m38702b(r6)
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.repositories.ShoppingListRepository.mo119612d(kotlin.coroutines.c):java.lang.Object");
                        }

                        @C12579k
                        /* renamed from: e */
                        public final C11952u<Pair<Long, C38030a>> mo119613e() {
                            return this.f96766e;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
                        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                        @org.jetbrains.annotations.C12580l
                        /* renamed from: f */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo119614f(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r6, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.product.Gtin> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends java.util.List<com.carrefour.fid.android.domain.models.product.plp.C38115c>>> r8) {
                            /*
                                r5 = this;
                                boolean r0 = r8 instanceof com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getFavoriteProductsList$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r8
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getFavoriteProductsList$1 r0 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getFavoriteProductsList$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getFavoriteProductsList$1 r0 = new com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getFavoriteProductsList$1
                                r0.<init>(r5, r8)
                            L_0x0018:
                                java.lang.Object r8 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 2
                                r4 = 1
                                if (r2 == 0) goto L_0x0046
                                if (r2 == r4) goto L_0x0038
                                if (r2 != r3) goto L_0x0030
                                java.lang.Object r6 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r6 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r6
                                kotlin.C11661u0.m45747n(r8)
                                goto L_0x0079
                            L_0x0030:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L_0x0038:
                                java.lang.Object r6 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r6 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r6
                                kotlin.C11661u0.m45747n(r8)
                                kotlin.Result r8 = (kotlin.Result) r8
                                java.lang.Object r7 = r8.mo21858l()
                                goto L_0x0057
                            L_0x0046:
                                kotlin.C11661u0.m45747n(r8)
                                com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r8 = r5.f96764c
                                r0.L$0 = r5
                                r0.label = r4
                                java.lang.Object r7 = r8.mo79834e(r6, r7, r0)
                                if (r7 != r1) goto L_0x0056
                                return r1
                            L_0x0056:
                                r6 = r5
                            L_0x0057:
                                boolean r8 = kotlin.Result.m38710j(r7)
                                if (r8 == 0) goto L_0x0079
                                r8 = r7
                                com.carrefour.fid.android.product.domain.model.b r8 = (com.carrefour.fid.android.product.domain.model.C27584b) r8
                                kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.product.plp.c>> r2 = r6.f96767f
                                java.util.List r8 = r8.mo80078p()
                                java.util.Collection r8 = (java.util.Collection) r8
                                java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r8)
                                r0.L$0 = r6
                                r0.L$1 = r7
                                r0.label = r3
                                java.lang.Object r7 = r2.emit(r8, r0)
                                if (r7 != r1) goto L_0x0079
                                return r1
                            L_0x0079:
                                kotlinx.coroutines.flow.u<java.util.List<com.carrefour.fid.android.domain.models.product.plp.c>> r6 = r6.f96768g
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.repositories.ShoppingListRepository.mo119614f(java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                        @org.jetbrains.annotations.C12580l
                        /* renamed from: g */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo119615g(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a>> r9) {
                            /*
                                r8 = this;
                                boolean r0 = r9 instanceof com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getShoppingListFromCache$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r9
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getShoppingListFromCache$1 r0 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getShoppingListFromCache$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getShoppingListFromCache$1 r0 = new com.carrefour.fid.android.domain.repositories.ShoppingListRepository$getShoppingListFromCache$1
                                r0.<init>(r8, r9)
                            L_0x0018:
                                java.lang.Object r9 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0037
                                if (r2 != r3) goto L_0x002f
                                kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0086 }
                                kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0086 }
                                java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x0086 }
                                goto L_0x007c
                            L_0x002f:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r0)
                                throw r9
                            L_0x0037:
                                kotlin.C11661u0.m45747n(r9)
                                kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x0086 }
                                kotlinx.coroutines.flow.u r9 = r8.mo119613e()     // Catch:{ all -> 0x0086 }
                                java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0086 }
                                kotlin.Pair r9 = (kotlin.Pair) r9     // Catch:{ all -> 0x0086 }
                                if (r9 == 0) goto L_0x0073
                                java.lang.Object r2 = r9.mo21846a()     // Catch:{ all -> 0x0086 }
                                java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ all -> 0x0086 }
                                long r4 = r2.longValue()     // Catch:{ all -> 0x0086 }
                                org.joda.time.Instant r2 = org.joda.time.Instant.m51507H1()     // Catch:{ all -> 0x0086 }
                                long r6 = r2.mo27912k()     // Catch:{ all -> 0x0086 }
                                long r6 = r6 - r4
                                long r4 = f96761i     // Catch:{ all -> 0x0086 }
                                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                                if (r2 >= 0) goto L_0x0063
                                r2 = r3
                                goto L_0x0064
                            L_0x0063:
                                r2 = 0
                            L_0x0064:
                                if (r2 == 0) goto L_0x0067
                                goto L_0x0068
                            L_0x0067:
                                r9 = 0
                            L_0x0068:
                                if (r9 == 0) goto L_0x0073
                                java.lang.Object r9 = r9.mo21851f()     // Catch:{ all -> 0x0086 }
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r9 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r9     // Catch:{ all -> 0x0086 }
                                if (r9 == 0) goto L_0x0073
                                goto L_0x0081
                            L_0x0073:
                                r0.label = r3     // Catch:{ all -> 0x0086 }
                                java.lang.Object r9 = r8.mo119612d(r0)     // Catch:{ all -> 0x0086 }
                                if (r9 != r1) goto L_0x007c
                                return r1
                            L_0x007c:
                                kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0086 }
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r9 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r9     // Catch:{ all -> 0x0086 }
                            L_0x0081:
                                java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0086 }
                                goto L_0x0091
                            L_0x0086:
                                r9 = move-exception
                                kotlin.Result$a r0 = kotlin.Result.f28060a
                                java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
                                java.lang.Object r9 = kotlin.Result.m38702b(r9)
                            L_0x0091:
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.repositories.ShoppingListRepository.mo119615g(kotlin.coroutines.c):java.lang.Object");
                        }

                        @C12579k
                        /* renamed from: h */
                        public final C11952u<List<C38115c>> mo119616h() {
                            return this.f96768g;
                        }

                        /* renamed from: i */
                        public final C38030a mo119617i(C38033d dVar, C38030a aVar, C38032c cVar) {
                            if (dVar == null) {
                                return C38030a.m156788d(aVar, (C38031b) null, CollectionsKt___CollectionsKt.m40723z4(aVar.mo117697e(), C38205l.m158436b(cVar)), 1, (Object) null);
                            }
                            if (dVar instanceof C38033d.C38034a) {
                                return C38030a.m156788d(aVar, (C38031b) null, C28748c0.m119037a(aVar.mo117697e(), dVar, C38033d.C38034a.m156814g((C38033d.C38034a) dVar, (String) null, (String) null, ShoppingListSyncState.SYNCING, 3, (Object) null)), 1, (Object) null);
                            } else if (dVar instanceof C38033d.C38035b) {
                                return aVar;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
                        /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
                        /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                        @org.jetbrains.annotations.C12580l
                        /* renamed from: j */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo119618j(@org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r10) {
                            /*
                                r8 = this;
                                boolean r0 = r10 instanceof com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r10
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$1 r0 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$1 r0 = new com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$1
                                r0.<init>(r8, r10)
                            L_0x0018:
                                java.lang.Object r10 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 2
                                r4 = 1
                                if (r2 == 0) goto L_0x004d
                                if (r2 == r4) goto L_0x003b
                                if (r2 != r3) goto L_0x0033
                                kotlin.C11661u0.m45747n(r10)
                                kotlin.Result r10 = (kotlin.Result) r10
                                java.lang.Object r9 = r10.mo21858l()
                                goto L_0x00af
                            L_0x0033:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r10)
                                throw r9
                            L_0x003b:
                                java.lang.Object r9 = r0.L$1
                                java.lang.String r9 = (java.lang.String) r9
                                java.lang.Object r2 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r2 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r2
                                kotlin.C11661u0.m45747n(r10)
                                kotlin.Result r10 = (kotlin.Result) r10
                                java.lang.Object r10 = r10.mo21858l()
                                goto L_0x005e
                            L_0x004d:
                                kotlin.C11661u0.m45747n(r10)
                                r0.L$0 = r8
                                r0.L$1 = r9
                                r0.label = r4
                                java.lang.Object r10 = r8.mo119615g(r0)
                                if (r10 != r1) goto L_0x005d
                                return r1
                            L_0x005d:
                                r2 = r8
                            L_0x005e:
                                java.lang.Throwable r4 = kotlin.Result.m38705e(r10)
                                if (r4 != 0) goto L_0x00da
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r10 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r10
                                java.util.List r4 = r10.mo117697e()
                                java.lang.Iterable r4 = (java.lang.Iterable) r4
                                java.util.Iterator r4 = r4.iterator()
                            L_0x0070:
                                boolean r5 = r4.hasNext()
                                r6 = 0
                                if (r5 == 0) goto L_0x0089
                                java.lang.Object r5 = r4.next()
                                r7 = r5
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r7 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r7
                                java.lang.String r7 = r7.mo117724a()
                                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
                                if (r7 == 0) goto L_0x0070
                                goto L_0x008a
                            L_0x0089:
                                r5 = r6
                            L_0x008a:
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r5 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r5
                                if (r5 == 0) goto L_0x00b0
                                boolean r4 = r5 instanceof com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d.C38034a
                                if (r4 == 0) goto L_0x00b0
                                com.carrefour.fid.android.data.datasource.ShoppingListDataSource r9 = r2.f96762a
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.b r10 = r10.mo117699f()
                                java.lang.String r10 = r10.mo117708g()
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d$a r5 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d.C38034a) r5
                                java.lang.String r2 = r5.mo117731h()
                                r0.L$0 = r6
                                r0.L$1 = r6
                                r0.label = r3
                                java.lang.Object r9 = r9.mo108687i(r10, r2, r0)
                                if (r9 != r1) goto L_0x00af
                                return r1
                            L_0x00af:
                                return r9
                            L_0x00b0:
                                kotlin.Result$a r10 = kotlin.Result.f28060a
                                java.lang.Throwable r10 = new java.lang.Throwable
                                java.lang.String r9 = com.carrefour.fid.android.domain.models.product.Gtin.m157313h(r9)
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>()
                                java.lang.String r1 = "Can't find ean \""
                                r0.append(r1)
                                r0.append(r9)
                                java.lang.String r9 = "\" in shopping list"
                                r0.append(r9)
                                java.lang.String r9 = r0.toString()
                                r10.<init>(r9)
                                java.lang.Object r9 = kotlin.C11661u0.m45734a(r10)
                                java.lang.Object r9 = kotlin.Result.m38702b(r9)
                                return r9
                            L_0x00da:
                                kotlin.Result$a r9 = kotlin.Result.f28060a
                                java.lang.Object r9 = kotlin.C11661u0.m45734a(r4)
                                java.lang.Object r9 = kotlin.Result.m38702b(r9)
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.repositories.ShoppingListRepository.mo119618j(java.lang.String, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
                        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
                        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
                        /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
                        /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
                        /* JADX WARNING: Removed duplicated region for block: B:57:0x0166  */
                        /* JADX WARNING: Removed duplicated region for block: B:58:0x0194  */
                        /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
                        @org.jetbrains.annotations.C12580l
                        /* renamed from: k */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo119619k(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r14) {
                            /*
                                r12 = this;
                                boolean r0 = r14 instanceof com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$2
                                if (r0 == 0) goto L_0x0013
                                r0 = r14
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$2 r0 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$2) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$2 r0 = new com.carrefour.fid.android.domain.repositories.ShoppingListRepository$removeProductFromShoppingList$2
                                r0.<init>(r12, r14)
                            L_0x0018:
                                java.lang.Object r14 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 4
                                r4 = 3
                                r5 = 2
                                r6 = 1
                                r7 = 0
                                if (r2 == 0) goto L_0x0089
                                if (r2 == r6) goto L_0x0076
                                if (r2 == r5) goto L_0x0060
                                if (r2 == r4) goto L_0x0046
                                if (r2 != r3) goto L_0x003e
                                java.lang.Object r13 = r0.L$2
                                java.lang.Object r1 = r0.L$1
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r1 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c) r1
                                java.lang.Object r0 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r0 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r0
                                kotlin.C11661u0.m45747n(r14)
                                goto L_0x0123
                            L_0x003e:
                                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                                r13.<init>(r14)
                                throw r13
                            L_0x0046:
                                java.lang.Object r13 = r0.L$2
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r13 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r13
                                java.lang.Object r2 = r0.L$1
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r2 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c) r2
                                java.lang.Object r4 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r4 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r4
                                kotlin.C11661u0.m45747n(r14)
                                kotlin.Result r14 = (kotlin.Result) r14
                                java.lang.Object r14 = r14.mo21858l()
                                r11 = r14
                                r14 = r13
                                r13 = r11
                                goto L_0x010c
                            L_0x0060:
                                java.lang.Object r13 = r0.L$3
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r13 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r13
                                java.lang.Object r2 = r0.L$2
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r2 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r2
                                java.lang.Object r5 = r0.L$1
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r5 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c) r5
                                java.lang.Object r6 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r6 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r6
                                kotlin.C11661u0.m45747n(r14)
                                r14 = r2
                                goto L_0x00e3
                            L_0x0076:
                                java.lang.Object r13 = r0.L$1
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r13 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c) r13
                                java.lang.Object r2 = r0.L$0
                                com.carrefour.fid.android.domain.repositories.ShoppingListRepository r2 = (com.carrefour.fid.android.domain.repositories.ShoppingListRepository) r2
                                kotlin.C11661u0.m45747n(r14)
                                kotlin.Result r14 = (kotlin.Result) r14
                                java.lang.Object r14 = r14.mo21858l()
                                r6 = r2
                                goto L_0x009a
                            L_0x0089:
                                kotlin.C11661u0.m45747n(r14)
                                r0.L$0 = r12
                                r0.L$1 = r13
                                r0.label = r6
                                java.lang.Object r14 = r12.mo119615g(r0)
                                if (r14 != r1) goto L_0x0099
                                return r1
                            L_0x0099:
                                r6 = r12
                            L_0x009a:
                                java.lang.Throwable r2 = kotlin.Result.m38705e(r14)
                                if (r2 != 0) goto L_0x0194
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r14 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r14
                                java.util.List r2 = r14.mo117697e()
                                java.lang.Iterable r2 = (java.lang.Iterable) r2
                                java.util.Iterator r2 = r2.iterator()
                            L_0x00ac:
                                boolean r8 = r2.hasNext()
                                if (r8 == 0) goto L_0x00c8
                                java.lang.Object r8 = r2.next()
                                r9 = r8
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r9 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r9
                                java.lang.String r9 = r9.mo117724a()
                                java.lang.String r10 = r13.mo117719f()
                                boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
                                if (r9 == 0) goto L_0x00ac
                                goto L_0x00c9
                            L_0x00c8:
                                r8 = r7
                            L_0x00c9:
                                r2 = r8
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r2 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r2
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r8 = r6.mo119617i(r2, r14, r13)
                                r0.L$0 = r6
                                r0.L$1 = r13
                                r0.L$2 = r14
                                r0.L$3 = r2
                                r0.label = r5
                                java.lang.Object r5 = r6.mo119620l(r8, r0)
                                if (r5 != r1) goto L_0x00e1
                                return r1
                            L_0x00e1:
                                r5 = r13
                                r13 = r2
                            L_0x00e3:
                                if (r13 == 0) goto L_0x0166
                                boolean r2 = r13 instanceof com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d.C38034a
                                if (r2 == 0) goto L_0x0166
                                com.carrefour.fid.android.data.datasource.ShoppingListDataSource r2 = r6.f96762a
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.b r8 = r14.mo117699f()
                                java.lang.String r8 = r8.mo117708g()
                                com.carrefour.fid.android.domain.models.favorites.shoppinglist.d$a r13 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d.C38034a) r13
                                java.lang.String r13 = r13.mo117731h()
                                r0.L$0 = r6
                                r0.L$1 = r5
                                r0.L$2 = r14
                                r0.L$3 = r7
                                r0.label = r4
                                java.lang.Object r13 = r2.mo108687i(r8, r13, r0)
                                if (r13 != r1) goto L_0x010a
                                return r1
                            L_0x010a:
                                r2 = r5
                                r4 = r6
                            L_0x010c:
                                java.lang.Throwable r5 = kotlin.Result.m38705e(r13)
                                if (r5 == 0) goto L_0x0125
                                r0.L$0 = r4
                                r0.L$1 = r2
                                r0.L$2 = r13
                                r0.label = r3
                                java.lang.Object r14 = r4.mo119620l(r14, r0)
                                if (r14 != r1) goto L_0x0121
                                return r1
                            L_0x0121:
                                r1 = r2
                                r0 = r4
                            L_0x0123:
                                r4 = r0
                                r2 = r1
                            L_0x0125:
                                boolean r14 = kotlin.Result.m38710j(r13)
                                if (r14 == 0) goto L_0x0193
                                r14 = r13
                                kotlin.d2 r14 = (kotlin.C11079d2) r14
                                kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.product.plp.c>> r14 = r4.f96767f
                                java.lang.Object r14 = r14.getValue()
                                java.util.Collection r14 = (java.util.Collection) r14
                                kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.domain.models.product.plp.c>> r0 = r4.f96767f
                                java.lang.Object r0 = r0.getValue()
                                java.lang.Iterable r0 = (java.lang.Iterable) r0
                                java.util.Iterator r0 = r0.iterator()
                            L_0x0142:
                                boolean r1 = r0.hasNext()
                                if (r1 == 0) goto L_0x015e
                                java.lang.Object r1 = r0.next()
                                r3 = r1
                                com.carrefour.fid.android.domain.models.product.plp.c r3 = (com.carrefour.fid.android.domain.models.product.plp.C38115c) r3
                                java.lang.String r3 = r3.mo118850A()
                                java.lang.String r4 = r2.mo117719f()
                                boolean r3 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r3, r4)
                                if (r3 == 0) goto L_0x0142
                                r7 = r1
                            L_0x015e:
                                java.util.Collection r14 = kotlin.jvm.internal.C11370u0.m43685a(r14)
                                r14.remove(r7)
                                goto L_0x0193
                            L_0x0166:
                                kotlin.Result$a r13 = kotlin.Result.f28060a
                                java.lang.Throwable r13 = new java.lang.Throwable
                                java.lang.String r14 = r5.mo117719f()
                                java.lang.String r14 = com.carrefour.fid.android.domain.models.product.Gtin.m157313h(r14)
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>()
                                java.lang.String r1 = "Can't find GTIN \""
                                r0.append(r1)
                                r0.append(r14)
                                java.lang.String r14 = "\" in shopping list"
                                r0.append(r14)
                                java.lang.String r14 = r0.toString()
                                r13.<init>(r14)
                                java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
                                java.lang.Object r13 = kotlin.Result.m38702b(r13)
                            L_0x0193:
                                return r13
                            L_0x0194:
                                kotlin.Result$a r13 = kotlin.Result.f28060a
                                java.lang.Object r13 = kotlin.C11661u0.m45734a(r2)
                                java.lang.Object r13 = kotlin.Result.m38702b(r13)
                                return r13
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.repositories.ShoppingListRepository.mo119619k(com.carrefour.fid.android.domain.models.favorites.shoppinglist.c, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* renamed from: l */
                        public final Object mo119620l(C38030a aVar, C11045c<? super C11079d2> cVar) {
                            Object emit = this.f96766e.emit(C11078d1.m42659a(C11064a.m42621g(Instant.m51507H1().mo27912k()), aVar), cVar);
                            return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
                        }
                    }
