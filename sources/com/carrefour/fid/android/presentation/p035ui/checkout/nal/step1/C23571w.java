package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.CategoryModel;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.w */
public final class C23571w implements C23565q {

    /* renamed from: c */
    public static final int f59543c = 8;
    @C12579k

    /* renamed from: a */
    public final String f59544a;
    @C12579k

    /* renamed from: b */
    public final HashMap<String, CategoryModel> f59545b;

    public C23571w(@C12579k String str, @C12579k HashMap<String, CategoryModel> hashMap) {
        Intrinsics.checkNotNullParameter(str, "basketReferenceId");
        Intrinsics.checkNotNullParameter(hashMap, "categoryListByGtin");
        this.f59544a = str;
        this.f59545b = hashMap;
    }

    /* renamed from: d */
    public static /* synthetic */ C23571w m104829d(C23571w wVar, String str, HashMap<String, CategoryModel> hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wVar.f59544a;
        }
        if ((i & 2) != 0) {
            hashMap = wVar.f59545b;
        }
        return wVar.mo69056c(str, hashMap);
    }

    @C12579k
    /* renamed from: a */
    public final String mo69054a() {
        return this.f59544a;
    }

    @C12579k
    /* renamed from: b */
    public final HashMap<String, CategoryModel> mo69055b() {
        return this.f59545b;
    }

    @C12579k
    /* renamed from: c */
    public final C23571w mo69056c(@C12579k String str, @C12579k HashMap<String, CategoryModel> hashMap) {
        Intrinsics.checkNotNullParameter(str, "basketReferenceId");
        Intrinsics.checkNotNullParameter(hashMap, "categoryListByGtin");
        return new C23571w(str, hashMap);
    }

    @C12579k
    /* renamed from: e */
    public final String mo69057e() {
        return this.f59544a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23571w)) {
            return false;
        }
        C23571w wVar = (C23571w) obj;
        return Intrinsics.areEqual((Object) this.f59544a, (Object) wVar.f59544a) && Intrinsics.areEqual((Object) this.f59545b, (Object) wVar.f59545b);
    }

    @C12579k
    /* renamed from: f */
    public final HashMap<String, CategoryModel> mo69059f() {
        return this.f59545b;
    }

    public int hashCode() {
        return (this.f59544a.hashCode() * 31) + this.f59545b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f59544a;
        HashMap<String, CategoryModel> hashMap = this.f59545b;
        return "OnValidationBasketSuccess(basketReferenceId=" + str + ", categoryListByGtin=" + hashMap + ")";
    }
}
