package com.skydoves.landscapist.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15247k0;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.core.graphics.drawable.C17553e;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.C35316c;
import com.skydoves.landscapist.C35334h;
import com.skydoves.landscapist.C35343m;
import com.skydoves.landscapist.C35344n;
import com.skydoves.landscapist.DrawablePainterKt;
import com.skydoves.landscapist.glide.C35326d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class GlideImage__GlideImageKt$GlideImage$13 extends Lambda implements C11306r<C2362h, C35334h, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C8734c $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ C35314a $circularReveal;
    final /* synthetic */ C15249k2 $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ C15541c $contentScale;
    final /* synthetic */ C11306r<C2362h, C35326d.C35327a, C8592o, Integer, C11079d2> $failure;
    final /* synthetic */ C35344n $shimmerParams;
    final /* synthetic */ C11306r<C2362h, C35326d.C35330d, C8592o, Integer, C11079d2> $success;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlideImage__GlideImageKt$GlideImage$13(C35344n nVar, C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2> rVar, int i, C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2> rVar2, C8734c cVar, C15541c cVar2, String str, float f, C15249k2 k2Var, C35314a aVar, int i2) {
        super(4);
        this.$shimmerParams = nVar;
        this.$failure = rVar;
        this.$$dirty1 = i;
        this.$success = rVar2;
        this.$alignment = cVar;
        this.$contentScale = cVar2;
        this.$contentDescription = str;
        this.$alpha = f;
        this.$colorFilter = k2Var;
        this.$circularReveal = aVar;
        this.$$dirty = i2;
    }

    @C8540g
    /* renamed from: a */
    public final void mo105780a(@C12579k C2362h hVar, @C12579k C35334h hVar2, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        C2362h hVar3 = hVar;
        C35334h hVar4 = hVar2;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(hVar3, "$this$ImageRequest");
        Intrinsics.checkNotNullParameter(hVar4, "imageState");
        if ((i & 14) == 0) {
            if (oVar2.mo15006n0(hVar3)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (oVar2.mo15006n0(hVar4)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (((i2 & 731) ^ 146) != 0 || !oVar.mo15011p()) {
            C35326d a = C35331e.m145660a(hVar2);
            if (a instanceof C35326d.C35329c) {
                oVar2.mo14918M(-293002746);
                oVar.mo15002m0();
            } else if (a instanceof C35326d.C35328b) {
                oVar2.mo14918M(-293002705);
                C35343m.m145679a((C8767m) null, this.$shimmerParams.mo105852i(), this.$shimmerParams.mo105855l(), this.$shimmerParams.mo105856m(), this.$shimmerParams.mo105853j(), this.$shimmerParams.mo105857n(), this.$shimmerParams.mo105854k(), oVar, 0, 1);
                oVar.mo15002m0();
            } else if (a instanceof C35326d.C35327a) {
                oVar2.mo14918M(-293002336);
                C11306r<C2362h, C35326d.C35327a, C8592o, Integer, C11079d2> rVar = this.$failure;
                if (rVar != null) {
                    rVar.invoke(hVar3, a, oVar2, Integer.valueOf((i2 & 14) | 64 | ((this.$$dirty1 >> 9) & 896)));
                }
                oVar.mo15002m0();
            } else if (a instanceof C35326d.C35330d) {
                oVar2.mo14918M(-293002270);
                if (this.$success != null) {
                    oVar2.mo14918M(-293002239);
                    this.$success.invoke(hVar3, a, oVar2, Integer.valueOf((i2 & 14) | 64 | ((this.$$dirty1 >> 6) & 896)));
                    oVar.mo15002m0();
                } else {
                    oVar2.mo14918M(-293002174);
                    Drawable d = ((C35326d.C35330d) a).mo105817d();
                    if (d == null) {
                        oVar.mo15002m0();
                        oVar.mo15002m0();
                        return;
                    }
                    C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
                    C15403w2 c = C15247k0.m66139c(C17553e.m80474b(d, 0, 0, (Bitmap.Config) null, 7, (Object) null));
                    Painter c2 = DrawablePainterKt.m145576c(d, oVar2, 8);
                    C8734c cVar = this.$alignment;
                    C15541c cVar2 = this.$contentScale;
                    String str = this.$contentDescription;
                    float f = this.$alpha;
                    C15249k2 k2Var = this.$colorFilter;
                    C35314a aVar = this.$circularReveal;
                    int i5 = this.$$dirty;
                    C35316c.m145601a(c, l, c2, cVar, cVar2, str, f, k2Var, aVar, oVar, ((this.$$dirty1 << 24) & 234881024) | ((i5 >> 6) & 29360128) | ((i5 >> 6) & 7168) | 568 | ((i5 >> 6) & 57344) | ((i5 >> 6) & 458752) | ((i5 >> 6) & 3670016) | (C35314a.f86782c << 24), 0);
                    oVar.mo15002m0();
                }
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-293001626);
                oVar.mo15002m0();
            }
        } else {
            oVar.mo14958a0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo105780a((C2362h) obj, (C35334h) obj2, (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
