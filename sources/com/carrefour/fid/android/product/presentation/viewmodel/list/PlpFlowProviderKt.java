package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.C38112f;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.Filter;
import com.carrefour.fid.android.domain.models.product.Sort;
import com.carrefour.fid.android.domain.models.product.Term;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11363r0({"SMAP\nPlpFlowProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpFlowProvider.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/PlpFlowProviderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n766#2:95\n857#2,2:96\n1549#2:98\n1620#2,3:99\n766#2:102\n857#2,2:103\n1549#2:105\n1620#2,3:106\n766#2:109\n857#2,2:110\n1549#2:112\n1620#2,3:113\n*S KotlinDebug\n*F\n+ 1 PlpFlowProvider.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/list/PlpFlowProviderKt\n*L\n79#1:95\n79#1:96,2\n79#1:98\n79#1:99,3\n81#1:102\n81#1:103,2\n82#1:105\n82#1:106,3\n91#1:109\n91#1:110,2\n91#1:112\n91#1:113,3\n*E\n"})
public final class PlpFlowProviderKt {
    /* renamed from: b */
    public static final C38104c m117911b(Facet facet) {
        ArrayList<Sort> arrayList = new ArrayList<>();
        for (Object next : facet.mo118345i()) {
            if (((Sort) next).isSelected()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (Sort f : arrayList) {
            arrayList2.add(C38111e.m157649a(f.mo118611f()));
        }
        ArrayList<Filter> arrayList3 = new ArrayList<>();
        for (Object next2 : facet.mo118343h()) {
            if (((Filter) next2).isSelected()) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(arrayList3, 10));
        for (Filter c : arrayList3) {
            arrayList4.add(m117912c(c));
        }
        return new C38104c(arrayList4, arrayList2);
    }

    /* renamed from: c */
    public static final C38105d m117912c(Filter filter) {
        if (filter instanceof Filter.CheckboxFilter) {
            String Q3 = filter.mo118356Q3();
            ArrayList<Term> arrayList = new ArrayList<>();
            for (Object next : ((Filter.CheckboxFilter) filter).mo118368i()) {
                if (((Term) next).isSelected()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
            for (Term e : arrayList) {
                arrayList2.add(C38112f.m157657a(e.mo118626e()));
            }
            return new C38105d(Q3, arrayList2, (DefaultConstructorMarker) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.jvm.functions.p<? super com.carrefour.fid.android.domain.models.service.models.k, ? super kotlin.coroutines.c<? super T>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m117913d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.service.C37823k r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super com.carrefour.fid.android.domain.models.service.models.C38162k, ? super kotlin.coroutines.C11045c<? super T>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt$withServiceSelection$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt$withServiceSelection$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt$withServiceSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt$withServiceSelection$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt$withServiceSelection$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0065
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            java.lang.Object r5 = r0.L$0
            r6 = r5
            kotlin.jvm.functions.p r6 = (kotlin.jvm.functions.C11304p) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0051
        L_0x0043:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0051:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r5)
            if (r7 != 0) goto L_0x0066
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r6.invoke(r5, r0)
            if (r7 != r1) goto L_0x0065
            return r1
        L_0x0065:
            return r7
        L_0x0066:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt.m117913d(com.carrefour.fid.android.domain.interactors.service.k, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }
}
