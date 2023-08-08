package com.carrefour.fid.android.catalogs.data.local.datasource;

import android.content.Context;
import androidx.datastore.core.C18570d;
import com.carrefour.fid.android.FavoriteCatalogProductList;
import com.carrefour.fid.android.shared.data.datastore.proto.C28635b;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCatalogsLocalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogsLocalDataSource.kt\ncom/carrefour/fid/android/catalogs/data/local/datasource/CatalogsLocalDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1747#2,3:62\n1747#2,3:65\n731#2,9:68\n*S KotlinDebug\n*F\n+ 1 CatalogsLocalDataSource.kt\ncom/carrefour/fid/android/catalogs/data/local/datasource/CatalogsLocalDataSource\n*L\n34#1:62,3\n45#1:65,3\n46#1:68,9\n*E\n"})
public final class CatalogsLocalDataSource implements C28635b<FavoriteCatalogProductList> {
    @C12579k

    /* renamed from: a */
    public final Context f100776a;

    @Inject
    public CatalogsLocalDataSource(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f100776a = context;
    }

    /* renamed from: i */
    public static final boolean m161490i(C11300l lVar, Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    @C12579k
    /* renamed from: a */
    public C18570d<FavoriteCatalogProductList> mo31121a() {
        return C39404c.f100780a.mo130456d(this.f100776a);
    }

    @C12580l
    /* renamed from: b */
    public Object mo31122b(@C12579k C11045c<? super C11907e<FavoriteCatalogProductList>> cVar) {
        return mo31121a().getData();
    }

    @C12580l
    public Object clear(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo31121a().mo53543a(new CatalogsLocalDataSource$clear$2((C11045c<? super CatalogsLocalDataSource$clear$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130442e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.CatalogProduct r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$addFavoriteProduct$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$addFavoriteProduct$1 r0 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$addFavoriteProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$addFavoriteProduct$1 r0 = new com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$addFavoriteProduct$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0107
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            java.lang.Object r12 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref.ObjectRef) r12
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.CatalogProduct r4 = (com.carrefour.fid.android.CatalogProduct) r4
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r6 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource) r6
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0098
        L_0x004c:
            java.lang.Object r12 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref.ObjectRef) r12
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.CatalogProduct r6 = (com.carrefour.fid.android.CatalogProduct) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r7 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource) r7
            kotlin.C11661u0.m45747n(r13)
            r10 = r13
            r13 = r12
            r12 = r6
            r6 = r2
            r2 = r10
            goto L_0x0080
        L_0x0065:
            kotlin.C11661u0.m45747n(r13)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.L$3 = r13
            r0.label = r5
            java.lang.Object r2 = r11.mo31122b(r0)
            if (r2 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r7 = r11
            r6 = r13
        L_0x0080:
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            r0.L$0 = r7
            r0.L$1 = r12
            r0.L$2 = r6
            r0.L$3 = r13
            r0.label = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.C11909g.m47501w0(r2, r0)
            if (r2 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r4 = r12
            r12 = r13
            r13 = r2
            r2 = r6
            r6 = r7
        L_0x0098:
            com.carrefour.fid.android.FavoriteCatalogProductList r13 = (com.carrefour.fid.android.FavoriteCatalogProductList) r13
            r7 = 0
            if (r13 == 0) goto L_0x00a2
            java.util.List r13 = r13.getItemsList()
            goto L_0x00a3
        L_0x00a2:
            r13 = r7
        L_0x00a3:
            r8 = 0
            if (r13 != 0) goto L_0x00ab
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            return r12
        L_0x00ab:
            r12.element = r13
            T r12 = r2.element
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r13 = r12 instanceof java.util.Collection
            if (r13 == 0) goto L_0x00c0
            r13 = r12
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x00c0
        L_0x00be:
            r12 = r8
            goto L_0x00df
        L_0x00c0:
            java.util.Iterator r12 = r12.iterator()
        L_0x00c4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00be
            java.lang.Object r13 = r12.next()
            com.carrefour.fid.android.CatalogProduct r13 = (com.carrefour.fid.android.CatalogProduct) r13
            java.lang.String r13 = r13.getProductId()
            java.lang.String r9 = r4.getProductId()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r9)
            if (r13 == 0) goto L_0x00c4
            r12 = r5
        L_0x00df:
            if (r12 == 0) goto L_0x00e3
            r5 = r8
            goto L_0x0107
        L_0x00e3:
            T r12 = r2.element
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.List r12 = kotlin.collections.CollectionsKt___CollectionsKt.m40723z4(r12, r4)
            r2.element = r12
            androidx.datastore.core.d r12 = r6.mo31121a()
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$addFavoriteProduct$3 r13 = new com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$addFavoriteProduct$3
            r13.<init>(r2, r7)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r12 = r12.mo53543a(r13, r0)
            if (r12 != r1) goto L_0x0107
            return r1
        L_0x0107:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource.mo130442e(com.carrefour.fid.android.CatalogProduct, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f */
    public Object mo31123c(@C12579k FavoriteCatalogProductList favoriteCatalogProductList, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo31121a().mo53543a(new CatalogsLocalDataSource$addOrReplace$2(favoriteCatalogProductList, (C11045c<? super CatalogsLocalDataSource$addOrReplace$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: g */
    public final Context mo130444g() {
        return this.f100776a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130445h(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$1 r0 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$1 r0 = new com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0095
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r2 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0063
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r2 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0056
        L_0x0047:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r7.mo31122b(r0)
            if (r8 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r7
        L_0x0056:
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.C11909g.m47501w0(r8, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            com.carrefour.fid.android.FavoriteCatalogProductList r8 = (com.carrefour.fid.android.FavoriteCatalogProductList) r8
            if (r8 == 0) goto L_0x009a
            java.util.List r8 = r8.getItemsList()
            if (r8 == 0) goto L_0x009a
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r8)
            if (r8 != 0) goto L_0x0076
            goto L_0x009a
        L_0x0076:
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$2 r4 = com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$2.f100777f
            com.carrefour.fid.android.catalogs.data.local.datasource.a r6 = new com.carrefour.fid.android.catalogs.data.local.datasource.a
            r6.<init>(r4)
            r8.removeIf(r6)
            androidx.datastore.core.d r2 = r2.mo31121a()
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$3 r4 = new com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeExpiredProducts$3
            r6 = 0
            r4.<init>(r8, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r2.mo53543a(r4, r0)
            if (r8 != r1) goto L_0x0095
            return r1
        L_0x0095:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r8
        L_0x009a:
            r8 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource.mo130445h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0138 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo130446j(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.CatalogProduct r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeFavoriteProduct$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeFavoriteProduct$1 r0 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeFavoriteProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeFavoriteProduct$1 r0 = new com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeFavoriteProduct$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r13)
            goto L_0x013a
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            java.lang.Object r12 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref.ObjectRef) r12
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.CatalogProduct r4 = (com.carrefour.fid.android.CatalogProduct) r4
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r6 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource) r6
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0098
        L_0x004c:
            java.lang.Object r12 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref.ObjectRef) r12
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.CatalogProduct r6 = (com.carrefour.fid.android.CatalogProduct) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource r7 = (com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource) r7
            kotlin.C11661u0.m45747n(r13)
            r10 = r13
            r13 = r12
            r12 = r6
            r6 = r2
            r2 = r10
            goto L_0x0080
        L_0x0065:
            kotlin.C11661u0.m45747n(r13)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.L$3 = r13
            r0.label = r5
            java.lang.Object r2 = r11.mo31122b(r0)
            if (r2 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r7 = r11
            r6 = r13
        L_0x0080:
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            r0.L$0 = r7
            r0.L$1 = r12
            r0.L$2 = r6
            r0.L$3 = r13
            r0.label = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.C11909g.m47501w0(r2, r0)
            if (r2 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r4 = r12
            r12 = r13
            r13 = r2
            r2 = r6
            r6 = r7
        L_0x0098:
            com.carrefour.fid.android.FavoriteCatalogProductList r13 = (com.carrefour.fid.android.FavoriteCatalogProductList) r13
            r7 = 0
            if (r13 == 0) goto L_0x00a2
            java.util.List r13 = r13.getItemsList()
            goto L_0x00a3
        L_0x00a2:
            r13 = r7
        L_0x00a3:
            r8 = 0
            if (r13 != 0) goto L_0x00ab
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r8)
            return r12
        L_0x00ab:
            r12.element = r13
            T r12 = r2.element
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r13 = r12 instanceof java.util.Collection
            if (r13 == 0) goto L_0x00c0
            r13 = r12
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x00c0
        L_0x00be:
            r12 = r8
            goto L_0x00df
        L_0x00c0:
            java.util.Iterator r12 = r12.iterator()
        L_0x00c4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00be
            java.lang.Object r13 = r12.next()
            com.carrefour.fid.android.CatalogProduct r13 = (com.carrefour.fid.android.CatalogProduct) r13
            java.lang.String r13 = r13.getProductId()
            java.lang.String r9 = r4.getProductId()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r9)
            if (r13 == 0) goto L_0x00c4
            r12 = r5
        L_0x00df:
            if (r12 == 0) goto L_0x0139
            T r12 = r2.element
            java.util.List r12 = (java.util.List) r12
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x0119
            int r13 = r12.size()
            java.util.ListIterator r13 = r12.listIterator(r13)
        L_0x00f3:
            boolean r8 = r13.hasPrevious()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r13.previous()
            com.carrefour.fid.android.CatalogProduct r8 = (com.carrefour.fid.android.CatalogProduct) r8
            java.lang.String r8 = r8.getProductId()
            java.lang.String r9 = r4.getProductId()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 != 0) goto L_0x00f3
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            int r13 = r13.nextIndex()
            int r13 = r13 + r5
            java.util.List r12 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r12, r13)
            goto L_0x011d
        L_0x0119:
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x011d:
            r2.element = r12
            androidx.datastore.core.d r12 = r6.mo31121a()
            com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeFavoriteProduct$4 r13 = new com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource$removeFavoriteProduct$4
            r13.<init>(r2, r7)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r12 = r12.mo53543a(r13, r0)
            if (r12 != r1) goto L_0x013a
            return r1
        L_0x0139:
            r5 = r8
        L_0x013a:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource.mo130446j(com.carrefour.fid.android.CatalogProduct, kotlin.coroutines.c):java.lang.Object");
    }
}
