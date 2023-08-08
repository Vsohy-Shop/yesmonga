package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8578k2;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n76#2:371\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1\n*L\n85#1:370\n88#1:371\n*E\n"})
/* renamed from: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 */
public final class C2752x4ee6fee2 implements C2203n {

    /* renamed from: a */
    public final /* synthetic */ C2203n f7211a;
    @C12579k

    /* renamed from: b */
    public final C8578k2 f7212b;
    @C12579k

    /* renamed from: c */
    public final C8578k2 f7213c;

    public C2752x4ee6fee2(C2203n nVar, TextFieldScrollerPosition textFieldScrollerPosition) {
        this.f7211a = nVar;
        this.f7212b = C8415c2.m30235d(new C2754xe39168d8(textFieldScrollerPosition));
        this.f7213c = C8415c2.m30235d(new C2753x355dcd8c(textFieldScrollerPosition));
    }

    /* renamed from: a */
    public boolean mo7249a() {
        return ((Boolean) this.f7212b.getValue()).booleanValue();
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f7211a.mo7250b(f);
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f7211a.mo7251e();
    }

    /* renamed from: f */
    public boolean mo7252f() {
        return ((Boolean) this.f7213c.getValue()).booleanValue();
    }

    @C12580l
    /* renamed from: g */
    public Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        return this.f7211a.mo7253g(mutatePriority, pVar, cVar);
    }
}
