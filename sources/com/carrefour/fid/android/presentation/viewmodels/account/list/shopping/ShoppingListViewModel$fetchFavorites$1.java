package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$fetchFavorites$1", mo22502f = "ShoppingListViewModel.kt", mo22503i = {}, mo22504l = {50, 52, 53, 56, 63, 63, 59}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nShoppingListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/ShoppingListViewModel$fetchFavorites$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n*S KotlinDebug\n*F\n+ 1 ShoppingListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/ShoppingListViewModel$fetchFavorites$1\n*L\n62#1:142\n62#1:143,3\n*E\n"})
public final class ShoppingListViewModel$fetchFavorites$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShoppingListViewModel this$0;

    @C11363r0({"SMAP\nShoppingListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/ShoppingListViewModel$fetchFavorites$1$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n*S KotlinDebug\n*F\n+ 1 ShoppingListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/ShoppingListViewModel$fetchFavorites$1$2$1$1\n*L\n64#1:142\n64#1:143,3\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$fetchFavorites$1$a */
    public static final class C25881a implements C11908f<List<? extends C38184v>> {

        /* renamed from: a */
        public final /* synthetic */ ShoppingListViewModel f63358a;

        public C25881a(ShoppingListViewModel shoppingListViewModel) {
            this.f63358a = shoppingListViewModel;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k List<? extends C38184v> list, @C12579k C11045c<? super C11079d2> cVar) {
            C11940j<C25891f> o0 = this.f63358a.mo75134o0();
            Iterable<C38184v> iterable = list;
            ShoppingListViewModel shoppingListViewModel = this.f63358a;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C38184v k0 : iterable) {
                arrayList.add(shoppingListViewModel.mo75139u0(k0, C10930d1.m40892k()));
            }
            Object emit = o0.emit(new C25891f(new C28892e.C28895c(arrayList)), cVar);
            if (emit == C11063b.m42612h()) {
                return emit;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListViewModel$fetchFavorites$1(ShoppingListViewModel shoppingListViewModel, C11045c<? super ShoppingListViewModel$fetchFavorites$1> cVar) {
        super(2, cVar);
        this.this$0 = shoppingListViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ShoppingListViewModel$fetchFavorites$1(this.this$0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        r8 = r7.this$0.f63354e;
        r7.label = 2;
        r8 = r8.m172965invokeIoAF18A(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r8 != r0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        r8 = r7.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (kotlin.Result.m38705e(r1) == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        r8 = r8.mo75134o0();
        r3 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25891f(new com.carrefour.fid.android.shared.type.C28892e.C28893a(new com.carrefour.fid.android.shared.p046io.RequireSignInThrowable()));
        r7.L$0 = r1;
        r7.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        if (r8.emit(r3, r7) != r0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r8 = r7.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (kotlin.Result.m38710j(r1) == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        r3 = (kotlin.C11079d2) r1;
        r3 = r8.f63350a;
        r4 = com.carrefour.fid.android.core.types.RequestType.ONLINE;
        r7.L$0 = r1;
        r7.L$1 = r8;
        r7.label = 4;
        r3 = r3.m172966invokegIAlus(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        if (r3 != r0) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        r6 = r1;
        r1 = r8;
        r8 = r3;
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
        r4 = kotlin.Result.m38705e(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        if (r4 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r8 = ((com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r8).mo117697e();
        r4 = new java.util.ArrayList(kotlin.collections.C10978t.m41495Y(r8, 10));
        r8 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00dd, code lost:
        if (r8.hasNext() == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
        r4.add(com.carrefour.fid.android.domain.models.product.Gtin.m157307a(com.carrefour.fid.android.domain.models.product.Gtin.m157308b(((com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r8.next()).mo117724a())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f5, code lost:
        r8 = r1.f63353d;
        r5 = new com.carrefour.fid.android.domain.interactors.product.C37774n.C37775a(r4);
        r7.L$0 = r3;
        r7.L$1 = r1;
        r7.label = 5;
        r8 = r8.invoke(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0109, code lost:
        if (r8 != r0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010c, code lost:
        r4 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$fetchFavorites$1.C25881a(r1);
        r7.L$0 = r3;
        r7.L$1 = null;
        r7.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011e, code lost:
        if (((kotlinx.coroutines.flow.C11907e) r8).collect(r4, r7) != r0) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0120, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0121, code lost:
        r8 = r1.mo75134o0();
        r1 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25891f(new com.carrefour.fid.android.shared.type.C28892e.C28893a(r4));
        r7.L$0 = r3;
        r7.L$1 = null;
        r7.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013a, code lost:
        if (r8.emit(r1, r7) != r0) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013f, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r1 = r8;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0044;
                case 2: goto L_0x0039;
                case 3: goto L_0x0033;
                case 4: goto L_0x0022;
                case 5: goto L_0x0017;
                case 6: goto L_0x0012;
                case 7: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0012:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x013d
        L_0x0017:
            java.lang.Object r1 = r7.L$1
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel) r1
            java.lang.Object r3 = r7.L$0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x010c
        L_0x0022:
            java.lang.Object r1 = r7.L$1
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel) r1
            java.lang.Object r3 = r7.L$0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x00bc
        L_0x0033:
            java.lang.Object r1 = r7.L$0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0099
        L_0x0039:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
        L_0x0042:
            r1 = r8
            goto L_0x0072
        L_0x0044:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0062
        L_0x0048:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r8 = r7.this$0
            kotlinx.coroutines.flow.j r8 = r8.mo75134o0()
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f r1 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f
            com.carrefour.fid.android.shared.type.e$b r3 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            r1.<init>(r3)
            r3 = 1
            r7.label = r3
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L_0x0062
            return r0
        L_0x0062:
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r8 = r7.this$0
            com.carrefour.fid.android.domain.interactors.user.i r8 = r8.f63354e
            r1 = 2
            r7.label = r1
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r7)
            if (r8 != r0) goto L_0x0042
            return r0
        L_0x0072:
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r8 = r7.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 == 0) goto L_0x0099
            kotlinx.coroutines.flow.j r8 = r8.mo75134o0()
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f r3 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f
            com.carrefour.fid.android.shared.type.e$a r4 = new com.carrefour.fid.android.shared.type.e$a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r5 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r5.<init>()
            r4.<init>(r5)
            r3.<init>(r4)
            r7.L$0 = r1
            r4 = 3
            r7.label = r4
            java.lang.Object r8 = r8.emit(r3, r7)
            if (r8 != r0) goto L_0x0099
            return r0
        L_0x0099:
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r8 = r7.this$0
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x013d
            r3 = r1
            kotlin.d2 r3 = (kotlin.C11079d2) r3
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.b r3 = r8.f63350a
            com.carrefour.fid.android.core.types.RequestType r4 = com.carrefour.fid.android.core.types.RequestType.ONLINE
            r7.L$0 = r1
            r7.L$1 = r8
            r5 = 4
            r7.label = r5
            java.lang.Object r3 = r3.m172966invokegIAlus(r4, r7)
            if (r3 != r0) goto L_0x00b8
            return r0
        L_0x00b8:
            r6 = r1
            r1 = r8
            r8 = r3
            r3 = r6
        L_0x00bc:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r8)
            if (r4 != 0) goto L_0x0121
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r8 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r8
            java.util.List r8 = r8.mo117697e()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r8, r5)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x00d9:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x00f5
            java.lang.Object r5 = r8.next()
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.d r5 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d) r5
            java.lang.String r5 = r5.mo117724a()
            java.lang.String r5 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r5)
            com.carrefour.fid.android.domain.models.product.Gtin r5 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r5)
            r4.add(r5)
            goto L_0x00d9
        L_0x00f5:
            com.carrefour.fid.android.domain.interactors.product.n r8 = r1.f63353d
            com.carrefour.fid.android.domain.interactors.product.n$a r5 = new com.carrefour.fid.android.domain.interactors.product.n$a
            r5.<init>(r4)
            r7.L$0 = r3
            r7.L$1 = r1
            r4 = 5
            r7.label = r4
            java.lang.Object r8 = r8.invoke(r5, r7)
            if (r8 != r0) goto L_0x010c
            return r0
        L_0x010c:
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$fetchFavorites$1$a r4 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$fetchFavorites$1$a
            r4.<init>(r1)
            r7.L$0 = r3
            r7.L$1 = r2
            r1 = 6
            r7.label = r1
            java.lang.Object r8 = r8.collect(r4, r7)
            if (r8 != r0) goto L_0x013d
            return r0
        L_0x0121:
            kotlinx.coroutines.flow.j r8 = r1.mo75134o0()
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f r1 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.f
            com.carrefour.fid.android.shared.type.e$a r5 = new com.carrefour.fid.android.shared.type.e$a
            r5.<init>(r4)
            r1.<init>(r5)
            r7.L$0 = r3
            r7.L$1 = r2
            r2 = 7
            r7.label = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L_0x013d
            return r0
        L_0x013d:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$fetchFavorites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ShoppingListViewModel$fetchFavorites$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
