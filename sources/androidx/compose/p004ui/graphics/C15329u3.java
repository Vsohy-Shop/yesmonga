package androidx.compose.p004ui.graphics;

import android.graphics.RenderEffect;
import android.os.Build;
import androidx.annotation.C0376v0;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.u3 */
public abstract class C15329u3 {
    @C12580l

    /* renamed from: a */
    public RenderEffect f37734a;

    public /* synthetic */ C15329u3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C0376v0(31)
    @C12579k
    /* renamed from: a */
    public final RenderEffect mo43043a() {
        RenderEffect renderEffect = this.f37734a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect b = mo42491b();
        this.f37734a = b;
        return b;
    }

    @C0376v0(31)
    @C12579k
    /* renamed from: b */
    public abstract RenderEffect mo42491b();

    /* renamed from: c */
    public boolean mo43044c() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public C15329u3() {
    }
}
