package androidx.compose.p004ui.input.rotary;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nRotaryScrollEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* renamed from: androidx.compose.ui.input.rotary.d */
public final class C15515d {

    /* renamed from: d */
    public static final int f38604d = 0;

    /* renamed from: a */
    public final float f38605a;

    /* renamed from: b */
    public final float f38606b;

    /* renamed from: c */
    public final long f38607c;

    public C15515d(float f, float f2, long j) {
        this.f38605a = f;
        this.f38606b = f2;
        this.f38607c = j;
    }

    /* renamed from: a */
    public final float mo44238a() {
        return this.f38606b;
    }

    /* renamed from: b */
    public final long mo44239b() {
        return this.f38607c;
    }

    /* renamed from: c */
    public final float mo44240c() {
        return this.f38605a;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C15515d)) {
            return false;
        }
        C15515d dVar = (C15515d) obj;
        if (dVar.f38605a == this.f38605a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (dVar.f38606b == this.f38606b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || dVar.f38607c != this.f38607c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f38605a) * 31) + Float.hashCode(this.f38606b)) * 31) + Long.hashCode(this.f38607c);
    }

    @C12579k
    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f38605a + ",horizontalScrollPixels=" + this.f38606b + ",uptimeMillis=" + this.f38607c + ')';
    }
}
