package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8773n;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,426:1\n76#2:427\n102#2,2:428\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n424#1:427\n424#1:428,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.a1 */
public final class C15843a1 implements C8773n {
    @C12579k

    /* renamed from: a */
    public final C8700z0 f39477a = C8539f2.m30981g(Float.valueOf(1.0f), (C8410b2) null, 2, (Object) null);

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C8773n.C8774a.m32645d(this, coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return C8773n.C8774a.m32643b(this, bVar);
    }

    /* renamed from: e */
    public void mo45638e(float f) {
        this.f39477a.setValue(Float.valueOf(f));
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return C8773n.C8774a.m32644c(this, bVar);
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return C8773n.C8774a.m32642a(this, r, pVar);
    }

    /* renamed from: w */
    public float mo7447w() {
        return ((Number) this.f39477a.getValue()).floatValue();
    }
}
