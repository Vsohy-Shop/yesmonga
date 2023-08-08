package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.text.C16259h;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.p004ui.unit.C16475a;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(api = 26)
@C11363r0({"SMAP\nAndroidPreloadedFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,235:1\n151#2,3:236\n33#2,4:239\n154#2,2:243\n38#2:245\n156#2:246\n37#3,2:247\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n230#1:236,3\n230#1:239,4\n230#1:243,2\n230#1:245\n230#1:246\n232#1:247,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.g1 */
public final class C16199g1 {
    @C12579k

    /* renamed from: a */
    public static final C16199g1 f40263a = new C16199g1();

    @C16259h
    @C12580l
    @C0373u
    /* renamed from: a */
    public final Typeface mo46899a(@C12579k AssetManager assetManager, @C12579k String str, @C12580l Context context, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(str, "path");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        if (context == null) {
            return null;
        }
        C16180b1.m72909a();
        return C16192e1.m72959a(assetManager, str).setFontVariationSettings(mo46902d(eVar, context)).build();
    }

    @C16259h
    @C12580l
    @C0373u
    /* renamed from: b */
    public final Typeface mo46900b(@C12579k File file, @C12580l Context context, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        if (context == null) {
            return null;
        }
        C16180b1.m72909a();
        return C16177a1.m72903a(file).setFontVariationSettings(mo46902d(eVar, context)).build();
    }

    @C16259h
    @C12580l
    @C0373u
    /* renamed from: c */
    public final Typeface mo46901c(@C12579k ParcelFileDescriptor parcelFileDescriptor, @C12580l Context context, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(parcelFileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        if (context == null) {
            return null;
        }
        C16180b1.m72909a();
        return C16196f1.m72981a(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(mo46902d(eVar, context)).build();
    }

    @C16259h
    @C0376v0(26)
    /* renamed from: d */
    public final FontVariationAxis[] mo46902d(C16201h0.C16206e eVar, Context context) {
        C16479d dVar;
        if (context != null) {
            dVar = C16475a.m74346a(context);
        } else if (!eVar.mo46926a()) {
            dVar = C16482f.m74433a(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List<C16201h0.C16202a> b = eVar.mo46927b();
        ArrayList arrayList = new ArrayList(b.size());
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C16201h0.C16202a aVar = b.get(i);
            C16188d1.m72938a();
            arrayList.add(C16184c1.m72927a(aVar.mo46913c(), aVar.mo46912b(dVar)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }
}
