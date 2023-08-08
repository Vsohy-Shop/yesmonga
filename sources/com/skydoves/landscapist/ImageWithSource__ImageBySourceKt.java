package com.skydoves.landscapist;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final /* synthetic */ class ImageWithSource__ImageBySourceKt {
    @C8540g
    /* renamed from: a */
    public static final void m145587a(@C12579k Object obj, @C12579k C8767m mVar, @C12579k C8734c cVar, @C12580l C15541c cVar2, @C12580l String str, @C12580l C15249k2 k2Var, float f, @C12580l C8592o oVar, int i, int i2) {
        Object obj2 = obj;
        Intrinsics.checkNotNullParameter(obj2, "source");
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        C8592o o = oVar.mo15009o(-1847529278);
        C15541c a = (i2 & 8) != 0 ? C15541c.f38696a.mo44369a() : cVar2;
        String str2 = (i2 & 16) != 0 ? null : str;
        C15249k2 k2Var2 = (i2 & 32) != 0 ? null : k2Var;
        float f2 = (i2 & 64) != 0 ? 1.0f : f;
        if (obj2 instanceof C15403w2) {
            o.mo14918M(-1847528999);
            int i3 = i << 3;
            ImageKt.m8969d((C15403w2) obj2, str2, mVar, cVar, a, f2, k2Var2, 0, o, (458752 & (i >> 3)) | (57344 & i3) | ((i >> 9) & 112) | 8 | (i3 & 896) | (i3 & 7168) | (3670016 & i3), 128);
            o.mo15002m0();
        } else if (obj2 instanceof C15340c) {
            o.mo14918M(-1847528719);
            int i4 = i << 3;
            ImageKt.m8968c((C15340c) obj2, str2, mVar, cVar, a, f2, k2Var2, o, (458752 & (i >> 3)) | (57344 & i4) | ((i >> 9) & 112) | (i4 & 896) | (i4 & 7168) | (3670016 & i4), 0);
            o.mo15002m0();
        } else if (obj2 instanceof Painter) {
            o.mo14918M(-1847528438);
            int i5 = i << 3;
            ImageKt.m8967b((Painter) obj2, str2, mVar, cVar, a, f2, k2Var2, o, (458752 & (i >> 3)) | (57344 & i5) | ((i >> 9) & 112) | 8 | (i5 & 896) | (i5 & 7168) | (3670016 & i5), 0);
            o.mo15002m0();
        } else {
            o.mo14918M(-1847528167);
            o.mo15002m0();
            throw new IllegalArgumentException("Wrong source was used: " + obj2 + ", The source should be one of ImageBitmap, ImageVector, or Painter.");
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ImageWithSource__ImageBySourceKt$ImageBySource$1(obj, mVar, cVar, a, str2, k2Var2, f2, i, i2));
        }
    }
}
