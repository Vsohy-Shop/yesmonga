package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.m */
public class C38011m {
    @C12579k

    /* renamed from: a */
    public final List<C38012n> f95767a;
    @C12579k

    /* renamed from: b */
    public final List<C38115c> f95768b;
    @C12580l

    /* renamed from: c */
    public final String f95769c;
    @C12580l

    /* renamed from: d */
    public final String f95770d;

    public C38011m(@C12579k List<C38012n> list, @C12579k List<C38115c> list2, @C12580l String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        this.f95767a = list;
        this.f95768b = list2;
        this.f95769c = str;
        this.f95770d = str2;
    }

    @C12579k
    /* renamed from: a */
    public List<C38012n> mo117540a() {
        return this.f95767a;
    }

    @C12580l
    /* renamed from: b */
    public String mo117541b() {
        return this.f95769c;
    }

    @C12580l
    /* renamed from: c */
    public String mo117542c() {
        return this.f95770d;
    }

    @C12579k
    /* renamed from: d */
    public List<C38115c> mo117543d() {
        return this.f95768b;
    }
}
