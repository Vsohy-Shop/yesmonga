package com.carrefour.fid.android.shared.base;

import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDataMapper.kt\ncom/carrefour/fid/android/shared/base/BaseDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,10:1\n1603#2,9:11\n1855#2:20\n1856#2:22\n1612#2:23\n1603#2,9:24\n1855#2:33\n1856#2:35\n1612#2:36\n1#3:21\n1#3:34\n*S KotlinDebug\n*F\n+ 1 BaseDataMapper.kt\ncom/carrefour/fid/android/shared/base/BaseDataMapper\n*L\n7#1:11,9\n7#1:20\n7#1:22\n7#1:23\n8#1:24,9\n8#1:33\n8#1:35\n8#1:36\n7#1:21\n8#1:34\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.base.g */
public abstract class C28486g<T, R> {

    /* renamed from: a */
    public static final int f68635a = 0;

    @C12580l
    /* renamed from: a */
    public abstract R mo72340a(T t);

    @C12580l
    /* renamed from: b */
    public final List<R> mo83406b(@C12580l List<? extends T> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object a : list) {
            Object a2 = mo72340a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: c */
    public final List<R> mo83407c(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "inEntityList");
        ArrayList arrayList = new ArrayList();
        for (Object a : list) {
            Object a2 = mo72340a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
