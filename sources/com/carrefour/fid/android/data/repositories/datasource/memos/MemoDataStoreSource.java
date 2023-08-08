package com.carrefour.fid.android.data.repositories.datasource.memos;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.datastore.core.C18570d;
import com.carrefour.fid.android.MemoItem;
import com.carrefour.fid.android.MemoItemList;
import com.carrefour.fid.android.data.localdatasource.datastores.protoserializer.C36552a;
import com.carrefour.fid.android.shared.data.datastore.proto.C28634a;
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
@C11363r0({"SMAP\nMemoDataStoreSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoDataStoreSource.kt\ncom/carrefour/fid/android/data/repositories/datasource/memos/MemoDataStoreSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,53:1\n350#2,7:54\n350#2,7:61\n748#2,10:73\n53#3:68\n55#3:72\n50#4:69\n55#4:71\n106#5:70\n*S KotlinDebug\n*F\n+ 1 MemoDataStoreSource.kt\ncom/carrefour/fid/android/data/repositories/datasource/memos/MemoDataStoreSource\n*L\n28#1:54,7\n34#1:61,7\n50#1:73,10\n46#1:68\n46#1:72\n46#1:69\n46#1:71\n46#1:70\n*E\n"})
public final class MemoDataStoreSource implements C28634a<MemoItemList, MemoItem> {

    /* renamed from: b */
    public static final int f90462b = 8;
    @C12579k

    /* renamed from: a */
    public final Context f90463a;

    @Inject
    public MemoDataStoreSource(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f90463a = context;
    }

    @C12579k
    /* renamed from: a */
    public C18570d<MemoItemList> mo83527a() {
        return C36552a.f90266a.mo111398d(this.f90463a);
    }

    @C12580l
    /* renamed from: b */
    public Object mo83528b(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo83527a().mo53543a(new MemoDataStoreSource$clearAll$2((C11045c<? super MemoDataStoreSource$clearAll$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: c */
    public Object mo83529c(@C12579k C11045c<? super C11907e<? extends List<MemoItem>>> cVar) {
        return new MemoDataStoreSource$getAll$$inlined$map$1(mo83527a().getData());
    }

    @C12580l
    /* renamed from: g */
    public Object mo83533g(@C12579k List<MemoItem> list, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo83527a().mo53543a(new MemoDataStoreSource$replaceAll$2(list, (C11045c<? super MemoDataStoreSource$replaceAll$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: h */
    public Object mo83532f(@C12579k MemoItem memoItem, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo83527a().mo53543a(new MemoDataStoreSource$add$2(memoItem, (C11045c<? super MemoDataStoreSource$add$2>) null), cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a A[EDGE_INSN: B:36:0x009a->B:30:0x009a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111579i(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.core.type.C36368a r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$1 r0 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$1 r0 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00b0
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            java.lang.Object r12 = r0.L$1
            com.carrefour.fid.android.core.type.a r12 = (com.carrefour.fid.android.core.type.C36368a) r12
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r2 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource) r2
            kotlin.C11661u0.m45747n(r13)
            goto L_0x005a
        L_0x0041:
            kotlin.C11661u0.m45747n(r13)
            androidx.datastore.core.d r13 = r11.mo83527a()
            kotlinx.coroutines.flow.e r13 = r13.getData()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.C11909g.m47495u0(r13, r0)
            if (r13 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r11
        L_0x005a:
            com.carrefour.fid.android.MemoItemList r13 = (com.carrefour.fid.android.MemoItemList) r13
            java.util.List r5 = r13.getItemsList()
            java.lang.String r6 = "data.itemsList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x0071:
            boolean r8 = r5.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x009a
            java.lang.Object r8 = r5.next()
            if (r7 == 0) goto L_0x0082
            r6.add(r8)
            goto L_0x0071
        L_0x0082:
            r10 = r8
            com.carrefour.fid.android.MemoItem r10 = (com.carrefour.fid.android.MemoItem) r10
            java.lang.String r10 = r10.getItemType()
            if (r12 == 0) goto L_0x008f
            java.lang.String r9 = r12.mo108613a()
        L_0x008f:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r9)
            if (r9 != 0) goto L_0x0071
            r6.add(r8)
            r7 = r4
            goto L_0x0071
        L_0x009a:
            androidx.datastore.core.d r12 = r2.mo83527a()
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$3 r2 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$clearType$3
            r2.<init>(r13, r9)
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r12 = r12.mo53543a(r2, r0)
            if (r12 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource.mo111579i(com.carrefour.fid.android.core.type.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo83531e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.MemoItem r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$delete$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$delete$1 r0 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$delete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$delete$1 r0 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$delete$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00a0
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.MemoItem r9 = (com.carrefour.fid.android.MemoItem) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r2 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x005a
        L_0x0041:
            kotlin.C11661u0.m45747n(r10)
            androidx.datastore.core.d r10 = r8.mo83527a()
            kotlinx.coroutines.flow.e r10 = r10.getData()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.C11909g.m47495u0(r10, r0)
            if (r10 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r8
        L_0x005a:
            com.carrefour.fid.android.MemoItemList r10 = (com.carrefour.fid.android.MemoItemList) r10
            java.util.List r4 = r10.getItemsList()
            java.lang.String r5 = "data.itemsList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x006a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r4.next()
            com.carrefour.fid.android.MemoItem r6 = (com.carrefour.fid.android.MemoItem) r6
            java.lang.String r6 = r6.getItemId()
            java.lang.String r7 = r9.getItemId()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            int r5 = r5 + 1
            goto L_0x006a
        L_0x0088:
            r5 = -1
        L_0x0089:
            androidx.datastore.core.d r9 = r2.mo83527a()
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$delete$2 r2 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$delete$2
            r4 = 0
            r2.<init>(r10, r5, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r9 = r9.mo53543a(r2, r0)
            if (r9 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource.mo83531e(com.carrefour.fid.android.MemoItem, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: k */
    public final Context mo111581k() {
        return this.f90463a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo83530d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.MemoItem r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$update$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$update$1 r0 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$update$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$update$1 r0 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$update$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00a0
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.MemoItem r8 = (com.carrefour.fid.android.MemoItem) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r2 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x005a
        L_0x0041:
            kotlin.C11661u0.m45747n(r9)
            androidx.datastore.core.d r9 = r7.mo83527a()
            kotlinx.coroutines.flow.e r9 = r9.getData()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.C11909g.m47495u0(r9, r0)
            if (r9 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r7
        L_0x005a:
            com.carrefour.fid.android.MemoItemList r9 = (com.carrefour.fid.android.MemoItemList) r9
            java.util.List r9 = r9.getItemsList()
            java.lang.String r4 = "data.itemsList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            java.util.Iterator r9 = r9.iterator()
            r4 = 0
        L_0x006a:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r9.next()
            com.carrefour.fid.android.MemoItem r5 = (com.carrefour.fid.android.MemoItem) r5
            java.lang.String r5 = r5.getItemId()
            java.lang.String r6 = r8.getItemId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            int r4 = r4 + 1
            goto L_0x006a
        L_0x0088:
            r4 = -1
        L_0x0089:
            androidx.datastore.core.d r9 = r2.mo83527a()
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$update$2 r2 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource$update$2
            r5 = 0
            r2.<init>(r4, r8, r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r9.mo53543a(r2, r0)
            if (r8 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource.mo83530d(com.carrefour.fid.android.MemoItem, kotlin.coroutines.c):java.lang.Object");
    }
}
