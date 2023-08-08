package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.offer.Offer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCriteoProducts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CriteoProducts.kt\ncom/carrefour/fid/android/domain/models/criteo/CriteoProducts\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1549#2:16\n1620#2,3:17\n*S KotlinDebug\n*F\n+ 1 CriteoProducts.kt\ncom/carrefour/fid/android/domain/models/criteo/CriteoProducts\n*L\n12#1:16\n12#1:17,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.criteo.o */
public class C38013o {
    @C12579k

    /* renamed from: a */
    public final List<C38012n> f95778a;
    @C12579k

    /* renamed from: b */
    public final List<Offer> f95779b;
    @C12580l

    /* renamed from: c */
    public final String f95780c;
    @C12580l

    /* renamed from: d */
    public final String f95781d;

    public C38013o(@C12579k List<C38012n> list, @C12579k List<Offer> list2, @C12580l String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "offers");
        this.f95778a = list;
        this.f95779b = list2;
        this.f95780c = str;
        this.f95781d = str2;
    }

    @C12579k
    /* renamed from: a */
    public List<C38012n> mo117385a() {
        return this.f95778a;
    }

    @C12579k
    /* renamed from: b */
    public List<Offer> mo117386b() {
        return this.f95779b;
    }

    @C12580l
    /* renamed from: c */
    public String mo117387c() {
        return this.f95780c;
    }

    @C12580l
    /* renamed from: d */
    public String mo117388d() {
        return this.f95781d;
    }

    /* renamed from: e */
    public final int mo117562e() {
        Iterable<Offer> b = mo117386b();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(b, 10));
        for (Offer J : b) {
            arrayList.add(J.mo118001J());
        }
        return arrayList.hashCode();
    }
}
