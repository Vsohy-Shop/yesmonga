package com.carrefour.fid.android.shared.paging;

import com.carrefour.fid.android.core.paging.C36328a;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPaging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paging.kt\ncom/carrefour/fid/android/shared/paging/PagingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1549#2:19\n1620#2,3:20\n*S KotlinDebug\n*F\n+ 1 Paging.kt\ncom/carrefour/fid/android/shared/paging/PagingKt\n*L\n7#1:19\n7#1:20,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.paging.c */
public final class C28851c {
    @C12579k
    /* renamed from: a */
    public static final <I, O> C36328a<O> m119328a(@C12579k C36328a<I> aVar, @C12579k C11300l<? super I, ? extends O> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Iterable<Object> h = aVar.mo108395h();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(h, 10));
        for (Object invoke : h) {
            arrayList.add(lVar.invoke(invoke));
        }
        return new C36328a(arrayList, aVar.mo108397i(), aVar.mo108399k(), aVar.mo108400l(), aVar.mo108398j());
    }

    /* renamed from: b */
    public static final void m119329b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "str");
    }
}
