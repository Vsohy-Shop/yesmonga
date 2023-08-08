package com.carrefour.fid.android.shared.base;

import androidx.annotation.C0346i;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.shared.util.C28947q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.base.p */
public abstract class C28498p extends C19476v0 implements C28502s {

    /* renamed from: c */
    public static final int f68649c = 8;
    @C12579k

    /* renamed from: a */
    public final C28947q<Throwable> f68650a = new C28947q<>();
    @C12579k

    /* renamed from: b */
    public final C28947q<Boolean> f68651b = new C28947q<>();

    @C12579k
    /* renamed from: c0 */
    public final LiveData<Throwable> mo83418c0() {
        return this.f68650a;
    }

    @C0346i
    public void clear() {
        this.f68650a.mo57496r(null);
        this.f68651b.mo57496r(null);
    }

    @C12579k
    /* renamed from: d0 */
    public final LiveData<Boolean> mo83419d0() {
        return this.f68651b;
    }

    @C12579k
    /* renamed from: e0 */
    public final C28947q<Throwable> mo83420e0() {
        return this.f68650a;
    }

    @C12579k
    /* renamed from: f0 */
    public final C28947q<Boolean> mo83421f0() {
        return this.f68651b;
    }

    @C0346i
    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f68650a.mo57495q(wVar);
        mo83418c0().mo57495q(wVar);
        this.f68651b.mo57495q(wVar);
        mo83419d0().mo57495q(wVar);
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            clear();
        }
    }
}
