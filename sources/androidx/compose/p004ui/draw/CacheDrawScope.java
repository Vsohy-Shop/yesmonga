package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
/* renamed from: androidx.compose.ui.draw.CacheDrawScope */
public final class CacheDrawScope implements C16479d {

    /* renamed from: c */
    public static final int f23428c = 0;
    @C12579k

    /* renamed from: a */
    public C8743c f23429a = C8753k.f23455a;
    @C12580l

    /* renamed from: b */
    public C8751i f23430b;

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f23429a.getDensity().mo7419R4();
    }

    /* renamed from: b */
    public final long mo17089b() {
        return this.f23429a.mo17168b();
    }

    @C12579k
    /* renamed from: c */
    public final C8743c mo17090c() {
        return this.f23429a;
    }

    @C12580l
    /* renamed from: d */
    public final C8751i mo17091d() {
        return this.f23430b;
    }

    @C12579k
    /* renamed from: f */
    public final C8751i mo17092f(@C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        return mo17094h(new CacheDrawScope$onDrawBehind$1(lVar));
    }

    public float getDensity() {
        return this.f23429a.getDensity().getDensity();
    }

    @C12579k
    public final LayoutDirection getLayoutDirection() {
        return this.f23429a.getLayoutDirection();
    }

    @C12579k
    /* renamed from: h */
    public final C8751i mo17094h(@C12579k C11300l<? super C15184c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8751i iVar = new C8751i(lVar);
        this.f23430b = iVar;
        return iVar;
    }

    /* renamed from: i */
    public final void mo17095i(@C12579k C8743c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f23429a = cVar;
    }

    /* renamed from: j */
    public final void mo17096j(@C12580l C8751i iVar) {
        this.f23430b = iVar;
    }
}
