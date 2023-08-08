package com.skydoves.landscapist;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.skydoves.landscapist.a */
public final class C35314a {

    /* renamed from: c */
    public static final int f86782c = 8;

    /* renamed from: a */
    public final int f86783a;
    @C12580l

    /* renamed from: b */
    public final C35315b f86784b;

    public C35314a() {
        this(0, (C35315b) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C35314a m145594d(C35314a aVar, int i, C35315b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f86783a;
        }
        if ((i2 & 2) != 0) {
            bVar = aVar.f86784b;
        }
        return aVar.mo105767c(i, bVar);
    }

    /* renamed from: a */
    public final int mo105765a() {
        return this.f86783a;
    }

    @C12580l
    /* renamed from: b */
    public final C35315b mo105766b() {
        return this.f86784b;
    }

    @C12579k
    /* renamed from: c */
    public final C35314a mo105767c(int i, @C12580l C35315b bVar) {
        return new C35314a(i, bVar);
    }

    /* renamed from: e */
    public final int mo105768e() {
        return this.f86783a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35314a)) {
            return false;
        }
        C35314a aVar = (C35314a) obj;
        return this.f86783a == aVar.f86783a && Intrinsics.areEqual((Object) this.f86784b, (Object) aVar.f86784b);
    }

    @C12580l
    /* renamed from: f */
    public final C35315b mo105770f() {
        return this.f86784b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f86783a) * 31;
        C35315b bVar = this.f86784b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @C12579k
    public String toString() {
        return "CircularReveal(duration=" + this.f86783a + ", onFinishListener=" + this.f86784b + ')';
    }

    public C35314a(int i, @C12580l C35315b bVar) {
        this.f86783a = i;
        this.f86784b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35314a(int i, C35315b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 350 : i, (i2 & 2) != 0 ? null : bVar);
    }
}
