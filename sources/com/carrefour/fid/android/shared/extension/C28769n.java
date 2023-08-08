package com.carrefour.fid.android.shared.extension;

import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.extension.n */
public final class C28769n {

    /* renamed from: c */
    public static final int f70428c = 8;
    @C12579k

    /* renamed from: a */
    public final View f70429a;

    /* renamed from: b */
    public final float f70430b;

    public C28769n(@C12579k View view, float f) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f70429a = view;
        this.f70430b = f;
    }

    /* renamed from: d */
    public static /* synthetic */ C28769n m119083d(C28769n nVar, View view, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            view = nVar.f70429a;
        }
        if ((i & 2) != 0) {
            f = nVar.f70430b;
        }
        return nVar.mo83771c(view, f);
    }

    @C12579k
    /* renamed from: a */
    public final View mo83769a() {
        return this.f70429a;
    }

    /* renamed from: b */
    public final float mo83770b() {
        return this.f70430b;
    }

    @C12579k
    /* renamed from: c */
    public final C28769n mo83771c(@C12579k View view, float f) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        return new C28769n(view, f);
    }

    /* renamed from: e */
    public final float mo83772e() {
        return this.f70430b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28769n)) {
            return false;
        }
        C28769n nVar = (C28769n) obj;
        return Intrinsics.areEqual((Object) this.f70429a, (Object) nVar.f70429a) && Float.compare(this.f70430b, nVar.f70430b) == 0;
    }

    @C12579k
    /* renamed from: f */
    public final View mo83774f() {
        return this.f70429a;
    }

    public int hashCode() {
        return (this.f70429a.hashCode() * 31) + Float.hashCode(this.f70430b);
    }

    @C12579k
    public String toString() {
        View view = this.f70429a;
        float f = this.f70430b;
        return "BottomSheetActionEvent(view=" + view + ", slideOffset=" + f + ")";
    }
}
