package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B9\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J;\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryState;", "", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "component1", "", "component2", "Lkotlin/d2;", "component3", "storeService", "minimumAmountOrder", "validate", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/shared/type/e;", "getStoreService", "()Lcom/carrefour/fid/android/shared/type/e;", "getMinimumAmountOrder", "getValidate", "", "states", "Ljava/util/List;", "getGlobalState", "globalState", "<init>", "(Lcom/carrefour/fid/android/shared/type/e;Lcom/carrefour/fid/android/shared/type/e;Lcom/carrefour/fid/android/shared/type/e;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliverySummaryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1726#2,3:155\n1747#2,3:158\n2624#2,3:161\n1747#2,3:164\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryState\n*L\n145#1:155,3\n146#1:158,3\n146#1:161,3\n147#1:164,3\n*E\n"})
public final class DeliverySummaryState {
    @C12579k
    private final C28892e<String> minimumAmountOrder;
    @C12579k
    private final List<C28892e<Object>> states;
    @C12579k
    private final C28892e<StoreService> storeService;
    @C12579k
    private final C28892e<C11079d2> validate;

    public DeliverySummaryState() {
        this((C28892e) null, (C28892e) null, (C28892e) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DeliverySummaryState copy$default(DeliverySummaryState deliverySummaryState, C28892e<StoreService> eVar, C28892e<String> eVar2, C28892e<C11079d2> eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = deliverySummaryState.storeService;
        }
        if ((i & 2) != 0) {
            eVar2 = deliverySummaryState.minimumAmountOrder;
        }
        if ((i & 4) != 0) {
            eVar3 = deliverySummaryState.validate;
        }
        return deliverySummaryState.copy(eVar, eVar2, eVar3);
    }

    @C12579k
    public final C28892e<StoreService> component1() {
        return this.storeService;
    }

    @C12579k
    public final C28892e<String> component2() {
        return this.minimumAmountOrder;
    }

    @C12579k
    public final C28892e<C11079d2> component3() {
        return this.validate;
    }

    @C12579k
    public final DeliverySummaryState copy(@C12579k C28892e<StoreService> eVar, @C12579k C28892e<String> eVar2, @C12579k C28892e<C11079d2> eVar3) {
        Intrinsics.checkNotNullParameter(eVar, "storeService");
        Intrinsics.checkNotNullParameter(eVar2, "minimumAmountOrder");
        Intrinsics.checkNotNullParameter(eVar3, "validate");
        return new DeliverySummaryState(eVar, eVar2, eVar3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliverySummaryState)) {
            return false;
        }
        DeliverySummaryState deliverySummaryState = (DeliverySummaryState) obj;
        return Intrinsics.areEqual((Object) this.storeService, (Object) deliverySummaryState.storeService) && Intrinsics.areEqual((Object) this.minimumAmountOrder, (Object) deliverySummaryState.minimumAmountOrder) && Intrinsics.areEqual((Object) this.validate, (Object) deliverySummaryState.validate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3 A[EDGE_INSN: B:58:0x00b3->B:48:0x00b3 ?: BREAK  , SYNTHETIC] */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.shared.type.C28892e<kotlin.C11079d2> getGlobalState() {
        /*
            r4 = this;
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.states
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0015
        L_0x0013:
            r0 = r3
            goto L_0x002a
        L_0x0015:
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0013
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28895c
            if (r1 != 0) goto L_0x0019
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0035
            com.carrefour.fid.android.shared.type.e$c r0 = new com.carrefour.fid.android.shared.type.e$c
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            r0.<init>(r1)
            goto L_0x00c4
        L_0x0035:
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.states
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0048
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0048
        L_0x0046:
            r0 = r2
            goto L_0x005d
        L_0x0048:
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28894b
            if (r1 == 0) goto L_0x004c
            r0 = r3
        L_0x005d:
            if (r0 == 0) goto L_0x008c
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.states
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0072
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0072
        L_0x0070:
            r0 = r3
            goto L_0x0087
        L_0x0072:
            java.util.Iterator r0 = r0.iterator()
        L_0x0076:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r1 == 0) goto L_0x0076
            r0 = r2
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            com.carrefour.fid.android.shared.type.e$b r0 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            goto L_0x00c4
        L_0x008c:
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.states
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x009e
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x009e
            goto L_0x00b3
        L_0x009e:
            java.util.Iterator r0 = r0.iterator()
        L_0x00a2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            boolean r1 = r1 instanceof com.carrefour.fid.android.shared.type.C28892e.C28893a
            if (r1 == 0) goto L_0x00a2
            r2 = r3
        L_0x00b3:
            if (r2 == 0) goto L_0x00c2
            java.util.List<com.carrefour.fid.android.shared.type.e<java.lang.Object>> r0 = r4.states
            java.lang.Throwable r0 = com.carrefour.fid.android.shared.type.C28897f.m119477a(r0)
            com.carrefour.fid.android.shared.type.e$a r1 = new com.carrefour.fid.android.shared.type.e$a
            r1.<init>(r0)
            r0 = r1
            goto L_0x00c4
        L_0x00c2:
            com.carrefour.fid.android.shared.type.e$d r0 = com.carrefour.fid.android.shared.type.C28892e.C28896d.f70785b
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryState.getGlobalState():com.carrefour.fid.android.shared.type.e");
    }

    @C12579k
    public final C28892e<String> getMinimumAmountOrder() {
        return this.minimumAmountOrder;
    }

    @C12579k
    public final C28892e<StoreService> getStoreService() {
        return this.storeService;
    }

    @C12579k
    public final C28892e<C11079d2> getValidate() {
        return this.validate;
    }

    public int hashCode() {
        return (((this.storeService.hashCode() * 31) + this.minimumAmountOrder.hashCode()) * 31) + this.validate.hashCode();
    }

    @C12579k
    public String toString() {
        C28892e<StoreService> eVar = this.storeService;
        C28892e<String> eVar2 = this.minimumAmountOrder;
        C28892e<C11079d2> eVar3 = this.validate;
        return "DeliverySummaryState(storeService=" + eVar + ", minimumAmountOrder=" + eVar2 + ", validate=" + eVar3 + ")";
    }

    public DeliverySummaryState(@C12579k C28892e<StoreService> eVar, @C12579k C28892e<String> eVar2, @C12579k C28892e<C11079d2> eVar3) {
        Intrinsics.checkNotNullParameter(eVar, "storeService");
        Intrinsics.checkNotNullParameter(eVar2, "minimumAmountOrder");
        Intrinsics.checkNotNullParameter(eVar3, "validate");
        this.storeService = eVar;
        this.minimumAmountOrder = eVar2;
        this.validate = eVar3;
        this.states = CollectionsKt__CollectionsKt.m40448L(eVar, eVar2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliverySummaryState(C28892e eVar, C28892e eVar2, C28892e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28892e.C28896d.f70785b : eVar, (i & 2) != 0 ? C28892e.C28896d.f70785b : eVar2, (i & 4) != 0 ? C28892e.C28896d.f70785b : eVar3);
    }
}
