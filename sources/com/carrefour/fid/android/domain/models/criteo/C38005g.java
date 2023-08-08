package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCriteoItemDataProducts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoItemDataProducts.kt\ncom/carrefour/fid/android/domain/models/criteo/CriteoItemDataProducts\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1549#2:16\n1620#2,3:17\n*S KotlinDebug\n*F\n+ 1 CriteoItemDataProducts.kt\ncom/carrefour/fid/android/domain/models/criteo/CriteoItemDataProducts\n*L\n12#1:16\n12#1:17,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.criteo.g */
public class C38005g {
    @C12579k

    /* renamed from: a */
    public final List<C38012n> f95733a;
    @C12579k

    /* renamed from: b */
    public final List<C38114b> f95734b;
    @C12580l

    /* renamed from: c */
    public final String f95735c;
    @C12580l

    /* renamed from: d */
    public final String f95736d;

    public C38005g(@C12579k List<C38012n> list, @C12579k List<C38114b> list2, @C12580l String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        this.f95733a = list;
        this.f95734b = list2;
        this.f95735c = str;
        this.f95736d = str2;
    }

    @C12579k
    /* renamed from: a */
    public List<C38012n> mo117432a() {
        return this.f95733a;
    }

    @C12580l
    /* renamed from: b */
    public String mo117433b() {
        return this.f95735c;
    }

    @C12580l
    /* renamed from: c */
    public String mo117434c() {
        return this.f95736d;
    }

    @C12579k
    /* renamed from: d */
    public List<C38114b> mo117435d() {
        return this.f95734b;
    }

    /* renamed from: e */
    public final int mo117466e() {
        Iterable<C38114b> d = mo117435d();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(d, 10));
        for (C38114b j : d) {
            arrayList.add(Gtin.m157307a(j.mo118842j().mo118850A()));
        }
        return arrayList.hashCode();
    }
}
