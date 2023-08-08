package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0375v;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.platform.InspectionModeKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22553a;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.C35320g;
import com.skydoves.landscapist.C35334h;
import com.skydoves.landscapist.C35344n;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final /* synthetic */ class GlideImage__GlideImageKt {
    @C8540g
    /* renamed from: a */
    public static final void m145610a(@C12580l Object obj, @C12580l C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>> pVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar2, @C12580l C22560g<Drawable> gVar, @C12580l C8734c cVar, @C12580l C15541c cVar2, @C12580l String str, float f, @C12580l C15249k2 k2Var, @C12580l C35314a aVar, @C12579k C35344n nVar, @C12580l BitmapPalette bitmapPalette, @C0375v int i, @C12580l C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2> rVar, @C12580l C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2> rVar2, @C12580l C8592o oVar, int i2, int i3, int i4) {
        GlideImage__GlideImageKt$GlideImage$10 glideImage__GlideImageKt$GlideImage$10;
        int i5;
        GlideImage__GlideImageKt$GlideImage$11 glideImage__GlideImageKt$GlideImage$11;
        Object obj2 = obj;
        int i6 = i4;
        Intrinsics.checkNotNullParameter(nVar, "shimmerParams");
        C8592o o = oVar.mo15009o(-1184536431);
        C8767m.C8768a aVar2 = (i6 & 2) != 0 ? C8767m.f23478j : mVar;
        if ((i6 & 4) != 0) {
            i5 = i2 & -897;
            glideImage__GlideImageKt$GlideImage$10 = new GlideImage__GlideImageKt$GlideImage$10(obj2);
        } else {
            glideImage__GlideImageKt$GlideImage$10 = pVar;
            i5 = i2;
        }
        if ((i6 & 8) != 0) {
            i5 &= -7169;
            glideImage__GlideImageKt$GlideImage$11 = GlideImage__GlideImageKt$GlideImage$11.f86791f;
        } else {
            glideImage__GlideImageKt$GlideImage$11 = pVar2;
        }
        int i7 = i5;
        C22560g<Drawable> gVar2 = (i6 & 16) != 0 ? null : gVar;
        C8734c i8 = (i6 & 32) != 0 ? C8734c.f23406a.mo17066i() : cVar;
        C15541c a = (i6 & 64) != 0 ? C15541c.f38696a.mo44369a() : cVar2;
        String str2 = (i6 & 128) != 0 ? null : str;
        float f2 = (i6 & 256) != 0 ? 1.0f : f;
        C15249k2 k2Var2 = (i6 & 512) != 0 ? null : k2Var;
        C35314a aVar3 = (i6 & 1024) != 0 ? null : aVar;
        BitmapPalette bitmapPalette2 = (i6 & 4096) != 0 ? null : bitmapPalette;
        int i9 = (i6 & 8192) != 0 ? 0 : i;
        C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2> rVar3 = (i6 & 16384) != 0 ? null : rVar;
        C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2> rVar4 = (32768 & i6) != 0 ? null : rVar2;
        o.mo14918M(-1184535532);
        if (!((Boolean) o.mo15032w(InspectionModeKt.m71067a())).booleanValue() || i9 == 0) {
            int i10 = i9;
            o.mo15002m0();
            C22090i U1 = ((C22090i) glideImage__GlideImageKt$GlideImage$10.invoke(o, Integer.valueOf((i7 >> 6) & 14))).mo65688b((C22553a) glideImage__GlideImageKt$GlideImage$11.invoke(o, Integer.valueOf((i7 >> 9) & 14))).mo65603s(obj2);
            Intrinsics.checkNotNullExpressionValue(U1, "load(imageModel)");
            C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar3 = glideImage__GlideImageKt$GlideImage$11;
            C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>> pVar4 = glideImage__GlideImageKt$GlideImage$10;
            GlideImage__GlideImageKt$GlideImage$13 glideImage__GlideImageKt$GlideImage$13 = r2;
            GlideImage__GlideImageKt$GlideImage$13 glideImage__GlideImageKt$GlideImage$132 = new GlideImage__GlideImageKt$GlideImage$13(nVar, rVar4, i3, rVar3, i8, a, str2, f2, k2Var2, aVar3, i7);
            m145614e(obj, U1, aVar2, gVar2, bitmapPalette2, C8553b.m31048b(o, -819900282, true, glideImage__GlideImageKt$GlideImage$13), o, ((i7 << 3) & 896) | 200776 | (BitmapPalette.f86837f << 12) | ((i3 << 6) & 57344), 0);
            C8678t1 s = o.mo15020s();
            if (s != null) {
                GlideImage__GlideImageKt$GlideImage$14 glideImage__GlideImageKt$GlideImage$14 = r0;
                GlideImage__GlideImageKt$GlideImage$14 glideImage__GlideImageKt$GlideImage$142 = new GlideImage__GlideImageKt$GlideImage$14(obj, aVar2, pVar4, pVar3, gVar2, i8, a, str2, f2, k2Var2, aVar3, nVar, bitmapPalette2, i10, rVar3, rVar4, i2, i3, i4);
                s.mo15202a(glideImage__GlideImageKt$GlideImage$14);
                return;
            }
            return;
        }
        int i11 = i7 >> 6;
        int i12 = ((i7 >> 18) & 112) | 8 | ((i7 << 3) & 896) | (i11 & 7168) | (i11 & 57344);
        int i13 = i7 >> 9;
        ImageKt.m8967b(C16015f.m71849d(i9, o, (i3 >> 9) & 14), str2, aVar2, i8, a, f2, k2Var2, o, i12 | (458752 & i13) | (i13 & 3670016), 0);
        o.mo15002m0();
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            GlideImage__GlideImageKt$GlideImage$12 glideImage__GlideImageKt$GlideImage$12 = r0;
            GlideImage__GlideImageKt$GlideImage$12 glideImage__GlideImageKt$GlideImage$122 = new GlideImage__GlideImageKt$GlideImage$12(obj, aVar2, glideImage__GlideImageKt$GlideImage$10, glideImage__GlideImageKt$GlideImage$11, gVar2, i8, a, str2, f2, k2Var2, aVar3, nVar, bitmapPalette2, i9, rVar3, rVar4, i2, i3, i4);
            s2.mo15202a(glideImage__GlideImageKt$GlideImage$12);
        }
    }

    @C8540g
    /* renamed from: b */
    public static final void m145611b(@C12580l Object obj, @C12580l C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>> pVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar2, @C12580l C22560g<Drawable> gVar, @C12580l C8734c cVar, @C12580l C15541c cVar2, @C12580l String str, float f, @C12580l C15249k2 k2Var, @C12580l C35314a aVar, @C12580l BitmapPalette bitmapPalette, @C0375v int i, @C12580l C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2> rVar, @C12580l C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2> rVar2, @C12580l C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2> rVar3, @C12580l C8592o oVar, int i2, int i3, int i4) {
        int i5;
        C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>> pVar3;
        int i6;
        GlideImage__GlideImageKt$GlideImage$16 glideImage__GlideImageKt$GlideImage$16;
        Object obj2 = obj;
        int i7 = i4;
        C8592o o = oVar.mo15009o(-1184531470);
        C8767m mVar2 = (i7 & 2) != 0 ? C8767m.f23478j : mVar;
        if ((i7 & 4) != 0) {
            pVar3 = new GlideImage__GlideImageKt$GlideImage$15(obj2);
            i5 = i2 & -897;
        } else {
            pVar3 = pVar;
            i5 = i2;
        }
        if ((i7 & 8) != 0) {
            i6 = i5 & -7169;
            glideImage__GlideImageKt$GlideImage$16 = GlideImage__GlideImageKt$GlideImage$16.f86792f;
        } else {
            i6 = i5;
            glideImage__GlideImageKt$GlideImage$16 = pVar2;
        }
        C22560g<Drawable> gVar2 = (i7 & 16) != 0 ? null : gVar;
        C8734c i8 = (i7 & 32) != 0 ? C8734c.f23406a.mo17066i() : cVar;
        C15541c a = (i7 & 64) != 0 ? C15541c.f38696a.mo44369a() : cVar2;
        String str2 = (i7 & 128) != 0 ? null : str;
        float f2 = (i7 & 256) != 0 ? 1.0f : f;
        C15249k2 k2Var2 = (i7 & 512) != 0 ? null : k2Var;
        C35314a aVar2 = (i7 & 1024) != 0 ? null : aVar;
        BitmapPalette bitmapPalette2 = (i7 & 2048) != 0 ? null : bitmapPalette;
        int i9 = (i7 & 4096) != 0 ? 0 : i;
        C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2> rVar4 = (i7 & 8192) != 0 ? null : rVar;
        C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2> rVar5 = (i7 & 16384) != 0 ? null : rVar2;
        C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2> rVar6 = (32768 & i7) != 0 ? null : rVar3;
        o.mo14918M(-1184530514);
        if (!((Boolean) o.mo15032w(InspectionModeKt.m71067a())).booleanValue() || i9 == 0) {
            int i10 = i9;
            C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2> rVar7 = rVar4;
            o.mo15002m0();
            C22090i U1 = ((C22090i) pVar3.invoke(o, Integer.valueOf((i6 >> 6) & 14))).mo65688b((C22553a) glideImage__GlideImageKt$GlideImage$16.invoke(o, Integer.valueOf((i6 >> 9) & 14))).mo65603s(obj);
            Intrinsics.checkNotNullExpressionValue(U1, "load(imageModel)");
            m145614e(obj, U1, mVar2, gVar2, bitmapPalette2, C8553b.m31048b(o, -819908817, true, new GlideImage__GlideImageKt$GlideImage$18(rVar7, i3, rVar6, rVar5, i8, a, str2, f2, k2Var2, aVar2, i6)), o, ((i6 << 3) & 896) | 200776 | (BitmapPalette.f86837f << 12) | ((i3 << 9) & 57344), 0);
            C8678t1 s = o.mo15020s();
            if (s != null) {
                GlideImage__GlideImageKt$GlideImage$19 glideImage__GlideImageKt$GlideImage$19 = r0;
                GlideImage__GlideImageKt$GlideImage$19 glideImage__GlideImageKt$GlideImage$192 = new GlideImage__GlideImageKt$GlideImage$19(obj, mVar2, pVar3, glideImage__GlideImageKt$GlideImage$16, gVar2, i8, a, str2, f2, k2Var2, aVar2, bitmapPalette2, i10, rVar7, rVar5, rVar6, i2, i3, i4);
                s.mo15202a(glideImage__GlideImageKt$GlideImage$19);
                return;
            }
            return;
        }
        int i11 = i9;
        int i12 = i6 >> 6;
        C11306r<? super C2362h, ? super C35326d.C35328b, ? super C8592o, ? super Integer, C11079d2> rVar8 = rVar4;
        int i13 = i6 >> 9;
        ImageKt.m8967b(C16015f.m71849d(i9, o, (i3 >> 6) & 14), str2, mVar2, i8, a, f2, k2Var2, o, (i13 & 3670016) | ((i6 >> 18) & 112) | 8 | ((i6 << 3) & 896) | (i12 & 7168) | (i12 & 57344) | (458752 & i13), 0);
        o.mo15002m0();
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            GlideImage__GlideImageKt$GlideImage$17 glideImage__GlideImageKt$GlideImage$17 = r0;
            GlideImage__GlideImageKt$GlideImage$17 glideImage__GlideImageKt$GlideImage$172 = new GlideImage__GlideImageKt$GlideImage$17(obj, mVar2, pVar3, glideImage__GlideImageKt$GlideImage$16, gVar2, i8, a, str2, f2, k2Var2, aVar2, bitmapPalette2, i11, rVar8, rVar5, rVar6, i2, i3, i4);
            s2.mo15202a(glideImage__GlideImageKt$GlideImage$17);
        }
    }

    @C8540g
    /* renamed from: c */
    public static final void m145612c(@C12580l Object obj, @C12580l C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>> pVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar2, @C12580l C22560g<Drawable> gVar, @C12580l C8734c cVar, @C12580l C15541c cVar2, @C12580l String str, float f, @C12580l C15249k2 k2Var, @C12580l C35314a aVar, @C12580l BitmapPalette bitmapPalette, @C12579k C35344n nVar, @C12580l Object obj2, @C0375v int i, @C12580l C8592o oVar, int i2, int i3, int i4) {
        GlideImage__GlideImageKt$GlideImage$6 glideImage__GlideImageKt$GlideImage$6;
        int i5;
        C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar3;
        int i6 = i4;
        Intrinsics.checkNotNullParameter(nVar, "shimmerParams");
        C8592o o = oVar.mo15009o(-1184540182);
        C8767m.C8768a aVar2 = (i6 & 2) != 0 ? C8767m.f23478j : mVar;
        if ((i6 & 4) != 0) {
            glideImage__GlideImageKt$GlideImage$6 = new GlideImage__GlideImageKt$GlideImage$6(obj);
            i5 = i2 & -897;
        } else {
            Object obj3 = obj;
            glideImage__GlideImageKt$GlideImage$6 = pVar;
            i5 = i2;
        }
        if ((i6 & 8) != 0) {
            pVar3 = GlideImage__GlideImageKt$GlideImage$7.f86795f;
            i5 &= -7169;
        } else {
            pVar3 = pVar2;
        }
        C22560g<Drawable> gVar2 = (i6 & 16) != 0 ? null : gVar;
        C8734c i7 = (i6 & 32) != 0 ? C8734c.f23406a.mo17066i() : cVar;
        C15541c a = (i6 & 64) != 0 ? C15541c.f38696a.mo44369a() : cVar2;
        String str2 = (i6 & 128) != 0 ? null : str;
        float f2 = (i6 & 256) != 0 ? 1.0f : f;
        C15249k2 k2Var2 = (i6 & 512) != 0 ? null : k2Var;
        C35314a aVar3 = (i6 & 1024) != 0 ? null : aVar;
        BitmapPalette bitmapPalette2 = (i6 & 2048) != 0 ? null : bitmapPalette;
        Object obj4 = (i6 & 8192) != 0 ? null : obj2;
        int i8 = (i6 & 16384) != 0 ? 0 : i;
        int i9 = i3 >> 3;
        C35325c.m145644a(obj, aVar2, glideImage__GlideImageKt$GlideImage$6, pVar3, gVar2, i7, a, str2, f2, k2Var2, aVar3, nVar, bitmapPalette2, i8, (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, C8553b.m31048b(o, -819904299, true, new GlideImage__GlideImageKt$GlideImage$8(obj4, i7, a, str2, k2Var2, f2, i5)), o, (i5 & 112) | 32776 | (i5 & 896) | (i5 & 7168) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), 196608 | C35314a.f86782c | (i3 & 14) | (C35344n.f86825g << 3) | (i9 & 112) | (BitmapPalette.f86837f << 6) | ((i3 << 3) & 896) | (i9 & 7168), 16384);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            float f3 = f2;
            GlideImage__GlideImageKt$GlideImage$9 glideImage__GlideImageKt$GlideImage$9 = r0;
            GlideImage__GlideImageKt$GlideImage$9 glideImage__GlideImageKt$GlideImage$92 = new GlideImage__GlideImageKt$GlideImage$9(obj, aVar2, glideImage__GlideImageKt$GlideImage$6, pVar3, gVar2, i7, a, str2, f3, k2Var2, aVar3, bitmapPalette2, nVar, obj4, i8, i2, i3, i4);
            s.mo15202a(glideImage__GlideImageKt$GlideImage$9);
        }
    }

    @C8540g
    /* renamed from: d */
    public static final void m145613d(@C12580l Object obj, @C12580l C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>> pVar, @C12580l C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar2, @C12580l C22560g<Drawable> gVar, @C12580l C8734c cVar, @C12580l C15541c cVar2, @C12580l String str, float f, @C12580l C15249k2 k2Var, @C12580l C35314a aVar, @C12580l BitmapPalette bitmapPalette, @C12580l Object obj2, @C12580l Object obj3, @C0375v int i, @C12580l C8592o oVar, int i2, int i3, int i4) {
        GlideImage__GlideImageKt$GlideImage$1 glideImage__GlideImageKt$GlideImage$1;
        int i5;
        C11304p<? super C8592o, ? super Integer, ? extends C22561h> pVar3;
        int i6 = i4;
        C8592o o = oVar.mo15009o(-1184544306);
        C8767m.C8768a aVar2 = (i6 & 2) != 0 ? C8767m.f23478j : mVar;
        if ((i6 & 4) != 0) {
            glideImage__GlideImageKt$GlideImage$1 = new GlideImage__GlideImageKt$GlideImage$1(obj);
            i5 = i2 & -897;
        } else {
            Object obj4 = obj;
            glideImage__GlideImageKt$GlideImage$1 = pVar;
            i5 = i2;
        }
        if ((i6 & 8) != 0) {
            pVar3 = GlideImage__GlideImageKt$GlideImage$2.f86793f;
            i5 &= -7169;
        } else {
            pVar3 = pVar2;
        }
        C22560g<Drawable> gVar2 = (i6 & 16) != 0 ? null : gVar;
        C8734c i7 = (i6 & 32) != 0 ? C8734c.f23406a.mo17066i() : cVar;
        C15541c a = (i6 & 64) != 0 ? C15541c.f38696a.mo44369a() : cVar2;
        String str2 = (i6 & 128) != 0 ? null : str;
        float f2 = (i6 & 256) != 0 ? 1.0f : f;
        C15249k2 k2Var2 = (i6 & 512) != 0 ? null : k2Var;
        C35314a aVar3 = (i6 & 1024) != 0 ? null : aVar;
        BitmapPalette bitmapPalette2 = (i6 & 2048) != 0 ? null : bitmapPalette;
        Object obj5 = (i6 & 4096) != 0 ? null : obj2;
        Object obj6 = (i6 & 8192) != 0 ? null : obj3;
        int i8 = (i6 & 16384) != 0 ? 0 : i;
        C8734c cVar3 = i7;
        C15541c cVar4 = a;
        String str3 = str2;
        C15249k2 k2Var3 = k2Var2;
        float f3 = f2;
        int i9 = i5;
        C35325c.m145645b(obj, aVar2, glideImage__GlideImageKt$GlideImage$1, pVar3, gVar2, i7, a, str2, f2, k2Var2, aVar3, bitmapPalette2, i8, C8553b.m31048b(o, -819892074, true, new GlideImage__GlideImageKt$GlideImage$3(obj5, cVar3, cVar4, str3, k2Var3, f3, i9)), (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, C8553b.m31048b(o, -819891713, true, new GlideImage__GlideImageKt$GlideImage$4(obj6, cVar3, cVar4, str3, k2Var3, f3, i9)), o, (i5 & 112) | 32776 | (i5 & 896) | (i5 & 7168) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), 199680 | C35314a.f86782c | (i3 & 14) | (BitmapPalette.f86837f << 3) | (i3 & 112) | ((i3 >> 6) & 896), 16384);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GlideImage__GlideImageKt$GlideImage$5(obj, aVar2, glideImage__GlideImageKt$GlideImage$1, pVar3, gVar2, i7, a, str2, f2, k2Var2, aVar3, bitmapPalette2, obj5, obj6, i8, i2, i3, i4));
        }
    }

    @C8540g
    /* renamed from: e */
    public static final void m145614e(Object obj, C22090i<Drawable> iVar, C8767m mVar, C22560g<Drawable> gVar, BitmapPalette bitmapPalette, C11306r<? super C2362h, ? super C35334h, ? super C8592o, ? super Integer, C11079d2> rVar, C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        C22560g<Drawable> gVar2;
        BitmapPalette bitmapPalette2;
        int i3 = i;
        C8592o o = oVar.mo15009o(-1184527835);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i2 & 16) != 0) {
            bitmapPalette2 = null;
        } else {
            bitmapPalette2 = bitmapPalette;
        }
        C35320g.m145609a(obj, new GlideImage__GlideImageKt$GlideImage$20(bitmapPalette2, obj, C35332f.f86814a.mo105822b(o, 6), iVar, gVar2, (C11045c<? super GlideImage__GlideImageKt$GlideImage$20>) null), aVar, rVar, o, (i3 & 896) | 8 | ((i3 >> 6) & 7168), 0);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new GlideImage__GlideImageKt$GlideImage$21(obj, iVar, aVar, gVar2, bitmapPalette2, rVar, i, i2));
        }
    }
}
