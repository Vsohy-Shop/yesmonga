package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.foundation.layout.r */
public final class C2403r implements C2354e1 {

    /* renamed from: b */
    public final int f6332b;

    /* renamed from: c */
    public final int f6333c;

    /* renamed from: d */
    public final int f6334d;

    /* renamed from: e */
    public final int f6335e;

    public C2403r(int i, int i2, int i3, int i4) {
        this.f6332b = i;
        this.f6333c = i2;
        this.f6334d = i3;
        this.f6335e = i4;
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return this.f6333c;
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f6334d;
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return this.f6335e;
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f6332b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2403r)) {
            return false;
        }
        C2403r rVar = (C2403r) obj;
        if (this.f6332b == rVar.f6332b && this.f6333c == rVar.f6333c && this.f6334d == rVar.f6334d && this.f6335e == rVar.f6335e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f6332b * 31) + this.f6333c) * 31) + this.f6334d) * 31) + this.f6335e;
    }

    @C12579k
    public String toString() {
        return "Insets(left=" + this.f6332b + ", top=" + this.f6333c + ", right=" + this.f6334d + ", bottom=" + this.f6335e + ')';
    }
}
