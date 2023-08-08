package com.skydoves.landscapist.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.request.C22561h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.skydoves.landscapist.glide.f */
public final class C35332f {
    @C12579k

    /* renamed from: a */
    public static final C35332f f86814a = new C35332f();

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C22090i<Drawable> mo105821a(@C12580l Object obj, @C12580l C8592o oVar, int i) {
        oVar.mo14918M(1252974145);
        C22090i<Drawable> iVar = (C22090i) oVar.mo15032w(LocalGlideProviderKt.m145630a());
        if (iVar == null) {
            iVar = mo105822b(oVar, (i >> 3) & 14).mo65749x().mo65603s(obj);
            Intrinsics.checkNotNullExpressionValue(iVar, "getGlideRequestManager()…        .load(imageModel)");
        }
        oVar.mo15002m0();
        return iVar;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final C22092j mo105822b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1488076380);
        C22092j jVar = (C22092j) oVar.mo15032w(LocalGlideProviderKt.m145631b());
        if (jVar == null) {
            jVar = C22038b.m100350E(((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(jVar, "with(LocalContext.current.applicationContext)");
        }
        oVar.mo15002m0();
        return jVar;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C22561h mo105823c(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1690360127);
        C22561h hVar = (C22561h) oVar.mo15032w(LocalGlideProviderKt.m145632c());
        if (hVar == null) {
            hVar = new C22561h();
        }
        oVar.mo15002m0();
        return hVar;
    }
}
