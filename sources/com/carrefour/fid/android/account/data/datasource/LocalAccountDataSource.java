package com.carrefour.fid.android.account.data.datasource;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.core.C18570d;
import com.carrefour.fid.android.UserInfo;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.carrefour.fid.android.shared.data.datastore.proto.C28635b;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nLocalAccountDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAccountDataSource.kt\ncom/carrefour/fid/android/account/data/datasource/LocalAccountDataSource\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n53#2:80\n55#2:84\n50#3:81\n55#3:83\n106#4:82\n288#5,2:85\n288#5,2:87\n*S KotlinDebug\n*F\n+ 1 LocalAccountDataSource.kt\ncom/carrefour/fid/android/account/data/datasource/LocalAccountDataSource\n*L\n38#1:80\n38#1:84\n38#1:81\n38#1:83\n38#1:82\n48#1:85,2\n50#1:87,2\n*E\n"})
public final class LocalAccountDataSource implements C28635b<UserInfo> {

    /* renamed from: b */
    public static final int f32330b = 8;
    @C12579k

    /* renamed from: a */
    public final Context f32331a;

    @Inject
    public LocalAccountDataSource(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f32331a = context;
    }

    @C12579k
    /* renamed from: a */
    public C18570d<UserInfo> mo31121a() {
        return C13177e.f32357a.mo31159d(this.f32331a);
    }

    @C12580l
    /* renamed from: b */
    public Object mo31122b(@C12579k C11045c<? super C11907e<UserInfo>> cVar) {
        return new LocalAccountDataSource$get$$inlined$map$1(mo31121a().getData());
    }

    @C12580l
    public Object clear(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo31121a().mo53543a(new LocalAccountDataSource$clear$2((C11045c<? super LocalAccountDataSource$clear$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: d */
    public Object mo31123c(@C12579k UserInfo userInfo, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo31121a().mo53543a(new LocalAccountDataSource$addOrReplace$2(userInfo, (C11045c<? super LocalAccountDataSource$addOrReplace$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: e */
    public final Context mo31126e() {
        return this.f32331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.util.List<com.carrefour.fid.android.domain.models.account.Phone>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31127f(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.account.Address r10, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.account.Address r11, @org.jetbrains.annotations.C12580l java.util.List<com.carrefour.fid.android.domain.models.account.Phone> r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveAddressesUserAccount$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveAddressesUserAccount$1 r0 = (com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveAddressesUserAccount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveAddressesUserAccount$1 r0 = new com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveAddressesUserAccount$1
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0062
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r13)
            goto L_0x011f
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            java.lang.Object r10 = r0.L$3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.L$2
            com.carrefour.fid.android.domain.models.account.Address r11 = (com.carrefour.fid.android.domain.models.account.Address) r11
            java.lang.Object r12 = r0.L$1
            com.carrefour.fid.android.domain.models.account.Address r12 = (com.carrefour.fid.android.domain.models.account.Address) r12
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource r2 = (com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource) r2
            kotlin.C11661u0.m45747n(r13)
            goto L_0x008d
        L_0x004c:
            java.lang.Object r10 = r0.L$3
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r10 = r0.L$2
            r11 = r10
            com.carrefour.fid.android.domain.models.account.Address r11 = (com.carrefour.fid.android.domain.models.account.Address) r11
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.account.Address r10 = (com.carrefour.fid.android.domain.models.account.Address) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource r2 = (com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource) r2
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0077
        L_0x0062:
            kotlin.C11661u0.m45747n(r13)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.label = r5
            java.lang.Object r13 = r9.mo31122b(r0)
            if (r13 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r2 = r9
        L_0x0077:
            kotlinx.coroutines.flow.e r13 = (kotlinx.coroutines.flow.C11907e) r13
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.label = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.C11909g.m47501w0(r13, r0)
            if (r13 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r8 = r12
            r12 = r10
            r10 = r8
        L_0x008d:
            com.carrefour.fid.android.UserInfo r13 = (com.carrefour.fid.android.UserInfo) r13
            if (r13 != 0) goto L_0x0094
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0094:
            r4 = 0
            if (r12 == 0) goto L_0x009d
            com.carrefour.fid.android.UserAddress r12 = com.carrefour.fid.android.account.data.entities.extentions.C13188k.m57165e(r12)
            if (r12 != 0) goto L_0x00cd
        L_0x009d:
            java.util.List r12 = r13.getAddressesList()
            if (r12 == 0) goto L_0x00cc
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x00a9:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00c7
            java.lang.Object r5 = r12.next()
            r6 = r5
            com.carrefour.fid.android.UserAddress r6 = (com.carrefour.fid.android.UserAddress) r6
            java.lang.String r6 = r6.getCategory()
            com.carrefour.fid.android.domain.models.AddressCategory r7 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            java.lang.String r7 = r7.name()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x00a9
            goto L_0x00c8
        L_0x00c7:
            r5 = r4
        L_0x00c8:
            r12 = r5
            com.carrefour.fid.android.UserAddress r12 = (com.carrefour.fid.android.UserAddress) r12
            goto L_0x00cd
        L_0x00cc:
            r12 = r4
        L_0x00cd:
            if (r11 == 0) goto L_0x00d5
            com.carrefour.fid.android.UserAddress r11 = com.carrefour.fid.android.account.data.entities.extentions.C13188k.m57165e(r11)
            if (r11 != 0) goto L_0x0105
        L_0x00d5:
            java.util.List r11 = r13.getAddressesList()
            if (r11 == 0) goto L_0x0104
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x00e1:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00ff
            java.lang.Object r13 = r11.next()
            r5 = r13
            com.carrefour.fid.android.UserAddress r5 = (com.carrefour.fid.android.UserAddress) r5
            java.lang.String r5 = r5.getCategory()
            com.carrefour.fid.android.domain.models.AddressCategory r6 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            java.lang.String r6 = r6.name()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x00e1
            goto L_0x0100
        L_0x00ff:
            r13 = r4
        L_0x0100:
            r11 = r13
            com.carrefour.fid.android.UserAddress r11 = (com.carrefour.fid.android.UserAddress) r11
            goto L_0x0105
        L_0x0104:
            r11 = r4
        L_0x0105:
            androidx.datastore.core.d r13 = r2.mo31121a()
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveAddressesUserAccount$2 r2 = new com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource$saveAddressesUserAccount$2
            r2.<init>(r12, r11, r10, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r4
            r0.label = r3
            java.lang.Object r10 = r13.mo53543a(r2, r0)
            if (r10 != r1) goto L_0x011f
            return r1
        L_0x011f:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource.mo31127f(com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.domain.models.account.Address, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: g */
    public final Object mo31128g(@C12579k List<UserCards> list, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo31121a().mo53543a(new LocalAccountDataSource$saveUserCards$2(list, (C11045c<? super LocalAccountDataSource$saveUserCards$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}
