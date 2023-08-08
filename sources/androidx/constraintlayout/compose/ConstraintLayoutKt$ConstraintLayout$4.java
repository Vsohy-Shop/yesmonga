package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1983k;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4", mo22502f = "ConstraintLayout.kt", mo22503i = {}, mo22504l = {231, 240}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class ConstraintLayoutKt$ConstraintLayout$4 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ C11744g<C16602j> $channel;
    final /* synthetic */ C8700z0<Integer> $direction;
    final /* synthetic */ C8700z0<C16602j> $endConstraint$delegate;
    final /* synthetic */ C11289a<C11079d2> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, C1983k> $progress;
    final /* synthetic */ C8700z0<C16602j> $startConstraint$delegate;
    Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$4(C11744g<C16602j> gVar, C8700z0<Integer> z0Var, Animatable<Float, C1983k> animatable, C1968g<Float> gVar2, C11289a<C11079d2> aVar, C8700z0<C16602j> z0Var2, C8700z0<C16602j> z0Var3, C11045c<? super ConstraintLayoutKt$ConstraintLayout$4> cVar) {
        super(2, cVar);
        this.$channel = gVar;
        this.$direction = z0Var;
        this.$progress = animatable;
        this.$animationSpec = gVar2;
        this.$finishedAnimationListener = aVar;
        this.$startConstraint$delegate = z0Var2;
        this.$endConstraint$delegate = z0Var3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ConstraintLayoutKt$ConstraintLayout$4(this.$channel, this.$direction, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$startConstraint$delegate, this.$endConstraint$delegate, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r13.L$0
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            kotlin.C11661u0.m45747n(r14)
            r14 = r1
            r1 = r13
            goto L_0x00c2
        L_0x0019:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0021:
            java.lang.Object r1 = r13.L$0
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            kotlin.C11661u0.m45747n(r14)
            r12 = r13
            goto L_0x0042
        L_0x002a:
            kotlin.C11661u0.m45747n(r14)
            kotlinx.coroutines.channels.g<androidx.constraintlayout.compose.j> r14 = r13.$channel
            kotlinx.coroutines.channels.ChannelIterator r14 = r14.iterator()
            r1 = r13
        L_0x0034:
            r1.L$0 = r14
            r1.label = r3
            java.lang.Object r4 = r14.mo23863c(r1)
            if (r4 != r0) goto L_0x003f
            return r0
        L_0x003f:
            r12 = r1
            r1 = r14
            r14 = r4
        L_0x0042:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00e9
            java.lang.Object r14 = r1.next()
            androidx.constraintlayout.compose.j r14 = (androidx.constraintlayout.compose.C16602j) r14
            kotlinx.coroutines.channels.g<androidx.constraintlayout.compose.j> r4 = r12.$channel
            java.lang.Object r4 = r4.mo23811W()
            java.lang.Object r4 = kotlinx.coroutines.channels.C11749j.m46637h(r4)
            androidx.constraintlayout.compose.j r4 = (androidx.constraintlayout.compose.C16602j) r4
            if (r4 != 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r14 = r4
        L_0x0060:
            androidx.compose.runtime.z0<java.lang.Integer> r4 = r12.$direction
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0075
            androidx.compose.runtime.z0<androidx.constraintlayout.compose.j> r4 = r12.$startConstraint$delegate
            androidx.constraintlayout.compose.j r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75205d(r4)
            goto L_0x007b
        L_0x0075:
            androidx.compose.runtime.z0<androidx.constraintlayout.compose.j> r4 = r12.$endConstraint$delegate
            androidx.constraintlayout.compose.j r4 = androidx.constraintlayout.compose.ConstraintLayoutKt.m75207f(r4)
        L_0x007b:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x00e5
            androidx.compose.runtime.z0<java.lang.Integer> r4 = r12.$direction
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0095
            androidx.compose.runtime.z0<androidx.constraintlayout.compose.j> r4 = r12.$endConstraint$delegate
            androidx.constraintlayout.compose.ConstraintLayoutKt.m75204c(r4, r14)
            goto L_0x009a
        L_0x0095:
            androidx.compose.runtime.z0<androidx.constraintlayout.compose.j> r4 = r12.$startConstraint$delegate
            androidx.constraintlayout.compose.ConstraintLayoutKt.m75206e(r4, r14)
        L_0x009a:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.k> r4 = r12.$progress
            androidx.compose.runtime.z0<java.lang.Integer> r14 = r12.$direction
            java.lang.Object r14 = r14.getValue()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            float r14 = (float) r14
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r14)
            androidx.compose.animation.core.g<java.lang.Float> r6 = r12.$animationSpec
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r12.L$0 = r1
            r12.label = r2
            r9 = r12
            java.lang.Object r14 = androidx.compose.animation.core.Animatable.m7942i(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r14 != r0) goto L_0x00c0
            return r0
        L_0x00c0:
            r14 = r1
            r1 = r12
        L_0x00c2:
            androidx.compose.runtime.z0<java.lang.Integer> r4 = r1.$direction
            java.lang.Object r5 = r4.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x00d2
            r5 = 0
            goto L_0x00d3
        L_0x00d2:
            r5 = r3
        L_0x00d3:
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r5)
            r4.setValue(r5)
            kotlin.jvm.functions.a<kotlin.d2> r4 = r1.$finishedAnimationListener
            if (r4 != 0) goto L_0x00e0
            goto L_0x0034
        L_0x00e0:
            r4.invoke()
            goto L_0x0034
        L_0x00e5:
            r14 = r1
            r1 = r12
            goto L_0x0034
        L_0x00e9:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ConstraintLayoutKt$ConstraintLayout$4) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
