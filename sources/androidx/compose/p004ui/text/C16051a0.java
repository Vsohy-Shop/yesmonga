package androidx.compose.p004ui.text;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.a0 */
public final class C16051a0 {

    /* renamed from: c */
    public static final int f39925c = 0;
    @C12580l

    /* renamed from: a */
    public final C16459y f39926a;
    @C12580l

    /* renamed from: b */
    public final C16457x f39927b;

    public /* synthetic */ C16051a0(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @C12580l
    /* renamed from: a */
    public final C16457x mo46275a() {
        return this.f39927b;
    }

    @C12580l
    /* renamed from: b */
    public final C16459y mo46276b() {
        return this.f39926a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16051a0)) {
            return false;
        }
        C16051a0 a0Var = (C16051a0) obj;
        if (Intrinsics.areEqual((Object) this.f39927b, (Object) a0Var.f39927b) && Intrinsics.areEqual((Object) this.f39926a, (Object) a0Var.f39926a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        C16459y yVar = this.f39926a;
        int i2 = 0;
        if (yVar != null) {
            i = yVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C16457x xVar = this.f39927b;
        if (xVar != null) {
            i2 = xVar.hashCode();
        }
        return i3 + i2;
    }

    @C12579k
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f39926a + ", paragraphSyle=" + this.f39927b + ')';
    }

    public C16051a0(@C12580l C16459y yVar, @C12580l C16457x xVar) {
        this.f39926a = yVar;
        this.f39927b = xVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16051a0(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @C11395k(message = "includeFontPadding was added to Android in order to prevent clipping issues on tall scripts. However that issue has been fixed since Android 28. Compose backports the fix for Android versions prior to Android 28. Therefore the original reason why includeFontPadding was needed is invalid on Compose.This configuration was added for migration of the apps in case some code or design was relying includeFontPadding=true behavior; and will be removed.")
    public C16051a0(boolean z) {
        this((C16459y) null, new C16457x(z));
    }

    public C16051a0(int i) {
        this((C16459y) null, new C16457x(i, (DefaultConstructorMarker) null));
    }
}
