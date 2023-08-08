package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.layout.s */
public final class C2406s {

    /* renamed from: a */
    public final int f6342a;

    /* renamed from: b */
    public final int f6343b;
    @C12579k

    /* renamed from: c */
    public final C8423g<C2404r0> f6344c;

    public C2406s(int i, int i2, @C12579k C8423g<C2404r0> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "items");
        this.f6342a = i;
        this.f6343b = i2;
        this.f6344c = gVar;
    }

    /* renamed from: a */
    public final int mo8161a() {
        return this.f6343b;
    }

    @C12579k
    /* renamed from: b */
    public final C8423g<C2404r0> mo8162b() {
        return this.f6344c;
    }

    /* renamed from: c */
    public final int mo8163c() {
        return this.f6342a;
    }
}
