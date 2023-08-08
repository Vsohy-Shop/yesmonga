package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.platform.C16379h;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.s */
public final class C16406s {

    /* renamed from: a */
    public static final int f40657a = Integer.MAX_VALUE;

    @C11395k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @C11587t0(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @C12579k
    /* renamed from: a */
    public static final C16355n m73995a(@C12579k C16401q qVar, int i, boolean z, float f) {
        Intrinsics.checkNotNullParameter(qVar, "paragraphIntrinsics");
        return C16379h.m73934b(qVar, i, z, C16478c.m74377b(0, m74005k(f), 0, 0, 13, (Object) null));
    }

    @C11395k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @C11587t0(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @C12579k
    /* renamed from: b */
    public static final C16355n m73996b(@C12579k String str, @C12579k C16361p0 p0Var, float f, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, int i, boolean z) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "text");
        C16361p0 p0Var2 = p0Var;
        Intrinsics.checkNotNullParameter(p0Var2, "style");
        C16479d dVar2 = dVar;
        Intrinsics.checkNotNullParameter(dVar2, "density");
        C16242u.C16244b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        List<C16156d.C16159b<C16151c0>> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "spanStyles");
        List<C16156d.C16159b<C16454v>> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "placeholders");
        return C16379h.m73935c(str2, p0Var2, list3, list4, i, z, C16478c.m74377b(0, m74005k(f), 0, 0, 13, (Object) null), dVar2, bVar2);
    }

    @C11395k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @C11587t0(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @C12579k
    /* renamed from: c */
    public static final C16355n m73997c(@C12579k String str, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, int i, boolean z, float f, @C12579k C16479d dVar, @C12579k C16238t.C16240b bVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(bVar, "resourceLoader");
        return C16379h.m73933a(str, p0Var, list, list2, i, z, f, dVar, bVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C16355n m73998d(C16401q qVar, int i, boolean z, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m73995a(qVar, i, z, f);
    }

    /* renamed from: e */
    public static /* synthetic */ C16355n m73999e(String str, C16361p0 p0Var, float f, C16479d dVar, C16242u.C16244b bVar, List list, List list2, int i, boolean z, int i2, Object obj) {
        List list3;
        List list4;
        int i3;
        boolean z2;
        int i4 = i2;
        if ((i4 & 32) != 0) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list3 = list;
        }
        if ((i4 & 64) != 0) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list4 = list2;
        }
        if ((i4 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i4 & 256) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m73996b(str, p0Var, f, dVar, bVar, list3, list4, i3, z2);
    }

    /* renamed from: f */
    public static /* synthetic */ C16355n m74000f(String str, C16361p0 p0Var, List list, List list2, int i, boolean z, float f, C16479d dVar, C16238t.C16240b bVar, int i2, Object obj) {
        List list3;
        List list4;
        int i3;
        boolean z2;
        if ((i2 & 4) != 0) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list3 = list;
        }
        if ((i2 & 8) != 0) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list4 = list2;
        }
        if ((i2 & 16) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m73997c(str, p0Var, list3, list4, i3, z2, f, dVar, bVar);
    }

    @C12579k
    /* renamed from: g */
    public static final C16355n m74001g(@C12579k String str, @C12579k C16361p0 p0Var, long j, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(dVar, "density");
        C16242u.C16244b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        List<C16156d.C16159b<C16151c0>> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "spanStyles");
        List<C16156d.C16159b<C16454v>> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "placeholders");
        return C16379h.m73935c(str, p0Var, list3, list4, i, z, j, dVar, bVar2);
    }

    /* renamed from: h */
    public static /* synthetic */ C16355n m74002h(String str, C16361p0 p0Var, long j, C16479d dVar, C16242u.C16244b bVar, List list, List list2, int i, boolean z, int i2, Object obj) {
        List list3;
        List list4;
        int i3;
        boolean z2;
        int i4 = i2;
        if ((i4 & 32) != 0) {
            list3 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list3 = list;
        }
        if ((i4 & 64) != 0) {
            list4 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list4 = list2;
        }
        if ((i4 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i4 & 256) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return m74001g(str, p0Var, j, dVar, bVar, list3, list4, i3, z2);
    }

    @C12579k
    /* renamed from: i */
    public static final C16355n m74003i(@C12579k C16401q qVar, long j, int i, boolean z) {
        Intrinsics.checkNotNullParameter(qVar, "paragraphIntrinsics");
        return C16379h.m73934b(qVar, i, z, j);
    }

    /* renamed from: j */
    public static /* synthetic */ C16355n m74004j(C16401q qVar, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return m74003i(qVar, j, i, z);
    }

    /* renamed from: k */
    public static final int m74005k(float f) {
        return (int) ((float) Math.ceil((double) f));
    }
}
