package dev.chrisbanes.snapper;

import androidx.compose.animation.C2046v;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: dev.chrisbanes.snapper.e */
public final class C10367e {
    @C8540g
    @C10359a
    @C12579k
    /* renamed from: a */
    public static final SnapperFlingBehavior m38624a(@C12579k C10368f fVar, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "layoutInfo");
        oVar.mo14918M(-632873455);
        if ((i2 & 2) != 0) {
            vVar = C2046v.m8765b(oVar, 0);
        }
        C2013v<Float> vVar2 = vVar;
        if ((i2 & 4) != 0) {
            gVar = SnapperFlingBehaviorDefaults.f28007a.mo21789d();
        }
        SnapperFlingBehavior c = m38626c(fVar, vVar2, gVar, SnapperFlingBehaviorDefaults.f28007a.mo21788c(), oVar, (i & 14) | 576, 0);
        oVar.mo15002m0();
        return c;
    }

    @C11395k(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    @C8540g
    @C10359a
    @C12579k
    /* renamed from: b */
    public static final SnapperFlingBehavior m38625b(@C12579k C10368f fVar, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super C10368f, Float> lVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "layoutInfo");
        oVar.mo14918M(-632871981);
        int i3 = 0;
        if ((i2 & 2) != 0) {
            vVar = C2046v.m8765b(oVar, 0);
        }
        if ((i2 & 4) != 0) {
            gVar = SnapperFlingBehaviorDefaults.f28007a.mo21789d();
        }
        C11300l<C10368f, Float> lVar2 = lVar;
        if ((i2 & 8) != 0) {
            lVar2 = SnapperFlingBehaviorDefaults.f28007a.mo21787a();
        }
        Object[] objArr = {fVar, vVar, gVar, lVar2};
        oVar.mo14918M(-3685570);
        boolean z = false;
        while (i3 < 4) {
            Object obj = objArr[i3];
            i3++;
            z |= oVar.mo15006n0(obj);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            N = new SnapperFlingBehavior(fVar, vVar, gVar, lVar2);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        SnapperFlingBehavior snapperFlingBehavior = (SnapperFlingBehavior) N;
        oVar.mo15002m0();
        return snapperFlingBehavior;
    }

    @C8540g
    @C10359a
    @C12579k
    /* renamed from: c */
    public static final SnapperFlingBehavior m38626c(@C12579k C10368f fVar, @C12580l C2013v<Float> vVar, @C12580l C1968g<Float> gVar, @C12579k C11305q<? super C10368f, ? super Integer, ? super Integer, Integer> qVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(fVar, "layoutInfo");
        Intrinsics.checkNotNullParameter(qVar, "snapIndex");
        oVar.mo14918M(-632874525);
        int i3 = 0;
        if ((i2 & 2) != 0) {
            vVar = C2046v.m8765b(oVar, 0);
        }
        if ((i2 & 4) != 0) {
            gVar = SnapperFlingBehaviorDefaults.f28007a.mo21789d();
        }
        Object[] objArr = {fVar, vVar, gVar, qVar};
        oVar.mo14918M(-3685570);
        boolean z = false;
        while (i3 < 4) {
            Object obj = objArr[i3];
            i3++;
            z |= oVar.mo15006n0(obj);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            N = new SnapperFlingBehavior(fVar, vVar, gVar, qVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        SnapperFlingBehavior snapperFlingBehavior = (SnapperFlingBehavior) N;
        oVar.mo15002m0();
        return snapperFlingBehavior;
    }
}
