package com.carrefour.fid.android.shared.extension;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\ncom/carrefour/fid/android/shared/extension/ListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.extension.c0 */
public final class C28748c0 {
    @C12579k
    /* renamed from: a */
    public static final <T> List<T> m119037a(@C12579k List<? extends T> list, T t, T t2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int indexOf = list.indexOf(t);
        if (indexOf < 0) {
            return list;
        }
        return m119038b(list, indexOf, t2);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> List<T> m119038b(@C12579k List<? extends T> list, int i, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> T5 = CollectionsKt___CollectionsKt.m40572T5(list);
        T5.set(i, t);
        return T5;
    }
}
